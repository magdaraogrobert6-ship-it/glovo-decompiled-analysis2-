package androidx.compose.ui.text.font;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.IconCompatParcelizer;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class TypefaceRequest {
    public static final int $stable = 8;
    private final FontFamily fontFamily;
    private final int fontStyle;
    private final int fontSynthesis;
    private final FontWeight fontWeight;
    private final Object resourceLoaderCacheKey;

    public final FontFamily component1() {
        return this.fontFamily;
    }

    public final FontWeight component2() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: component3-_-LCdwA, reason: not valid java name */
    public final int m3234component3_LCdwA() {
        return this.fontStyle;
    }

    /* JADX INFO: renamed from: component4-GVVA2EU, reason: not valid java name */
    public final int m3235component4GVVA2EU() {
        return this.fontSynthesis;
    }

    public final Object component5() {
        return this.resourceLoaderCacheKey;
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    /* JADX INFO: renamed from: getFontStyle-_-LCdwA, reason: not valid java name */
    public final int m3237getFontStyle_LCdwA() {
        return this.fontStyle;
    }

    /* JADX INFO: renamed from: getFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m3238getFontSynthesisGVVA2EU() {
        return this.fontSynthesis;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public final Object getResourceLoaderCacheKey() {
        return this.resourceLoaderCacheKey;
    }

    private TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj) {
        this.fontFamily = fontFamily;
        this.fontWeight = fontWeight;
        this.fontStyle = i;
        this.fontSynthesis = i2;
        this.resourceLoaderCacheKey = obj;
    }

    /* JADX INFO: renamed from: copy-e1PVR60$default, reason: not valid java name */
    public static /* synthetic */ TypefaceRequest m3233copye1PVR60$default(TypefaceRequest typefaceRequest, FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            fontFamily = typefaceRequest.fontFamily;
        }
        if ((i3 & 2) != 0) {
            fontWeight = typefaceRequest.fontWeight;
        }
        FontWeight fontWeight2 = fontWeight;
        if ((i3 & 4) != 0) {
            i = typefaceRequest.fontStyle;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = typefaceRequest.fontSynthesis;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            obj = typefaceRequest.resourceLoaderCacheKey;
        }
        return typefaceRequest.m3236copye1PVR60(fontFamily, fontWeight2, i4, i5, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fontFamily, typefaceRequest.fontFamily}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fontWeight, typefaceRequest.fontWeight}, getCieXyz.write())).booleanValue() || !FontStyle.m3190equalsimpl0(this.fontStyle, typefaceRequest.fontStyle) || !FontSynthesis.m3201equalsimpl0(this.fontSynthesis, typefaceRequest.fontSynthesis)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.resourceLoaderCacheKey, typefaceRequest.resourceLoaderCacheKey}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.fontFamily);
        sb.append(", fontWeight=");
        sb.append(this.fontWeight);
        sb.append(", fontStyle=");
        sb.append((Object) FontStyle.m3192toStringimpl(this.fontStyle));
        sb.append(", fontSynthesis=");
        sb.append((Object) FontSynthesis.m3205toStringimpl(this.fontSynthesis));
        sb.append(", resourceLoaderCacheKey=");
        return IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.resourceLoaderCacheKey, ')');
    }

    public int hashCode() {
        FontFamily fontFamily = this.fontFamily;
        int iHashCode = fontFamily == null ? 0 : fontFamily.hashCode();
        int iHashCode2 = this.fontWeight.hashCode();
        int iM3191hashCodeimpl = FontStyle.m3191hashCodeimpl(this.fontStyle);
        int iM3202hashCodeimpl = FontSynthesis.m3202hashCodeimpl(this.fontSynthesis);
        Object obj = this.resourceLoaderCacheKey;
        return ((iM3202hashCodeimpl + ((iM3191hashCodeimpl + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31) + (obj != null ? obj.hashCode() : 0);
    }

    /* JADX INFO: renamed from: copy-e1PVR60, reason: not valid java name */
    public final TypefaceRequest m3236copye1PVR60(FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj) {
        return new TypefaceRequest(fontFamily, fontWeight, i, i2, obj, null);
    }

    public /* synthetic */ TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontFamily, fontWeight, i, i2, obj);
    }
}
