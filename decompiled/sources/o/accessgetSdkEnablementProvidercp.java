package o;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetSdkEnablementProvidercp {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final getContentViewGroupParentLayout IconCompatParcelizer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU RatingCompat;
    public final SemanticsOwner RemoteActionCompatParcelizer;
    public final transferSessionPackageI read;
    public final MutableStateFlow serializer;
    public final StateFlow write;

    public accessgetSdkEnablementProvidercp(SemanticsOwner semanticsOwner, transferSessionPackageI transfersessionpackagei, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        semanticsOwner.getClass();
        transfersessionpackagei.getClass();
        getcontentviewgroupparentlayout.getClass();
        this.RemoteActionCompatParcelizer = semanticsOwner;
        this.read = transfersessionpackagei;
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(accessisInstanceStoppedp.Loading);
        this.serializer = mutableStateFlow;
        this.write = mutableStateFlow;
    }

    public final void write() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 97;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 != 0) {
            ((getRootInfoui) this.RemoteActionCompatParcelizer).serializer("side_menu_time_to_interactive");
            this.serializer.IconCompatParcelizer(accessisInstanceStoppedp.Loading);
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.RatingCompat;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            }
            this.RatingCompat = BuildersKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, null, null, new RxConvertKt$asFlow$1(this, shortNewsContentCardView, 15), 3);
            int i3 = MediaMetadataCompat + 97;
            MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        ((getRootInfoui) this.RemoteActionCompatParcelizer).serializer("side_menu_time_to_interactive");
        this.serializer.IconCompatParcelizer(accessisInstanceStoppedp.Loading);
        shortNewsContentCardView.hashCode();
        throw null;
    }
}
