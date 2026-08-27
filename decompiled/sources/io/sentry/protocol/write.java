package io.sentry.protocol;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.setNativeShader;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class write implements RequestPushPermissionStep {
    public ConcurrentHashMap IconCompatParcelizer;
    public String read;
    public String serializer;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.read, this.serializer});
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.read != null) {
            okHttpCall$1.write("name");
            okHttpCall$1.IconCompatParcelizer(this.read);
        }
        if (this.serializer != null) {
            okHttpCall$1.write("version");
            okHttpCall$1.IconCompatParcelizer(this.serializer);
        }
        ConcurrentHashMap concurrentHashMap = this.IconCompatParcelizer;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || write.class != obj.getClass()) {
            return false;
        }
        write writeVar = (write) obj;
        return setNativeShader.write(this.read, writeVar.read) && setNativeShader.write(this.serializer, writeVar.serializer);
    }
}
