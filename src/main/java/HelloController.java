import jakarta.inject.Inject;
import jakarta.mvc.Controller;
import jakarta.mvc.Models;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/hello")
@Controller
public class HelloController {

    @Inject
    private Models models;

    @GET
    public String hello(
            @QueryParam("name")
            @DefaultValue("World") String name) {

        models.put("name", name);
        System.out.println("Controller");

        return "hello.jsp";
    }
}