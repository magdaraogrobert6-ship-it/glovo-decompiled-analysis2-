package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.AbstractApplier;
import androidx.compose.ui.R;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.UiApplier;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.getBirthDateMonth;
import o.getBirthDateYear;
import o.getCieXyz;
import o.getCreditCardExpirationDate;
import o.getCreditCardSecurityCode;
import o.isInvalidIndex;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class Wrapper_androidKt {
    private static final ViewGroup.LayoutParams DefaultLayoutParams = new ViewGroup.LayoutParams(-2, -2);

    /* JADX INFO: renamed from: androidx.compose.ui.platform.Wrapper_androidKt$setContent$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 implements LifecycleRetainedValuesStoreOwner.FrameEndScheduler, r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ {
        final /* synthetic */ getBirthDateYear $tmp0;

        public AnonymousClass1(getBirthDateYear getbirthdateyear) {
            this.$tmp0 = getbirthdateyear;
        }

        @Override // o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ
        public final isInvalidIndex getFunctionDelegate() {
            return new FunctionReferenceImpl(1, 0, getBirthDateYear.class, this.$tmp0, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;");
        }

        @Override // androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.FrameEndScheduler
        public final getBirthDateMonth scheduleFrameEndCallback(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
            return this.$tmp0.serializer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof LifecycleRetainedValuesStoreOwner.FrameEndScheduler) || !(obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ)) {
                return false;
            }
            Object[] objArr = {getFunctionDelegate(), ((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate()};
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final AbstractApplier createApplier(LayoutNode layoutNode) {
        return new UiApplier(layoutNode);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    public static final getCreditCardExpirationDate setContent(AbstractComposeView abstractComposeView, ComposeViewContext composeViewContext, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        AndroidComposeView androidComposeView;
        WrappedComposition wrappedComposition;
        GlobalSnapshotManager.INSTANCE.ensureStarted();
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
            if (androidComposeView != null) {
                androidComposeView.setComposeViewContext(composeViewContext);
            }
            if (androidComposeView == null) {
                AndroidComposeView androidComposeView2 = new AndroidComposeView(abstractComposeView.getContext(), composeViewContext);
                abstractComposeView.addView(androidComposeView2.getView(), DefaultLayoutParams);
                androidComposeView = androidComposeView2;
            }
            androidComposeView.setComposeViewContext(composeViewContext);
            if (abstractComposeView.getComposeViewContext$ui() != null) {
                composeViewContext.incrementViewCount$ui();
                androidComposeView.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            if (InspectableValueKt.isDebugInspectorInfoEnabled() && androidComposeView.getTag(R.id.inspection_slot_table_set) == null) {
                androidComposeView.setTag(R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
            }
            Object tag = androidComposeView.getTag(R.id.wrapped_composition_tag);
            wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
            if (wrappedComposition == null) {
                wrappedComposition = new WrappedComposition(androidComposeView, new getCreditCardSecurityCode(composeViewContext.getCompositionContext$ui(), new UiApplier(androidComposeView.getRoot())));
                androidComposeView.setTag(R.id.wrapped_composition_tag, wrappedComposition);
            }
            wrappedComposition.setContent(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
            androidComposeView.setFrameEndScheduler$ui(new AnonymousClass1(composeViewContext.getCompositionContext$ui()));
            return wrappedComposition;
        }
        abstractComposeView.removeAllViews();
        androidComposeView = null;
        if (androidComposeView == null) {
            AndroidComposeView androidComposeView3 = new AndroidComposeView(abstractComposeView.getContext(), composeViewContext);
            abstractComposeView.addView(androidComposeView3.getView(), DefaultLayoutParams);
            androidComposeView = androidComposeView3;
        }
        androidComposeView.setComposeViewContext(composeViewContext);
        if (abstractComposeView.getComposeViewContext$ui() != null) {
            composeViewContext.incrementViewCount$ui();
            androidComposeView.setComposeViewContextIncrementedDuringInit$ui(true);
        }
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            androidComposeView.setTag(R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
        }
        Object tag2 = androidComposeView.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof WrappedComposition) {
        }
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, new getCreditCardSecurityCode(composeViewContext.getCompositionContext$ui(), new UiApplier(androidComposeView.getRoot())));
            androidComposeView.setTag(R.id.wrapped_composition_tag, wrappedComposition);
        }
        wrappedComposition.setContent(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        androidComposeView.setFrameEndScheduler$ui(new AnonymousClass1(composeViewContext.getCompositionContext$ui()));
        return wrappedComposition;
    }
}
