package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.DeliveryDetailsKt;
import com.roadrunner.delivery.ontheway.entrancepicture.details.presentation.compose.EntrancePictureScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getPrivateImeOptions implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int read;
    public final /* synthetic */ Integer IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ getPrivateImeOptions(String str, Integer num, int i, int i2) {
        this.write = i2;
        this.serializer = str;
        this.IconCompatParcelizer = num;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 101;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            ((Integer) obj2).getClass();
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.RemoteActionCompatParcelizer;
        Integer num = this.IconCompatParcelizer;
        String str = this.serializer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i3 == 0) {
            DeliveryDetailsKt.DestinationHeader(str, num, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
            return createfromparcel2;
        }
        EntrancePictureScreenKt.CustomerName(str, num, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
        int i5 = MediaBrowserCompatMediaItem + 63;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return createfromparcel2;
    }
}
