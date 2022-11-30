import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting() {
        //Example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting (String name) {
        String greeting = String.format("Hey %s, howzit going?! It's great to see you!", name);
        return greeting;
    }

    public String dateAnnouncement() {
        Date date = new Date();
        String getDate = "Today is " + date;
        return getDate;
    }

    public String respondBeforeAlexis(String conversation) {
        String response = "";
        if (conversation.indexOf("Alexis") != -1) {
            response = "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        if (conversation.indexOf("Alfred") != -1) {
            response = "At your service. As you wish, naturally.";
        }
        else {
            response = "Right. And with that I shall retire.";
        }
        return response;
    }

}