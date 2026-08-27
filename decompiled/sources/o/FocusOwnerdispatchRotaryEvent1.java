package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class FocusOwnerdispatchRotaryEvent1 {
    public final String IconCompatParcelizer;
    public final int MediaSessionCompatQueueItem;
    public final boolean RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final Uri write;

    public FocusOwnerdispatchRotaryEvent1(String str, String str2) {
        this.write = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.serializer = 0;
        this.MediaSessionCompatQueueItem = 400;
        this.RemoteActionCompatParcelizer = false;
        this.IconCompatParcelizer = str2;
        this.read = 0;
    }

    public FocusOwnerdispatchRotaryEvent1(Uri uri, int i, int i2, boolean z, String str, int i3) {
        uri.getClass();
        this.write = uri;
        this.serializer = i;
        this.MediaSessionCompatQueueItem = i2;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = str;
        this.read = i3;
    }
}
