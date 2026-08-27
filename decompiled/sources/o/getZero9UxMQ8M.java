package o;

import com.roadrunner.delivery.stacked.delivery.list.compose.OrderNumberVerticalIndicatorKt;
import com.roadrunner.delivery.state.pudo.TagColorToken;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getZero9UxMQ8M implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final /* synthetic */ androidx.compose.ui.Modifier IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ TagColorToken serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ getZero9UxMQ8M(TagColorToken tagColorToken, int i, androidx.compose.ui.Modifier modifier, int i2, int i3) {
        this.RemoteActionCompatParcelizer = i3;
        this.serializer = tagColorToken;
        this.read = i;
        this.IconCompatParcelizer = modifier;
        this.write = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.write;
        androidx.compose.ui.Modifier modifier = this.IconCompatParcelizer;
        int i4 = this.read;
        TagColorToken tagColorToken = this.serializer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i2 != 0) {
            OrderNumberVerticalIndicatorKt.CircleWithNumber(tagColorToken, i4, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
            int i5 = MediaBrowserCompatMediaItem + 97;
            MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 48 / 0;
            }
            return createfromparcel;
        }
        OrderNumberVerticalIndicatorKt.OrderNumberVerticalIndicator(tagColorToken, i4, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
        int i7 = MediaBrowserCompatMediaItem + 85;
        MediaMetadataCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            int i8 = 19 / 0;
        }
        return createfromparcel;
    }
}
