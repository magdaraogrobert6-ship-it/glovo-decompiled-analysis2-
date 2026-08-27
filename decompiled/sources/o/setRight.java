package o;

import android.graphics.Insets;
import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class setRight {
    public static final setRight IconCompatParcelizer = new setRight(0, 0, 0, 0);
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final int write;

    public static setRight RemoteActionCompatParcelizer(setRight setright, setRight setright2) {
        return IconCompatParcelizer(Math.min(setright.RemoteActionCompatParcelizer, setright2.RemoteActionCompatParcelizer), Math.min(setright.write, setright2.write), Math.min(setright.read, setright2.read), Math.min(setright.serializer, setright2.serializer));
    }

    public static setRight write(setRight setright, setRight setright2) {
        return IconCompatParcelizer(Math.max(setright.RemoteActionCompatParcelizer, setright2.RemoteActionCompatParcelizer), Math.max(setright.write, setright2.write), Math.max(setright.read, setright2.read), Math.max(setright.serializer, setright2.serializer));
    }

    public final Insets bt_() {
        return io.sentry.android.replay.util.MediaSessionCompatToken.cp_(this.RemoteActionCompatParcelizer, this.write, this.read, this.serializer);
    }

    public setRight(int i, int i2, int i3, int i4) {
        this.RemoteActionCompatParcelizer = i;
        this.write = i2;
        this.read = i3;
        this.serializer = i4;
    }

    public static setRight bs_(Insets insets) {
        return IconCompatParcelizer(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.write;
        return (((((i * 31) + i2) * 31) + this.read) * 31) + this.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", top=");
        sb.append(this.write);
        sb.append(", right=");
        sb.append(this.read);
        sb.append(", bottom=");
        return af$$ExternalSyntheticOutline0.m(sb, this.serializer, '}');
    }

    public static setRight IconCompatParcelizer(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return IconCompatParcelizer;
        }
        return new setRight(i, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || setRight.class != obj.getClass()) {
            return false;
        }
        setRight setright = (setRight) obj;
        return this.serializer == setright.serializer && this.RemoteActionCompatParcelizer == setright.RemoteActionCompatParcelizer && this.read == setright.read && this.write == setright.write;
    }
}
