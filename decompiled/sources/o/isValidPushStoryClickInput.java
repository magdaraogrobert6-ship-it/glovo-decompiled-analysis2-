package o;

import fwfd.com.fwfsdk.constant.FWFConstants;
import io.grpc.Status;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class isValidPushStoryClickInput extends r8lambdaS3t9TQB6FrQYP7LA1iCU5SLIOl8 {
    public final r8lambdacIxdbs1VMz7DJpiM5hikhHgartg IconCompatParcelizer;
    public final Status read;
    public boolean serializer;
    public final JsonUtilsExternalSyntheticLambda1[] write;

    @Override // o.r8lambdaS3t9TQB6FrQYP7LA1iCU5SLIOl8, o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void serializer(applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0) {
        applydisplaycutoutmarginstocontentarealambda0.IconCompatParcelizer(this.read, FWFConstants.EXPLANATION_TYPE_ERROR);
        applydisplaycutoutmarginstocontentarealambda0.IconCompatParcelizer(this.IconCompatParcelizer, "progress");
    }

    public isValidPushStoryClickInput(Status status, r8lambdacIxdbs1VMz7DJpiM5hikhHgartg r8lambdacixdbs1vmz7djpim5hikhhgartg, JsonUtilsExternalSyntheticLambda1[] jsonUtilsExternalSyntheticLambda1Arr) {
        TextStreamsKt.read("error must not be OK", !status.IconCompatParcelizer());
        this.read = status;
        this.IconCompatParcelizer = r8lambdacixdbs1vmz7djpim5hikhhgartg;
        this.write = jsonUtilsExternalSyntheticLambda1Arr;
    }

    @Override // o.r8lambdaS3t9TQB6FrQYP7LA1iCU5SLIOl8, o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0
    public final void read(r8lambda6LGSESzBuanebUADYycWZpXP5Kw r8lambda6lgseszbuanebuadyycwzpxp5kw) {
        TextStreamsKt.RemoteActionCompatParcelizer("already started", !this.serializer);
        this.serializer = true;
        JsonUtilsExternalSyntheticLambda1[] jsonUtilsExternalSyntheticLambda1Arr = this.write;
        int length = jsonUtilsExternalSyntheticLambda1Arr.length;
        int i = 0;
        while (true) {
            Status status = this.read;
            if (i >= length) {
                r8lambda6lgseszbuanebuadyycwzpxp5kw.serializer(status, this.IconCompatParcelizer, new r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA());
                return;
            } else {
                jsonUtilsExternalSyntheticLambda1Arr[i].serializer(status);
                i++;
            }
        }
    }

    public isValidPushStoryClickInput(Status status, JsonUtilsExternalSyntheticLambda1[] jsonUtilsExternalSyntheticLambda1Arr) {
        this(status, r8lambdacIxdbs1VMz7DJpiM5hikhHgartg.PROCESSED, jsonUtilsExternalSyntheticLambda1Arr);
    }
}
