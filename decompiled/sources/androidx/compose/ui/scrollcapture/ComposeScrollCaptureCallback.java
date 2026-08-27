package androidx.compose.ui.scrollcapture;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.View;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.unit.IntRect;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.function.Consumer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.TextStreamsKt;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import o.DefaultInAppMessageViewWrappercreateTouchAwareListener1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.displayInAppMessagelambda6;
import o.displayInAppMessagelambda9;
import o.getContentViewGroupParentLayout;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.seekAnimationsanimation_core;

/* JADX INFO: loaded from: classes4.dex */
public final class ComposeScrollCaptureCallback implements ScrollCaptureCallback {
    public static final int $stable = 8;
    private final View composeView;
    private final getContentViewGroupParentLayout coroutineScope;
    private final ScrollCaptureSessionListener listener;
    private final SemanticsNode node;
    private int requestCount;
    private final RelativeScroller scrollTracker;
    private final IntRect viewportBoundsInWindow;

    /* JADX INFO: loaded from: classes.dex */
    public interface ScrollCaptureSessionListener {
        void onSessionEnded();

        void onSessionStarted();
    }

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        final /* synthetic */ Runnable $onReady;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Runnable runnable, ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$onReady = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return ComposeScrollCaptureCallback.this.new AnonymousClass1(this.$onReady, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                RelativeScroller relativeScroller = ComposeScrollCaptureCallback.this.scrollTracker;
                this.label = 1;
                if (relativeScroller.scrollTo(0.0f, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            ComposeScrollCaptureCallback.this.listener.onSessionEnded();
            this.$onReady.run();
            return createFromParcel.INSTANCE;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00661 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        final /* synthetic */ Rect $captureArea;
        final /* synthetic */ Consumer<Rect> $onComplete;
        final /* synthetic */ ScrollCaptureSession $session;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00661(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, ShortNewsContentCardView<? super C00661> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$session = scrollCaptureSession;
            this.$captureArea = rect;
            this.$onComplete = consumer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return ComposeScrollCaptureCallback.this.new C00661(this.$session, this.$captureArea, this.$onComplete, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ComposeScrollCaptureCallback composeScrollCaptureCallback = ComposeScrollCaptureCallback.this;
                ScrollCaptureSession scrollCaptureSession = this.$session;
                IntRect composeIntRect = RectHelper_androidKt.toComposeIntRect(this.$captureArea);
                this.label = 1;
                obj = composeScrollCaptureCallback.onScrollCaptureImageRequest(scrollCaptureSession, composeIntRect, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            this.$onComplete.accept(RectHelper_androidKt.toAndroidRect((IntRect) obj));
            return createFromParcel.INSTANCE;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((C00661) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2, reason: invalid class name */
    public static final class AnonymousClass2 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(ShortNewsContentCardView<? super AnonymousClass2> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ComposeScrollCaptureCallback.this.onScrollCaptureImageRequest(null, null, this);
        }
    }

    private final void drawDebugBackground(Canvas canvas) {
        Color.Companion companion = Color.Companion;
        displayInAppMessagelambda6 displayinappmessagelambda6 = displayInAppMessagelambda9.write;
        canvas.drawColor(ColorKt.m776toArgb8_81llA(Color.Companion.m746hslJlNiLsg$default(companion, displayInAppMessagelambda9.serializer.IconCompatParcelizer().nextFloat() * 360.0f, 0.75f, 0.5f, 1.0f, null, 16, null)));
    }

    private final void drawDebugOverlay(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(-65536);
        paint.setTextSize(48.0f);
        canvas.drawCircle(0.0f, 0.0f, 20.0f, paint);
        canvas.drawCircle(canvas.getWidth(), 0.0f, 20.0f, paint);
        canvas.drawCircle(canvas.getWidth(), canvas.getHeight(), 20.0f, paint);
        canvas.drawCircle(0.0f, canvas.getHeight(), 20.0f, paint);
        canvas.drawText(String.valueOf(this.requestCount), canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f, paint);
        this.requestCount++;
    }

    public void onScrollCaptureEnd(Runnable runnable) {
        BuildersKt.RemoteActionCompatParcelizer(this.coroutineScope, DefaultInAppMessageViewWrappercreateTouchAwareListener1.serializer, null, new AnonymousClass1(runnable, null), 2);
    }

    public void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer<Rect> consumer) {
        consumer.accept(RectHelper_androidKt.toAndroidRect(this.viewportBoundsInWindow));
    }

    public void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.scrollTracker.reset();
        this.requestCount = 0;
        this.listener.onSessionStarted();
        runnable.run();
    }

    public ComposeScrollCaptureCallback(SemanticsNode semanticsNode, IntRect intRect, getContentViewGroupParentLayout getcontentviewgroupparentlayout, ScrollCaptureSessionListener scrollCaptureSessionListener, View view) {
        this.node = semanticsNode;
        this.viewportBoundsInWindow = intRect;
        this.listener = scrollCaptureSessionListener;
        this.composeView = view;
        this.coroutineScope = YieldKt.write(getcontentviewgroupparentlayout, DisableAnimationMotionDurationScale.INSTANCE);
        this.scrollTracker = new RelativeScroller(intRect.getHeight(), new ComposeScrollCaptureCallback$scrollTracker$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, IntRect intRect, ShortNewsContentCardView<? super IntRect> shortNewsContentCardView) {
        AnonymousClass2 anonymousClass2;
        int top;
        int bottom;
        ScrollCaptureSession scrollCaptureSessionAt_;
        IntRect intRect2;
        int i;
        int i2;
        int iMapOffsetToViewport;
        int iMapOffsetToViewport2;
        IntRect intRectCopy$default;
        Canvas canvasLockHardwareCanvas;
        if (shortNewsContentCardView instanceof AnonymousClass2) {
            anonymousClass2 = (AnonymousClass2) shortNewsContentCardView;
            int i3 = anonymousClass2.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass2 = new AnonymousClass2(shortNewsContentCardView);
            }
        } else {
            anonymousClass2 = new AnonymousClass2(shortNewsContentCardView);
        }
        Object obj = anonymousClass2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = anonymousClass2.label;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            top = intRect.getTop();
            bottom = intRect.getBottom();
            RelativeScroller relativeScroller = this.scrollTracker;
            anonymousClass2.L$0 = scrollCaptureSession;
            anonymousClass2.L$1 = intRect;
            anonymousClass2.I$0 = top;
            anonymousClass2.I$1 = bottom;
            anonymousClass2.label = 1;
            if (relativeScroller.scrollRangeToCenter(top, bottom, anonymousClass2) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            int i5 = anonymousClass2.I$1;
            int i6 = anonymousClass2.I$0;
            IntRect intRect3 = (IntRect) anonymousClass2.L$1;
            ScrollCaptureSession scrollCaptureSessionAt_2 = seekAnimationsanimation_core.at_(anonymousClass2.L$0);
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            top = i6;
            intRect = intRect3;
            bottom = i5;
            scrollCaptureSession = scrollCaptureSessionAt_2;
        } else {
            if (i4 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = anonymousClass2.I$1;
            i = anonymousClass2.I$0;
            intRect2 = (IntRect) anonymousClass2.L$1;
            scrollCaptureSessionAt_ = seekAnimationsanimation_core.at_(anonymousClass2.L$0);
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        iMapOffsetToViewport = this.scrollTracker.mapOffsetToViewport(i);
        iMapOffsetToViewport2 = this.scrollTracker.mapOffsetToViewport(i2);
        intRectCopy$default = IntRect.copy$default(intRect2, 0, iMapOffsetToViewport, 0, iMapOffsetToViewport2, 5, null);
        if (iMapOffsetToViewport == iMapOffsetToViewport2) {
            return IntRect.Companion.getZero();
        }
        canvasLockHardwareCanvas = scrollCaptureSessionAt_.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-intRectCopy$default.getLeft(), -intRectCopy$default.getTop());
            canvasLockHardwareCanvas.translate(-this.viewportBoundsInWindow.getLeft(), -this.viewportBoundsInWindow.getTop());
            this.composeView.getRootView().draw(canvasLockHardwareCanvas);
            return intRectCopy$default.translate(0, MathKt.write(this.scrollTracker.getScrollAmount()));
        } finally {
            scrollCaptureSessionAt_.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        AnonymousClass3 anonymousClass3 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.onScrollCaptureImageRequest.3
            public final void invoke(long j) {
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* synthetic */ Object invoke(Object obj2) {
                invoke(((Number) obj2).longValue());
                return createFromParcel.INSTANCE;
            }
        };
        anonymousClass2.L$0 = scrollCaptureSession;
        anonymousClass2.L$1 = intRect;
        anonymousClass2.I$0 = top;
        anonymousClass2.I$1 = bottom;
        anonymousClass2.label = 2;
        if (TextStreamsKt.read(anonymousClass2.getContext()).withFrameNanos(anonymousClass3, anonymousClass2) != coroutineSingletons) {
            scrollCaptureSessionAt_ = scrollCaptureSession;
            intRect2 = intRect;
            i = top;
            i2 = bottom;
            iMapOffsetToViewport = this.scrollTracker.mapOffsetToViewport(i);
            iMapOffsetToViewport2 = this.scrollTracker.mapOffsetToViewport(i2);
            intRectCopy$default = IntRect.copy$default(intRect2, 0, iMapOffsetToViewport, 0, iMapOffsetToViewport2, 5, null);
            if (iMapOffsetToViewport == iMapOffsetToViewport2) {
                return IntRect.Companion.getZero();
            }
            canvasLockHardwareCanvas = scrollCaptureSessionAt_.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-intRectCopy$default.getLeft(), -intRectCopy$default.getTop());
            canvasLockHardwareCanvas.translate(-this.viewportBoundsInWindow.getLeft(), -this.viewportBoundsInWindow.getTop());
            this.composeView.getRootView().draw(canvasLockHardwareCanvas);
            return intRectCopy$default.translate(0, MathKt.write(this.scrollTracker.getScrollAmount()));
        }
        return coroutineSingletons;
    }

    public void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer<Rect> consumer) {
        ComposeScrollCaptureCallback_androidKt.launchWithCancellationSignal(this.coroutineScope, cancellationSignal, new C00661(scrollCaptureSession, rect, consumer, null));
    }
}
