package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TextDirectionCompanion implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public final /* synthetic */ getSpanVerticalAligndo9XGgannotations serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ TextDirectionCompanion(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getSpanVerticalAligndo9XGgannotations getspanverticalaligndo9xggannotations, int i) {
        this.write = i;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = getspanverticalaligndo9xggannotations;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getSpanVerticalAligndo9XGgannotations getspanverticalaligndo9xggannotations = this.serializer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.read;
        if (i4 == 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getspanverticalaligndo9xggannotations);
            int i5 = IconCompatParcelizer + 67;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return createfromparcel;
        }
        if (i4 == 1) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getspanverticalaligndo9xggannotations);
            return createfromparcel;
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getspanverticalaligndo9xggannotations);
        int i7 = RemoteActionCompatParcelizer + 19;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return createfromparcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
