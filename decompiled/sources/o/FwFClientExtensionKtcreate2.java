package o;

/* JADX INFO: loaded from: classes4.dex */
public final class FwFClientExtensionKtcreate2 implements FwFClientExtensionKtgetVariationsevalResults1 {
    public final Timer RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ FwFClientExtensionKtcreate2(Timer timer, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = timer;
    }

    @Override // o.FwFClientExtensionKtgetVariationsevalResults1
    public final void onFailure(syncCustomerProfile synccustomerprofile, Throwable th) {
        int i = this.read;
        Timer timer = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            timer.completeExceptionally(th);
        } else {
            timer.completeExceptionally(th);
        }
    }

    @Override // o.FwFClientExtensionKtgetVariationsevalResults1
    public final void onResponse(syncCustomerProfile synccustomerprofile, getHoldoutVariationName getholdoutvariationname) {
        int i = this.read;
        Timer timer = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            timer.complete(getholdoutvariationname);
        } else if (getholdoutvariationname.rawResponse.isSuccessful) {
            timer.complete(getholdoutvariationname.body);
        } else {
            timer.completeExceptionally(new retrofit2.HttpException(getholdoutvariationname));
        }
    }
}
