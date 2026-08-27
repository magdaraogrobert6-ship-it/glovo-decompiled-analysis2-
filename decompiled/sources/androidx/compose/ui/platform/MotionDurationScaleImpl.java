package androidx.compose.ui.platform;

import android.content.Context;
import androidx.compose.ui.MotionDurationScale;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.DrawableTransformation;
import o.ImageOnlyContentCardViewViewHolder;
import o.ShortNewsContentCardView;
import o.ShortNewsContentCardViewViewHolder;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.getContentCaptureSessionui;
import o.getContentViewGroupParentLayout;
import o.getPersonFullName;
import o.populate;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes.dex */
final class MotionDurationScaleImpl implements MotionDurationScale {
    private final populate _scaleFactor$delegate = getPersonFullName.RemoteActionCompatParcelizer(1.0f);
    private final Context applicationContext;
    private getContentViewGroupParentLayout coroutineScope;
    private setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 job;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.MotionDurationScaleImpl$startObservingSystemScaleFactor$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        final /* synthetic */ StateFlow<Float> $durationScaleStateFlow;
        int label;
        final /* synthetic */ MotionDurationScaleImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StateFlow<Float> stateFlow, MotionDurationScaleImpl motionDurationScaleImpl, ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$durationScaleStateFlow = stateFlow;
            this.this$0 = motionDurationScaleImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return new AnonymousClass1(this.$durationScaleStateFlow, this.this$0, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                StateFlow<Float> stateFlow = this.$durationScaleStateFlow;
                final MotionDurationScaleImpl motionDurationScaleImpl = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.ui.platform.MotionDurationScaleImpl.startObservingSystemScaleFactor.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* synthetic */ Object emit(Object obj2, ShortNewsContentCardView shortNewsContentCardView) {
                        return emit(((Number) obj2).floatValue(), (ShortNewsContentCardView<? super createFromParcel>) shortNewsContentCardView);
                    }

                    public final Object emit(float f, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
                        motionDurationScaleImpl.set_scaleFactor(f);
                        return createFromParcel.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            DrawableTransformation.read();
            return null;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    @Override // androidx.compose.ui.MotionDurationScale, o.TextAnnouncementContentCardView
    public /* bridge */ <R> R fold(R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return (R) MotionDurationScale.DefaultImpls.fold(this, r, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    @Override // androidx.compose.ui.MotionDurationScale, o.TextAnnouncementContentCardView
    public /* bridge */ <E extends ShortNewsContentCardViewViewHolder> E get(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return (E) MotionDurationScale.DefaultImpls.get(this, imageOnlyContentCardViewViewHolder);
    }

    public final getContentViewGroupParentLayout getCoroutineScope() {
        return this.coroutineScope;
    }

    public final setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 getJob() {
        return this.job;
    }

    @Override // androidx.compose.ui.MotionDurationScale, o.TextAnnouncementContentCardView
    public /* bridge */ TextAnnouncementContentCardView minusKey(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return MotionDurationScale.DefaultImpls.minusKey(this, imageOnlyContentCardViewViewHolder);
    }

    @Override // androidx.compose.ui.MotionDurationScale, o.TextAnnouncementContentCardView
    public /* bridge */ TextAnnouncementContentCardView plus(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return MotionDurationScale.DefaultImpls.plus(this, textAnnouncementContentCardView);
    }

    public final void setCoroutineScope(getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.coroutineScope = getcontentviewgroupparentlayout;
    }

    public final void setJob(setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0) {
        this.job = setallviewgroupchildrenasnonaccessibilityimportantlambda0;
    }

    private final float get_scaleFactor() {
        return ((getContentCaptureSessionui) this._scaleFactor$delegate).serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_scaleFactor(float f) {
        ((getContentCaptureSessionui) this._scaleFactor$delegate).IconCompatParcelizer(f);
    }

    private final setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 startObservingSystemScaleFactor() {
        StateFlow animationScaleFlowFor = WindowRecomposer_androidKt.getAnimationScaleFlowFor(this.applicationContext);
        set_scaleFactor(((Number) animationScaleFlowFor.read()).floatValue());
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.coroutineScope;
        if (getcontentviewgroupparentlayout != null) {
            return BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new AnonymousClass1(animationScaleFlowFor, this, null), 3);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("MotionDurationScale scale factor requested before recomposer loop start");
        return null;
    }

    public MotionDurationScaleImpl(Context context) {
        this.applicationContext = context;
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public float getScaleFactor() {
        if (this.job == null) {
            this.job = startObservingSystemScaleFactor();
        }
        return get_scaleFactor();
    }
}
