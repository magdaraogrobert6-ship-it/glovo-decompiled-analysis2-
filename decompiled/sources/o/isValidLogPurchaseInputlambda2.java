package o;

/* JADX INFO: loaded from: classes4.dex */
public final class isValidLogPurchaseInputlambda2 implements Runnable {
    public final /* synthetic */ isValidLogPurchaseInput serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ isValidLogPurchaseInputlambda2(isValidLogPurchaseInput isvalidlogpurchaseinput, int i) {
        this.write = i;
        this.serializer = isvalidlogpurchaseinput;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.write;
        isValidLogPurchaseInput isvalidlogpurchaseinput = this.serializer;
        if (i == 0) {
            isvalidlogpurchaseinput.RemoteActionCompatParcelizer();
        } else if (i != 1) {
            isvalidlogpurchaseinput.MediaSessionCompatResultReceiverWrapper.write();
        } else {
            isvalidlogpurchaseinput.MediaSessionCompatResultReceiverWrapper.read();
        }
    }
}
