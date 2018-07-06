package java8prog;

public class lexp1 {

	public static void main(String[] args) {
		int1 i1=new int1() {
			public void show() {
				System.out.println("hello");
				
			}
		}; 
      i1.show();
	}

}
interface int1
{
	void show();
}