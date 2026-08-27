package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CommitTextCommand implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ getPlatformAndroidManager write;

    public /* synthetic */ CommitTextCommand(getPlatformAndroidManager getplatformandroidmanager, int i) {
        this.IconCompatParcelizer = i;
        this.write = getplatformandroidmanager;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int iSerializer;
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getPlatformAndroidManager getplatformandroidmanager = this.write;
        if (i2 == 0) {
            iSerializer = ((onHideTranslationui) getplatformandroidmanager).serializer();
        } else {
            if (i2 == 1) {
                onHideTranslationui onhidetranslationui = (onHideTranslationui) getplatformandroidmanager;
                onhidetranslationui.serializer(onhidetranslationui.serializer() + 1);
                return createfromparcel;
            }
            if (i2 != 2) {
                onHideTranslationui onhidetranslationui2 = (onHideTranslationui) getplatformandroidmanager;
                onhidetranslationui2.serializer(onhidetranslationui2.serializer() + 1);
                int i3 = read + 49;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return createfromparcel;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iSerializer = ((onHideTranslationui) getplatformandroidmanager).serializer();
            int i4 = read + 75;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        return Integer.valueOf(iSerializer);
    }
}
