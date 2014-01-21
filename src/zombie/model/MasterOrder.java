package zombie.model;

import java.util.ArrayList;
import java.util.List;

public class MasterOrder
{
	private List<ZombieSurvivalOrder> orders;
	
	public MasterOrder()
	{
		orders = new ArrayList<ZombieSurvivalOrder>();
	}
	
	public void addOrder(ZombieSurvivalOrder theOrder)
	{
		orders.add(theOrder);
	}
	
	public int getTotalboxes()
	{
		return 77;
	}
	public int removeVariety
}
