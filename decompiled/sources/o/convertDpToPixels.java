package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class convertDpToPixels {
    public static final RequestBuilder read;

    public static int RemoteActionCompatParcelizer(int i, int i2, boolean z) {
        int i3 = z ? i / 700 : i / 2;
        int i4 = (i3 / i2) + i3;
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return ((i4 * 36) / (i4 + 38)) + i5;
    }

    static {
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        read = ImageHeaderParserImageType.serializer("xn--");
    }

    public static int RemoteActionCompatParcelizer(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        DrawableTransformation.IconCompatParcelizer(i, "unexpected digit: ");
        return 0;
    }
}
