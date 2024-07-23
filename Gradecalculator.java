import java.util.*;
public class Gradecalculator {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter marks of Student in each subject(out of 100) : ");
        float physics= sc.nextFloat();
        float chemistry= sc.nextFloat();
        float maths= sc.nextFloat();
        float english= sc.nextFloat();
        float computer= sc.nextFloat();
        
        float sum= physics + chemistry + maths + english + computer ;
        
        float avgperc = sum/5;
        
        String grade;
        
        if(avgperc>=90.0 && avgperc<=100.0)
            grade= " A +";
        else if(avgperc>=80.0 && avgperc<=90.0)
            grade= " A ";
            else if(avgperc>=70.0 && avgperc<=80.0)
                grade= " B+ ";
                else if(avgperc>=60.0 && avgperc<=70.0)
                grade= " B ";
                        else if(avgperc>=50.0 && avgperc<=60.0)
                grade= " C+ ";
                    else if(avgperc>=40.0 && avgperc<=50.0)
                grade= " C ";
                        else if(avgperc>=33.0 && avgperc<=40.0)
                grade= " D ";
                            else 
                grade= " E ";
                            
                            
       System.out.println("\nDisplaying Result\n");
       System.out.println("Total marks = "+ sum+"/500");
         System.out.println("percentage  = "+avgperc+"%"); 
         System.out.println("grade = "+grade);
                                   
                
            
        
        
        
        
    }
    
}