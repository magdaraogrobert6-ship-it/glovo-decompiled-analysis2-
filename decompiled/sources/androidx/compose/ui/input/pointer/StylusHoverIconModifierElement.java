package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class StylusHoverIconModifierElement extends ModifierNodeElement<StylusHoverIconModifierNode> {
    public static final int $stable = 0;
    private final PointerIcon icon;
    private final boolean overrideDescendants;
    private final DpTouchBoundsExpansion touchBoundsExpansion;

    public final PointerIcon component1() {
        return this.icon;
    }

    public final boolean component2() {
        return this.overrideDescendants;
    }

    public final DpTouchBoundsExpansion component3() {
        return this.touchBoundsExpansion;
    }

    public final PointerIcon getIcon() {
        return this.icon;
    }

    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    public final DpTouchBoundsExpansion getTouchBoundsExpansion() {
        return this.touchBoundsExpansion;
    }

    public final StylusHoverIconModifierElement copy(PointerIcon pointerIcon, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        return new StylusHoverIconModifierElement(pointerIcon, z, dpTouchBoundsExpansion);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public StylusHoverIconModifierNode create() {
        return new StylusHoverIconModifierNode(this.icon, this.overrideDescendants, this.touchBoundsExpansion);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.overrideDescendants);
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.touchBoundsExpansion;
        return iM + (dpTouchBoundsExpansion == null ? 0 : dpTouchBoundsExpansion.hashCode());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(StylusHoverIconModifierNode stylusHoverIconModifierNode) {
        stylusHoverIconModifierNode.setIcon(this.icon);
        stylusHoverIconModifierNode.setOverrideDescendants(this.overrideDescendants);
        stylusHoverIconModifierNode.setDpTouchBoundsExpansion(this.touchBoundsExpansion);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("stylusHoverIcon");
        inspectorInfo.getProperties().set("icon", this.icon);
        af$$ExternalSyntheticOutline1.m(this.overrideDescendants, inspectorInfo.getProperties(), "overrideDescendants", inspectorInfo).set("touchBoundsExpansion", this.touchBoundsExpansion);
    }

    public static /* synthetic */ StylusHoverIconModifierElement copy$default(StylusHoverIconModifierElement stylusHoverIconModifierElement, PointerIcon pointerIcon, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerIcon = stylusHoverIconModifierElement.icon;
        }
        if ((i & 2) != 0) {
            z = stylusHoverIconModifierElement.overrideDescendants;
        }
        if ((i & 4) != 0) {
            dpTouchBoundsExpansion = stylusHoverIconModifierElement.touchBoundsExpansion;
        }
        return stylusHoverIconModifierElement.copy(pointerIcon, z, dpTouchBoundsExpansion);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.icon, stylusHoverIconModifierElement.icon}, getCieXyz.write())).booleanValue() || this.overrideDescendants != stylusHoverIconModifierElement.overrideDescendants) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.touchBoundsExpansion, stylusHoverIconModifierElement.touchBoundsExpansion}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.icon + ", overrideDescendants=" + this.overrideDescendants + ", touchBoundsExpansion=" + this.touchBoundsExpansion + ')';
    }

    public /* synthetic */ StylusHoverIconModifierElement(PointerIcon pointerIcon, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pointerIcon, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : dpTouchBoundsExpansion);
    }

    public StylusHoverIconModifierElement(PointerIcon pointerIcon, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.icon = pointerIcon;
        this.overrideDescendants = z;
        this.touchBoundsExpansion = dpTouchBoundsExpansion;
    }
}
