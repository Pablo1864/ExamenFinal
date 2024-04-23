package com.app.examenfinal.ui.home;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.app.examenfinal.R;
import com.app.examenfinal.modelo.Farmacia;

import java.util.ArrayList;
import java.util.List;

public class HomeViewModel extends AndroidViewModel {
    private MutableLiveData<List<Farmacia>> mutable;

    public HomeViewModel(@NonNull Application application) {
        super(application);
    }
    public LiveData<List<Farmacia>> getmutable(){
        if(mutable == null){
            mutable = new MutableLiveData<>();
        }
        return mutable;
    }

public void crearLista(){
ArrayList<Farmacia>listaFarmacia=new ArrayList<>();

    listaFarmacia.add(new Farmacia("Farmacia diaz","Centenario 185", R.drawable.foto1,"De 8 a 22"));
    listaFarmacia.add(new Farmacia("Farmacia diaz","Centenario 185", R.drawable.foto1,"De 8 a 22"));
    listaFarmacia.add(new Farmacia("Farmacia diaz","Centenario 185", R.drawable.foto1,"De 8 a 22"));
    listaFarmacia.add(new Farmacia("Farmacia diaz","Centenario 185", R.drawable.foto1,"De 8 a 22"));
    listaFarmacia.add(new Farmacia("Farmacia diaz","Centenario 185", R.drawable.foto1,"De 8 a 22"));
    listaFarmacia.add(new Farmacia("Farmacia diaz","Centenario 185", R.drawable.foto1,"De 8 a 22"));
    listaFarmacia.add(new Farmacia("Farmacia diaz","Centenario 185", R.drawable.foto1,"De 8 a 22"));
    listaFarmacia.add(new Farmacia("Farmacia diaz","Centenario 185", R.drawable.foto1,"De 8 a 22"));
    listaFarmacia.add(new Farmacia("Farmacia diaz","Centenario 185", R.drawable.foto1,"De 8 a 22"));
    listaFarmacia.add(new Farmacia("Farmacia diaz","Centenario 185", R.drawable.foto1,"De 8 a 22"));
    listaFarmacia.add(new Farmacia("Farmacia diaz","Centenario 185", R.drawable.foto1,"De 8 a 22"));

    mutable.setValue(listaFarmacia);

};


}
