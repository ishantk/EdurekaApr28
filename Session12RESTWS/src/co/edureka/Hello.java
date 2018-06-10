package co.edureka;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// Configure ServletContainer in web.xml
// org.glassfish.jersey.servlet.ServletContainer

@Path("/Hello")
public class Hello {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello(){
		String response = "This is Awesome!!";
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello(){
		String response = "<html><body><h3>This is Awesome!!</h3></body></html>";
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){
		String response = "<?xml version='1.0'?><hello>This is Awesome!!</hello>";
		return response;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayJSONHello(){
		String response = "{'name':'John',age:30,'address':'Redwood Shores'}";
		return response;
	}
	
}
