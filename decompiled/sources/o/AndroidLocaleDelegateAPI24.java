package o;

import com.roadrunner.delivery.ontheway.deliverynotes.presentation.compose.DeliveryNotesLinkKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AndroidLocaleDelegateAPI24 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ androidx.compose.ui.Modifier IconCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ TextInputServiceAndroidstopInput2 write;

    public /* synthetic */ AndroidLocaleDelegateAPI24(TextInputServiceAndroidstopInput2 textInputServiceAndroidstopInput2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.serializer = i2;
        this.write = textInputServiceAndroidstopInput2;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = modifier;
        this.read = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 111;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.read;
        androidx.compose.ui.Modifier modifier = this.IconCompatParcelizer;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.RemoteActionCompatParcelizer;
        TextInputServiceAndroidstopInput2 textInputServiceAndroidstopInput2 = this.write;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 != 0) {
            DeliveryNotesLinkKt.DeliveryNotesContent(textInputServiceAndroidstopInput2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        DeliveryNotesLinkKt.RemoteActionCompatParcelizer(textInputServiceAndroidstopInput2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
        int i6 = MediaDescriptionCompat + 67;
        RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return createfromparcel;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
