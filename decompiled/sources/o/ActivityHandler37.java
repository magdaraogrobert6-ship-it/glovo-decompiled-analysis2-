package o;

import com.roadrunner.rider.recruitment.accountcreation.password_creation.presentation.compose.PasswordCreationScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ActivityHandler37 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int MediaSessionCompatToken = 1;
    public final /* synthetic */ androidx.compose.ui.Modifier IconCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 MediaBrowserCompatMediaItem;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaDescriptionCompat;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 MediaMetadataCompat;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaSessionCompatQueueItem;
    public final /* synthetic */ int PlaybackStateCompatCustomAction;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RatingCompat;
    public final /* synthetic */ androidx.compose.ui.focus.FocusRequester RemoteActionCompatParcelizer;
    public final /* synthetic */ ActivityHandler39 read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    public /* synthetic */ ActivityHandler37(ActivityHandler39 activityHandler39, androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, int i, int i2) {
        this.serializer = i2;
        this.read = activityHandler39;
        this.RemoteActionCompatParcelizer = focusRequester;
        this.IconCompatParcelizer = modifier;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaMetadataCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaDescriptionCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaSessionCompatQueueItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.RatingCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        this.MediaBrowserCompatMediaItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k3;
        this.PlaybackStateCompatCustomAction = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 77;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.PlaybackStateCompatCustomAction;
        if (i3 != 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            PasswordCreationScreenKt.PasswordCreationContent(this.read, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write, this.MediaMetadataCompat, this.MediaDescriptionCompat, this.MediaSessionCompatQueueItem, this.RatingCompat, this.MediaBrowserCompatMediaItem, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            return createfromparcel2;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
        PasswordCreationScreenKt.RemoteActionCompatParcelizer(this.read, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write, this.MediaMetadataCompat, this.MediaDescriptionCompat, this.MediaSessionCompatQueueItem, this.RatingCompat, this.MediaBrowserCompatMediaItem, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
        int i5 = MediaSessionCompatResultReceiverWrapper + 65;
        MediaSessionCompatToken = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return createfromparcel2;
        }
        throw null;
    }
}
