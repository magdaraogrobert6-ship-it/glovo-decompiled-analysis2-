package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class setBottom extends io.sentry.util.network.IconCompatParcelizer {
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ setBottom(int i) {
        this.IconCompatParcelizer = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.util.network.IconCompatParcelizer
    public final float getValue(getScaleXannotations getscalexannotations) {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            return ((View) getscalexannotations).getScaleX();
        }
        if (i == 1) {
            return ((View) getscalexannotations).getAlpha();
        }
        if (i == 2) {
            return ((View) getscalexannotations).getScaleY();
        }
        if (i != 3) {
            return i != 4 ? ((View) getscalexannotations).getRotationY() : ((View) getscalexannotations).getRotationX();
        }
        return ((View) getscalexannotations).getRotation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.util.network.IconCompatParcelizer
    public final void setValue(getScaleXannotations getscalexannotations, float f) {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            ((View) getscalexannotations).setScaleX(f);
            return;
        }
        if (i == 1) {
            ((View) getscalexannotations).setAlpha(f);
            return;
        }
        if (i == 2) {
            ((View) getscalexannotations).setScaleY(f);
            return;
        }
        if (i == 3) {
            ((View) getscalexannotations).setRotation(f);
        } else if (i != 4) {
            ((View) getscalexannotations).setRotationY(f);
        } else {
            ((View) getscalexannotations).setRotationX(f);
        }
    }
}
