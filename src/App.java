import java.util.Scanner;

/**
 * Created by jc143867 on 16/03/15.
 */
public class App {
    public static void main(String[] args) {

        System.out.println("BMI Manager");

        boolean running = true;

        Patient patient = new Patient();
        while (running) {

            System.out.println("Please select from the " + "following menu options:\n" +
                    "\t1. Add new patient\n" + "\t2. View patient\n" + "\t3. Exit\n");
            System.out.print("Enter choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt(); //define input type sought
            scanner.nextLine(); //consume input buffer



            switch (choice) {
                case 1: {
                    System.out.println("Name :");
                    patient.setName(scanner.nextLine());
                    System.out.println("Age :");
                    patient.setAge (scanner.nextInt());
                    System.out.println("Weight and Height:");
                    patient.setDetails(scanner.nextDouble(),scanner.nextDouble());

                    break;
                }
                case 2: {
                    System.out.println(String.format("Name %s Age: %d BMI: %.4f", patient.getName(), patient.getAge(), patient.getBMI()));
                    break;
                }
                case 3: {
                    System.out.println("Good bye!");
                    running = false; //while loop runs until case 3 occurs!
                }
            }
        }
    }

    public static class Patient {
        private String name;
        private int age;
        private double height, weight;

        //Setter:
        public void setName(String name){
            this.name = name;
        }
        //Getter:
        public String getName() {
            return name;
        }
        //Setter//
        public void setAge(int age) {
            this.age=age;
        }
        //Getter:
        public int getAge(){
            return age;
        }
        public void setDetails(double height, double weight){
            this.height = height;
            this.weight = weight;

        }
        public double getBMI() {
            return weight / (height * height);
        }
    }




}
