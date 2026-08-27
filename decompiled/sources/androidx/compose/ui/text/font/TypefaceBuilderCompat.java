package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
final class TypefaceBuilderCompat {
    public static final TypefaceBuilderCompat INSTANCE = new TypefaceBuilderCompat();

    private TypefaceBuilderCompat() {
    }

    @ExperimentalTextApi
    private final FontVariationAxis[] toVariationSettings(FontVariation.Settings settings, Context context) {
        Density Density;
        if (context != null) {
            Density = AndroidDensity_androidKt.Density(context);
        } else {
            if (settings.getNeedsDensity$ui_text()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required density, but not provided");
                return null;
            }
            Density = DensityKt.Density(1.0f, 1.0f);
        }
        return PlatformFontVariationSettings_androidKt.toAndroidArray(settings, Density, PlatformFontVariationSettings_androidKt.getFontWeightAdjustment(context));
    }

    @ExperimentalTextApi
    public final android.graphics.Typeface createFromAssets(AssetManager assetManager, String str, Context context, FontVariation.Settings settings) {
        if (context == null) {
            return null;
        }
        return new android.graphics.Typeface.Builder(assetManager, str).setFontVariationSettings(toVariationSettings(settings, context)).build();
    }

    @ExperimentalTextApi
    public final android.graphics.Typeface createFromFile(File file, Context context, FontVariation.Settings settings) {
        if (context == null) {
            return null;
        }
        return new android.graphics.Typeface.Builder(file).setFontVariationSettings(toVariationSettings(settings, context)).build();
    }

    @ExperimentalTextApi
    public final android.graphics.Typeface createFromFileDescriptor(ParcelFileDescriptor parcelFileDescriptor, Context context, FontVariation.Settings settings) {
        if (context == null) {
            return null;
        }
        return new android.graphics.Typeface.Builder(parcelFileDescriptor.getFileDescriptor()).setFontVariationSettings(toVariationSettings(settings, context)).build();
    }
}
