package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambda7GmUMp17UWm7j4LNO1nwTjU10 {
    public static final Integer read;

    static {
        Integer num;
        Integer num2 = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            num = obj instanceof Integer ? (Integer) obj : null;
        } catch (Throwable unused) {
        }
        if (num != null && num.intValue() > 0) {
            num2 = num;
        }
        read = num2;
    }
}
