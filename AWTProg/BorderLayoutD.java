// Border Layouts
/*
1. FlowLayout
2. NullLayout
3. BoxLayout
4. GridLayout
5. BorderLayou6.
*/

import java.awt.*;

class BorderLayoutD extends Frame 
{
		BorderLayoutD()
		{
			setSize(400,400);
			setLayout(new BorderLayout());
			
			add(new Button("This is accross a top"), BorderLayout.NORTH);
			add(new Label("The footer msg"),BorderLayout.SOUTH);
			add(new Button("Right"), BorderLayout.EAST);
			add(new Button("Left"), BorderLayout.WEST);
			String msg = "aaaaaaaaaaaaaaaaaaaaaaaaaaaa \n"+
							"aaaaaaaaaaaaaaaaaaaaaaaaaaaa \n"+
							"aaaaaaaaaaaaaaaaaaaaaaaaaaaa \n"+
							"aaaaaaaaaaaaaaaaaaaaaaaaaaaa \n"+
							
			add(new TextArea(msg), BorderLayout.CENTER);
			setVisible(true);
		}
		
		
		public static void main(String args[])
		{
			new BorderLayoutD();
		}
	
}
	