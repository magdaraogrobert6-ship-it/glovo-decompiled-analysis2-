package o;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoClauseMsg implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ syncCustomerProfile read;

    public /* synthetic */ ProtoClauseMsg(syncCustomerProfile synccustomerprofile, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = synccustomerprofile;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        syncCustomerProfile synccustomerprofile = this.read;
        if (i == 0) {
            synccustomerprofile.IconCompatParcelizer();
            return createfromparcel;
        }
        if (i != 1) {
            synccustomerprofile.IconCompatParcelizer();
            return createfromparcel;
        }
        synccustomerprofile.IconCompatParcelizer();
        return createfromparcel;
    }
}
