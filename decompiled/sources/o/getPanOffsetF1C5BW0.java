package o;

import java.util.Objects;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getPanOffsetF1C5BW0 extends getOriginalEventPositionF1C5BW0ui {
    public static final getPanOffsetF1C5BW0 serializer = new getPanOffsetF1C5BW0(0, new Object[0]);
    public final transient Object[] RemoteActionCompatParcelizer;
    public final transient int read;

    @Override // o.getDownChange
    public final int IconCompatParcelizer() {
        return this.read;
    }

    @Override // o.getDownChange
    public final int RemoteActionCompatParcelizer() {
        return 0;
    }

    @Override // o.getDownChange
    public final Object[] serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.read;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(this.read)};
        int iWrite = BackspaceCommand.write();
        RangesKt.read(1259777664, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -1259777659, iWrite);
        Object obj = this.RemoteActionCompatParcelizer[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    public getPanOffsetF1C5BW0(int i, Object[] objArr) {
        this.RemoteActionCompatParcelizer = objArr;
        this.read = i;
    }

    @Override // o.getOriginalEventPositionF1C5BW0ui, o.getDownChange
    public final int write(Object[] objArr) {
        Object[] objArr2 = this.RemoteActionCompatParcelizer;
        int i = this.read;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }
}
