package o;

import io.sentry.SentryClient;
import java.util.Arrays;
import kotlin.TuplesKt;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdagKH6tFShUp2G_hD0a6i5EJD8PU {
    public final r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA IconCompatParcelizer;
    public final SentryClient read;
    public final mergeJsonObjectslambda10 write;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.write, this.IconCompatParcelizer, this.read});
    }

    public final String toString() {
        return "[method=" + this.read + " headers=" + this.IconCompatParcelizer + " callOptions=" + this.write + "]";
    }

    public r8lambdagKH6tFShUp2G_hD0a6i5EJD8PU(SentryClient sentryClient, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa, mergeJsonObjectslambda10 mergejsonobjectslambda10) {
        TextStreamsKt.serializer(sentryClient, "method");
        this.read = sentryClient;
        TextStreamsKt.serializer(r8lambdaqn1du6uas6agx4srbugfttxtpwa, "headers");
        this.IconCompatParcelizer = r8lambdaqn1du6uas6agx4srbugfttxtpwa;
        TextStreamsKt.serializer(mergejsonobjectslambda10, "callOptions");
        this.write = mergejsonobjectslambda10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r8lambdagKH6tFShUp2G_hD0a6i5EJD8PU.class != obj.getClass()) {
            return false;
        }
        r8lambdagKH6tFShUp2G_hD0a6i5EJD8PU r8lambdagkh6tfshup2g_hd0a6i5ejd8pu = (r8lambdagKH6tFShUp2G_hD0a6i5EJD8PU) obj;
        return TuplesKt.RemoteActionCompatParcelizer(this.write, r8lambdagkh6tfshup2g_hd0a6i5ejd8pu.write) && TuplesKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, r8lambdagkh6tfshup2g_hd0a6i5ejd8pu.IconCompatParcelizer) && TuplesKt.RemoteActionCompatParcelizer(this.read, r8lambdagkh6tfshup2g_hd0a6i5ejd8pu.read);
    }
}
