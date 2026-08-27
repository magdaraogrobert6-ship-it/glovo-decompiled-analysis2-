package o;

import android.content.Context;
import androidx.camera.core.ImageCapture$1;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class accessgetMuhenkancp {
    public static final accessgetTvDataServicecp IconCompatParcelizer = new accessgetTvDataServicecp("GoogleSignInCommon", new String[0]);

    public static void serializer(Context context) {
        ImageCapture$1.read(context).MediaDescriptionCompat();
        Set set = accessgetNumPad6cp.read;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((accessgetNumPad6cp) it.next()).getClass();
            getAlignmentLinesMap.write();
            return;
        }
        synchronized (GoogleApiManager.write) {
            GoogleApiManager googleApiManager = GoogleApiManager.serializer;
            if (googleApiManager != null) {
                googleApiManager.MediaSessionCompatResultReceiverWrapper.incrementAndGet();
                getBackEK5gGoQ getbackek5ggoq = googleApiManager.ComponentActivity;
                getbackek5ggoq.sendMessageAtFrontOfQueue(getbackek5ggoq.obtainMessage(10));
            }
        }
    }
}
