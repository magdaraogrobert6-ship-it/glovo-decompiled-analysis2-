package o;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class setDetachedListenerui extends androidx.compose.material.ripple.RippleNode {
    public setOwnerScopeui RemoteActionCompatParcelizer;
    public setUpdatedNodeAwaitingAttachForInvalidationui read;

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        setUpdatedNodeAwaitingAttachForInvalidationui setupdatednodeawaitingattachforinvalidationui = this.read;
        if (setupdatednodeawaitingattachforinvalidationui != null) {
            this.RemoteActionCompatParcelizer = null;
            androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
            androidx.compose.material.ripple.RippleHostMap rippleHostMap = setupdatednodeawaitingattachforinvalidationui.read;
            setOwnerScopeui setownerscopeui = (setOwnerScopeui) rippleHostMap.read.get(this);
            if (setownerscopeui != null) {
                setownerscopeui.RemoteActionCompatParcelizer();
                LinkedHashMap linkedHashMap = rippleHostMap.read;
                setOwnerScopeui setownerscopeui2 = (setOwnerScopeui) linkedHashMap.get(this);
                if (setownerscopeui2 != null) {
                }
                linkedHashMap.remove(this);
                setupdatednodeawaitingattachforinvalidationui.serializer.add(setownerscopeui);
            }
        }
    }

    public setDetachedListenerui(androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z, float f, UiMediaScopePointerPrecisionCompanion uiMediaScopePointerPrecisionCompanion, AndroidAutofillType_androidKt androidAutofillType_androidKt) {
        super(mutableInteractionSourceImpl, z, f, uiMediaScopePointerPrecisionCompanion, androidAutofillType_androidKt);
    }
}
