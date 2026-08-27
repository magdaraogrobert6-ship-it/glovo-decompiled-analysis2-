package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class u0 {
    private static int RemoteActionCompatParcelizer = 0;
    public static final /* synthetic */ int[] read;
    private static int serializer = 1;

    static {
        int[] iArr = new int[brazelog.values().length];
        try {
            iArr[brazelog.MONDAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[brazelog.TUESDAY.ordinal()] = 2;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[brazelog.WEDNESDAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[brazelog.THURSDAY.ordinal()] = 4;
            int i2 = RemoteActionCompatParcelizer + 83;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[brazelog.FRIDAY.ordinal()] = 5;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[brazelog.SATURDAY.ordinal()] = 6;
            int i6 = serializer + 123;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[brazelog.SUNDAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        read = iArr;
    }
}
