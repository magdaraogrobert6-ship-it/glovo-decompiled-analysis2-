package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.DpTouchBoundsExpansion;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class StylusHoverIconModifierNode extends HoverIconModifierNode {
    public static final int $stable = 8;
    private final String traverseKey;

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    /* JADX INFO: renamed from: isRelevantPointerType-uerMTgs */
    public boolean mo1975isRelevantPointerTypeuerMTgs(int i) {
        PointerType.Companion companion = PointerType.Companion;
        return PointerType.m2146equalsimpl0(i, companion.m2152getStylusT8wyACA()) || PointerType.m2146equalsimpl0(i, companion.m2150getEraserT8wyACA());
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public String getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    public void displayIcon(PointerIcon pointerIcon) {
        PointerIconService pointerIconService = getPointerIconService();
        if (pointerIconService != null) {
            pointerIconService.setStylusHoverIcon(pointerIcon);
        }
    }

    public /* synthetic */ StylusHoverIconModifierNode(PointerIcon pointerIcon, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pointerIcon, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : dpTouchBoundsExpansion);
    }

    public StylusHoverIconModifierNode(PointerIcon pointerIcon, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        super(pointerIcon, z, dpTouchBoundsExpansion);
        this.traverseKey = "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }
}
