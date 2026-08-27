package o;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes2.dex */
public final class getSafeDrawing {
    public final int RemoteActionCompatParcelizer;
    public final PendingIntent serializer;
    public boolean write = false;

    public final PendingIntent IconCompatParcelizer(getCurrenthdzbrEE getcurrenthdzbree) {
        PendingIntent pendingIntent = this.serializer;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        return null;
    }

    public final boolean IconCompatParcelizer() {
        PendingIntent pendingIntent = this.serializer;
        if (pendingIntent == null) {
            pendingIntent = null;
        }
        return pendingIntent != null;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final void read() {
        this.write = true;
    }

    public final int write() {
        return this.RemoteActionCompatParcelizer;
    }

    public getSafeDrawing(int i, long j, long j2, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = pendingIntent;
    }

    public final boolean read(getCurrenthdzbrEE getcurrenthdzbree) {
        PendingIntent pendingIntent = this.serializer;
        if (pendingIntent == null) {
            pendingIntent = null;
        }
        return pendingIntent != null;
    }
}
