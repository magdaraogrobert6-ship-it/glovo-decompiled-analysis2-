package com.squareup.moshi;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.squareup.moshi.internal.NonNullJsonAdapter;
import com.squareup.moshi.internal.NullSafeJsonAdapter;
import java.io.IOException;
import o.RegistryMissingComponentException;
import o.RegistryNoImageHeaderParserException;
import o.RegistryNoSourceEncoderAvailableException;
import o.getDisplayHeightAndWidthPixels;
import o.getDisplayWidthPixels;
import o.getLocalBitmaplambda1;
import o.getLocalBitmaplambda3;
import o.getLocalBitmaplambda6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class JsonAdapter {
    public abstract Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels);

    public boolean isLenient() {
        return false;
    }

    public abstract void toJson(JsonWriter jsonWriter, Object obj);

    public final Object fromJson(String str) throws IOException {
        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
        registryMissingComponentException.IconCompatParcelizer(str);
        getLocalBitmaplambda1 getlocalbitmaplambda1 = new getLocalBitmaplambda1(registryMissingComponentException);
        Object objFromJson = fromJson(getlocalbitmaplambda1);
        if (isLenient() || getlocalbitmaplambda1.MediaSessionCompatToken() == getLocalBitmaplambda3.END_DOCUMENT) {
            return objFromJson;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    public final Object fromJsonValue(Object obj) {
        try {
            return fromJson(new JsonValueReader(obj));
        } catch (IOException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
            return null;
        }
    }

    public final String toJson(Object obj) {
        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
        try {
            toJson(registryMissingComponentException, obj);
            return registryMissingComponentException.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        } catch (IOException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
            return null;
        }
    }

    public final Object toJsonValue(Object obj) {
        getLocalBitmaplambda6 getlocalbitmaplambda6 = new getLocalBitmaplambda6();
        try {
            toJson(getlocalbitmaplambda6, obj);
            return getlocalbitmaplambda6.read();
        } catch (IOException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
            return null;
        }
    }

    public final JsonAdapter failOnUnknown() {
        return new getDisplayWidthPixels(this, 2);
    }

    public final JsonAdapter lenient() {
        return new getDisplayWidthPixels(this, 1);
    }

    public final JsonAdapter serializeNulls() {
        return new getDisplayWidthPixels(this, 0);
    }

    public JsonAdapter indent(final String str) {
        if (str != null) {
            return new JsonAdapter() { // from class: com.squareup.moshi.JsonAdapter.4
                @Override // com.squareup.moshi.JsonAdapter
                public final Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
                    return JsonAdapter.this.fromJson(getdisplayheightandwidthpixels);
                }

                @Override // com.squareup.moshi.JsonAdapter
                public final boolean isLenient() {
                    return JsonAdapter.this.isLenient();
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append(JsonAdapter.this);
                    sb.append(".indent(\"");
                    return ff$$ExternalSyntheticOutline0.m(sb, str, "\")");
                }

                @Override // com.squareup.moshi.JsonAdapter
                public final void toJson(JsonWriter jsonWriter, Object obj) {
                    String str2 = jsonWriter.MediaDescriptionCompat;
                    if (str2 == null) {
                        str2 = "";
                    }
                    jsonWriter.write(str);
                    try {
                        JsonAdapter.this.toJson(jsonWriter, obj);
                    } finally {
                        jsonWriter.write(str2);
                    }
                }
            };
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("indent == null");
        return null;
    }

    public final JsonAdapter nonNull() {
        return this instanceof NonNullJsonAdapter ? this : new NonNullJsonAdapter(this);
    }

    public final JsonAdapter nullSafe() {
        return this instanceof NullSafeJsonAdapter ? this : new NullSafeJsonAdapter(this);
    }

    public final void toJson(RegistryNoImageHeaderParserException registryNoImageHeaderParserException, Object obj) throws IOException {
        toJson(JsonWriter.serializer(registryNoImageHeaderParserException), obj);
    }

    public final Object fromJson(RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException) throws IOException {
        return fromJson(new getLocalBitmaplambda1(registryNoSourceEncoderAvailableException));
    }
}
