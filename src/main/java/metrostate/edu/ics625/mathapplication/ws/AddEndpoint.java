package metrostate.edu.ics625.mathapplication.ws;


import edu.metro.ics625.generated.AddRequest;
import edu.metro.ics625.generated.AddResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class AddEndpoint {

  public static final String NS = "http://metrostate.edu/ics625";
  
  @Autowired
  private MathService mathService;
  
  
  @PayloadRoot(namespace=NS, localPart="addRequest")
  @ResponsePayload
  public AddResponse add(@RequestPayload AddRequest req){
    int n1 = req.getN1();
    int n2 = req.getN2();
    AddResponse res = new AddResponse();
    res.setResult(n1+n2);
    return res;
  }

}
