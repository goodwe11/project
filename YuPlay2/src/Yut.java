
import java.util.Random;

 

public class Yut {

	public static int sum; // ���������� Ȯ�� �� �̵��ؾ��� �Ÿ��� �����ϱ� ���� ����

	public int [] index; // ���̳� ���϶� �ѹ� �� ������ �߰��� ���� �̵��ؾ��� �Ÿ��� ���� ���� �����ϱ� ���� �迭

	public void percent() { 

		 // ���� ������ ���� ���� �޴� ����

		//��ĳ�� ����

		 //���� ���� �� 1�� �Է¹ޱ� ���� ���

		 {//1�� �޾��� �� ���� ���� ����ϱ� ���� �Լ�

			this.sum=0;	//���� �޼ҵ忡�� do~while���� ����Ͽ� �ݺ��Ǳ� ������ ������ ���� ��� �� �� �־ 0���� �ʱ�ȭ

			for(int k =0;k<3;k++) {

				int[] kao= {0,1};//1�� �ո�,0�� �޸�

			Random rand =new Random(); //���� ���� ����

			 int i=rand.nextInt(2);//i���� 0,1�� �������� �ϳ� ����
			

			if (kao[i]==1) {//1�̸� �ո�� ���

				System.out.println( 

						"[x" +"x" + "x" + "x" + "x]");

			}	

			if (kao[i]==0) {//0�̸� �޸�� ���

				System.out.println( "[ " + " " + " " + " " + " ]");

			}

			this.sum += kao[i];//3���� �ݺ��ؼ� sum�� ���ڸ� ���Ѵ�.

			}

			Random ra =new Random();

			int[] oka = {0,1};

			int js =ra.nextInt(2);

			this.sum += js;

			if (js==1) {//1�̸� �ո�� ���

				System.out.println( 

						"[x" +"x" + "x" + "x" + "x]");

			}	

			if (js==0) {//0�̸� �޸�� ���

				System.out.println( "[ " + " " + "x" + " " + " ]");

			}

 

 

			if(this.sum==4) {

				System.out.println("���Դϴ�");

			}

			if(this.sum==3) {

 

				if(js==0) {

					System.out.println("�����Դϴ�");

					this.sum=-1;//������ -1�̴�

				}

				else {

				System.out.println("���Դϴ�");}

			}

			if(this.sum==2) {

				System.out.println("���Դϴ�");

			}

			if(this.sum==1) {

				System.out.println("���Դϴ�"); 

			}

			if(this.sum==0) {					

				System.out.println("���Դϴ�");

			}

		}
	}
}


