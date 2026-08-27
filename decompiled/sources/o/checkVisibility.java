package o;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.measurement.internal.zzoq;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class checkVisibility extends zzbm implements LayoutNodeSubcompositionsStatesubcompose41composable1 {
    public final /* synthetic */ setViewportBounds IconCompatParcelizer;
    public final /* synthetic */ AtomicReference RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public checkVisibility(setViewportBounds setviewportbounds, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.RemoteActionCompatParcelizer = atomicReference;
        this.IconCompatParcelizer = setviewportbounds;
    }

    @Override // o.LayoutNodeSubcompositionsStatesubcompose41composable1
    public final void RemoteActionCompatParcelizer(zzoq zzoqVar) {
        AtomicReference atomicReference = this.RemoteActionCompatParcelizer;
        synchronized (atomicReference) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.IconCompatParcelizer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.PlaybackStateCompat.serializer(Integer.valueOf(zzoqVar.read.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(zzoqVar);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        zzoq zzoqVar = (zzoq) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzoq.CREATOR);
        getPageDownEK5gGoQ.read(parcel);
        RemoteActionCompatParcelizer(zzoqVar);
        return true;
    }
}
