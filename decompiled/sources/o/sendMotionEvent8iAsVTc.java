package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class sendMotionEvent8iAsVTc {
    public final Object RemoteActionCompatParcelizer;

    public final boolean serializer() {
        return this.RemoteActionCompatParcelizer != null;
    }

    public sendMotionEvent8iAsVTc(Object obj) {
        if (obj != null) {
            this.RemoteActionCompatParcelizer = obj;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("value for optional is empty.");
            throw null;
        }
    }

    public final Object RemoteActionCompatParcelizer() {
        Object obj = this.RemoteActionCompatParcelizer;
        if (obj != null) {
            return obj;
        }
        DrawableTransformation.write("No value present");
        return null;
    }

    public sendMotionEvent8iAsVTc() {
        this.RemoteActionCompatParcelizer = null;
    }
}
