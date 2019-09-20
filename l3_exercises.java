class Tester {
    public static void main(String[] args) {
        
        // Comments in method 'main' denote terminal output of each void
        
        question1();
        //The number of rabbits is 129.
        
        question2();
        //GROOVY DUDE

        question3();
        //computer science is for nerds

        question4();
        //Gettysburg Address

        question5();
        //core 

        question6();
        //15

        question7();
        //“Look here!” has 10 characters.

        question8();
        //All “good” men should come to the aid of their country.

        question9();
        //Hello
        //Hello again

        question10();
        //A backslash looks like this \, …right?

        question11();
        //skel

        question12();
        //n
    }

    private static void question1 () {

        // Question 1:
        
        String s = "The number of rabbits is";
        int argh = 129;
        String report = s + " " + argh + ".";
        System.out.println(report);

    }
    
    private static void question2 () {

        // Question 2:
        
        String p = "Groovy Dude";
        System.out.println(p.toUpperCase());

    }

    private static void question3 () {

        // Question 3:
        
        String g = "Computer Science is for nerds";
        System.out.println(g.toLowerCase());

    }

    private static void question4() {

        // Question 4:

        String c;
        String m = "The Gettysburg Address";
        c = m.substring(4); 
        System.out.println(c);

    }

    private static void question5() {

        // Question 5:

        String b = "Four score and seven years ago,";
        String c = b.substring(6, 11);
        System.out.println(c);

    }

    private static void question6() {
        
        // Question 6:

        int count;
        String s = "Surface tension";
        count = s.length( );   
        System.out.println(count);

    }

    private static void question7() {
        
        // Question 7:

        String m = "Look here!";
        String b = "\"" + m + "\" " + "has " + m.length() + " characters.";
        System.out.println(b);

    }

    private static void question8() {

        // Question 8:

        System.out.println("All \"good\" men should come to the aid of their country.");

    }

    private static void question9() {

        // Question 9:

        System.out.println("Hello\nHello again");

    }

    private static void question10() {

        // Question 10:

        System.out.println("A backslash looks like this \\, ...right?");

    }

    private static void question11() {

        // Question 11:

        String pq = "Eddie Haskel";
        int  hm = pq.length( );
        String ed = pq.substring(hm - 4);
        System.out.println(ed);

    }

    private static void question12() {

        // Question 12:

        String h = "Herman Munster";
        System.out.println(h.substring(5,6));

    }
}