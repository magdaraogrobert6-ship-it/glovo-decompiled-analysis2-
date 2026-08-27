package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.GalleryScreenKt;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.reason.AmountChangeReasonScreenKt;
import com.roadrunner.sidemenu.photoId.PhotoIdContainerKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambday_zuDuH0rSLU3Q7PVVGz8MXtiaM implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RatingCompat = 1;
    private static int write;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ String serializer;

    public /* synthetic */ r8lambday_zuDuH0rSLU3Q7PVVGz8MXtiaM(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.serializer = str;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.read = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 83;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.read;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.IconCompatParcelizer;
        String str = this.serializer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        Integer num = (Integer) obj2;
        if (i4 == 0) {
            num.intValue();
            PhotoIdContainerKt.read(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        if (i4 == 1) {
            num.getClass();
            GalleryScreenKt.AddPhotoButton(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        if (i4 == 2) {
            num.getClass();
            AmountChangeReasonScreenKt.write(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        if (i4 != 3) {
            num.intValue();
            AdjustBridgeInstance.IconCompatParcelizer(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        num.intValue();
        AmountChangeReasonScreenKt.RemoteActionCompatParcelizer(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
        int i6 = write + 27;
        RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return createfromparcel;
        }
        throw null;
    }
}
