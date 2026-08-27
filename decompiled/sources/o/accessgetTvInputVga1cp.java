package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetTvInputVga1cp {
    public static final char[] write = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] RemoteActionCompatParcelizer = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String IconCompatParcelizer(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            char[] cArr = write;
            sb.append(cArr[(b & 240) >>> 4]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }
}
