import java.net.http.HttpRequest;
import java.net.URI;
//wrapper for the game power giveaway api
class Api {
    //static class to get pc giveaways
    public static String LivePC() {
	HttpRequest req = HttpRequest.newBuilder().uri(new URI("https://gamerpower.com/api/giveaways?platform=pc")).GET();
	System.out.println(req);
	return "test";
    } 
}
