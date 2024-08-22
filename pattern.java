public class pattern {
   
   
   
        public static void main(String[] args) {
            int n = 5; // Number of rows
    
            for (int i = 1; i <= n; i++) { // Loop through each row
                int num = n; // Start with 5 for each row
                for (int j = 1; j <= n; j++) { // Loop through each column
                    System.out.print(num + " ");
                    if (j < i) {
                        num--; // Decrease the number only after reaching the ith position
                    }
                }
                System.out.println(); // Move to the next line after each row
            }
        }
    }
    
        