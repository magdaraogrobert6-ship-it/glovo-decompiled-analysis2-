package o;

/* JADX INFO: loaded from: classes.dex */
public final class MediaQuery_androidKtobtainUiMediaScope41 implements PagerMeasurePolicyKtrememberPagerMeasurePolicy11 {
    public final long IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final float write;

    @Override // o.PagerMeasurePolicyKtrememberPagerMeasurePolicy11
    public final androidx.compose.ui.node.DelegatableNode IconCompatParcelizer(androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl) {
        return new androidx.compose.material3.DelegatingThemeAwareRippleNode(mutableInteractionSourceImpl, this.RemoteActionCompatParcelizer, this.write, new MediaQuery_androidKtobtainUiMediaScope41invokeinlinedonDispose1(this));
    }

    @Override // o.PagerMeasurePolicyKtrememberPagerMeasurePolicy11
    public final int hashCode() {
        return androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.IconCompatParcelizer) + getBitmapFromCache.serializer(this.write, Boolean.hashCode(this.RemoteActionCompatParcelizer) * 31, 961);
    }

    public MediaQuery_androidKtobtainUiMediaScope41(float f, long j, boolean z) {
        this.RemoteActionCompatParcelizer = z;
        this.write = f;
        this.IconCompatParcelizer = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQuery_androidKtobtainUiMediaScope41)) {
            return false;
        }
        MediaQuery_androidKtobtainUiMediaScope41 mediaQuery_androidKtobtainUiMediaScope41 = (MediaQuery_androidKtobtainUiMediaScope41) obj;
        if (this.RemoteActionCompatParcelizer == mediaQuery_androidKtobtainUiMediaScope41.RemoteActionCompatParcelizer && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.write, mediaQuery_androidKtobtainUiMediaScope41.write)) {
            return androidx.compose.ui.graphics.Color.m723equalsimpl0(this.IconCompatParcelizer, mediaQuery_androidKtobtainUiMediaScope41.IconCompatParcelizer);
        }
        return false;
    }
}
