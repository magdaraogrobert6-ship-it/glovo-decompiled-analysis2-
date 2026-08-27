package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class beforeInAppMessageDisplayed {
    public static final boolean IconCompatParcelizer;

    static {
        boolean z;
        try {
            Class.forName("java.lang.ClassValue");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        IconCompatParcelizer = z;
    }
}
