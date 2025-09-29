import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rects = new ArrayList<Rectangle>();

        rects.add(new Rectangle(1, 1, 2, 2));  // perimeter = 8
        rects.add(new Rectangle(0, 0, 3, 2));  // perimeter = 10
        rects.add(new Rectangle(0, 0, 4, 3));  // perimeter = 14
        rects.add(new Rectangle(0, 0, 1, 5));  // perimeter = 12
        rects.add(new Rectangle(0, 0, 6, 1));  // perimeter = 14
        rects.add(new Rectangle(0, 0, 2, 4));  // perimeter = 12
        rects.add(new Rectangle(0, 0, 1, 2));  // perimeter = 6
        rects.add(new Rectangle(0, 0, 5, 5));  // perimeter = 20
        rects.add(new Rectangle(0, 0, 2, 3));  // perimeter = 10
        rects.add(new Rectangle(0, 0, 7, 2));  // perimeter = 18
        
        BigRectangleFilter filter = new BigRectangleFilter();

        System.out.println("Big Rectangle List (perimeter > 10): ");
        for (Rectangle r : rects) {
            if (filter.accept(r)) {
                int per = 2*(r.width + r.height);
                System.out.printf("Rectangular: width %d, height: %d, perimeter: %d\n", r.width, r.height, per);
            }

        }
    }
}
