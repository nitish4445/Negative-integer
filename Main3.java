import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main3 {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i = 0; i<n; i++)
      {
        a[i]=sc.nextInt();
      }

      boolean isNagative = false;

      for(int i = 0; i<n; i++)
      {
        if(a[i]<0)
        {
            isNagative = true;
            System.out.print("Yes");
            break;
        }
      }
     if(isNagative == false){
       System.out.print("No");
     }
    }
}