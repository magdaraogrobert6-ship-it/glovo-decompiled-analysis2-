package o;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes4.dex */
public final class getInsetsListener implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ getCutoutRulers serializer;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        getCutoutRulers getcutoutrulers = this.serializer;
        WindowInsetsAnimation windowInsetsAnimation = getcutoutrulers.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (!getcutoutrulers.isShown()) {
            return true;
        }
        getcutoutrulers.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((getcutoutrulers.getHeight() / 2) - windowInsetsAnimation.PlaybackStateCompatCustomAction) - getcutoutrulers.RemoteActionCompatParcelizer;
        if (height == getcutoutrulers._init_lambda4) {
            return true;
        }
        getcutoutrulers._init_lambda4 = height;
        getcutoutrulers.serializer();
        windowInsetsAnimation.IconCompatParcelizer = getcutoutrulers._init_lambda4;
        windowInsetsAnimation.invalidate();
        return true;
    }

    public getInsetsListener(getCutoutRulers getcutoutrulers) {
        this.serializer = getcutoutrulers;
    }
}
