package com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.navigation.PinScreenArgs;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.PreviewContainer;
import o.copyiSbpLlY;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.divGh9hcWk;
import o.getBitmapui_graphics;
import o.getCieXyz;
import o.getQueryContext;
import o.getZeroMYxV2XQ;
import o.isAdapterPositionOnScreen;
import o.minuse_xh8Ic;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.remBjo55l4;
import o.removeNodeAtDepth;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class PinScreenViewModel extends ViewModel {
    private static int MediaSessionCompatToken = 1;
    private static int PlaybackStateCompatCustomAction;
    public final remBjo55l4 IconCompatParcelizer;
    public final getQueryContext MediaBrowserCompatMediaItem;
    public final StateFlow MediaDescriptionCompat;
    public final StateFlow MediaMetadataCompat;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaSessionCompatQueueItem;
    public final IsFixableByRetry ParcelableVolumeInfo;
    public final UpdateTaskUseCaseImpl PlaybackStateCompat;
    public final getBitmapui_graphics RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen read;
    public final ObserveTaskByTypeAndIdUseCaseImpl serializer;
    public final MutableStateFlow write;

    public PinScreenViewModel(getBitmapui_graphics getbitmapui_graphics, getQueryContext getquerycontext, ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl, remBjo55l4 rembjo55l4, UpdateTaskUseCaseImpl updateTaskUseCaseImpl, IsFixableByRetry isFixableByRetry) {
        getbitmapui_graphics.getClass();
        getquerycontext.getClass();
        observeTaskByTypeAndIdUseCaseImpl.getClass();
        rembjo55l4.getClass();
        updateTaskUseCaseImpl.getClass();
        isFixableByRetry.getClass();
        this.RatingCompat = getbitmapui_graphics;
        this.MediaBrowserCompatMediaItem = getquerycontext;
        this.serializer = observeTaskByTypeAndIdUseCaseImpl;
        this.IconCompatParcelizer = rembjo55l4;
        this.PlaybackStateCompat = updateTaskUseCaseImpl;
        this.ParcelableVolumeInfo = isFixableByRetry;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(getZeroMYxV2XQ.write);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.MediaMetadataCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(minuse_xh8Ic.IconCompatParcelizer);
        this.write = mutableStateFlow2;
        this.MediaDescriptionCompat = mutableStateFlow2;
        this.read = new isAdapterPositionOnScreen(new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(14, this));
    }

    public static final Object access$withCurrentTask(PinScreenViewModel pinScreenViewModel, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, SuspendLambda suspendLambda) {
        copyiSbpLlY copyisbplly;
        Object objInvoke;
        int i = 2 % 2;
        StateFlow stateFlow = pinScreenViewModel.MediaMetadataCompat;
        PinScreenArgs pinScreenArgs = (PinScreenArgs) pinScreenViewModel.read.MediaSessionCompatResultReceiverWrapper();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (pinScreenArgs == null) {
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("No arguments passed to PinScreenFragment", Timber.RemoteActionCompatParcelizer);
            pinScreenViewModel.MediaBrowserCompatMediaItem.serializer(divGh9hcWk.IconCompatParcelizer);
            return createfromparcel;
        }
        Object obj = stateFlow.read();
        if (obj instanceof copyiSbpLlY) {
            copyisbplly = (copyiSbpLlY) obj;
            int i2 = PlaybackStateCompatCustomAction + 107;
            MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            copyisbplly = null;
        }
        if (copyisbplly != null) {
            PreviewContainer previewContainer = copyisbplly.RemoteActionCompatParcelizer;
            PreviewContainer previewContainer2 = (PreviewContainer) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(previewContainer);
            return ((((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{previewContainer2, previewContainer}, getCieXyz.write())).booleanValue() ^ true) && (objInvoke = pinScreenViewModel.PlaybackStateCompat.invoke(pinScreenArgs.read, pinScreenArgs.write, previewContainer2, displayInAppMessagelambda1.serializer(PreviewContainer.class), suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objInvoke : createfromparcel;
        }
        int i4 = MediaSessionCompatToken + 29;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            Timber.RemoteActionCompatParcelizer.read(m1$$ExternalSyntheticOutline0.m(stateFlow.read(), "PinScreenViewModel: withCurrentTask called but UI state is not QrCodeScanTask. Current state: "), new Object[1]);
            return createfromparcel;
        }
        Timber.RemoteActionCompatParcelizer.read(m1$$ExternalSyntheticOutline0.m(stateFlow.read(), "PinScreenViewModel: withCurrentTask called but UI state is not QrCodeScanTask. Current state: "), new Object[0]);
        return createfromparcel;
    }
}
