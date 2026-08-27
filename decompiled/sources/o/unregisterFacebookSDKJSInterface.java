package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.ReportBottomSheetKt;
import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class unregisterFacebookSDKJSInterface implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ String write;

    public /* synthetic */ unregisterFacebookSDKJSInterface(String str, String str2, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.read = str;
        this.write = str2;
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.IconCompatParcelizer;
        String str = this.write;
        String str2 = this.read;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        Integer num = (Integer) obj2;
        if (i2 == 0) {
            num.getClass();
            HeaderKt.HeaderTitleAndDescription(str2, str, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
            int i4 = serializer + 11;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel;
        }
        if (i2 != 1) {
            num.intValue();
            MessagePopUpKt.serializer(str2, str, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
            return createfromparcel;
        }
        num.intValue();
        ReportBottomSheetKt.SheetHeader(str2, str, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
        int i6 = serializer + 99;
        MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return createfromparcel;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
