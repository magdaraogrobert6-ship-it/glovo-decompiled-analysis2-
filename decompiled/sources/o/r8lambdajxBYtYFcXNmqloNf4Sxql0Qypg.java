package o;

import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdajxBYtYFcXNmqloNf4Sxql0Qypg implements random_delegatelambda0 {
    public final /* synthetic */ android.view.inputmethod.InputMethodManager serializer;
    public final /* synthetic */ Field write;

    public r8lambdajxBYtYFcXNmqloNf4Sxql0Qypg(Field field, android.view.inputmethod.InputMethodManager inputMethodManager) {
        this.write = field;
        this.serializer = inputMethodManager;
    }

    @Override // o.random_delegatelambda0
    public final void serializer(View view, boolean z) throws IllegalAccessException {
        view.getClass();
        if (z) {
            return;
        }
        view.getClass();
        Field field = this.write;
        android.view.inputmethod.InputMethodManager inputMethodManager = this.serializer;
        if (((View) field.get(inputMethodManager)) == view) {
            field.set(inputMethodManager, null);
        }
    }
}
