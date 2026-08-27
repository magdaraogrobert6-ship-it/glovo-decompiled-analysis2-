package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.internal.InlineClassHelperKt;
import com.logistics.rider.glovo.R;
import o.DrawableTransformation;
import o.accessisRenderNodeCompatiblecp;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getBeyondBoundsLayoutParent;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import o.restoreFocusedChild;
import o.supportsColorMatrixQuery;
import okio.Options;

/* JADX INFO: loaded from: classes.dex */
public interface ViewCompositionStrategy {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ViewCompositionStrategy getDefault() {
            return DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DisposeOnDetachedFromWindow implements ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final DisposeOnDetachedFromWindow INSTANCE = new DisposeOnDetachedFromWindow();

        private DisposeOnDetachedFromWindow() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 installFor(final AbstractComposeView abstractComposeView) {
            final ?? r0 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    abstractComposeView.disposeComposition();
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r0);
            return new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m2786invoke() {
                    abstractComposeView.removeOnAttachStateChangeListener(r0);
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m2786invoke();
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool INSTANCE = new DisposeOnDetachedFromWindowOrReleasedFromPool();

        private DisposeOnDetachedFromWindowOrReleasedFromPool() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 installFor(final AbstractComposeView abstractComposeView) {
            final ?? r0 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    AbstractComposeView abstractComposeView2 = abstractComposeView;
                    abstractComposeView2.getClass();
                    for (Object obj : restoreFocusedChild.read(abstractComposeView2)) {
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            view2.getClass();
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null && bool.booleanValue()) {
                                return;
                            }
                        }
                    }
                    abstractComposeView.disposeComposition();
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r0);
            final ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0 viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0 = new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0(abstractComposeView);
            Options.Companion.write(abstractComposeView).read.add(viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0);
            return new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m2788invoke() {
                    abstractComposeView.removeOnAttachStateChangeListener(r0);
                    AbstractComposeView abstractComposeView2 = abstractComposeView;
                    getBeyondBoundsLayoutParent getbeyondboundslayoutparent = viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0;
                    abstractComposeView2.getClass();
                    getbeyondboundslayoutparent.getClass();
                    Options.Companion.write(abstractComposeView2).read.remove(getbeyondboundslayoutparent);
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m2788invoke();
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    public static final class DisposeOnLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 8;
        private final supportsColorMatrixQuery lifecycle;

        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 installFor(AbstractComposeView abstractComposeView) {
            return ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView, this.lifecycle);
        }

        public DisposeOnLifecycleDestroyed(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
            this(accessisrendernodecompatiblecp.getLifecycle());
        }

        public DisposeOnLifecycleDestroyed(supportsColorMatrixQuery supportscolormatrixquery) {
            this.lifecycle = supportscolormatrixquery;
        }
    }

    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 installFor(AbstractComposeView abstractComposeView);

    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final DisposeOnViewTreeLifecycleDestroyed INSTANCE = new DisposeOnViewTreeLifecycleDestroyed();

        private DisposeOnViewTreeLifecycleDestroyed() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 installFor(final AbstractComposeView abstractComposeView) {
            if (!abstractComposeView.isAttachedToWindow()) {
                final createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                final ?? r1 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1819368283, -1819368281, getCieXyz.write(), getCieXyz.write(), new Object[]{abstractComposeView}, getCieXyz.write());
                        AbstractComposeView abstractComposeView2 = abstractComposeView;
                        if (accessisrendernodecompatiblecp != null) {
                            createinappmessageeventsubscriber.IconCompatParcelizer = ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView2, accessisrendernodecompatiblecp.getLifecycle());
                            abstractComposeView.removeOnAttachStateChangeListener(this);
                        } else {
                            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("View tree for " + abstractComposeView2 + " has no ViewTreeLifecycleOwner");
                            DrawableTransformation.read();
                        }
                    }
                };
                abstractComposeView.addOnAttachStateChangeListener(r1);
                createinappmessageeventsubscriber.IconCompatParcelizer = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m2789invoke() {
                        abstractComposeView.removeOnAttachStateChangeListener(r1);
                    }

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m2789invoke();
                        return createFromParcel.INSTANCE;
                    }
                };
                return new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m2790invoke() {
                        ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) createinappmessageeventsubscriber.IconCompatParcelizer).invoke();
                    }

                    {
                        super(0);
                    }

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m2790invoke();
                        return createFromParcel.INSTANCE;
                    }
                };
            }
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1819368283, -1819368281, getCieXyz.write(), getCieXyz.write(), new Object[]{abstractComposeView}, getCieXyz.write());
            if (accessisrendernodecompatiblecp != null) {
                return ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView, accessisrendernodecompatiblecp.getLifecycle());
            }
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner");
            DrawableTransformation.read();
            return null;
        }
    }
}
