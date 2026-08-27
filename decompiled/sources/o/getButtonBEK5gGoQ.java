package o;

import android.content.Context;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final class getButtonBEK5gGoQ extends Thread {
    public static getButtonBEK5gGoQ serializer;
    public volatile getButtonStartEK5gGoQ IconCompatParcelizer;
    public final accessgetTvInputComposite1cp MediaDescriptionCompat;
    public volatile boolean RemoteActionCompatParcelizer;
    public final LinkedBlockingQueue read;
    public final Context write;

    public getButtonBEK5gGoQ(Context context) {
        super("GAThread");
        this.read = new LinkedBlockingQueue();
        this.RemoteActionCompatParcelizer = false;
        this.MediaDescriptionCompat = accessgetTvInputComposite1cp.read;
        if (context != null) {
            this.write = context.getApplicationContext();
        } else {
            this.write = null;
        }
        start();
    }

    /* JADX INFO: Infinite loop detected, blocks: 17, insns: 0 */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    Runnable runnable = (Runnable) this.read.take();
                    if (!this.RemoteActionCompatParcelizer) {
                        runnable.run();
                    }
                } catch (InterruptedException e) {
                    e.toString();
                    ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{4}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                }
            } catch (Exception e2) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintStream printStream = new PrintStream(byteArrayOutputStream);
                e2.printStackTrace(printStream);
                printStream.flush();
                getButtonThumbLeftEK5gGoQ.write("Error on Google TagManager Thread: ".concat(new String(byteArrayOutputStream.toByteArray())));
                getButtonThumbLeftEK5gGoQ.write("Google TagManager is shutting down.");
                this.RemoteActionCompatParcelizer = true;
            }
        }
    }
}
