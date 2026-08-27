package androidx.compose.ui.layout;

/* JADX INFO: loaded from: classes.dex */
public interface WindowInsetsAnimation {
    float getAlpha();

    long getDurationMillis();

    float getFraction();

    RectRulers getSource();

    RectRulers getTarget();

    boolean isAnimating();

    boolean isVisible();
}
