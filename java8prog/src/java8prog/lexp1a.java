package java8prog;

public class lexp1a {

	public static void main(String[] args) {
		int1 i1=()->System.out.println("hello");
		System.out.println(i1.getClass().getName());
      i1.show();
	}

}
@FunctionalInterface
interface int2
{
	void show();
}