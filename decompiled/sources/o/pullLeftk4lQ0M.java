package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public enum pullLeftk4lQ0M {
    PERFORMANCE(0),
    COMPATIBLE(1);

    private final int mId;

    public int getId() {
        return this.mId;
    }

    pullLeftk4lQ0M(int i) {
        this.mId = i;
    }

    public static pullLeftk4lQ0M fromId(int i) {
        for (pullLeftk4lQ0M pullleftk4lq0m : values()) {
            if (pullleftk4lq0m.mId == i) {
                return pullleftk4lq0m;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Unknown implementation mode id "));
        return null;
    }
}
