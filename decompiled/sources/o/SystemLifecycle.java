package o;

import com.google.android.play.core.appupdate.zzz;
import com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageCardContainerKt;
import com.roadrunner.delivery.ontheway.entrancepicture.details.presentation.compose.EntrancePictureScreenKt;
import com.roadrunner.rider.state.worksettings.presentation.WorkSettingsKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SystemLifecycle implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatToken = 1;
    private static int PlaybackStateCompat;
    public final /* synthetic */ int IconCompatParcelizer = 2;
    public final /* synthetic */ isInvalidIndex MediaBrowserCompatMediaItem;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaDescriptionCompat;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ boolean RatingCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ SystemLifecycle(getTopLeftnOccac gettopleftnoccac, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, androidx.compose.ui.Modifier modifier, int i) {
        this.read = gettopleftnoccac;
        this.RatingCompat = z;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaBrowserCompatMediaItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        this.MediaDescriptionCompat = modifier;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ SystemLifecycle(getStoreInfoFromClient getstoreinfofromclient, ImageHeaderParserImageType imageHeaderParserImageType, zzz zzzVar, isMainThread ismainthread, hasSameLayoutAffectingAttributesui_text hassamelayoutaffectingattributesui_text, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, boolean z, androidx.compose.ui.Modifier modifier, int i) {
        this.read = getstoreinfofromclient;
        this.RemoteActionCompatParcelizer = imageHeaderParserImageType;
        this.serializer = zzzVar;
        this.write = ismainthread;
        this.MediaSessionCompatQueueItem = hassamelayoutaffectingattributesui_text;
        this.MediaBrowserCompatMediaItem = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.RatingCompat = z;
        this.MediaDescriptionCompat = modifier;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ SystemLifecycle(String str, String str2, String str3, Integer num, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, int i) {
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
        this.serializer = str3;
        this.write = num;
        this.RatingCompat = z;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaBrowserCompatMediaItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaDescriptionCompat = modifier;
        this.MediaMetadataCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 111;
        MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaMetadataCompat;
        isInvalidIndex isinvalidindex = this.MediaBrowserCompatMediaItem;
        Object obj3 = this.MediaSessionCompatQueueItem;
        Object obj4 = this.write;
        Object obj5 = this.serializer;
        Object obj6 = this.RemoteActionCompatParcelizer;
        Object obj7 = this.read;
        if (i4 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            WorkSettingsKt.WorkSettingsColumn((getStoreInfoFromClient) obj7, (ImageHeaderParserImageType) obj6, (zzz) obj5, (isMainThread) obj4, (hasSameLayoutAffectingAttributesui_text) obj3, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) isinvalidindex, this.RatingCompat, this.MediaDescriptionCompat, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            return createfromparcel;
        }
        if (i4 != 1) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            EntrancePictureScreenKt.DetailsSection((String) obj7, (String) obj6, (String) obj5, (Integer) obj4, this.RatingCompat, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) isinvalidindex, this.MediaDescriptionCompat, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
        ActionableMessageCardContainerKt.ActionableMessageCard((getTopLeftnOccac) obj7, this.RatingCompat, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) isinvalidindex, this.MediaDescriptionCompat, (getBirthDateFull) obj, iRemoteActionCompatParcelizer3);
        int i6 = MediaSessionCompatToken + 17;
        PlaybackStateCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return createfromparcel;
        }
        throw null;
    }
}
