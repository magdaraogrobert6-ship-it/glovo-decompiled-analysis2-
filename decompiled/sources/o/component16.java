package o;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.core.view.WindowInsetsAnimationCompat$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import o.FocusRequesterModifierKt;
import o.component14;
import o.component15;
import o.component16;
import o.seekAnimationsanimation_core;

/* JADX INFO: loaded from: classes.dex */
public final class component16 extends component13 {
    public final android.view.WindowInsetsAnimation IconCompatParcelizer;

    @Override // o.component13
    public final long IconCompatParcelizer() {
        return this.IconCompatParcelizer.getDurationMillis();
    }

    @Override // o.component13
    public final float RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.getInterpolatedFraction();
    }

    @Override // o.component13
    public final float serializer() {
        return this.IconCompatParcelizer.getAlpha();
    }

    @Override // o.component13
    public final void serializer(float f) {
        this.IconCompatParcelizer.setFraction(f);
    }

    @Override // o.component13
    public final int write() {
        return this.IconCompatParcelizer.getTypeMask();
    }

    public component16(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.IconCompatParcelizer = windowInsetsAnimation;
    }

    public static setRight bX_(android.view.WindowInsetsAnimation.Bounds bounds) {
        return setRight.bs_(bounds.getUpperBound());
    }

    public static setRight bY_(android.view.WindowInsetsAnimation.Bounds bounds) {
        return setRight.bs_(bounds.getLowerBound());
    }

    public static void read(View view, final WindowInsetsAnimationCompat$Callback windowInsetsAnimationCompat$Callback) {
        view.setWindowInsetsAnimationCallback(windowInsetsAnimationCompat$Callback != null ? new WindowInsetsAnimation$Callback(windowInsetsAnimationCompat$Callback) { // from class: androidx.core.view.WindowInsetsAnimationCompat$Impl30$ProxyCallback
            public final HashMap IconCompatParcelizer;
            public List RemoteActionCompatParcelizer;
            public final WindowInsetsAnimationCompat$Callback read;
            public ArrayList serializer;

            public final component14 getWindowInsetsAnimationCompat(WindowInsetsAnimation windowInsetsAnimation) {
                HashMap map = this.IconCompatParcelizer;
                component14 component14Var = (component14) map.get(windowInsetsAnimation);
                if (component14Var != null) {
                    return component14Var;
                }
                component14 component14Var2 = new component14(0, null, 0L);
                component14Var2.IconCompatParcelizer = new component16(windowInsetsAnimation);
                map.put(windowInsetsAnimation, component14Var2);
                return component14Var2;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.read.onEnd(getWindowInsetsAnimationCompat(windowInsetsAnimation));
                this.IconCompatParcelizer.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.read.onPrepare(getWindowInsetsAnimationCompat(windowInsetsAnimation));
            }

            {
                super(windowInsetsAnimationCompat$Callback.getDispatchMode());
                this.IconCompatParcelizer = new HashMap();
                this.read = windowInsetsAnimationCompat$Callback;
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.read.onStart(getWindowInsetsAnimationCompat(windowInsetsAnimation), component15.bV_(bounds)).bW_();
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.serializer;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.serializer = arrayList2;
                    this.RemoteActionCompatParcelizer = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        return this.read.onProgress(FocusRequesterModifierKt.write(null, windowInsets), this.RemoteActionCompatParcelizer).IconCompatParcelizer();
                    }
                    WindowInsetsAnimation windowInsetsAnimationAu_ = seekAnimationsanimation_core.au_(list.get(size));
                    component14 windowInsetsAnimationCompat = getWindowInsetsAnimationCompat(windowInsetsAnimationAu_);
                    windowInsetsAnimationCompat.IconCompatParcelizer.serializer(windowInsetsAnimationAu_.getFraction());
                    this.serializer.add(windowInsetsAnimationCompat);
                }
            }
        } : null);
    }
}
