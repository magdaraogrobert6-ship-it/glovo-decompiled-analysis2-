package androidx.compose.ui.text.android;

/* JADX INFO: loaded from: classes.dex */
final class HorizontalPositionCache {
    private int cachedKey = -1;
    private float cachedValue;
    private final TextLayout layout;

    public final TextLayout getLayout() {
        return this.layout;
    }

    public final float getPrimaryUpstream(int i) {
        return get(i, true, true, true);
    }

    public final float getSecondaryDownstream(int i) {
        return get(i, false, false, false);
    }

    public final float getPrimaryDownstream(int i) {
        return get(i, false, false, true);
    }

    public final float getSecondaryUpstream(int i) {
        return get(i, true, true, false);
    }

    public HorizontalPositionCache(TextLayout textLayout) {
        this.layout = textLayout;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    private final float get(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        float secondaryHorizontal;
        int i2 = 0;
        if (z) {
            int lineForOffset = LayoutCompat_androidKt.getLineForOffset(this.layout.getLayout(), i, z);
            int lineStart = this.layout.getLineStart(lineForOffset);
            int lineEnd = this.layout.getLineEnd(lineForOffset);
            if (i == lineStart || i == lineEnd) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (!z4) {
            i2 = 1;
        }
        int i3 = (i * 4) + i2;
        if (this.cachedKey == i3) {
            return this.cachedValue;
        }
        TextLayout textLayout = this.layout;
        if (z3) {
            secondaryHorizontal = textLayout.getPrimaryHorizontal(i, z);
        } else {
            secondaryHorizontal = textLayout.getSecondaryHorizontal(i, z);
        }
        if (z2) {
            this.cachedKey = i3;
            this.cachedValue = secondaryHorizontal;
        }
        return secondaryHorizontal;
    }
}
