package com.app.examenfinal.ui.home;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.examenfinal.R;
import com.app.examenfinal.modelo.Farmacia;

import java.util.List;

public class FarmaciaAdapter extends RecyclerView.Adapter<FarmaciaAdapter.FarmaciaViewHolder> {

    private List<Farmacia> listaFarmacia;
    private Context contexto;
    private LayoutInflater li;

    public FarmaciaAdapter(List<Farmacia> listaFarmacia, Context contexto, LayoutInflater li) {
        this.listaFarmacia = listaFarmacia;
        this.contexto = contexto;
        this.li = li;
    }

    @NonNull
    @Override
    public FarmaciaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = li.inflate(R.layout.item_farmacia, parent, false);
        return new FarmaciaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FarmaciaViewHolder holder, int position) {
        Farmacia farmacia = listaFarmacia.get(position);
        holder.nombre.setText(farmacia.getNombre());
        holder.direccion.setText(farmacia.getDireccion());

        holder.botonMasInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Punto de depuración para verificar los datos antes de iniciar la segunda actividad
                Log.d("Depuración", "Se hizo clic en el botón Mas Info. Datos de la farmacia: " + farmacia.toString());

                Intent intent = new Intent(contexto, SegundaActivity.class);
                intent.putExtra("farmacia", farmacia);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                contexto.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return listaFarmacia.size();
    }

    public class FarmaciaViewHolder extends RecyclerView.ViewHolder {
        TextView nombre, direccion;

        Button botonMasInfo;

        public FarmaciaViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.textNombre);
            direccion = itemView.findViewById(R.id.textDireccion);

            botonMasInfo = itemView.findViewById(R.id.btnDetalles);
        }
    }
}



