package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.view.WindowInsetsAnimationCompat$Callback;
import androidx.core.view.WindowInsetsCompat$Impl;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import o.FocusPropertiesImpl;
import o.FocusPropertiesImplonEnter1;
import o.FocusPropertiesNode;
import o.FocusRequesterModifierKt;
import o.ShortNewsContentCardView;
import o.accessgetCancelcp;
import o.accessisRenderNodeCompatiblecp;
import o.component14;
import o.component15;
import o.createFromParcel;
import o.getAddressStreet;
import o.getBirthDateYear;
import o.getContentViewGroupParentLayout;
import o.getScope;
import o.getTransparent0d7_KjU;
import o.onItemDismisslambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.setRight;

/* JADX INFO: loaded from: classes.dex */
public class AndroidViewHolder extends ViewGroup implements getScope, getAddressStreet, OwnerScope, FocusPropertiesImpl {
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM bringIntoViewRequester;
    private final int compositeKeyHash;
    private Density density;
    private final NestedScrollDispatcher dispatcher;
    private boolean hasUpdateBlock;
    private FocusRequesterModifierKt insets;
    private boolean isDrawing;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;
    private final LayoutNode layoutNode;
    private accessisRenderNodeCompatiblecp lifecycleOwner;
    private final int[] location;
    private Modifier modifier;
    private final FocusPropertiesImplonEnter1 nestedScrollingParentHelper;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onDensityChanged;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onModifierChanged;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onRequestDisallowInterceptTouchEvent;
    private final Owner owner;
    private final int[] position;
    private r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 release;
    private r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 reset;
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 runInvalidate;
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 runUpdate;
    private getTransparent0d7_KjU savedStateRegistryOwner;
    private long size;
    private r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 update;
    private final View view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM OnCommitAffectingUpdate = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.INSTANCE;

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        final /* synthetic */ boolean $consumed;
        final /* synthetic */ long $viewVelocity;
        int label;
        final /* synthetic */ AndroidViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, AndroidViewHolder androidViewHolder, long j, ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$consumed = z;
            this.this$0 = androidViewHolder;
            this.$viewVelocity = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return new AnonymousClass1(this.$consumed, this.this$0, this.$viewVelocity, shortNewsContentCardView);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        
            if (r11 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        
            if (r11 == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto L10
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
                goto L58
            L10:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r11)
                r11 = 0
                return r11
            L17:
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
                goto L3a
            L1b:
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
                boolean r11 = r10.$consumed
                androidx.compose.ui.viewinterop.AndroidViewHolder r1 = r10.this$0
                if (r11 != 0) goto L40
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r4 = androidx.compose.ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r1)
                androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.ui.unit.Velocity.Companion
                long r5 = r11.m3922getZero9UxMQ8M()
                long r7 = r10.$viewVelocity
                r10.label = r3
                r9 = r10
                java.lang.Object r11 = r4.m1919dispatchPostFlingRZ2iAVY(r5, r7, r9)
                if (r11 != r0) goto L3a
                goto L57
            L3a:
                androidx.compose.ui.unit.Velocity r11 = (androidx.compose.ui.unit.Velocity) r11
                r11.m3920unboximpl()
                goto L5d
            L40:
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r1 = androidx.compose.ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r1)
                long r3 = r10.$viewVelocity
                androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.ui.unit.Velocity.Companion
                long r5 = r11.m3922getZero9UxMQ8M()
                r10.label = r2
                r2 = r3
                r4 = r5
                r6 = r10
                java.lang.Object r11 = r1.m1919dispatchPostFlingRZ2iAVY(r2, r4, r6)
                if (r11 != r0) goto L58
            L57:
                return r0
            L58:
                androidx.compose.ui.unit.Velocity r11 = (androidx.compose.ui.unit.Velocity) r11
                r11.m3920unboximpl()
            L5d:
                o.createFromParcel r11 = o.createFromParcel.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00691 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        final /* synthetic */ long $toBeConsumed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00691(long j, ShortNewsContentCardView<? super C00691> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$toBeConsumed = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return AndroidViewHolder.this.new C00691(this.$toBeConsumed, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                NestedScrollDispatcher nestedScrollDispatcher = AndroidViewHolder.this.dispatcher;
                long j = this.$toBeConsumed;
                this.label = 1;
                if (nestedScrollDispatcher.m1921dispatchPreFlingQWom1Mo(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createFromParcel.INSTANCE;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((C00691) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    public final Density getDensity() {
        return this.density;
    }

    public final View getInteropView() {
        return this.view;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final accessisRenderNodeCompatiblecp getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnDensityChanged$ui() {
        return this.onDensityChanged;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnModifierChanged$ui() {
        return this.onModifierChanged;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getRelease() {
        return this.release;
    }

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getReset() {
        return this.reset;
    }

    public final getTransparent0d7_KjU getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttachedToWindow();
    }

    @Override // o.FocusPropertiesElement
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public final void setOnDensityChanged$ui(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onDensityChanged = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final void setOnModifierChanged$ui(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onModifierChanged = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onRequestDisallowInterceptTouchEvent = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final void setRelease(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.release = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public final void setReset(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.reset = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    private final <T> T insetValue(T t, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds) {
        NodeCoordinator innerCoordinator$ui = this.layoutNode.getInnerCoordinator$ui();
        if (innerCoordinator$ui.isAttached()) {
            long jM3818roundk4lQ0M = IntOffsetKt.m3818roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui));
            int iM3801getXimpl = IntOffset.m3801getXimpl(jM3818roundk4lQ0M);
            if (iM3801getXimpl < 0) {
                iM3801getXimpl = 0;
            }
            int iM3802getYimpl = IntOffset.m3802getYimpl(jM3818roundk4lQ0M);
            if (iM3802getYimpl < 0) {
                iM3802getYimpl = 0;
            }
            long jMo2217getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui).mo2217getSizeYbymL2g();
            int i = (int) (jMo2217getSizeYbymL2g >> 32);
            int i2 = (int) (jMo2217getSizeYbymL2g & 4294967295L);
            long jMo2217getSizeYbymL2g2 = innerCoordinator$ui.mo2217getSizeYbymL2g();
            long jM3818roundk4lQ0M2 = IntOffsetKt.m3818roundk4lQ0M(innerCoordinator$ui.mo2220localToRootMKHz9U(Offset.m469constructorimpl((4294967295L & ((long) Float.floatToRawIntBits((int) (jMo2217getSizeYbymL2g2 & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (jMo2217getSizeYbymL2g2 >> 32))) << 32))));
            int iM3801getXimpl2 = i - IntOffset.m3801getXimpl(jM3818roundk4lQ0M2);
            if (iM3801getXimpl2 < 0) {
                iM3801getXimpl2 = 0;
            }
            int iM3802getYimpl2 = i2 - IntOffset.m3802getYimpl(jM3818roundk4lQ0M2);
            int i3 = iM3802getYimpl2 >= 0 ? iM3802getYimpl2 : 0;
            if (iM3801getXimpl != 0 || iM3802getYimpl != 0 || iM3801getXimpl2 != 0 || i3 != 0) {
                return (T) r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.invoke(Integer.valueOf(iM3801getXimpl), Integer.valueOf(iM3802getYimpl), Integer.valueOf(iM3801getXimpl2), Integer.valueOf(i3));
            }
        }
        return t;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        FocusPropertiesImplonEnter1 focusPropertiesImplonEnter1 = this.nestedScrollingParentHelper;
        return focusPropertiesImplonEnter1.RemoteActionCompatParcelizer | focusPropertiesImplonEnter1.serializer;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // o.FocusPropertiesImpl
    public FocusRequesterModifierKt onApplyWindowInsets(View view, FocusRequesterModifierKt focusRequesterModifierKt) {
        this.insets = new FocusRequesterModifierKt(focusRequesterModifierKt);
        return insetToLayoutPosition(focusRequesterModifierKt);
    }

    @Override // o.getAddressStreet
    public void onDeactivate() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(i, i2);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = i;
        this.lastHeightMeasureSpec = i2;
    }

    @Override // o.getAddressStreet
    public void onRelease() {
        this.release.invoke();
    }

    @Override // o.getAddressStreet
    public void onReuse() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidViewHolder(Context context, getBirthDateYear getbirthdateyear, int i, NestedScrollDispatcher nestedScrollDispatcher, View view, Owner owner) {
        super(context);
        this.compositeKeyHash = i;
        this.dispatcher = nestedScrollDispatcher;
        this.view = view;
        this.owner = owner;
        if (getbirthdateyear != null) {
            WindowRecomposer_androidKt.setCompositionContext(this, getbirthdateyear);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        FocusPropertiesNode.read(this, new WindowInsetsAnimationCompat$Callback() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder.2
            @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
            public FocusRequesterModifierKt onProgress(FocusRequesterModifierKt focusRequesterModifierKt, List<component14> list) {
                return AndroidViewHolder.this.insetToLayoutPosition(focusRequesterModifierKt);
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
            public component15 onStart(component14 component14Var, component15 component15Var) {
                return AndroidViewHolder.this.insetBounds(component15Var);
            }

            {
                super(1);
            }
        });
        accessgetCancelcp.write(this, this);
        this.update = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3930invoke() {
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3930invoke();
                return createFromParcel.INSTANCE;
            }
        };
        this.reset = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$reset$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3927invoke() {
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3927invoke();
                return createFromParcel.INSTANCE;
            }
        };
        this.release = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$release$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3926invoke() {
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3926invoke();
                return createFromParcel.INSTANCE;
            }
        };
        Modifier.Companion companion = Modifier.Companion;
        this.modifier = companion;
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.position = new int[2];
        this.size = IntSize.Companion.m3849getZeroYbymL2g();
        this.runUpdate = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3929invoke() {
                if (this.this$0.hasUpdateBlock && this.this$0.isAttachedToWindow()) {
                    ViewParent parent = this.this$0.getView().getParent();
                    AndroidViewHolder androidViewHolder = this.this$0;
                    if (parent == androidViewHolder) {
                        OwnerSnapshotObserver snapshotObserver = androidViewHolder.getSnapshotObserver();
                        snapshotObserver.observer.serializer(this.this$0, AndroidViewHolder.OnCommitAffectingUpdate, this.this$0.getUpdate());
                    }
                }
            }

            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3929invoke();
                return createFromParcel.INSTANCE;
            }
        };
        this.runInvalidate = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3928invoke() {
                this.this$0.getLayoutNode().invalidateLayer$ui();
            }

            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3928invoke();
                return createFromParcel.INSTANCE;
            }
        };
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new FocusPropertiesImplonEnter1();
        Object[] objArr = 0 == true ? 1 : 0;
        final LayoutNode layoutNode = new LayoutNode(false, objArr, 3, null);
        layoutNode.setInteropViewFactoryHolder$ui(this);
        final Modifier modifierThen = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(PointerInteropFilter_androidKt.pointerInteropFilter(SemanticsModifierKt.semantics(NestedScrollModifierKt.nestedScroll(companion, AndroidViewHolder_androidKt.NoOpScrollConnection, nestedScrollDispatcher), true, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return createFromParcel.INSTANCE;
            }
        }), this), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(DrawScope drawScope) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                LayoutNode layoutNode2 = layoutNode;
                AndroidViewHolder androidViewHolder2 = this;
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                if (androidViewHolder.getView().getVisibility() != 8) {
                    androidViewHolder.isDrawing = true;
                    Owner owner$ui = layoutNode2.getOwner$ui();
                    AndroidComposeView androidComposeView = owner$ui instanceof AndroidComposeView ? (AndroidComposeView) owner$ui : null;
                    if (androidComposeView != null) {
                        androidComposeView.drawAndroidView(androidViewHolder2, AndroidCanvas_androidKt.getNativeCanvas(canvas));
                    }
                    androidViewHolder.isDrawing = false;
                }
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return createFromParcel.INSTANCE;
            }
        }), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(LayoutCoordinates layoutCoordinates) {
                WindowInsets windowInsetsIconCompatParcelizer;
                AndroidViewHolder_androidKt.layoutAccordingTo(this.$this_run, layoutNode);
                this.$this_run.owner.onInteropViewLayoutChange(this.$this_run);
                int i2 = this.$this_run.position[0];
                int i3 = this.$this_run.position[1];
                this.$this_run.getView().getLocationOnScreen(this.$this_run.position);
                long j = this.$this_run.size;
                this.$this_run.size = layoutCoordinates.mo2217getSizeYbymL2g();
                FocusRequesterModifierKt focusRequesterModifierKt = this.$this_run.insets;
                if (focusRequesterModifierKt != null) {
                    if ((i2 == this.$this_run.position[0] && i3 == this.$this_run.position[1] && IntSize.m3842equalsimpl0(j, this.$this_run.size)) || (windowInsetsIconCompatParcelizer = this.$this_run.insetToLayoutPosition(focusRequesterModifierKt).IconCompatParcelizer()) == null) {
                        return;
                    }
                    this.$this_run.getView().dispatchApplyWindowInsets(windowInsetsIconCompatParcelizer);
                }
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutCoordinates) obj);
                return createFromParcel.INSTANCE;
            }
        }).then(new BringIntoViewElement(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$4
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj);
                return createFromParcel.INSTANCE;
            }

            {
                super(1);
            }

            public final void invoke(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
                this.$this_run.bringIntoViewRequester = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            }
        }));
        layoutNode.setCompositeKeyHash(i);
        layoutNode.setModifier(this.modifier.then(modifierThen));
        this.onModifierChanged = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(Modifier modifier) {
                layoutNode.setModifier(modifier.then(modifierThen));
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Modifier) obj);
                return createFromParcel.INSTANCE;
            }
        };
        layoutNode.setDensity(this.density);
        this.onDensityChanged = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Density) obj);
                return createFromParcel.INSTANCE;
            }

            {
                super(1);
            }

            public final void invoke(Density density) {
                layoutNode.setDensity(density);
            }
        };
        layoutNode.setOnAttach$ui(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(Owner owner2) {
                AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.addAndroidView(this.$this_run, layoutNode);
                }
                ViewParent parent = this.$this_run.getView().getParent();
                AndroidViewHolder androidViewHolder = this.$this_run;
                if (parent != androidViewHolder) {
                    androidViewHolder.addView(androidViewHolder.getView());
                }
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Owner) obj);
                return createFromParcel.INSTANCE;
            }
        });
        layoutNode.setOnDetach$ui(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            {
                super(1);
            }

            public final void invoke(Owner owner2) {
                if (ComposeUiFlags.isViewFocusFixEnabled && this.$this_run.hasFocus()) {
                    owner2.getFocusOwner().clearFocus(true);
                }
                AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.removeAndroidView(this.$this_run);
                }
                this.$this_run.removeAllViewsInLayout();
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Owner) obj);
                return createFromParcel.INSTANCE;
            }
        });
        layoutNode.setMeasurePolicy(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                return intrinsicHeight(i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                return intrinsicWidth(i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                return intrinsicHeight(i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                return intrinsicWidth(i2);
            }

            private final int intrinsicHeight(int i2) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                layoutParams.getClass();
                androidViewHolder.measure(androidViewHolder.obtainMeasureSpec(0, i2, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return this.$this_run.getMeasuredHeight();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                if (this.$this_run.getChildCount() == 0) {
                    return MeasureScope.layout$default(measureScope, Constraints.m3628getMinWidthimpl(j), Constraints.m3627getMinHeightimpl(j), null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
                        public final void invoke(Placeable.PlacementScope placementScope) {
                        }

                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return createFromParcel.INSTANCE;
                        }
                    }, 4, null);
                }
                if (Constraints.m3628getMinWidthimpl(j) != 0) {
                    this.$this_run.getChildAt(0).setMinimumWidth(Constraints.m3628getMinWidthimpl(j));
                }
                if (Constraints.m3627getMinHeightimpl(j) != 0) {
                    this.$this_run.getChildAt(0).setMinimumHeight(Constraints.m3627getMinHeightimpl(j));
                }
                AndroidViewHolder androidViewHolder = this.$this_run;
                int iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(j);
                int iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(j);
                ViewGroup.LayoutParams layoutParams = this.$this_run.getLayoutParams();
                layoutParams.getClass();
                int iObtainMeasureSpec = androidViewHolder.obtainMeasureSpec(iM3628getMinWidthimpl, iM3626getMaxWidthimpl, layoutParams.width);
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                int iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(j);
                int iM3625getMaxHeightimpl = Constraints.m3625getMaxHeightimpl(j);
                ViewGroup.LayoutParams layoutParams2 = this.$this_run.getLayoutParams();
                layoutParams2.getClass();
                androidViewHolder.measure(iObtainMeasureSpec, androidViewHolder2.obtainMeasureSpec(iM3627getMinHeightimpl, iM3625getMaxHeightimpl, layoutParams2.height));
                int measuredWidth = this.$this_run.getMeasuredWidth();
                int measuredHeight = this.$this_run.getMeasuredHeight();
                final AndroidViewHolder androidViewHolder3 = this.$this_run;
                final LayoutNode layoutNode2 = layoutNode;
                return MeasureScope.layout$default(measureScope, measuredWidth, measuredHeight, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return createFromParcel.INSTANCE;
                    }

                    public final void invoke(Placeable.PlacementScope placementScope) {
                        AndroidViewHolder_androidKt.layoutAccordingTo(androidViewHolder3, layoutNode2);
                    }
                }, 4, null);
            }

            private final int intrinsicWidth(int i2) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                layoutParams.getClass();
                androidViewHolder.measure(iMakeMeasureSpec, androidViewHolder2.obtainMeasureSpec(0, i2, layoutParams.height));
                return this.$this_run.getMeasuredWidth();
            }
        });
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FocusRequesterModifierKt insetToLayoutPosition(FocusRequesterModifierKt focusRequesterModifierKt) {
        WindowInsetsCompat$Impl windowInsetsCompat$Impl = focusRequesterModifierKt.IconCompatParcelizer;
        setRight insets = windowInsetsCompat$Impl.getInsets(-1);
        setRight setright = setRight.IconCompatParcelizer;
        if (insets.equals(setright) && windowInsetsCompat$Impl.getInsetsIgnoringVisibility(-9).equals(setright) && windowInsetsCompat$Impl.getDisplayCutout() == null) {
            return focusRequesterModifierKt;
        }
        NodeCoordinator innerCoordinator$ui = this.layoutNode.getInnerCoordinator$ui();
        if (innerCoordinator$ui.isAttached()) {
            long jM3818roundk4lQ0M = IntOffsetKt.m3818roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui));
            int iM3801getXimpl = IntOffset.m3801getXimpl(jM3818roundk4lQ0M);
            if (iM3801getXimpl < 0) {
                iM3801getXimpl = 0;
            }
            int iM3802getYimpl = IntOffset.m3802getYimpl(jM3818roundk4lQ0M);
            if (iM3802getYimpl < 0) {
                iM3802getYimpl = 0;
            }
            long jMo2217getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui).mo2217getSizeYbymL2g();
            int i = (int) (jMo2217getSizeYbymL2g >> 32);
            int i2 = (int) (jMo2217getSizeYbymL2g & 4294967295L);
            long jMo2217getSizeYbymL2g2 = innerCoordinator$ui.mo2217getSizeYbymL2g();
            long jM3818roundk4lQ0M2 = IntOffsetKt.m3818roundk4lQ0M(innerCoordinator$ui.mo2220localToRootMKHz9U(Offset.m469constructorimpl((((long) Float.floatToRawIntBits((int) (jMo2217getSizeYbymL2g2 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (jMo2217getSizeYbymL2g2 >> 32))) << 32))));
            int iM3801getXimpl2 = i - IntOffset.m3801getXimpl(jM3818roundk4lQ0M2);
            if (iM3801getXimpl2 < 0) {
                iM3801getXimpl2 = 0;
            }
            int iM3802getYimpl2 = i2 - IntOffset.m3802getYimpl(jM3818roundk4lQ0M2);
            int i3 = iM3802getYimpl2 < 0 ? 0 : iM3802getYimpl2;
            if (iM3801getXimpl != 0 || iM3802getYimpl != 0 || iM3801getXimpl2 != 0 || i3 != 0) {
                return focusRequesterModifierKt.IconCompatParcelizer.inset(iM3801getXimpl, iM3802getYimpl, iM3801getXimpl2, i3);
            }
        }
        return focusRequesterModifierKt;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @onItemDismisslambda0
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        invalidateOrDefer();
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidateOrDefer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().clear$ui(this);
    }

    public final void setUpdate(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.update = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final component15 insetBounds(component15 component15Var) {
        NodeCoordinator innerCoordinator$ui = this.layoutNode.getInnerCoordinator$ui();
        if (innerCoordinator$ui.isAttached()) {
            long jM3818roundk4lQ0M = IntOffsetKt.m3818roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui));
            int iM3801getXimpl = IntOffset.m3801getXimpl(jM3818roundk4lQ0M);
            int i = iM3801getXimpl < 0 ? 0 : iM3801getXimpl;
            int iM3802getYimpl = IntOffset.m3802getYimpl(jM3818roundk4lQ0M);
            int i2 = iM3802getYimpl < 0 ? 0 : iM3802getYimpl;
            long jMo2217getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui).mo2217getSizeYbymL2g();
            int i3 = (int) (jMo2217getSizeYbymL2g >> 32);
            int i4 = (int) (jMo2217getSizeYbymL2g & 4294967295L);
            long jMo2217getSizeYbymL2g2 = innerCoordinator$ui.mo2217getSizeYbymL2g();
            long jM3818roundk4lQ0M2 = IntOffsetKt.m3818roundk4lQ0M(innerCoordinator$ui.mo2220localToRootMKHz9U(Offset.m469constructorimpl((((long) Float.floatToRawIntBits((int) (jMo2217getSizeYbymL2g2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jMo2217getSizeYbymL2g2 & 4294967295L))) & 4294967295L))));
            int iM3801getXimpl2 = i3 - IntOffset.m3801getXimpl(jM3818roundk4lQ0M2);
            int i5 = iM3801getXimpl2 < 0 ? 0 : iM3801getXimpl2;
            int iM3802getYimpl2 = i4 - IntOffset.m3802getYimpl(jM3818roundk4lQ0M2);
            int i6 = iM3802getYimpl2 < 0 ? 0 : iM3802getYimpl2;
            if (i != 0 || i2 != 0 || i5 != 0 || i6 != 0) {
                int i7 = i;
                int i8 = i2;
                int i9 = i5;
                int i10 = i6;
                return new component15(inset(component15Var.RemoteActionCompatParcelizer, i7, i8, i9, i10), inset(component15Var.read, i7, i8, i9, i10));
            }
        }
        return component15Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i = iArr[0];
        int i2 = iArr[1];
        int width = getWidth();
        int i3 = this.location[1];
        region.op(i, i2, width + i, getHeight() + i3, Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final void invalidateOrDefer() {
        if (!this.isDrawing) {
            this.layoutNode.invalidateLayer$ui();
        } else {
            this.view.postOnAnimation(new AndroidViewHolder$$ExternalSyntheticLambda0(0, this.runInvalidate));
        }
    }

    public final void setDensity(Density density) {
        if (density != this.density) {
            this.density = density;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.onDensityChanged;
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(density);
            }
        }
    }

    public final void setLifecycleOwner(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        if (accessisrendernodecompatiblecp != this.lifecycleOwner) {
            this.lifecycleOwner = accessisrendernodecompatiblecp;
            setTag(R.id.view_tree_lifecycle_owner, accessisrendernodecompatiblecp);
        }
    }

    public final void setModifier(Modifier modifier) {
        if (modifier != this.modifier) {
            this.modifier = modifier;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.onModifierChanged;
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(modifier);
            }
        }
    }

    public final void setSavedStateRegistryOwner(getTransparent0d7_KjU gettransparent0d7_kju) {
        if (gettransparent0d7_kju != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = gettransparent0d7_kju;
            setTag(R.id.view_tree_saved_state_registry_owner, gettransparent0d7_kju);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.view.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // o.FocusPropertiesElement
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        FocusPropertiesImplonEnter1 focusPropertiesImplonEnter1 = this.nestedScrollingParentHelper;
        if (i2 == 1) {
            focusPropertiesImplonEnter1.RemoteActionCompatParcelizer = i;
        } else {
            focusPropertiesImplonEnter1.serializer = i;
        }
    }

    @Override // o.FocusPropertiesElement
    public void onStopNestedScroll(View view, int i) {
        FocusPropertiesImplonEnter1 focusPropertiesImplonEnter1 = this.nestedScrollingParentHelper;
        if (i == 1) {
            focusPropertiesImplonEnter1.RemoteActionCompatParcelizer = 0;
        } else {
            focusPropertiesImplonEnter1.serializer = 0;
        }
    }

    public final void remeasure() {
        int i;
        int i2 = this.lastWidthMeasureSpec;
        if (i2 == Integer.MIN_VALUE || (i = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i2, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.bringIntoViewRequester;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm == null) {
            return true;
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(rect != null ? RectHelper_androidKt.toComposeRect(rect) : null);
        return true;
    }

    private final setRight inset(setRight setright, int i, int i2, int i3, int i4) {
        int i5 = setright.RemoteActionCompatParcelizer - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = setright.write - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = setright.read - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = setright.serializer - i4;
        return setRight.IconCompatParcelizer(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    @Override // o.FocusPropertiesElement
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(i);
            long jM1922dispatchPreScrollOzD1aCk = nestedScrollDispatcher.m1922dispatchPreScrollOzD1aCk(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(AndroidViewHolder_androidKt.toComposeOffset(i2))) & 4294967295L) | (((long) Float.floatToRawIntBits(composeOffset)) << 32)), AndroidViewHolder_androidKt.toNestedScrollSource(i3));
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM1922dispatchPreScrollOzD1aCk >> 32)));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM1922dispatchPreScrollOzD1aCk & 4294967295L)));
        }
    }

    @Override // o.getScope
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(i);
            long jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(AndroidViewHolder_androidKt.toComposeOffset(i2))) & 4294967295L) | (((long) Float.floatToRawIntBits(composeOffset)) << 32));
            float composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(i3);
            long jM1920dispatchPostScrollDzOQY0M = nestedScrollDispatcher.m1920dispatchPostScrollDzOQY0M(jM469constructorimpl, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(AndroidViewHolder_androidKt.toComposeOffset(i4))) & 4294967295L) | (((long) Float.floatToRawIntBits(composeOffset2)) << 32)), AndroidViewHolder_androidKt.toNestedScrollSource(i5));
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM1920dispatchPostScrollDzOQY0M >> 32)));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM1920dispatchPostScrollDzOQY0M & 4294967295L)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            InlineClassHelperKt.throwIllegalStateException("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.owner.getSnapshotObserver();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt.RemoteActionCompatParcelizer(this.dispatcher.getCoroutineScope(), null, null, new AnonymousClass1(z, this, VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(f), AndroidViewHolder_androidKt.toComposeVelocity(f2)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt.RemoteActionCompatParcelizer(this.dispatcher.getCoroutineScope(), null, null, new C00691(VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(f), AndroidViewHolder_androidKt.toComposeVelocity(f2)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.onRequestDisallowInterceptTouchEvent;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int obtainMeasureSpec(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(RangesKt.RemoteActionCompatParcelizer(i3, i, i2), 1073741824);
        }
        if (i3 == -2 && i2 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        }
        if (i3 == -1 && i2 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @Override // o.FocusPropertiesElement
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(i);
            long jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(AndroidViewHolder_androidKt.toComposeOffset(i2))) & 4294967295L) | (((long) Float.floatToRawIntBits(composeOffset)) << 32));
            float composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(i3);
            nestedScrollDispatcher.m1920dispatchPostScrollDzOQY0M(jM469constructorimpl, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(AndroidViewHolder_androidKt.toComposeOffset(i4))) & 4294967295L) | (((long) Float.floatToRawIntBits(composeOffset2)) << 32)), AndroidViewHolder_androidKt.toNestedScrollSource(i5));
        }
    }
}
