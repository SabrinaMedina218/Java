public class LittleMonkeysLoops {
    public static void main(String[] args){
        int initialMonkeyCount = 4;
         
        System.out.println("=== 1. For Loop: The Nursery Rhyme Countdown ===");

        for (int i = initialMonkeyCount; i >= 1; i--) {
    
                System.out.println(i + " little monkeys jumping on the bed,");
                System.out.println("One fell of and bumped their head.");
                System.out.println("Mama called the doctor and the doctor said,");
                System.out.println("No more monkeys jumping on the bed.");
                System.out.println();
        }


            System.out.println("=== 2. While Loop: Doctor's checkup Routine ===");

        int checkups = 1;
        while (checkups <= initialMonkeyCount) {
            System.out.println("Doctor is examining" + checkups+"  All cleared");
            checkups++;
           
        }
            System.out.println();


            System.out.println("=== 3. Do-while loop: Bedtime Verification ===");
        
            int bedtime = initialMonkeyCount;
            do {
                System.out.println("Tucking in monkey" + bedtime + "  Fast asleep");
                bedtime--;

                }    while (bedtime >= 1);
            }
        }   