package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class getComponentCountannotations extends androidx.compose.ui.node.ModifierNodeElement<getComponentCountimpl> {
    public final int RemoteActionCompatParcelizer;
    public final int read;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        getComponentCountimpl getcomponentcountimpl = new getComponentCountimpl();
        getcomponentcountimpl.read = this.read;
        getcomponentcountimpl.serializer = this.RemoteActionCompatParcelizer;
        return getcomponentcountimpl;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Integer.hashCode(this.RemoteActionCompatParcelizer) + (Integer.hashCode(this.read) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        getComponentCountimpl getcomponentcountimpl = (getComponentCountimpl) node;
        getcomponentcountimpl.getClass();
        getcomponentcountimpl.read = this.read;
        getcomponentcountimpl.serializer = this.RemoteActionCompatParcelizer;
    }

    public getComponentCountannotations(int i, int i2) {
        this.read = i;
        this.RemoteActionCompatParcelizer = i2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getComponentCountannotations)) {
            return false;
        }
        getComponentCountannotations getcomponentcountannotations = (getComponentCountannotations) obj;
        return this.read == getcomponentcountannotations.read && this.RemoteActionCompatParcelizer == getcomponentcountannotations.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline0.m(this.read, this.RemoteActionCompatParcelizer, "LottieAnimationSizeElement(width=", ", height=", ")");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.getClass();
        inspectorInfo.setName("Lottie Size");
        inspectorInfo.getProperties().set("width", Integer.valueOf(this.read));
        inspectorInfo.getProperties().set("height", Integer.valueOf(this.RemoteActionCompatParcelizer));
    }
}
