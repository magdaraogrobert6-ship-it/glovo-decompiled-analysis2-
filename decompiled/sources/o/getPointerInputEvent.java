package o;

import java.util.AbstractMap;
import java.util.Objects;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getPointerInputEvent extends getMotionEvent {
    public final /* synthetic */ addFreshIds serializer;

    public getPointerInputEvent(addFreshIds addfreshids) {
        this.serializer = addfreshids;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        addFreshIds addfreshids = this.serializer;
        TuplesKt.RemoteActionCompatParcelizer(i, addfreshids.read);
        Object[] objArr = addfreshids.IconCompatParcelizer;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.serializer.read;
    }
}
