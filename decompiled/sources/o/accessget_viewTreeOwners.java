package o;

import android.app.Activity;
import android.util.SparseIntArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class accessget_viewTreeOwners {
    public static final getWindowInfoannotations write = getWindowInfoannotations.write();
    public final HashMap IconCompatParcelizer;
    public final androidx.core.app.FrameMetricsAggregator RemoteActionCompatParcelizer;
    public boolean read;
    public final Activity serializer;

    public accessget_viewTreeOwners(Activity activity) {
        androidx.core.app.FrameMetricsAggregator frameMetricsAggregator = new androidx.core.app.FrameMetricsAggregator();
        HashMap map = new HashMap();
        this.read = false;
        this.serializer = activity;
        this.RemoteActionCompatParcelizer = frameMetricsAggregator;
        this.IconCompatParcelizer = map;
    }

    public final sendMotionEvent8iAsVTc write() {
        boolean z = this.read;
        getWindowInfoannotations getwindowinfoannotations = write;
        if (!z) {
            getwindowinfoannotations.read();
            return new sendMotionEvent8iAsVTc();
        }
        SparseIntArray sparseIntArray = ((SparseIntArray[]) this.RemoteActionCompatParcelizer.serializer.MediaMetadataCompat)[0];
        if (sparseIntArray == null) {
            getwindowinfoannotations.read();
            return new sendMotionEvent8iAsVTc();
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
            int iKeyAt = sparseIntArray.keyAt(i4);
            int iValueAt = sparseIntArray.valueAt(i4);
            i += iValueAt;
            if (iKeyAt > 700) {
                i3 += iValueAt;
            }
            if (iKeyAt > 16) {
                i2 += iValueAt;
            }
        }
        return new sendMotionEvent8iAsVTc(new getLegacyTextInputServiceAndroid(i, i2, i3));
    }
}
