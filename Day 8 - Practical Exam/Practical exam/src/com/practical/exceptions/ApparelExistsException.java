package com.practical.exceptions;
/**
 * 
 * @author Yerramsetti Suchit
 * 
 * @purpose the class throws exception if apparel exist
 *
 */
public class ApparelExistsException extends Exception {
	@Override
	public String toString() {
		return "ApparelExistsException";
	}
}
