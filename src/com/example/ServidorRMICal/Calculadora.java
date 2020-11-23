package com.example.ServidorRMICal;

import otro.ICalculadora;
import java.io.IOException;
import java.rmi.server.UnicastRemoteObject;

public class Calculadora extends UnicastRemoteObject implements ICalculadora {

    public Calculadora() throws java.rmi.RemoteException{
    }
    public int Sumar(int N1, int N2) throws IOException {
        Runtime.getRuntime().exec("clear");
        System.out.println("Se ha solicitado la suma de " +  N1 +" y " + N2);
        return N1 + N2;
    }

    public int Restar(int N1, int N2) throws IOException {
        Runtime.getRuntime().exec("clear");
        System.out.println("Se ha solicitado la Resta de " +  N1 +" y " + N2);
        return N1 - N2;
    }

    public int Multiplicar(int N1, int N2) throws IOException {
        Runtime.getRuntime().exec("clear");
        System.out.println("Se ha solicitado la multiplicacion de " +  N1 +" y " + N2);
        return N1 * N2;
    }

    public float Dividir(float N1, float N2) throws IOException {
        Runtime.getRuntime().exec("clear");
        System.out.println("Se ha solicitado la división de " +  N1 +" y " + N2);
        return N1 / N2;
    }
}
