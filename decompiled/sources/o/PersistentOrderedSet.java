package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class PersistentOrderedSet {
    public static final androidx.compose.ui.Modifier RemoteActionCompatParcelizer(androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z2, androidx.compose.ui.semantics.Role role, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new ComposableLambdaImplinvoke1(z, mutableInteractionSourceImpl, z2, role, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }

    public static final androidx.compose.ui.Modifier serializer(androidx.compose.ui.Modifier.Companion companion, androidx.compose.ui.state.ToggleableState toggleableState, MediaQuery_androidKtobtainUiMediaScope41 mediaQuery_androidKtobtainUiMediaScope41, androidx.compose.ui.semantics.Role role, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        androidx.compose.ui.Modifier modifierComposed$default;
        if (mediaQuery_androidKtobtainUiMediaScope41 != null) {
            modifierComposed$default = new SnapshotStateListKt(toggleableState, null, mediaQuery_androidKtobtainUiMediaScope41, role, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        } else if (mediaQuery_androidKtobtainUiMediaScope41 == null) {
            modifierComposed$default = new SnapshotStateListKt(toggleableState, null, null, role, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        } else {
            modifierComposed$default = androidx.compose.ui.ComposedModifierKt.composed$default(androidx.compose.ui.Modifier.Companion, null, new SnapshotStateList(mediaQuery_androidKtobtainUiMediaScope41, toggleableState, role, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), 1, null);
        }
        return companion.then(modifierComposed$default);
    }
}
