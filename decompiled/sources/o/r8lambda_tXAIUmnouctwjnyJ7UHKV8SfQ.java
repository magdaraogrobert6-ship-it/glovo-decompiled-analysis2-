package o;

import com.roadrunner.rider.state.searchshifts.presentation.SearchShiftsSelectedZoneKt;
import com.roadrunner.rrds.compose.component.message.BannerMessageKt;
import com.roadrunner.settings.ui.components.PreferenceItemKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambda_tXAIUmnouctwjnyJ7UHKV8SfQ implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int MediaSessionCompatToken = 1;
    public final /* synthetic */ int IconCompatParcelizer = 2;
    public final /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaMetadataCompat;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ int RatingCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ r8lambda_tXAIUmnouctwjnyJ7UHKV8SfQ(androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.vector.ImageVector imageVector, String str, String str2, String str3, enableBridgeSecurity enablebridgesecurity, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, int i2) {
        this.MediaMetadataCompat = modifier;
        this.RemoteActionCompatParcelizer = imageVector;
        this.write = str;
        this.MediaSessionCompatQueueItem = str2;
        this.read = str3;
        this.serializer = enablebridgesecurity;
        this.MediaBrowserCompatMediaItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RatingCompat = i;
        this.MediaDescriptionCompat = i2;
    }

    public /* synthetic */ r8lambda_tXAIUmnouctwjnyJ7UHKV8SfQ(hasAllLocationsBeenRead hasalllocationsbeenread, xb xbVar, accessisMainThread accessismainthread, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Modifier modifier, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, int i, int i2) {
        this.RemoteActionCompatParcelizer = hasalllocationsbeenread;
        this.serializer = xbVar;
        this.MediaBrowserCompatMediaItem = accessismainthread;
        this.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaMetadataCompat = modifier;
        this.MediaSessionCompatQueueItem = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
        this.RatingCompat = i;
        this.MediaDescriptionCompat = i2;
    }

    public /* synthetic */ r8lambda_tXAIUmnouctwjnyJ7UHKV8SfQ(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, androidx.compose.ui.Modifier modifier, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, int i, int i2) {
        this.RemoteActionCompatParcelizer = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.MediaBrowserCompatMediaItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
        this.MediaMetadataCompat = modifier;
        this.MediaSessionCompatQueueItem = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
        this.RatingCompat = i;
        this.MediaDescriptionCompat = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        int i3 = this.RatingCompat;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = this.MediaBrowserCompatMediaItem;
        Object obj4 = this.serializer;
        Object obj5 = this.read;
        Object obj6 = this.MediaSessionCompatQueueItem;
        Object obj7 = this.write;
        Object obj8 = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
            PreferenceItemKt.write((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj8, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, this.MediaMetadataCompat, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, this.MediaDescriptionCompat);
            int i4 = MediaSessionCompatToken + 49;
            MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel;
        }
        if (i2 == 1) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(this.MediaDescriptionCompat | 1);
            SearchShiftsSelectedZoneKt.SearchShiftsSelectedZone((hasAllLocationsBeenRead) obj8, (xb) obj4, (accessisMainThread) obj3, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, this.MediaMetadataCompat, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6, this.RatingCompat, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
        BannerMessageKt.BannerMessageSuccess(this.MediaMetadataCompat, (androidx.compose.ui.graphics.vector.ImageVector) obj8, (String) obj7, (String) obj6, (String) obj5, (enableBridgeSecurity) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer3, this.MediaDescriptionCompat);
        int i6 = MediaSessionCompatResultReceiverWrapper + 15;
        MediaSessionCompatToken = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
