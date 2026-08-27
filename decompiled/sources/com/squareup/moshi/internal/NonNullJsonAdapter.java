package com.squareup.moshi.internal;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonWriter;
import o.getDisplayHeightAndWidthPixels;
import o.getLocalBitmaplambda3;

/* JADX INFO: loaded from: classes4.dex */
public final class NonNullJsonAdapter extends JsonAdapter {
    public final JsonAdapter write;

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            throw new JsonDataException("Unexpected null at ".concat(jsonWriter.MediaBrowserCompatMediaItem()), 0);
        }
        this.write.toJson(jsonWriter, obj);
    }

    public final String toString() {
        return this.write + ".nonNull()";
    }

    public NonNullJsonAdapter(JsonAdapter jsonAdapter) {
        this.write = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        if (getdisplayheightandwidthpixels.MediaSessionCompatToken() != getLocalBitmaplambda3.NULL) {
            return this.write.fromJson(getdisplayheightandwidthpixels);
        }
        throw new JsonDataException("Unexpected null at ".concat(getdisplayheightandwidthpixels.RemoteActionCompatParcelizer()), 0);
    }
}
