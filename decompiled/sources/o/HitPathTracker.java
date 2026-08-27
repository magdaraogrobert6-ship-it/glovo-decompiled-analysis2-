package o;

import java.util.AbstractMap;
import java.util.Objects;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class HitPathTracker extends getOriginalEventPositionF1C5BW0ui {
    public final /* synthetic */ dispatchChangesdefault RemoteActionCompatParcelizer;

    public HitPathTracker(dispatchChangesdefault dispatchchangesdefault) {
        this.RemoteActionCompatParcelizer = dispatchchangesdefault;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        dispatchChangesdefault dispatchchangesdefault = this.RemoteActionCompatParcelizer;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(dispatchchangesdefault.write)};
        int iWrite = BackspaceCommand.write();
        RangesKt.read(1259777664, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -1259777659, iWrite);
        Object[] objArr2 = dispatchchangesdefault.serializer;
        int i2 = i + i;
        Object obj = objArr2[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr2[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.RemoteActionCompatParcelizer.write;
    }
}
