import java.net.URI;
import java.net.URISyntaxException;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

public class Caller {
    // Get your Account SID and Auth Token from https://twilio.com/console
    // To set up environment variables, see http://twil.io/secure
 

    public static void call(String num) throws URISyntaxException {
        String ACCOUNT_SID = "AC6b1a3517248b2e82df70c50bc23a99ad";
        String AUTH_TOKEN = "3e116bd7cd71acf17733a13f32aa07d2";
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        String from = num;
        String to = "+12508084951";

        Call call = Call.creator(new PhoneNumber(to), new PhoneNumber(from),
                new URI("http://demo.twilio.com/docs/voice.xml")).create();

        System.out.println(call.getSid());
    }
}