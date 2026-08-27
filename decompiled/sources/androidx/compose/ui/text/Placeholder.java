package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class Placeholder {
    public static final int $stable = 0;
    private final long height;
    private final int placeholderVerticalAlign;
    private final long width;

    /* JADX INFO: renamed from: getHeight-XSAIIZE, reason: not valid java name */
    public final long m2961getHeightXSAIIZE() {
        return this.height;
    }

    /* JADX INFO: renamed from: getPlaceholderVerticalAlign-J6kI3mc, reason: not valid java name */
    public final int m2962getPlaceholderVerticalAlignJ6kI3mc() {
        return this.placeholderVerticalAlign;
    }

    /* JADX INFO: renamed from: getWidth-XSAIIZE, reason: not valid java name */
    public final long m2963getWidthXSAIIZE() {
        return this.width;
    }

    public int hashCode() {
        int iM3868hashCodeimpl = TextUnit.m3868hashCodeimpl(this.width);
        return PlaceholderVerticalAlign.m2968hashCodeimpl(this.placeholderVerticalAlign) + ((TextUnit.m3868hashCodeimpl(this.height) + (iM3868hashCodeimpl * 31)) * 31);
    }

    private Placeholder(long j, long j2, int i) {
        this.width = j;
        this.height = j2;
        this.placeholderVerticalAlign = i;
        if (TextUnit.m3865getRawTypeimpl(j) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("width cannot be TextUnit.Unspecified");
        }
        if (TextUnit.m3865getRawTypeimpl(j2) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }

    /* JADX INFO: renamed from: copy-K8Q-__8$default, reason: not valid java name */
    public static /* synthetic */ Placeholder m2959copyK8Q__8$default(Placeholder placeholder, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = placeholder.width;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = placeholder.height;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = placeholder.placeholderVerticalAlign;
        }
        return placeholder.m2960copyK8Q__8(j3, j4, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) obj;
        return TextUnit.m3864equalsimpl0(this.width, placeholder.width) && TextUnit.m3864equalsimpl0(this.height, placeholder.height) && PlaceholderVerticalAlign.m2967equalsimpl0(this.placeholderVerticalAlign, placeholder.placeholderVerticalAlign);
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) TextUnit.m3874toStringimpl(this.width)) + ", height=" + ((Object) TextUnit.m3874toStringimpl(this.height)) + ", placeholderVerticalAlign=" + ((Object) PlaceholderVerticalAlign.m2969toStringimpl(this.placeholderVerticalAlign)) + ')';
    }

    /* JADX INFO: renamed from: copy-K8Q-__8, reason: not valid java name */
    public final Placeholder m2960copyK8Q__8(long j, long j2, int i) {
        return new Placeholder(j, j2, i, null);
    }

    public /* synthetic */ Placeholder(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, i);
    }
}
