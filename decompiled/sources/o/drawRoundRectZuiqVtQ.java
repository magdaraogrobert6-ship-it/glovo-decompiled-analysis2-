package o;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class drawRoundRectZuiqVtQ implements drawImage9jGpkUE {
    public static final drawRoundRectZuiqVtQ RemoteActionCompatParcelizer = new drawRoundRectZuiqVtQ(0);
    public final /* synthetic */ int serializer;

    public /* synthetic */ drawRoundRectZuiqVtQ(int i) {
        this.serializer = i;
    }

    @Override // o.drawImage9jGpkUE
    public final drawLine1RTmtNc RemoteActionCompatParcelizer(Object obj, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) {
        int i3 = this.serializer;
        if (i3 == 0) {
            return new drawLine1RTmtNc(new translatedefault(obj), new drawRectAsUm42w(0, obj));
        }
        if (i3 != 1) {
            return null;
        }
        File file = (File) obj;
        return new drawLine1RTmtNc(new translatedefault(file), new drawRectAsUm42w(1, file));
    }

    @Override // o.drawImage9jGpkUE
    public final boolean write(Object obj) {
        int i = this.serializer;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
        }
        return true;
    }
}
