/*******************************************************************************
|	Copyright 2016	Stephen Smith. All rights reserved.                    |
*******************************************************************************/

/*
 * Author: Stephen Smith
 * File: Timer.java
 * Purpose: Timer event..
 * Created on: 6 December 2016, 16:32
 */

package timer;

public class TimerEvent {
    private Object source; 
    
    /** Creates a new instance of TimerEvent */
    public TimerEvent( Object source) {
        this.source = source;
    }
    
    public Object getSource(){
        return this.source;
    } 
    
}
