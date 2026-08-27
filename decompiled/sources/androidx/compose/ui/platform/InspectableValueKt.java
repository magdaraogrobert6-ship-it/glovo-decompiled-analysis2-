package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import o.createFromParcel;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class InspectableValueKt {
    private static final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM NoInspectorInfo = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.InspectableValueKt$NoInspectorInfo$1
        public final void invoke(InspectorInfo inspectorInfo) {
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InspectorInfo) obj);
            return createFromParcel.INSTANCE;
        }
    };
    private static boolean isDebugInspectorInfoEnabled;

    public static final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getNoInspectorInfo() {
        return NoInspectorInfo;
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return isDebugInspectorInfoEnabled;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z) {
        isDebugInspectorInfoEnabled = z;
    }

    @onItemDismisslambda0
    public static final Modifier inspectable(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        return inspectableWrapper(modifier, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Modifier) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(Modifier.Companion));
    }

    public static final Modifier inspectableWrapper(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier2) {
        InspectableModifier inspectableModifier = new InspectableModifier(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        return modifier.then(inspectableModifier).then(modifier2).then(inspectableModifier.getEnd());
    }

    public static final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM debugInspectorInfo(final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return isDebugInspectorInfoEnabled() ? new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.InspectableValueKt.debugInspectorInfo.1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return createFromParcel.INSTANCE;
            }

            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(inspectorInfo);
            }
        } : getNoInspectorInfo();
    }
}
