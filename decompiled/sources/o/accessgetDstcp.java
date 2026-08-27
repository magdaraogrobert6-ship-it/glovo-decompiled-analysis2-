package o;

import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetDstcp {
    public final long IconCompatParcelizer;
    public long MediaBrowserCompatMediaItem = 0;
    public final int MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final TreeMap MediaSessionCompatQueueItem;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public int[] serializer;
    public int write;

    public accessgetDstcp(String str, String str2, long j, int i, int i2, int i3, int[] iArr, TreeMap treeMap) {
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
        this.IconCompatParcelizer = j;
        this.write = i;
        this.MediaMetadataCompat = i2;
        this.MediaDescriptionCompat = i3;
        this.serializer = iArr;
        this.MediaSessionCompatQueueItem = treeMap;
    }
}
