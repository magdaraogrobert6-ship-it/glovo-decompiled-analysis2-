package o;

import java.io.DataInputStream;
import java.io.InputStream;
import org.tukaani.xz.CorruptedInputException;

/* JADX INFO: loaded from: classes4.dex */
public final class getVariations extends FwFClientConfigKt {
    public final DataInputStream serializer;

    public getVariations(InputStream inputStream) throws CorruptedInputException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.serializer = dataInputStream;
        if (dataInputStream.readUnsignedByte() != 0) {
            throw new CorruptedInputException();
        }
        this.write = dataInputStream.readInt();
        this.RemoteActionCompatParcelizer = -1;
    }

    @Override // o.FwFClientConfigKt
    public final void serializer() {
        if ((this.RemoteActionCompatParcelizer & (-16777216)) == 0) {
            this.write = (this.write << 8) | this.serializer.readUnsignedByte();
            this.RemoteActionCompatParcelizer <<= 8;
        }
    }
}
