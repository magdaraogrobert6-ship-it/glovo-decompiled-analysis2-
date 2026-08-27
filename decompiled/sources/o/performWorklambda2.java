package o;

import com.sentiance.sdk.OnInitCallback;
import com.sentiance.sdk.SdkException;

/* JADX INFO: loaded from: classes5.dex */
final class performWorklambda2 implements Runnable {
    final /* synthetic */ r8lambdaTDxYAs0BD_svpym_2igOwG7FG0 write;

    @Override // java.lang.Runnable
    public final void run() {
        OnInitCallback onInitCallback = this.write.RemoteActionCompatParcelizer;
        if (onInitCallback != null) {
            onInitCallback.onInitFailure(OnInitCallback.InitIssue.INITIALIZATION_ERROR, new SdkException("Previous reset operation failed."));
        }
    }

    public performWorklambda2(r8lambdaTDxYAs0BD_svpym_2igOwG7FG0 r8lambdatdxyas0bd_svpym_2igowg7fg0) {
        this.write = r8lambdatdxyas0bd_svpym_2igowg7fg0;
    }
}
