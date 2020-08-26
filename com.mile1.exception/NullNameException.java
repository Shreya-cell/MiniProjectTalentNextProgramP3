package com.mile1.exception;
/*------class for null name exception-------*/
public class NullNameException extends Exception {
	
	public String toString() {				//override toString() method
		return "name is null";
	}
}
