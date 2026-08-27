package o;

import java.io.EOFException;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class isValidLocation implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ isValidLocation(Object obj, int i, int i2) {
        this.read = i2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws EOFException {
        int i = this.read;
        int i2 = this.IconCompatParcelizer;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            ((isValidLogPurchaseInput) obj).MediaSessionCompatResultReceiverWrapper.read(i2);
            return;
        }
        boolean z = true;
        if (i != 1) {
            ((WebContentUtilsExternalSyntheticLambda9) obj).PlaybackStateCompat.serializer(i2);
            return;
        }
        r8lambdaXth6FrtbZSfmvd4naNgMRXZlf8Q r8lambdaxth6frtbzsfmvd4nangmrxzlf8q = (r8lambdaXth6FrtbZSfmvd4naNgMRXZlf8Q) obj;
        try {
            executelambda2.serializer();
            try {
                executelambda1 executelambda1Var = executelambda2.serializer;
                executelambda1Var.getClass();
                createUriActionFromUrlStringlambda1 createuriactionfromurlstringlambda1 = r8lambdaxth6frtbzsfmvd4nangmrxzlf8q.serializer;
                createuriactionfromurlstringlambda1.getClass();
                if (i2 <= 0) {
                    z = false;
                }
                TextStreamsKt.read("numMessages must be > 0", z);
                if (!createuriactionfromurlstringlambda1.write()) {
                    createuriactionfromurlstringlambda1.MediaBrowserCompatMediaItem += (long) i2;
                    createuriactionfromurlstringlambda1.RemoteActionCompatParcelizer();
                }
                executelambda1Var.getClass();
            } catch (Throwable th) {
                try {
                    executelambda2.serializer.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            ((r8lambdakEPpEUfTPwAZBc7DrHg_Qad0Y4) r8lambdaxth6frtbzsfmvd4nangmrxzlf8q).write(th3);
        }
    }
}
