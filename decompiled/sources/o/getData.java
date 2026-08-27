package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class getData extends BroadcastReceiver {
    public static final String IconCompatParcelizer = setRotationX.IconCompatParcelizer("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        setRotationX setrotationx = setRotationX.read();
        Objects.toString(intent);
        setrotationx.getClass();
        try {
            androidx.work.impl.WorkManagerImpl workManagerImplRemoteActionCompatParcelizer = androidx.work.impl.WorkManagerImpl.RemoteActionCompatParcelizer(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (androidx.work.impl.WorkManagerImpl.RemoteActionCompatParcelizer) {
                BroadcastReceiver.PendingResult pendingResult = workManagerImplRemoteActionCompatParcelizer.RatingCompat;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                workManagerImplRemoteActionCompatParcelizer.RatingCompat = pendingResultGoAsync;
                if (workManagerImplRemoteActionCompatParcelizer.MediaSessionCompatQueueItem) {
                    pendingResultGoAsync.finish();
                    workManagerImplRemoteActionCompatParcelizer.RatingCompat = null;
                }
            }
        } catch (IllegalStateException e) {
            setRotationX.read().IconCompatParcelizer(IconCompatParcelizer, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
