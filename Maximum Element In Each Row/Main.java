import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      int row = in.nextInt();
      int column = in.nextInt();
      int [][] arr = new int[row][column];
      for(int i=0;i<row;i++)
      	for(int j=0;j<column;j++)
     		arr[i][j] = in.nextInt();
	 int max;
      for(int i=0;i<row;i++){
      max =	arr[i][0];
         for(int j=0;j<column;j++){
       		if(arr[i][j]>max)
              max = arr[i][j];
        }
        System.out.println(max);
       }
    }
	}