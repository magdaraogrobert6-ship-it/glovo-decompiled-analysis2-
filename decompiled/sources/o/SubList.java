package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SubList implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ SubList(int i, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.IconCompatParcelizer = z;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = read + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        boolean z = this.IconCompatParcelizer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.valueOf(!z));
            return createfromparcel;
        }
        if (i4 == 1) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.valueOf(z));
            return createfromparcel;
        }
        if (i4 == 2) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.valueOf(!z));
            return createfromparcel;
        }
        if (i4 == 3) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.valueOf(!z));
            return createfromparcel;
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.valueOf(!z));
        int i5 = write + 123;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return createfromparcel;
        }
        throw null;
    }
}
