package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class CacheTextLayoutInput {
    public static final int $stable = 0;
    private final TextLayoutInput textLayoutInput;

    public final TextLayoutInput getTextLayoutInput() {
        return this.textLayoutInput;
    }

    public int hashCode() {
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        int iHashCode = textLayoutInput.getText().hashCode();
        int iHashCodeLayoutAffectingAttributes$ui_text = textLayoutInput.getStyle().hashCodeLayoutAffectingAttributes$ui_text();
        int iHashCode2 = textLayoutInput.getPlaceholders().hashCode();
        int maxLines = textLayoutInput.getMaxLines();
        int iHashCode3 = Boolean.hashCode(textLayoutInput.getSoftWrap());
        int iM3560hashCodeimpl = TextOverflow.m3560hashCodeimpl(textLayoutInput.m3043getOverflowgIe3tQ8());
        int iHashCode4 = textLayoutInput.getDensity().hashCode();
        int iHashCode5 = textLayoutInput.getLayoutDirection().hashCode();
        return Constraints.m3629hashCodeimpl(textLayoutInput.m3042getConstraintsmsEJaDk()) + ((textLayoutInput.getFontFamilyResolver().hashCode() + ((iHashCode5 + ((iHashCode4 + ((iM3560hashCodeimpl + ((iHashCode3 + ((maxLines + ((iHashCode2 + ((iHashCodeLayoutAffectingAttributes$ui_text + (iHashCode * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public CacheTextLayoutInput(TextLayoutInput textLayoutInput) {
        this.textLayoutInput = textLayoutInput;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheTextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        CacheTextLayoutInput cacheTextLayoutInput = (CacheTextLayoutInput) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textLayoutInput.getText(), cacheTextLayoutInput.textLayoutInput.getText()}, getCieXyz.write())).booleanValue() || !textLayoutInput.getStyle().hasSameLayoutAffectingAttributes(cacheTextLayoutInput.textLayoutInput.getStyle())) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textLayoutInput.getPlaceholders(), cacheTextLayoutInput.textLayoutInput.getPlaceholders()}, getCieXyz.write())).booleanValue() || textLayoutInput.getMaxLines() != cacheTextLayoutInput.textLayoutInput.getMaxLines() || textLayoutInput.getSoftWrap() != cacheTextLayoutInput.textLayoutInput.getSoftWrap() || !TextOverflow.m3559equalsimpl0(textLayoutInput.m3043getOverflowgIe3tQ8(), cacheTextLayoutInput.textLayoutInput.m3043getOverflowgIe3tQ8())) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textLayoutInput.getDensity(), cacheTextLayoutInput.textLayoutInput.getDensity()}, getCieXyz.write())).booleanValue() && textLayoutInput.getLayoutDirection() == cacheTextLayoutInput.textLayoutInput.getLayoutDirection() && textLayoutInput.getFontFamilyResolver() == cacheTextLayoutInput.textLayoutInput.getFontFamilyResolver() && Constraints.m3619equalsimpl0(textLayoutInput.m3042getConstraintsmsEJaDk(), cacheTextLayoutInput.textLayoutInput.m3042getConstraintsmsEJaDk());
    }
}
