package io.sentry.clientreport;

import java.util.Arrays;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class serializer {
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.RemoteActionCompatParcelizer, this.IconCompatParcelizer});
    }

    public serializer(String str, String str2) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof serializer)) {
            return false;
        }
        serializer serializerVar = (serializer) obj;
        return setNativeShader.write(this.RemoteActionCompatParcelizer, serializerVar.RemoteActionCompatParcelizer) && setNativeShader.write(this.IconCompatParcelizer, serializerVar.IconCompatParcelizer);
    }
}
