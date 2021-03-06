import java.util.Date;
public class AlfredQuotes {
     /*
    * Inputs: None
    * Return Type: String
    * Description: Returns a generic greeting that Alfred will say to anyone.
    */
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    /* 
    * Inputs: String name, String dayPeriod 
    *                      Assume "morning", "afternoon" or "evening".
    * Return Type: String
    * Description: Returns a greeting that includes the person's name
    *         as well as the day period. For example:
    *        "Good evening, Beth Kane. Lovely to see you."
    * Tip: Try using the String.format method for string interpolation in Java.
    */
    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        Date date = new Date();
        String response = String.format("Hello %s, Good %s",name, dayPeriod);
        return response;
        //return "place holder for guest greeting return string";
    }
    /* 
    * Inputs: None
    * Return Type: String
    * Description: Returns a polite announcement of the current date.
    */
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "It is currently " + date;
        //return "place holder for date announcement return string";
    }
    
    /*********************************************
    Final Challenge!
    Alfred is listening. Write a method that accepts any string of conversation. 
    If "Alexis" appears in the conversation return a snarky response, such as:
    "Right away, sir. She certainly isn't sophisticated enough for that." 
    
    If "Alfred" is in the conversation return an obliging response, for example: 
    "At your service. As you wish, naturally." 
    
    If neither name is found, return an appropriate response, for instance:
    "Right. And with that I shall retire." 
    **********************************************/
    /*
    * Inputs: String (A conversation)
    * Return Type: String (Something Alfred would say in response)
    * 
    * Tip: Use the indexOf String method
    */
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE 
        //return "place holder for snarky response return string";
        if(conversation.indexOf("Alexis")>-1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if(conversation.indexOf("Alfred")>-1){
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }

    // NINJA BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
    public String yell(String phrase) {
        phrase = phrase.toUpperCase();
        return phrase;
    }

}

