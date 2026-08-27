package androidx.compose.ui.graphics;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidPathEffect implements PathEffect {
    public static final int $stable = 8;
    private final android.graphics.PathEffect nativePathEffect;

    public final android.graphics.PathEffect getNativePathEffect() {
        return this.nativePathEffect;
    }

    public AndroidPathEffect(android.graphics.PathEffect pathEffect) {
        this.nativePathEffect = pathEffect;
    }
}
