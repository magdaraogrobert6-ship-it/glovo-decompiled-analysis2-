package androidx.compose.foundation.gestures;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.Velocity;
import coil3.ExtrasKt;
import coil3.RealImageLoader;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InlineChildren;
import o.PlatformSelectionBehaviorsImpl;
import o.SelectionHandleIcon;
import o.SelectionHandlesKt;
import o.ShortNewsContentCardView;
import o.SimpleLayoutKtSimpleLayout11;
import o.applyMeasureResultfoundation;
import o.constructorimpl;
import o.createBrazeUserChangeEventSubscriberlambda0;
import o.createFromParcel;
import o.getAdjustedCoordinatesk4lQ0M;
import o.getViewportSizeYbymL2g;
import o.isMouseOrTouchPad;
import o.isNotGestureActionfoundation;
import o.notifyFocusedRectfoundation;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLogic {
    public SelectionHandleIcon MediaBrowserCompatMediaItem;
    public final ScrollableNode MediaMetadataCompat;
    public isNotGestureActionfoundation MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public getAdjustedCoordinatesk4lQ0M ParcelableVolumeInfo;
    public boolean RemoteActionCompatParcelizer;
    public NestedScrollDispatcher read;
    public constructorimpl serializer;
    public final isMouseOrTouchPad write;
    public int IconCompatParcelizer = NestedScrollSource.Companion.m1938getUserInputWNlRxjI();
    public PlatformSelectionBehaviorsImpl RatingCompat = ScrollableKt.IconCompatParcelizer;
    public final SimpleLayoutKtSimpleLayout11 MediaDescriptionCompat = new SimpleLayoutKtSimpleLayout11(this);
    public final InlineChildren PlaybackStateCompat = new InlineChildren(5, this);

    public final float RemoteActionCompatParcelizer(float f) {
        return this.MediaSessionCompatResultReceiverWrapper ? f * (-1.0f) : f;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:6:0x000b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0011  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX INFO: renamed from: onScrollStopped-BMRW4eQ, reason: not valid java name */
    public final Object m57onScrollStoppedBMRW4eQ(long j, boolean z, SuspendLambda suspendLambda) {
        long jM3907copyOhffZ5M$default;
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1;
        isNotGestureActionfoundation isnotgestureactionfoundation;
        Object objInvoke;
        if (z) {
            constructorimpl constructorimplVar = this.serializer;
            getViewportSizeYbymL2g getviewportsizeybyml2g = ScrollableKt.write;
            if (!(constructorimplVar instanceof notifyFocusedRectfoundation)) {
                if (this.MediaBrowserCompatMediaItem == SelectionHandleIcon.Horizontal) {
                    jM3907copyOhffZ5M$default = Velocity.m3907copyOhffZ5M$default(j, 0.0f, 0.0f, 1, null);
                } else {
                    jM3907copyOhffZ5M$default = Velocity.m3907copyOhffZ5M$default(j, 0.0f, 0.0f, 2, null);
                }
                scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
                isnotgestureactionfoundation = this.MediaSessionCompatQueueItem;
                if (isnotgestureactionfoundation == null && (this.ParcelableVolumeInfo.write() || this.ParcelableVolumeInfo.RemoteActionCompatParcelizer())) {
                    Object objM13applyToFlingBMRW4eQ = ((AndroidEdgeEffectOverscrollEffect) isnotgestureactionfoundation).m13applyToFlingBMRW4eQ(jM3907copyOhffZ5M$default, scrollingLogic$onScrollStopped$performFling$1, suspendLambda);
                    if (objM13applyToFlingBMRW4eQ == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objM13applyToFlingBMRW4eQ;
                    }
                } else {
                    objInvoke = scrollingLogic$onScrollStopped$performFling$1.invoke(Velocity.m3902boximpl(jM3907copyOhffZ5M$default), suspendLambda);
                    if (objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objInvoke;
                    }
                }
            }
        } else {
            if (this.MediaBrowserCompatMediaItem == SelectionHandleIcon.Horizontal) {
                jM3907copyOhffZ5M$default = Velocity.m3907copyOhffZ5M$default(j, 0.0f, 0.0f, 1, null);
            } else {
                jM3907copyOhffZ5M$default = Velocity.m3907copyOhffZ5M$default(j, 0.0f, 0.0f, 2, null);
            }
            scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
            isnotgestureactionfoundation = this.MediaSessionCompatQueueItem;
            if (isnotgestureactionfoundation == null) {
                objInvoke = scrollingLogic$onScrollStopped$performFling$1.invoke(Velocity.m3902boximpl(jM3907copyOhffZ5M$default), suspendLambda);
                if (objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objInvoke;
                }
            } else {
                objInvoke = scrollingLogic$onScrollStopped$performFling$1.invoke(Velocity.m3902boximpl(jM3907copyOhffZ5M$default), suspendLambda);
                if (objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objInvoke;
                }
            }
        }
        return createFromParcel.INSTANCE;
    }

    public final long serializer(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, long j, int i) {
        long jM1922dispatchPreScrollOzD1aCk = this.read.m1922dispatchPreScrollOzD1aCk(j, i);
        long jM481minusMKHz9U = Offset.m481minusMKHz9U(j, jM1922dispatchPreScrollOzD1aCk);
        long jWrite = write(m59toOffsettuRUvjQ(platformSelectionBehaviorsImpl.read(m58toFloatk4lQ0M(write(Offset.m471copydBAh8RU$default(jM481minusMKHz9U, 0.0f, 0.0f, this.MediaBrowserCompatMediaItem == SelectionHandleIcon.Horizontal ? 1 : 2, null))))));
        ScrollableNode scrollableNode = this.MediaMetadataCompat;
        if (scrollableNode.isAttached()) {
            DelegatableNodeKt.m2388dispatchOnScrollChangedUv8p0NA(scrollableNode, jWrite);
        }
        return Offset.m482plusMKHz9U(Offset.m482plusMKHz9U(jM1922dispatchPreScrollOzD1aCk, jWrite), this.read.m1920dispatchPostScrollDzOQY0M(jWrite, Offset.m481minusMKHz9U(jM481minusMKHz9U, jWrite), i));
    }

    /* JADX INFO: renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m58toFloatk4lQ0M(long j) {
        return Float.intBitsToFloat((int) (this.MediaBrowserCompatMediaItem == SelectionHandleIcon.Horizontal ? j >> 32 : j & 4294967295L));
    }

    public ScrollingLogic(getAdjustedCoordinatesk4lQ0M getadjustedcoordinatesk4lq0m, isNotGestureActionfoundation isnotgestureactionfoundation, constructorimpl constructorimplVar, SelectionHandleIcon selectionHandleIcon, boolean z, NestedScrollDispatcher nestedScrollDispatcher, ScrollableNode scrollableNode, isMouseOrTouchPad ismouseortouchpad) {
        this.ParcelableVolumeInfo = getadjustedcoordinatesk4lq0m;
        this.MediaSessionCompatQueueItem = isnotgestureactionfoundation;
        this.serializer = constructorimplVar;
        this.MediaBrowserCompatMediaItem = selectionHandleIcon;
        this.MediaSessionCompatResultReceiverWrapper = z;
        this.read = nestedScrollDispatcher;
        this.MediaMetadataCompat = scrollableNode;
        this.write = ismouseortouchpad;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    public final Object m56doFlingAnimationQWom1Mo(long j, ContinuationImpl continuationImpl) {
        SelectionHandlesKt selectionHandlesKt;
        createBrazeUserChangeEventSubscriberlambda0 createbrazeuserchangeeventsubscriberlambda0;
        if (continuationImpl instanceof SelectionHandlesKt) {
            selectionHandlesKt = (SelectionHandlesKt) continuationImpl;
            int i = selectionHandlesKt.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                selectionHandlesKt.write = i - Integer.MIN_VALUE;
            } else {
                selectionHandlesKt = new SelectionHandlesKt(this, continuationImpl);
            }
        } else {
            selectionHandlesKt = new SelectionHandlesKt(this, continuationImpl);
        }
        Object obj = selectionHandlesKt.RemoteActionCompatParcelizer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = selectionHandlesKt.write;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                createBrazeUserChangeEventSubscriberlambda0 createbrazeuserchangeeventsubscriberlambda1 = new createBrazeUserChangeEventSubscriberlambda0();
                createbrazeuserchangeeventsubscriberlambda1.serializer = j;
                this.RemoteActionCompatParcelizer = true;
                applyMeasureResultfoundation applymeasureresultfoundation = applyMeasureResultfoundation.Default;
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this, createbrazeuserchangeeventsubscriberlambda1, j, null);
                selectionHandlesKt.IconCompatParcelizer = createbrazeuserchangeeventsubscriberlambda1;
                selectionHandlesKt.write = 1;
                if (scroll(applymeasureresultfoundation, scrollingLogic$doFlingAnimation$2, selectionHandlesKt) == obj2) {
                    return obj2;
                }
                createbrazeuserchangeeventsubscriberlambda0 = createbrazeuserchangeeventsubscriberlambda1;
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                createbrazeuserchangeeventsubscriberlambda0 = selectionHandlesKt.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            this.RemoteActionCompatParcelizer = false;
            return Velocity.m3902boximpl(createbrazeuserchangeeventsubscriberlambda0.serializer);
        } catch (Throwable th) {
            this.RemoteActionCompatParcelizer = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m59toOffsettuRUvjQ(float f) {
        if (f == 0.0f) {
            return Offset.Companion.m493getZeroF1C5BW0();
        }
        if (this.MediaBrowserCompatMediaItem == SelectionHandleIcon.Horizontal) {
            return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
        }
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f))));
    }

    public final long write(long j) {
        return this.MediaSessionCompatResultReceiverWrapper ? Offset.m484timestuRUvjQ(j, -1.0f) : j;
    }

    public final Object scroll(applyMeasureResultfoundation applymeasureresultfoundation, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ContinuationImpl continuationImpl) {
        Object objScroll = this.ParcelableVolumeInfo.scroll(applymeasureresultfoundation, new RealImageLoader.AnonymousClass2(this, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (ShortNewsContentCardView) null, 10), continuationImpl);
        return objScroll == CoroutineSingletons.COROUTINE_SUSPENDED ? objScroll : createFromParcel.INSTANCE;
    }

    /* JADX INFO: renamed from: toSingleAxisDeltaFromAngle-k-4lQ0M, reason: not valid java name */
    public final float m60toSingleAxisDeltaFromAnglek4lQ0M(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        SelectionHandleIcon selectionHandleIcon = this.MediaBrowserCompatMediaItem;
        if (dAtan2 >= 0.7853981633974483d) {
            if (selectionHandleIcon == SelectionHandleIcon.Vertical) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (selectionHandleIcon == SelectionHandleIcon.Horizontal) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
