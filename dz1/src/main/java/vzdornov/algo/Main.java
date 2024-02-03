package vzdornov.algo;

public class Main {
    public static void main(String[] args) {
        new ConsoleFuncPainter(25, 25).paint((x,y,w,h) -> {
            // return x % 2 > 0;
            // return y == (x-16)*(x-16) + 4;
            // return (x - 7)*(x - 7) + (y - 7)*(y - 7) <= (7)*(7) + 1;
            // return Math.abs(x-16)/2 + Math.abs(y-16)/3 <= 4;
            // return (x + 16)*(y + 16) <= 1024;
            // return y == Math.sqrt(64 + (x-16)*(x-16));
            // return Math.abs(x-16) - Math.abs(y-16) <= 1;
            // return x % 6 == 0 && 10 < y && y < 20;
            // return ((y % 3) == 0  && (x % 3) == 0) || (((y+1) % 3) == 0  && (x+2) % 3 == 0) || (((y+1) % 2) == 0 &&  ((y+1) % 4) != 0 && (x+1) % 3 == 0); 

            // int[] xm = {16,0,32};
            // int[] ym = {16,32,32};
            // int a = (xm[0] - x) * (ym[1] - ym[0]) - (xm[1] - xm[0]) * (ym[0] - y);
            // int b = (xm[1] - x) * (ym[2] - ym[1]) - (xm[2] - xm[1]) * (ym[1] - y);
            // int c = (xm[2] - x) * (ym[0] - ym[2]) - (xm[0] - xm[2]) * (ym[2] - y);
            // return ((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0));

            // return y > h/2 - x/2;
            // return (x%2 == 0 || x%3 == 0) && y < 10;
            // return y >= 9 - x && y <= x + 9;
            // return y >= x - 9 && y <= x + 9;


            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


            // return x > y;                         // 1
            // return y == x;                        // 2
            // return y == w - x - 1;                // 3
            // return y < w - x + 6;                 // 4
            // return x == 2*y  || x == 2*y + 1;     // 5

            // set #1
            // int a = w/2;
            // int x0 = w - a/2;
            // int y0 = h - a/2;

            // set #2
            // int a = Math.min(w, h);
            // int x0 = w/2+1;
            // int y0 = h/2+1;

            // set #3
            // int a = Math.min(w, h)-2;
            // int x0 = w/2;
            // int y0 = h/2;

            // return Math.abs( Math.abs( x - x0 ) + Math.abs( y - y0 ) ) + Math.abs( Math.abs( y - y0 ) - Math.abs( x - x0 ) ) >= a; // (set #1) - 6 ,(<=) - 7 , (set #2) - 8 , (set #3) - 19

            // return y > x + w/4 || y < x - h/4;                       // 9
            // return 2*y >= x - 1 && y < x;                            // 10
            // return y == 1 || y == h - 2 || x == 1 || x == w - 2;     // 11
            // return (x)*(x) + (y)*(y) <= (w-4)*(h-4);                 // 12
            // return y >= w - x - w/4 && y <= h - x + h/4 - 2;         // 13
            // return (x-w)*(x-w) + (y-h)*(y-h) >= (w-4)*(h-4);         // 14
            // return (y % 2 > 0 && x % 2 > 0) || (y % 2 == 0 && x % 2 == 0); // 20
            return (x + y) % 3 == 0; // 22
        });
    }
}