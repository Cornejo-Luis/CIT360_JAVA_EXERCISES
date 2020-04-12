/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontrollerpattern;

/**
 *
 * @author Luis
 */
import java.util.HashMap;

public class ApplicationController {
    private HashMap<String,Handlers> handlerMap = new HashMap<String,Handlers>();
    
    public void ApplicationController(){
        
    }
    
    public void handleRequest(String operation, Integer input1, Integer input2){
        
        handlerMap.put("A", new AreaHandler());
        handlerMap.put("P", new PerimeterHandler());

        Handlers handler = handlerMap.get(operation);
        handler.handleIt(input1, input2);
    }
    
}
