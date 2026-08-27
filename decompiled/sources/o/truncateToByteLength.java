package o;

import io.grpc.Status;
import io.grpc.internal.CallTracer;
import io.sentry.CombinedScopeView;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes4.dex */
public final class truncateToByteLength extends r8lambdazivxwYhO2dN7SXrsdQvIgjjYFA {
    public final /* synthetic */ CombinedScopeView IconCompatParcelizer;
    public final /* synthetic */ Status read;
    public final /* synthetic */ r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public truncateToByteLength(CombinedScopeView combinedScopeView, Status status, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        super(((isBlank) combinedScopeView.write).MediaMetadataCompat);
        this.IconCompatParcelizer = combinedScopeView;
        this.read = status;
        this.serializer = r8lambdaqn1du6uas6agx4srbugfttxtpwa;
    }

    public final void serializer() {
        Status status = this.read;
        r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa = this.serializer;
        Status status2 = (Status) this.IconCompatParcelizer.read;
        if (status2 != null) {
            r8lambdaqn1du6uas6agx4srbugfttxtpwa = new r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA();
            status = status2;
        }
        ((isBlank) this.IconCompatParcelizer.write).RatingCompat = true;
        try {
            ((MathKt) this.IconCompatParcelizer.RemoteActionCompatParcelizer).serializer(status, r8lambdaqn1du6uas6agx4srbugfttxtpwa);
            ((isBlank) this.IconCompatParcelizer.write).RemoteActionCompatParcelizer();
            CallTracer callTracer = ((isBlank) this.IconCompatParcelizer.write).MediaDescriptionCompat;
            if (status.IconCompatParcelizer()) {
                ((replacePrefetchedUrlsWithLocalAssetslambda0) callTracer.serializer).read();
            } else {
                ((replacePrefetchedUrlsWithLocalAssetslambda0) callTracer.IconCompatParcelizer).read();
            }
        } catch (Throwable th) {
            ((isBlank) this.IconCompatParcelizer.write).RemoteActionCompatParcelizer();
            CallTracer callTracer2 = ((isBlank) this.IconCompatParcelizer.write).MediaDescriptionCompat;
            if (status.IconCompatParcelizer()) {
                ((replacePrefetchedUrlsWithLocalAssetslambda0) callTracer2.serializer).read();
            } else {
                ((replacePrefetchedUrlsWithLocalAssetslambda0) callTracer2.IconCompatParcelizer).read();
            }
            throw th;
        }
    }

    @Override // o.r8lambdazivxwYhO2dN7SXrsdQvIgjjYFA
    public final void RemoteActionCompatParcelizer() {
        executelambda2.serializer();
        try {
            executelambda2.read();
            executelambda1 executelambda1Var = executelambda2.serializer;
            executelambda1Var.getClass();
            serializer();
            executelambda1Var.getClass();
        } catch (Throwable th) {
            try {
                executelambda2.serializer.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
