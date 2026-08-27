package androidx.compose.ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidFontKt {
    private static final void generateAndroidFontKtForApiCompatibility() {
    }

    /* JADX INFO: renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m3138FontEj4NQ78$default(File file, FontWeight fontWeight, int i, FontVariation.Settings settings, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = FontStyle.Companion.m3197getNormal_LCdwA();
        }
        if ((i2 & 8) != 0) {
            settings = FontVariation.INSTANCE.m3213Settings6EWAqTQ(fontWeight, i, new FontVariation.Setting[0]);
        }
        return m3136FontEj4NQ78(file, fontWeight, i, settings);
    }

    /* JADX INFO: renamed from: Font-MuC2MFs$default, reason: not valid java name */
    public static /* synthetic */ Font m3140FontMuC2MFs$default(String str, AssetManager assetManager, FontWeight fontWeight, int i, FontVariation.Settings settings, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i2 & 8) != 0) {
            i = FontStyle.Companion.m3197getNormal_LCdwA();
        }
        if ((i2 & 16) != 0) {
            settings = FontVariation.INSTANCE.m3213Settings6EWAqTQ(fontWeight, i, new FontVariation.Setting[0]);
        }
        return m3139FontMuC2MFs(str, assetManager, fontWeight, i, settings);
    }

    /* JADX INFO: renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m3136FontEj4NQ78(File file, FontWeight fontWeight, int i, FontVariation.Settings settings) {
        return new AndroidFileFont(file, fontWeight, i, settings, null);
    }

    /* JADX INFO: renamed from: Font-MuC2MFs, reason: not valid java name */
    public static final Font m3139FontMuC2MFs(String str, AssetManager assetManager, FontWeight fontWeight, int i, FontVariation.Settings settings) {
        return new AndroidAssetFont(assetManager, str, fontWeight, i, settings, null);
    }

    /* JADX INFO: renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m3135FontEj4NQ78(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i, FontVariation.Settings settings) {
        return new AndroidFileDescriptorFont(parcelFileDescriptor, fontWeight, i, settings, null);
    }

    /* JADX INFO: renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m3137FontEj4NQ78$default(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i, FontVariation.Settings settings, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = FontStyle.Companion.m3197getNormal_LCdwA();
        }
        if ((i2 & 8) != 0) {
            settings = FontVariation.INSTANCE.m3213Settings6EWAqTQ(fontWeight, i, new FontVariation.Setting[0]);
        }
        return m3135FontEj4NQ78(parcelFileDescriptor, fontWeight, i, settings);
    }
}
