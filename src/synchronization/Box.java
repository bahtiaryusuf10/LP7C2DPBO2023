/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package synchronization;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Yusuf
 */
public class Box extends GameObject{
    /**
     * Constructor.
     */
    
    // Default constructor.
    public Box()
    {
        super(0, 0, 50, 50, "Box");
    }
    
    // Constructor with box position.
    public Box(int x, int y)
    {
        super(x, y, 50, 50, "Box");
    }
    
    /**
     * Override interface.
     */
    
    @Override
    public void render(Graphics object)
    {
        // Set box shape.
        object.setColor(Color.decode("#eb8787"));
        object.fillRect(x, y, 50, 50);
    }
    
    @Override
    public void loop()
    {
        // Initialize velocity, so object can move.
        this.x += this.velX;
        this.y += this.velY;
        
        // Initialize box bound, so it won't get offset the display.
        x = Game.clamp(x, 0, (Game.width - 50));
        y = Game.clamp(y, 0, (Game.height - 70));
    }
}
