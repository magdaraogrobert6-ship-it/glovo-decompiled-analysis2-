package com.squareup.moshi.internal;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;
import o.getDisplayHeightAndWidthPixels;
import o.getLocalBitmaplambda3;

/* JADX INFO: loaded from: classes4.dex */
public final class NullSafeJsonAdapter extends JsonAdapter {
    public final JsonAdapter RemoteActionCompatParcelizer;

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.MediaDescriptionCompat();
        } else {
            this.RemoteActionCompatParcelizer.toJson(jsonWriter, obj);
        }
    }

    public final String toString() {
        return this.RemoteActionCompatParcelizer + ".nullSafe()";
    }

    public NullSafeJsonAdapter(JsonAdapter jsonAdapter) {
        this.RemoteActionCompatParcelizer = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        if (getdisplayheightandwidthpixels.MediaSessionCompatToken() != getLocalBitmaplambda3.NULL) {
            return this.RemoteActionCompatParcelizer.fromJson(getdisplayheightandwidthpixels);
        }
        getdisplayheightandwidthpixels.MediaSessionCompatResultReceiverWrapper();
        return null;
    }
}
