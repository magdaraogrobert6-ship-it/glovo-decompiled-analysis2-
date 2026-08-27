package o;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class setLastResult implements Runnable {
    public final /* synthetic */ Bundle IconCompatParcelizer;
    public final /* synthetic */ zzr RemoteActionCompatParcelizer;
    public final /* synthetic */ zzbe read;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ setViewportBounds write;

    @Override // java.lang.Runnable
    public final void run() {
        setViewportBounds setviewportbounds = this.write;
        isComplete iscomplete = setviewportbounds.write;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (iscomplete == null) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Failed to send default event parameters to service");
            return;
        }
        boolean zWrite = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.write(null, premeasure0kLqBqw.onPanelClosed);
        zzr zzrVar = this.RemoteActionCompatParcelizer;
        if (zWrite) {
            setviewportbounds.RemoteActionCompatParcelizer(iscomplete, this.serializer ? null : this.read, zzrVar);
            return;
        }
        try {
            iscomplete.read(this.IconCompatParcelizer, zzrVar);
            setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        } catch (RemoteException e) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.serializer(e, "Failed to send default event parameters to service");
        }
    }

    public setLastResult(setViewportBounds setviewportbounds, zzr zzrVar, boolean z, zzbe zzbeVar, Bundle bundle) {
        this.RemoteActionCompatParcelizer = zzrVar;
        this.serializer = z;
        this.read = zzbeVar;
        this.IconCompatParcelizer = bundle;
        Objects.requireNonNull(setviewportbounds);
        this.write = setviewportbounds;
    }
}
