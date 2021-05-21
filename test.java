public class test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
//		Octagon o = new Octagon(5);
//		System.out.println("Area:" + o.getArea());
//		System.out.println("Perimeter:" + o.getPerimeter());
//		
//		try{
//			Octagon cloned_o = (Octagon)o.clone();
//			
//			if(o.compareTo(cloned_o) == 1) {
//				System.out.println("Octagons are identical");
//			} else {
//				System.out.println("Octagons are not identical");
//			}
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}

		
///////////////////////////////////////////////////////////////////////////////////////////////

//		int length = 2147483647;
//		
//		try {
//			byte[] array = new byte[length];
//		}
//		catch (OutOfMemoryError ex) { 
//			System.out.println(ex.getMessage());
//		}
//		

/////////////////////////////////////////////////////////////////////////////////////////////
		
//		try{
//			Triangle t = new Triangle(3, 2, 6);
//		} catch (IllegalTriangleException e) {
//			System.out.println(e);
//		}
	
///////////////////////////////////////////////////////////////////////////////////////////
		 System.out.println(bin2Dec("110g0100"));

}	
		 public static int bin2Dec(String binary) throws NumberFormatException {

		        if (!isBinary(binary)) {
		            throw new NumberFormatException(binary + " is not a binary number.");
		        }
		        int power = 0;
		        int decimal = 0;
		        for (int i = binary.length() - 1; i >= 0; i--) {

		            if (binary.charAt(i) == '1') {
		                decimal += Math.pow(2, power);
		            }
		            power++;
		        }
		        return decimal;
		    }

		    public static boolean isBinary(String binary) {

		        for (char ch : binary.toCharArray()) {
		            if (ch != '1' && ch != '0') return false;
		        }
		        return true;
		    }
		
	}

