import java.util.*;
public class Studentdetails{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Student name: ");
        String name = input.next();
        System.out.print("Enter address: ");
        String address = input.next();
        System.out.print("Number of Subjects: ");
        double total = 0;
        double maximum =0;
        double marks ;
        int subjects = input.nextInt();
        for (int i=0; i< subjects; i++){
            System.out.print("Subject "+(i+1)+" Marks:");
            marks = input.nextDouble();
            total = total + marks;
            if (marks >maximum){
                maximum =marks;
            }

        }
        int k=0;

            System.out.println("A. student details: ");
            System.out.println("B. maxim mark: ");
            System.out.println("C.Total,average& result: ");
            System.out.println("D.Exist");


            while(k<=0){

                    System.out.println("Enter your option");
                    String answer = input.next();
                    switch(answer){
                        case "A":
                            System.out.println("Student details: "+name+" "+address);
                            break;
                        case "C":
                            System.out.println("total: "+ total);
                            System.out.println("average: "+ (total/subjects));
                            if ((total/subjects)>=50){
                                System.out.println("Final result: Pass");

                            }else {
                                System.out.println("Final result: Fail");
                            }
                            break;
                        case "B":
                            System.out.println("Maximum marks: "+maximum);
                            break;
                        case "D":
                            System.out.println("Good bye see you");
                            k=1;

                }
            }

    }

}
