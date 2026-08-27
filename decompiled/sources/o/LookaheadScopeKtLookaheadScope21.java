package o;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import io.grpc.SynchronizationContext$1;

/* JADX INFO: loaded from: classes4.dex */
public final class LookaheadScopeKtLookaheadScope21 implements Runnable {
    public final /* synthetic */ getQEK5gGoQ RemoteActionCompatParcelizer;
    public final /* synthetic */ AppMeasurementDynamiteService read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ LookaheadScopeKtLookaheadScope21(AppMeasurementDynamiteService appMeasurementDynamiteService, getQEK5gGoQ getqek5ggoq, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = getqek5ggoq;
        this.read = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        if (this.serializer == 0) {
            setViewportBounds setviewportboundsMediaDescriptionCompat = this.read.zza.MediaDescriptionCompat();
            getQEK5gGoQ getqek5ggoq = this.RemoteActionCompatParcelizer;
            setviewportboundsMediaDescriptionCompat.MediaSessionCompatToken();
            setviewportboundsMediaDescriptionCompat.serializer();
            setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer((Runnable) new SynchronizationContext$1(11, setviewportboundsMediaDescriptionCompat, setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer(false), getqek5ggoq, false));
            return;
        }
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.read;
        onLayoutRectChangeddefault onlayoutrectchangeddefault = appMeasurementDynamiteService.zza.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = appMeasurementDynamiteService.zza;
        if (lookaheadScopeKtLookaheadScope221.IconCompatParcelizer != null && lookaheadScopeKtLookaheadScope221.IconCompatParcelizer.booleanValue()) {
            z = true;
        }
        onlayoutrectchangeddefault.write(this.RemoteActionCompatParcelizer, z);
    }
}
