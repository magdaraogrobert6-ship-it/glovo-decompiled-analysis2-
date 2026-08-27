package o;

import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class getRunningExperimentId implements Disposable {
    public volatile boolean IconCompatParcelizer;
    public final syncCustomerProfile write;

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.IconCompatParcelizer = true;
        this.write.IconCompatParcelizer();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.IconCompatParcelizer;
    }

    public getRunningExperimentId(syncCustomerProfile synccustomerprofile) {
        this.write = synccustomerprofile;
    }
}
