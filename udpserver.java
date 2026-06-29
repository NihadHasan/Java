
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class udpserver {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws Exception {
        DatagramSocket socket=new DatagramSocket(9876);
        byte[] buffer=new byte[1024];

        DatagramPacket pocket= new DatagramPacket(buffer,buffer.length);
        System.err.println(" UDP Server is running...Waiting for messeges. ");

        socket.receive(pocket);
        String receivedMessege= new String(pocket.getData(),0,pocket.getLength());
        System.err.println("Received:"+receivedMessege);
        socket.close();
        
    }
    
}
