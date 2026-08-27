package o;

import com.sentiance.sdk.OnInitCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaA7HtEaFcO66TIYU2_NPKLeRVvQ implements Runnable {
    final /* synthetic */ Throwable IconCompatParcelizer;
    final /* synthetic */ OnInitCallback write;

    public r8lambdaA7HtEaFcO66TIYU2_NPKLeRVvQ(OnInitCallback onInitCallback, Throwable th) {
        this.write = onInitCallback;
        this.IconCompatParcelizer = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnInitCallback onInitCallback = this.write;
        if (onInitCallback != null) {
            onInitCallback.onInitFailure(OnInitCallback.InitIssue.INITIALIZATION_ERROR, this.IconCompatParcelizer);
        }
    }
}
