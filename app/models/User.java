package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class User extends Model {
	
	public String OY;
	
	
	public User(String OY) {
		super();
		this.OY=OY;
		}

}
