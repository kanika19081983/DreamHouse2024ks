package rocks.zipcode.dreamhouse;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.changeColor("magenta");
        wall.moveVertical(20);
        wall.changeSize(50);
        wall.moveHorizontal(5);
        wall.moveVertical(90);
        wall.makeVisible();

        wall = new Square();
        wall.changeColor("magenta");
        wall.moveVertical(20);
        wall.changeSize(50);
        wall.moveHorizontal(120);
        wall.moveVertical(90);
        wall.makeVisible();


        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(15);
        window.moveVertical(130);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(15);
        window.moveVertical(200);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(15);
        window.moveVertical(180);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(15);
        window.moveVertical(160);
        window.makeVisible();

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(130);
        window.moveVertical(130);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(130);
        window.moveVertical(160);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(130);
        window.moveVertical(180);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(130);
        window.moveVertical(200);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("blue");
        roof.changeSize(20, 100);
        roof.moveHorizontal(40);
        roof.moveVertical(130);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("blue");
        roof.changeSize(20, 100);
        roof.moveHorizontal(150);
        roof.moveVertical(130);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(70, 30);
        roof.moveHorizontal(100);
        roof.moveVertical(150);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(70, 30);
        roof.moveHorizontal(100);
        roof.moveVertical(250);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(70, 30);
        roof.moveHorizontal(100);
        roof.moveVertical(200);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("magenta");
            window.changeColor("magenta");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("magenta");
            window.changeColor("yellow");
            roof.changeColor("blue");
            sun.changeColor("yellow");
        }
    }

}
