package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class accesshasPhysicalKeyboard implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ width RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.material3.SheetState read;
    public final /* synthetic */ width serializer;
    public final /* synthetic */ width write;

    public /* synthetic */ accesshasPhysicalKeyboard(androidx.compose.material3.SheetState sheetState, width widthVar, width widthVar2, width widthVar3, int i) {
        this.IconCompatParcelizer = i;
        this.read = sheetState;
        this.write = widthVar;
        this.RemoteActionCompatParcelizer = widthVar2;
        this.serializer = widthVar3;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        width widthVar = this.serializer;
        width widthVar2 = this.RemoteActionCompatParcelizer;
        width widthVar3 = this.write;
        androidx.compose.material3.SheetState sheetState = this.read;
        if (i != 0) {
            sheetState.write = widthVar3;
            sheetState.serializer = widthVar2;
            sheetState.RemoteActionCompatParcelizer = widthVar;
            return createfromparcel;
        }
        sheetState.write = widthVar3;
        sheetState.serializer = widthVar2;
        sheetState.RemoteActionCompatParcelizer = widthVar;
        return createfromparcel;
    }
}
