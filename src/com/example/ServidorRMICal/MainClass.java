package com.example.ServidorRMICal;

import otro.ICalculadora;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class MainClass {
    static Registry registro;
    static ICalculadora skeleton;

    private static void Conectar(){
        try{
            registro = LocateRegistry.createRegistry(1099);
            skeleton = new Calculadora();
            registro.rebind("//10.168.0.2:1099/Calculadora", skeleton);

            System.out.println("Servidor RMI activo...");
        }catch (Exception e){
            System.out.println("Error server" + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Conectar();
    }

}
