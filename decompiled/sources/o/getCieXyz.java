package o;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class getCieXyz {
    public static int serializer;
    public static int write;
    public float RemoteActionCompatParcelizer;
    public String read;

    public static int write() {
        int i = serializer;
        int i2 = i % 9211160;
        serializer = i + 1;
        if (i2 != 0) {
            return write;
        }
        int iMyPid = Process.myPid();
        write = iMyPid;
        return iMyPid;
    }
}
