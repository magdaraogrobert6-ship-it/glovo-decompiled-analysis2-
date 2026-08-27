package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import o.Surfaceo_FOJdg;
import o.TooltipKtTooltipBoxwrappedContent1;
import o.getBitmapFromCache;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
final class PaddingElement extends ModifierNodeElement<Surfaceo_FOJdg> {
    public final float IconCompatParcelizer;
    public final float MediaSessionCompatQueueItem;
    public final float RemoteActionCompatParcelizer;
    public final boolean read = true;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final float write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        Surfaceo_FOJdg surfaceo_FOJdg = new Surfaceo_FOJdg();
        surfaceo_FOJdg.IconCompatParcelizer = this.write;
        surfaceo_FOJdg.write = this.MediaSessionCompatQueueItem;
        surfaceo_FOJdg.serializer = this.RemoteActionCompatParcelizer;
        surfaceo_FOJdg.read = this.IconCompatParcelizer;
        surfaceo_FOJdg.RemoteActionCompatParcelizer = this.read;
        return surfaceo_FOJdg;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Boolean.hashCode(this.read) + getBitmapFromCache.serializer(this.IconCompatParcelizer, getBitmapFromCache.serializer(this.RemoteActionCompatParcelizer, getBitmapFromCache.serializer(this.MediaSessionCompatQueueItem, Dp.m3679hashCodeimpl(this.write) * 31, 31), 31), 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        this.serializer.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        Surfaceo_FOJdg surfaceo_FOJdg = (Surfaceo_FOJdg) node;
        surfaceo_FOJdg.IconCompatParcelizer = this.write;
        surfaceo_FOJdg.write = this.MediaSessionCompatQueueItem;
        surfaceo_FOJdg.serializer = this.RemoteActionCompatParcelizer;
        surfaceo_FOJdg.read = this.IconCompatParcelizer;
        surfaceo_FOJdg.RemoteActionCompatParcelizer = this.read;
    }

    public PaddingElement(float f, float f2, float f3, float f4, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.write = f;
        this.MediaSessionCompatQueueItem = f2;
        this.RemoteActionCompatParcelizer = f3;
        this.IconCompatParcelizer = f4;
        boolean z = true;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        boolean z2 = f >= 0.0f || Float.isNaN(f);
        boolean z3 = f2 >= 0.0f || Float.isNaN(f2);
        boolean z4 = f3 >= 0.0f || Float.isNaN(f3);
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!(z2 & z3 & z4) || !z) {
            TooltipKtTooltipBoxwrappedContent1.read("Padding must be non-negative");
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && Dp.m3678equalsimpl0(this.write, paddingElement.write) && Dp.m3678equalsimpl0(this.MediaSessionCompatQueueItem, paddingElement.MediaSessionCompatQueueItem) && Dp.m3678equalsimpl0(this.RemoteActionCompatParcelizer, paddingElement.RemoteActionCompatParcelizer) && Dp.m3678equalsimpl0(this.IconCompatParcelizer, paddingElement.IconCompatParcelizer) && this.read == paddingElement.read;
    }
}
