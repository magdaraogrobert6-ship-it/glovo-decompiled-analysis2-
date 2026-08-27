package o;

import com.sentiance.sdk.util.BoundingBox;

/* JADX INFO: loaded from: classes3.dex */
public class writeMap {
    final int RemoteActionCompatParcelizer;
    final int read;
    final int serializer;

    public final int read() {
        return this.read;
    }

    public final int write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final BoundingBox RemoteActionCompatParcelizer() {
        BoundingBox.write writeVar = new BoundingBox.write();
        int i = this.read;
        double d = this.serializer;
        writeVar.serializer(Math.toDegrees(Math.atan(Math.sinh(3.141592653589793d - ((((double) i) * 6.283185307179586d) / Math.pow(2.0d, d))))));
        writeVar.write(Math.toDegrees(Math.atan(Math.sinh(3.141592653589793d - ((((double) (i + 1)) * 6.283185307179586d) / Math.pow(2.0d, d))))));
        int i2 = this.RemoteActionCompatParcelizer;
        writeVar.read(((((double) (i2 + 1)) / Math.pow(2.0d, d)) * 360.0d) - 180.0d);
        writeVar.IconCompatParcelizer(((((double) i2) / Math.pow(2.0d, d)) * 360.0d) - 180.0d);
        return writeVar.serializer();
    }

    public writeMap(int i, int i2, int i3) {
        this.RemoteActionCompatParcelizer = i;
        this.read = i2;
        this.serializer = i3;
    }
}
