package dailyActivity;
class number1{
	int a = 20;
	
	class number2{
		public void number3() {
			System.out.println("y =" + a);
		}
	}
	void number4() {
		number2 num = new number2();
			num.number3();
	}
}


public class Innercls {
public static void main(String[] args) {
	number1 n = new number1();
	n.number4();
}
}
