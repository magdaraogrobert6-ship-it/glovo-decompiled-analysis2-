package o;

/* JADX INFO: loaded from: classes3.dex */
public final class isUnspecifiedjoFl9I implements isUnspecifiedEaSLcWc {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    public static final char[] IconCompatParcelizer = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static int write = 67 % androidx.compose.ui.graphics.Fields.SpotShadowColor;

    public isUnspecifiedjoFl9I(isOpenInternalroom_runtime isopeninternalroom_runtime) {
    }

    static {
        int i = 67 % 2;
    }

    public static String write(byte[] bArr) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = read + 79;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            byte b = bArr[i2];
            char[] cArr = IconCompatParcelizer;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
            i2++;
            int i5 = serializer + 21;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 5 % 5;
            }
        }
        return sb.toString();
    }
}
