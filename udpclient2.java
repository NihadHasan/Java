
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class udpclient2 {
    public static void main(String[] args) throws Exception {
        try (DatagramSocket socket = new DatagramSocket()) {
            byte[]buffer="Hello".getBytes();
            InetAddress address= InetAddress.getByName("localhost");
            
            DatagramPacket pocket=new DatagramPacket(buffer, buffer.length,address,9876);
            socket.send(pocket);
            System.out.println("Messege sent:Hello");
        }
    }
    
}
