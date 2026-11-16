public class LittleMonkeys {
    public static void main(String[] args){
     int monkeyCount = 4;
     boolean jumping = true;

     String state = jumping ? "jumping on the bed" : "not jumping on the bed";
     System.out.println( monkeyCount + " monkeys are " + state );
     if (monkeyCount <= 0) {
        System.out.print   ("No monkeys");
     } else if (!jumping){
         System.out.println("No one is jumping on the bed");
        } else {
         System.out.println("One fell off and bumped their head! Mama called the doctor, and the doctor said:");
                
        }   switch (monkeyCount) {
               case 5:
                  System.out.println("Those monkeys need to go to bed");
               break;

               case 4:
                  System.out.println("No more monkeys jumping on the bed");
               break;

               case 3: 
                  System.out.println("All those monkeys need to be in bed");
               break;

               case 2:
                  System.out.println("Go straight to bed");
               break;

               case 1:
                  System.out.println("Last monkey needs to go to bed");
               break;

               default:
                  System.out.println("All the monkeys are now in bed");
                  break;

        }       
      }
   }