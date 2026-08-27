package com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.QrCodeScanTaskUiModelImpl$1;
import com.sentiance.core.model.events.H$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.PreviewLogger;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.fastFilterNotNull;
import o.getBottomRightnOccac;
import o.getPositionannotations;
import o.getQueryContext;
import o.isItemDismissable;
import o.millisToNanos;
import o.minHeightOffsets;
import o.onItemDismiss;
import o.translategyyYBs;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SignatureTaskUiModelImpl implements minHeightOffsets {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    public final millisToNanos IconCompatParcelizer;
    public final GetDeliveryAnalyticsUseCaseImpl MediaBrowserCompatMediaItem;
    public final long MediaDescriptionCompat;
    public final DeliveryConfirmationLoggerImpl MediaMetadataCompat;
    public final fastFilterNotNull MediaSessionCompatQueueItem;
    public final String MediaSessionCompatToken;
    public final H$b ParcelableVolumeInfo;
    public final UpdateTaskUseCaseImpl PlaybackStateCompat;
    public final StateFlow PlaybackStateCompatCustomAction;
    public final String RatingCompat;
    public getPositionannotations RemoteActionCompatParcelizer;
    public final getQueryContext read;
    public final ContextScope serializer;
    public final MutableStateFlow write;

    @Override // o.minHeightOffsets
    public final String IconCompatParcelizer() {
        String str;
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i3 = i2 + 69;
        MediaSessionCompatResultReceiverWrapper = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            str = this.MediaSessionCompatToken;
            int i4 = 0 / 0;
        } else {
            str = this.MediaSessionCompatToken;
        }
        int i5 = i2 + 45;
        MediaSessionCompatResultReceiverWrapper = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SignatureTaskUiModelImpl(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str, ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl, UpdateTaskUseCaseImpl updateTaskUseCaseImpl, millisToNanos millistonanos, H$b h$b, GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl, DeliveryConfirmationLoggerImpl deliveryConfirmationLoggerImpl, getQueryContext getquerycontext) {
        str.getClass();
        this.MediaSessionCompatQueueItem = fastfilternotnull;
        this.serializer = contextScope;
        this.MediaSessionCompatToken = str;
        this.PlaybackStateCompat = updateTaskUseCaseImpl;
        this.IconCompatParcelizer = millistonanos;
        this.ParcelableVolumeInfo = h$b;
        this.MediaBrowserCompatMediaItem = getDeliveryAnalyticsUseCaseImpl;
        this.MediaMetadataCompat = deliveryConfirmationLoggerImpl;
        this.read = getquerycontext;
        this.MediaDescriptionCompat = fastfilternotnull.deliveryId;
        this.RatingCompat = fastfilternotnull.action;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(getBottomRightnOccac.IconCompatParcelizer);
        this.write = mutableStateFlow;
        this.PlaybackStateCompatCustomAction = mutableStateFlow;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new QrCodeScanTaskUiModelImpl$1(observeTaskByTypeAndIdUseCaseImpl, this, shortNewsContentCardView, 24), 3);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new SwitcherUiModelImpl$1(this, shortNewsContentCardView, 28), 3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    public final Object loadAnalytics$6(ContinuationImpl continuationImpl) {
        translategyyYBs translategyyybs;
        Object objM4939invoke0E7RQCE;
        int i = 2 % 2;
        if (continuationImpl instanceof translategyyYBs) {
            translategyyybs = (translategyyYBs) continuationImpl;
            int i2 = translategyyybs.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = MediaSessionCompatResultReceiverWrapper + 11;
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    translategyyybs.IconCompatParcelizer = i2 >>> Integer.MIN_VALUE;
                } else {
                    translategyyybs.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
                }
            } else {
                translategyyybs = new translategyyYBs(this, continuationImpl);
            }
        } else {
            translategyyybs = new translategyyYBs(this, continuationImpl);
        }
        Object obj = translategyyybs.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = translategyyybs.IconCompatParcelizer;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            translategyyybs.IconCompatParcelizer = 1;
            objM4939invoke0E7RQCE = this.MediaBrowserCompatMediaItem.m4939invoke0E7RQCE(this.MediaDescriptionCompat, this.RatingCompat, translategyyybs);
            if (objM4939invoke0E7RQCE == coroutineSingletons) {
                int i5 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 45;
                MediaSessionCompatResultReceiverWrapper = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        } else {
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4939invoke0E7RQCE = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (!(objM4939invoke0E7RQCE instanceof isItemDismissable)) {
            int i6 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 43;
            MediaSessionCompatResultReceiverWrapper = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            getPositionannotations getpositionannotations = ((PreviewLogger) objM4939invoke0E7RQCE).serializer;
            this.RemoteActionCompatParcelizer = getpositionannotations;
            if (getpositionannotations == null) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("SignatureTaskUiModelImpl: Analytics bundle is null in tasks response!", new Object[0]);
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4939invoke0E7RQCE);
        if (thSerializer != null) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "SignatureTaskUiModelImpl: Analytics failed to load.", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        if (r3.invoke(r12, r6, r7, r8, r9) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$updateSignatureUri(com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl r10, java.lang.String r11, android.net.Uri r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl.MediaSessionCompatResultReceiverWrapper
            int r1 = r1 + 77
            int r2 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r2
            int r1 = r1 % r0
            r10.getClass()
            boolean r1 = r13 instanceof o.getCenterRightnOccac
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L16
            goto L25
        L16:
            r1 = r13
            o.getCenterRightnOccac r1 = (o.getCenterRightnOccac) r1
            int r3 = r1.IconCompatParcelizer
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L25
            int r3 = r3 + r4
            r1.IconCompatParcelizer = r3
            goto L2a
        L25:
            o.getCenterRightnOccac r1 = new o.getCenterRightnOccac
            r1.<init>(r10, r13)
        L2a:
            r9 = r1
            java.lang.Object r13 = r9.write
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r9.IconCompatParcelizer
            r4 = 0
            if (r3 == 0) goto L55
            if (r3 == r2) goto L4d
            int r11 = com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl.MediaSessionCompatResultReceiverWrapper
            int r11 = r11 + 95
            int r12 = r11 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r12
            int r11 = r11 % r0
            if (r3 != r0) goto L47
            java.lang.String r11 = r9.read
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r13)
            goto La3
        L47:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r10)
            return r4
        L4d:
            android.net.Uri r12 = r9.serializer
            java.lang.String r11 = r9.read
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r13)
            goto L69
        L55:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r13)
            o.getPositionannotations r13 = r10.RemoteActionCompatParcelizer
            if (r13 != 0) goto L69
            r9.read = r11
            r9.serializer = r12
            r9.IconCompatParcelizer = r2
            java.lang.Object r13 = r10.loadAnalytics$6(r9)
            if (r13 != r1) goto L69
            goto La2
        L69:
            kotlinx.coroutines.flow.StateFlow r13 = r10.PlaybackStateCompatCustomAction
            java.lang.Object r13 = r13.read()
            o.getCenternOccac r13 = (o.getCenternOccac) r13
            boolean r2 = r13 instanceof o.containsgyyYBs
            if (r2 == 0) goto Lab
            o.containsgyyYBs r13 = (o.containsgyyYBs) r13
            o.wrapper r13 = r13.RemoteActionCompatParcelizer
            java.lang.String r12 = r12.toString()
            r12.getClass()
            o.generateLoremIpsum r2 = new o.generateLoremIpsum
            r2.<init>(r12)
            o.wrapper r7 = o.wrapper.IconCompatParcelizer(r13, r2)
            com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl r3 = r10.PlaybackStateCompat
            long r12 = r10.MediaDescriptionCompat
            java.lang.String r6 = r10.RatingCompat
            java.lang.Class<o.wrapper> r2 = o.wrapper.class
            o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8 = o.displayInAppMessagelambda1.serializer(r2)
            r9.read = r11
            r9.serializer = r4
            r9.IconCompatParcelizer = r0
            r4 = r12
            java.lang.Object r12 = r3.invoke(r4, r6, r7, r8, r9)
            if (r12 != r1) goto La3
        La2:
            return r1
        La3:
            com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl r12 = r10.MediaMetadataCompat
            o.getPositionannotations r10 = r10.RemoteActionCompatParcelizer
            r12.read(r10, r11)
            goto Lc1
        Lab:
            timber.log.Timber$Forest r10 = timber.log.Timber.RemoteActionCompatParcelizer
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "SignatureTaskUiModelImpl: Cannot update signature, UI state is not SignatureTask: "
            r11.<init>(r12)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            r12 = 0
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r10.read(r11, r12)
        Lc1:
            o.createFromParcel r10 = o.createFromParcel.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl.access$updateSignatureUri(com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl, java.lang.String, android.net.Uri, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
