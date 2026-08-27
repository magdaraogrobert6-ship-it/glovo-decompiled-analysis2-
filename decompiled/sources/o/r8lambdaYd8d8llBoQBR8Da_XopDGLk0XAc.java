package o;

/* JADX INFO: loaded from: classes.dex */
public enum r8lambdaYd8d8llBoQBR8Da_XopDGLk0XAc {
    BUTT,
    ROUND,
    UNKNOWN;

    public android.graphics.Paint.Cap toPaintCap() {
        int i = Bt2020Hlglambda0.read[ordinal()];
        if (i != 1) {
            return i != 2 ? android.graphics.Paint.Cap.SQUARE : android.graphics.Paint.Cap.ROUND;
        }
        return android.graphics.Paint.Cap.BUTT;
    }
}
