package o;

import coil3.disk.DiskLruCache$Editor;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class getUnionannotations {
    public final String IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public final /* synthetic */ getReverseDifferenceannotations MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public DiskLruCache$Editor RemoteActionCompatParcelizer;
    public final long[] write = new long[2];
    public final ArrayList serializer = new ArrayList(2);
    public final ArrayList read = new ArrayList(2);

    public getUnionannotations(getReverseDifferenceannotations getreversedifferenceannotations, String str) {
        this.MediaDescriptionCompat = getreversedifferenceannotations;
        this.IconCompatParcelizer = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.serializer.add(this.MediaDescriptionCompat.IconCompatParcelizer.write(sb.toString()));
            sb.append(".tmp");
            this.read.add(this.MediaDescriptionCompat.IconCompatParcelizer.write(sb.toString()));
            sb.setLength(length);
        }
    }

    public final getXorannotations read() {
        if (!this.MediaSessionCompatQueueItem || this.RemoteActionCompatParcelizer != null || this.MediaBrowserCompatMediaItem) {
            return null;
        }
        ArrayList arrayList = this.serializer;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            getReverseDifferenceannotations getreversedifferenceannotations = this.MediaDescriptionCompat;
            if (i >= size) {
                this.MediaMetadataCompat++;
                return new getXorannotations(getreversedifferenceannotations, this);
            }
            if (!getreversedifferenceannotations.write.MediaBrowserCompatMediaItem((RecyclableBufferedInputStream) arrayList.get(i))) {
                try {
                    getreversedifferenceannotations.serializer(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
