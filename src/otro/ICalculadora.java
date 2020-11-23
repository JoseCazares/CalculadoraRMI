package otro;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculadora extends Remote {
    int Sumar(int N1, int N2) throws IOException;
    int Restar(int N1, int N2) throws IOException;
    int Multiplicar(int N1, int N2) throws IOException;
    float Dividir(float N1, float N2) throws IOException;
}
