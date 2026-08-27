package androidx.compose.ui.text.font;

import bo.app.af$$ExternalSyntheticOutline0;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidFontResolveInterceptor implements PlatformResolveInterceptor {
    public static final int $stable = 0;
    private final int fontWeightAdjustment;

    private final int component1() {
        return this.fontWeightAdjustment;
    }

    public final AndroidFontResolveInterceptor copy(int i) {
        return new AndroidFontResolveInterceptor(i);
    }

    public int hashCode() {
        return Integer.hashCode(this.fontWeightAdjustment);
    }

    public AndroidFontResolveInterceptor(int i) {
        this.fontWeightAdjustment = i;
    }

    public static /* synthetic */ AndroidFontResolveInterceptor copy$default(AndroidFontResolveInterceptor androidFontResolveInterceptor, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = androidFontResolveInterceptor.fontWeightAdjustment;
        }
        return androidFontResolveInterceptor.copy(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AndroidFontResolveInterceptor) && this.fontWeightAdjustment == ((AndroidFontResolveInterceptor) obj).fontWeightAdjustment;
    }

    public String toString() {
        return af$$ExternalSyntheticOutline0.m(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.fontWeightAdjustment, ')');
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    public FontWeight interceptFontWeight(FontWeight fontWeight) {
        int i = this.fontWeightAdjustment;
        return (i == 0 || i == Integer.MAX_VALUE) ? fontWeight : new FontWeight(RangesKt.RemoteActionCompatParcelizer(fontWeight.getWeight() + this.fontWeightAdjustment, 1, 1000));
    }
}
