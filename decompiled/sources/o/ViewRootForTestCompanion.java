package o;

import android.content.Context;
import com.huawei.location.ut;
import com.huawei.riemann.gnsslocation.core.VdrLocationAlgoWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewRootForTestCompanion {
    public static VdrLocationAlgoWrapper read;
    public volatile boolean RemoteActionCompatParcelizer = false;
    public final ut serializer;

    public ViewRootForTestCompanion(Context context, String str) {
        if (VdrLocationAlgoWrapper.IconCompatParcelizer == null) {
            synchronized (VdrLocationAlgoWrapper.read) {
                if (VdrLocationAlgoWrapper.IconCompatParcelizer == null) {
                    VdrLocationAlgoWrapper.IconCompatParcelizer = new VdrLocationAlgoWrapper(context, str);
                }
            }
        }
        read = VdrLocationAlgoWrapper.IconCompatParcelizer;
        if (ut.serializer == null) {
            synchronized (ut.IconCompatParcelizer) {
                if (ut.serializer == null) {
                    ut utVar = new ut(0, false);
                    utVar.write = false;
                    int i = ComposeScrollCaptureCallbackonScrollCaptureEnd1.serializer;
                    utVar.ParcelableVolumeInfo();
                    ut.serializer = utVar;
                }
            }
        }
        this.serializer = ut.serializer;
    }
}
