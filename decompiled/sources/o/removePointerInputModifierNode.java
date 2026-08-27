package o;

import java.util.Objects;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class removePointerInputModifierNode extends getOriginalEventPositionF1C5BW0ui {
    public final transient Object[] RemoteActionCompatParcelizer;
    public final transient int read;
    public final transient int serializer;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.serializer;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(this.serializer)};
        int iWrite = BackspaceCommand.write();
        RangesKt.read(1259777664, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -1259777659, iWrite);
        Object obj = this.RemoteActionCompatParcelizer[i + i + this.read];
        Objects.requireNonNull(obj);
        return obj;
    }

    public removePointerInputModifierNode(int i, int i2, Object[] objArr) {
        this.RemoteActionCompatParcelizer = objArr;
        this.read = i;
        this.serializer = i2;
    }
}
