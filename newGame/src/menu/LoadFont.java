package menu;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

public class LoadFont {
	Font walkway;

	public Font callFont(String fontFile) {
		try {
			walkway = Font.createFont(Font.TRUETYPE_FONT, new File(fontFile));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return walkway;
	}
}
