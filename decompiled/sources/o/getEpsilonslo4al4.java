package o;

import android.view.View;
import android.webkit.WebSettings;

/* JADX INFO: loaded from: classes.dex */
public abstract class getEpsilonslo4al4 {
    public static void read(View view, android.graphics.Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void read(WebSettings webSettings) {
        webSettings.setForceDark(2);
    }

    public static void serializer(View view, android.graphics.Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
