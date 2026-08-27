package o;

import android.app.Application;
import android.view.WindowManager;
import com.google.re2j.Parser;
import com.roadrunner.freelancing.domain.StopWorkingImpl;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.helpcenter.domain.GetUnreadMessageCountUseCase;
import com.roadrunner.home.bottomsheet.config.GetBottomSheetConfigurationType;
import com.roadrunner.home.bottomsheet.loading.BottomSheetShimmeringLoadingBarUiModel;
import com.roadrunner.home.bottomsheet.sheethandle.SheetHandleItemUiModel;
import com.roadrunner.home.bottomsheet.skeleton.BottomSheetHeaderSkeletonUiModel;
import com.roadrunner.inappnotifications.data.InAppNotificationsRepository;
import com.roadrunner.inappnotifications.domain.FetchAndSaveInAppMessageUseCase;
import com.roadrunner.liveness.recording.data.ChallengesRepository;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.map.integration.mapbox.domain.GetLineLayer;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.sentiance.core.model.events.I$b;
import io.grpc.internal.SharedResourcePool;
import io.sentry.CombinedScopeView;
import java.time.Clock;
import java.util.Map;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class setUseTempTrackingTableroom_runtime implements getColorIntegerOrNulllambda0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final getColorIntegerOrNulllambda0 RemoteActionCompatParcelizer;

    public setUseTempTrackingTableroom_runtime(getActionViewIntentlambda0 getactionviewintentlambda0, transactionWithResultsuspendImpl transactionwithresultsuspendimpl) {
        this.IconCompatParcelizer = 13;
        this.RemoteActionCompatParcelizer = transactionwithresultsuspendimpl;
    }

    public /* synthetic */ setUseTempTrackingTableroom_runtime(getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = getcolorintegerornulllambda0;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = read + 123;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        getColorIntegerOrNulllambda0 getcolorintegerornulllambda0 = this.RemoteActionCompatParcelizer;
        switch (i3) {
            case 0:
                return new setTransactionSuccessful((Application) ((hasNestedScrollingParent) getcolorintegerornulllambda0).write());
            case 1:
                return new StopWorkingImpl((Parser.Pair) ((onMeasureChild) getcolorintegerornulllambda0).write());
            case 2:
                return new ScrollingView((logPushStoryPageClickedlambda11) ((subscribeToBannersUpdates) getcolorintegerornulllambda0).write(), (getTappableElementInsets) initTypeBoundingRectsMaps.RemoteActionCompatParcelizer.write());
            case 3:
                return new GetUnreadMessageCountUseCase((RouterLogger) ((onMeasureChild) getcolorintegerornulllambda0).write());
            case 4:
                return new onContextItemSelected(new SheetHandleItemUiModel(), new BottomSheetHeaderSkeletonUiModel(), new BottomSheetShimmeringLoadingBarUiModel(), (BrazeExternalSyntheticLambda206) ((requestSingleLocationUpdatelambda1) getcolorintegerornulllambda0).write());
            case 5:
                return new GetBottomSheetConfigurationType((performOptionsMenuClosed) ((insertBasedOnParentOffset) getcolorintegerornulllambda0).write());
            case 6:
                Object objWrite = ((C0157deepcopy) getcolorintegerornulllambda0).write();
                objWrite.getClass();
                return new setPopDirection((Map) objWrite);
            case 7:
                return new setSharedElementNames((androidx.work.impl.WorkerWrapper.Builder) ((accessgetRelayoutTimep) getcolorintegerornulllambda0).write());
            case 8:
                return new SaveHeatmapUrlImpl(8, (SaveHeatmapUrlImpl) ((postAnimationRunner) getcolorintegerornulllambda0).write());
            case 9:
                return new FragmentState1((FragmentManagerLaunchedFragmentInfo) ((onCapabilitiesChanged) getcolorintegerornulllambda0).write());
            case 10:
                return new scrollByInternal((FetchAndSaveInAppMessageUseCase) ((getSharedElementTargetNames) getcolorintegerornulllambda0).write());
            case 11:
                RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter((InAppNotificationsRepository) ((r8lambdaZcilDVoiQYR1yQsOxhHduSfdjyw) getcolorintegerornulllambda0).write());
                int i4 = read + 43;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return recyclerViewAdapter;
            case 12:
                return new onDetachedFromRecyclerView((CombinedScopeView) ((q0) getcolorintegerornulllambda0).write());
            case 13:
                return new Room((I$b) ((transactionWithResultsuspendImpl) getcolorintegerornulllambda0).write());
            case 14:
                return new ChallengesRepository((unpackInt2) ((getSharedElementTargetNames) getcolorintegerornulllambda0).write());
            case 15:
                return new PrerenderException((lambdaaddGlobalCallbackParameter20) ((transactionWithResultsuspendImpl) getcolorintegerornulllambda0).write());
            case 16:
                setTransacterruntime settransacterruntime = new setTransacterruntime((RectManager) ((setStateDescription) getcolorintegerornulllambda0).write());
                int i6 = read + 47;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return settransacterruntime;
                }
                obj.hashCode();
                throw null;
            case 17:
                return new RouterLogger((SharedResourcePool) ((SimpleExecutableQuery) getcolorintegerornulllambda0).write());
            case 18:
                return new j6(new j4(), (buildGdprPackage) ((postAnimationRunner) getcolorintegerornulllambda0).write());
            case 19:
                return new GetLineLayer(new j4(), new AndroidUiDispatcherCompanioncurrentThread1(17), (j4) ((postAnimationRunner) getcolorintegerornulllambda0).write());
            case 20:
                return new SaveHeatmapUrlImpl(18, (h3) ((postAnimationRunner) getcolorintegerornulllambda0).write());
            case 21:
                setOnRemoteTriggerListener setonremotetriggerlistener = (setOnRemoteTriggerListener) ((transactionWithResultsuspendImpl) getcolorintegerornulllambda0).write();
                setonremotetriggerlistener.getClass();
                SharedResourcePool sharedResourcePool = new SharedResourcePool();
                sharedResourcePool.IconCompatParcelizer = setonremotetriggerlistener;
                return sharedResourcePool;
            case 22:
                return (qa) ((backgroundTimerFiredI) getcolorintegerornulllambda0).write();
            case 23:
                return new r6((Clock) ((setPresentationView) getcolorintegerornulllambda0).write());
            case 24:
                return new r7((DraggableNode) ((qdExternalSyntheticLambda3) getcolorintegerornulllambda0).write());
            case 25:
                return new r5();
            case 26:
                return new rc((rd) ((backgroundTimerFiredI) getcolorintegerornulllambda0).write());
            case 27:
                return new accessdoFetch((WindowManager) ((r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY) getcolorintegerornulllambda0).write());
            case 28:
                return new r8lambda93nPh_UiO6LLly5QJWhviIL_k((r8lambdaDq44v2nxKlyM2yb_Rh9Rq5jRnTY) ((r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY) getcolorintegerornulllambda0).write());
            default:
                return new GetAppStateImpl(7, (FormBody.Builder) ((q0) getcolorintegerornulllambda0).write());
        }
    }
}
