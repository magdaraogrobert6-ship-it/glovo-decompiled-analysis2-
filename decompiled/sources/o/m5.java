package o;

import com.mapbox.maps.ViewAnnotationAnchor;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class m5 {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int read = 0;
    private static int serializer = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[m6.values().length];
        try {
            iArr[m6.Faster.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m6.Slower.ordinal()] = 2;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m6.Same.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        RemoteActionCompatParcelizer = iArr;
        int[] iArr2 = new int[ViewAnnotationAnchor.values().length];
        try {
            iArr2[ViewAnnotationAnchor.BOTTOM_RIGHT.ordinal()] = 1;
            int i2 = serializer + 9;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ViewAnnotationAnchor.TOP_RIGHT.ordinal()] = 2;
            int i4 = read + 109;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ViewAnnotationAnchor.BOTTOM_LEFT.ordinal()] = 3;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused6) {
        }
        write = iArr2;
    }
}
