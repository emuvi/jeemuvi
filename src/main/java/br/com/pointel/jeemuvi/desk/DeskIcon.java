package br.com.pointel.jeemuvi.desk;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JLabel;

/**
 *
 * @author emuvi
 */
public class DeskIcon extends JLabel {
    
    private final Image imageLogo;

    public DeskIcon() {
        this.imageLogo = loadLogo();
    }
    
    private Image loadLogo() {
        try {
            return ImageIO.read(Desk.class.getResourceAsStream("/img/logo-perfil.jpg"));
        } catch (Exception e) {
            return new BufferedImage(128, 128, BufferedImage.TYPE_INT_ARGB);
        }
    }
    
    public Image getLogo() {
        return this.imageLogo;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.drawImage(getLogo(), 0, 0, getWidth(), getHeight(), this);
        g2d.dispose();
    }
    
}
