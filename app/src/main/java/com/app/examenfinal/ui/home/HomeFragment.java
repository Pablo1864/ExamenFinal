package com.app.examenfinal.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.examenfinal.databinding.FragmentHomeBinding;
import com.app.examenfinal.modelo.Farmacia;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel mv;
    private FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        mv = new ViewModelProvider(this).get(HomeViewModel.class);
        mv.getmutable().observe(getViewLifecycleOwner(), new Observer<List<Farmacia>>() {
            @Override
            public void onChanged(List<Farmacia> farmacias) {
                FarmaciaAdapter adapter = new FarmaciaAdapter(farmacias, requireContext(), getLayoutInflater());
                LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext());
                RecyclerView rv = binding.recyclerView;
                rv.setLayoutManager(layoutManager);
                rv.setAdapter(adapter);
            }
        });

        mv.crearLista();

        return root;
    }
}


