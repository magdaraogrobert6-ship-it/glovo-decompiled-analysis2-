package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.SlidingWindowKt$windowedIterator$1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdamYEtK3wDOqF6c3HLWu9wJc3oPw {
    public static void IconCompatParcelizer() {
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
    }

    public static final Iterator write(Iterator it, int i, int i2, boolean z, boolean z2) {
        it.getClass();
        return !it.hasNext() ? getContentCardsActionListener.IconCompatParcelizer : LazyKt__LazyJVMKt.read(new SlidingWindowKt$windowedIterator$1(i, i2, it, z2, z, null));
    }

    public static boolean RemoteActionCompatParcelizer(setFocusRect setfocusrect, android.view.KeyEvent keyEvent) {
        if (setfocusrect == null) {
            return false;
        }
        return setfocusrect.superDispatchKeyEvent(keyEvent);
    }

    public static final void write(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            DrawableTransformation.serializer((Object) (i != i2 ? af$$ExternalSyntheticOutline0.m(i, i2, "Both size ", " and step ", " must be greater than zero.") : d$$ExternalSyntheticOutline0.m(i, "size ", " must be greater than zero.")));
        }
    }
}
