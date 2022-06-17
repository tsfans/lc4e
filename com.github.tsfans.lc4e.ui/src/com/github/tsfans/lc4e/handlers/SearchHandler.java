 
package com.github.tsfans.lc4e.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;

public class SearchHandler {
    
	@Execute
	public void execute() {
	    System.out.println((this.getClass().getSimpleName() + " called"));
	}
	
	
	@CanExecute
	public boolean canExecute() {
		
		return true;
	}
		
}