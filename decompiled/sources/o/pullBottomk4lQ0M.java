package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public enum pullBottomk4lQ0M {
    FILL_START(0),
    FILL_CENTER(1),
    FILL_END(2),
    FIT_START(3),
    FIT_CENTER(4),
    FIT_END(5);

    private final int mId;

    public int getId() {
        return this.mId;
    }

    pullBottomk4lQ0M(int i) {
        this.mId = i;
    }

    public static pullBottomk4lQ0M fromId(int i) {
        for (pullBottomk4lQ0M pullbottomk4lq0m : values()) {
            if (pullbottomk4lq0m.mId == i) {
                return pullbottomk4lq0m;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Unknown scale type id "));
        return null;
    }
}
