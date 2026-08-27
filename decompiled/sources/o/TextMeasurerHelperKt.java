package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TextMeasurerHelperKt implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ getPlatformAndroidManager IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ TextMeasurerHelperKt(getPlatformAndroidManager getplatformandroidmanager, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = getplatformandroidmanager;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getPlatformAndroidManager getplatformandroidmanager = this.IconCompatParcelizer;
        if (i2 == 0) {
            androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = (androidx.compose.ui.layout.LayoutCoordinates) obj;
            layoutCoordinates.getClass();
            ((onHideTranslationui) getplatformandroidmanager).serializer((int) (layoutCoordinates.mo2217getSizeYbymL2g() & 4294967295L));
            return createfromparcel;
        }
        if (i2 == 1) {
            ((onHideTranslationui) getplatformandroidmanager).serializer((int) (((androidx.compose.ui.unit.IntSize) obj).m3848unboximpl() & 4294967295L));
            return createfromparcel;
        }
        if (i2 == 2) {
            androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2 = (androidx.compose.ui.layout.LayoutCoordinates) obj;
            layoutCoordinates2.getClass();
            onHideTranslationui onhidetranslationui = (onHideTranslationui) getplatformandroidmanager;
            if (onhidetranslationui.serializer() < ((int) (layoutCoordinates2.mo2217getSizeYbymL2g() & 4294967295L))) {
                int i3 = serializer + 65;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                onhidetranslationui.serializer((int) (layoutCoordinates2.mo2217getSizeYbymL2g() & 4294967295L));
            }
            return createfromparcel;
        }
        if (i2 != 3) {
            ((getStyleTiuSbCo) obj).getClass();
            onHideTranslationui onhidetranslationui2 = (onHideTranslationui) getplatformandroidmanager;
            onhidetranslationui2.serializer(onhidetranslationui2.serializer() + 1);
            return new TypefaceResultImmutable(0);
        }
        ((onHideTranslationui) getplatformandroidmanager).serializer(((Integer) obj).intValue());
        int i5 = read + 89;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return createfromparcel;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
