package org.example;

import java.util.List;

public class Auto {
    private List<String> autos;
    private String marca;
    private String modelo;
    private int anio;
    private double kilometraje;
    private String estado;
    private String placa;
    private double consumoPorKm;



    public Auto() {
    }

    public Auto(List<String> autos, String marca, String modelo, int anio, double kilometraje, String estado, String placa) {
        this.autos = autos;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.estado = estado;
        this.placa = placa;
    }

    public List<String> getAutos() {
        return autos;
    }

    public void mostrarDetalles() {
        System.out.println("MARCA: " + marca + "  MODELO: " + modelo + "  AÑO: " + anio +
                "  KILOMETRAJE: " + kilometraje + " KM  ESTADO: " + estado);
    }
    public void actualizarKilometraje(double nuevoKilometraje) {
        if (nuevoKilometraje > kilometraje) {
            kilometraje = nuevoKilometraje;
            System.out.println("KILOMETRAJE ACTUALIZADO A " + kilometraje + " KM");
        } else {
            System.out.println("EL NUEVO KILOMETRAJE DEBE SER MAYOR AL ACTUAL");
        }
    }
    public void esAntiguo() {
        int añoActual = 2025;
        if (anio <= 2000) {
            System.out.println("EL VEHICULO ES ANTIGUO");
        } else {

            System.out.println("EL VEHICULO NO ES AUNTIGUO");
        }
    }
    public Boolean necesitaMantenimiento(){
        if (kilometraje>=100000){
            return true;
        }else {
            return false;
        }
    }

    public double calcularConsumoCombustible(double distancia) {
        double consumo = distancia * consumoPorKm;
        System.out.println("El auto consumió " + consumo + " L de combustible en " + distancia + " km.");
        return consumo;
    }

    public double combustibleRestante(){

    }

    public void setAutos(List<String> autos) {
        this.autos = autos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return anio;
    }

    public void setAño(int año) {
        this.anio = año;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
