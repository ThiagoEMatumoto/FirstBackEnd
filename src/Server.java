import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.spec.RSAOtherPrimeInfo;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 8080;
        try {
            ServerSocket server = new ServerSocket(port);
            System.out.println("Servidor iniciado na porta: " + port);

            while(true){
                Socket clientSocket = server.accept();
                System.out.println(clientSocket);
                System.out.println("Cliente conectado: " + clientSocket);
                clientSocket.close();
            }
        } catch (IOException exceptione){
            System.err.println("Erro ao iniciar o servidor:" + exceptione.getMessage());
        }
    }
}
