import java.util.Scanner;
class ArrayMaxNo{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    System.out.println("enter a array elements");
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();
    }
    int max=arr[0];
    for(int i=1;i<5;i++){
      if(arr[i]>max)
        max=arr[i];
    }
  
  System.out.println("array of max element is"+max);
}
}

