package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class accessgetCustomHandlercp {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[BrazeDeeplinkHandlerCompanion.values().length];
        write = iArr;
        try {
            iArr[BrazeDeeplinkHandlerCompanion.HEADER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[BrazeDeeplinkHandlerCompanion.BODY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
