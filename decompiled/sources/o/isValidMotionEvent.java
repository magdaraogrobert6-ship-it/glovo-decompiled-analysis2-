package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class isValidMotionEvent implements Cloneable {
    public static final int[] read = new int[0];
    public int RemoteActionCompatParcelizer;
    public int[] write;

    public final Object clone() {
        int[] iArr = (int[]) this.write.clone();
        int i = this.RemoteActionCompatParcelizer;
        isValidMotionEvent isvalidmotionevent = new isValidMotionEvent(0);
        isvalidmotionevent.write = iArr;
        isvalidmotionevent.RemoteActionCompatParcelizer = i;
        return isvalidmotionevent;
    }

    public final void read(int i) {
        if (i > this.write.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i / 0.75f)) + 31) / 32];
            int[] iArr2 = this.write;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.write = iArr;
        }
    }

    public final String toString() {
        int i = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.RemoteActionCompatParcelizer; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(write(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    public final boolean write(int i) {
        return ((1 << (i & 31)) & this.write[i / 32]) != 0;
    }

    public isValidMotionEvent() {
        this.RemoteActionCompatParcelizer = 0;
        this.write = read;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        read(this.RemoteActionCompatParcelizer + 1);
        if (z) {
            int[] iArr = this.write;
            int i = this.RemoteActionCompatParcelizer;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.RemoteActionCompatParcelizer++;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.write) + (this.RemoteActionCompatParcelizer * 31);
    }

    public final int serializer() {
        return (this.RemoteActionCompatParcelizer + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof isValidMotionEvent)) {
            return false;
        }
        isValidMotionEvent isvalidmotionevent = (isValidMotionEvent) obj;
        return this.RemoteActionCompatParcelizer == isvalidmotionevent.RemoteActionCompatParcelizer && Arrays.equals(this.write, isvalidmotionevent.write);
    }

    public final void write(int i, int i2) {
        if (i2 >= 0 && i2 <= 32) {
            int i3 = this.RemoteActionCompatParcelizer;
            read(i3 + i2);
            while (true) {
                i2--;
                if (i2 < 0) {
                    this.RemoteActionCompatParcelizer = i3;
                    return;
                }
                if (((1 << i2) & i) != 0) {
                    int[] iArr = this.write;
                    int i4 = i3 / 32;
                    iArr[i4] = (1 << (i3 & 31)) | iArr[i4];
                }
                i3++;
            }
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Num bits must be between 0 and 32");
        }
    }

    public isValidMotionEvent(int i) {
    }
}
