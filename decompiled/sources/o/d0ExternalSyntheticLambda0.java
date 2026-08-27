package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d0ExternalSyntheticLambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ getBoolean write;

    public /* synthetic */ d0ExternalSyntheticLambda0(getBoolean getboolean, int i) {
        this.IconCompatParcelizer = i;
        this.write = getboolean;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = read + 29;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getBoolean getboolean = this.write;
        String str = (String) obj;
        if (i3 == 0) {
            str.getClass();
            getboolean.read(str);
            getboolean.read();
            int i4 = read + 29;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel2;
        }
        if (i3 != 1) {
            str.getClass();
            getboolean.read(str);
            getboolean.read();
            return createfromparcel2;
        }
        str.getClass();
        getboolean.read(str);
        getboolean.read();
        return createfromparcel2;
    }
}
