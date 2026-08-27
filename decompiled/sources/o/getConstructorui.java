package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class getConstructorui {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[LayoutNodeWhenMappings.values().length];
        RemoteActionCompatParcelizer = iArr;
        try {
            iArr[LayoutNodeWhenMappings.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            RemoteActionCompatParcelizer[LayoutNodeWhenMappings.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            RemoteActionCompatParcelizer[LayoutNodeWhenMappings.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[LayoutNodeCompanion.IconCompatParcelizer.values().length];
        read = iArr2;
        try {
            iArr2[LayoutNodeCompanion.IconCompatParcelizer.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            read[LayoutNodeCompanion.IconCompatParcelizer.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            read[LayoutNodeCompanion.IconCompatParcelizer.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
