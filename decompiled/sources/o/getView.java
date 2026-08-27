package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class getView {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[getAutofillManager.values().length];
        try {
            iArr[getAutofillManager.Indefinite.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[getAutofillManager.Long.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[getAutofillManager.Short.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        write = iArr;
    }
}
