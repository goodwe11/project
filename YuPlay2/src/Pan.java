import java.util.Scanner;

public class Pan {
	


	static  int board[][] = new int[7][6];
	
	static char PAN = '��';
	
	static char BLANK = '	' ;

	static char [] PlayerPan = {'��','��','��','��'};
	
	//static char [] ComputerPan = {'��','��'};
	
	static int [] panOn = {0, 0, 0, 0};
	
	static int getSum;
	
	static int turn=1;
	static int score1=0;
	static int score2=0;
	


	
	 static int compPlayer;
	
public static  void makeArray() {
		
	int count;
	int arrayCount;
	arrayCount = 4;
	count=1;

			board[6][5]=20;
			for(int b =0; b<4;b++) {//ȭ��� ��������� ���� �ʱ�ȭ 
			if(panOn[b]==50) {
				panOn[b]=5;
			}
			if(panOn[b]==83) {
				panOn[b]=70;
			}
			if(panOn[b]==53) {
				panOn[b]=70;
			}
			if(panOn[b]==86) {
				panOn[b]=20;
			}
			if(panOn[b]>20&&panOn[b]<30) {
				if (turn%2==0) {
					score1++;
					panOn[b]=100;
				}
				if (turn%2==1) {
					score2++;
					panOn[b]=100;
				}
				
			}
			if(panOn[b]>86&&panOn[b]<99) {
				if (turn%2==0) {
					score1++;
					panOn[b]=100;
				}
				if (turn%2==1) {
					score2++;
					panOn[b]=100;
				}
			}
				}
			for(int u =0; u<4;u++) {
				if(panOn[u]==80) {
					panOn[u]=10;
				}
					}
			for (int q=5; q>-1; q--) { // ���׶�� ǥ�õ� �迭 ���� count = 0���� ���������ڸ� �̿��� 1�� ����
				
				board[q][5]=count;
				if(q==3) {
					continue;
				}
				count++;
			}
			for(int w=4; w>-1; w--) {
				board[0][w]=count;
				count++;
			}
			for(int e=1; e<7; e++) {
				board[e][0]=count;
				if(e==3) {
					continue;
				}
				count++;
			}
			for(int r=1; r<5; r++) {
				board[6][r]=count;
				count++;
			}
			count = 51; //�� x�� ���� �� 
			
			board[3][2]=70;
			
			for(int t=1; t<6; t++) { 	//x�� ������ �� [1][4], [2][3], [3][2], [4][2], [5][1] �迭�� ���� �ֱ�
					if(board[t][arrayCount]==70) {
						count++;
						continue;
					}
					else
					board[t][arrayCount]=count;
					count++;
					arrayCount--;		
			}
			arrayCount = 1;
			count=81;
			for(int y=1; y<6; y++) { //x�� ���� �� [1][1], [2][2], [4][3], [5][4] �迭�� ���� �ֱ�
				if(y==3&&arrayCount==3) {
					count++;
					continue;
				}
				board[y][arrayCount]=count; // count = 81
				count++;
				arrayCount++;	
			}
				
		
			for(int i=2; i<5; i++) { // board[2~4][1,4] ����ó���� ���� 100�� ���� �ٲ���
				board[i][1] = 100;
				board[i][4] = 100;
			}
			for(int j=2; j<4; j++) { // board[1,5][2~4] ����ó���� ���� 1�� ���� �ٲ���
				board[1][j]=100;
				board[5][j]=100;
			}
			for(int k=0; k<6; k++) { // board[3][0~5] ��� �� ��� ���� ó���� ���� 1�� ���� �ٲ���
				board[3][k]= 100;	
			}
			
			if(board[3][2]==100) { // board[3][1~6] ��� �� ��� ����ó�� �� ���ӿ� �ʿ��� �ڸ� o ó��
				board[3][2]	=70; //board[3][2] ��� ���׶�̸� �����ϱ� ���� 2��
			}
			
		
						
		for (int r1 = 0; r1<board.length; r1++) { //��� �迭�� ���� ���Ͽ� ����� o�� �ֱ����� �۾� ����

			for (int c = 0;c<board[r1].length;c++) {
				
			if(board[r1][c]==100) { //�迭 ���ȿ� 100�� �� ������ ����ó��
					System.out.print(BLANK);
					}
				
			
			
				else if(board[r1][c]==70) {
					if(panOn[0]!=70&&panOn[1]!=70&&panOn[2]!=70&&panOn[3]!=70)
					{
						System.out.print("           "+PAN+"	");
					}
					
					else if(panOn[compPlayer]==70) {
						System.out.print("           "+PlayerPan[compPlayer]+"	");
					}
					for(int i=0; i<4; i++) {
						if(panOn[i]==70&&compPlayer!=i) {
							System.out.print(PlayerPan[i]);
						}
						
						
								
							}
						}
					
					
						
			  
				else {
					for(int m =0;m<4;m++) {
						if(board[r1][c]==panOn[m]) {
							System.out.print("  "+PlayerPan[m]+"	");
						}
						}
					
					
					if(board[r1][c]!=panOn[0]&&board[r1][c]!=panOn[1]&&board[r1][c]!=panOn[2]&&board[r1][c]!=panOn[3])				 										
					System.out.print("  "+PAN+"	");
					
							}	
																					
						
			 // �� ������ ó���� ������ ��� ��ĭ �鿩����
		}
			System.out.println("\n");
		}

		for(int l=0; l<4; l++) {
			if(panOn[l]==53) {
				panOn[l]=83;
			}			
		}
		
		System.out.println("�÷��̾�");
		for(int p=0; p<PlayerPan.length; p++) {
			System.out.print(PlayerPan[p]);
		}
		System.out.println();
		
		System.out.println("��ǻ��");
		for(int c=0; c<PlayerPan.length; c++) {
			System.out.print(PlayerPan[c]);
		}
		System.out.println();
		
		}









