package o;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentCardsFragmentCompanion implements onApproachPlacementui, setSdkDataWipeEventSubscriber {
    public boolean IconCompatParcelizer;
    public final /* synthetic */ StringBuilder RemoteActionCompatParcelizer;

    @Override // o.onApproachPlacementui
    public void RemoteActionCompatParcelizer(notifyChildrenUsingLookaheadCoordinatesWhilePlacing notifychildrenusinglookaheadcoordinateswhileplacing, int i) {
        boolean z = this.IconCompatParcelizer;
        StringBuilder sb = this.RemoteActionCompatParcelizer;
        if (z) {
            this.IconCompatParcelizer = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    @Override // o.setSdkDataWipeEventSubscriber
    public void write(Object obj) {
        StringBuilder sb = this.RemoteActionCompatParcelizer;
        sb.append((String) obj);
        if (this.IconCompatParcelizer) {
            return;
        }
        sb.append((char) 30);
    }

    public ContentCardsFragmentCompanion(StringBuilder sb) {
        this.RemoteActionCompatParcelizer = sb;
        this.IconCompatParcelizer = true;
    }

    public ContentCardsFragmentCompanion(StringBuilder sb, boolean z) {
        this.RemoteActionCompatParcelizer = sb;
        this.IconCompatParcelizer = z;
    }
}
