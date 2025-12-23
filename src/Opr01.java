/*
수학적 연산을 위한 산술연산자
- 데이터를 더하고(+) 빼고(-) 곱하고(*) 나누기(/) 위해서 제공 되는 연산자를 산술연산자라 합니다.


산술연산자 5가지 종류

	연산자	의미		사용 예		결과
	+		더하기	6 + 2		8
	-		빼기		5 - 3		2
	*		곱하기	2 * 3		6
	/		나누기	8 / 2		4
	%		나머지	8 % 3		나머지값 2

*/

public class Opr01 {
	public static void main(String[] args) {
		/*
		int a=10;
		int b=4;
		int c;
		*/
		int a=10, b=4, c;
		
		c = a + b;
		System.out.println(a + "+" + b + "=" + c);
		//				   10   +    4    =   14
		
		
		c = a - b;
		System.out.println(a + "-" + b + "=" + c);
		//                10    -    4    =    6
		
		c = a * b;
	//      10 * 4
	//	40=
		System.out.println(a + "*" + b + "=" + c);
		//				   10   *    4    =    40
		
		c = a / b;
		
		System.out.println(a + "/" + b + "=" + c);
		//				   10   /    4    =    2 
		
		c = a % b; //a변수값을 b변수값으로 나눈 나머지값 구해서 c변수에 저장
		
		System.out.println(a + "%" + b + "=" + c);
		//				   10   %    4    =    2
		
	/*
		실행결과
		10 + 4 = 14
		10 - 4 = 6
		10 * 4 = 40
		10 / 4 = 2
		10 % 4 = 2	
	*/
	}

}












