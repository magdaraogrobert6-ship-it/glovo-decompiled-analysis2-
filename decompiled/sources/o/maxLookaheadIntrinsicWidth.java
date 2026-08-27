package o;

import android.content.Context;
import android.preference.PreferenceManager;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class maxLookaheadIntrinsicWidth {
    public static final Object serializer = new Object();
    public final removeNodesInRange RemoteActionCompatParcelizer;

    public maxLookaheadIntrinsicWidth(androidx.work.impl.WorkerWrapper.Builder builder) {
        Context context = (Context) builder.RemoteActionCompatParcelizer;
        String str = (String) builder.write;
        String str2 = (String) builder.MediaSessionCompatQueueItem;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("keysetName cannot be null");
            throw null;
        }
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            applicationContext.getSharedPreferences(str2, 0).edit();
        }
        this.RemoteActionCompatParcelizer = (removeNodesInRange) builder.IconCompatParcelizer;
    }
}
