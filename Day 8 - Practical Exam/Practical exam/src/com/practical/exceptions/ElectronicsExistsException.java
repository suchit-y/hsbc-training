package com.practical.exceptions;
/**
 * 
 * @author Yerramsetti Suchit
 * 
 * @purpose the class throws exception if electronics exist
 *
 */
public class ElectronicsExistsException extends Exception {
	@Override
	public String toString() {
		return "ElectronicsExistsException";
	}
}
