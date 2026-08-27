package o;

import com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.composable.LastStopMapPinKt;
import com.roadrunner.home.bottomsheet.separator.SeparatorItemKt;
import com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt;
import com.roadrunner.vendor.review.api.presentation.VendorReviewOptionKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class performSaveInstanceState implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int serializer;
    public final /* synthetic */ androidx.compose.ui.Modifier IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ int write;

    public /* synthetic */ performSaveInstanceState(boolean z, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.write = i2;
        this.read = z;
        this.IconCompatParcelizer = modifier;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 63;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.RemoteActionCompatParcelizer;
        androidx.compose.ui.Modifier modifier = this.IconCompatParcelizer;
        boolean z = this.read;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 == 0) {
            SeparatorItemKt.SeparatorContent(z, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
            return createfromparcel;
        }
        if (i4 == 1) {
            LastStopMapPinKt.LastStopMapPinMarker(z, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
            return createfromparcel;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                VendorReviewOptionKt.write(z, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
                return createfromparcel;
            }
            VendorReviewOptionKt.ReviewTitleBox(z, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
            return createfromparcel;
        }
        TextInputBigV2Kt.HintTextV2(z, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
        int i6 = MediaDescriptionCompat + 107;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 74 / 0;
        }
        return createfromparcel;
    }
}
