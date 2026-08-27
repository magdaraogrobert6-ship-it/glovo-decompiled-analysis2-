package androidx.compose.ui.res;

import android.content.res.Resources;
import android.util.TypedValue;
import o.animateToWithDecay;

/* JADX INFO: loaded from: classes.dex */
public final class ResourceIdCache {
    public static final int $stable = 8;
    private final animateToWithDecay resIdPathMap = new animateToWithDecay();

    public final void clear() {
        synchronized (this) {
            this.resIdPathMap.RemoteActionCompatParcelizer();
        }
    }

    public final TypedValue resolveResourcePath(Resources resources, int i) {
        TypedValue typedValue;
        synchronized (this) {
            typedValue = (TypedValue) this.resIdPathMap.serializer(i);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                animateToWithDecay animatetowithdecay = this.resIdPathMap;
                int i2 = animatetowithdecay.read(i);
                Object[] objArr = animatetowithdecay.IconCompatParcelizer;
                Object obj = objArr[i2];
                animatetowithdecay.serializer[i2] = i;
                objArr[i2] = typedValue;
            }
        }
        return typedValue;
    }
}
