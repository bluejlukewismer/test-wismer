/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square door;
    private Circle lawn;
    private Person person;
    private Square door2;
    private Square drive;

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
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();

        door = new Square();
        door.changeColor("black");
        door.changeSize(40);
        door.moveHorizontal(-72);
        door.moveVertical(87);
        door.makeVisible();

        lawn = new Circle();
        lawn.changeColor("green");
        lawn.changeSize(800);
        lawn.makeVisible();
        lawn.moveHorizontal(-400);
        lawn.moveVertical(170);

        person = new Person();
        person.makeVisible();
        person.moveHorizontal(80);
        person.moveVertical(40);

        door2 = new Square();
        door2.changeColor("black");
        door2.changeSize(40);
        door2.moveHorizontal(-72);
        door2.moveVertical(50);
        door2.makeVisible();

        drive = new Square();
        drive.changeSize(70);
        drive.makeVisible();
        drive.moveHorizontal(15);
        drive.moveVertical(154);
        drive.changeColor("black");

    }

    public void movePerson()
    {

        {
            person.slowMoveHorizontal(-190);
        }
    }

    public void movePerson2()
    {

        {
            person.slowMoveHorizontal(190);
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            door2.changeColor("white");
            door.changeColor("white");
            lawn.changeColor("black");
            drive.changeColor("white");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
            door2.changeColor("black");
            door.changeColor("black");
            lawn.changeColor("green");
            drive.changeColor("black");
        }
    }
}
