package hafta61;

public class mathesap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(Math.sqrt(25));
	        System.out.println(Math.PI);
	        System.out.println("Math.ceil(23.3): " + Math.ceil(23.3));
	        System.out.println("Math.floor(23.7): " + Math.floor(23.7));
	        System.out.println("Math.round(23.3): " + Math.round(23.3));
	        System.out.println("Math.round(23.7): " + Math.round(23.7));
	        System.out.println("Math.min(5,3): " + Math.min(5,3));
	        System.out.println("Math.max(5,3): " + Math.max(5,3));
	        System.out.println("Math.random(): " + Math.random());
	        System.out.println("-------------------");
	        System.out.println("benim.ceil(23.3): " + benimCeil(23.3));
	        System.out.println("benim.floor(23.7): " + benimFloor(23.7));
	        System.out.println("benim.round(23.3): " + benimRound(23.3));
	        System.out.println("benim.round(23.7): " + benimRound(23.7));
	        System.out.println("benim.min(5,3): " + benimMin(5,3));
	        System.out.println("benim.max(5,3): " + benimMax(5,3));

	    }
	    private static int benimMax(int i, int j) {
	        int max;
	        if(i>j)max=i;
	        else max=j;
	        return max;
	        
	    }
	    private static int benimMin(int i, int j) {
	    	 	int min;
		        if(i<j)min=i;
		        min=j;
		        return min;
	        
	    }
	    private static double benimRound(double d) {
	    	 int tamKisim = (int) d;
	         double ondalikKisim = d - tamKisim;
	         if (ondalikKisim >= 0.5) {
	             tamKisim++;
	         }
	         return tamKisim;
	    }
	    
	    private static double benimFloor(double d) {
	    	int tamKisim = (int) d;
	    	double ondalikKisim = d - tamKisim;
	    	if (ondalikKisim > 0) { 
	    	    tamKisim--;
	    	}
	    	return tamKisim;
	       
	    }
	    private static double benimCeil(double d){
	    	int tamKisim = (int) d;
	    	double ondalikKisim = d - tamKisim;
	    	if (ondalikKisim > 0) { 
	    	    tamKisim++; 
	    	}
	    	return tamKisim;
	    }
	}


