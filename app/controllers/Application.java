package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	
    	if(User.count() == 0){
    		new User(true,true,true,true).save();
    		new User(true,true,false,true).save();
    		}
    
    		
    	List users = User.findAll();
    	
    	render(users);
    		}
    
    public static void CreateUser(boolean AKP, boolean CHP,boolean MHP,boolean DIGER){
    	User user = new User(AKP, CHP,MHP, DIGER).save();
    	renderJSON(user);
    	
    }
    
    }

