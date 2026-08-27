package o;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzr;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class MeasureResult implements Callable {
    public final /* synthetic */ zzr IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Bundle serializer;
    public final /* synthetic */ LookaheadScopeKtdefaultPlacementApproachInProgress1 write;

    public /* synthetic */ MeasureResult(LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress1, zzr zzrVar, Bundle bundle, int i) {
        this.read = i;
        this.IconCompatParcelizer = zzrVar;
        this.serializer = bundle;
        this.write = lookaheadScopeKtdefaultPlacementApproachInProgress1;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.read;
        Bundle bundle = this.serializer;
        zzr zzrVar = this.IconCompatParcelizer;
        LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress1 = this.write;
        if (i != 0) {
            lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.serializer();
            return lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.RemoteActionCompatParcelizer(bundle, zzrVar);
        }
        lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.serializer();
        return lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.RemoteActionCompatParcelizer(bundle, zzrVar);
    }
}
