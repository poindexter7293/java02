

//참고 : 산술 연산자 중에서 + 연산자는 두 문자열을 하나로 합칠떄 사용 함.

//예제) 문자열 데이터  + 연산하기
public class Opr01_02 {

	public static void main(String[] args) {
		
		String a = "Apple";
		String b = "Banana";
		
		//문자열 데이터끼리 + 연산을 할 경우 두 문자열이 하나로 연결됩니다.
		//c변수에 a변수에 저장된 "Apple"에 b변수에 저장된 "Banana"가 연결되어 
		//"AppleBanana"가 저장됩니다.
		String c = a + b;
		//       = "Apple" + "Banana"
		//"AppleBanana"
		
		System.out.println(c);
		
		String str = "결과값 : ";
		int n = 10;
		
      //정수형 데이터를 문자열 데이터와 + 연산하면
      //정수형 데이터가 문자열 데이터로 자동 형변환하여 
      //문자열 데이터에 연결됩니다.
      //str+n 한 결과값은 "결과값 : 10"이란 문자열입니다.		
		System.out.println(str + n);
	 /*	
		str         +   n
		"결과값 : "  +   10
		"결과값 : "  +   "10"
			 "결과값 : 10"
	*/	
		
		
		
		
		
	}
	
}




