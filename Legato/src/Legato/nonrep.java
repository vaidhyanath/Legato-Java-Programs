package Legato;

public class nonrep {
	    public static void main(String[] args) {

	        String s = "iiht";
	        for(Character ch:s.toCharArray()) {
	            if(s.indexOf(ch) == s.lastIndexOf(ch)) {
	                System.out.println(ch);
	                break;
	            }
	        }
	    }
	}