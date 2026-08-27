package com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.logger.MultipleCodeScanEventLoggerImpl;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AndroidUiMode;
import o.DensityDefaultImpls;
import o.getBitmapui_graphics;
import o.getKeyboardTap5zf0vsI;
import o.getQueryContext;
import o.isAdapterPositionOnScreen;
import o.sourceInformationContextOf;
import o.widthMask;

/* JADX INFO: loaded from: classes3.dex */
public final class CodeScanViewModel extends ViewModel {
    private static int ComponentActivity = 1;
    private static int MediaSessionCompatResultReceiverWrapper;
    public final MutableStateFlow IconCompatParcelizer;
    public final getQueryContext MediaBrowserCompatMediaItem;
    public final MultipleCodeScanEventLoggerImpl MediaDescriptionCompat;
    public final n0 MediaMetadataCompat;
    public final getBitmapui_graphics MediaSessionCompatQueueItem;
    public final StateFlow MediaSessionCompatToken;
    public final getKeyboardTap5zf0vsI ParcelableVolumeInfo;
    public final UpdateTaskUseCaseImpl PlaybackStateCompat;
    public final StateFlow PlaybackStateCompatCustomAction;
    public final ObserveTaskByTypeAndIdUseCaseImpl RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen read;
    public String serializer;
    public final MutableStateFlow write;

    public CodeScanViewModel(getBitmapui_graphics getbitmapui_graphics, getQueryContext getquerycontext, ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl, UpdateTaskUseCaseImpl updateTaskUseCaseImpl, n0 n0Var, getKeyboardTap5zf0vsI getkeyboardtap5zf0vsi, MultipleCodeScanEventLoggerImpl multipleCodeScanEventLoggerImpl) {
        getbitmapui_graphics.getClass();
        getquerycontext.getClass();
        observeTaskByTypeAndIdUseCaseImpl.getClass();
        updateTaskUseCaseImpl.getClass();
        n0Var.getClass();
        getkeyboardtap5zf0vsi.getClass();
        multipleCodeScanEventLoggerImpl.getClass();
        this.MediaSessionCompatQueueItem = getbitmapui_graphics;
        this.MediaBrowserCompatMediaItem = getquerycontext;
        this.RatingCompat = observeTaskByTypeAndIdUseCaseImpl;
        this.PlaybackStateCompat = updateTaskUseCaseImpl;
        this.MediaMetadataCompat = n0Var;
        this.ParcelableVolumeInfo = getkeyboardtap5zf0vsi;
        this.MediaDescriptionCompat = multipleCodeScanEventLoggerImpl;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(widthMask.IconCompatParcelizer);
        this.IconCompatParcelizer = mutableStateFlow;
        this.MediaSessionCompatToken = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(AndroidUiMode.INSTANCE);
        this.write = mutableStateFlow2;
        this.PlaybackStateCompatCustomAction = mutableStateFlow2;
        this.read = new isAdapterPositionOnScreen(new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(12, this));
    }

    public final sourceInformationContextOf RemoteActionCompatParcelizer() {
        DensityDefaultImpls densityDefaultImpls;
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 25;
        ComponentActivity = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj = this.IconCompatParcelizer.read();
        if (!(obj instanceof DensityDefaultImpls)) {
            int i4 = ComponentActivity + 45;
            MediaSessionCompatResultReceiverWrapper = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            densityDefaultImpls = null;
        } else {
            int i6 = ComponentActivity + 71;
            MediaSessionCompatResultReceiverWrapper = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            densityDefaultImpls = (DensityDefaultImpls) obj;
        }
        if (densityDefaultImpls != null) {
            return densityDefaultImpls.IconCompatParcelizer;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0132, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1500, r7) == r15) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$handleCodeSuccess(com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.CodeScanViewModel r18, java.lang.String r19, o.sourceInformationContextOf r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.CodeScanViewModel.access$handleCodeSuccess(com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.CodeScanViewModel, java.lang.String, o.sourceInformationContextOf, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
