package androidx.compose.ui.modifier;

import androidx.compose.ui.platform.InspectorValueInfo;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
final class ModifierLocalConsumerImpl extends InspectorValueInfo implements ModifierLocalConsumer {
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM consumer;

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getConsumer() {
        return this.consumer;
    }

    public int hashCode() {
        return this.consumer.hashCode();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        this.consumer.invoke(modifierLocalReadScope);
    }

    public ModifierLocalConsumerImpl(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        super(r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
        this.consumer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ModifierLocalConsumerImpl) && ((ModifierLocalConsumerImpl) obj).consumer == this.consumer;
    }
}
