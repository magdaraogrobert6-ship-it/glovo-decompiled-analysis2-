package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.BrazeContentCardsManager;
import o.TextAnnouncementContentCardView;
import o.isAdapterPositionOnScreen;
import o.notifyViewEntered;
import o.onViewDetachedFromWindowlambda1;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidUiDispatcher extends CoroutineDispatcher {
    private static final onViewDetachedFromWindowlambda1 Main$delegate = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final TextAnnouncementContentCardView invoke() {
            Choreographer choreographer;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (AndroidUiDispatcher_androidKt.isMainThread()) {
                choreographer = Choreographer.getInstance();
            } else {
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                choreographer = (Choreographer) BuildersKt.serializer(MainDispatcherLoader.read, new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null));
            }
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, Handler.createAsync(Looper.getMainLooper()), defaultConstructorMarker);
            return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
        }
    }});
    private static final ThreadLocal<TextAnnouncementContentCardView> currentThread = new ThreadLocal<TextAnnouncementContentCardView>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$currentThread$1
        @Override // java.lang.ThreadLocal
        public TextAnnouncementContentCardView initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (looperMyLooper != null) {
                AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, Handler.createAsync(looperMyLooper), defaultConstructorMarker);
                return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("no Looper on this thread");
            return null;
        }
    };
    private final Choreographer choreographer;
    private final AndroidUiDispatcher$dispatchCallback$1 dispatchCallback;
    private final notifyViewEntered frameClock;
    private final Handler handler;
    private final Object lock;
    private boolean scheduledFrameDispatch;
    private boolean scheduledTrampolineDispatch;
    private List<Choreographer.FrameCallback> spareToRunOnFrame;
    private List<Choreographer.FrameCallback> toRunOnFrame;
    private final BrazeContentCardsManager toRunTrampolined;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    public final notifyViewEntered getFrameClock() {
        return this.frameClock;
    }

    private final Runnable nextTask() {
        Runnable runnable;
        synchronized (this.lock) {
            runnable = (Runnable) this.toRunTrampolined.RatingCompat();
        }
        return runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performFrameDispatch(long j) {
        synchronized (this.lock) {
            if (this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = false;
                List<Choreographer.FrameCallback> list = this.toRunOnFrame;
                this.toRunOnFrame = this.spareToRunOnFrame;
                this.spareToRunOnFrame = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).doFrame(j);
                }
                list.clear();
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        synchronized (this.lock) {
            this.toRunTrampolined.addLast(runnable);
            if (!this.scheduledTrampolineDispatch) {
                this.scheduledTrampolineDispatch = true;
                this.handler.post(this.dispatchCallback);
                if (!this.scheduledFrameDispatch) {
                    this.scheduledFrameDispatch = true;
                    this.choreographer.postFrameCallback(this.dispatchCallback);
                }
            }
        }
    }

    public final void postFrameCallback$ui(Choreographer.FrameCallback frameCallback) {
        synchronized (this.lock) {
            this.toRunOnFrame.add(frameCallback);
            if (!this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = true;
                this.choreographer.postFrameCallback(this.dispatchCallback);
            }
        }
    }

    public final void removeFrameCallback$ui(Choreographer.FrameCallback frameCallback) {
        synchronized (this.lock) {
            this.toRunOnFrame.remove(frameCallback);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TextAnnouncementContentCardView getMain() {
            return (TextAnnouncementContentCardView) AndroidUiDispatcher.Main$delegate.MediaSessionCompatResultReceiverWrapper();
        }

        public final TextAnnouncementContentCardView getCurrentThread() {
            if (AndroidUiDispatcher_androidKt.isMainThread()) {
                return getMain();
            }
            TextAnnouncementContentCardView textAnnouncementContentCardView = (TextAnnouncementContentCardView) AndroidUiDispatcher.currentThread.get();
            if (textAnnouncementContentCardView != null) {
                return textAnnouncementContentCardView;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("no AndroidUiDispatcher for this thread");
            return null;
        }
    }

    private AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.choreographer = choreographer;
        this.handler = handler;
        this.lock = new Object();
        this.toRunTrampolined = new BrazeContentCardsManager();
        this.toRunOnFrame = new ArrayList();
        this.spareToRunOnFrame = new ArrayList();
        this.dispatchCallback = new AndroidUiDispatcher$dispatchCallback$1(this);
        this.frameClock = new AndroidUiFrameClock(choreographer, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performTrampolineDispatch() {
        boolean z;
        do {
            Runnable runnableNextTask = nextTask();
            while (runnableNextTask != null) {
                runnableNextTask.run();
                runnableNextTask = nextTask();
            }
            synchronized (this.lock) {
                if (this.toRunTrampolined.isEmpty()) {
                    z = false;
                    this.scheduledTrampolineDispatch = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    public /* synthetic */ AndroidUiDispatcher(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }
}
