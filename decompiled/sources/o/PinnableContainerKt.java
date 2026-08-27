package o;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class PinnableContainerKt implements OnSuccessListener, OnFailureListener, PinnableContainerPinnedHandle {
    public final Object IconCompatParcelizer = new Object();
    public Exception MediaBrowserCompatMediaItem;
    public boolean MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public final zzw read;
    public int serializer;
    public final int write;

    @Override // o.PinnableContainerPinnedHandle
    public final void onCanceled() {
        synchronized (this.IconCompatParcelizer) {
            this.MediaSessionCompatQueueItem++;
            this.MediaMetadataCompat = true;
            write();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        synchronized (this.IconCompatParcelizer) {
            this.serializer++;
            this.MediaBrowserCompatMediaItem = exc;
            write();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        synchronized (this.IconCompatParcelizer) {
            this.RemoteActionCompatParcelizer++;
            write();
        }
    }

    public final void write() {
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.serializer;
        int i3 = this.MediaSessionCompatQueueItem;
        int i4 = this.write;
        if (i + i2 + i3 == i4) {
            Exception exc = this.MediaBrowserCompatMediaItem;
            zzw zzwVar = this.read;
            if (exc == null) {
                if (this.MediaMetadataCompat) {
                    zzwVar.read();
                    return;
                } else {
                    zzwVar.read(null);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + String.valueOf(i2).length() + 8 + 24);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i4);
            sb.append(" underlying tasks failed");
            zzwVar.RemoteActionCompatParcelizer((Exception) new ExecutionException(sb.toString(), this.MediaBrowserCompatMediaItem));
        }
    }

    public PinnableContainerKt(int i, zzw zzwVar) {
        this.write = i;
        this.read = zzwVar;
    }
}
