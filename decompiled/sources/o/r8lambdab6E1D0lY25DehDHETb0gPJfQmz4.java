package o;

import com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.presentation.EntrancePictureCommonKt;
import com.roadrunner.rider.state.searchshifts.presentation.timepicker.DualColumnTimePickerKt;
import com.roadrunner.settings.ui.components.PreferenceItemKt;
import com.roadrunner.vendor.review.api.presentation.VendorReviewOptionKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdab6E1D0lY25DehDHETb0gPJfQmz4 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ int MediaBrowserCompatMediaItem;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ androidx.compose.ui.Modifier RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ r8lambdab6E1D0lY25DehDHETb0gPJfQmz4(ReferrerDetails referrerDetails, androidx.compose.ui.Modifier modifier, String str, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, int i2) {
        this.IconCompatParcelizer = 2;
        this.read = referrerDetails;
        this.RemoteActionCompatParcelizer = modifier;
        this.write = str;
        this.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.MediaMetadataCompat = i;
        this.MediaBrowserCompatMediaItem = i2;
    }

    public /* synthetic */ r8lambdab6E1D0lY25DehDHETb0gPJfQmz4(Object obj, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, int i, int i2, int i3) {
        this.IconCompatParcelizer = i3;
        this.write = obj;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.RemoteActionCompatParcelizer = modifier;
        this.MediaMetadataCompat = i;
        this.MediaBrowserCompatMediaItem = i2;
    }

    public /* synthetic */ r8lambdab6E1D0lY25DehDHETb0gPJfQmz4(String str, androidx.compose.ui.Modifier modifier, String str2, Object obj, int i, int i2, int i3) {
        this.IconCompatParcelizer = i3;
        this.write = str;
        this.RemoteActionCompatParcelizer = modifier;
        this.read = str2;
        this.serializer = obj;
        this.MediaMetadataCompat = i;
        this.MediaBrowserCompatMediaItem = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 123;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.MediaMetadataCompat;
        Object obj4 = this.serializer;
        Object obj5 = this.read;
        Object obj6 = this.write;
        if (i3 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            PreferenceItemKt.PreferenceCategory((String) obj6, this.RemoteActionCompatParcelizer, (String) obj5, (DragAndDropTargetModifierNode) obj4, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem);
            return createfromparcel2;
        }
        if (i3 == 1) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            EntrancePictureCommonKt.IconCompatParcelizer((String) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, this.RemoteActionCompatParcelizer, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2, this.MediaBrowserCompatMediaItem);
            return createfromparcel2;
        }
        if (i3 == 2) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            DualColumnTimePickerKt.DualColumnTimePicker((ReferrerDetails) obj5, this.RemoteActionCompatParcelizer, (String) obj6, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (getBirthDateFull) obj, iRemoteActionCompatParcelizer3, this.MediaBrowserCompatMediaItem);
            return createfromparcel2;
        }
        if (i3 != 3) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer4 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            VendorReviewOptionKt.VendorReviewOptionContent((subscribeToSessionUpdateslambda0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, this.RemoteActionCompatParcelizer, (getBirthDateFull) obj, iRemoteActionCompatParcelizer4, this.MediaBrowserCompatMediaItem);
            return createfromparcel2;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer5 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
        accessgetClearConfigSentinelcp.write((String) obj6, this.RemoteActionCompatParcelizer, (String) obj5, (Integer) obj4, (getBirthDateFull) obj, iRemoteActionCompatParcelizer5, this.MediaBrowserCompatMediaItem);
        int i5 = MediaDescriptionCompat + 79;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel2;
    }
}
