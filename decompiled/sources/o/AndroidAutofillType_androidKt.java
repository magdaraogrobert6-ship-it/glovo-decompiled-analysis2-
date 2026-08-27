package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AndroidAutofillType_androidKt implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int read;
    public final /* synthetic */ Object write;

    public /* synthetic */ AndroidAutofillType_androidKt(int i, Object obj) {
        this.read = i;
        this.write = obj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.read;
        Object obj = this.write;
        if (i == 0) {
            return (androidx.compose.ui.layout.LayoutCoordinates) ((PopulateViewStructure_androidKtpopulate7) obj).getValue();
        }
        if (i == 1) {
            return onGlobalLayout.RemoteActionCompatParcelizer;
        }
        if (i == 2) {
            return Float.valueOf(((sensitiveContentdefault) obj).write.IconCompatParcelizer.read());
        }
        if (i != 3) {
            return ((androidx.compose.material3.SheetState) obj).RemoteActionCompatParcelizer;
        }
        ((androidx.compose.material3.ModalBottomSheetDialogWrapper) obj).IconCompatParcelizer.invoke();
        return createFromParcel.INSTANCE;
    }
}
