package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public class FocusOwnerImplWhenMappings implements setRootFocusNodeui {
    public int serializer;
    public final Object[] write;

    @Override // o.setRootFocusNodeui
    public boolean IconCompatParcelizer(Object obj) {
        obj.getClass();
        int i = this.serializer;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.write;
            if (i2 >= i) {
                int i3 = this.serializer;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.serializer = i3 + 1;
                return true;
            }
            if (objArr[i2] == obj) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Already in the pool!");
                return false;
            }
            i2++;
        }
    }

    public FocusOwnerImplWhenMappings(int i) {
        if (i > 0) {
            this.write = new Object[i];
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The max pool size must be > 0");
            throw null;
        }
    }

    @Override // o.setRootFocusNodeui
    public Object write() {
        int i = this.serializer;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.write;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.serializer--;
        return obj;
    }

    public FocusOwnerImplWhenMappings() {
        this.write = new Object[androidx.compose.ui.graphics.Fields.RotationX];
    }

    public void read(drawWithContent drawwithcontent) {
        int i = this.serializer;
        Object[] objArr = this.write;
        if (i < objArr.length) {
            objArr[i] = drawwithcontent;
            this.serializer = i + 1;
        }
    }
}
