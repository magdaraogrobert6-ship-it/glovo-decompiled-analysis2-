package o;

import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getPositionChange extends getOriginalEventPositionF1C5BW0ui {
    public final /* synthetic */ getOriginalEventPositionF1C5BW0ui RemoteActionCompatParcelizer;
    public final transient int read;
    public final transient int serializer;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.read;
    }

    public getPositionChange(getOriginalEventPositionF1C5BW0ui getoriginaleventpositionf1c5bw0ui, int i, int i2) {
        this.RemoteActionCompatParcelizer = getoriginaleventpositionf1c5bw0ui;
        this.serializer = i;
        this.read = i2;
    }

    @Override // o.getDownChange
    public final int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() + this.serializer + this.read;
    }

    @Override // o.getDownChange
    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() + this.serializer;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(this.read)};
        int iWrite = BackspaceCommand.write();
        RangesKt.read(1259777664, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -1259777659, iWrite);
        return this.RemoteActionCompatParcelizer.get(i + this.serializer);
    }

    @Override // o.getDownChange
    public final Object[] serializer() {
        return this.RemoteActionCompatParcelizer.serializer();
    }

    @Override // o.getOriginalEventPositionF1C5BW0ui, java.util.List
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final getOriginalEventPositionF1C5BW0ui subList(int i, int i2) {
        RangesKt.write(i, i2, this.read);
        int i3 = this.serializer;
        return this.RemoteActionCompatParcelizer.subList(i + i3, i2 + i3);
    }
}
