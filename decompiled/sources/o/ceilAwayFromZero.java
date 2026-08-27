package o;

/* JADX INFO: loaded from: classes2.dex */
public class ceilAwayFromZero {
    public int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;

    public static void RemoteActionCompatParcelizer(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int read(int i) {
        setFontWeight setfontweight = setFontWeight.RemoteActionCompatParcelizer;
        return ((setfontweight.write[0][(i >>> 24) & 255] + setfontweight.write[1][(i >>> 16) & 255]) ^ setfontweight.write[2][(i >>> 8) & 255]) + setfontweight.write[3][i & 255];
    }
}
