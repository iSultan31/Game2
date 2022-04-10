package game;

import city.cs.engine.*;
import java.awt.Color;



/**
 * An orange.
 */
public class Orange extends DynamicBody {
    private static final Shape shape = new CircleShape(0.2f);
    
    public Orange(World world) {
        super(world, shape);
        setFillColor(Color.orange);
    }
}
