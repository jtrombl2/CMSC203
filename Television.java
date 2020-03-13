/** 
*The purpose of this class is to model a television
*Janie Trombley, 3/13/2020
*/
public class Television {
	
	// 1. Declare instance fields
	final String MANUFACTURER;	// Holds brand name
	final int SCREEN_SIZE;		// Holds screen size
	private boolean powerOn;	// True if power on, false if power off
	private int channel;		// Holds value of station being shown
	private int volume;			// Represents loudness (0 = NONE)

	/**
	 * This is the constructor, which takes two arguments and initializes 
	 * the constant MANUFACTURER and SCREEN_SIZE variables,
	 * as well as sets initial values for the other three instance fields.
	 */
	public Television (String brand, int size)
	{
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
		
		powerOn = false;
		channel = 2;
		volume = 20;
	}
	
	/**
	 * This mutator method takes input from the user and uses it to set the value of channel.
	 * @param station
	 */
	public void setChannel(int station)
	{
		channel = station;
	}
	
	/**
	 * This accessor method returns the value of channel to the user.
	 * @return channel
	 */
	public int getChannel()
	{
		return channel;
	}
	
	/**
	 * This accessor method returns the value of volume to the user.
	 * @return volume
	 */
	public int getVolume()
	{
		return volume;
	}
	
	/**
	 * This accessor method returns the value of MANUFACTURER to the user.
	 * @return MANUFACTURER
	 */
	public String getManufacturer()
	{
		return MANUFACTURER;
	}
	
	/**
	 * This accessor method returns the value of SCREEN_SIZE.
	 * @return SCREEN_SIZE
	 */
	public int getScreenSize()
	{
		return SCREEN_SIZE;
	}
	
	/**
	 * This method switches the value of powerOn to the opposite of its original state.
	 */
	public void power()
	{
		powerOn = !powerOn;
	}
	
	/**
	 * This method increases the value of volume by 1.
	 */
	public void increaseVolume()
	{
		volume++;
	}
	
	/**
	 * This method decreases the value of volume by 1.
	 */
	public void decreaseVolume()
	{
		volume--;
	}
}