	public static void move() {
		getSum = 0;
		
		compPlayer=0;
		
		Scanner scan = new Scanner(System.in);
		
		compPlayer = scan.nextInt();
				
		Yut yu = new Yut();


		
		/*if(turn%2==1) {
			for(int z=0; z<2; z++) {
			System.out.print(z+1+". ");
			System.out.print(PlayerPan[z]+" ");
			System.out.print(' ');
			if(compPlayer!=1&&compPlayer!=2) {
				System.out.println("     1~2 ������ ������ ���ڸ� �Է����ּ���");
				turn--;
				}

		}		
		}
		if (turn%2==0){
		for(int y=2; y<4; y++) {
			System.out.print(y+1+". ");
			System.out.print(PlayerPan[y]+" ");
			System.out.print(' ');
			if(compPlayer!=3&&compPlayer!=4) {
				System.out.println("     3~4 ������ ������ ���ڸ� �Է����ּ���");
				turn--;
				}
		}	
		}*/
		
		if (yu.sum==4) {//���ϋ�
			getSum=5;
		}
		if(yu.sum==0) {//���϶�
			getSum=4;
		}
		if(yu.sum==3) {//���϶�
			getSum=1;
		}
		if(yu.sum==1) {//���϶�  
			getSum=3;
		}if(yu.sum==2) {//���϶�  
			getSum=2;
		}if(yu.sum==-1) {//�����϶�  
			getSum=-1;
			
		}
		
		
		for(int v=0; v<4; v++) {
		if(panOn[v]==5) {
			panOn[v]=50;
			System.out.println(panOn[v]);
		}
		if(panOn[v]==10) {
				panOn[v]=80;
				System.out.println(panOn[v]);
		}
		if((panOn[v]+getSum>55)&&(panOn[v]<56)&&(panOn[v]!=53))
				{
					panOn[v]-=41;
				}
		if (panOn[v]==70) {
			System.out.println("?");
			panOn[v]=83;
		}
		if(panOn[v]==53) {
			panOn[v]=70;
		}
		else {
			continue;
		}
		}
		
		
		
		if(turn%2==1) {
		if(compPlayer==1) {
			compPlayer-=1;
		panOn[compPlayer] += getSum; //���ڰ� �����Ǿ����ϴ�			panOn[0] = PlayerPan[0]  if(panOn[i]==panOn[0])   panOn[0]+=getsum; panOn[i]+=getSum
		}
		else  if(compPlayer==2){
			compPlayer-=1;
			panOn[compPlayer] += getSum;
			}
		else  {
			System.out.println("     1~2 ������ ������ ���ڸ� �Է����ּ���");
			turn--;
			}
		
		
		}
		else { if(compPlayer==3) {
			compPlayer-=1;
			
			panOn[compPlayer] += getSum;
			}
		else if (compPlayer==4)  {
			compPlayer-=1;
			
			panOn[compPlayer] += getSum;

			}
		else  {
			System.out.println("     1~2 ������ ������ ���ڸ� �Է����ּ���");
			turn--;
			}
		for(int k=0;k<4;k++) {
			if(panOn[compPlayer]>=100) {
				panOn[compPlayer]=100;
						
			}
		}
		
	
			}

		}
	}