package o;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class getTransform implements getOetfFuncui_graphics {
    public final getF write;

    @Override // o.getOetfFuncui_graphics
    public final Class RemoteActionCompatParcelizer() {
        return InputStream.class;
    }

    public getTransform(getF getf) {
        this.write = getf;
    }

    @Override // o.getOetfFuncui_graphics
    public final getOetfOrigui_graphics write(Object obj) {
        return new toLinear((InputStream) obj, this.write);
    }
}
