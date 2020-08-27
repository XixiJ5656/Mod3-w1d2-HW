package oopPackage;

public class Parrot {
	 public static boolean getUp(boolean sqwaking, int currentHour) {
	    	
	    	if(currentHour<0||currentHour>23) {
	    		return false;
	    	}
	    	else{
	    		if(currentHour<6 || currentHour>22) {
	    		if(sqwaking) {
	    			return true;
	    			}else return false;
	    		}else return false;
	    	}
	     }
	 public static void main(String[] args) {
		 System.out.println(getUp(true,4));
	 }

}
