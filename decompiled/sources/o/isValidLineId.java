package o;

import io.grpc.Status;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes4.dex */
public final class isValidLineId extends r8lambdazivxwYhO2dN7SXrsdQvIgjjYFA {
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final Status read;
    public final MathKt write;

    public isValidLineId(WebContentUtilsExternalSyntheticLambda9 webContentUtilsExternalSyntheticLambda9, MathKt mathKt, Status status) {
        super(webContentUtilsExternalSyntheticLambda9.MediaSessionCompatQueueItem);
        this.write = mathKt;
        this.read = status;
    }

    @Override // o.r8lambdazivxwYhO2dN7SXrsdQvIgjjYFA
    public final void RemoteActionCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer;
        Status status = this.read;
        MathKt mathKt = this.write;
        if (i != 0) {
            mathKt.serializer(status, new r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA());
        } else {
            mathKt.serializer(status, new r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isValidLineId(unpackZipEntry unpackzipentry, MathKt mathKt, Status status) {
        super(unpackzipentry.RemoteActionCompatParcelizer);
        this.write = mathKt;
        this.read = status;
    }
}
