/*
 * 
 * numberArr에 5, 4, 3, 2, 1을 넣는다
 * 이 값을 섞어서 출력한다
 * 단, 배열 변수를 하나 더 생성한다.
 * =============================
 * 초기값: 5, 4, 3, 2, 1
 * 셔플값: 
 * 
*/
public class ArrayTest6_초기값유지_숫자섞기1단계 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numberArr = new int[5];
		int[] shuffleArr = new int[5];
		
		for (int i = 0; i < numberArr.length; i++) {
			numberArr[i] = i + 1;
		}
		//우선 numberArr의 숫자들을 shuffleArr에 넣어준다
		shuffleArr = numberArr;
		
		System.out.print("초기값(numberArr) : " );
		for (int i = 0; i < numberArr.length; i++) {
			System.out.print(numberArr[i]);
			if(i != 4) {
				System.out.print(", ");
			}
		}
		
		shuffleArr[0] = 10;	//shuffleArr에 준 변화가 numberArr에 영향을 주면 안된다.
		System.out.println();
		System.out.println();
		
		System.out.println("초기값(numberArr) (shuffleArr가 바뀌면서 같이 바뀐다) : " );
		for (int i = 0; i < numberArr.length; i++) {
			System.out.print(numberArr[i]);
			if(i != 4) {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.print("셔플전(shuffleArr) : ");
		for (int i = 0; i < shuffleArr.length; i++) {
			System.out.print(shuffleArr[i]);
			if(i != 4) {
				System.out.print(", ");
			}
		}
		
		System.out.println();
		System.out.println();
		
		//섞어준다
		int tempNum = 0;
		int n = 0;
		
		for (int i = 0; i < shuffleArr.length; i++) {
			n = (int)(Math.random() * 5);
			
			tempNum = shuffleArr[0];
			shuffleArr[0] = shuffleArr[n];
			shuffleArr[n] = tempNum;
		}
		
		//그후에 셔플값을 출력한다
		System.out.print("셔플후(shuffleArr) : " );
		for (int i = 0; i < shuffleArr.length; i++) {
			System.out.print(shuffleArr[i]);
			if(i != 4) {
				System.out.print(", ");
			}
		}

	}

}
