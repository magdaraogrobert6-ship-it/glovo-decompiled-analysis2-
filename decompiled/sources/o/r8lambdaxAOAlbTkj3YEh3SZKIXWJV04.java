package o;

import com.sentiance.sdk.ondevice.api.OnDeviceDebug;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r8lambdaxAOAlbTkj3YEh3SZKIXWJV04 implements r8lambdaA5Nojo_weyBvRJwWwexNGN83YI {
    public final /* synthetic */ OnDeviceDebug RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ r8lambdaxAOAlbTkj3YEh3SZKIXWJV04(OnDeviceDebug onDeviceDebug, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = onDeviceDebug;
    }

    @Override // o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI
    public final void RemoteActionCompatParcelizer() {
        int i = this.read;
        OnDeviceDebug onDeviceDebug = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            onDeviceDebug.lambda$getStationaryVenues$4(null);
        } else if (i != 1) {
            onDeviceDebug.lambda$setTimelineUpdateListener$2(null);
        } else {
            onDeviceDebug.lambda$setTransportClassificationEventListener$0(null);
        }
    }
}
