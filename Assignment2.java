public class Assignment2 {
    public static void main(String[] args) throws Exception {
        
        //1. Use a while loop to print your FIRSTNAME three times.

        int count=0;

        while (count!=3){
            System.out.println("GABRIEL");
            count ++;
        }
//==========================================================================================================================================================================

        //2. Use a do-while loop to print your MIDDLENAME four times.

        int m = 0; 

            do {
                System.out.println("VILLANUEVA");
                m ++;
            }while (m !=4);
            
//==========================================================================================================================================================================

        //3. Use a for loop to print your SURNAME five times.

        for (int s = 0; s != 5; s++) {
            System.out.println("MARFAL");
        }

//==========================================================================================================================================================================

        //4. Create a char array that consists all of the characters of your FIRSTNAME and use a for loop to print each character of your FIRSTNAME. (example: ELIZER)
        //G
        //A
        //B
        //R
        //I
        //E
        //L

        //char Arrray
        char[] firstname = {'G', 'A', 'B', 'R', 'I', 'E', 'L'};
            System.out.print(firstname[0]);
            System.out.print(firstname[1]);
            System.out.print(firstname[2]);
            System.out.print(firstname[3]);
            System.out.print(firstname[4]);
            System.out.print(firstname[5]);
            System.out.println(firstname[6]);
        //For loop
        for (int c = 0; c != 1; c++);

//==========================================================================================================================================================================

        //5. Use a for loop to print the char array of your FIRSTNAME in REVERSE order (example: REZILE)

        //For loop
            for (int r = 0; r != 1; r++);

        //char Arrray
        char[] firstname2 = {'G', 'A', 'B', 'R', 'I', 'E', 'L'};
            System.out.print(firstname[6]);
            System.out.print(firstname[5]);
            System.out.print(firstname2[4]);
            System.out.print(firstname2[3]);
            System.out.print(firstname2[2]);
            System.out.print(firstname2[1]);
            System.out.print(firstname2[0]);
    }  
}
