package androidx.compose.ui.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class PlatformTextStyle {
    public static final int $stable = 0;
    private final PlatformParagraphStyle paragraphStyle;
    private final PlatformSpanStyle spanStyle;

    public final PlatformParagraphStyle getParagraphStyle() {
        return this.paragraphStyle;
    }

    public final PlatformSpanStyle getSpanStyle() {
        return this.spanStyle;
    }

    public PlatformTextStyle(boolean z) {
        this((PlatformSpanStyle) null, new PlatformParagraphStyle(z));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformTextStyle)) {
            return false;
        }
        PlatformTextStyle platformTextStyle = (PlatformTextStyle) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paragraphStyle, platformTextStyle.paragraphStyle}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.spanStyle, platformTextStyle.spanStyle}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.spanStyle + ", paragraphSyle=" + this.paragraphStyle + ')';
    }

    public int hashCode() {
        PlatformSpanStyle platformSpanStyle = this.spanStyle;
        int iHashCode = platformSpanStyle != null ? platformSpanStyle.hashCode() : 0;
        PlatformParagraphStyle platformParagraphStyle = this.paragraphStyle;
        return (iHashCode * 31) + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0);
    }

    public PlatformTextStyle(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        this.spanStyle = platformSpanStyle;
        this.paragraphStyle = platformParagraphStyle;
    }

    public /* synthetic */ PlatformTextStyle(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public /* synthetic */ PlatformTextStyle(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    private PlatformTextStyle(int i) {
        this((PlatformSpanStyle) null, new PlatformParagraphStyle(i, (DefaultConstructorMarker) null));
    }
}
