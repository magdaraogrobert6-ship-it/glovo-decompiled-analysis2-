package com.mapbox.navigation.ui.maps.internal.route.line;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class IntRangeTypeAdapter extends TypeAdapter<ensureSubscribedToInAppMessageEventslambda7> {
    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7) throws IOException {
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda8 = ensuresubscribedtoinappmessageeventslambda7;
        jsonWriter.getClass();
        if (ensuresubscribedtoinappmessageeventslambda8 == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("first").value(Integer.valueOf(ensuresubscribedtoinappmessageeventslambda8.write));
        jsonWriter.name("last").value(Integer.valueOf(ensuresubscribedtoinappmessageeventslambda8.read));
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public final ensureSubscribedToInAppMessageEventslambda7 read2(JsonReader jsonReader) throws IOException {
        jsonReader.getClass();
        Integer numValueOf = null;
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        jsonReader.beginObject();
        Integer numValueOf2 = null;
        for (int i = 0; i < 2; i++) {
            String strNextName = jsonReader.nextName();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strNextName, "first"}, getCieXyz.write())).booleanValue()) {
                numValueOf = Integer.valueOf(jsonReader.nextInt());
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strNextName, "last"}, getCieXyz.write())).booleanValue()) {
                    numValueOf2 = Integer.valueOf(jsonReader.nextInt());
                }
            }
        }
        jsonReader.endObject();
        numValueOf.getClass();
        int iIntValue = numValueOf.intValue();
        numValueOf2.getClass();
        return new ensureSubscribedToInAppMessageEventslambda7(iIntValue, numValueOf2.intValue(), 1);
    }
}
