import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BidRequest {
	 private String id;
	 ArrayList < Object > imp = new ArrayList < Object > ();
	 Site SiteObject;
	 Device DeviceObject;
	 User UserObject;
	 private float at;
	 private float tmax;
	 ArrayList < Object > cur = new ArrayList < Object > ();
	 ArrayList < Object > bcat = new ArrayList < Object > ();
	 Source SourceObject;
	 Ext ExtObject;


	 // Getter Methods 

	 @Override
	public String toString() {
		return "BidRequest [id=" + id + ", imp=" + imp + ", SiteObject=" + SiteObject + ", DeviceObject=" + DeviceObject
				+ ", UserObject=" + UserObject + ", at=" + at + ", tmax=" + tmax + ", cur=" + cur + ", bcat=" + bcat
				+ ", SourceObject=" + SourceObject + ", ExtObject=" + ExtObject + "]";
	}

	public String getId() {
	  return id;
	 }

	 public Site getSite() {
	  return SiteObject;
	 }

	 public Device getDevice() {
	  return DeviceObject;
	 }

	 public User getUser() {
	  return UserObject;
	 }

	 public float getAt() {
	  return at;
	 }

	 public float getTmax() {
	  return tmax;
	 }

	 public Source getSource() {
	  return SourceObject;
	 }

	 public Ext getExt() {
	  return ExtObject;
	 }

	 // Setter Methods 

	 public void setId(String id) {
	  this.id = id;
	 }

	 public void setSite(Site siteObject) {
	  this.SiteObject = siteObject;
	 }

	 public void setDevice(Device deviceObject) {
	  this.DeviceObject = deviceObject;
	 }

	 public void setUser(User userObject) {
	  this.UserObject = userObject;
	 }

	 public void setAt(float at) {
	  this.at = at;
	 }

	 public void setTmax(float tmax) {
	  this.tmax = tmax;
	 }

	 public void setSource(Source sourceObject) {
	  this.SourceObject = sourceObject;
	 }

	 public void setExt(Ext extObject) {
	  this.ExtObject = extObject;
	 }
	}
 class Ext {
	 ArrayList < Object > bid_feedback = new ArrayList < Object > ();
	 private String google_query_id;


	 // Getter Methods 

	 @Override
	public String toString() {
		return "Ext [bid_feedback=" + bid_feedback + ", google_query_id=" + google_query_id + "]";
	}

	public String getGoogle_query_id() {
	  return google_query_id;
	 }

	 // Setter Methods 

	 public void setGoogle_query_id(String google_query_id) {
	  this.google_query_id = google_query_id;
	 }
	}
 class Source {
	 ExtSource ExtSource;


	 // Getter Methods 

	 @Override
	public String toString() {
		return "Source [ExtSource=" + ExtSource + "]";
	}

	public ExtSource getExt() {
	  return ExtSource;
	 }

	 // Setter Methods 

	 public void setExt(ExtSource extObject) {
	  this.ExtSource = extObject;
	 }
	}
 class ExtSource {
	 Schain SchainObject;


	 // Getter Methods 

	 @Override
	public String toString() {
		return "ExtSource [SchainObject=" + SchainObject + "]";
	}

	public Schain getSchain() {
	  return SchainObject;
	 }

	 // Setter Methods 

	 public void setSchain(Schain schainObject) {
	  this.SchainObject = schainObject;
	 }
	}
	class Schain {
	 private float complete;
	 ArrayList < Object > nodes = new ArrayList < Object > ();
	 private String ver;


	 // Getter Methods 

	 @Override
	public String toString() {
		return "Schain [complete=" + complete + ", nodes=" + nodes + ", ver=" + ver + "]";
	}

	public float getComplete() {
	  return complete;
	 }

	 public String getVer() {
	  return ver;
	 }

	 // Setter Methods 

	 public void setComplete(float complete) {
	  this.complete = complete;
	 }

	 public void setVer(String ver) {
	  this.ver = ver;
	 }
	}
class User {
	 private String id;
	 private String buyeruid;
	 private String customdata;
	 ExtUser ExtObject;


	 // Getter Methods 

	 @Override
	public String toString() {
		return "User [id=" + id + ", buyeruid=" + buyeruid + ", customdata=" + customdata + ", ExtObject=" + ExtObject
				+ "]";
	}

	public String getId() {
	  return id;
	 }

	 public String getBuyeruid() {
	  return buyeruid;
	 }

	 public String getCustomdata() {
	  return customdata;
	 }

