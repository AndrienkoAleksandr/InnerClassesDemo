package org.eclipse.che.examples;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetingController implements Controller
{

   @Override
   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
   {
      String userName = request.getParameter("user");
      String result = "";
      if (userName != null)
      {
        result = "Hello, " + userName + "!";
      }

      Action action = new Action(); 
      action.setActionId("someId");
      action.perform();
      
      JavaTest.Action action2 = new JavaTest.Action();
      action2.setActionId("testAction");
      action2.perform();
      
      LyambdaOuterClass.LyambdaContainer lyambdaContainer = new LyambdaOuterClass.LyambdaContainer();
      List<Integer> sortedList = lyambdaContainer.lyambdaSort();

      ModelAndView view = new ModelAndView("hello_view"); 
      view.addObject("greeting", result);
      return view;
   }
   
   public static class Action {
       
       private String actionId;
       
       public void setActionId(String actionId) {
           this.actionId = actionId;
       }
       
       public String perform() {
            String message = " This action is stub. ";
            return "We have done some action with id: " + actionId + ". " + message;
       }
   }
}