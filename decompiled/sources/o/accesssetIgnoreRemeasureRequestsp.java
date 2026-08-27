package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class accesssetIgnoreRemeasureRequestsp {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[getOwnerui.values().length];
        IconCompatParcelizer = iArr;
        try {
            iArr[getOwnerui.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            IconCompatParcelizer[getOwnerui.SHA224.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            IconCompatParcelizer[getOwnerui.SHA256.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            IconCompatParcelizer[getOwnerui.SHA384.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            IconCompatParcelizer[getOwnerui.SHA512.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