	 public ExtUser getExt() {
	  return ExtObject;
	 }

	 // Setter Methods 

	 public void setId(String id) {
	  this.id = id;
	 }

	 public void setBuyeruid(String buyeruid) {
	  this.buyeruid = buyeruid;
	 }

	 public void setCustomdata(String customdata) {
	  this.customdata = customdata;
	 }

	 public void setExt(ExtUser extObject) {
	  this.ExtObject = extObject;
	 }
	}
 class ExtUser {

	@Override
	public String toString() {
		return "ExtUser []";
	}


	 // Getter Methods 



	 // Setter Methods 


	}
 class Device {
	 private String ua;
	 private String ip;
	 Geo GeoObject;
	 private String os;
	 private float devicetype;
	 private float lmt;
	 private float pxratio;
	 ExtDevice ExtObject;


	 // Getter Methods 

	 @Override
	public String toString() {
		return "Device [ua=" + ua + ", ip=" + ip + ", GeoObject=" + GeoObject + ", os=" + os + ", devicetype="
				+ devicetype + ", lmt=" + lmt + ", pxratio=" + pxratio + ", ExtObject=" + ExtObject + "]";
	}

	public String getUa() {
	  return ua;
	 }

	 public String getIp() {
	  return ip;
	 }

	 public Geo getGeo() {
	  return GeoObject;
	 }

	 public String getOs() {
	  return os;
	 }

	 public float getDevicetype() {
	  return devicetype;
	 }

	 public float getLmt() {
	  return lmt;
	 }

	 public float getPxratio() {
	  return pxratio;
	 }

	 public ExtDevice getExt() {
	  return ExtObject;
	 }

	 // Setter Methods 

	 public void setUa(String ua) {
	  this.ua = ua;
	 }

	 public void setIp(String ip) {
	  this.ip = ip;
	 }

	 public void setGeo(Geo geoObject) {
	  this.GeoObject = geoObject;
	 }

	 public void setOs(String os) {
	  this.os = os;
	 }

	 public void setDevicetype(float devicetype) {
	  this.devicetype = devicetype;
	 }

	 public void setLmt(float lmt) {
	  this.lmt = lmt;
	 }

	 public void setPxratio(float pxratio) {
	  this.pxratio = pxratio;
	 }

	 public void setExt(ExtDevice extObject) {
	  this.ExtObject = extObject;
	 }
	}
	 class ExtDevice {
	 User_agent_data User_agent_dataObject;


	 // Getter Methods 

	 @Override
	public String toString() {
		return "ExtDevice [User_agent_dataObject=" + User_agent_dataObject + "]";
	}

	public User_agent_data getUser_agent_data() {
	  return User_agent_dataObject;
	 }

	 // Setter Methods 

	 public void setUser_agent_data(User_agent_data user_agent_dataObject) {
	  this.User_agent_dataObject = user_agent_dataObject;
	 }
	}
 class User_agent_data {
	 Browser BrowserObject;
	 Platform PlatformObject;
	 private boolean mobile;


	 // Getter Methods 

	 @Override
	public String toString() {
		return "User_agent_data [BrowserObject=" + BrowserObject + ", PlatformObject=" + PlatformObject + ", mobile="
				+ mobile + "]";
	}

	public Browser getBrowser() {
	  return BrowserObject;
	 }

	 public Platform getPlatform() {
	  return PlatformObject;
	 }

	 public boolean getMobile() {
	  return mobile;
	 }

	 // Setter Methods 

	 public void setBrowser(Browser browserObject) {
	  this.BrowserObject = browserObject;
	 }

	 public void setPlatform(Platform platformObject) {
	  this.PlatformObject = platformObject;
	 }

	 public void setMobile(boolean mobile) {
	  this.mobile = mobile;
	 }
	}
 class Platform {
	 private String brand;
	 ArrayList < Object > version = new ArrayList < Object > ();


	 // Getter Methods 

	 @Override
	public String toString() {
		return "Platform [brand=" + brand + ", version=" + version + "]";
	}

	public String getBrand() {
	  return brand;
	 }

	 // Setter Methods 

	 public void setBrand(String brand) {
	  this.brand = brand;
	 }
	}
 class Browser {
	 private String brand;
	 ArrayList < Object > version = new ArrayList < Object > ();


	 // Getter Methods 

	 @Override
	public String toString() {
		return "Browser [brand=" + brand + ", version=" + version + "]";
	}

	public String getBrand() {
	  return brand;
	 }

	 // Setter Methods 

	 public void setBrand(String brand) {
	  this.brand = brand;
	 }
	}
 class Geo {
	 private float lat;
	 private float lon;
	 private String country;
	 private String region;
	 private String metro;
	 private String city;
	 private String zip;


	 // Getter Methods 

	 @Override
	public String toString() {
		return "Geo [lat=" + lat + ", lon=" + lon + ", country=" + country + ", region=" + region + ", metro=" + metro
				+ ", city=" + city + ", zip=" + zip + "]";
	}

	public float getLat() {
	  return lat;
	 }

	 public float getLon() {
	  return lon;
	 }

	 public String getCountry() {
	  return country;
	 }

	 public String getRegion() {
	  return region;
	 }

	 public String getMetro() {
	  return metro;
	 }

	 public String getCity() {
	  return city;
	 }

	 public String getZip() {
	  return zip;
	 }

	 // Setter Methods 

	 public void setLat(float lat) {
	  this.lat = lat;
	 }

	 public void setLon(float lon) {
	  this.lon = lon;
	 }

	 public void setCountry(String country) {
	  this.country = country;
	 }

	 public void setRegion(String region) {
	  this.region = region;
	 }

	 public void setMetro(String metro) {
	  this.metro = metro;
	 }

	 public void setCity(String city) {
	  this.city = city;
	 }

	 public void setZip(String zip) {
	  this.zip = zip;
	 }
	}
 class Site {
	 private String page;
	 Publisher PublisherObject;
	 Content ContentObject;
	 ExtSite ExtObject;


	 // Getter Methods 

	 @Override
	public String toString() {
		return "Site [page=" + page + ", PublisherObject=" + PublisherObject + ", ContentObject=" + ContentObject
				+ ", ExtObject=" + ExtObject + "]";
	}

	public String getPage() {
	  return page;
	 }

	 public Publisher getPublisher() {
	  return PublisherObject;
	 }

	 public Content getContent() {
	  return ContentObject;
	 }

	 public ExtSite getExt() {
	  return ExtObject;
	 }

	 // Setter Methods 

	 public void setPage(String page) {
	  this.page = page;
	 }

	 public void setPublisher(Publisher publisherObject) {
	  this.PublisherObject = publisherObject;
	 }

	 public void setContent(Content contentObject) {
	  this.ContentObject = contentObject;
	 }

	 public void setExt(ExtSite extObject) {
	  this.ExtObject = extObject;
	 }
	}
 class ExtSite {
	 private float amp;
	 private float page_visibility;


	 // Getter Methods 

	 @Override
	public String toString() {
		return "ExtSite [amp=" + amp + ", page_visibility=" + page_visibility + "]";
	}

	public float getAmp() {
	  return amp;
	 }

	 public float getPage_visibility() {
	  return page_visibility;
	 }

	 // Setter Methods 

	 public void setAmp(float amp) {
	  this.amp = amp;
	 }

	 public void setPage_visibility(float page_visibility) {
	  this.page_visibility = page_visibility;
	 }
	}
 class Content {
	 private float livestream;
	 private String language;


	 // Getter Methods 

	 @Override
	public String toString() {
		return "Content [livestream=" + livestream + ", language=" + language + "]";
	}

	public float getLivestream() {
	  return livestream;
	 }

	 public String getLanguage() {
	  return language;
	 }

	 // Setter Methods 

	 public void setLivestream(float livestream) {
	  this.livestream = livestream;
	 }

	 public void setLanguage(String language) {
	  this.language = language;
	 }
	}
 class Publisher {
	 private String id;
	 ExtPublisher ExtObject;


	 // Getter Methods 

	 @Override
	public String toString() {
		return "Publisher [id=" + id + ", ExtObject=" + ExtObject + "]";
	}

	public String getId() {
	  return id;
	 }

	 public ExtPublisher getExt() {
	  return ExtObject;
	 }

	 // Setter Methods 

	 public void setId(String id) {
	  this.id = id;
	 }

	 public void setExt(ExtPublisher extObject) {
	  this.ExtObject = extObject;
	 }

	}
 class ExtPublisher {
	 private String country;


	 // Getter Methods 

	 @Override
	public String toString() {
		return "ExtPublisher [country=" + country + "]";
	}

	public String getCountry() {
	  return country;
	 }

	 // Setter Methods 

	 public void setCountry(String country) {
	  this.country = country;
	 }
}

