package com.mycompany.tecnicasdeprogramacionuea2;

// Clase base
class VehiculoAcuatico {
    public void mover() {
        System.out.println("El vehículo acuático se está moviendo");
    }
}

// Subclase Barco
class Barco extends VehiculoAcuatico {
    @Override
    public void mover() {
        System.out.println("El barco está navegando");
    }
}

// Subclase Canoa
class Canoa extends VehiculoAcuatico {
    @Override
    public void mover() {
        System.out.println("La canoa está siendo remada");
    }
}

public class EjemploVehiculosAcuaticos {
    public static void main(String[] args) {
        VehiculoAcuatico miVehiculo;

        miVehiculo = new Barco();
        miVehiculo.mover();

        miVehiculo = new Canoa();
        miVehiculo.mover();
    }
}

