public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        if (args.length != 3) {
            System.out.println("Calculator format \"operand1 operator operand2\"");
            System.exit(0);
        }
        
//        
 // //       handling without exception 
        
//        if (!isNum(args[0])) {
//          System.out.println("Error \""+args[0]+"\" is not number.");
//          System.exit(0);
//        }
//        
//        if (!isNum(args[2])) {
//          System.out.println("Error \""+args[2]+"\" is not number.");
//          System.exit(0);
//        }
   
        if (args[1].charAt(0) != '+' && args[1].charAt(0) != '-' && args[1].charAt(0) != '/' && args[1].charAt(0) != '*') {
	      System.out.println("Error \""+args[1]+"\" is not a valid operator.(+ - / *)");
	      System.exit(0);
		}
        
        int result = 0;

        try {
	        switch (args[1].charAt(0)) {
	        	case '+':
	        		result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
	        		break;
	        	case '-':
	        		result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
	        		break;
	        	case '*':
	        		result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
	        		break;
	        	case '/':
	        		result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
	        }
		 } catch (NumberFormatException ex) {
	         System.out.println("ERROR "+ ex.getMessage());
	         System.exit(0);
	     }



      System.out.println(args[0] + ' ' + args[1] + ' '
              + args[2] + " = " + result);
  }

  public static boolean isNum(String s) {
      for (char ch : s.toCharArray()) {
          if (ch < '0' || ch > '9') return false;
      }
      return true;
  }

}
