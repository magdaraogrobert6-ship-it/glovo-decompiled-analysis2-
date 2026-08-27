package o;

import com.sentiance.sdk.ondevice.api.OnDeviceTileDebug;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class getNotificationStylelambda1 implements r8lambdaA5Nojo_weyBvRJwWwexNGN83YI {
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ getNotificationStylelambda1(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI
    public final void RemoteActionCompatParcelizer() {
        if (this.IconCompatParcelizer != 0) {
            OnDeviceTileDebug.lambda$getTiles$4(null);
        } else {
            OnDeviceTileDebug.lambda$getZippedTiles$1(null);
        }
    }
}
