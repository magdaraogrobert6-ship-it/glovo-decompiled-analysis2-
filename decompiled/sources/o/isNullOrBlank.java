package o;

import io.grpc.Status;
import io.grpc.internal.SharedResourcePool;
import io.sentry.CombinedScopeView;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes4.dex */
public final class isNullOrBlank extends r8lambdazivxwYhO2dN7SXrsdQvIgjjYFA {
    public final /* synthetic */ CombinedScopeView IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isNullOrBlank(CombinedScopeView combinedScopeView, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        super(((isBlank) combinedScopeView.write).MediaMetadataCompat);
        this.IconCompatParcelizer = combinedScopeView;
        this.write = r8lambdaqn1du6uas6agx4srbugfttxtpwa;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0039 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void serializer() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.write
            io.grpc.internal.SharedResourcePool r0 = (io.grpc.internal.SharedResourcePool) r0
            io.sentry.CombinedScopeView r1 = r6.IconCompatParcelizer
            java.lang.Object r2 = r1.write
            o.isBlank r2 = (o.isBlank) r2
            java.lang.Object r3 = r1.read
            io.grpc.Status r3 = (io.grpc.Status) r3
            if (r3 == 0) goto L1c
            java.util.logging.Logger r1 = o.r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.ResultReceiver
        L12:
            java.io.InputStream r1 = r0.serializer()
            if (r1 == 0) goto L38
            o.r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.serializer(r1)
            goto L12
        L1c:
            java.io.InputStream r3 = r0.serializer()     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L38
            java.lang.Object r4 = r1.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L33
            kotlin.math.MathKt r4 = (kotlin.math.MathKt) r4     // Catch: java.lang.Throwable -> L33
            io.sentry.SentryClient r5 = r2.PlaybackStateCompatCustomAction     // Catch: java.lang.Throwable -> L33
            o.getElevation r5 = r5.serializer(r3)     // Catch: java.lang.Throwable -> L33
            r4.serializer(r5)     // Catch: java.lang.Throwable -> L33
            r3.close()     // Catch: java.lang.Throwable -> L39
            goto L1c
        L33:
            r4 = move-exception
            o.r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.serializer(r3)     // Catch: java.lang.Throwable -> L39
            throw r4     // Catch: java.lang.Throwable -> L39
        L38:
            return
        L39:
            r3 = move-exception
            java.util.logging.Logger r4 = o.r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.ResultReceiver
        L3c:
            java.io.InputStream r4 = r0.serializer()
            if (r4 == 0) goto L46
            o.r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.serializer(r4)
            goto L3c
        L46:
            io.grpc.Status r0 = io.grpc.Status.RemoteActionCompatParcelizer
            io.grpc.Status r0 = r0.RemoteActionCompatParcelizer(r3)
            java.lang.String r3 = "Failed to read message."
            io.grpc.Status r0 = r0.IconCompatParcelizer(r3)
            r1.read = r0
            o.r8lambda7hJ8zhIew8OwwYP0E05LxEU0Sn0 r1 = r2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys
            r1.RemoteActionCompatParcelizer(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isNullOrBlank.serializer():void");
    }

    @Override // o.r8lambdazivxwYhO2dN7SXrsdQvIgjjYFA
    public final void RemoteActionCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer != 0) {
            executelambda2.serializer();
            try {
                executelambda2.read();
                executelambda1 executelambda1Var = executelambda2.serializer;
                executelambda1Var.getClass();
                serializer();
                executelambda1Var.getClass();
                return;
            } catch (Throwable th) {
                try {
                    executelambda2.serializer.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        CombinedScopeView combinedScopeView = this.IconCompatParcelizer;
        executelambda2.serializer();
        try {
            executelambda2.read();
            executelambda2.serializer.getClass();
            if (((Status) combinedScopeView.read) == null) {
                try {
                    ((MathKt) combinedScopeView.RemoteActionCompatParcelizer).read((r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA) this.write);
                } catch (Throwable th3) {
                    Status statusIconCompatParcelizer = Status.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th3).IconCompatParcelizer("Failed to read headers");
                    combinedScopeView.read = statusIconCompatParcelizer;
                    ((isBlank) combinedScopeView.write).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer(statusIconCompatParcelizer);
                }
            }
            executelambda2.serializer.getClass();
        } catch (Throwable th4) {
            try {
                executelambda2.serializer.getClass();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isNullOrBlank(CombinedScopeView combinedScopeView, SharedResourcePool sharedResourcePool) {
        super(((isBlank) combinedScopeView.write).MediaMetadataCompat);
        this.IconCompatParcelizer = combinedScopeView;
        this.write = sharedResourcePool;
    }
}
