
package com.github.tsfans.lc4e.handlers;

import org.eclipse.e4.core.di.annotations.Execute;

public class RefreshHandler {

    @Execute
    public void execute() {
        System.out.println((this.getClass().getSimpleName() + " called"));
    }

}