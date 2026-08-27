package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getFrameView {
    public static boolean write(byte b) {
        return b > -65;
    }

    public static void RemoteActionCompatParcelizer(String str, StringBuilder sb) {
        str.getClass();
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt != '\"') {
                sb.append(cCharAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
    }
}
