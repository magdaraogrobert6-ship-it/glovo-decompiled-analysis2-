package androidx.core.view;

import java.util.List;
import o.FocusRequesterModifierKt;
import o.component14;
import o.component15;

/* JADX INFO: loaded from: classes.dex */
public abstract class WindowInsetsAnimationCompat$Callback {
    public FocusRequesterModifierKt RemoteActionCompatParcelizer;
    private final int read;

    public final int getDispatchMode() {
        return this.read;
    }

    public void onEnd(component14 component14Var) {
    }

    public void onPrepare(component14 component14Var) {
    }

    public abstract FocusRequesterModifierKt onProgress(FocusRequesterModifierKt focusRequesterModifierKt, List list);

    public abstract component15 onStart(component14 component14Var, component15 component15Var);

    public WindowInsetsAnimationCompat$Callback(int i) {
        this.read = i;
    }
}
