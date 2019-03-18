package Legato;

public class NameInvalidException extends Exception {
	String msg;
	NameInvalidException(String msg){
		super();
		this.msg=msg;
	}
@Override
public String getMessage()
{
	System.out.println("inside get message");
	return msg;
	
}
}
