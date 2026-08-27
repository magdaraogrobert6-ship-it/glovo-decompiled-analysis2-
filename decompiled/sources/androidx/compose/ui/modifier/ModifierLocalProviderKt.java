package androidx.compose.ui.modifier;

import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import o.createFromParcel;
import o.onViewAttachedToWindow;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class ModifierLocalProviderKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.ui.modifier.ModifierLocalProviderKt$modifierLocalProvider$1, reason: invalid class name */
    public static final class AnonymousClass1<T> extends InspectorValueInfo implements ModifierLocalProvider<T> {
        private final ProvidableModifierLocal<T> key;
        private final onViewAttachedToWindow value$delegate;

        @Override // androidx.compose.ui.modifier.ModifierLocalProvider
        public ProvidableModifierLocal<T> getKey() {
            return this.key;
        }

        @Override // androidx.compose.ui.modifier.ModifierLocalProvider
        public T getValue() {
            return (T) this.value$delegate.getValue();
        }

        public AnonymousClass1(ProvidableModifierLocal<T> providableModifierLocal, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            super(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            this.key = providableModifierLocal;
            this.value$delegate = CompositionKt.serializer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }

    public static final <T> Modifier modifierLocalProvider(Modifier modifier, final ProvidableModifierLocal<T> providableModifierLocal, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return modifier.then(new AnonymousClass1(providableModifierLocal, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, InspectableValueKt.isDebugInspectorInfoEnabled() ? new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.modifier.ModifierLocalProviderKt$modifierLocalProvider$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("modifierLocalProvider");
                inspectorInfo.getProperties().set("key", providableModifierLocal);
                inspectorInfo.getProperties().set("value", r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return createFromParcel.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
