package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidAssetFont extends AndroidPreloadedFont {
    public static final int $stable = 0;
    private final AssetManager assetManager;
    private final String cacheKey;
    private final String path;

    private AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i, FontVariation.Settings settings) {
        super(fontWeight, i, settings, null);
        this.assetManager = assetManager;
        this.path = str;
        setTypeface$ui_text(doLoad$ui_text(null));
        this.cacheKey = "asset:" + str;
    }

    public final AssetManager getAssetManager() {
        return this.assetManager;
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    public String getCacheKey() {
        return this.cacheKey;
    }

    public final String getPath() {
        return this.path;
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    public android.graphics.Typeface doLoad$ui_text(Context context) {
        return TypefaceBuilderCompat.INSTANCE.createFromAssets(this.assetManager, this.path, context, getVariationSettings());
    }

    public int hashCode() {
        return getVariationSettings().hashCode() + (this.path.hashCode() * 31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidAssetFont)) {
            return false;
        }
        AndroidAssetFont androidAssetFont = (AndroidAssetFont) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.path, androidAssetFont.path}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getVariationSettings(), androidAssetFont.getVariationSettings()}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "Font(assetManager, path=" + this.path + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m3192toStringimpl(mo3142getStyle_LCdwA())) + ')';
    }

    public /* synthetic */ AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i, FontVariation.Settings settings, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetManager, str, fontWeight, i, settings);
    }

    public /* synthetic */ AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i, FontVariation.Settings settings, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetManager, str, (i2 & 4) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i2 & 8) != 0 ? FontStyle.Companion.m3197getNormal_LCdwA() : i, settings, null);
    }
}
