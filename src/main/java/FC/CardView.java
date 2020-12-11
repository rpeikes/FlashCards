
package FC;

import javax.swing.*;
import java.awt.*;

public class CardView extends JComponent {
    public static final Color CARD_COLOR = Color.WHITE;
    public static final Color TEXT_COLOR = Color.BLACK;
    public static final int CARD_WIDTH = 500;
    public static final int CARD_HEIGHT = 300;
    public static final Rectangle rect = new Rectangle(CARD_WIDTH, CARD_HEIGHT);
    public static final Font font = new Font("Arial", Font.PLAIN, 20);
    private String cardText;

    public void setCardText(String cardText) {
        this.cardText = cardText;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintCard(g);
    }

    private void paintCard(Graphics g) {
        g.setColor(CARD_COLOR);
        g.fillRect(0, 0, CARD_WIDTH, CARD_HEIGHT);
        drawCenteredString(g);
    }

    private void drawCenteredString(Graphics g) {
        g.setColor(TEXT_COLOR);
        // Get the FontMetrics
        FontMetrics metrics = g.getFontMetrics(font);
        // Determine the X coordinate for the text
        int x = rect.x + (rect.width - metrics.stringWidth(cardText)) / 2;
        // Determine the Y coordinate for the text (note we add the ascent, as in java 2d 0 is top of the screen)
        int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
        // Set the font
        g.setFont(font);
        // Draw the String
        g.drawString(cardText, x, y);
    }
}