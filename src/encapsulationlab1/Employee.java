package encapsulationlab1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Employee {
    private String firstName, lastName, ssn, cubeId;
    private Date birthDate, currentDate;
    private boolean metWithHr, metDeptStaff, reviewedDeptPolicies, movedIn;
    
 
   public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    
        currentDate = new Date();
    }
   
   public void  HireEmployee(String cubeId){
       this.cubeId =cubeId;
   meetWithHrForBenefitAndSalaryInfo();
   meetDepartmentStaff();
   reviewDeptPolicies();
   moveIntoCubicle(this.cubeId);
     getStatus();
     };
  
    // Assume this must be performed first
    private void meetWithHrForBenefitAndSalaryInfo() {
        String fmtDate = dateFormat();
        System.out.println("Met with Hr on " + fmtDate);
        metWithHr = true;
    }

    private String dateFormat() {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(currentDate);
        return fmtDate;
    }

    // Assume this is must be performed second
    private void meetDepartmentStaff() {
        
            String fmtDate = dateFormat();
            System.out.println("Met with Dept. Staff on " + fmtDate);
            metDeptStaff = true;
      
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
        
            String fmtDate = dateFormat();
            System.out.println("Reviewed Dept. Policies on " + fmtDate);
            reviewedDeptPolicies = true;
       
    }

    // Assume this must be performed 4th
    private void moveIntoCubicle(String cubeId) {
       
            String fmtDate = dateFormat();
            System.out.println("Moved into cube on " + fmtDate);
            this.cubeId = cubeId;
            this.movedIn = true;
      

    }

    private void getStatus() {
        String fmtDate = dateFormat();

        if(metWithHr && metDeptStaff
           && reviewedDeptPolicies && movedIn) {
            System.out.println("Orientation is completed on: " + fmtDate);
        } else {
            System.out.println( ": Orientation in progress...");
        }
    }
}
