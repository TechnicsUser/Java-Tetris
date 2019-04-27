/*******************************************************************************
|	Copyright 2016	Stephen Smith. All rights reserved.                    |
*******************************************************************************/

/*
 * Author: Stephen Smith
 * File: Alarmable.java
 * Purpose: All class's that want to recive alarm events need to implement this
 * Created on: 6 December 2016, 10:58
 */
package timer;

public interface Alarmable {
    public void timesUp(TimerEvent Event);   
}
