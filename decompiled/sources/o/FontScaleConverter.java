package o;

import com.roadrunner.delivery.state.pudo.TypographyToken;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class FontScaleConverter implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ TypographyToken IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ String write;

    public /* synthetic */ FontScaleConverter(TypographyToken typographyToken, String str, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.serializer = i2;
        this.IconCompatParcelizer = typographyToken;
        this.write = str;
        this.read = modifier;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.RemoteActionCompatParcelizer;
        androidx.compose.ui.Modifier modifier = this.read;
        String str = this.write;
        TypographyToken typographyToken = this.IconCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i2 == 0) {
            getSLookupTablesannotations.write(typographyToken, str, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
            int i4 = MediaSessionCompatQueueItem + 125;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel;
        }
        getDesignInfoListui_tooling.write(typographyToken, str, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
        int i6 = MediaSessionCompatQueueItem + 21;
        MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 26 / 0;
        }
        return createfromparcel;
    }
}
