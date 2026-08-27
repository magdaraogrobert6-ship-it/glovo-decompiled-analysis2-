package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r8lambdaxReHo_J2NBln0NmeW7hxMCvaAI {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug.values().length];
        try {
            iArr[r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug.SHOW.ordinal()] = 1;
            int i = serializer + 93;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug.HIDE.ordinal()] = 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
        int i5 = serializer + 43;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
