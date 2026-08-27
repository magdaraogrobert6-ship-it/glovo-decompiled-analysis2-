package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class cachedZoneGeoJson {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int serializer;

    static {
        int[] iArr = new int[brazelog.values().length];
        try {
            iArr[brazelog.MONDAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[brazelog.TUESDAY.ordinal()] = 2;
            int i = serializer + 111;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[brazelog.WEDNESDAY.ordinal()] = 3;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[brazelog.THURSDAY.ordinal()] = 4;
            int i5 = IconCompatParcelizer + 69;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[brazelog.FRIDAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[brazelog.SATURDAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[brazelog.SUNDAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}
