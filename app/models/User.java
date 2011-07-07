package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class User extends Model {
	
	public boolean AKP;
	public boolean CHP;
	public boolean MHP;
	public boolean DIGER;
	
	public User(boolean AKP, boolean CHP,boolean MHP,boolean DIGER) {
		super();
		this.AKP=AKP;
		this.CHP=CHP;
		this.MHP=MHP;
		this.DIGER=DIGER;
		}

}
