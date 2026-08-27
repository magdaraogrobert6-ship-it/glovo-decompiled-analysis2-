package o;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes2.dex */
public final class disposeAndRegister implements minWidth {
    public final getProgramYellowEK5gGoQ IconCompatParcelizer;
    public final /* synthetic */ AppMeasurementDynamiteService read;

    public disposeAndRegister(AppMeasurementDynamiteService appMeasurementDynamiteService, getProgramYellowEK5gGoQ getprogramyellowek5ggoq) {
        this.read = appMeasurementDynamiteService;
        this.IconCompatParcelizer = getprogramyellowek5ggoq;
    }

    @Override // o.minWidth
    public final void write(long j, Bundle bundle, String str, String str2) {
        try {
            this.IconCompatParcelizer.serializer(j, bundle, str, str2);
        } catch (RemoteException e) {
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = this.read.zza;
            if (lookaheadScopeKtLookaheadScope221 != null) {
                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(e, "Event listener threw exception");
            }
        }
    }
}
