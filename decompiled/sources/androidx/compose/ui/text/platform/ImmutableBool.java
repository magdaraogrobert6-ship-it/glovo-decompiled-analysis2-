package androidx.compose.ui.text.platform;

import o.onViewAttachedToWindow;

/* JADX INFO: loaded from: classes.dex */
final class ImmutableBool implements onViewAttachedToWindow {
    private final boolean value;

    public ImmutableBool(boolean z) {
        this.value = z;
    }

    @Override // o.onViewAttachedToWindow
    public Boolean getValue() {
        return Boolean.valueOf(this.value);
    }
}
