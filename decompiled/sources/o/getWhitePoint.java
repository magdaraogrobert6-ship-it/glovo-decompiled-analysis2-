package o;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class getWhitePoint implements getOetfFuncui_graphics {
    public final /* synthetic */ int write;

    public /* synthetic */ getWhitePoint(int i) {
        this.write = i;
    }

    @Override // o.getOetfFuncui_graphics
    public final getOetfOrigui_graphics write(Object obj) {
        int i = this.write;
        if (i != 0) {
            return i != 1 ? new getDefaultDensity((ByteBuffer) obj, 3) : new toLinear((ParcelFileDescriptor) obj);
        }
        return new toLinear(obj);
    }

    @Override // o.getOetfFuncui_graphics
    public final Class RemoteActionCompatParcelizer() {
        int i = this.write;
        if (i != 0) {
            return i != 1 ? ByteBuffer.class : ParcelFileDescriptor.class;
        }
        throw new UnsupportedOperationException("Not implemented");
    }
}
