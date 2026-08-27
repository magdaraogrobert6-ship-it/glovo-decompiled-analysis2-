package o;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;

/* JADX INFO: loaded from: classes4.dex */
public final class getDisplayWidthPixels extends JsonAdapter {
    public final /* synthetic */ int read;
    public final /* synthetic */ JsonAdapter write;

    public /* synthetic */ getDisplayWidthPixels(JsonAdapter jsonAdapter, int i) {
        this.read = i;
        this.write = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final boolean isLenient() {
        int i = this.read;
        JsonAdapter jsonAdapter = this.write;
        if (i == 0) {
            return jsonAdapter.isLenient();
        }
        if (i != 1) {
            return jsonAdapter.isLenient();
        }
        return true;
    }

    public final String toString() {
        int i = this.read;
        JsonAdapter jsonAdapter = this.write;
        if (i == 0) {
            return jsonAdapter + ".serializeNulls()";
        }
        if (i != 1) {
            return jsonAdapter + ".failOnUnknown()";
        }
        return jsonAdapter + ".lenient()";
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        int i = this.read;
        JsonAdapter jsonAdapter = this.write;
        if (i == 0) {
            return jsonAdapter.fromJson(getdisplayheightandwidthpixels);
        }
        if (i != 1) {
            boolean z = getdisplayheightandwidthpixels.RemoteActionCompatParcelizer;
            getdisplayheightandwidthpixels.RemoteActionCompatParcelizer = true;
            try {
                return jsonAdapter.fromJson(getdisplayheightandwidthpixels);
            } finally {
                getdisplayheightandwidthpixels.RemoteActionCompatParcelizer = z;
            }
        }
        boolean z2 = getdisplayheightandwidthpixels.write;
        getdisplayheightandwidthpixels.write = true;
        try {
            return jsonAdapter.fromJson(getdisplayheightandwidthpixels);
        } finally {
            getdisplayheightandwidthpixels.write = z2;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        int i = this.read;
        JsonAdapter jsonAdapter = this.write;
        if (i == 0) {
            boolean z = jsonWriter.PlaybackStateCompat;
            jsonWriter.PlaybackStateCompat = true;
            try {
                jsonAdapter.toJson(jsonWriter, obj);
                return;
            } finally {
                jsonWriter.PlaybackStateCompat = z;
            }
        }
        if (i != 1) {
            jsonAdapter.toJson(jsonWriter, obj);
            return;
        }
        boolean z2 = jsonWriter.MediaSessionCompatQueueItem;
        jsonWriter.MediaSessionCompatQueueItem = true;
        try {
            jsonAdapter.toJson(jsonWriter, obj);
        } finally {
            jsonWriter.MediaSessionCompatQueueItem = z2;
        }
    }
}
