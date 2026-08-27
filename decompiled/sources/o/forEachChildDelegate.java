package o;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class forEachChildDelegate implements Callable {
    public final /* synthetic */ long IconCompatParcelizer;
    public final /* synthetic */ checkChildrenPlaceOrderForUpdates RemoteActionCompatParcelizer;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.IconCompatParcelizer);
        this.RemoteActionCompatParcelizer.write.read(bundle);
        return null;
    }

    public forEachChildDelegate(checkChildrenPlaceOrderForUpdates checkchildrenplaceorderforupdates, long j) {
        this.RemoteActionCompatParcelizer = checkchildrenplaceorderforupdates;
        this.IconCompatParcelizer = j;
    }
}
