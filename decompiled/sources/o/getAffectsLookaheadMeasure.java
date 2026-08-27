package o;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class getAffectsLookaheadMeasure extends undelegateUnprotectedui {
    public final transient int MediaBrowserCompatMediaItem;
    public final transient Object[] RemoteActionCompatParcelizer;
    public final transient accessgetLookaheadAndAncestorMeasureSetp serializer;

    @Override // o.getSelfKindSetui
    public final boolean serializer() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // o.undelegateUnprotectedui
    public final delegateUnprotectedui MediaMetadataCompat() {
        return new accessgetLookaheadAndAncestorPlaceSetp(this);
    }

    public getAffectsLookaheadMeasure(accessgetLookaheadAndAncestorMeasureSetp accessgetlookaheadandancestormeasuresetp, Object[] objArr, int i) {
        this.serializer = accessgetlookaheadandancestormeasuresetp;
        this.RemoteActionCompatParcelizer = objArr;
        this.MediaBrowserCompatMediaItem = i;
    }

    @Override // o.getSelfKindSetui
    public final int write(int i, Object[] objArr) {
        return read().write(i, objArr);
    }

    @Override // o.undelegateUnprotectedui
    /* JADX INFO: renamed from: RatingCompat */
    public final same iterator() {
        return read().listIterator(0);
    }

    @Override // o.getSelfKindSetui, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.serializer.get(key));
    }
}
