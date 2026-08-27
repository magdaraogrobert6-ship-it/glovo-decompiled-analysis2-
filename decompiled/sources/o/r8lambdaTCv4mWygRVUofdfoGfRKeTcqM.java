package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class r8lambdaTCv4mWygRVUofdfoGfRKeTcqM extends BroadcastReceiver {
    public AndroidComposeView read;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (this) {
            AndroidComposeView androidComposeView = this.read;
            if (androidComposeView == null) {
                return;
            }
            if (androidComposeView.RemoteActionCompatParcelizer()) {
                Log.isLoggable("FirebaseMessaging", 3);
                AndroidComposeView androidComposeView2 = this.read;
                androidComposeView2.MediaSessionCompatQueueItem.MediaMetadataCompat.schedule(androidComposeView2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.read = null;
            }
        }
    }
}
