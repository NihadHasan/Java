
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class udpserver2 {
    public static void main(String[] args) throws Exception{
        try (DatagramSocket socket = new DatagramSocket(9876)) {
            byte[]buffer=new byte[1024];
            
            DatagramPacket pocket= new DatagramPacket(buffer, buffer.length);
            System.out.println("UDP server is running....Waiting for messeges");
            
            socket.receive(pocket);
            String receivedMessege=new String(pocket.getData(),0,pocket.getLength());
            System.out.println("Received:"+receivedMessege);
        }

    }
}
