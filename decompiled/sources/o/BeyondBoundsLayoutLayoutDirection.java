package o;

import java.util.AbstractMap;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes2.dex */
public final class BeyondBoundsLayoutLayoutDirection extends BeyondBoundsLayout {
    public final /* synthetic */ accessgetAftercp write;

    public BeyondBoundsLayoutLayoutDirection(accessgetAftercp accessgetaftercp) {
        this.write = accessgetaftercp;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        accessgetAftercp accessgetaftercp = this.write;
        DelayKt.read(i, accessgetaftercp.write);
        Object[] objArr = accessgetaftercp.IconCompatParcelizer;
        int i2 = i + i;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.write.write;
    }
}
