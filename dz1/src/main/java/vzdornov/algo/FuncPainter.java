package vzdornov.algo;

public abstract class FuncPainter {

    protected int w;
    protected int h;

    FuncPainter(int w,int h) {
        this.w = w;
        this.h = h;
    }

    protected static char map(boolean state) {
        return state ? '#' : '.';
    }

    abstract void paint(IFunc f);
}
