package my.group.contacts.db.model;

import com.venky.swf.db.annotations.column.COLUMN_SIZE;
import com.venky.swf.db.annotations.column.UNIQUE_KEY;
import com.venky.swf.db.annotations.column.validations.ExactLength;
import com.venky.swf.db.annotations.column.validations.RegEx;
import com.venky.swf.db.annotations.model.MENU;
import com.venky.swf.db.model.Model;
@MENU("Manage") //Show contacts menu item under Menu -> Manage
public interface Contact extends Model{
	@UNIQUE_KEY
	public String getName();
	public void setName(String sName);

	@COLUMN_SIZE(13)
	@RegEx("\\+[0-9]+") //Ensures that it starts with + and all other characters are numbers.
	@ExactLength(13) // Ensures that user types in 13 characters in all in a phone field.
	public String getPhoneNumber();
	public void setPhoneNumber(String phonenumber);

	@UNIQUE_KEY
	public Integer getCityId();
	public void setCityId(Integer id);
	public City getCity();

}
