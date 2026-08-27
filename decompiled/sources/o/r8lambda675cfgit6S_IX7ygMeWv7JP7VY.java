package o;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambda675cfgit6S_IX7ygMeWv7JP7VY implements Runnable {
    final /* synthetic */ BrazeInternalLocationApi RemoteActionCompatParcelizer;

    @Override // java.lang.Runnable
    public final void run() {
        BrazeInternalLocationApi brazeInternalLocationApi = this.RemoteActionCompatParcelizer;
        brazeInternalLocationApi.write();
        brazeInternalLocationApi.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    public r8lambda675cfgit6S_IX7ygMeWv7JP7VY(BrazeInternalLocationApi brazeInternalLocationApi, Bundle bundle, long j) {
        this.RemoteActionCompatParcelizer = brazeInternalLocationApi;
    }
}
