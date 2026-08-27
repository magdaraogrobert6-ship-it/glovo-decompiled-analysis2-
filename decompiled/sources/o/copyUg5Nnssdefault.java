package o;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class copyUg5Nnssdefault implements drawImage9jGpkUE {
    public static final accessgetMinp read = accessgetMinp.serializer(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final getExponentimpl RemoteActionCompatParcelizer;

    @Override // o.drawImage9jGpkUE
    public final /* bridge */ /* synthetic */ boolean write(Object obj) {
        return true;
    }

    @Override // o.drawImage9jGpkUE
    public final drawLine1RTmtNc RemoteActionCompatParcelizer(Object obj, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) {
        modulate5vOe2sY modulate5voe2sy = (modulate5vOe2sY) obj;
        getExponentimpl getexponentimpl = this.RemoteActionCompatParcelizer;
        if (getexponentimpl != null) {
            drawCircleV9BoPsw drawcirclev9bopsw = (drawCircleV9BoPsw) getexponentimpl.read;
            drawCircleVaOC9Bg drawcirclevaoc9bgWrite = drawCircleVaOC9Bg.write(modulate5voe2sy);
            Object objIconCompatParcelizer = drawcirclev9bopsw.IconCompatParcelizer(drawcirclevaoc9bgWrite);
            ArrayDeque arrayDeque = drawCircleVaOC9Bg.RemoteActionCompatParcelizer;
            synchronized (arrayDeque) {
                arrayDeque.offer(drawcirclevaoc9bgWrite);
            }
            modulate5vOe2sY modulate5voe2sy2 = (modulate5vOe2sY) objIconCompatParcelizer;
            if (modulate5voe2sy2 == null) {
                drawcirclev9bopsw.write(drawCircleVaOC9Bg.write(modulate5voe2sy), modulate5voe2sy);
            } else {
                modulate5voe2sy = modulate5voe2sy2;
            }
        }
        return new drawLine1RTmtNc(modulate5voe2sy, new com.bumptech.glide.load.data.HttpUrlFetcher(modulate5voe2sy, ((Integer) geteotffuncui_graphics.serializer(read)).intValue()));
    }

    public copyUg5Nnssdefault(getExponentimpl getexponentimpl) {
        this.RemoteActionCompatParcelizer = getexponentimpl;
    }
}
