package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class LayoutModifierNodeCoordinator {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[isSemanticsInvalidatedui.values().length];
        write = iArr;
        try {
            iArr[isSemanticsInvalidatedui.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[isSemanticsInvalidatedui.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            write[isSemanticsInvalidatedui.DESTROYED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
