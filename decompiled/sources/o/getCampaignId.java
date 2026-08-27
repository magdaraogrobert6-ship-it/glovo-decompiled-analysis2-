package o;

import android.util.Log;
import com.sentiance.sdk.threading.executors.ExecutorException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class getCampaignId implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ getContentText read;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        boolean z;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        String stackTraceString;
        Throwable cause;
        synchronized (this.read) {
            z = this.read.MediaSessionCompatQueueItem;
            uncaughtExceptionHandler = this.read.MediaDescriptionCompat;
        }
        Boolean bool = Boolean.TRUE;
        if (bool.equals(getContentText.RemoteActionCompatParcelizer.get())) {
            this.read.write.write("Exception already handled for this thread, skipping... (%s)", th.getMessage());
        } else {
            getContentText.RemoteActionCompatParcelizer.set(bool);
            getContentText getcontenttext = this.read;
            if (!getcontenttext.MediaMetadataCompat.isEmpty()) {
                Iterator it = getcontenttext.MediaMetadataCompat.iterator();
                while (it.hasNext()) {
                    r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk.IconCompatParcelizer(((r8lambdaVml774X4gjiH7QFyyZqBCMSepGQ) it.next()).serializer);
                }
            }
            if (z) {
                getContentText getcontenttext2 = this.read;
                try {
                    stackTraceString = (!(th instanceof ExecutorException) || (cause = th.getCause()) == null) ? Log.getStackTraceString(th) : Log.getStackTraceString(cause);
                } catch (Throwable unused) {
                    stackTraceString = null;
                }
                if (stackTraceString == null) {
                    stackTraceString = "";
                }
                try {
                    getVerticalAccuracy getverticalaccuracy = getcontenttext2.IconCompatParcelizer;
                    getcontenttext2.serializer.getClass();
                    getcontenttext2.read.IconCompatParcelizer(getverticalaccuracy.read(System.currentTimeMillis(), stackTraceString));
                    getcontenttext2.write.IconCompatParcelizer(false, th, "", new Object[0]);
                } catch (Throwable unused2) {
                }
            }
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public getCampaignId(getContentText getcontenttext) {
        this.read = getcontenttext;
    }
}
