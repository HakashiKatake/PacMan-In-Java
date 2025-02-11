import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Random;
import javax.swing.*;

public class PacMan extends JPanel {
    int rowCount = 21;
    int columnCount = 19;
    int tileSize = 32;
    int boardWidth = columnCount * tileSize;
    int boardHeight = rowCount * tileSize; 

    private Image wallImage;
    private Image blueGhostImage;
    private Image orangeGhostImage;
    private Image pinkGhostImage;
    private Image redGhostImage;

    private Image pacmanUpImage;
    private Image pacmanDownImage;
    private Image pacmanLeftImage;
    private Image pacmanRightImage;

    PacMan() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.BLACK);

        wallImage = new ImageIcon(getClass().getResource("./Sprites/wall.png")).getImage();
        blueGhostImage = new ImageIcon(getClass().getResource("./Sprites/blueGhost.png")).getImage();
        orangeGhostImage = new ImageIcon(getClass().getResource("./Sprites/orangeGhost.png")).getImage();
        pinkGhostImage = new ImageIcon(getClass().getResource("./Sprites/pinkGhost.png")).getImage();
        redGhostImage = new ImageIcon(getClass().getResource("./Sprites/redGhost.png")).getImage();

        pacmanUpImage = new ImageIcon(getClass().getResource("./Sprites/pacmanUp.png")).getImage();
        pacmanDownImage = new ImageIcon(getClass().getResource("./Sprites/pacmanDown.png")).getImage();
        pacmanLeftImage = new ImageIcon(getClass().getResource("./Sprites/pacmanLeft.png")).getImage();
        pacmanRightImage = new ImageIcon(getClass().getResource("./Sprites/pacmanRight.png")).getImage();

        
    }
}
