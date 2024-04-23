package com.app.examenfinal.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.app.examenfinal.databinding.SegundaActivityHomeBinding;
import com.app.examenfinal.modelo.Farmacia;

public class SegundaActivity extends AppCompatActivity {

    private SegundaActivityViewModel vm;
    private SegundaActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = SegundaActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        vm = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(SegundaActivityViewModel.class);

        vm.getmutable().observe(this, new Observer<Farmacia>() {
            @Override
            public void onChanged(Farmacia farmacia) {
                // Punto de depuración para verificar la recepción de datos del intent
                Log.d("Depuración", "Segunda actividad iniciada. Recibiendo datos del intent: " + farmacia.toString());

                TextView nombre = binding.textNombre;
                TextView direccion = binding.textDireccion;
                ImageView foto = binding.ivImagen;
                TextView horario = binding.textHorario;

                nombre.setText(farmacia.getNombre());
                direccion.setText(farmacia.getDireccion());
                foto.setImageResource(farmacia.getFoto());
                horario.setText(farmacia.getHorario());
            }
        });

        vm.recuperarFarmacia(getIntent());

        Button volver = binding.btnVolver;
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}




