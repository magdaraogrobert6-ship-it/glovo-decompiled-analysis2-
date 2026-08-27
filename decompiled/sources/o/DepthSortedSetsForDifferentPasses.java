package o;

/* JADX INFO: loaded from: classes2.dex */
public final class DepthSortedSetsForDifferentPasses extends undelegateUnprotectedui {
    public final transient accessgetLookaheadAndAncestorMeasureSetp RemoteActionCompatParcelizer;
    public final transient areItemsTheSame serializer;

    @Override // o.undelegateUnprotectedui, o.getSelfKindSetui
    public final delegateUnprotectedui read() {
        return this.serializer;
    }

    @Override // o.getSelfKindSetui
    public final boolean serializer() {
        return true;
    }

    @Override // o.getSelfKindSetui, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.RemoteActionCompatParcelizer.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.RemoteActionCompatParcelizer.MediaDescriptionCompat;
    }

    @Override // o.getSelfKindSetui
    public final int write(int i, Object[] objArr) {
        return this.serializer.write(i, objArr);
    }

    public DepthSortedSetsForDifferentPasses(accessgetLookaheadAndAncestorMeasureSetp accessgetlookaheadandancestormeasuresetp, areItemsTheSame areitemsthesame) {
        this.RemoteActionCompatParcelizer = accessgetlookaheadandancestormeasuresetp;
        this.serializer = areitemsthesame;
    }

    @Override // o.undelegateUnprotectedui
    /* JADX INFO: renamed from: RatingCompat */
    public final same iterator() {
        return this.serializer.listIterator(0);
    }
}
