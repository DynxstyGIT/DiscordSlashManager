package dev.dynxsty.slashmanager;

import com.formdev.flatlaf.FlatDarculaLaf;
import dev.dynxsty.slashmanager.pages.InputTokenPage;

import javax.swing.*;
import java.awt.*;

public class Main {
	private final JFrame frame;

	public Main() {
		frame = new JFrame("DiscordSlashManager");
		frame.setSize(new Dimension(500, 500));
		// TODO: Consider changing this to 'false'.
		frame.setResizable(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLocationByPlatform(true);
		// show the 'Input Token' page
		frame.setVisible(true);
		frame.add(new InputTokenPage(frame));
	}

	public static void main(String[] args) throws UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(new FlatDarculaLaf());
		SwingUtilities.invokeLater(Main::new);
	}
}