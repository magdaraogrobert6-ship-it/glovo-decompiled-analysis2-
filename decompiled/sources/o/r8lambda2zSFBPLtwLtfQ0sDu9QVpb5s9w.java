package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambda2zSFBPLtwLtfQ0sDu9QVpb5s9w {
    public static final Integer write;

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
        write = num2;
    }
}
