package o;

import io.grpc.internal.DelayedStream$3;

/* JADX INFO: loaded from: classes4.dex */
public final class isValidLogPurchaseInputlambda3 implements Runnable {
    public final /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ isValidLogPurchaseInputlambda3(Object obj, boolean z, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.write;
        boolean z = this.IconCompatParcelizer;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            Fill.serializer();
            r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) ((io.sentry.android.core.internal.util.write) obj).RemoteActionCompatParcelizer;
            boolean z2 = r8lambdalmkbrrgswwtv97obrsj7trj7ai.RemoteActionCompatParcelizer;
            r8lambdalmkbrrgswwtv97obrsj7trj7ai.RemoteActionCompatParcelizer = z;
            if (z2 != z) {
                ((clipPathKD09W0Mdefault) r8lambdalmkbrrgswwtv97obrsj7trj7ai.write).write(z);
                return;
            }
            return;
        }
        isValidLogPurchaseInputlambda1 isvalidlogpurchaseinputlambda1 = (isValidLogPurchaseInputlambda1) ((DelayedStream$3) obj).serializer;
        if (z) {
            isvalidlogpurchaseinputlambda1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = true;
            if (isvalidlogpurchaseinputlambda1.ParcelableVolumeInfo > 0) {
                visitSubtreeYYKmhodefault visitsubtreeyykmhodefault = isvalidlogpurchaseinputlambda1.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                visitsubtreeyykmhodefault.RemoteActionCompatParcelizer = false;
                visitsubtreeyykmhodefault.write();
            }
        }
        isvalidlogpurchaseinputlambda1.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = false;
    }
}
