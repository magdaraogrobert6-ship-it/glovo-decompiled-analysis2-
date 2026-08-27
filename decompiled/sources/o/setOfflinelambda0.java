package o;

import com.sentiance.sdk.Sentiance;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setOfflinelambda0 implements r8lambdaA5Nojo_weyBvRJwWwexNGN83YI {
    public final /* synthetic */ Sentiance IconCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ setOfflinelambda0(Sentiance sentiance, int i) {
        this.write = i;
        this.IconCompatParcelizer = sentiance;
    }

    @Override // o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI
    public final void RemoteActionCompatParcelizer() {
        int i = this.write;
        Sentiance sentiance = this.IconCompatParcelizer;
        if (i != 0) {
            sentiance.lambda$disableBatteryOptimization$25();
        } else {
            sentiance.lambda$stop$11();
        }
    }
}
