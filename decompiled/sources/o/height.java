package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class height implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ UpdatableAnimationState serializer;

    public /* synthetic */ height(UpdatableAnimationState updatableAnimationState, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = updatableAnimationState;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        UpdatableAnimationState updatableAnimationState = this.serializer;
        if (i != 0) {
            updatableAnimationState.read = false;
            return createfromparcel;
        }
        updatableAnimationState.read = false;
        return createfromparcel;
    }
}
