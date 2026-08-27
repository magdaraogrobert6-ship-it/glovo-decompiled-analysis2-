package androidx.compose.ui.text.font;

import androidx.compose.ui.text.ExperimentalTextApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class ResourceFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final int resId;
    private final int style;
    private final FontVariation.Settings variationSettings;
    private final FontWeight weight;

    @ExperimentalTextApi
    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ$annotations, reason: not valid java name */
    public static /* synthetic */ void m3230getLoadingStrategyPKNRLFQ$annotations() {
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ */
    public int mo3134getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    public final int getResId() {
        return this.resId;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: getStyle-_-LCdwA */
    public int mo3142getStyle_LCdwA() {
        return this.style;
    }

    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    @Override // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ResourceFont(int i, FontWeight fontWeight, int i2, FontVariation.Settings settings, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        FontWeight normal = (i4 & 2) != 0 ? FontWeight.Companion.getNormal() : fontWeight;
        int iM3197getNormal_LCdwA = (i4 & 4) != 0 ? FontStyle.Companion.m3197getNormal_LCdwA() : i2;
        this(i, normal, iM3197getNormal_LCdwA, (i4 & 8) != 0 ? FontVariation.INSTANCE.m3213Settings6EWAqTQ(normal, iM3197getNormal_LCdwA, new FontVariation.Setting[0]) : settings, (i4 & 16) != 0 ? FontLoadingStrategy.Companion.m3181getAsyncPKNRLFQ() : i3, null);
    }

    /* JADX INFO: renamed from: copy-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m3228copyF3nL8kk$default(ResourceFont resourceFont, int i, FontWeight fontWeight, int i2, int i3, FontVariation.Settings settings, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = resourceFont.resId;
        }
        if ((i4 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        FontWeight fontWeight2 = fontWeight;
        if ((i4 & 4) != 0) {
            i2 = resourceFont.mo3142getStyle_LCdwA();
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = resourceFont.mo3134getLoadingStrategyPKNRLFQ();
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            settings = resourceFont.variationSettings;
        }
        return resourceFont.m3231copyF3nL8kk(i, fontWeight2, i5, i6, settings);
    }

    /* JADX INFO: renamed from: copy-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m3229copyRetOiIg$default(ResourceFont resourceFont, int i, FontWeight fontWeight, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = resourceFont.resId;
        }
        if ((i3 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i3 & 4) != 0) {
            i2 = resourceFont.mo3142getStyle_LCdwA();
        }
        return resourceFont.m3232copyRetOiIg(i, fontWeight, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) obj;
        if (this.resId != resourceFont.resId) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getWeight(), resourceFont.getWeight()}, getCieXyz.write())).booleanValue() || !FontStyle.m3190equalsimpl0(mo3142getStyle_LCdwA(), resourceFont.mo3142getStyle_LCdwA())) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.variationSettings, resourceFont.variationSettings}, getCieXyz.write())).booleanValue() && FontLoadingStrategy.m3177equalsimpl0(mo3134getLoadingStrategyPKNRLFQ(), resourceFont.mo3134getLoadingStrategyPKNRLFQ());
    }

    public int hashCode() {
        int i = this.resId;
        int iHashCode = getWeight().hashCode();
        int iM3191hashCodeimpl = FontStyle.m3191hashCodeimpl(mo3142getStyle_LCdwA());
        return this.variationSettings.hashCode() + ((FontLoadingStrategy.m3178hashCodeimpl(mo3134getLoadingStrategyPKNRLFQ()) + ((iM3191hashCodeimpl + ((iHashCode + (i * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m3192toStringimpl(mo3142getStyle_LCdwA())) + ", loadingStrategy=" + ((Object) FontLoadingStrategy.m3179toStringimpl(mo3134getLoadingStrategyPKNRLFQ())) + ')';
    }

    @ExperimentalTextApi
    /* JADX INFO: renamed from: copy-F3nL8kk, reason: not valid java name */
    public final ResourceFont m3231copyF3nL8kk(int i, FontWeight fontWeight, int i2, int i3, FontVariation.Settings settings) {
        return new ResourceFont(i, fontWeight, i2, settings, i3, null);
    }

    /* JADX INFO: renamed from: copy-RetOiIg, reason: not valid java name */
    public final ResourceFont m3232copyRetOiIg(int i, FontWeight fontWeight, int i2) {
        return m3228copyF3nL8kk$default(this, i, fontWeight, i2, mo3134getLoadingStrategyPKNRLFQ(), null, 16, null);
    }

    private ResourceFont(int i, FontWeight fontWeight, int i2, FontVariation.Settings settings, int i3) {
        this.resId = i;
        this.weight = fontWeight;
        this.style = i2;
        this.variationSettings = settings;
        this.loadingStrategy = i3;
    }

    public /* synthetic */ ResourceFont(int i, FontWeight fontWeight, int i2, FontVariation.Settings settings, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, fontWeight, i2, settings, i3);
    }
}
