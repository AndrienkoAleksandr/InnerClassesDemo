package org.eclipse.che.examples;
public class JavaTest {
int ikk = 0;
     public static class Action {
       
       private String actionId;
       
       public void setActionId(String actionId) {
           this.actionId = actionId;
       }
       
       public String perform() {
            final StringBuilder result = new StringBuilder();
            Perfornable perfornable = new Perfornable() { 
                @Override
                public void perform() {
                     result.append("We have done some action with id: " + actionId + ". ");
                     result.append(" This action is stub. ");
                }
            };
            perfornable.perform();
            return result.toString();   
       }
   }
   
   private interface Perfornable {
       void perform();
   }
}
