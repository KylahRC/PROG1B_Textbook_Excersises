package Ex4;

import java.util.Scanner;

public class DemoPoems
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Poem poemObj = new Poem();
        Couplet coupletObj = new Couplet();
        Limerick limerickObj = new Limerick();
        Haiku haikuObj = new Haiku();
        String poemChoice = "";


        boolean chooseRight = false;
        while (!chooseRight)
        {
            System.out.println("You must pick one");
            System.out.println("What poem do you want to make? ");
            System.out.println("(1) Custom Poem");
            System.out.println("(2) Couplet");
            System.out.println("(3) Limerick");
            System.out.println("(4) Haiku");
            poemChoice = scanner.nextLine();

            if (poemChoice.equals("1"))
            {
                chooseRight = true;
            }
            else if(poemChoice.equals("2"))
            {
                chooseRight = true;
            }
            else if(poemChoice.equals("3"))
            {
                chooseRight = true;
            }
            else if (poemChoice.equals("4"))
            {
                chooseRight = true;
            }
        }

        if (chooseRight)
        {
            switch (poemChoice)
            {
                case "1":
                    System.out.println("Whats the title? ");
                    poemObj.setPoemName(scanner.nextLine());

                    System.out.println("How many lines? ");
                    poemObj.setNumLines(scanner.nextInt());
                    scanner.nextLine();

                    System.out.println("Your poem is called " + poemObj.getPoemName());
                    System.out.println("Your poem has " + poemObj.getNumLines() + " lines");

                    System.exit(0);


                case "2":
                    System.out.println("Whats the title? ");
                    coupletObj.setPoemName(scanner.nextLine());

                    System.out.println("Your poem is called " + coupletObj.getPoemName());
                    System.out.println("Your poem has " + coupletObj.getNumLines() + " lines");

                    System.exit(0);


                case "3":
                    System.out.println("Whats the title? ");
                    limerickObj.setPoemName(scanner.nextLine());

                    System.out.println("Your poem is called " + limerickObj.getPoemName());
                    System.out.println("Your poem has " + limerickObj.getNumLines() + " lines");

                    System.exit(0);


                case "4":
                    System.out.println("Whats the title? ");
                    haikuObj.setPoemName(scanner.nextLine());

                    System.out.println("Your poem is called " + haikuObj.getPoemName());
                    System.out.println("Your poem has " + haikuObj.getNumLines() + " lines");

                    System.exit(0);

            }
        }
    }
}

