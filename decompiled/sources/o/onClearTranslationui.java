package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class onClearTranslationui implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ getContentCaptureSessionui write;

    public /* synthetic */ onClearTranslationui(getContentCaptureSessionui getcontentcapturesessionui, int i) {
        this.serializer = i;
        this.write = getcontentcapturesessionui;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = read + 27;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentCaptureSessionui getcontentcapturesessionui = this.write;
        if (i3 == 0) {
            getcontentcapturesessionui.IconCompatParcelizer(((Float) obj).floatValue());
            return createfromparcel2;
        }
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = (androidx.compose.ui.layout.LayoutCoordinates) obj;
        layoutCoordinates.getClass();
        getcontentcapturesessionui.IconCompatParcelizer((int) (layoutCoordinates.mo2217getSizeYbymL2g() >> 32));
        int i4 = read + 111;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return createfromparcel2;
        }
        obj2.hashCode();
        throw null;
    }
}
