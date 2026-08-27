package o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class InputModeCompanion implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ accessgetTouchcp write;

    public /* synthetic */ InputModeCompanion(accessgetTouchcp accessgettouchcp, int i) {
        this.IconCompatParcelizer = i;
        this.write = accessgettouchcp;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 69;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        accessgetTouchcp accessgettouchcp = this.write;
        if (i4 == 0) {
            accessgettouchcp.write.cancel();
            return createfromparcel;
        }
        accessgettouchcp.write.cancel();
        int i5 = serializer + 47;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }
}
