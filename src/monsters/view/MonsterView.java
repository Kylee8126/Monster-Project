package monsters.view;

import javax.swing.JOptionPane;

import monsters.controller.MonsterAppController;

public class MonsterView
{
	private MonsterAppController baseController;
	
	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController;
	}
	
	
	public void displayInformation()
	{
		JOptionPane.showMessageDialog(null,"I made this monster");
		JOptionPane.showMessageDialog(null,"It's name is " + baseController.getMyMonster().getName());
		JOptionPane.showMessageDialog(null, "Not just " + baseController.getMyMonster().getName());
		JOptionPane.showMessageDialog(null, "He is the Approachable " + baseController.getMyMonster().getName());
		JOptionPane.showMessageDialog(null, "He has " + baseController.getMyMonster().getNumberOfLegs() + " legs");
		JOptionPane.showMessageDialog(null, "Also he has " + baseController.getMyMonster().getHairCount() + " hair.");
		JOptionPane.showMessageDialog(null, "I also made this other monster");
		JOptionPane.showMessageDialog(null,"His name is " + baseController.getOtherMonster().getName());
		
	}
}
