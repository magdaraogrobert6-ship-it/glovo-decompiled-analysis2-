package androidx.compose.ui.graphics;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidRenderEffect extends RenderEffect {
    public static final int $stable = 0;
    private final android.graphics.RenderEffect androidRenderEffect;

    public AndroidRenderEffect(android.graphics.RenderEffect renderEffect) {
        super(null);
        this.androidRenderEffect = renderEffect;
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    public android.graphics.RenderEffect createRenderEffect() {
        return this.androidRenderEffect;
    }

    public final android.graphics.RenderEffect getAndroidRenderEffect() {
        return this.androidRenderEffect;
    }
}
