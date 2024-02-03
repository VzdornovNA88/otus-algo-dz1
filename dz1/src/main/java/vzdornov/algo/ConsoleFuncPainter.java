package vzdornov.algo;

public final class ConsoleFuncPainter extends FuncPainter {


    ConsoleFuncPainter(int w, int h) {
        super(w, h);
    }

    @Override
    void paint(IFunc f) {
        var stream = System.out;
        for( int y = 0 ; y < h ; y++ ) {
            for( int x = 0 ; x < w ; x++ ) {
                stream.print(map( f.map(x, y, w, h) ));
            }
            stream.println("");
        }
    }
}
