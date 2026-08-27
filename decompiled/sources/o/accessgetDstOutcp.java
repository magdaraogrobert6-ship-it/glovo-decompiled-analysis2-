package o;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetDstOutcp {
    public final long IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final long serializer;
    public final int write;

    public accessgetDstOutcp(int i, int i2, long j, long j2) {
        this.RemoteActionCompatParcelizer = i;
        this.write = i2;
        this.serializer = j;
        this.IconCompatParcelizer = j2;
    }

    public static accessgetDstOutcp IconCompatParcelizer(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(getActiveFocusTargetNode.write(file, new FileInputStream(file)));
        try {
            accessgetDstOutcp accessgetdstoutcp = new accessgetDstOutcp(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return accessgetdstoutcp;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.write), Long.valueOf(this.serializer), Integer.valueOf(this.RemoteActionCompatParcelizer), Long.valueOf(this.IconCompatParcelizer));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof accessgetDstOutcp)) {
            return false;
        }
        accessgetDstOutcp accessgetdstoutcp = (accessgetDstOutcp) obj;
        return this.write == accessgetdstoutcp.write && this.serializer == accessgetdstoutcp.serializer && this.RemoteActionCompatParcelizer == accessgetdstoutcp.RemoteActionCompatParcelizer && this.IconCompatParcelizer == accessgetdstoutcp.IconCompatParcelizer;
    }

    public final void read(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(getPositionInRoot.write(new FileOutputStream(file), file));
        try {
            dataOutputStream.writeInt(this.RemoteActionCompatParcelizer);
            dataOutputStream.writeInt(this.write);
            dataOutputStream.writeLong(this.serializer);
            dataOutputStream.writeLong(this.IconCompatParcelizer);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
