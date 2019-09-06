package my.group.contacts.db.model;

import java.util.List;

import com.venky.swf.db.annotations.column.UNIQUE_KEY;
import com.venky.swf.db.annotations.model.MENU;
import com.venky.swf.db.model.Model;
@MENU("Manage") //Show City menuitem under Menu -> Manage
public interface City extends Model {
	@UNIQUE_KEY
	public String getName();
	public void setName(String sName);

	public List<Contact> getContacts();
}
