package o;

import com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.compose.LastStopSelectionBottomSheetContentKt;
import com.roadrunner.home.nest.riderstatistics.RiderStatisticsContentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hasSwipeFlag implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ androidx.compose.ui.Modifier serializer;
    public final /* synthetic */ r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk write;

    public /* synthetic */ hasSwipeFlag(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.read = i2;
        this.write = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = modifier;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 35;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.RemoteActionCompatParcelizer;
        androidx.compose.ui.Modifier modifier = this.serializer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.IconCompatParcelizer;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = this.write;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 != 0) {
            LastStopSelectionBottomSheetContentKt.RecentLocations(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        RiderStatisticsContentKt.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
        int i6 = MediaBrowserCompatMediaItem + 45;
        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return createfromparcel;
        }
        throw null;
    }
}
