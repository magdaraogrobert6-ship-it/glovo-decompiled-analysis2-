package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class accessprocessDragStart implements Cloneable {
    public /* synthetic */ int[] IconCompatParcelizer;
    public /* synthetic */ Object[] read;
    public /* synthetic */ int serializer;
    public /* synthetic */ boolean write;

    public final void RemoteActionCompatParcelizer(int i, Object obj) {
        int iSerializer = DragGestureNodestartListeningForEvents1.serializer(this.IconCompatParcelizer, this.serializer, i);
        if (iSerializer >= 0) {
            this.read[iSerializer] = obj;
            return;
        }
        int i2 = ~iSerializer;
        int i3 = this.serializer;
        if (i2 < i3) {
            Object[] objArr = this.read;
            if (objArr[i2] == isInterested.IconCompatParcelizer) {
                this.IconCompatParcelizer[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.write && i3 >= this.IconCompatParcelizer.length) {
            isInterested.read(this);
            i2 = ~DragGestureNodestartListeningForEvents1.serializer(this.IconCompatParcelizer, this.serializer, i);
        }
        int i4 = this.serializer;
        if (i4 >= this.IconCompatParcelizer.length) {
            int i5 = (i4 + 1) * 4;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            this.IconCompatParcelizer = Arrays.copyOf(this.IconCompatParcelizer, i8);
            this.read = Arrays.copyOf(this.read, i8);
        }
        int i9 = this.serializer;
        if (i9 - i2 != 0) {
            int[] iArr = this.IconCompatParcelizer;
            int i10 = i2 + 1;
            onContentCardClicked.IconCompatParcelizer(iArr, i10, iArr, i2, i9);
            Object[] objArr2 = this.read;
            onContentCardClicked.write(i10, i2, this.serializer, objArr2, objArr2);
        }
        this.IconCompatParcelizer[i2] = i;
        this.read[i2] = obj;
        this.serializer++;
    }

    public final int IconCompatParcelizer(int i) {
        if (this.write) {
            isInterested.read(this);
        }
        return this.IconCompatParcelizer[i];
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final accessprocessDragStart clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        accessprocessDragStart accessprocessdragstart = (accessprocessDragStart) objClone;
        accessprocessdragstart.IconCompatParcelizer = (int[]) this.IconCompatParcelizer.clone();
        accessprocessdragstart.read = (Object[]) this.read.clone();
        return accessprocessdragstart;
    }

    public final Object read(int i) {
        if (this.write) {
            isInterested.read(this);
        }
        Object[] objArr = this.read;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void serializer(int i, Object obj) {
        int i2 = this.serializer;
        if (i2 != 0 && i <= this.IconCompatParcelizer[i2 - 1]) {
            RemoteActionCompatParcelizer(i, obj);
            return;
        }
        if (this.write && i2 >= this.IconCompatParcelizer.length) {
            isInterested.read(this);
        }
        int i3 = this.serializer;
        if (i3 >= this.IconCompatParcelizer.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            this.IconCompatParcelizer = Arrays.copyOf(this.IconCompatParcelizer, i7);
            this.read = Arrays.copyOf(this.read, i7);
        }
        this.IconCompatParcelizer[i3] = i;
        this.read[i3] = obj;
        this.serializer = i3 + 1;
    }

    public final int write() {
        if (this.write) {
            isInterested.read(this);
        }
        return this.serializer;
    }

    public final String toString() {
        if (write() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.serializer * 28);
        sb.append('{');
        int i = this.serializer;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(IconCompatParcelizer(i2));
            sb.append('=');
            Object obj = read(i2);
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public accessprocessDragStart(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.IconCompatParcelizer = new int[i5];
        this.read = new Object[i5];
    }
}
