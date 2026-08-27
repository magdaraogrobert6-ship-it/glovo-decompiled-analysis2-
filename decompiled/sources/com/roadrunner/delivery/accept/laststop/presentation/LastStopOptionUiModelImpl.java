package com.roadrunner.delivery.accept.laststop.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator;
import com.roadrunner.delivery.accept.laststop.domain.RemoveLastStopAddressUseCaseImpl;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.delivery.errorhandler.DeliveryErrorProviderImpl;
import com.roadrunner.home.nest.divider.ObserveDivider;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.FontVariationSettingTextUnit;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.ddefault;
import o.drawPaint;
import o.drawPoint;
import o.drawRGB;
import o.drawText;
import o.fillLineHorizontalBoundsui_text;
import o.getClipBounds;
import o.getDrawFilter;
import o.getPrimaryHorizontal;
import o.getQueryContext;
import o.getRangeForRect;
import o.getSaveCount;
import o.getSelectionPath;
import o.get_nativeCanvasui_text;
import o.isItemDismissable;
import o.onItemDismiss;
import o.restoreToCount;
import o.setBitmap;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final class LastStopOptionUiModelImpl {
    private static int ComponentActivity = 1;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final DeliveryAcceptanceLogger IconCompatParcelizer;
    public final FontVariationSettingTextUnit MediaBrowserCompatMediaItem;
    public final StateFlow MediaDescriptionCompat;
    public final fillLineHorizontalBoundsui_text MediaMetadataCompat;
    public final LastStopSelectionCoordinator MediaSessionCompatQueueItem;
    public final setTransactionSuccessful MediaSessionCompatResultReceiverWrapper;
    public final getQueryContext MediaSessionCompatToken;
    public final getPrimaryHorizontal ParcelableVolumeInfo;
    public final StateFlow PlaybackStateCompat;
    public final RemoveLastStopAddressUseCaseImpl PlaybackStateCompatCustomAction;
    public final getRangeForRect RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final ObserveDivider r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final DeliveryErrorProviderImpl read;
    public final MutableStateFlow serializer;
    public final ContextScope write;

    public LastStopOptionUiModelImpl(getPrimaryHorizontal getprimaryhorizontal, RemoveLastStopAddressUseCaseImpl removeLastStopAddressUseCaseImpl, getQueryContext getquerycontext, ObserveDivider observeDivider, FontVariationSettingTextUnit fontVariationSettingTextUnit, setTransactionSuccessful settransactionsuccessful, getRangeForRect getrangeforrect, fillLineHorizontalBoundsui_text filllinehorizontalboundsui_text, LastStopSelectionCoordinator lastStopSelectionCoordinator, DeliveryAcceptanceLogger deliveryAcceptanceLogger, DeliveryErrorProviderImpl deliveryErrorProviderImpl, ContextScope contextScope) {
        this.ParcelableVolumeInfo = getprimaryhorizontal;
        this.PlaybackStateCompatCustomAction = removeLastStopAddressUseCaseImpl;
        this.MediaSessionCompatToken = getquerycontext;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = observeDivider;
        this.MediaBrowserCompatMediaItem = fontVariationSettingTextUnit;
        this.MediaSessionCompatResultReceiverWrapper = settransactionsuccessful;
        this.RatingCompat = getrangeforrect;
        this.MediaMetadataCompat = filllinehorizontalboundsui_text;
        this.MediaSessionCompatQueueItem = lastStopSelectionCoordinator;
        this.IconCompatParcelizer = deliveryAcceptanceLogger;
        this.read = deliveryErrorProviderImpl;
        this.write = contextScope;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(get_nativeCanvasui_text.serializer);
        this.serializer = mutableStateFlow;
        this.PlaybackStateCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = mutableStateFlow2;
        this.MediaDescriptionCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new ClearDataUseCaseImpl$invoke$2(this, (ShortNewsContentCardView) null, 23), 3);
    }

    public final void serializer(String str) {
        int i = 2 % 2;
        this.MediaSessionCompatToken.serializer(new setBitmap(str, ddefault.IconCompatParcelizer));
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 103;
        ComponentActivity = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 80 / 0;
        }
    }

    public final void IconCompatParcelizer() {
        Object drawpaint;
        int i = 2 % 2;
        getClipBounds getclipbounds = (getClipBounds) this.PlaybackStateCompat.read();
        if (getclipbounds instanceof drawText) {
            getDrawFilter getdrawfilter = ((drawText) getclipbounds).write;
            MutableStateFlow mutableStateFlow = this.MediaSessionCompatQueueItem.serializer;
            if (getdrawfilter != null) {
                drawpaint = new drawPaint(getdrawfilter);
                int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 125;
                ComponentActivity = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
            } else {
                drawpaint = drawPoint.read;
            }
            mutableStateFlow.IconCompatParcelizer(drawpaint);
        }
        this.RatingCompat.serializer.IconCompatParcelizer(drawRGB.ACTIVE);
        this.MediaSessionCompatToken.serializer(restoreToCount.RemoteActionCompatParcelizer);
        int i4 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 107;
        ComponentActivity = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    public static final Object access$updateNestState(LastStopOptionUiModelImpl lastStopOptionUiModelImpl, getSaveCount getsavecount, ContinuationImpl continuationImpl) {
        getSelectionPath getselectionpath;
        String str;
        Object objM4968invokeIoAF18A;
        int i = 2 % 2;
        int i2 = ComponentActivity + 123;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        lastStopOptionUiModelImpl.getClass();
        if (continuationImpl instanceof getSelectionPath) {
            int i4 = ComponentActivity + 53;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            getselectionpath = (getSelectionPath) continuationImpl;
            int i6 = getselectionpath.IconCompatParcelizer;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                getselectionpath.IconCompatParcelizer = i6 - Integer.MIN_VALUE;
            } else {
                getselectionpath = new getSelectionPath(lastStopOptionUiModelImpl, continuationImpl);
            }
        } else {
            getselectionpath = new getSelectionPath(lastStopOptionUiModelImpl, continuationImpl);
        }
        Object obj = getselectionpath.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = getselectionpath.IconCompatParcelizer;
        if (i7 != 0) {
            int i8 = ComponentActivity + 21;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0 ? i7 != 1 : i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = getselectionpath.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4968invokeIoAF18A = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            str = getsavecount.serializer.messageRemoved;
            ObserveDivider observeDivider = lastStopOptionUiModelImpl.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            getselectionpath.write = str;
            getselectionpath.IconCompatParcelizer = 1;
            objM4968invokeIoAF18A = observeDivider.m4968invokeIoAF18A(getselectionpath);
            if (objM4968invokeIoAF18A == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (!(objM4968invokeIoAF18A instanceof isItemDismissable)) {
            lastStopOptionUiModelImpl.MediaSessionCompatToken.serializer(new setBitmap(str, ddefault.RemoteActionCompatParcelizer));
        }
        if (onItemDismiss.serializer(objM4968invokeIoAF18A) != null) {
            int i9 = ComponentActivity + 41;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            lastStopOptionUiModelImpl.serializer(lastStopOptionUiModelImpl.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer(R.string.all_error_message));
        }
        return createFromParcel.INSTANCE;
    }
}
