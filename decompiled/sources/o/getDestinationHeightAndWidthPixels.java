package o;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public final class getDestinationHeightAndWidthPixels {
    public final Field IconCompatParcelizer;
    public final String serializer;
    public final JsonAdapter write;

    public final void IconCompatParcelizer(JsonWriter jsonWriter, Object obj) throws IllegalAccessException {
        this.write.toJson(jsonWriter, this.IconCompatParcelizer.get(obj));
    }

    public final void write(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels, Object obj) throws IllegalAccessException {
        this.IconCompatParcelizer.set(obj, this.write.fromJson(getdisplayheightandwidthpixels));
    }

    public getDestinationHeightAndWidthPixels(String str, Field field, JsonAdapter jsonAdapter) {
        this.serializer = str;
        this.IconCompatParcelizer = field;
        this.write = jsonAdapter;
    }
}
