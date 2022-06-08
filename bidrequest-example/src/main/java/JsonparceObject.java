import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

public class JsonparceObject {
	 public static void main(String[] args) throws InterruptedException{
		 		
		 
	        String json = "";
	       try { 
	        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\advan\\eclipse-workspace\\bidrequest-example\\src\\main\\java\\newBidRequest.json"));
	        
	        String linea = "";
	        while ((linea = br.readLine()) != null){
	        	json += linea;
	        }
	        
	        br.close();
	        
	        
	        } catch(FileNotFoundException ex) {
	    	   Logger.getLogger(JsonparceObject.class.getName()).log(Level.SEVERE, null, ex);
	       } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       
	       
	       
	      JsonParser parser = new JsonParser();
	      JsonObject jsonEl = parser.parse(json).getAsJsonObject();
	      String id = jsonEl.get("id").getAsString(); 
	      JsonArray jsonArrImp = jsonEl.getAsJsonObject().getAsJsonArray("imp");
	      JsonObject jsonSite = jsonEl.getAsJsonObject().getAsJsonObject("site");
	      JsonObject jsonPublisher = jsonSite.getAsJsonObject().getAsJsonObject("publisher");
	      JsonObject extPublisher = jsonPublisher.getAsJsonObject().getAsJsonObject("ext");
	      JsonObject jsonContent = jsonSite.getAsJsonObject().getAsJsonObject("content");
	      JsonObject jsonExtSite = jsonSite.getAsJsonObject().getAsJsonObject("ext");
	      JsonObject jsonDevice = jsonEl.getAsJsonObject().getAsJsonObject("device");
	      JsonObject jsonGeo = jsonDevice.getAsJsonObject().getAsJsonObject("geo");
	      JsonObject jsonExtDevice = jsonDevice.getAsJsonObject().getAsJsonObject("ext");
	      JsonObject jsonUserAgentExtDevice = jsonExtDevice.getAsJsonObject().getAsJsonObject("user_agent_data");
	      JsonObject jsonBrowserUserAgent = jsonUserAgentExtDevice.getAsJsonObject().getAsJsonObject("browser");
	      JsonObject jsonPlatformUserAgent = jsonUserAgentExtDevice.getAsJsonObject().getAsJsonObject("platform");
	      JsonObject jsonUser = jsonEl.getAsJsonObject().getAsJsonObject("user");
	      JsonObject jsonExtUser = jsonUser.getAsJsonObject().getAsJsonObject("ext");
	      JsonObject jsonSource = jsonEl.getAsJsonObject().getAsJsonObject("source");
	      JsonObject jsonExtSource = jsonSource.getAsJsonObject().getAsJsonObject("ext");
	      JsonObject jsonSchainExtSource = jsonExtSource.getAsJsonObject().getAsJsonObject("schain");
	      JsonObject jsonExt = jsonEl.getAsJsonObject().getAsJsonObject("ext");
	      
	      
	      
	      
	      
	      
	      Gson gson = new Gson();
	        BidRequest request = gson.fromJson(jsonEl, BidRequest.class);
	        Site site = gson.fromJson(jsonSite, Site.class);
	        Publisher publisher = gson.fromJson(jsonPublisher, Publisher.class);
	        ExtPublisher extPublish = gson.fromJson(extPublisher, ExtPublisher.class);
	        Content content = gson.fromJson(jsonContent, Content.class);
	        ExtSite extSite = gson.fromJson(jsonExtSite, ExtSite.class);
	        Device device = gson.fromJson(jsonDevice, Device.class);
	        Geo geo = gson.fromJson(jsonGeo, Geo.class);
	        ExtDevice extDevice = gson.fromJson(jsonExtDevice, ExtDevice.class);
	        User_agent_data userExtDevice = gson.fromJson(jsonUserAgentExtDevice, User_agent_data.class);
	        Browser browser = gson.fromJson(jsonBrowserUserAgent, Browser.class);
	        Platform platform = gson.fromJson(jsonPlatformUserAgent, Platform.class);
	        User user = gson.fromJson(jsonUser, User.class);
	        ExtUser extUser = gson.fromJson(jsonExtUser, ExtUser.class);
	        Source source = gson.fromJson(jsonSource, Source.class);
	        ExtSource extSource = gson.fromJson(jsonExtSource, ExtSource.class);
	        Schain schain = gson.fromJson(jsonSchainExtSource, Schain.class);
	        Ext ext = gson.fromJson(jsonExt, Ext.class);
	        publisher.setExt(extPublish);
	        site.setContent(content);
	        site.setPublisher(publisher);
	        site.setExt(extSite);
	        request.setSite(site);
	        userExtDevice.setBrowser(browser);
	        userExtDevice.setPlatform(platform);
	        extDevice.setUser_agent_data(userExtDevice);
	        device.setGeo(geo);
	        device.setExt(extDevice);
	        user.setExt(extUser);
	        extSource.setSchain(schain);
	        source.setExt(extSource);
	        request.setDevice(device);
	        request.setUser(user);
	        request.setSource(source);
	        request.setExt(ext);
	        
	        System.out.println(request);
	        
	        
	        
	        
	    }
}

