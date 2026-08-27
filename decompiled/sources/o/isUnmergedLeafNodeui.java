package o;

import com.roadrunner.appmigration.presentation.compose.AppMigrationActionsKt;
import com.roadrunner.appmigration.presentation.compose.AppMigrationFullScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class isUnmergedLeafNodeui implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public final /* synthetic */ SemanticsNodeemitFakeNodesfakeNode2 IconCompatParcelizer;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaMetadataCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    public /* synthetic */ isUnmergedLeafNodeui(SemanticsNodeemitFakeNodesfakeNode2 semanticsNodeemitFakeNodesfakeNode2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.IconCompatParcelizer = semanticsNodeemitFakeNodesfakeNode2;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        this.MediaMetadataCompat = modifier;
        this.MediaDescriptionCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 43;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.MediaDescriptionCompat;
        if (i3 == 0) {
            ((Integer) obj2).getClass();
            AppMigrationActionsKt.AppMigrationActions(this.IconCompatParcelizer, this.read, this.serializer, this.write, this.MediaMetadataCompat, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
            return createfromparcel2;
        }
        ((Integer) obj2).getClass();
        AppMigrationFullScreenKt.AppMigrationFooter(this.IconCompatParcelizer, this.read, this.serializer, this.write, this.MediaMetadataCompat, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
        int i5 = RatingCompat + 55;
        MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel2;
    }
}
