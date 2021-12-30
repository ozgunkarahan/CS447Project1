package cs447New;

import java.util.Scanner;
import java.io.IOException;
import java.net.*;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("BattleShip");
        boolean isHost = false;
        while (true) {
            System.out.print("Enter 'host' to become host or 'connect' to become client: ");
            String type = scan.nextLine(); 
            if (type.equals("host")) {
                isHost = true;
                break;
            } else if (type.equals("connect")) {
                break;
            } else {
                System.out.println("Error try again");
            }
        }

        if (isHost) {
            Server s = new Server(6666);
        } else {
            System.out.print("Enter ip:port  (e.g :10.70.1.2:25565) : ");
            String[] temp = scan.nextLine().split(":");
            String ip = temp[0];
            int port = Integer.parseInt(temp[1]);
            Client c = new Client(ip, port);
        }
        

        scan.close();
    }
}