class l4 {
    public static void main(String[] args) {
        
        // Comments indicate method output to terminal

        question1();
        //109
        //104

        question2();
        //3
        
        question3();
        //1992.37

        question4();
        //5, 5

        question5();
        //3

        question6();
        //80

        question7();
        //80

        question8();
        //-22

        question9();
        //2

        question10();
        //5

        question11();
        //3.14

        question12();
        // n/a

        question13();
        // 7

        question14();
        // 21

        question15();
        //=

        question16();
        //2

        question17();
        //4

        question18();
        // n/a
    }

    private static void question1() {

        // Question 1:

        int h = 103; 
        int p =5;
        System.out.println(++h + p);
        System.out.println(h);

    }

    private static void question2() {

        // Question 2:

        int j = 0;
        j++;
        j += 1;
        ++j;
        System.out.println(j);

    }

    private static void question3() {

        // Question 3:

        double def;
        double f = 1992.37;
        def = f;
        System.out.println(def); 

    }

    private static void question4() {

        // Question 4:

        int zulu = 5;
        System.out.println(zulu + ", " + zulu--);

    }

    private static void question5() {

        // Question 5:

        int a = 100;
        int b = 200;
        b/=a;
        System.out.println(b + 1);

    }

    private static void question6() {

        // Question 6:

        int v = 90;
        int p = 40;
        System.out.println(v -= p - 30);

    }

    private static void question7() {

        // Question 7

        int v = 90;
        int p = 40;
        System.out.println(v = v - p + 30);

    }

    private static void question8() {

        // Question 8:

        int p = 40;
        int q = 4;
        System.out.println(2 + 8 * q / 2 - p);

    }

    private static void question9() {

        // Question 9:

        int sd = 12;
        int x = 4;
        System.out.println( sd%(++x) );
        System.out.println(x);

    }

    private static void question10() {

        // Question 10:

        /* Will not run (Syntax error)
        
        int g;
        3 = g;
        System.out.println(++g*79);
        
        */

    }

    private static void question11() {

        // Question 11:

        double m = 3.14, b = 3.14, f = 3.14;
        System.out.println(m + " , " + b + " , " + f);

    }

    private static void question12() {

        // Question 12:

        int x, y, z;

    }

    private static void question13() {

        // Question 13:

        int m = 36;
        int j = 5;
        m = m / j;  // new m is old m divided by j
        System.out.println(m);

    }

    private static void question14() {

        // Question 14:

        System.out.println(3/4 + 5*2/33 - 3 +8*3); 

    }

    private static void question15() {

        // Question 1:

        System.out.println("=");

    }

    private static void question16() {

        // Question 16:

        int j = 5;
        int i = 10;
        int k = i/j;
        System.out.println(k);

    }

    private static void question17() {

        // Question 17:

        int j = 2;
        System.out.println(7%3 + j++  + (j - 2) ); 

    }

    private static void question18() {

        // Question 18:

        int j = 10;
        j--;
        j -= 1;
        j = j - 1;

    }
}