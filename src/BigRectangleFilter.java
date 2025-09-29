import java.awt.*;

public class BigRectangleFilter implements Filter {

    @Override
    public boolean accept(Object x) {
        Rectangle rect = (Rectangle) x;
        double perimeter = 2*(rect.width+rect.height);

        return perimeter > 10;
    }
}
