package o;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public final class BaseCardViewsetImageViewToUrl1 extends Thread {
    public final /* synthetic */ int IconCompatParcelizer = 0;

    public /* synthetic */ BaseCardViewsetImageViewToUrl1(String str) {
        super(str);
    }

    public /* synthetic */ BaseCardViewsetImageViewToUrl1(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (this.IconCompatParcelizer != 0) {
            Process.setThreadPriority(19);
            synchronized (this) {
                while (true) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
            }
        } else {
            while (true) {
                try {
                    CSSParseException cSSParseException = onPreDraw.MediaBrowserCompatMediaItem;
                    ReentrantLock reentrantLock = onPreDraw.RatingCompat;
                    reentrantLock.lock();
                    try {
                        onPreDraw onpredrawIconCompatParcelizer = io.sentry.util.MediaBrowserCompatMediaItem.IconCompatParcelizer();
                        if (onpredrawIconCompatParcelizer == onPreDraw.serializer) {
                            onPreDraw.serializer = null;
                            return;
                        } else {
                            reentrantLock.unlock();
                            if (onpredrawIconCompatParcelizer != null) {
                                onpredrawIconCompatParcelizer.read();
                            }
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                } catch (InterruptedException unused2) {
                }
            }
        }
    }
}
