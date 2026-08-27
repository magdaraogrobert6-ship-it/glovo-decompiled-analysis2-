package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getRoot implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ SheetBottomTokens read;
    public final /* synthetic */ int write;

    public /* synthetic */ getRoot(SheetBottomTokens sheetBottomTokens, int i) {
        this.write = i;
        this.read = sheetBottomTokens;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.write;
        SheetBottomTokens sheetBottomTokens = this.read;
        if (i != 0) {
            return i != 1 ? Float.valueOf(sheetBottomTokens.MediaSessionCompatQueueItem.write() - sheetBottomTokens.MediaSessionCompatQueueItem.IconCompatParcelizer()) : Float.valueOf(sheetBottomTokens.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer());
        }
        return Float.valueOf(sheetBottomTokens.MediaSessionCompatQueueItem.read());
    }
}
