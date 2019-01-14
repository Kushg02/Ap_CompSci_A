
/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class ClockDisplay
{
    public NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String amPm;
    private String displayString;    // simulates the actual display
    
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        amPm = "am";
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int hour, int minute, int second)
    {
        amPm = "am";
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setTime(hour, minute, second);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        seconds.increment();
        if(seconds.getValue()==0){
            minutes.increment();
            if(minutes.getValue() == 0) {  // it just rolled over!
                hours.increment();
                if(hours.getValue() == 0)               
                    amPm = amPm.equals("pm") ? "am" : "pm";
            }
            updateDisplay();
        }
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute, int second)
    {
        if(hour>12)
            amPm = "pm";
        hours.setValue(hour % 12);
        minutes.setValue(minute);
        seconds.setValue(second);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }
    public String hourConversion()
    {
        if (hours.getDisplayValue().equals("00")){
             return "12";
            }
        return hours.getHourDisplayValue();      
    }
    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        displayString = hourConversion() + ":" + minutes.getDisplayValue() + ":" + seconds.getDisplayValue() + " " + amPm;
    }
}
