package com.app.examenfinal.ui.home;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.app.examenfinal.modelo.Farmacia;

public class SegundaActivityViewModel extends AndroidViewModel {
    private MutableLiveData<Farmacia> mutable;
    public SegundaActivityViewModel(@NonNull Application application) {
        super(application);

    }

    public LiveData<Farmacia> getmutable(){
        if(mutable == null){
            mutable = new MutableLiveData<>();
        }
        return mutable;
    }

    public void recuperarFarmacia(Intent intent){
        Farmacia farmacia = intent.getParcelableExtra("farmacia");
        if(farmacia != null){
            mutable.setValue(farmacia);
        }
    }


}
