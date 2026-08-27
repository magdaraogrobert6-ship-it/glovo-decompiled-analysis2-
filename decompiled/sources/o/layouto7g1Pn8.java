package o;

import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes2.dex */
public final class layouto7g1Pn8 extends BeyondBoundsLayout {
    public final transient int IconCompatParcelizer;
    public final transient int RemoteActionCompatParcelizer;
    public final /* synthetic */ BeyondBoundsLayout write;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.RemoteActionCompatParcelizer;
    }

    public layouto7g1Pn8(BeyondBoundsLayout beyondBoundsLayout, int i, int i2) {
        this.write = beyondBoundsLayout;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
    }

    @Override // o.setMeasurementApproachInProgress
    public final int IconCompatParcelizer() {
        return this.write.serializer() + this.IconCompatParcelizer + this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.List
    public final Object get(int i) {
        DelayKt.read(i, this.RemoteActionCompatParcelizer);
        return this.write.get(i + this.IconCompatParcelizer);
    }

    @Override // o.BeyondBoundsLayout, java.util.List
    /* JADX INFO: renamed from: read */
    public final BeyondBoundsLayout subList(int i, int i2) {
        DelayKt.write(i, i2, this.RemoteActionCompatParcelizer);
        int i3 = this.IconCompatParcelizer;
        return this.write.subList(i + i3, i2 + i3);
    }

    @Override // o.setMeasurementApproachInProgress
    public final Object[] read() {
        return this.write.read();
    }

    @Override // o.setMeasurementApproachInProgress
    public final int serializer() {
        return this.write.serializer() + this.IconCompatParcelizer;
    }
}
