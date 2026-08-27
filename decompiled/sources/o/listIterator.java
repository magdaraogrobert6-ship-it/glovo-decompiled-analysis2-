package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class listIterator {
    public final String IconCompatParcelizer;
    public final Object MediaBrowserCompatMediaItem;
    public final isSemanticsInvalidatedui MediaSessionCompatQueueItem;
    public final requestRemeasureui RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final removeNodeAtDepth read;
    public final byte[] serializer;
    public final Object write;

    public listIterator(Object obj, Object obj2, byte[] bArr, isSemanticsInvalidatedui issemanticsinvalidatedui, requestRemeasureui requestremeasureui, int i, String str, removeNodeAtDepth removenodeatdepth) {
        this.write = obj;
        this.MediaBrowserCompatMediaItem = obj2;
        this.serializer = Arrays.copyOf(bArr, bArr.length);
        this.MediaSessionCompatQueueItem = issemanticsinvalidatedui;
        this.RatingCompat = requestremeasureui;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = str;
        this.read = removenodeatdepth;
    }
}
