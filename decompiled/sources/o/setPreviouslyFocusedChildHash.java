package o;

import androidx.transition.Transition$1;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class setPreviouslyFocusedChildHash implements Comparator {
    public final Transition$1 RemoteActionCompatParcelizer;
    public final boolean write;
    public final android.graphics.Rect IconCompatParcelizer = new android.graphics.Rect();
    public final android.graphics.Rect serializer = new android.graphics.Rect();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.RemoteActionCompatParcelizer.getClass();
        android.graphics.Rect rect = this.IconCompatParcelizer;
        ((FocusRestorerKtsaveFocusedChild11) obj).read(rect);
        android.graphics.Rect rect2 = this.serializer;
        ((FocusRestorerKtsaveFocusedChild11) obj2).read(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.write;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }

    public setPreviouslyFocusedChildHash(boolean z, Transition$1 transition$1) {
        this.write = z;
        this.RemoteActionCompatParcelizer = transition$1;
    }
}
