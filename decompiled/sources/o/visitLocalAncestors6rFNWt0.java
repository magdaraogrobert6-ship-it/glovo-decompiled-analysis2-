package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class visitLocalAncestors6rFNWt0 {
    public abstract boolean read(char c);

    public static String RemoteActionCompatParcelizer(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }
}
