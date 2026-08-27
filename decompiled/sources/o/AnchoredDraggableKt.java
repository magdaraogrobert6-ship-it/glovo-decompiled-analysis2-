package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class AnchoredDraggableKt extends ScrollingLayoutElement {
    public final void read(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.RemoteActionCompatParcelizer)) {
            ForEachGestureKt.serializer("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.read;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            onContentCardClicked.IconCompatParcelizer(iArr, i, iArr, i + 1, i2);
        }
        this.RemoteActionCompatParcelizer--;
    }

    public final void write(int i) {
        int[] iArr = this.read;
        if (iArr.length < i) {
            this.read = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    public final void write(int i, int i2) {
        if (i < 0 || i >= this.RemoteActionCompatParcelizer) {
            ForEachGestureKt.serializer("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.read;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final void RemoteActionCompatParcelizer(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.RemoteActionCompatParcelizer) || i2 < 0 || i2 > i3) {
            ForEachGestureKt.serializer("Index must be between 0 and size");
            throw null;
        }
        if (i2 < i) {
            ForEachGestureKt.IconCompatParcelizer("The end index must be < start index");
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                int[] iArr = this.read;
                onContentCardClicked.IconCompatParcelizer(iArr, i, iArr, i2, i3);
            }
            this.RemoteActionCompatParcelizer -= i2 - i;
        }
    }

    public AnchoredDraggableKt(int i) {
        this.read = i == 0 ? Contentfoundation.read : new int[i];
    }

    public final void write() {
        int i = this.RemoteActionCompatParcelizer;
        if (i < 0) {
            ForEachGestureKt.serializer("Index must be between 0 and size");
            throw null;
        }
        write(i + 1);
        int[] iArr = this.read;
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 != 0) {
            onContentCardClicked.IconCompatParcelizer(iArr, 1, iArr, 0, i2);
        }
        iArr[0] = 0;
        this.RemoteActionCompatParcelizer++;
    }

    public /* synthetic */ AnchoredDraggableKt() {
        this(16);
    }

    public final void IconCompatParcelizer(int i) {
        write(this.RemoteActionCompatParcelizer + 1);
        int[] iArr = this.read;
        int i2 = this.RemoteActionCompatParcelizer;
        iArr[i2] = i;
        this.RemoteActionCompatParcelizer = i2 + 1;
    }
}
