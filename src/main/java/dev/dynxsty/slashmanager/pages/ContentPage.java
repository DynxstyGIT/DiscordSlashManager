package dev.dynxsty.slashmanager.pages;

import javax.swing.*;
import java.awt.*;

public abstract class ContentPage extends JPanel {
	protected final JPanel panel;

	protected ContentPage() {
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setVisible(true);
	}

	public void setTitle(JFrame frame, String title) {
		JLabel label = new JLabel(title);
		label.setFont(label.getFont().deriveFont(label.getFont().getSize() + 20f));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setToolTipText(title);
		frame.setTitle(title + " (DiscordSlashManager)");
		panel.add(label);
	}
}
