package io.sentry.profilemeasurements;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.setNativeShader;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoteActionCompatParcelizer implements RequestPushPermissionStep {
    public Collection IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public ConcurrentHashMap write;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.write, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer});
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("unit");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.RemoteActionCompatParcelizer);
        okHttpCall$1.write("values");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.IconCompatParcelizer);
        ConcurrentHashMap concurrentHashMap = this.write;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.write, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public RemoteActionCompatParcelizer(String str, AbstractCollection abstractCollection) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = abstractCollection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RemoteActionCompatParcelizer.class != obj.getClass()) {
            return false;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
        return setNativeShader.write(this.write, remoteActionCompatParcelizer.write) && this.RemoteActionCompatParcelizer.equals(remoteActionCompatParcelizer.RemoteActionCompatParcelizer) && new ArrayList(this.IconCompatParcelizer).equals(new ArrayList(remoteActionCompatParcelizer.IconCompatParcelizer));
    }
}
