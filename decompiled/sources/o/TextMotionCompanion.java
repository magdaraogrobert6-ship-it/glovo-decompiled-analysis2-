package o;

import android.os.Process;
import java.util.ArrayList;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class TextMotionCompanion {
    public static int serializer;
    public static int write;
    public volatile int IconCompatParcelizer;
    public final ArrayList RemoteActionCompatParcelizer;
    public final Path$Companion read;

    public TextMotionCompanion(Path$Companion path$Companion) {
        path$Companion.getClass();
        this.read = path$Companion;
        this.RemoteActionCompatParcelizer = new ArrayList();
    }

    public static int serializer() {
        int i = serializer;
        int i2 = i % 7687066;
        serializer = i + 1;
        if (i2 != 0) {
            return write;
        }
        int iMyUid = Process.myUid();
        write = iMyUid;
        return iMyUid;
    }
}
