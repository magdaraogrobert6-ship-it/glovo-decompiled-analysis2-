package o;

import kotlin.collections.RingBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class onSwiped extends writeToParcel {
    public final /* synthetic */ RingBuffer IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public int write;

    public onSwiped(RingBuffer ringBuffer) {
        this.IconCompatParcelizer = ringBuffer;
        this.write = ringBuffer.size();
        this.RemoteActionCompatParcelizer = ringBuffer.read;
    }

    @Override // o.writeToParcel
    public final void read() {
        int i = this.write;
        if (i == 0) {
            this.serializer = 2;
            return;
        }
        RingBuffer ringBuffer = this.IconCompatParcelizer;
        Object[] objArr = ringBuffer.serializer;
        int i2 = this.RemoteActionCompatParcelizer;
        this.read = objArr[i2];
        this.serializer = 1;
        this.RemoteActionCompatParcelizer = (i2 + 1) % ringBuffer.RemoteActionCompatParcelizer;
        this.write = i - 1;
    }
}
