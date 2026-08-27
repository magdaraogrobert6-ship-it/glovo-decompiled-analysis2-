package o;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaA5ZM0ZZHuWQ_bt3yrmvyjurWj8 implements Runnable {
    public volatile AtomicInteger IconCompatParcelizer = new AtomicInteger(0);
    public final setMessageImageView read;
    public final /* synthetic */ clipCanvasToPath serializer;

    public r8lambdaA5ZM0ZZHuWQ_bt3yrmvyjurWj8(clipCanvasToPath clipcanvastopath, setMessageImageView setmessageimageview) {
        this.serializer = clipcanvastopath;
        this.read = setmessageimageview;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0;
        String strConcat = "OkHttp ".concat(this.serializer.originalRequest.url.MediaSessionCompatQueueItem());
        clipCanvasToPath clipcanvastopath = this.serializer;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            clipcanvastopath.timeout.IconCompatParcelizer();
            boolean z = false;
            try {
                try {
                    try {
                        this.read.onResponse(clipcanvastopath, clipcanvastopath.IconCompatParcelizer());
                        r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 = clipcanvastopath.client;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            getMaxSafeTopInset getmaxsafetopinset = getMaxSafeTopInset.MediaDescriptionCompat;
                            getMaxSafeTopInset.MediaDescriptionCompat.read(4, "Callback failure for ".concat(clipCanvasToPath.RemoteActionCompatParcelizer(clipcanvastopath)), e);
                        } else {
                            this.read.onFailure(clipcanvastopath, e);
                        }
                        r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 = clipcanvastopath.client;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        clipcanvastopath.write();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            markOnScreenCardsAsReadlambda1.read(iOException, th);
                            this.read.onFailure(clipcanvastopath, iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    clipcanvastopath.client.dispatcher.RemoteActionCompatParcelizer(this);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0.dispatcher.RemoteActionCompatParcelizer(this);
            threadCurrentThread.setName(name);
        } catch (Throwable th4) {
            threadCurrentThread.setName(name);
            throw th4;
        }
    }
}
