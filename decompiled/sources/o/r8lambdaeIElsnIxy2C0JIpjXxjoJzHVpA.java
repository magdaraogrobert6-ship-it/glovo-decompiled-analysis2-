package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdaeIElsnIxy2C0JIpjXxjoJzHVpA {
    public static String read;
    public static final char[] RemoteActionCompatParcelizer = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '-', '_'};
    public static final int IconCompatParcelizer = 64;
    public static int serializer = 0;
    public static final HashMap write = new HashMap(64);

    static {
        for (int i = 0; i < IconCompatParcelizer; i++) {
            write.put(Character.valueOf(RemoteActionCompatParcelizer[i]), Integer.valueOf(i));
        }
    }

    public static String RemoteActionCompatParcelizer() {
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(new Date().getTime());
        if (!strRemoteActionCompatParcelizer.equals(read)) {
            serializer = 0;
            read = strRemoteActionCompatParcelizer;
            return strRemoteActionCompatParcelizer;
        }
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(strRemoteActionCompatParcelizer, ".");
        int i = serializer;
        serializer = i + 1;
        sbM.append(RemoteActionCompatParcelizer(i));
        return sbM.toString();
    }

    public static String RemoteActionCompatParcelizer(long j) {
        StringBuilder sb = new StringBuilder();
        do {
            long j2 = IconCompatParcelizer;
            sb.insert(0, RemoteActionCompatParcelizer[(int) (j % j2)]);
            j /= j2;
        } while (j > 0);
        return sb.toString();
    }
}
