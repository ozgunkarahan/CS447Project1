package cs447New;


public class utilityClass {


	public static void print(String s) {
		System.out.println(s);
	}
	public static void print(boolean b) {
		System.out.println(b);
	}
	
	
	
    public static int[] coordinateConverter(String s) {
    	
    	s=s.toUpperCase();
    	char[] temp = new char [s.length()];
    	temp [0] = s.charAt(0);
    	temp[1] = s.charAt(1);
    	int[] coordinates = new int[2];
    	int y = Character.getNumericValue(temp[1]);
    	
   
    	coordinates[1]=y;
    	if(temp[0]=='A') {
    		coordinates[0] = 0;
    	}
    	else if (temp[0] == 'B'){
    		coordinates[0] = 1;
    	}
    	else if (temp[0] == 'C'){
    		coordinates[0] = 2;
    	}
    	else if (temp[0] == 'D'){
    		coordinates[0] = 3;
    	}
    	else if (temp[0] == 'E'){
    		coordinates[0] = 4;
    	}
    	else if (temp[0] == 'F'){
    		coordinates[0] = 5;
    	}
    	else if (temp[0] == 'G'){
    		coordinates[0] = 6;
    	}
    	else if (temp[0] == 'H'){
    		coordinates[0] = 7;
    	}
    	else if (temp[0] == 'I'){
    		coordinates[0] = 8;
    	}
    	else if (temp[0] == 'J'){
    		coordinates[0] = 9;
    	}
    	else {
    		print("ERROR");
    	}
    	
    	return coordinates;
    }
    
	
	

}
