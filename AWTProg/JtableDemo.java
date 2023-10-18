//table Scroolbar

import javax.swing
class JtableDemo extends JFrame
{
	JtableDemo("Table Demo");
	setSize(300,200);
	setLocation(250,250);
	
	String colHeads[] = {"Name","Phone","Fax"};
	
	String data[][] =
	{
		{"ABCD", "1234", "1112"},
		{"ABCD", "1234", "1112"},
		{"ABCD", "1234", "1112"},
		{"ABCD", "1234", "1112"},
		{"ABCD", "1234", "1112"},
		{"ABCD", "1234", "1112"},
		{"ABCD", "1234", "1112"},
		{"ABCD", "1234", "1112"},
		{"ABCD", "1234", "1112"},
		{"ABCD", "1234", "1112"},
		{"ABCD", "1234", "1112"}
	
		JTable table = new JTable(data,colHeads);
		add(table);
		table.setEnabled(false);
	
	
}