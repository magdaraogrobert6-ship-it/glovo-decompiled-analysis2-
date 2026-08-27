package o;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class populatePushStoryPage {
    private final String IconCompatParcelizer = serializer();
    private final int MediaDescriptionCompat;
    private final int RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final File read;
    private final String serializer;
    private final String write;

    public final int IconCompatParcelizer() {
        return this.RatingCompat;
    }

    public final String MediaBrowserCompatMediaItem() {
        return this.write;
    }

    public final String MediaSessionCompatQueueItem() {
        return this.serializer;
    }

    public final File RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int write() {
        return this.MediaDescriptionCompat;
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public final String serializer() {
        return this.serializer + "." + this.RemoteActionCompatParcelizer + "." + this.write;
    }

    public populatePushStoryPage(File file, String str, String str2, int i, int i2) {
        this.read = file;
        this.serializer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = i + "." + i2;
        this.RatingCompat = i;
        this.MediaDescriptionCompat = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.IconCompatParcelizer.equals(((populatePushStoryPage) obj).IconCompatParcelizer);
    }
}
