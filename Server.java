package cs447New;
import java.util.*;
import java.io.*;
import java.net.*;
public class Server  {
	InetAddress IP_ADRESS;
	ServerSocket ServerSocket;
	Socket socket1;
	int port;
	BattleShip myBoard;
	BattleShip enemyBoard;
	DataInputStream input;
	DataOutputStream output;
	
	public Server(int port) throws IOException {
		myBoard =new BattleShip();
		enemyBoard =new BattleShip();
		myBoard.initializeShip();
		//this.enemyName= "";
		
		try {
			this.IP_ADRESS=InetAddress.getLocalHost();
			this.ServerSocket = new ServerSocket(port);
			utilityClass.print("Hosting "+IP_ADRESS+":"+port);
			this.socket1=ServerSocket.accept();
			enemyBoard.setName(socket1.getInetAddress().getCanonicalHostName());
			output = new DataOutputStream(this.socket1.getOutputStream());
			input = new DataInputStream(this.socket1.getInputStream());
			//output.writeUTF(this.NickName);
			//utilityClass.print("Match between "+this.NickName+ "and "+ this.enemyName+ "begins.");
			
			
			
			
			
		} catch (NullPointerException i) {
			// TODO Auto-generated catch block
			i.printStackTrace();
			
		}
		try {
			while(myBoard.hitPoints>0 && enemyBoard.hitPoints>0) {
				String move=input.readUTF();
				String HitOrMiss=myBoard.HitShip(move);
				output.writeUTF(HitOrMiss);
				System.out.println("ENTER YOUR MOVE");
				Scanner scan =new Scanner(System.in);
				move=scan.nextLine();
				output.writeUTF(move);
				HitOrMiss=input.readUTF();
				enemyBoard.updateHit(HitOrMiss, move);
				myBoard.printArray();
				enemyBoard.printArray();
				
				
				
				
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}