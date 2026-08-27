package o;

import io.grpc.Status;
import io.sentry.CombinedScopeView;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda4drVSO69yYFm67jLKp9xaf1w31E extends r8lambdazivxwYhO2dN7SXrsdQvIgjjYFA {
    public final /* synthetic */ CombinedScopeView IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda4drVSO69yYFm67jLKp9xaf1w31E(CombinedScopeView combinedScopeView) {
        super(((isBlank) combinedScopeView.write).MediaMetadataCompat);
        this.IconCompatParcelizer = combinedScopeView;
    }

    @Override // o.r8lambdazivxwYhO2dN7SXrsdQvIgjjYFA
    public final void RemoteActionCompatParcelizer() {
        CombinedScopeView combinedScopeView = this.IconCompatParcelizer;
        executelambda2.serializer();
        try {
            executelambda2.read();
            executelambda2.serializer.getClass();
            if (((Status) combinedScopeView.read) == null) {
                try {
                    ((MathKt) combinedScopeView.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer();
                } catch (Throwable th) {
                    Status statusIconCompatParcelizer = Status.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th).IconCompatParcelizer("Failed to call onReady.");
                    combinedScopeView.read = statusIconCompatParcelizer;
                    ((isBlank) combinedScopeView.write).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer(statusIconCompatParcelizer);
                }
            }
            executelambda2.serializer.getClass();
        } catch (Throwable th2) {
            try {
                executelambda2.serializer.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
