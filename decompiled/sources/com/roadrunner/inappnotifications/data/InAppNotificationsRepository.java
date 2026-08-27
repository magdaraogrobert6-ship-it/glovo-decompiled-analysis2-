package com.roadrunner.inappnotifications.data;

import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.WorkManagerImpl;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.SerializationException;
import o.createFromParcel;
import o.invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2;
import o.isOpenInternalroom_runtime;
import o.isVerticalSwipeInAllowedDirection;
import o.resetTransientState;
import o.scrollStep;
import o.setGraphicModalMaxWidthDp;
import o.setHasFixedSize;
import o.setItemAnimator;
import o.smoothScrollToPosition;
import o.startNestedScroll;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppNotificationsRepository {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final setItemAnimator IconCompatParcelizer;
    public final startNestedScroll RemoteActionCompatParcelizer;
    public final ExecuteApiRequest read;
    public final WorkManagerImpl serializer;
    public final isOpenInternalroom_runtime write;

    public InAppNotificationsRepository(setItemAnimator setitemanimator, startNestedScroll startnestedscroll, ExecuteApiRequest executeApiRequest, WorkManagerImpl workManagerImpl, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        setitemanimator.getClass();
        startnestedscroll.getClass();
        executeApiRequest.getClass();
        workManagerImpl.getClass();
        isopeninternalroom_runtime.getClass();
        this.IconCompatParcelizer = setitemanimator;
        this.RemoteActionCompatParcelizer = startnestedscroll;
        this.read = executeApiRequest;
        this.serializer = workManagerImpl;
        this.write = isopeninternalroom_runtime;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    public static final Object access$decodeFromJson(InAppNotificationsRepository inAppNotificationsRepository, String str, ContinuationImpl continuationImpl) throws Throwable {
        setHasFixedSize sethasfixedsize;
        int i = 2 % 2;
        inAppNotificationsRepository.getClass();
        if (continuationImpl instanceof setHasFixedSize) {
            int i2 = RatingCompat + 99;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            sethasfixedsize = (setHasFixedSize) continuationImpl;
            int i4 = sethasfixedsize.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                sethasfixedsize.write = i4 - Integer.MIN_VALUE;
                int i5 = MediaBrowserCompatMediaItem + 5;
                RatingCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 3 / 3;
                }
            } else {
                sethasfixedsize = new setHasFixedSize(inAppNotificationsRepository, continuationImpl);
            }
        } else {
            sethasfixedsize = new setHasFixedSize(inAppNotificationsRepository, continuationImpl);
        }
        Object obj = sethasfixedsize.read;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = sethasfixedsize.write;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(scrollStep.Companion.serializer());
                scrollStep scrollstep = (scrollStep) isverticalswipeinalloweddirection.serializer(str, setgraphicmodalmaxwidthdp);
                int i8 = MediaBrowserCompatMediaItem + 55;
                RatingCompat = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    return scrollstep;
                }
                throw null;
            } catch (SerializationException unused) {
                startNestedScroll startnestedscroll = inAppNotificationsRepository.RemoteActionCompatParcelizer;
                sethasfixedsize.write = 1;
                Object objPerformSuspending = TuplesKt.performSuspending(((smoothScrollToPosition) startnestedscroll).RemoteActionCompatParcelizer, false, true, new invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(23), sethasfixedsize);
                if (objPerformSuspending != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objPerformSuspending = createFromParcel.INSTANCE;
                    int i9 = MediaBrowserCompatMediaItem + 55;
                    RatingCompat = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                }
                if (objPerformSuspending == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d5, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r12, r13, r10) == r11) goto L31;
     */
    /* JADX INFO: renamed from: fetchAndSaveInAppMessage-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4981fetchAndSaveInAppMessage0E7RQCE(java.lang.String r16, o.processAdapterUpdatesAndSetAnimationFlags r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.inappnotifications.data.InAppNotificationsRepository.m4981fetchAndSaveInAppMessage0E7RQCE(java.lang.String, o.processAdapterUpdatesAndSetAnimationFlags, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
