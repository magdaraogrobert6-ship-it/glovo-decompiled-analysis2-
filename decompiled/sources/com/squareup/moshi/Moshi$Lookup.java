package com.squareup.moshi;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.reflect.Type;
import o.getDisplayHeightAndWidthPixels;

/* JADX INFO: loaded from: classes4.dex */
public final class Moshi$Lookup extends JsonAdapter {
    public final Object IconCompatParcelizer;
    public final Type RemoteActionCompatParcelizer;
    public JsonAdapter read;
    public final String write;

    public Moshi$Lookup(Type type, String str, Object obj) {
        this.RemoteActionCompatParcelizer = type;
        this.write = str;
        this.IconCompatParcelizer = obj;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        JsonAdapter jsonAdapter = this.read;
        if (jsonAdapter != null) {
            return jsonAdapter.fromJson(getdisplayheightandwidthpixels);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("JsonAdapter isn't ready");
        return null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        JsonAdapter jsonAdapter = this.read;
        if (jsonAdapter != null) {
            jsonAdapter.toJson(jsonWriter, obj);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("JsonAdapter isn't ready");
        }
    }

    public final String toString() {
        JsonAdapter jsonAdapter = this.read;
        return jsonAdapter != null ? jsonAdapter.toString() : super.toString();
    }
}
