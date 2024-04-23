package com.app.examenfinal.modelo;

import android.os.Parcel;
import android.os.Parcelable;

public class Farmacia implements Parcelable {
    private String nombre;
    private String direccion;
    private int foto;
    private String horario;

    public Farmacia(String nombre, String direccion, int foto, String horario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.foto = foto;
        this.horario = horario;
    }

    protected Farmacia(Parcel in) {
        nombre = in.readString();
        direccion = in.readString();
        foto = in.readInt();
        horario = in.readString();
    }

    public static final Creator<Farmacia> CREATOR = new Creator<Farmacia>() {
        @Override
        public Farmacia createFromParcel(Parcel in) {
            return new Farmacia(in);
        }

        @Override
        public Farmacia[] newArray(int size) {
            return new Farmacia[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getFoto() {
        return foto;
    }

    public String getHorario() {
        return horario;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(direccion);
        dest.writeInt(foto);
        dest.writeString(horario);
    }
    @Override
    public String toString() {
        return "Farmacia{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", foto=" + foto +
                ", horario='" + horario + '\'' +
                '}';
    }

}

