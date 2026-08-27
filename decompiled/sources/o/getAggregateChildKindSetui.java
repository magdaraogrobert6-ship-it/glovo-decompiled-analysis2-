package o;

/* JADX INFO: loaded from: classes.dex */
public final class getAggregateChildKindSetui {
    public final AlignmentCompanion IconCompatParcelizer;
    public final getCoroutineScope RemoteActionCompatParcelizer;
    public final boolean serializer;
    public final long write;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iM479hashCodeimpl = androidx.compose.ui.geometry.Offset.m479hashCodeimpl(this.write);
        return Boolean.hashCode(this.serializer) + ((this.RemoteActionCompatParcelizer.hashCode() + ((iM479hashCodeimpl + (iHashCode * 31)) * 31)) * 31);
    }

    public getAggregateChildKindSetui(AlignmentCompanion alignmentCompanion, long j, getCoroutineScope getcoroutinescope, boolean z) {
        this.IconCompatParcelizer = alignmentCompanion;
        this.write = j;
        this.RemoteActionCompatParcelizer = getcoroutinescope;
        this.serializer = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAggregateChildKindSetui)) {
            return false;
        }
        getAggregateChildKindSetui getaggregatechildkindsetui = (getAggregateChildKindSetui) obj;
        return this.IconCompatParcelizer == getaggregatechildkindsetui.IconCompatParcelizer && androidx.compose.ui.geometry.Offset.m474equalsimpl0(this.write, getaggregatechildkindsetui.write) && this.RemoteActionCompatParcelizer == getaggregatechildkindsetui.RemoteActionCompatParcelizer && this.serializer == getaggregatechildkindsetui.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", position=");
        sb.append((Object) androidx.compose.ui.geometry.Offset.m485toStringimpl(this.write));
        sb.append(", anchor=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", visible=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.serializer, ')');
    }
}
