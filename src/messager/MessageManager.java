/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messager;

/**
 *
 * @author Jacob
 */
public class MessageManager {
    private MessageInput input;
    private MessageOutput output;
    
    public MessageManager (MessageInput input, MessageOutput output){
        this.input = input;
        this.output = output;
    }
        
        public void makeMessage(){
            output.sendMessage(input);
        }
        
    
}
