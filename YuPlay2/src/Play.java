import java.util.Scanner;
public class Play {
	
	public static void main(String[] args) {
		Pan pan = new Pan();
		Yut Yu = new Yut();
		int end = 1;
		
		String throwYut;
		Scanner scan = new Scanner(System.in);
		
		do { 
		pan.makeArray();
		if(pan.score1==1) {
			System.out.println("�÷��̾�1 �¸�!!!!!!");
			break;
			
		}
		if(pan.score2==1) {
			System.out.println("�÷��̾�2 �¸�!!!!!!");
			break;
		}
		System.out.print("���� �������� 'a'�� �Է����ּ���.	");
		throwYut = scan.next();
		Yu.percent();
		if(throwYut.equals("a")) {
		
		if (Yu.sum==-1&&pan.panOn[0]==0&&pan.panOn[1]==0&&pan.panOn[2]==0&&pan.panOn[3]==0)//������ ���� ���µ� ������ ������ ��
		{
			System.out.print("������ �� �ִ� ���� �����ϴ�.");
			continue;
		}
		for(int i =0;i<2; i++) {//ó�� ������ġ���� ��ĭ �տ� ���� �� ������ ������ �ڷ� �����ϴ� �ڵ�
		if(Yu.sum==-1&&Pan.panOn[i]==1) {
			pan.panOn[i]=21;
		}
	
		}
		
		
		if(pan.panOn[pan.compPlayer]==100) {
			
			
			while(true) {
				pan.compPlayer=1000;
				System.out.print("���� �ٽ� �������ּ��� ");
				if(pan.turn%2==1) {
			for(int z=0; z<2; z++) {
			System.out.print(z+1+". ");
			System.out.print(pan.PlayerPan[z]+" ");
			System.out.print(' ');		
		}
				}
	
		
		
		if(pan.turn%2==0) {
			for(int z=2; z<4; z++) {
			System.out.print(z+1+". ");
			System.out.print(pan.PlayerPan[z]+" ");
			System.out.print(' ');			
		}
				pan.move();
				break;
			
			}
		}
			
			
		
			}
			
		
			
			else{
				System.out.print("���� �������ּ��� ");
				if(pan.turn%2==1) {
					for(int z=0; z<2; z++) {
					System.out.print(z+1+". ");
					System.out.print(pan.PlayerPan[z]+" ");
					System.out.print(' ');	
					
				}
			
				}
				
				if(pan.turn%2==0) {
					for(int z=2; z<4; z++) {
					System.out.print(z+1+". ");
					System.out.print(pan.PlayerPan[z]+" ");
					System.out.print(' ');			
				}
			}
				Pan.move();
				pan.turn++;
										
					
		}
		
		
		if(pan.turn%2==0) {
			if(pan.panOn[2]==pan.panOn[0]||pan.panOn[2]==pan.panOn[1]) {			
				pan.panOn[2]=0;						
			}
			if(pan.panOn[3]==pan.panOn[0]||pan.panOn[3]==pan.panOn[1]){
				pan.panOn[3]=0;
			}
		}
		if(pan.turn%2==1) {
			if(pan.panOn[0]==pan.panOn[2]||pan.panOn[0]==pan.panOn[3]) {			
				pan.panOn[0]=0;						
			}
			if(pan.panOn[1]==pan.panOn[2]||pan.panOn[1]==pan.panOn[3]){
				pan.panOn[1]=0;
			}
		}
		
		
		
		}
		else {
			System.out.println("�� 'a'�� �Է����ּ���");
		}
		
		
		
		
		}while(end==1);
		
	}
}
