package o;

import com.roadrunner.delivery.accept.backToBackOrder.presentation.floatingIcon.BackToBackOrdersIconWithAnimatedBorderKt;
import com.roadrunner.delivery.pickupdropoff.details.api.domain.TagColorTokenMapperKt;
import com.roadrunner.delivery.state.pudo.TagColorToken;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdaYAYqCgublv1aaKYwrIvjEYiW1c implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ int serializer = 0;
    public final /* synthetic */ int write;

    public /* synthetic */ r8lambdaYAYqCgublv1aaKYwrIvjEYiW1c(TagColorToken tagColorToken, String str, androidx.compose.ui.Modifier modifier, int i, int i2, int i3) {
        this.RemoteActionCompatParcelizer = tagColorToken;
        this.IconCompatParcelizer = str;
        this.read = modifier;
        this.write = i;
        this.MediaDescriptionCompat = i2;
        this.MediaMetadataCompat = i3;
    }

    public /* synthetic */ r8lambdaYAYqCgublv1aaKYwrIvjEYiW1c(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, androidx.compose.ui.Modifier modifier, int i2, getTopLeftannotations gettopleftannotations, int i3) {
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = i;
        this.read = modifier;
        this.MediaDescriptionCompat = i2;
        this.IconCompatParcelizer = gettopleftannotations;
        this.MediaMetadataCompat = i3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 57;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        Object obj4 = this.IconCompatParcelizer;
        Object obj5 = this.RemoteActionCompatParcelizer;
        if (i3 != 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(this.MediaMetadataCompat | 1);
            BackToBackOrdersIconWithAnimatedBorderKt.BackToBackOrdersIconWithAnimatedBorder((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, this.write, this.read, this.MediaDescriptionCompat, (getTopLeftannotations) obj4, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            return createfromparcel2;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(this.MediaDescriptionCompat | 1);
        TagColorTokenMapperKt.RemoteActionCompatParcelizer((TagColorToken) obj5, (String) obj4, this.read, this.write, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2, this.MediaMetadataCompat);
        int i4 = RatingCompat + 85;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel2;
    }
}
