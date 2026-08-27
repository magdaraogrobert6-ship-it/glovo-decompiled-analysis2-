package o;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class getXannotations implements timesBz7bX_o {
    public timesBz7bX_o[] serializer;

    @Override // o.timesBz7bX_o
    public final lerp3Ry4LBc read(Class cls) {
        for (timesBz7bX_o timesbz7bx_o : this.serializer) {
            if (timesbz7bx_o.serializer(cls)) {
                return timesbz7bx_o.read(cls);
            }
        }
        IBraze$$ExternalSyntheticBUOutline0.m("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // o.timesBz7bX_o
    public final boolean serializer(Class cls) {
        for (timesBz7bX_o timesbz7bx_o : this.serializer) {
            if (timesbz7bx_o.serializer(cls)) {
                return true;
            }
        }
        return false;
    }
}
