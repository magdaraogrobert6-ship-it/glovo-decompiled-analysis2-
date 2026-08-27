package o;

/* JADX INFO: loaded from: classes.dex */
public interface getStringId9Hzcbyc {
    public static final resolvedString write = resolvedString.write;

    default float serializer(float f, float f2, float f3) {
        write.getClass();
        float f4 = f2 + f;
        if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        return Math.abs(f) < Math.abs(f5) ? f : f5;
    }
}
