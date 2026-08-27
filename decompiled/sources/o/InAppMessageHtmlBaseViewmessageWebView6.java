package o;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class InAppMessageHtmlBaseViewmessageWebView6 implements ThreadFactory {
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.IconCompatParcelizer);
        thread.setDaemon(this.RemoteActionCompatParcelizer);
        return thread;
    }

    public /* synthetic */ InAppMessageHtmlBaseViewmessageWebView6(String str, boolean z) {
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = z;
    }
}
