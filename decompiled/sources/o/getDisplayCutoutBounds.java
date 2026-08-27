package o;

import com.google.android.play.core.appupdate.internal.zzx;

/* JADX INFO: loaded from: classes4.dex */
public final class getDisplayCutoutBounds extends WindowInsetsRulersImpl {
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ getDisplayCutoutBounds(int i, Object obj) {
        this.serializer = i;
        this.write = obj;
    }

    @Override // o.WindowInsetsRulersImpl
    public final void RemoteActionCompatParcelizer() {
        if (this.serializer != 0) {
            zzx zzxVar = ((findDisplayCutouts) this.write).serializer;
            zzxVar.write.write("unlinkToDeath", new Object[0]);
            zzxVar.PlaybackStateCompat.asBinder().unlinkToDeath(zzxVar.MediaSessionCompatResultReceiverWrapper, 0);
            zzxVar.PlaybackStateCompat = null;
            zzxVar.MediaSessionCompatQueueItem = false;
            return;
        }
        synchronized (((zzx) this.write).RatingCompat) {
            if (((zzx) this.write).PlaybackStateCompatCustomAction.get() > 0 && ((zzx) this.write).PlaybackStateCompatCustomAction.decrementAndGet() > 0) {
                ((zzx) this.write).write.write("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            zzx zzxVar2 = (zzx) this.write;
            if (zzxVar2.PlaybackStateCompat != null) {
                zzxVar2.write.write("Unbind from service.", new Object[0]);
                zzx zzxVar3 = (zzx) this.write;
                zzxVar3.IconCompatParcelizer.unbindService(zzxVar3.ParcelableVolumeInfo);
                zzx zzxVar4 = (zzx) this.write;
                zzxVar4.MediaSessionCompatQueueItem = false;
                zzxVar4.PlaybackStateCompat = null;
                zzxVar4.ParcelableVolumeInfo = null;
            }
            ((zzx) this.write).serializer();
        }
    }
}
