package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import o.createFromParcel;
import o.getEmailAddress;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public interface ComposeUiNode {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 Constructor = LayoutNode.Companion.getConstructor$ui();
        private static final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 VirtualConstructor = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$VirtualConstructor$1
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final LayoutNode invoke() {
                return new LayoutNode(true, 0, 2, null);
            }
        };
        private static final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 SetModifier = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (Modifier) obj2);
                return createFromParcel.INSTANCE;
            }

            public final void invoke(ComposeUiNode composeUiNode, Modifier modifier) {
                composeUiNode.setModifier(modifier);
            }
        };
        private static final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 SetDensity = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetDensity$1
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (Density) obj2);
                return createFromParcel.INSTANCE;
            }

            public final void invoke(ComposeUiNode composeUiNode, Density density) {
                composeUiNode.setDensity(density);
            }
        };
        private static final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 SetResolvedCompositionLocals = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetResolvedCompositionLocals$1
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (getEmailAddress) obj2);
                return createFromParcel.INSTANCE;
            }

            public final void invoke(ComposeUiNode composeUiNode, getEmailAddress getemailaddress) {
                composeUiNode.setCompositionLocalMap(getemailaddress);
            }
        };
        private static final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 SetMeasurePolicy = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetMeasurePolicy$1
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (MeasurePolicy) obj2);
                return createFromParcel.INSTANCE;
            }

            public final void invoke(ComposeUiNode composeUiNode, MeasurePolicy measurePolicy) {
                composeUiNode.setMeasurePolicy(measurePolicy);
            }
        };
        private static final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 SetLayoutDirection = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (LayoutDirection) obj2);
                return createFromParcel.INSTANCE;
            }

            public final void invoke(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
                composeUiNode.setLayoutDirection(layoutDirection);
            }
        };
        private static final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 SetViewConfiguration = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetViewConfiguration$1
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (ViewConfiguration) obj2);
                return createFromParcel.INSTANCE;
            }

            public final void invoke(ComposeUiNode composeUiNode, ViewConfiguration viewConfiguration) {
                composeUiNode.setViewConfiguration(viewConfiguration);
            }
        };
        private static final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 SetCompositeKeyHash = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetCompositeKeyHash$1
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, ((Number) obj2).intValue());
                return createFromParcel.INSTANCE;
            }

            public final void invoke(ComposeUiNode composeUiNode, int i) {
                composeUiNode.setCompositeKeyHash(i);
            }
        };
        private static final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM ApplyOnDeactivatedNodeAssertion = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1
            public final void invoke(ComposeUiNode composeUiNode) {
                LayoutNode layoutNode = composeUiNode instanceof LayoutNode ? (LayoutNode) composeUiNode : null;
                if (layoutNode == null || !layoutNode.isDeactivated()) {
                    return;
                }
                InlineClassHelperKt.throwIllegalStateException("Apply is called on deactivated node " + composeUiNode);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ComposeUiNode) obj);
                return createFromParcel.INSTANCE;
            }
        };

        private Companion() {
        }

        public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getApplyOnDeactivatedNodeAssertion() {
            return ApplyOnDeactivatedNodeAssertion;
        }

        public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getConstructor() {
            return Constructor;
        }

        public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getSetCompositeKeyHash() {
            return SetCompositeKeyHash;
        }

        public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getSetDensity() {
            return SetDensity;
        }

        public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getSetLayoutDirection() {
            return SetLayoutDirection;
        }

        public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getSetMeasurePolicy() {
            return SetMeasurePolicy;
        }

        public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getSetModifier() {
            return SetModifier;
        }

        public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getSetResolvedCompositionLocals() {
            return SetResolvedCompositionLocals;
        }

        public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getSetViewConfiguration() {
            return SetViewConfiguration;
        }

        public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getVirtualConstructor() {
            return VirtualConstructor;
        }
    }

    int getCompositeKeyHash();

    getEmailAddress getCompositionLocalMap();

    Density getDensity();

    LayoutDirection getLayoutDirection();

    MeasurePolicy getMeasurePolicy();

    Modifier getModifier();

    ViewConfiguration getViewConfiguration();

    void setCompositeKeyHash(int i);

    void setCompositionLocalMap(getEmailAddress getemailaddress);

    void setDensity(Density density);

    void setLayoutDirection(LayoutDirection layoutDirection);

    void setMeasurePolicy(MeasurePolicy measurePolicy);

    void setModifier(Modifier modifier);

    void setViewConfiguration(ViewConfiguration viewConfiguration);
}
