package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class handleQueryAction {
    public final List IconCompatParcelizer;
    public final boolean MediaDescriptionCompat;
    public final handleUrlOverridelambda00 MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final Collection RemoteActionCompatParcelizer;
    public final Collection read;
    public final int serializer;
    public final boolean write;

    public final handleQueryAction read(handleUrlOverridelambda00 handleurloverridelambda00) {
        handleurloverridelambda00.RemoteActionCompatParcelizer = true;
        Collection collection = this.read;
        if (!collection.contains(handleurloverridelambda00)) {
            return this;
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.remove(handleurloverridelambda00);
        return new handleQueryAction(this.IconCompatParcelizer, Collections.unmodifiableCollection(arrayList), this.RemoteActionCompatParcelizer, this.MediaMetadataCompat, this.write, this.MediaDescriptionCompat, this.MediaSessionCompatQueueItem, this.serializer);
    }

    public final handleQueryAction IconCompatParcelizer(handleUrlOverridelambda00 handleurloverridelambda00) {
        ArrayList arrayList = new ArrayList(this.RemoteActionCompatParcelizer);
        arrayList.remove(handleurloverridelambda00);
        return new handleQueryAction(this.IconCompatParcelizer, this.read, Collections.unmodifiableCollection(arrayList), this.MediaMetadataCompat, this.write, this.MediaDescriptionCompat, this.MediaSessionCompatQueueItem, this.serializer);
    }

    public final handleQueryAction IconCompatParcelizer(handleUrlOverridelambda00 handleurloverridelambda00, handleUrlOverridelambda00 handleurloverridelambda01) {
        ArrayList arrayList = new ArrayList(this.RemoteActionCompatParcelizer);
        arrayList.remove(handleurloverridelambda00);
        arrayList.add(handleurloverridelambda01);
        return new handleQueryAction(this.IconCompatParcelizer, this.read, Collections.unmodifiableCollection(arrayList), this.MediaMetadataCompat, this.write, this.MediaDescriptionCompat, this.MediaSessionCompatQueueItem, this.serializer);
    }

    public handleQueryAction(List list, Collection collection, Collection collection2, handleUrlOverridelambda00 handleurloverridelambda00, boolean z, boolean z2, boolean z3, int i) {
        this.IconCompatParcelizer = list;
        TextStreamsKt.serializer(collection, "drainedSubstreams");
        this.read = collection;
        this.MediaMetadataCompat = handleurloverridelambda00;
        this.RemoteActionCompatParcelizer = collection2;
        this.write = z;
        this.MediaDescriptionCompat = z2;
        this.MediaSessionCompatQueueItem = z3;
        this.serializer = i;
        boolean z4 = true;
        TextStreamsKt.RemoteActionCompatParcelizer("passThrough should imply buffer is null", !z2 || list == null);
        TextStreamsKt.RemoteActionCompatParcelizer("passThrough should imply winningSubstream != null", (z2 && handleurloverridelambda00 == null) ? false : true);
        TextStreamsKt.RemoteActionCompatParcelizer("passThrough should imply winningSubstream is drained", !z2 || (collection.size() == 1 && collection.contains(handleurloverridelambda00)) || (collection.size() == 0 && handleurloverridelambda00.RemoteActionCompatParcelizer));
        if (z && handleurloverridelambda00 == null) {
            z4 = false;
        }
        TextStreamsKt.RemoteActionCompatParcelizer("cancelled should imply committed", z4);
    }

    public final handleQueryAction serializer(handleUrlOverridelambda00 handleurloverridelambda00) {
        Collection collectionUnmodifiableCollection;
        TextStreamsKt.RemoteActionCompatParcelizer("hedging frozen", !this.MediaSessionCompatQueueItem);
        TextStreamsKt.RemoteActionCompatParcelizer("already committed", this.MediaMetadataCompat == null);
        Collection collection = this.RemoteActionCompatParcelizer;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(handleurloverridelambda00);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(handleurloverridelambda00);
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new handleQueryAction(this.IconCompatParcelizer, this.read, collectionUnmodifiableCollection, this.MediaMetadataCompat, this.write, this.MediaDescriptionCompat, this.MediaSessionCompatQueueItem, this.serializer + 1);
    }

    public final handleQueryAction write(handleUrlOverridelambda00 handleurloverridelambda00) {
        List list;
        TextStreamsKt.RemoteActionCompatParcelizer("Already passThrough", !this.MediaDescriptionCompat);
        boolean z = handleurloverridelambda00.RemoteActionCompatParcelizer;
        Collection collectionUnmodifiableCollection = this.read;
        if (!z) {
            if (collectionUnmodifiableCollection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(handleurloverridelambda00);
            } else {
                ArrayList arrayList = new ArrayList(collectionUnmodifiableCollection);
                arrayList.add(handleurloverridelambda00);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection = collectionUnmodifiableCollection;
        handleUrlOverridelambda00 handleurloverridelambda01 = this.MediaMetadataCompat;
        boolean z2 = handleurloverridelambda01 != null;
        if (z2) {
            TextStreamsKt.RemoteActionCompatParcelizer("Another RPC attempt has already committed", handleurloverridelambda01 == handleurloverridelambda00);
            list = null;
        } else {
            list = this.IconCompatParcelizer;
        }
        return new handleQueryAction(list, collection, this.RemoteActionCompatParcelizer, this.MediaMetadataCompat, this.write, z2, this.MediaSessionCompatQueueItem, this.serializer);
    }
}
