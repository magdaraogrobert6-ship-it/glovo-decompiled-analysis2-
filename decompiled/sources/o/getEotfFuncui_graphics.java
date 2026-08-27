package o;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class getEotfFuncui_graphics implements eotfFunclambda0 {
    public final DrawStyle write = new DrawStyle(0);

    @Override // o.eotfFunclambda0
    public final void serializer(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            DrawStyle drawStyle = this.write;
            if (i >= drawStyle.MediaMetadataCompat) {
                return;
            }
            ((accessgetMinp) drawStyle.IconCompatParcelizer(i)).IconCompatParcelizer(drawStyle.write(i), messageDigest);
            i++;
        }
    }

    @Override // o.eotfFunclambda0
    public final int hashCode() {
        return this.write.hashCode();
    }

    public final Object serializer(accessgetMinp accessgetminp) {
        DrawStyle drawStyle = this.write;
        return drawStyle.containsKey(accessgetminp) ? drawStyle.get(accessgetminp) : accessgetminp.read();
    }

    @Override // o.eotfFunclambda0
    public final boolean equals(Object obj) {
        if (obj instanceof getEotfFuncui_graphics) {
            return this.write.equals(((getEotfFuncui_graphics) obj).write);
        }
        return false;
    }

    public final String toString() {
        return "Options{values=" + this.write + '}';
    }
}
