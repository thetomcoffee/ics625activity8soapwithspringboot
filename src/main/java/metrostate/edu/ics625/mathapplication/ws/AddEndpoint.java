package metrostate.edu.ics625.mathapplication.ws;


import edu.metro.ics625.generated.AddRequest;
import edu.metro.ics625.generated.AddResponse;
import edu.metro.ics625.generated.MultiplyRequest;
import edu.metro.ics625.generated.MultiplyResponse;
import edu.metro.ics625.generated.AbsRequest;
import edu.metro.ics625.generated.AbsResponse;
import edu.metro.ics625.generated.MaxRequest;
import edu.metro.ics625.generated.MaxResponse;
import java.util.List;
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
    res.setResult(mathService.add(n2, n2));
    return res;
  }

   @PayloadRoot(namespace=NS, localPart="multiplyRequest")
   @ResponsePayload
   public MultiplyResponse multiply(@RequestPayload MultiplyRequest req){
     int n1 = req.getN1();
     int n2 = req.getN2();
     MultiplyResponse res = new MultiplyResponse();
     res.setResult(mathService.multiple(n2, n2));
     return res;
   }
  
   @PayloadRoot(namespace=NS, localPart="absRequest")
   @ResponsePayload
   public AbsResponse absolute(@RequestPayload AbsRequest req){
     String n1 = req.getN1();
     AbsResponse res = new AbsResponse();
     res.setResult(mathService.absolute(n1));
     return res;
   }
   
   @PayloadRoot(namespace=NS, localPart="maxRequest")
   @ResponsePayload
   public MaxResponse max(@RequestPayload MaxRequest req){
     List<Integer> li = req.getN1();
     MaxResponse res = new MaxResponse();
     res.setResult(mathService.max(li));
     return res;
   }
}
