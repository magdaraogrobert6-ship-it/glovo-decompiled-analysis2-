package o;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class getCommaEK5gGoQ implements ThreadFactory {
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ getCommaEK5gGoQ(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.IconCompatParcelizer;
        if (i != 0) {
            return i != 1 ? new Thread(runnable, "google-tag-manager-scheduler-thread") : new Thread(new accessgetTvRadioServicecp(runnable, 1), "glide-active-resources");
        }
        return new Thread(runnable, "google-tag-manager-background-thread");
    }
}
