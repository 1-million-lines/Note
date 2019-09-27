import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NoteFrame extends JFrame {
	private MenuBar menuBar = new MenuBar();
	private MenuItem menuOpen;
	private MenuItem menuSave;
	private MenuItem menuExit;
	private MenuItem menuAbout;
	private JTextArea theText;

	public NoteFrame() {
		super("Note");
		initMenu();
		initMainPanel();
		initListeners();
	}

	private void initMenu() {
		PopupMenu fileMenu = new PopupMenu("File");
		PopupMenu helpMenu = new PopupMenu("Help");

		menuOpen = new MenuItem("Open", new MenuShortcut(KeyEvent.VK_O));
		menuSave = new MenuItem("Save", new MenuShortcut(KeyEvent.VK_S));
		menuExit = new MenuItem("Exit", new MenuShortcut(KeyEvent.VK_X));
		menuAbout = new MenuItem("About", new MenuShortcut(KeyEvent.VK_A));

		fileMenu.add(menuOpen);
		fileMenu.add(menuSave);
		fileMenu.add(menuExit);

		helpMenu.add(menuAbout);

		menuBar.add(fileMenu);
		menuBar.add(helpMenu);
		this.setMenuBar(menuBar);
	}

	private void initMainPanel() {
		JPanel panel = new JPanel(new BorderLayout());
		theText = new JTextArea();
		panel.add(new JScrollPane(theText), BorderLayout.CENTER);
		getContentPane().add(panel);
	}

	private void initListeners() {
		this.addWindowListener(new WindowAdapter() {
			public void WindowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		menuAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {}
		});

		menuExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		menuSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {}
		});

		menuOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {}
		});
	}
}