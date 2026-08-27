package o;

import android.os.Process;
import com.roadrunner.recentdeliveries.presentation.RecentDeliveriesScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sendPreinstallReferrerI implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int ComponentActivity = 0;
    public static int MediaSessionCompatToken = 0;
    public static int PlaybackStateCompat = 0;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY MediaBrowserCompatMediaItem;
    public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY MediaDescriptionCompat;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaMetadataCompat;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaSessionCompatQueueItem;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 MediaSessionCompatResultReceiverWrapper;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 ParcelableVolumeInfo;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM PlaybackStateCompatCustomAction;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RatingCompat;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ sendLicenseVerificationDataI serializer;
    public final /* synthetic */ androidx.compose.ui.Modifier write;

    public /* synthetic */ sendPreinstallReferrerI(sendLicenseVerificationDataI sendlicenseverificationdatai, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.serializer = sendlicenseverificationdatai;
        this.RemoteActionCompatParcelizer = z;
        this.MediaSessionCompatQueueItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.RatingCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
        this.MediaBrowserCompatMediaItem = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.MediaDescriptionCompat = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
        this.PlaybackStateCompatCustomAction = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
        this.MediaSessionCompatResultReceiverWrapper = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.ParcelableVolumeInfo = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.write = modifier;
        this.read = i;
        this.IconCompatParcelizer = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 93;
        ComponentActivity = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(this.read | 1);
        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        RecentDeliveriesScreenKt.RecentDeliveriesScreen(this.serializer, this.RemoteActionCompatParcelizer, this.MediaSessionCompatQueueItem, this.MediaMetadataCompat, this.RatingCompat, this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat, this.PlaybackStateCompatCustomAction, this.MediaSessionCompatResultReceiverWrapper, this.ParcelableVolumeInfo, this.write, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 119;
        ComponentActivity = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    public static int read() {
        int i = MediaSessionCompatToken;
        int i2 = i % 9321828;
        MediaSessionCompatToken = i + 1;
        if (i2 != 0) {
            return PlaybackStateCompat;
        }
        int iMyPid = Process.myPid();
        PlaybackStateCompat = iMyPid;
        return iMyPid;
    }
}
