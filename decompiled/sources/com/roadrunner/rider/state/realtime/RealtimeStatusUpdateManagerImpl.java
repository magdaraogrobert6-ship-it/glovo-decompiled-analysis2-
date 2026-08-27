package com.roadrunner.rider.state.realtime;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore$clear$2;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import dagger.Lazy;
import java.util.concurrent.CancellationException;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.ApiHelperForM3;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.flushI;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getOptimizationLevel;
import o.getPageSize;
import o.getSceneString;
import o.isAdapterPositionOnScreen;
import o.lambdasendPreinstallReferrer19;
import o.launchEventResponseTasksI;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.removeNodeAtDepth;
import o.setOnSessionTrackingFailedListener;
import o.setOnThirdPartySharingSettingsChangedListener;
import okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class RealtimeStatusUpdateManagerImpl {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final getContentViewGroupParentLayout IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaSessionCompatQueueItem;
    public final launchEventResponseTasksI RemoteActionCompatParcelizer;
    public final Lazy read;
    public final isAdapterPositionOnScreen serializer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU write;

    public RealtimeStatusUpdateManagerImpl(launchEventResponseTasksI launcheventresponsetasksi, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, Lazy lazy, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.RemoteActionCompatParcelizer = launcheventresponsetasksi;
        this.MediaSessionCompatQueueItem = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = lazy;
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        this.serializer = new isAdapterPositionOnScreen(new RealWebSocket$$ExternalSyntheticLambda0(2, this));
    }

    public final void read() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 9;
        RatingCompat = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 != 0) {
            shortNewsContentCardView.hashCode();
            throw null;
        }
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.write;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            int i3 = RatingCompat + 117;
            MediaMetadataCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        this.write = BuildersKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, null, null, new NafathModalUiModelImpl$1(this, shortNewsContentCardView, 27), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public static final Object access$updateState(RealtimeStatusUpdateManagerImpl realtimeStatusUpdateManagerImpl, lambdasendPreinstallReferrer19 lambdasendpreinstallreferrer19, ContinuationImpl continuationImpl) {
        flushI flushi;
        int i = 2;
        int i2 = 2 % 2;
        if (continuationImpl instanceof flushI) {
            flushi = (flushI) continuationImpl;
            int i3 = flushi.serializer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = MediaMetadataCompat + 123;
                RatingCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                flushi.serializer = i3 - Integer.MIN_VALUE;
            } else {
                flushi = new flushI(realtimeStatusUpdateManagerImpl, continuationImpl);
            }
        } else {
            flushi = new flushI(realtimeStatusUpdateManagerImpl, continuationImpl);
        }
        Object objFirstOrNull = flushi.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = flushi.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lambdasendpreinstallreferrer19.metadata.version, "1"}, getCieXyz.write())).booleanValue()) {
                int i7 = MediaMetadataCompat + 39;
                RatingCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    return createfromparcel;
                }
                throw null;
            }
            Flow flowWrite = TuplesKt.write(((UpdateStateUseCaseImpl) realtimeStatusUpdateManagerImpl.MediaSessionCompatQueueItem.write()).IconCompatParcelizer(new setOnThirdPartySharingSettingsChangedListener(setOnSessionTrackingFailedListener.SOCKET_EVENT, false)));
            SignInDataStore$clear$2 signInDataStore$clear$2 = new SignInDataStore$clear$2(i, 20, shortNewsContentCardView);
            flushi.serializer = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowWrite, signInDataStore$clear$2, flushi);
            if (objFirstOrNull == coroutineSingletons) {
                int i8 = MediaMetadataCompat + 23;
                RatingCompat = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        }
        getOptimizationLevel getoptimizationlevel = (getOptimizationLevel) objFirstOrNull;
        if (getoptimizationlevel != null && (getoptimizationlevel instanceof getSceneString)) {
            int i9 = MediaMetadataCompat + 15;
            RatingCompat = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Realtime status update successful", new Object[0]);
            ((ApiHelperForM3) ((getPageSize) realtimeStatusUpdateManagerImpl.serializer.MediaSessionCompatResultReceiverWrapper())).serializer();
            return createfromparcel;
        }
        Timber.RemoteActionCompatParcelizer.write(new RealtimeStatusUpdateException("Failed to update state from RealtimeStatusUpdateManager", getoptimizationlevel != null ? getoptimizationlevel.read() : null));
        int i11 = MediaMetadataCompat + 95;
        RatingCompat = i11 % Fields.SpotShadowColor;
        if (i11 % 2 == 0) {
            return createfromparcel;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }
}
