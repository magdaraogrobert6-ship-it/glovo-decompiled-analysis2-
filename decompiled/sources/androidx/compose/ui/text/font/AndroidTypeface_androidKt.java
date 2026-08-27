package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.platform.AndroidDefaultTypeface;
import androidx.compose.ui.text.platform.AndroidFontListTypeface;
import androidx.compose.ui.text.platform.AndroidGenericFontFamilyTypeface;
import androidx.compose.ui.text.platform.AndroidTypefaceWrapper;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import o.onItemDismisslambda0;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidTypeface_androidKt {
    public static final FontFamily FontFamily(android.graphics.Typeface typeface) {
        return FontFamilyKt.FontFamily(Typeface(typeface));
    }

    public static /* synthetic */ Typeface Typeface$default(Context context, FontFamily fontFamily, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            list = null;
        }
        return Typeface(context, fontFamily, list);
    }

    @onItemDismisslambda0
    public static final Typeface Typeface(Context context, FontFamily fontFamily, List<onViewAttachedToWindowlambda0> list) {
        if (fontFamily instanceof FontListFontFamily) {
            return new AndroidFontListTypeface((FontListFontFamily) fontFamily, context, list, null, 8, null);
        }
        if (fontFamily instanceof GenericFontFamily) {
            return new AndroidGenericFontFamilyTypeface((GenericFontFamily) fontFamily);
        }
        if (fontFamily instanceof DefaultFontFamily) {
            return new AndroidDefaultTypeface();
        }
        if (fontFamily instanceof LoadedFontFamily) {
            return ((LoadedFontFamily) fontFamily).getTypeface();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }

    public static final Typeface Typeface(android.graphics.Typeface typeface) {
        return new AndroidTypefaceWrapper(typeface);
    }
}
