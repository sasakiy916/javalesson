import java.util.*;
public class Sales{
	public static void main(String[] args){
		Random rnd = new Random();
		String[][] sales = new String[12][31];
		for(int i=0;i<sales.length;i++){
			int sum = 0;
			System.out.printf("%2d|",i+1);
			for(int j=0;j<sales[i].length;j++){
				int r = rnd.nextInt(41)+10;
				switch(i+1){
					case 1,3,5,7,8,10,12:
						if(j<31){
							sales[i][j] = String.valueOf(r);
							sum += r;
						}
						break;
					case 2:
						if(j<28){
							sales[i][j] = String.valueOf(r);
							sum += r;
						}else{
							sales[i][j] = "*";
						}
						break;
					default:
						if(j<30){
							sales[i][j] = String.valueOf(r);
							sum += r;
						}else{
							sales[i][j] = "*";
						}
						break;
				}
				System.out.printf("%3s",sales[i][j]);
			}
			System.out.printf("|%4d%n",sum);
		}
	}
}
