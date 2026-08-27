package o;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class obtainFillPaint implements drawImage9jGpkUE {
    public final Object read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ obtainFillPaint(int i, Object obj) {
        this.serializer = i;
        this.read = obj;
    }

    @Override // o.drawImage9jGpkUE
    public final drawLine1RTmtNc RemoteActionCompatParcelizer(Object obj, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) {
        int i3 = this.serializer;
        Object obj2 = this.read;
        int i4 = 1;
        if (i3 == 0) {
            File file = (File) obj;
            return new drawLine1RTmtNc(new translatedefault(file), new com.bumptech.glide.load.data.mediastore.ThumbFetcher(file, (configureStrokePaintho4zsrM) obj2, i4));
        }
        if (i3 != 1) {
            return new drawLine1RTmtNc(new translatedefault(obj), new configurePaintswdJneE(obj.toString(), (configureStrokePaintho4zsrM) obj2));
        }
        byte[] bArr = (byte[]) obj;
        return new drawLine1RTmtNc(new translatedefault(bArr), new configurePaintswdJneE(bArr, 0, (configureStrokePaintho4zsrM) obj2));
    }

    @Override // o.drawImage9jGpkUE
    public final boolean write(Object obj) {
        int i = this.serializer;
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            return obj.toString().startsWith("data:image");
        }
        return true;
    }
}
