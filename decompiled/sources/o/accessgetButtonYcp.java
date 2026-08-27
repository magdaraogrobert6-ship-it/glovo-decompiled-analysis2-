package o;

import android.util.JsonToken;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButtonYcp {
    public final long IconCompatParcelizer;

    public static accessgetButtonYcp write(BufferedReader bufferedReader) throws IOException {
        android.util.JsonReader jsonReader = new android.util.JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        accessgetButtonYcp accessgetbuttonycp = new accessgetButtonYcp(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return accessgetbuttonycp;
                    }
                    accessgetButtonYcp accessgetbuttonycp2 = new accessgetButtonYcp(jsonReader.nextLong());
                    jsonReader.close();
                    return accessgetbuttonycp2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public final int hashCode() {
        long j = this.IconCompatParcelizer;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public accessgetButtonYcp(long j) {
        this.IconCompatParcelizer = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof accessgetButtonYcp) && this.IconCompatParcelizer == ((accessgetButtonYcp) obj).IconCompatParcelizer;
    }

    public final String toString() {
        return c8$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
