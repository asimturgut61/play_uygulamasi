package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index(String OY) {
    	if(OY!=null)
    	 new User(OY).save();
    	//render(user);
    		
    //	List users = User.find("select u.OY from User u where u.OY like ?", OY).fetch();
    	//List<User> users = User.findAll();
    	int chp=User.find("select u.OY from User u Where u.OY like ?", "CHP").fetch().size();
    	int akp=User.find("select u.OY from User u Where u.OY like ?", "AKP").fetch().size();
    	int mhp=User.find("select u.OY from User u Where u.OY like ?", "MHP").fetch().size();
    	int diger=User.find("select u.OY from User u Where u.OY like ?", "DIGER").fetch().size();
    	//int a= User.findAll().size();
    	int [] dizi=new int[4] ;
    	dizi[0]=chp;
    	dizi[1]=akp;
    	dizi[2]=mhp;
    	dizi[3]=diger;
    	render(dizi);
    }
    
    public static void CreateUser(String OY){
    	User user = new User(OY).save();
    	render(user);
    	
    }
    
    }

