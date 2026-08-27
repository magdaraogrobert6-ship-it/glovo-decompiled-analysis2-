package androidx.compose.ui;

/* JADX INFO: loaded from: classes.dex */
public final class KeepScreenOnKt {
    public static final Modifier keepScreenOn(Modifier modifier) {
        return modifier.then(KeepScreenOnElement.INSTANCE);
    }
}
