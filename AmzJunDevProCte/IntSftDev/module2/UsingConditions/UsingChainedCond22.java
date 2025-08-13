public class Main {
    public static void main(String[] args) {
        // set the speed in Mph
        int carSpeed = 60;
        
        // 1st level "if" condition
        if (carSpeed <= 16) {
            System.out.println("1st Gear.");
        } else {
            // 1st level "else" of 1st level "if"
            
            // 2nd level "if" condition inside 1st level "else"
            if (carSpeed <= 32) {
                System.out.println("2nd Gear.");
            } else {
                // 2nd level "else" of 2nd level "if"
                
                // 3rd level "if" condition inside 2nd level "else"
                if (carSpeed <= 48) {
                    System.out.println("3rd Gear.");
                } else {
                    // 3rd level "else" of 3rd level "if"
                    
                    // 4th level "if" condition inside 3rd level "else"
                    if (carSpeed <= 64) {
                        System.out.println("4th Gear.");
                    } else {
                        // 4th level "else" of 4th level "if"
                        
                        // 5th level "if" condition inside 4th level "else"
                        if (carSpeed <= 80) {
                            System.out.println("5th Gear.");
                        } else {
                            // 5th level "else" of 5th level "if"
                            System.out.println("SLOW DOWN BOSS.");
                        }
                    }
                }
            }
        }
    }
}
