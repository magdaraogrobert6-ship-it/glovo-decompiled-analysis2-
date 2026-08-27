package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AnimateXAsStateComposeAnimationCompanion implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ getEnterjXw82LU RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;

    public /* synthetic */ AnimateXAsStateComposeAnimationCompanion(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getEnterjXw82LU getenterjxw82lu, int i) {
        this.IconCompatParcelizer = i;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = getenterjxw82lu;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = serializer + 93;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getEnterjXw82LU getenterjxw82lu = this.RemoteActionCompatParcelizer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.read;
        if (i3 == 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getenterjxw82lu.taskId);
            return createfromparcel2;
        }
        if (i3 != 1) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getenterjxw82lu.taskId);
            return createfromparcel2;
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getenterjxw82lu.taskId);
        int i4 = serializer + 119;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return createfromparcel2;
        }
        obj.hashCode();
        throw null;
    }
}
