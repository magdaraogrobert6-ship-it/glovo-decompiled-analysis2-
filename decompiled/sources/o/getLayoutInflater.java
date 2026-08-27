package o;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class getLayoutInflater implements Toolbar4 {
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public final int RemoteActionCompatParcelizer;
    public final ByteBuffer serializer;

    public getLayoutInflater(int i, ByteBuffer byteBuffer) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = byteBuffer;
    }

    @Override // o.Toolbar4
    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer != 0 ? 1 : 2;
    }

    @Override // o.Toolbar4
    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer != 0 ? this.RemoteActionCompatParcelizer : this.RemoteActionCompatParcelizer;
    }

    @Override // o.Toolbar4
    public final ByteBuffer write() {
        return this.IconCompatParcelizer != 0 ? this.serializer : this.serializer;
    }

    public getLayoutInflater(ByteBuffer byteBuffer, int i) {
        this.serializer = byteBuffer;
        this.RemoteActionCompatParcelizer = i;
    }
}
