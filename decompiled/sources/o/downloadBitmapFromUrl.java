package o;

import com.sentiance.sdk.Sentiance;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class downloadBitmapFromUrl implements r8lambdaA5Nojo_weyBvRJwWwexNGN83YI {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ boolean serializer;

    public /* synthetic */ downloadBitmapFromUrl(boolean z, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = z;
    }

    @Override // o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI
    public final void RemoteActionCompatParcelizer() {
        int i = this.IconCompatParcelizer;
        boolean z = this.serializer;
        if (i != 0) {
            Sentiance.lambda$setAppSessionDataCollectionEnabled$47(z);
        } else {
            Sentiance.lambda$setIsAllowedToUseMobileData$49(z);
        }
    }
}
