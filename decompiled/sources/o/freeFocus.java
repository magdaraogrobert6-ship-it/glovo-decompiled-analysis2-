package o;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public abstract class freeFocus {
    public static void serializer(View view, int i) {
        view.setImportantForAutofill(i);
    }

    public static int write(View view) {
        return view.getImportantForAutofill();
    }
}
