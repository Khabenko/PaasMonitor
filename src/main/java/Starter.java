import java.net.InetAddress;

public class Starter extends Thread {
           public static boolean it = false;

    public Starter() {
    this.start();
    }



    public static boolean isIt() {
        return it;
    }

    public static void setIt(boolean it) {
        Starter.it = it;
    }


    public static void main(String[] args) {


        try {
            String ipAddress = "64.250.115.155";
            InetAddress inet = InetAddress.getByName(ipAddress);
            System.out.println("Sending Ping Request to " + ipAddress);
            if (inet.isReachable(5000)){
                System.out.println(ipAddress + " is reachable.");
            } else {
                System.out.println(ipAddress + " NOT reachable.");
            }
        } catch ( Exception e ) {
            System.out.println("Exception:" + e.getMessage());
        }
    }


    @Override
    public void run() {
        while (true){
            try {
                String ipAddress = "64.250.115.155";
                InetAddress inet = InetAddress.getByName(ipAddress);
                System.out.println("Sending Ping Request to " + ipAddress);
                if (inet.isReachable(5000)){
                    System.out.println(ipAddress + " is reachable.");
                    it = true;
                } else {
                    System.out.println(ipAddress + " NOT reachable.");
                    it=false;
                }
            } catch ( Exception e ) {
                System.out.println("Exception:" + e.getMessage());
            }
        }
        }

}
