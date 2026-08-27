package androidx.compose.ui.graphics.layer.view;

import android.content.Context;
import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public final class ViewLayerContainer extends DrawChildContainer {
    public static final int $stable = 8;

    public ViewLayerContainer(Context context) {
        super(context);
    }

    @Override // androidx.compose.ui.graphics.layer.view.DrawChildContainer, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    public final void dispatchGetDisplayList() {
    }
}
