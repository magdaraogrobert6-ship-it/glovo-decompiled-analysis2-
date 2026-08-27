package o;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes.dex */
public final class copyWithScrollDeltaWithoutRemeasure extends androidx.compose.ui.node.ModifierNodeElement<getOffsetBjo55l4> {
    public final float read;
    public final androidx.compose.ui.graphics.SolidColor serializer;
    public final androidx.compose.ui.graphics.Shape write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        return new getOffsetBjo55l4(this.read, this.serializer, this.write);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iM3679hashCodeimpl = androidx.compose.ui.unit.Dp.m3679hashCodeimpl(this.read);
        return this.write.hashCode() + ((this.serializer.hashCode() + (iM3679hashCodeimpl * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("border");
        inspectorInfo.getProperties().set("width", androidx.compose.ui.unit.Dp.m3671boximpl(this.read));
        androidx.compose.ui.graphics.SolidColor solidColor = this.serializer;
        if (solidColor != null) {
            inspectorInfo.getProperties().set(RemoteMessageConst.Notification.COLOR, androidx.compose.ui.graphics.Color.m712boximpl(solidColor.m1081getValue0d7_KjU()));
            inspectorInfo.setValue(androidx.compose.ui.graphics.Color.m712boximpl(solidColor.m1081getValue0d7_KjU()));
        } else {
            inspectorInfo.getProperties().set("brush", solidColor);
        }
        inspectorInfo.getProperties().set("shape", this.write);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        getOffsetBjo55l4 getoffsetbjo55l4 = (getOffsetBjo55l4) node;
        float f = getoffsetbjo55l4.serializer;
        androidx.compose.ui.draw.CacheDrawModifierNode cacheDrawModifierNode = getoffsetbjo55l4.RemoteActionCompatParcelizer;
        float f2 = this.read;
        if (!androidx.compose.ui.unit.Dp.m3678equalsimpl0(f, f2)) {
            getoffsetbjo55l4.serializer = f2;
            cacheDrawModifierNode.invalidateDrawCache();
        }
        androidx.compose.ui.graphics.Brush brush = getoffsetbjo55l4.write;
        androidx.compose.ui.graphics.SolidColor solidColor = this.serializer;
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{brush, solidColor}, iWrite3)).booleanValue()) {
            getoffsetbjo55l4.write = solidColor;
            cacheDrawModifierNode.invalidateDrawCache();
        }
        androidx.compose.ui.graphics.Shape shape = getoffsetbjo55l4.read;
        androidx.compose.ui.graphics.Shape shape2 = this.write;
        int iWrite4 = getCieXyz.write();
        int iWrite5 = getCieXyz.write();
        int iWrite6 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{shape, shape2}, iWrite6)).booleanValue()) {
            return;
        }
        getoffsetbjo55l4.read = shape2;
        cacheDrawModifierNode.invalidateDrawCache();
        androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(getoffsetbjo55l4);
    }

    public copyWithScrollDeltaWithoutRemeasure(float f, androidx.compose.ui.graphics.SolidColor solidColor, androidx.compose.ui.graphics.Shape shape) {
        this.read = f;
        this.serializer = solidColor;
        this.write = shape;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof copyWithScrollDeltaWithoutRemeasure)) {
            return false;
        }
        copyWithScrollDeltaWithoutRemeasure copywithscrolldeltawithoutremeasure = (copyWithScrollDeltaWithoutRemeasure) obj;
        if (!androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.read, copywithscrolldeltawithoutremeasure.read)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, copywithscrolldeltawithoutremeasure.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, copywithscrolldeltawithoutremeasure.write}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorderModifierNodeElement(width=");
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(this.read, ", brush=", sb);
        sb.append(this.serializer);
        sb.append(", shape=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
