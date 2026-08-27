package o;

import java.util.AbstractMap;
import java.util.Objects;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetLookaheadAndAncestorPlaceSetp extends delegateUnprotectedui {
    public final /* synthetic */ getAffectsLookaheadMeasure serializer;

    @Override // o.getSelfKindSetui
    public final boolean serializer() {
        return true;
    }

    public accessgetLookaheadAndAncestorPlaceSetp(getAffectsLookaheadMeasure getaffectslookaheadmeasure) {
        this.serializer = getaffectslookaheadmeasure;
    }

    @Override // java.util.List
    public final Object get(int i) {
        getAffectsLookaheadMeasure getaffectslookaheadmeasure = this.serializer;
        TextStreamsKt.RemoteActionCompatParcelizer(i, getaffectslookaheadmeasure.MediaBrowserCompatMediaItem);
        Object[] objArr = getaffectslookaheadmeasure.RemoteActionCompatParcelizer;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.serializer.MediaBrowserCompatMediaItem;
    }
}
