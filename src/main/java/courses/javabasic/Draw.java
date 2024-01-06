package courses.javabasic;

public class Draw {

    public static void main(String[] args) {
        if (args.length >= 2) {
            System.out.println("Param 1:" + args[0] + "\nParam 2:" + args[1]);
            drawFullShape(args[0], args[1]);
            drawShapeOutline(args[0], args[1]);
            drawShapeCorners(args[0], args[1]);
        }

        System.out.println("Draw same size shape");
        drawFullShape(3, 3);

        if (args.length >= 1) {
            System.out.println("Draw same size as string");
            drawFullShape(args[0]);
            System.out.println("Draw Shape Outline");
            drawShapeOutline(args[0]);
            System.out.println("Draw Shape Corners");
            drawShapeCorners(args[0]);
        }
    }

    public static void drawFullShape(int n, int m) {
        for (int i = 0; i < n; i++) {
            drawFullLine(m);
        }
    }

    public static void drawFullLine(int m) {
        System.out.println("*".repeat(m));
    }

    public static void drawShapeOutline(int n, int m) {
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                drawFullLine(m);
            } else {
                drawBordersLine(m);
            }
        }
    }

    public static void drawBordersLine(int m) {
        System.out.println("*" + " ".repeat(Math.max(0, m - 2)) + (m > 1 ? "*" : ""));
    }

    public static void drawShapeCorners(int n, int m) {
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                drawBordersLine(m);
            } else {
                drawEmptyLine(m);
            }
        }
    }

    public static void drawEmptyLine(int m) {
        System.out.println(" ".repeat(m));
    }

    public static void drawFullShape(String n, String m) {
        drawFullShape(Integer.parseInt(n), Integer.parseInt(m));
    }

    public static void drawFullShape(int n) {
        drawFullShape(n, n);
    }

    public static void drawFullShape(String n) {
        drawFullShape(Integer.parseInt(n));
    }

    public static void drawShapeOutline(String n, String m) {
        drawShapeOutline(Integer.parseInt(n), Integer.parseInt(m));
    }

    public static void drawShapeOutline(int n) {
        drawShapeOutline(n, n);
    }

    public static void drawShapeOutline(String n) {
        drawShapeOutline(Integer.parseInt(n));
    }

    public static void drawShapeCorners(String n, String m) {
        drawShapeCorners(Integer.parseInt(n), Integer.parseInt(m));
    }

    public static void drawShapeCorners(int n) {
        drawShapeCorners(n, n);
    }

    public static void drawShapeCorners(String n) {
        drawShapeCorners(Integer.parseInt(n));
    }
}
