package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class onPostLayoutNodeReused {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[onPreLayoutNodeReused.values().length];
        IconCompatParcelizer = iArr;
        try {
            iArr[onPreLayoutNodeReused.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            IconCompatParcelizer[onPreLayoutNodeReused.WARN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            IconCompatParcelizer[onPreLayoutNodeReused.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
