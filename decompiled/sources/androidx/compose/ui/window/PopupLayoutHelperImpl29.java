package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import androidx.sqlite.SQLite;
import java.util.ArrayList;
import o.getQueryParameterslambda2;

/* JADX INFO: loaded from: classes.dex */
class PopupLayoutHelperImpl29 extends PopupLayoutHelperImpl {
    @Override // androidx.compose.ui.window.PopupLayoutHelperImpl, androidx.compose.ui.window.PopupLayoutHelper
    public void setGestureExclusionRects(View view, int i, int i2) {
        Object[] objArr = {new Rect[]{new Rect(0, 0, i, i2)}};
        int iSerializer = getQueryParameterslambda2.serializer();
        view.setSystemGestureExclusionRects((ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, objArr, getQueryParameterslambda2.serializer(), 866125100, iSerializer));
    }
}
