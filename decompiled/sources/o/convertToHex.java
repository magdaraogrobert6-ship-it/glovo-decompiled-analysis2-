package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.ReportBottomSheetKt;
import com.roadrunner.rider.safety.report.presentation.ScoreBreakdownKt;
import com.roadrunner.rrds.compose.component.actions.links.LinkKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class convertToHex implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final /* synthetic */ Object read;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ convertToHex(boundsOfLayoutNode boundsoflayoutnode, String str, androidx.compose.ui.Modifier modifier, boolean z, Integer num, int i) {
        this.IconCompatParcelizer = boundsoflayoutnode;
        this.read = str;
        this.write = modifier;
        this.serializer = z;
        this.MediaSessionCompatQueueItem = num;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ convertToHex(fixedJhjzzOo fixedjhjzzoo, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Modifier modifier, Integer num, boolean z, int i) {
        this.read = fixedjhjzzoo;
        this.MediaSessionCompatQueueItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.write = modifier;
        this.IconCompatParcelizer = num;
        this.serializer = z;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ convertToHex(getPreinstallFilePath getpreinstallfilepath, getPreinstallFilePath getpreinstallfilepath2, getPreinstallFilePath getpreinstallfilepath3, boolean z, androidx.compose.ui.Modifier modifier, int i) {
        this.read = getpreinstallfilepath;
        this.IconCompatParcelizer = getpreinstallfilepath2;
        this.MediaSessionCompatQueueItem = getpreinstallfilepath3;
        this.serializer = z;
        this.write = modifier;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ convertToHex(String str, androidx.compose.ui.Modifier modifier, String str2, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        this.read = str;
        this.write = modifier;
        this.IconCompatParcelizer = str2;
        this.serializer = z;
        this.MediaSessionCompatQueueItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ convertToHex(String str, String str2, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, int i) {
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.serializer = z;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaMetadataCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 77;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.MediaMetadataCompat;
        Object obj4 = this.write;
        Object obj5 = this.MediaSessionCompatQueueItem;
        Object obj6 = this.IconCompatParcelizer;
        Object obj7 = this.read;
        if (i3 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            LinkKt.serializer((String) obj7, (androidx.compose.ui.Modifier) obj4, (String) obj6, this.serializer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            int i5 = RatingCompat + 109;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return createfromparcel2;
        }
        if (i3 == 1) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            ReportBottomSheetKt.SheetActions((String) obj7, (String) obj6, this.serializer, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
            return createfromparcel2;
        }
        if (i3 == 2) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            getCurrentAnimation.write((boundsOfLayoutNode) obj6, (String) obj7, (androidx.compose.ui.Modifier) obj4, this.serializer, (Integer) obj5, (getBirthDateFull) obj, iRemoteActionCompatParcelizer3);
            return createfromparcel2;
        }
        if (i3 != 3) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer4 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            ScoreBreakdownKt.ScoreBreakdown((getPreinstallFilePath) obj7, (getPreinstallFilePath) obj6, (getPreinstallFilePath) obj5, this.serializer, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, iRemoteActionCompatParcelizer4);
            return createfromparcel2;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer5 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
        UnsupportedComposeAnimation.write((fixedJhjzzOo) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (androidx.compose.ui.Modifier) obj4, (Integer) obj6, this.serializer, (getBirthDateFull) obj, iRemoteActionCompatParcelizer5);
        return createfromparcel2;
    }
}
