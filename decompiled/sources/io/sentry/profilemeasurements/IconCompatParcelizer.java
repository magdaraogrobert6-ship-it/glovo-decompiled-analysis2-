package io.sentry.profilemeasurements;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.setNativeShader;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class IconCompatParcelizer implements RequestPushPermissionStep {
    public double IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public ConcurrentHashMap read;
    public double serializer;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.read, this.RemoteActionCompatParcelizer, Double.valueOf(this.serializer)});
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("value");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, Double.valueOf(this.serializer));
        okHttpCall$1.write("elapsed_since_start_ns");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.RemoteActionCompatParcelizer);
        okHttpCall$1.write("timestamp");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, BigDecimal.valueOf(this.IconCompatParcelizer).setScale(6, RoundingMode.DOWN));
        ConcurrentHashMap concurrentHashMap = this.read;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.read, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public IconCompatParcelizer(Long l, Number number, long j) {
        this.RemoteActionCompatParcelizer = l.toString();
        this.serializer = number.doubleValue();
        this.IconCompatParcelizer = j / 1.0E9d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IconCompatParcelizer.class != obj.getClass()) {
            return false;
        }
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
        return setNativeShader.write(this.read, iconCompatParcelizer.read) && this.RemoteActionCompatParcelizer.equals(iconCompatParcelizer.RemoteActionCompatParcelizer) && this.serializer == iconCompatParcelizer.serializer && this.IconCompatParcelizer == iconCompatParcelizer.IconCompatParcelizer;
    }
}
