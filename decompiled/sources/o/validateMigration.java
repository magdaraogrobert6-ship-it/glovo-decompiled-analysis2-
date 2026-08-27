package o;

import com.roadrunner.freelancing.presentation.stopworking.ConfirmStopWorkingDialogKt;
import com.roadrunner.liveness.cancel.CancelLivenessDetectionDialogKt;
import com.roadrunner.settings.ui.components.NavigationSettingsDialogKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class validateMigration implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ generatePOSTBodyString serializer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    public /* synthetic */ validateMigration(generatePOSTBodyString generatepostbodystring, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.serializer = generatepostbodystring;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.read = modifier;
        this.MediaDescriptionCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 19;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaDescriptionCompat;
        if (i4 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            CancelLivenessDetectionDialogKt.write(this.serializer, this.write, this.RemoteActionCompatParcelizer, this.read, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            int i6 = MediaSessionCompatQueueItem + 119;
            MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 94 / 0;
            }
            return createfromparcel;
        }
        if (i4 == 1) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            ConfirmStopWorkingDialogKt.read(this.serializer, this.write, this.RemoteActionCompatParcelizer, this.read, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
            return createfromparcel;
        }
        if (i4 == 2) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            collect.IconCompatParcelizer(this.serializer, this.write, this.RemoteActionCompatParcelizer, this.read, (getBirthDateFull) obj, iRemoteActionCompatParcelizer3);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer4 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
        NavigationSettingsDialogKt.serializer(this.serializer, this.write, this.RemoteActionCompatParcelizer, this.read, (getBirthDateFull) obj, iRemoteActionCompatParcelizer4);
        int i8 = MediaMetadataCompat + 35;
        MediaSessionCompatQueueItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return createfromparcel;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
