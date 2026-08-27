package o;

import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class getLocalPinnableContainer implements Runnable {
    public final /* synthetic */ ParentDataModifierDefaultImpls read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ getLocalPinnableContainer(int i, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        this.serializer = i;
        this.read = parentDataModifierDefaultImpls;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = this.read;
        if (i == 0) {
            parentDataModifierDefaultImpls.IconCompatParcelizer((Exception) new TimeoutException());
        } else if (parentDataModifierDefaultImpls.IconCompatParcelizer((Exception) new IOException("TIMEOUT"))) {
            SentryLogcatAdapter.IconCompatParcelizer("Rpc", "No response");
        }
    }
}
