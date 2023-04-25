package DesignPattern.Creational.Factory;

public class getPlanFactory {
	  public Plan getPlan(String planType){  
          if(planType == null){  
           return null;  
          }  
        if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
               return new domesticPlan();  
             }   
         else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
              return new CommercialPlan();  
          }   
        else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {  
              return new InstitutionalPlan();  
        }  
    return null;  
 }  

}
