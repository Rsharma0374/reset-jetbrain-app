package in.guardianservices.reset;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import in.guardianservices.reset.view.AppView;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.awt.*;

@SpringBootApplication
public class ResetJetBrainAppApplication {

	public static void main(String[] args) {
		FlatRobotoFont.install();
		FlatLaf.registerCustomDefaultsSource("themes");
		UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.BOLD, 13));
		FlatMacDarkLaf.setup();
		java.awt.EventQueue.invokeLater(() -> new AppView().setVisible(true));	}

}
