package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.stats.zza;

/* JADX INFO: loaded from: classes2.dex */
public final class getRootLookaheadDelegate extends BroadcastReceiver {
    public final zzpg IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public boolean read;

    public final void IconCompatParcelizer() {
        zzpg zzpgVar = this.IconCompatParcelizer;
        zzpgVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        zzpgVar.PlaybackStateCompat().MediaSessionCompatToken();
        zzpgVar.PlaybackStateCompat().MediaSessionCompatToken();
        if (this.RemoteActionCompatParcelizer) {
            zzpgVar.RatingCompat().PlaybackStateCompat.RemoteActionCompatParcelizer("Unregistering connectivity change receiver");
            this.RemoteActionCompatParcelizer = false;
            this.read = false;
            try {
                zzpgVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.MediaDescriptionCompat.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                zzpgVar.RatingCompat().serializer.serializer(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzpg zzpgVar = this.IconCompatParcelizer;
        zzpgVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        String action = intent.getAction();
        zzpgVar.RatingCompat().PlaybackStateCompat.serializer(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            zzpgVar.RatingCompat().MediaSessionCompatQueueItem.serializer(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        zzgz zzgzVar = zzpgVar.MediaSessionCompatToken;
        zzpg.serializer(zzgzVar);
        boolean zSerializer = zzgzVar.serializer();
        if (this.read != zSerializer) {
            this.read = zSerializer;
            zzpgVar.PlaybackStateCompat().write((Runnable) new zza(this, zSerializer));
        }
    }

    public getRootLookaheadDelegate(zzpg zzpgVar) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(zzpgVar);
        this.IconCompatParcelizer = zzpgVar;
    }
}
