package coil3.compose;

import android.app.Activity;
import android.os.Bundle;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.material3.FloatingActionButtonElevationAnimatable;
import androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2;
import androidx.compose.ui.graphics.Fields;
import androidx.emoji2.text.EmojiProcessor;
import androidx.room.TriggerBasedInvalidationTracker;
import androidx.work.impl.WorkerWrapper;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ActivityMetricsLifecycleCallback;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.PerseusEvent;
import com.deliveryhero.perseus.logger.PerseusLogger;
import com.mapbox.maps.MapView;
import com.roadrunner.appreview.AppReviewLifecycleObserverImpl;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$4;
import com.roadrunner.location.core.domain.GetLocationUpdatesUseCaseImpl;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.map.container.enabled.presentation.MapNavigationWrapper;
import com.roadrunner.map.container.enabled.presentation.MapboxFragment;
import com.roadrunner.rider.state.provider.domain.SaveShiftInfo$invoke$2;
import io.sentry.util.UrlUtils;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.DispatcherScheduler;
import o.AndroidIndirectPointerEvent;
import o.ClipOpCompanion;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.PathDirection;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.accessisRenderNodeCompatiblecp;
import o.accesssetSpotShadowColor8_81llAjd;
import o.addInterval;
import o.addRearDisplayPresentationStatusListener;
import o.createFromParcel;
import o.executeAsOneOrNull;
import o.f2ExternalSyntheticLambda4;
import o.findFirstOverlap;
import o.findNestedRecyclerView;
import o.getClipgIe3tQ8annotations;
import o.getContentViewGroupParentLayout;
import o.getDecoratedBoundsWithMarginsInt;
import o.getNone4e0Vf04;
import o.getPreviousUptimeMillis;
import o.getTouchaOaMEAU;
import o.hasSameCornerRadius;
import o.igExternalSyntheticLambda1;
import o.igExternalSyntheticLambda2;
import o.isComputingLayout;
import o.isOpenInternalroom_runtime;
import o.je;
import o.jumpToPositionForSmoothScroller;
import o.notifyContentCaptureChanges;
import o.notifyViewEntered;
import o.onDrawWithContent;
import o.r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setFrom58bKbWc;
import o.toColorLong8_81llA;
import o.toolingGraphicsLayer;
import o.transactionWithResult;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final class AsyncImagePainter$launchJob$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public Object read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AsyncImagePainter$launchJob$1(Object obj, Object obj2, Object obj3, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.read = obj;
        this.IconCompatParcelizer = obj2;
        this.write = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:387:0x085b  */
    /* JADX WARN: Code duplicated, block: B:388:0x085c A[Catch: all -> 0x0878, TRY_LEAVE, TryCatch #8 {all -> 0x0878, blocks: (B:385:0x0858, B:388:0x085c), top: B:525:0x0858 }] */
    /* JADX WARN: Code duplicated, block: B:391:0x0872  */
    /* JADX WARN: Code duplicated, block: B:483:0x0a1f  */
    /* JADX WARN: Code duplicated, block: B:484:0x0a34  */
    /* JADX WARN: Code duplicated, block: B:486:0x0a38  */
    /* JADX WARN: Code duplicated, block: B:488:0x0a40  */
    /* JADX WARN: Code duplicated, block: B:491:0x0a58  */
    /* JADX WARN: Code duplicated, block: B:501:0x0a86 A[Catch: all -> 0x0ab7, PHI: r2 r3
  0x0a86: PHI (r2v132 kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator) = 
  (r2v130 kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator)
  (r2v131 kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator)
  (r2v136 kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator)
 binds: [B:500:0x0a7e, B:507:0x0aad, B:493:0x0a5c] A[DONT_GENERATE, DONT_INLINE]
  0x0a86: PHI (r3v129 ??) = (r3v137 ??), (r3v138 ??), (r3v139 ??) binds: [B:500:0x0a7e, B:507:0x0aad, B:493:0x0a5c] A[DONT_GENERATE, DONT_INLINE], TryCatch #7 {all -> 0x0ab7, blocks: (B:493:0x0a5c, B:501:0x0a86, B:504:0x0a94, B:506:0x0a9c, B:497:0x0a6e, B:500:0x0a7e), top: B:523:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:503:0x0a93  */
    /* JADX WARN: Code duplicated, block: B:504:0x0a94 A[Catch: all -> 0x0ab7, PHI: r2 r3 r5
  0x0a94: PHI (r2v131 kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator) = 
  (r2v132 kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator)
  (r2v134 kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator)
 binds: [B:502:0x0a91, B:498:0x0a71] A[DONT_GENERATE, DONT_INLINE]
  0x0a94: PHI (r3v128 ??) = (r3v140 ??), (r3v141 ??) binds: [B:502:0x0a91, B:498:0x0a71] A[DONT_GENERATE, DONT_INLINE]
  0x0a94: PHI (r5v76 java.lang.Object) = (r5v82 java.lang.Object), (r5v83 java.lang.Object) binds: [B:502:0x0a91, B:498:0x0a71] A[DONT_GENERATE, DONT_INLINE], TryCatch #7 {all -> 0x0ab7, blocks: (B:493:0x0a5c, B:501:0x0a86, B:504:0x0a94, B:506:0x0a9c, B:497:0x0a6e, B:500:0x0a7e), top: B:523:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:506:0x0a9c A[Catch: all -> 0x0ab7, TRY_LEAVE, TryCatch #7 {all -> 0x0ab7, blocks: (B:493:0x0a5c, B:501:0x0a86, B:504:0x0a94, B:506:0x0a9c, B:497:0x0a6e, B:500:0x0a7e), top: B:523:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:525:0x0858 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r2v101, types: [com.roadrunner.common.data.api.ExecuteApiRequest] */
    /* JADX WARN: Type inference failed for: r2v102, types: [com.roadrunner.common.data.api.ExecuteApiRequest] */
    /* JADX WARN: Type inference failed for: r2v104, types: [o.isItemDismissable] */
    /* JADX WARN: Type inference failed for: r2v105, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v107 */
    /* JADX WARN: Type inference failed for: r2v108 */
    /* JADX WARN: Type inference failed for: r2v137 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v126, types: [o.onBackCancelledlambda3] */
    /* JADX WARN: Type inference failed for: r3v128, types: [java.lang.Object, o.onBackCancelledlambda3] */
    /* JADX WARN: Type inference failed for: r3v129, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v137 */
    /* JADX WARN: Type inference failed for: r3v138 */
    /* JADX WARN: Type inference failed for: r3v139 */
    /* JADX WARN: Type inference failed for: r3v140 */
    /* JADX WARN: Type inference failed for: r3v141 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:507:0x0aad -> B:501:0x0a86). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.AsyncImagePainter$launchJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AsyncImagePainter$launchJob$1(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.IconCompatParcelizer = obj;
        this.write = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AsyncImagePainter$launchJob$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.write = obj;
    }

    private final Object invokeSuspend$com$roadrunner$overlay$bubble$permission$OverlayPermissionLifecycleObserverImpl$onCreate$1(Object obj) {
        int i = 2 % 2;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 != 0) {
            int i3 = MediaDescriptionCompat;
            int i4 = i3 + 25;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = i3 + 113;
            MediaMetadataCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) this.IconCompatParcelizer;
            toColorLong8_81llA tocolorlong8_81lla = toColorLong8_81llA.RESUMED;
            SaveShiftInfo$invoke$2 saveShiftInfo$invoke$2 = new SaveShiftInfo$invoke$2((AppReviewLifecycleObserverImpl) this.write, getcontentviewgroupparentlayout, shortNewsContentCardView, 6);
            this.read = null;
            this.RemoteActionCompatParcelizer = 1;
            if (UrlUtils.repeatOnLifecycle(accessisrendernodecompatiblecp, tocolorlong8_81lla, saveShiftInfo$invoke$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r0, r11) == r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r0, r11) == r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object invokeSuspend$com$roadrunner$rrds$compose$component$tooltip$TooltipKt$Tooltip$3$1(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = coil3.compose.AsyncImagePainter$launchJob$1.MediaDescriptionCompat
            int r1 = r1 + 7
            int r2 = r1 % 128
            coil3.compose.AsyncImagePainter$launchJob$1.MediaMetadataCompat = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L8b
            java.lang.Object r1 = r11.read
            java.lang.Long r1 = (java.lang.Long) r1
            java.lang.Object r3 = r11.write
            o.PopulateViewStructure_androidKtpopulate7 r3 = (o.PopulateViewStructure_androidKtpopulate7) r3
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r11.RemoteActionCompatParcelizer
            r6 = 1
            if (r5 == 0) goto L33
            int r1 = coil3.compose.AsyncImagePainter$launchJob$1.MediaDescriptionCompat
            int r1 = r1 + 41
            int r4 = r1 % 128
            coil3.compose.AsyncImagePainter$launchJob$1.MediaMetadataCompat = r4
            int r1 = r1 % r0
            if (r5 != r6) goto L2d
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            goto L7c
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r12)
            return r2
        L33:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            java.lang.Object r12 = r3.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L88
            if (r1 == 0) goto L88
            int r12 = coil3.compose.AsyncImagePainter$launchJob$1.MediaMetadataCompat
            int r12 = r12 + 29
            int r2 = r12 % 128
            coil3.compose.AsyncImagePainter$launchJob$1.MediaDescriptionCompat = r2
            int r12 = r12 % r0
            long r7 = r1.longValue()
            r9 = 0
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 <= 0) goto L88
            int r12 = coil3.compose.AsyncImagePainter$launchJob$1.MediaMetadataCompat
            int r12 = r12 + 77
            int r2 = r12 % 128
            coil3.compose.AsyncImagePainter$launchJob$1.MediaDescriptionCompat = r2
            int r12 = r12 % r0
            if (r12 == 0) goto L6f
            long r0 = r1.longValue()
            r11.RemoteActionCompatParcelizer = r6
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.delay(r0, r11)
            if (r12 != r4) goto L7c
            goto L7b
        L6f:
            long r0 = r1.longValue()
            r11.RemoteActionCompatParcelizer = r6
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.delay(r0, r11)
            if (r12 != r4) goto L7c
        L7b:
            return r4
        L7c:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r3.setValue(r12)
            java.lang.Object r12 = r11.IconCompatParcelizer
            o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r12 = (o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) r12
            r12.invoke()
        L88:
            o.createFromParcel r12 = o.createFromParcel.INSTANCE
            return r12
        L8b:
            java.lang.Object r12 = r11.read
            java.lang.Long r12 = (java.lang.Long) r12
            java.lang.Object r12 = r11.write
            o.PopulateViewStructure_androidKtpopulate7 r12 = (o.PopulateViewStructure_androidKtpopulate7) r12
            kotlin.coroutines.intrinsics.CoroutineSingletons r12 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.AsyncImagePainter$launchJob$1.invokeSuspend$com$roadrunner$rrds$compose$component$tooltip$TooltipKt$Tooltip$3$1(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0090, code lost:
    
        if (com.roadrunner.map.container.enabled.presentation.MapNavigationWrapper.access$initAndAttachNavigation(r1, r10, r3, r9) == r2) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object invokeSuspend$com$roadrunner$map$container$enabled$presentation$MapNavigationWrapper$attachWithDeferredInit$1(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = coil3.compose.AsyncImagePainter$launchJob$1.MediaDescriptionCompat
            int r1 = r1 + 31
            int r2 = r1 % 128
            coil3.compose.AsyncImagePainter$launchJob$1.MediaMetadataCompat = r2
            int r1 = r1 % r0
            java.lang.Object r1 = r9.read
            com.roadrunner.map.container.enabled.presentation.MapNavigationWrapper r1 = (com.roadrunner.map.container.enabled.presentation.MapNavigationWrapper) r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r9.RemoteActionCompatParcelizer
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L4c
            int r6 = coil3.compose.AsyncImagePainter$launchJob$1.MediaMetadataCompat
            int r7 = r6 + 31
            int r8 = r7 % 128
            coil3.compose.AsyncImagePainter$launchJob$1.MediaDescriptionCompat = r8
            int r7 = r7 % r0
            if (r3 == r4) goto L3f
            if (r3 != r0) goto L38
            int r6 = r6 + 59
            int r2 = r6 % 128
            coil3.compose.AsyncImagePainter$launchJob$1.MediaDescriptionCompat = r2
            int r6 = r6 % r0
            if (r6 == 0) goto L34
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            r10 = 4
            int r10 = r10 / r5
            goto L93
        L34:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L93
        L38:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r10)
            r10 = 0
            return r10
        L3f:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            int r10 = coil3.compose.AsyncImagePainter$launchJob$1.MediaMetadataCompat
            int r10 = r10 + 53
            int r3 = r10 % 128
            coil3.compose.AsyncImagePainter$launchJob$1.MediaDescriptionCompat = r3
            int r10 = r10 % r0
            goto L74
        L4c:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            timber.log.Timber$Forest r10 = timber.log.Timber.RemoteActionCompatParcelizer
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.String r6 = "MapNavigationWrapper: deferred init — waiting for Navigate click or RoutePreview"
            r10.IconCompatParcelizer(r6, r3)
            o.getHeadingrAG3T2k r10 = r1.IconCompatParcelizer
            kotlinx.coroutines.flow.MutableStateFlow r10 = r10.read
            com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$4 r3 = new com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$4
            r6 = 5
            r3.<init>(r10, r6)
            r9.RemoteActionCompatParcelizer = r4
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt.first(r3, r9)
            if (r10 != r2) goto L74
            int r10 = coil3.compose.AsyncImagePainter$launchJob$1.MediaMetadataCompat
            int r10 = r10 + 79
            int r1 = r10 % 128
            coil3.compose.AsyncImagePainter$launchJob$1.MediaDescriptionCompat = r1
            int r10 = r10 % r0
            goto L92
        L74:
            timber.log.Timber$Forest r10 = timber.log.Timber.RemoteActionCompatParcelizer
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.String r5 = "MapNavigationWrapper: trigger received — starting deferred Nav SDK init"
            r10.IconCompatParcelizer(r5, r3)
            io.sentry.metrics.MetricsBatchProcessor r10 = r1.read
            r10.read()
            java.lang.Object r10 = r9.IconCompatParcelizer
            o.accessisRenderNodeCompatiblecp r10 = (o.accessisRenderNodeCompatiblecp) r10
            java.lang.Object r3 = r9.write
            com.mapbox.maps.MapView r3 = (com.mapbox.maps.MapView) r3
            r9.RemoteActionCompatParcelizer = r0
            java.lang.Object r10 = com.roadrunner.map.container.enabled.presentation.MapNavigationWrapper.access$initAndAttachNavigation(r1, r10, r3, r9)
            if (r10 != r2) goto L93
        L92:
            return r2
        L93:
            r1.RatingCompat = r4
            o.createFromParcel r10 = o.createFromParcel.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.AsyncImagePainter$launchJob$1.invokeSuspend$com$roadrunner$map$container$enabled$presentation$MapNavigationWrapper$attachWithDeferredInit$1(java.lang.Object):java.lang.Object");
    }

    private final Object invokeSuspend$com$roadrunner$map$container$enabled$presentation$MapboxFragment$onViewCreated$1(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 1;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            obj2.hashCode();
            throw null;
        }
        MapboxFragment mapboxFragment = (MapboxFragment) this.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.RemoteActionCompatParcelizer;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("MapboxFragment waiting for Mapbox initialization (strategy: " + ((igExternalSyntheticLambda1) this.read) + ")", new Object[0]);
            igExternalSyntheticLambda2 igexternalsyntheticlambda2 = mapboxFragment.PlaybackStateCompatCustomAction;
            if (igexternalsyntheticlambda2 == null) {
                removeNodeAtDepth.serializer("mapboxInitializationStateProvider");
                throw null;
            }
            StateProviderImpl$special$$inlined$map$4 stateProviderImpl$special$$inlined$map$4 = new StateProviderImpl$special$$inlined$map$4(igexternalsyntheticlambda2.write, 6);
            this.RemoteActionCompatParcelizer = 1;
            if (FlowKt.first(stateProviderImpl$special$$inlined$map$4, this) == coroutineSingletons2) {
                return coroutineSingletons2;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("MapboxFragment Mapbox initialization complete", new Object[0]);
        mapboxFragment.onMapReady((Bundle) this.write);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = MediaMetadataCompat + 83;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return createfromparcel;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 123;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i4) {
            case 0:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 1:
                return ((AsyncImagePainter$launchJob$1) create((notifyContentCaptureChanges) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 2:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 3:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 4:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 5:
                return ((AsyncImagePainter$launchJob$1) create((ClipOpCompanion) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 6:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 7:
                Object objInvokeSuspend = ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i5 = MediaDescriptionCompat + 69;
                MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            case 8:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 9:
                return ((AsyncImagePainter$launchJob$1) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 10:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 11:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 12:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 13:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 14:
                return ((AsyncImagePainter$launchJob$1) create((AndroidIndirectPointerEvent) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 15:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 16:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 17:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 18:
                return ((AsyncImagePainter$launchJob$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 19:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 20:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 21:
                return ((AsyncImagePainter$launchJob$1) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 22:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 23:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 24:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 25:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 26:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 27:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 28:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            default:
                return ((AsyncImagePainter$launchJob$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.serializer;
        Object obj2 = this.write;
        Object obj3 = null;
        switch (i3) {
            case 0:
                return new AsyncImagePainter$launchJob$1((AsyncImagePainter) this.IconCompatParcelizer, (PathDirection) obj2, shortNewsContentCardView, 0);
            case 1:
                AsyncImagePainter$launchJob$1 asyncImagePainter$launchJob$1 = new AsyncImagePainter$launchJob$1((Transition) this.IconCompatParcelizer, (PopulateViewStructure_androidKtpopulate7) obj2, shortNewsContentCardView, 1);
                asyncImagePainter$launchJob$1.read = obj;
                return asyncImagePainter$launchJob$1;
            case 2:
                AsyncImagePainter$launchJob$1 asyncImagePainter$launchJob$2 = new AsyncImagePainter$launchJob$1((MutableInteractionSourceImpl) this.IconCompatParcelizer, (FloatingActionButtonElevationAnimatable) obj2, shortNewsContentCardView, i);
                asyncImagePainter$launchJob$2.read = obj;
                return asyncImagePainter$launchJob$2;
            case 3:
                AsyncImagePainter$launchJob$1 asyncImagePainter$launchJob$3 = new AsyncImagePainter$launchJob$1((Recomposer$runRecomposeAndApplyChanges$2) this.IconCompatParcelizer, (notifyViewEntered) obj2, shortNewsContentCardView, 3);
                asyncImagePainter$launchJob$3.read = obj;
                return asyncImagePainter$launchJob$3;
            case 4:
                return new AsyncImagePainter$launchJob$1((TextAnnouncementContentCardView) this.read, (Flow) this.IconCompatParcelizer, (notifyContentCaptureChanges) obj2, shortNewsContentCardView, 4);
            case 5:
                AsyncImagePainter$launchJob$1 asyncImagePainter$launchJob$4 = new AsyncImagePainter$launchJob$1((TriggerBasedInvalidationTracker) obj2, shortNewsContentCardView, 5);
                asyncImagePainter$launchJob$4.IconCompatParcelizer = obj;
                int i4 = MediaDescriptionCompat + 45;
                MediaMetadataCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return asyncImagePainter$launchJob$4;
                }
                obj3.hashCode();
                throw null;
            case 6:
                AsyncImagePainter$launchJob$1 asyncImagePainter$launchJob$5 = new AsyncImagePainter$launchJob$1((CompletableDeferredImpl) this.IconCompatParcelizer, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2, shortNewsContentCardView, 6);
                asyncImagePainter$launchJob$5.read = obj;
                return asyncImagePainter$launchJob$5;
            case 7:
                AsyncImagePainter$launchJob$1 asyncImagePainter$launchJob$6 = new AsyncImagePainter$launchJob$1((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.IconCompatParcelizer, (onDrawWithContent) obj2, shortNewsContentCardView, 7);
                asyncImagePainter$launchJob$6.read = obj;
                return asyncImagePainter$launchJob$6;
            case 8:
                return new AsyncImagePainter$launchJob$1((WorkerWrapper) this.read, (accesssetSpotShadowColor8_81llAjd) this.IconCompatParcelizer, (hasSameCornerRadius) obj2, shortNewsContentCardView, 8);
            case 9:
                AsyncImagePainter$launchJob$1 asyncImagePainter$launchJob$7 = new AsyncImagePainter$launchJob$1((toolingGraphicsLayer) this.IconCompatParcelizer, (addInterval) obj2, shortNewsContentCardView, 9);
                asyncImagePainter$launchJob$7.read = obj;
                return asyncImagePainter$launchJob$7;
            case 10:
                return new AsyncImagePainter$launchJob$1((r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8) this.read, (setFrom58bKbWc) this.IconCompatParcelizer, (findFirstOverlap) obj2, shortNewsContentCardView, 10);
            case 11:
                return new AsyncImagePainter$launchJob$1((ActivityMetricsLifecycleCallback) this.read, (String) this.IconCompatParcelizer, (Activity) obj2, shortNewsContentCardView, 11);
            case 12:
                AsyncImagePainter$launchJob$1 asyncImagePainter$launchJob$8 = new AsyncImagePainter$launchJob$1((LinkedHashMap) this.read, (PerseusEvent) this.IconCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, shortNewsContentCardView, 12);
                int i5 = MediaDescriptionCompat + 79;
                MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return asyncImagePainter$launchJob$8;
                }
                throw null;
            case 13:
                return new AsyncImagePainter$launchJob$1((PerseusLogger) this.read, (String) this.IconCompatParcelizer, (Throwable) obj2, shortNewsContentCardView, 13);
            case 14:
                AsyncImagePainter$launchJob$1 asyncImagePainter$launchJob$9 = new AsyncImagePainter$launchJob$1((isOpenInternalroom_runtime) this.IconCompatParcelizer, (getTouchaOaMEAU) obj2, shortNewsContentCardView, 14);
                asyncImagePainter$launchJob$9.read = obj;
                return asyncImagePainter$launchJob$9;
            case 15:
                return new AsyncImagePainter$launchJob$1((getPreviousUptimeMillis) this.read, (String) this.IconCompatParcelizer, (String) obj2, shortNewsContentCardView, 15);
            case 16:
                return new AsyncImagePainter$launchJob$1((EmojiProcessor) obj2, shortNewsContentCardView, 16);
            case 17:
                return new AsyncImagePainter$launchJob$1((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.read, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.IconCompatParcelizer, (ExecuteApiRequest) obj2, shortNewsContentCardView, 17);
            case 18:
                AsyncImagePainter$launchJob$1 asyncImagePainter$launchJob$10 = new AsyncImagePainter$launchJob$1((getClipgIe3tQ8annotations) this.IconCompatParcelizer, (getNone4e0Vf04) obj2, shortNewsContentCardView, 18);
                asyncImagePainter$launchJob$10.read = obj;
                return asyncImagePainter$launchJob$10;
            case 19:
                return new AsyncImagePainter$launchJob$1((findNestedRecyclerView) this.read, (getDecoratedBoundsWithMarginsInt) this.IconCompatParcelizer, (List) obj2, shortNewsContentCardView, 19);
            case 20:
                return new AsyncImagePainter$launchJob$1((jumpToPositionForSmoothScroller) this.read, (isComputingLayout) this.IconCompatParcelizer, (List) obj2, shortNewsContentCardView, 20);
            case 21:
                AsyncImagePainter$launchJob$1 asyncImagePainter$launchJob$11 = new AsyncImagePainter$launchJob$1((GetLocationUpdatesUseCaseImpl) this.IconCompatParcelizer, (addRearDisplayPresentationStatusListener) obj2, shortNewsContentCardView, 21);
                asyncImagePainter$launchJob$11.read = obj;
                return asyncImagePainter$launchJob$11;
            case 22:
                AsyncImagePainter$launchJob$1 asyncImagePainter$launchJob$12 = new AsyncImagePainter$launchJob$1((AppEventInfoChangeHandler) this.IconCompatParcelizer, (executeAsOneOrNull) obj2, shortNewsContentCardView, 22);
                asyncImagePainter$launchJob$12.read = obj;
                return asyncImagePainter$launchJob$12;
            case 23:
                return new AsyncImagePainter$launchJob$1((transactionWithResult) this.read, (String) this.IconCompatParcelizer, (LinkedHashMap) obj2, shortNewsContentCardView, 23);
            case 24:
                return new AsyncImagePainter$launchJob$1((MapNavigationWrapper) this.read, (accessisRenderNodeCompatiblecp) this.IconCompatParcelizer, (MapView) obj2, shortNewsContentCardView, 24);
            case 25:
                return new AsyncImagePainter$launchJob$1((igExternalSyntheticLambda1) this.read, (MapboxFragment) this.IconCompatParcelizer, (Bundle) obj2, shortNewsContentCardView, 25);
            case 26:
                AsyncImagePainter$launchJob$1 asyncImagePainter$launchJob$13 = new AsyncImagePainter$launchJob$1((f2ExternalSyntheticLambda4) this.IconCompatParcelizer, (je) obj2, shortNewsContentCardView, 26);
                asyncImagePainter$launchJob$13.read = obj;
                return asyncImagePainter$launchJob$13;
            case 27:
                AsyncImagePainter$launchJob$1 asyncImagePainter$launchJob$14 = new AsyncImagePainter$launchJob$1((accessisRenderNodeCompatiblecp) this.IconCompatParcelizer, (AppReviewLifecycleObserverImpl) obj2, shortNewsContentCardView, 27);
                asyncImagePainter$launchJob$14.read = obj;
                return asyncImagePainter$launchJob$14;
            case 28:
                return new AsyncImagePainter$launchJob$1((Long) this.read, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.IconCompatParcelizer, (PopulateViewStructure_androidKtpopulate7) obj2, shortNewsContentCardView, 28);
            default:
                return new AsyncImagePainter$launchJob$1((DispatcherScheduler.DispatcherWorker) obj2, shortNewsContentCardView, 29);
        }
    }
}
