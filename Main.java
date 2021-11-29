package beaty;

import java.awt.EventQueue;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Main: This is the controller that constructs the application window (containing layout views),
 * creates events, and instantiates a SalesSlip object.
 */

public class Main {

	private JFrame frame;
	private JTextField itemName;
	private JTextField itemPrice;
	private JTextField itemQuantity;
	private String updatedList = "";

	private SalesSlip things = new SalesSlip();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		itemName = new JTextField();
		itemName.setBounds(200, 40, 185, 20);
		frame.getContentPane().add(itemName);
		itemName.setColumns(10);
		
		Label nameLabel = new Label("Enter the name of the item:");
		nameLabel.setAlignment(Label.CENTER);
		nameLabel.setBounds(-80, 40, 414, 22);
		frame.getContentPane().add(nameLabel);
		
		itemPrice = new JTextField();
		itemPrice.setBounds(200, 80, 185, 20);
		frame.getContentPane().add(itemPrice);
		itemPrice.setColumns(10);
		
		Label priceLabel = new Label("Enter the price of the item:");
		priceLabel.setAlignment(Label.CENTER);
		priceLabel.setBounds(-80, 80, 414, 22);
		frame.getContentPane().add(priceLabel);
		
		itemQuantity = new JTextField();
		itemQuantity.setBounds(200, 120, 185, 20);
		frame.getContentPane().add(itemQuantity);
		itemQuantity.setColumns(10);
		
		Label quantityLabel = new Label("Enter the quantity of the item:");
		quantityLabel.setAlignment(Label.CENTER);
		quantityLabel.setBounds(-85, 120, 414, 22);
		frame.getContentPane().add(quantityLabel);
		
		JButton addAnItem = new JButton("Add Item to Shopping List");
		addAnItem.setBounds(150, 160, 185, 20);
		frame.getContentPane().add(addAnItem);
		
		JButton displayTotal = new JButton("Get Final Total");
		displayTotal.setBounds(150, 200, 185, 20);
		frame.getContentPane().add(displayTotal);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(150, 240, 185, 100);
		frame.getContentPane().add(textArea);
		
		textArea.setText("Name should be a String.\nPrice should be a double.\nQuantity should be an integer.");
		
		addAnItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create the sales item to add to the list things
				SalesItem sI = new SalesItem(itemName.getText(), Double.parseDouble(itemPrice.getText()), Integer.parseInt(itemQuantity.getText()));
				things.add(sI);
				updatedList += sI.toString() + "\n";
				textArea.setText(updatedList);
			}
		});
		
		displayTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//diplay the total into the textArea
				textArea.setText("TOTAL: \t$" + things.getTotal());
			}
		});
	}

}
