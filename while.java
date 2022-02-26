import java.util.Scanner;

public class main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        String name1 = scanner.next();
        while (name1.length()<10 && (!name1.equals("shiri"))) {

            System.out.println(name1);
            name1= scanner.next();

        }
        int sum = 0;
        int c = 0;
        boolean flag = true;
        while (flag) {
            c = c + 10;
            System.out.println("way wya way awaaaaaay");
            if (c == 1000)
                break;
        }


        // תכתבו תוכנית שמקבלת שמות מהמשתמש עד קבלת השם שירי
        // במידה מתקבל השם שירי תצאו מהלולאה
        // אם המשתמש מכניס שם שמכיל יותר מ 10 תווים יש לצאת מהלולאה


        String name = scanner.next();
        while (!name.equals("hodi")) {
            System.out.println(name);
            name = scanner.next();
            if (name.equals("polina"))
                break;
        }


        for (int i = 0; i < 20; i++) {
            System.out.println(i);

        }
        while (sum <= 100) {
            x = scanner.nextInt();
            sum += x; //sum = sum + x;
            System.out.println(sum);
            if (x == 30)
                break;
        }

        System.out.println("the sum is " + sum);


// כתבו תוכנית שמקבלת מהמשתמש מספרים שלמים וברגע שהסכום של כל המספרים עובר את ה 100 יש
// לצאת מהלולאה ולהדפיס את הסכום
    }
}
