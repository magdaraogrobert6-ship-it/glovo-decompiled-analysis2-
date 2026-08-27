package o;

/* JADX INFO: loaded from: classes.dex */
public final class getOnDraw implements androidx.compose.ui.layout.LayoutIdParentData {
    public final ClipKt IconCompatParcelizer;
    public final Object read;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    public final Object getLayoutId() {
        return this.read;
    }

    public final int hashCode() {
        return this.serializer.hashCode() + (this.IconCompatParcelizer.IconCompatParcelizer.hashCode() * 31);
    }

    public getOnDraw(ClipKt clipKt, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.IconCompatParcelizer = clipKt;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.read = clipKt.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof getOnDraw)) {
            return false;
        }
        getOnDraw getondraw = (getOnDraw) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer.IconCompatParcelizer, getondraw.IconCompatParcelizer.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && this.serializer == getondraw.serializer;
    }
}
