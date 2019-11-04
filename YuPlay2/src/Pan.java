import java.util.Scanner;

public class Pan {
	


	static  int board[][] = new int[7][6];
	
	static char PAN = 'ㅇ';
	
	static char BLANK = '	' ;

	static char [] PlayerPan = {'ⓐ','ⓑ','ⓒ','ⓓ'};
	
	//static char [] ComputerPan = {'ⓒ','ⓓ'};
	
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
			for(int b =0; b<4;b++) {//화면상에 출력유지를 위한 초기화 
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
			for (int q=5; q>-1; q--) { // 동그라미 표시된 배열 값을 count = 0부터 증감연산자를 이용해 1씩 증가
				
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
			count = 51; //맵 x에 들어가는 값 
			
			board[3][2]=70;
			
			for(int t=1; t<6; t++) { 	//x의 오른쪽 선 [1][4], [2][3], [3][2], [4][2], [5][1] 배열에 숫자 넣기
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
			for(int y=1; y<6; y++) { //x의 왼쪽 선 [1][1], [2][2], [4][3], [5][4] 배열에 숫자 넣기
				if(y==3&&arrayCount==3) {
					count++;
					continue;
				}
				board[y][arrayCount]=count; // count = 81
				count++;
				arrayCount++;	
			}
				
		
			for(int i=2; i<5; i++) { // board[2~4][1,4] 공백처리를 위해 100로 값을 바꿔줌
				board[i][1] = 100;
				board[i][4] = 100;
			}
			for(int j=2; j<4; j++) { // board[1,5][2~4] 공백처리를 위해 1로 값을 바꿔줌
				board[1][j]=100;
				board[5][j]=100;
			}
			for(int k=0; k<6; k++) { // board[3][0~5] 가운뎃 줄 모두 공백 처리를 위해 1로 값을 바꿔줌
				board[3][k]= 100;	
			}
			
			if(board[3][2]==100) { // board[3][1~6] 가운뎃 줄 모두 공백처리 후 게임에 필요한 자리 o 처리
				board[3][2]	=70; //board[3][2] 가운데 동그라미를 조절하기 위해 2로
			}
			
		
						
		for (int r1 = 0; r1<board.length; r1++) { //모든 배열의 값을 비교하여 공백과 o를 넣기위한 작업 시작

			for (int c = 0;c<board[r1].length;c++) {
				
			if(board[r1][c]==100) { //배열 값안에 100이 들어가 있으면 공백처리
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
																					
						
			 // 한 열마다 처리를 다했을 경우 한칸 들여쓰기
		}
			System.out.println("\n");
		}

		for(int l=0; l<4; l++) {
			if(panOn[l]==53) {
				panOn[l]=83;
			}			
		}
		
		System.out.println("플레이어");
		for(int p=0; p<PlayerPan.length; p++) {
			System.out.print(PlayerPan[p]);
		}
		System.out.println();
		
		System.out.println("컴퓨터");
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
				System.out.println("     1~2 사이의 정수인 숫자를 입력해주세요");
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
				System.out.println("     3~4 사이의 정수인 숫자를 입력해주세요");
				turn--;
				}
		}	
		}*/
		
		if (yu.sum==4) {//모일떄
			getSum=5;
		}
		if(yu.sum==0) {//윷일때
			getSum=4;
		}
		if(yu.sum==3) {//도일때
			getSum=1;
		}
		if(yu.sum==1) {//걸일때  
			getSum=3;
		}if(yu.sum==2) {//개일때  
			getSum=2;
		}if(yu.sum==-1) {//빽도일때  
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
		panOn[compPlayer] += getSum; //숫자가 적립되어집니다			panOn[0] = PlayerPan[0]  if(panOn[i]==panOn[0])   panOn[0]+=getsum; panOn[i]+=getSum
		}
		else  if(compPlayer==2){
			compPlayer-=1;
			panOn[compPlayer] += getSum;
			}
		else  {
			System.out.println("     1~2 사이의 정수인 숫자를 입력해주세요");
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
			System.out.println("     1~2 사이의 정수인 숫자를 입력해주세요");
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