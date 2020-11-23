package com.example.ServidorRMICal;

import otro.ICalculadora;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class MainClass {
    static Registry registro;
    static ICalculadora skeleton;

    private static void Conectar(){
        try{
            registro = LocateRegistry.createRegistry(1098);
            skeleton = new Calculadora();
            registro.bind("Calculadora", skeleton);
            System.out.println("Servidor RMI activo...");
        }catch (Exception e){
            System.out.println("Error server" + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Conectar();
    }

}
