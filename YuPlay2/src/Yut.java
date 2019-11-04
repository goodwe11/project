
import java.util.Random;

 

public class Yut {

	public static int sum; // 도개걸윷모 확인 후 이동해야할 거리를 저장하기 위한 변수

	public int [] index; // 윷이나 모일때 한번 더 던져서 추가로 나온 이동해야할 거리를 따로 따로 저장하기 위한 배열

	public void percent() { 

		 // 윷을 던지기 위한 값을 받는 변수

		//스캐너 선언

		 //윷을 던질 때 1을 입력받기 위한 출력

		 {//1를 받았을 때 던진 윷을 출력하기 위한 함수

			this.sum=0;	//메인 메소드에서 do~while문을 사용하여 반복되기 때문에 쓰레기 값이 들어 갈 수 있어서 0으로 초기화

			for(int k =0;k<3;k++) {

				int[] kao= {0,1};//1이 앞면,0이 뒷면

			Random rand =new Random(); //랜덤 변수 선언

			 int i=rand.nextInt(2);//i에다 0,1중 랜덤으로 하나 저장
			

			if (kao[i]==1) {//1이면 앞모양 출력

				System.out.println( 

						"[x" +"x" + "x" + "x" + "x]");

			}	

			if (kao[i]==0) {//0이면 뒷모양 출력

				System.out.println( "[ " + " " + " " + " " + " ]");

			}

			this.sum += kao[i];//3번을 반복해서 sum에 숫자를 더한다.

			}

			Random ra =new Random();

			int[] oka = {0,1};

			int js =ra.nextInt(2);

			this.sum += js;

			if (js==1) {//1이면 앞모양 출력

				System.out.println( 

						"[x" +"x" + "x" + "x" + "x]");

			}	

			if (js==0) {//0이면 뒷모양 출력

				System.out.println( "[ " + " " + "x" + " " + " ]");

			}

 

 

			if(this.sum==4) {

				System.out.println("모입니다");

			}

			if(this.sum==3) {

 

				if(js==0) {

					System.out.println("뺵도입니다");

					this.sum=-1;//빽도는 -1이다

				}

				else {

				System.out.println("도입니다");}

			}

			if(this.sum==2) {

				System.out.println("개입니다");

			}

			if(this.sum==1) {

				System.out.println("걸입니다"); 

			}

			if(this.sum==0) {					

				System.out.println("윷입니다");

			}

		}
	}
}


