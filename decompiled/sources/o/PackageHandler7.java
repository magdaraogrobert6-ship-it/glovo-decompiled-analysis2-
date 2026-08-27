package o;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PackageHandler7 {
    public static int IconCompatParcelizer;
    public static int read;

    public static int read() {
        int i = IconCompatParcelizer;
        int i2 = i % 8580970;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return read;
        }
        int iMyPid = Process.myPid();
        read = iMyPid;
        return iMyPid;
    }
}
