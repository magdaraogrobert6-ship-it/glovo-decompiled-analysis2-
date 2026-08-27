package o;

import com.roadrunner.rider.recruitment.passverification.presentation.VerifyScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getCallbackParameters implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final /* synthetic */ int MediaBrowserCompatMediaItem;
    public final /* synthetic */ androidx.compose.ui.Modifier RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    public /* synthetic */ getCallbackParameters(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.serializer = i2;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        this.RemoteActionCompatParcelizer = modifier;
        this.MediaBrowserCompatMediaItem = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.MediaBrowserCompatMediaItem;
        if (i2 != 0) {
            ((Integer) obj2).getClass();
            VerifyScreenKt.VerifyContent(this.read, this.write, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
            int i4 = RatingCompat + 17;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return createfromparcel;
            }
            throw null;
        }
        ((Integer) obj2).getClass();
        VerifyScreenKt.read(this.read, this.write, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
        int i5 = RatingCompat + 85;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
        return createfromparcel;
    }
}
