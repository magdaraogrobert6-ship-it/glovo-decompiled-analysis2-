package o;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldMeasurePolicy extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.layout.SizeNode> {
    public final float IconCompatParcelizer;
    public final float MediaMetadataCompat;
    public final float RemoteActionCompatParcelizer;
    public final boolean read;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final float write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        androidx.compose.foundation.layout.SizeNode sizeNode = new androidx.compose.foundation.layout.SizeNode();
        sizeNode.IconCompatParcelizer = this.MediaMetadataCompat;
        sizeNode.RemoteActionCompatParcelizer = this.IconCompatParcelizer;
        sizeNode.write = this.write;
        sizeNode.serializer = this.RemoteActionCompatParcelizer;
        sizeNode.read = this.read;
        return sizeNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Boolean.hashCode(this.read) + getBitmapFromCache.serializer(this.RemoteActionCompatParcelizer, getBitmapFromCache.serializer(this.write, getBitmapFromCache.serializer(this.IconCompatParcelizer, androidx.compose.ui.unit.Dp.m3679hashCodeimpl(this.MediaMetadataCompat) * 31, 31), 31), 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        this.serializer.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        androidx.compose.foundation.layout.SizeNode sizeNode = (androidx.compose.foundation.layout.SizeNode) node;
        sizeNode.IconCompatParcelizer = this.MediaMetadataCompat;
        sizeNode.RemoteActionCompatParcelizer = this.IconCompatParcelizer;
        sizeNode.write = this.write;
        sizeNode.serializer = this.RemoteActionCompatParcelizer;
        sizeNode.read = this.read;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldMeasurePolicy)) {
            return false;
        }
        TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) obj;
        return androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.MediaMetadataCompat, textFieldMeasurePolicy.MediaMetadataCompat) && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.IconCompatParcelizer, textFieldMeasurePolicy.IconCompatParcelizer) && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.write, textFieldMeasurePolicy.write) && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.RemoteActionCompatParcelizer, textFieldMeasurePolicy.RemoteActionCompatParcelizer) && this.read == textFieldMeasurePolicy.read;
    }

    public /* synthetic */ TextFieldMeasurePolicy(float f, float f2, float f3, float f4, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        this((i & 1) != 0 ? androidx.compose.ui.unit.Dp.Companion.m3693getUnspecifiedD9Ej5fM() : f, (i & 2) != 0 ? androidx.compose.ui.unit.Dp.Companion.m3693getUnspecifiedD9Ej5fM() : f2, (i & 4) != 0 ? androidx.compose.ui.unit.Dp.Companion.m3693getUnspecifiedD9Ej5fM() : f3, (i & 8) != 0 ? androidx.compose.ui.unit.Dp.Companion.m3693getUnspecifiedD9Ej5fM() : f4, z, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public TextFieldMeasurePolicy(float f, float f2, float f3, float f4, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.MediaMetadataCompat = f;
        this.IconCompatParcelizer = f2;
        this.write = f3;
        this.RemoteActionCompatParcelizer = f4;
        this.read = z;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }
}
