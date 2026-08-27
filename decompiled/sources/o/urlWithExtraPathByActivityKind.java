package o;

import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.image_overlay_v2.InstructionsListContentKt;
import com.roadrunner.rrds.compose.component.forms.DropdownKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class urlWithExtraPathByActivityKind implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 0;
    private static int ParcelableVolumeInfo = 1;
    public final /* synthetic */ androidx.compose.ui.Modifier IconCompatParcelizer;
    public final /* synthetic */ int MediaBrowserCompatMediaItem;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ int RatingCompat;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ urlWithExtraPathByActivityKind(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, boolean z, int i, String str2, int i2, int i3) {
        this.write = 0;
        this.read = str;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = modifier;
        this.serializer = z;
        this.RatingCompat = i;
        this.MediaMetadataCompat = str2;
        this.MediaBrowserCompatMediaItem = i2;
        this.MediaDescriptionCompat = i3;
    }

    public /* synthetic */ urlWithExtraPathByActivityKind(String str, int i, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, int i2, int i3, int i4) {
        this.write = i4;
        this.read = str;
        this.RatingCompat = i;
        this.serializer = z;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = modifier;
        this.MediaBrowserCompatMediaItem = i2;
        this.MediaDescriptionCompat = i3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.write;
        int i3 = this.MediaDescriptionCompat;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = this.MediaMetadataCompat;
        if (i2 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem | 1);
            DropdownKt.read(this.read, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.serializer, this.RatingCompat, (String) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, this.MediaDescriptionCompat);
            int i4 = ParcelableVolumeInfo + 21;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel;
        }
        if (i2 != 1) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
            InstructionsListContentKt.InstructionsItem(this.read, this.RatingCompat, this.serializer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.MediaBrowserCompatMediaItem, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
            int i6 = ParcelableVolumeInfo + 65;
            MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
        com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.InstructionsListContentKt.InstructionsItem(this.read, this.RatingCompat, this.serializer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.MediaBrowserCompatMediaItem, (getBirthDateFull) obj, iRemoteActionCompatParcelizer3);
        int i8 = ParcelableVolumeInfo + 55;
        MediaSessionCompatQueueItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return createfromparcel;
        }
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
