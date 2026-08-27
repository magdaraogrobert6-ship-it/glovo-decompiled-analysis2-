package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalPointerEvent implements getCancel {
    public int IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public Object read;

    @Override // o.getCancel
    public void read() {
        this.RemoteActionCompatParcelizer = true;
    }

    public MatrixPositionCalculator write() {
        this.RemoteActionCompatParcelizer = true;
        Object[] objArr = (Object[]) this.read;
        int i = this.IconCompatParcelizer;
        HoverIconModifierNodefindDescendantNodeWithCursorInBounds1 hoverIconModifierNodefindDescendantNodeWithCursorInBounds1 = getMotionEvent.RemoteActionCompatParcelizer;
        return i == 0 ? MatrixPositionCalculator.IconCompatParcelizer : new MatrixPositionCalculator(i, objArr);
    }

    public void IconCompatParcelizer(int i) {
        Object[] objArr = (Object[]) this.read;
        int length = objArr.length;
        if (length >= i) {
            if (this.RemoteActionCompatParcelizer) {
                this.read = (Object[]) objArr.clone();
                this.RemoteActionCompatParcelizer = false;
                return;
            }
            return;
        }
        int i2 = length + (length >> 1) + 1;
        if (i2 < i) {
            int iHighestOneBit = Integer.highestOneBit(i - 1);
            i2 = iHighestOneBit + iHighestOneBit;
        }
        if (i2 < 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.read = Arrays.copyOf(objArr, i2);
        this.RemoteActionCompatParcelizer = false;
    }

    @Override // o.getCancel
    public void RemoteActionCompatParcelizer() {
        super/*android.view.View*/.setVisibility(0);
        this.RemoteActionCompatParcelizer = false;
    }

    public InternalPointerEvent(int i) {
        if (i != 2) {
            this.read = new Object[4];
            this.IconCompatParcelizer = 0;
        } else {
            this.read = new byte[65536];
        }
    }

    public void read(Object obj) {
        obj.getClass();
        IconCompatParcelizer(this.IconCompatParcelizer + 1);
        Object[] objArr = (Object[]) this.read;
        int i = this.IconCompatParcelizer;
        this.IconCompatParcelizer = i + 1;
        objArr[i] = obj;
    }

    @Override // o.getCancel
    public void serializer() {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        onKeyDown onkeydown = (onKeyDown) this.read;
        onkeydown.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
        super/*android.view.View*/.setVisibility(this.IconCompatParcelizer);
    }

    public InternalPointerEvent() {
    }
}
