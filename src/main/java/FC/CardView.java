
package FC;

import javax.swing.*;
import java.awt.*;

public class CardView extends JComponent {
    public static final Color CARD_COLOR = Color.WHITE;
    //public static final Color TEXT_COLOR = Color.BLACK;
    private String cardText;

    public void setCardText(String cardText){
        this.cardText = cardText;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintCard(g);
    }

    private void paintCard(Graphics g) {
        g.setColor(CARD_COLOR);
        g.fillRect(0,0,250,150);
        g.drawString(String.format("<html><body style=\"text-align: justify;  " +
                "text-justify: inter-word;\">%s</body></html>",cardText),5,5);
    }

//    private void drawCenteredString(Graphics g, String text, Rectangle rect, Font font) {
//        // Get the FontMetrics
//        FontMetrics metrics = g.getFontMetrics(font);
//        // Determine the X coordinate for the text
//        int x = rect.x + (rect.width - metrics.stringWidth(text)) / 2;
//        // Determine the Y coordinate for the text (note we add the ascent, as in java 2d 0 is top of the screen)
//        int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
//        // Set the font
//        g.setFont(font);
//        // Draw the String
//        g.drawString(text, x, y);
//    }
}