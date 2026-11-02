public class WrapperDemo1 {
  public static void main(String[] args) {
	
    Integer i=Integer.valueOf("10");
	Double d=Double.valueOf("10.5");
	Boolean b=Boolean.valueOf("ashok");
	Boolean b1 = Boolean.valueOf(true);
	System.out.println(i);//10
	System.out.println(d);//10.5
	System.out.println(b);//false
	Character ch=Character.valueOf('a');
	System.out.println(ch);
	System.out.println(b1);
}
}