package androidx.compose.ui.res;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.font.Typeface;
import o.getBirthDateFull;
import o.getNewPassword;
import o.getPostalCode;
import o.onItemDismisslambda0;
import o.onRemeasuredozmzZPI;

/* JADX INFO: loaded from: classes4.dex */
public final class FontResources_androidKt {
    private static final Object cacheLock = new Object();
    private static final onRemeasuredozmzZPI syncLoadedTypefaces = new onRemeasuredozmzZPI();

    @onItemDismisslambda0
    public static final Typeface fontResource(FontFamily fontFamily, getBirthDateFull getbirthdatefull, int i) {
        return fontResourceFromContext((Context) ((getPostalCode) getbirthdatefull).write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()), fontFamily);
    }

    @onItemDismisslambda0
    private static final Typeface fontResourceFromContext(Context context, FontFamily fontFamily) {
        Typeface typeface;
        if (!(fontFamily instanceof SystemFontFamily) && !(fontFamily instanceof LoadedFontFamily)) {
            return AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
        }
        synchronized (cacheLock) {
            onRemeasuredozmzZPI onremeasuredozmzzpi = syncLoadedTypefaces;
            Object objMediaBrowserCompatMediaItem = onremeasuredozmzzpi.MediaBrowserCompatMediaItem(fontFamily);
            if (objMediaBrowserCompatMediaItem == null) {
                objMediaBrowserCompatMediaItem = AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
                onremeasuredozmzzpi.write(fontFamily, objMediaBrowserCompatMediaItem);
            }
            typeface = (Typeface) objMediaBrowserCompatMediaItem;
        }
        return typeface;
    }
}
