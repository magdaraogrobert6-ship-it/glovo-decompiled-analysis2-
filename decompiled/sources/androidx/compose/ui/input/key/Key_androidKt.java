package androidx.compose.ui.input.key;

/* JADX INFO: loaded from: classes.dex */
public final class Key_androidKt {
    /* JADX INFO: renamed from: getNativeKeyCode-YVgTNJs, reason: not valid java name */
    public static final int m1908getNativeKeyCodeYVgTNJs(long j) {
        return (int) (j >> 32);
    }

    public static final long Key(int i) {
        return Key.m1579constructorimpl(((long) i) << 32);
    }
}
