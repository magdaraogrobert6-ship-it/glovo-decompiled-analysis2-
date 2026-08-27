package o;

import dagger.Lazy;
import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class consumeFlingInStretch {
    private static int ParcelableVolumeInfo = 1;
    private static int RatingCompat;
    public final MutableStateFlow IconCompatParcelizer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public final transferSessionPackageI MediaMetadataCompat;
    public final StateFlow MediaSessionCompatQueueItem;
    public final Lazy RemoteActionCompatParcelizer;
    public final LinkedHashSet read;
    public final EnumColumnAdapter serializer;
    public final getContentViewGroupParentLayout write;

    public consumeFlingInStretch(transferSessionPackageI transfersessionpackagei, EnumColumnAdapter enumColumnAdapter, Lazy lazy, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.MediaMetadataCompat = transfersessionpackagei;
        this.serializer = enumColumnAdapter;
        this.RemoteActionCompatParcelizer = lazy;
        this.write = getcontentviewgroupparentlayout;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(access400.Loading);
        this.IconCompatParcelizer = mutableStateFlow;
        this.MediaSessionCompatQueueItem = mutableStateFlow;
        this.read = new LinkedHashSet();
        this.MediaDescriptionCompat = access300.getEntries().size();
    }

    public final void IconCompatParcelizer(access300 access300Var) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompat + 49;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        access300Var.getClass();
        LinkedHashSet linkedHashSet = this.read;
        int size = linkedHashSet.size();
        int i4 = this.MediaDescriptionCompat;
        if (size == i4) {
            return;
        }
        linkedHashSet.add(access300Var);
        if (linkedHashSet.size() == i4) {
            int i5 = ParcelableVolumeInfo + 57;
            RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            getUnmergedRootSemanticsNode getunmergedrootsemanticsnode = (getUnmergedRootSemanticsNode) ((SemanticsOwnerKt) this.RemoteActionCompatParcelizer.write());
            getunmergedrootsemanticsnode.getClass();
            BlurFilter blurFilter = getunmergedrootsemanticsnode.write.ParcelableVolumeInfo;
            blurFilter.RemoteActionCompatParcelizer("app_start_to_interactive", "destinationScreen", "Home");
            blurFilter.write("app_start_to_interactive");
            getRootInfoui getrootinfoui = (getRootInfoui) getunmergedrootsemanticsnode.IconCompatParcelizer.write;
            getrootinfoui.RemoteActionCompatParcelizer("app_start_to_interactive_sentry", "destinationScreen", "Home");
            getrootinfoui.write("app_start_to_interactive_sentry");
            this.IconCompatParcelizer.IconCompatParcelizer(access400.Available);
            int i7 = RatingCompat + 9;
            ParcelableVolumeInfo = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
    }
}
