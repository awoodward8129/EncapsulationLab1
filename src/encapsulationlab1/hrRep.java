/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encapsulationlab1;

/**
 *
 * @author Alex
 */
import java.util.Date;
public class hrRep {
    
    
    
    public void HrHire(String FirstName, String LastName, String ssn){
    
        Employee Employee = new Employee (FirstName, LastName, ssn);
        
       Employee.HireEmployee("One");
        
    }
   

    
    
    }