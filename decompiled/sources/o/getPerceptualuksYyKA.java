package o;

import coil3.disk.DiskLruCache$Editor;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class getPerceptualuksYyKA {
    public DiskLruCache$Editor IconCompatParcelizer;
    public boolean MediaSessionCompatQueueItem;
    public final /* synthetic */ getRelativeuksYyKA RatingCompat;
    public final File[] RemoteActionCompatParcelizer;
    public final long[] read;
    public final String serializer;
    public final File[] write;

    public final String write() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.read) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }

    public getPerceptualuksYyKA(getRelativeuksYyKA getrelativeuksyyka, String str) {
        this.RatingCompat = getrelativeuksyyka;
        this.serializer = str;
        int i = getrelativeuksyyka.PlaybackStateCompat;
        File file = getrelativeuksyyka.serializer;
        this.read = new long[i];
        this.write = new File[i];
        this.RemoteActionCompatParcelizer = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(i2);
            this.write[i2] = new File(file, sb.toString());
            sb.append(".tmp");
            this.RemoteActionCompatParcelizer[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }
}
