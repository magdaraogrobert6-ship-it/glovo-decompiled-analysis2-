package com.qualtrics.digital.theming.fonts;

import bo.app.af$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class FontTheme {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_FONT_RES = 0;
    public static final int DEFAULT_FONT_SIZE = 16;
    private final int fontRes;
    private final int size;

    public final int component1() {
        return this.fontRes;
    }

    public final int component2() {
        return this.size;
    }

    public final int getFontRes() {
        return this.fontRes;
    }

    public final int getSize() {
        return this.size;
    }

    public final boolean hasCustomTypeface() {
        return !hasDefaultTypeface();
    }

    public final boolean hasDefaultTypeface() {
        return this.fontRes == 0;
    }

    public final FontTheme copy(int i, int i2) {
        return new FontTheme(i, i2);
    }

    public int hashCode() {
        return Integer.hashCode(this.size) + (Integer.hashCode(this.fontRes) * 31);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static /* synthetic */ FontTheme copy$default(FontTheme fontTheme, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = fontTheme.fontRes;
        }
        if ((i3 & 2) != 0) {
            i2 = fontTheme.size;
        }
        return fontTheme.copy(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FontTheme)) {
            return false;
        }
        FontTheme fontTheme = (FontTheme) obj;
        return this.fontRes == fontTheme.fontRes && this.size == fontTheme.size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FontTheme(fontRes=");
        sb.append(this.fontRes);
        sb.append(", size=");
        return af$$ExternalSyntheticOutline0.m(sb, this.size, ')');
    }

    public /* synthetic */ FontTheme(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 16 : i2);
    }

    public FontTheme(int i, int i2) {
        this.fontRes = i;
        this.size = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FontTheme() {
        int i = 0;
        this(i, i, 3, null);
    }
}
