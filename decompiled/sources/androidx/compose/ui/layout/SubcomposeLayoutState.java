package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntSize;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.createFromParcel;
import o.getBirthDateYear;
import o.getHandlerui;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class SubcomposeLayoutState {
    public static final int $stable = 8;
    private LayoutNodeSubcompositionsState _state;
    private final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 setCompositionContext;
    private final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 setMeasurePolicy;
    private final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 setRoot;
    private final SubcomposeSlotReusePolicy slotReusePolicy;

    public interface PausedPrecomposition {
        PrecomposedSlotHandle apply();

        void cancel();

        boolean isComplete();

        boolean resume(getHandlerui gethandlerui);
    }

    public interface PrecomposedSlotHandle {
        void dispose();

        default int getPlaceablesCount() {
            return 0;
        }

        /* JADX INFO: renamed from: premeasure-0kLqBqw */
        default void mo2238premeasure0kLqBqw(int i, long j) {
        }

        default void traverseDescendants(Object obj, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        }

        /* JADX INFO: renamed from: getSize-YEO4UFw */
        default long mo2237getSizeYEO4UFw(int i) {
            return IntSize.Companion.m3849getZeroYbymL2g();
        }
    }

    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getSetCompositionContext$ui() {
        return this.setCompositionContext;
    }

    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getSetMeasurePolicy$ui() {
        return this.setMeasurePolicy;
    }

    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getSetRoot$ui() {
        return this.setRoot;
    }

    public SubcomposeLayoutState(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.slotReusePolicy = subcomposeSlotReusePolicy;
        this.setRoot = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
            public final void invoke(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
                SubcomposeLayoutState subcomposeLayoutState2 = this.this$0;
                LayoutNodeSubcompositionsState subcompositionsState$ui = layoutNode.getSubcompositionsState$ui();
                if (subcompositionsState$ui == null) {
                    LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = new LayoutNodeSubcompositionsState(layoutNode, this.this$0.slotReusePolicy);
                    layoutNode.setSubcompositionsState$ui(layoutNodeSubcompositionsState);
                    subcompositionsState$ui = layoutNodeSubcompositionsState;
                }
                subcomposeLayoutState2._state = subcompositionsState$ui;
                this.this$0.getState().makeSureStateIsConsistent();
                this.this$0.getState().setSlotReusePolicy(this.this$0.slotReusePolicy);
            }

            {
                super(2);
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (SubcomposeLayoutState) obj2);
                return createFromParcel.INSTANCE;
            }
        };
        this.setCompositionContext = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (getBirthDateYear) obj2);
                return createFromParcel.INSTANCE;
            }

            {
                super(2);
            }

            public final void invoke(LayoutNode layoutNode, getBirthDateYear getbirthdateyear) {
                this.this$0.getState().setCompositionContext(getbirthdateyear);
            }
        };
        this.setMeasurePolicy = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1
            public final void invoke(LayoutNode layoutNode, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
                layoutNode.setMeasurePolicy(this.this$0.getState().createMeasurePolicy(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0));
            }

            {
                super(2);
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2);
                return createFromParcel.INSTANCE;
            }
        };
    }

    public final PausedPrecomposition createPausedPrecomposition(Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return getState().precomposePaused(obj, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public final void forceRecomposeChildren$ui() {
        getState().forceRecomposeChildren();
    }

    public final PrecomposedSlotHandle precompose(Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return getState().precompose(obj, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNodeSubcompositionsState getState() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this._state;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }

    public SubcomposeLayoutState() {
        this(NoOpSubcomposeSlotReusePolicy.INSTANCE);
    }

    @onItemDismisslambda0
    public SubcomposeLayoutState(int i) {
        this(SubcomposeLayoutKt.SubcomposeSlotReusePolicy(i));
    }
}
