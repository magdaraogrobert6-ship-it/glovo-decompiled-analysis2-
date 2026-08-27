package o;

import io.grpc.Status;
import io.sentry.SentryClient;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getVALID_CURRENCY_CODES implements r8lambdaHMza2HwvD2qpEDNMeHrXqzjzano {
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public final Object read;
    public final Object serializer;

    public getVALID_CURRENCY_CODES(Status status, r8lambdacIxdbs1VMz7DJpiM5hikhHgartg r8lambdacixdbs1vmz7djpim5hikhhgartg) {
        TextStreamsKt.read("error must not be OK", true ^ status.IconCompatParcelizer());
        this.read = status;
        this.serializer = r8lambdacixdbs1vmz7djpim5hikhhgartg;
    }

    @Override // o.r8lambdaHMza2HwvD2qpEDNMeHrXqzjzano
    public final r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 IconCompatParcelizer(SentryClient sentryClient, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa, mergeJsonObjectslambda10 mergejsonobjectslambda10, JsonUtilsExternalSyntheticLambda1[] jsonUtilsExternalSyntheticLambda1Arr) {
        int i = this.IconCompatParcelizer;
        Object obj = this.serializer;
        Object obj2 = this.read;
        if (i != 0) {
            return new isValidPushStoryClickInput((Status) obj2, (r8lambdacIxdbs1VMz7DJpiM5hikhHgartg) obj, jsonUtilsExternalSyntheticLambda1Arr);
        }
        mergeJsonObjectslambda10 mergejsonobjectslambda11 = mergeJsonObjectslambda10.RemoteActionCompatParcelizer;
        TextStreamsKt.serializer(mergejsonobjectslambda10, "callOptions cannot be null");
        JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1RemoteActionCompatParcelizer = ((JsonUtilsd) obj2).RemoteActionCompatParcelizer(new JsonUtilsc(mergejsonobjectslambda10, 0, false), r8lambdaqn1du6uas6agx4srbugfttxtpwa);
        TextStreamsKt.RemoteActionCompatParcelizer("lb tracer already assigned", jsonUtilsExternalSyntheticLambda1Arr[jsonUtilsExternalSyntheticLambda1Arr.length - 1] == r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.PlaybackStateCompat);
        jsonUtilsExternalSyntheticLambda1Arr[jsonUtilsExternalSyntheticLambda1Arr.length - 1] = jsonUtilsExternalSyntheticLambda1RemoteActionCompatParcelizer;
        return ((accesssetCustomHandlercp) obj).IconCompatParcelizer(sentryClient, r8lambdaqn1du6uas6agx4srbugfttxtpwa, mergejsonobjectslambda10, jsonUtilsExternalSyntheticLambda1Arr);
    }

    @Override // o.r8lambdao3lqYNEkeMXUHIX5LRLuX2akVp8
    public final incrementPermissionRequestCountlambda0 read() {
        if (this.IconCompatParcelizer == 0) {
            return ((accesssetCustomHandlercp) this.serializer).read();
        }
        throw new UnsupportedOperationException("Not a real transport");
    }

    public getVALID_CURRENCY_CODES(JsonUtilsd jsonUtilsd, accesssetCustomHandlercp accesssetcustomhandlercp) {
        this.read = jsonUtilsd;
        this.serializer = accesssetcustomhandlercp;
    }
}
