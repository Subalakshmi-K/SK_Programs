import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int start, end;
        Scanner scan = new Scanner(System.in);
        
        start = scan.nextInt();
        end = scan.nextInt();
    
        for (int i = start; i<=end; i= i+100)
        {
            System.out.println(i);
        }
    }
}
