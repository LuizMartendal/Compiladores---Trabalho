package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Application {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
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
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setMinimumSize(new Dimension(910, 600));
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.75);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		JPanel upPanel = new JPanel();
		splitPane.setLeftComponent(upPanel);
		upPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneEditor = new JScrollPane();
		upPanel.add(scrollPaneEditor, BorderLayout.CENTER);
		scrollPaneEditor.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneEditor.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JTextArea textAreaEditor = new JTextArea();
		scrollPaneEditor.setViewportView(textAreaEditor);
		
		JToolBar barraDeFerramentas = new JToolBar();
		barraDeFerramentas.setPreferredSize(new Dimension(900, 70));
		upPanel.add(barraDeFerramentas, BorderLayout.NORTH);
		
		JPanel downPanel = new JPanel();
		splitPane.setRightComponent(downPanel);
		downPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneMessages = new JScrollPane();
		downPanel.add(scrollPaneMessages, BorderLayout.CENTER);
		scrollPaneMessages.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneMessages.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JTextArea textAreaMessages = new JTextArea();
		textAreaMessages.setEditable(false);
		scrollPaneMessages.setViewportView(textAreaMessages);
		
		JPanel status = new JPanel();
		status.setMinimumSize(new Dimension(900, 25));
		status.setPreferredSize(new Dimension(900, 25));
		downPanel.add(status, BorderLayout.SOUTH);
		frame.setMinimumSize(new Dimension(910, 600));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
