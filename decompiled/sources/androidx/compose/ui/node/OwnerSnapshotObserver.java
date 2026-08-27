package androidx.compose.ui.node;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import java.util.Arrays;
import o.BlockInnerShadowElement;
import o.createFromParcel;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setSpread;

/* JADX INFO: loaded from: classes.dex */
public final class OwnerSnapshotObserver {
    public static final int $stable = 8;
    private final setSpread observer;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onCommitAffectingLookaheadMeasure = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1
        public final void invoke(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestLookaheadRemeasure$ui$default(layoutNode, false, false, false, 7, null);
            }
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LayoutNode) obj);
            return createFromParcel.INSTANCE;
        }
    };
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onCommitAffectingMeasure = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
        public final void invoke(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestRemeasure$ui$default(layoutNode, false, false, false, 7, null);
            }
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LayoutNode) obj);
            return createFromParcel.INSTANCE;
        }
    };
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onCommitAffectingSemantics = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingSemantics$1
        public final void invoke(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                layoutNode.invalidateSemantics$ui();
            }
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LayoutNode) obj);
            return createFromParcel.INSTANCE;
        }
    };
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onCommitAffectingLayout = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
        public final void invoke(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestRelayout$ui$default(layoutNode, false, 1, null);
            }
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LayoutNode) obj);
            return createFromParcel.INSTANCE;
        }
    };
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onCommitAffectingLayoutModifier = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
        public final void invoke(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestRelayout$ui$default(layoutNode, false, 1, null);
            }
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LayoutNode) obj);
            return createFromParcel.INSTANCE;
        }
    };
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onCommitAffectingLayoutModifierInLookahead = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1
        public final void invoke(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestLookaheadRelayout$ui$default(layoutNode, false, 1, null);
            }
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LayoutNode) obj);
            return createFromParcel.INSTANCE;
        }
    };
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onCommitAffectingLookahead = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookahead$1
        public final void invoke(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestLookaheadRelayout$ui$default(layoutNode, false, 1, null);
            }
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LayoutNode) obj);
            return createFromParcel.INSTANCE;
        }
    };

    public final void clear$ui(Object obj) {
        this.observer.RemoteActionCompatParcelizer(obj);
    }

    public final void clearInvalidObservations$ui() {
        setSpread setspread = this.observer;
        OwnerSnapshotObserver$clearInvalidObservations$1 ownerSnapshotObserver$clearInvalidObservations$1 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(Object obj) {
                obj.getClass();
                return Boolean.valueOf(!((OwnerScope) obj).isValidOwnerScope());
            }
        };
        synchronized (setspread.RatingCompat) {
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = setspread.RemoteActionCompatParcelizer;
            int i = oncreatevirtualviewtranslationrequests.read;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                Object[] objArr = oncreatevirtualviewtranslationrequests.write;
                if (i2 < i) {
                    BlockInnerShadowElement blockInnerShadowElement = (BlockInnerShadowElement) objArr[i2];
                    blockInnerShadowElement.read(ownerSnapshotObserver$clearInvalidObservations$1);
                    if (!blockInnerShadowElement.PlaybackStateCompat.write()) {
                        i3++;
                    } else if (i3 > 0) {
                        Object[] objArr2 = oncreatevirtualviewtranslationrequests.write;
                        objArr2[i2 - i3] = objArr2[i2];
                    }
                    i2++;
                } else {
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    oncreatevirtualviewtranslationrequests.read = i4;
                }
            }
        }
    }

    public final void startObserving$ui() {
        this.observer.read();
    }

    public final void stopObserving$ui() {
        OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 = this.observer.read;
        if (onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 != null) {
            onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.IconCompatParcelizer();
        }
        this.observer.serializer();
    }

    public final void observeLayoutModifierSnapshotReads$ui(LayoutNode layoutNode, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.observer.serializer(layoutNode, this.onCommitAffectingLayoutModifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public final void observeLayoutModifierSnapshotReadsAffectingLookahead$ui(LayoutNode layoutNode, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.observer.serializer(layoutNode, this.onCommitAffectingLayoutModifierInLookahead, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public final void observeLayoutSnapshotReads$ui(LayoutNode layoutNode, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.observer.serializer(layoutNode, this.onCommitAffectingLayout, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public final void observeLayoutSnapshotReadsAffectingLookahead$ui(LayoutNode layoutNode, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.observer.serializer(layoutNode, this.onCommitAffectingLookahead, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public final void observeMeasureSnapshotReads$ui(LayoutNode layoutNode, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.observer.serializer(layoutNode, this.onCommitAffectingMeasure, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public final void observeMeasureSnapshotReadsAffectingLookahead$ui(LayoutNode layoutNode, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.observer.serializer(layoutNode, this.onCommitAffectingLookaheadMeasure, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public final <T extends OwnerScope> void observeReads$ui(T t, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.observer.serializer(t, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public final void observeSemanticsReads$ui(LayoutNode layoutNode, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.observer.serializer(layoutNode, this.onCommitAffectingSemantics, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public OwnerSnapshotObserver(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.observer = new setSpread(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
