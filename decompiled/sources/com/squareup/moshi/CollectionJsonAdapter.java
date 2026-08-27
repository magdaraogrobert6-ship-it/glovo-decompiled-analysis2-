package com.squareup.moshi;

import java.util.Collection;
import java.util.Iterator;
import o.getDisplayHeightAndWidthPixels;
import o.getRemoteBitmap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CollectionJsonAdapter extends JsonAdapter {
    public static final getRemoteBitmap RemoteActionCompatParcelizer = new getRemoteBitmap(3);
    public final JsonAdapter IconCompatParcelizer;

    public abstract Collection write();

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, Object obj) {
        jsonWriter.RemoteActionCompatParcelizer();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            this.IconCompatParcelizer.toJson(jsonWriter, it.next());
        }
        jsonWriter.write();
    }

    public final String toString() {
        return this.IconCompatParcelizer + ".collection()";
    }

    public CollectionJsonAdapter(JsonAdapter jsonAdapter) {
        this.IconCompatParcelizer = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        Collection collectionWrite = write();
        getdisplayheightandwidthpixels.serializer();
        while (getdisplayheightandwidthpixels.MediaBrowserCompatMediaItem()) {
            collectionWrite.add(this.IconCompatParcelizer.fromJson(getdisplayheightandwidthpixels));
        }
        getdisplayheightandwidthpixels.write();
        return collectionWrite;
    }
}
