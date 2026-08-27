package o;

/* JADX INFO: loaded from: classes4.dex */
public final class isValidLogCustomEventInputlambda1 implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ isValidLogPurchaseInput write;

    public /* synthetic */ isValidLogCustomEventInputlambda1(isValidLogPurchaseInput isvalidlogpurchaseinput, int i, int i2) {
        this.serializer = i2;
        this.write = isvalidlogpurchaseinput;
        this.IconCompatParcelizer = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        int i2 = this.IconCompatParcelizer;
        isValidLogPurchaseInput isvalidlogpurchaseinput = this.write;
        if (i != 0) {
            isvalidlogpurchaseinput.MediaSessionCompatResultReceiverWrapper.serializer(i2);
        } else {
            isvalidlogpurchaseinput.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer(i2);
        }
    }
}
