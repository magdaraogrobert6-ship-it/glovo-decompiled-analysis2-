package androidx.compose.ui.platform;

import androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2;
import coil3.ExtrasKt;
import coil3.RealImageLoader$execute$result$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.TextStreamsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import o.ShortNewsContentCardView;
import o.accessisRenderNodeCompatiblecp;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.sendContentCaptureAppearEvents;

/* JADX INFO: loaded from: classes.dex */
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    final /* synthetic */ createInAppMessageEventSubscriber $motionDurationScaleImpl;
    final /* synthetic */ sendContentCaptureAppearEvents $recomposer;
    final /* synthetic */ WindowRecomposer_androidKt.AnonymousClass2 $self;
    final /* synthetic */ accessisRenderNodeCompatiblecp $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(createInAppMessageEventSubscriber createinappmessageeventsubscriber, sendContentCaptureAppearEvents sendcontentcaptureappearevents, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, WindowRecomposer_androidKt.AnonymousClass2 anonymousClass2, ShortNewsContentCardView<? super WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1> shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.$motionDurationScaleImpl = createinappmessageeventsubscriber;
        this.$recomposer = sendcontentcaptureappearevents;
        this.$source = accessisrendernodecompatiblecp;
        this.$self = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
        return new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.$motionDurationScaleImpl, this.$recomposer, this.$source, this.$self, shortNewsContentCardView);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        try {
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                MotionDurationScaleImpl motionDurationScaleImpl = (MotionDurationScaleImpl) this.$motionDurationScaleImpl.IconCompatParcelizer;
                if (motionDurationScaleImpl != null) {
                    motionDurationScaleImpl.setCoroutineScope(YieldKt.RemoteActionCompatParcelizer(this.$recomposer.PlaybackStateCompatCustomAction));
                }
                sendContentCaptureAppearEvents sendcontentcaptureappearevents = this.$recomposer;
                this.label = 1;
                sendcontentcaptureappearevents.getClass();
                Object objWithContext = BuildersKt.withContext(sendcontentcaptureappearevents.MediaSessionCompatQueueItem, new RealImageLoader$execute$result$1(sendcontentcaptureappearevents, new Recomposer$runRecomposeAndApplyChanges$2(sendcontentcaptureappearevents, null), TextStreamsKt.read(getContext()), null), this);
                if (objWithContext != coroutineSingletons) {
                    objWithContext = createfromparcel;
                }
                if (objWithContext != coroutineSingletons) {
                    objWithContext = createfromparcel;
                }
                if (objWithContext == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            this.$source.getLifecycle().read(this.$self);
            return createfromparcel;
        } catch (Throwable th) {
            this.$source.getLifecycle().read(this.$self);
            throw th;
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
    }
}
