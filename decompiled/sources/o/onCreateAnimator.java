package o;

import com.roadrunner.heatmap.data.HeatmapDataStore$set$2;
import com.roadrunner.home.bottomsheet.HomeBottomSheetUiModelImpl;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class onCreateAnimator implements FlowCollector {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ HomeBottomSheetUiModelImpl RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ onCreateAnimator(HomeBottomSheetUiModelImpl homeBottomSheetUiModelImpl, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = homeBottomSheetUiModelImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = read + 123;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        HomeBottomSheetUiModelImpl homeBottomSheetUiModelImpl = this.RemoteActionCompatParcelizer;
        if (i3 == 0) {
            HomeBottomSheetUiModelImpl.read(homeBottomSheetUiModelImpl);
            return createfromparcel2;
        }
        if (i3 == 1) {
            performContextItemSelected performcontextitemselected = ((performDestroy) obj).RemoteActionCompatParcelizer;
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = homeBottomSheetUiModelImpl.MediaSessionCompatResultReceiverWrapper;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                int i4 = IconCompatParcelizer + 61;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                    throw null;
                }
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            }
            homeBottomSheetUiModelImpl.ParcelableVolumeInfo = performcontextitemselected;
            homeBottomSheetUiModelImpl.MediaSessionCompatResultReceiverWrapper = BuildersKt.RemoteActionCompatParcelizer(homeBottomSheetUiModelImpl.PlaybackStateCompatCustomAction, null, null, new HeatmapDataStore$set$2(performcontextitemselected, homeBottomSheetUiModelImpl, null, 3), 3);
            return createfromparcel2;
        }
        if (i3 != 2) {
            ((Boolean) obj).getClass();
            HomeBottomSheetUiModelImpl.read(homeBottomSheetUiModelImpl);
            return createfromparcel2;
        }
        onPrimaryNavigationFragmentChanged onprimarynavigationfragmentchanged = (onPrimaryNavigationFragmentChanged) obj;
        boolean zRemoteActionCompatParcelizer = setNativeShader.RemoteActionCompatParcelizer((onOptionsMenuClosed) homeBottomSheetUiModelImpl.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read());
        SharedFlowImpl sharedFlowImpl = homeBottomSheetUiModelImpl.write;
        if (zRemoteActionCompatParcelizer) {
            int i5 = IconCompatParcelizer + 13;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                sharedFlowImpl.write(onprimarynavigationfragmentchanged);
                throw null;
            }
            sharedFlowImpl.write(onprimarynavigationfragmentchanged);
        } else {
            sharedFlowImpl.write(onPrimaryNavigationFragmentChanged.COLLAPSED);
        }
        return createfromparcel2;
    }
}
