package o;

import com.google.android.gms.common.api.internal.GoogleApiManager;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetNumPadMoveHomecp implements accessgetNumPadDirectionUpcp {
    public final /* synthetic */ GoogleApiManager write;

    public accessgetNumPadMoveHomecp(GoogleApiManager googleApiManager) {
        this.write = googleApiManager;
    }

    @Override // o.accessgetNumPadDirectionUpcp
    public final void read(boolean z) {
        GoogleApiManager googleApiManager = this.write;
        googleApiManager.ComponentActivity.sendMessage(googleApiManager.ComponentActivity.obtainMessage(1, Boolean.valueOf(z)));
    }
}
