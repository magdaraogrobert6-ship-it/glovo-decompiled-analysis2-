package o;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class AndroidGraphicsContext2 extends accessunregisterComponentCallback {
    public final void serializer(Object obj) {
        boolean z;
        synchronized (this.MediaMetadataCompat) {
            z = this.PlaybackStateCompatCustomAction == accessunregisterComponentCallback.MediaSessionCompatQueueItem;
            this.PlaybackStateCompatCustomAction = obj;
        }
        if (z) {
            setSupportButtonTintMode setsupportbuttontintmodeIconCompatParcelizer = setSupportButtonTintMode.IconCompatParcelizer();
            registerComponentCallback registercomponentcallback = this.MediaSessionCompatResultReceiverWrapper;
            setSupportCheckMarkTintMode setsupportcheckmarktintmode = setsupportbuttontintmodeIconCompatParcelizer.serializer;
            if (setsupportcheckmarktintmode.RemoteActionCompatParcelizer == null) {
                synchronized (setsupportcheckmarktintmode.write) {
                    if (setsupportcheckmarktintmode.RemoteActionCompatParcelizer == null) {
                        setsupportcheckmarktintmode.RemoteActionCompatParcelizer = Handler.createAsync(Looper.getMainLooper());
                    }
                }
            }
            setsupportcheckmarktintmode.RemoteActionCompatParcelizer.post(registercomponentcallback);
        }
    }

    @Override // o.accessunregisterComponentCallback
    public void RemoteActionCompatParcelizer(Object obj) {
        accessunregisterComponentCallback.write("setValue");
        this.ResultReceiver++;
        this.RatingCompat = obj;
        RemoteActionCompatParcelizer((obtainViewLayerContainer) null);
    }

    public AndroidGraphicsContext2(Object obj) {
        super(obj);
    }

    public AndroidGraphicsContext2() {
    }
}
