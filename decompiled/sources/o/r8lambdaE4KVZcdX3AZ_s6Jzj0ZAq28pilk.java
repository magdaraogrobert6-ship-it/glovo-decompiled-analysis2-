package o;

/* JADX INFO: loaded from: classes.dex */
public enum r8lambdaE4KVZcdX3AZ_s6Jzj0ZAq28pilk {
    MITER,
    ROUND,
    BEVEL;

    public android.graphics.Paint.Join toPaintJoin() {
        int i = Bt2020Hlglambda0.IconCompatParcelizer[ordinal()];
        if (i == 1) {
            return android.graphics.Paint.Join.BEVEL;
        }
        if (i == 2) {
            return android.graphics.Paint.Join.MITER;
        }
        if (i != 3) {
            return null;
        }
        return android.graphics.Paint.Join.ROUND;
    }
}
