package o;

import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
import com.roadrunner.face.verification.presentation.selfie.review.ReviewSelfieContentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class onDependentViewChanged implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ androidx.compose.ui.Modifier IconCompatParcelizer;
    public final /* synthetic */ DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ onDependentViewChanged(DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, androidx.compose.ui.Modifier modifier, int i, int i2, int i3) {
        this.read = i3;
        this.RemoteActionCompatParcelizer = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
        this.IconCompatParcelizer = modifier;
        this.serializer = i;
        this.write = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 121;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.write;
        int i6 = this.serializer;
        androidx.compose.ui.Modifier modifier = this.IconCompatParcelizer;
        DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 = this.RemoteActionCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 != 0) {
            ReviewSelfieContentKt.ButtonsFooterConsentError(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, modifier, i6, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        ReviewSelfieContentKt.serializer(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, modifier, i6, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
        int i7 = MediaMetadataCompat + 49;
        MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 18 / 0;
        }
        return createfromparcel;
    }
}
