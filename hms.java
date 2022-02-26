import java.util.Scanner;

public class hms {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);;

        ///////////////////////////////////////////////////////////////////////
        //#1
        int sum1=0,input1;

        for (int i=0;i<10;i++){
            System.out.print("enter a number please : ");
            input1=scanner.nextInt();
            if (input1 >0)
                sum1+=input1;
        }
        System.out.println(sum1);
////    ///////////////////////////////////////////////////////////////////
        //#2
        int posSum=0,input2,negSum=0;

        for (int i=0;i<10;i++){
            System.out.print("enter a number please : ");
            input2=scanner.nextInt();
            if (input2 >0)
                posSum+=input2;
            else
                negSum+=input2;
        }
        System.out.println("positive sum :"+posSum );
        System.out.println("negative sum :"+negSum );


        ///////////////////////////////////////////////////////////////////////
        //#3
        int base;
        int power;
        int result = 1;
        System.out.print("Enter the base number ");
        base = scanner.nextInt();
        System.out.print("Enter the power ");
        power = scanner.nextInt();
        for(int i = 1; i <= power; i++)
        {
            result *= base;
        }
        System.out.println("Result: "+ result);

        ///////////////////////////////////////////////////////////////////////
        //#4


        int number = scanner.nextInt();
        int temp = number;
        int rem,newNumb=0;
        int c=0;
        for(int i =0 ; i<50;i++){
            if (number!=0)
                c++;
            number/=10;
        }
        for (int i=0 ; i < c  ; i++){
            rem=temp%10;// yhadot
            newNumb=newNumb *10 ;//yhdot -> asharot -> maot
            newNumb=newNumb+rem;
            temp=temp/10;
        }
        System.out.println(newNumb);
        //פתרון נוסף לשאלה
            //int number;
            //int reverse = 0;
//
            //System.out.print("Enter the number ");
            //number = scanner.nextInt();
//
            //int temp = number;
            //int remainder = 0;
//
            //while(temp>0)
            //{
            //    remainder = temp % 10;
            //    reverse = reverse * 10 + remainder;
            //    temp /= 10;
            //}
//
            //System.out.println("Reverse of " + number + " is " + reverse);


        ///////////////////////////////////////////////////////////////////////
        //#5

        int input5,mult=1,sum5=0;
        for (int i=0;i<10;i++){
            System.out.print("enter a number please : ");
            input5=scanner.nextInt();
            if (i%2==0)
                sum5+=input5;
            else
                mult*=input5;
        }

        System.out.println(sum5);
        System.out.println(mult);

        ///////////////////////////////////////////////////////////////////////
        //#6

        int input6;  // To hold number of terms

        System.out.print("Enter number of terms of series : ");
        input6 = scanner.nextInt();

        double sum = 0;
        int sign = 1;

        for(int i = 1; i <= number; i++)
        {
            sum += (1.0 * sign) / i;
            sign *= -1;
        }

        System.out.println("log2: " + sum);

    }
}
