package com.mapbox.maps;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import androidx.sqlite.SQLite;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class FontUtils {
    private static final String TAG = "Mbgl-FontUtils";
    private static final String TYPEFACE_FONTMAP_FIELD_NAME = "sSystemFontMap";
    public static final FontUtils INSTANCE = new FontUtils();
    private static final String DEFAULT_FONT = "sans-serif";
    private static final List<String> DEFAULT_FONT_STACKS = SQLite.read(DEFAULT_FONT, "serif", "monospace");

    private FontUtils() {
    }

    @SuppressLint
    private final List<String> getDeviceFonts() {
        ArrayList arrayList = new ArrayList();
        try {
            Typeface typefaceCreate = Typeface.create(Typeface.DEFAULT, 0);
            Field declaredField = Typeface.class.getDeclaredField(TYPEFACE_FONTMAP_FIELD_NAME);
            declaredField.getClass();
            declaredField.setAccessible(true);
            Object obj = declaredField.get(typefaceCreate);
            obj.getClass();
            arrayList.addAll(((java.util.Map) obj).keySet());
            return arrayList;
        } catch (Exception e) {
            SentryLogcatAdapter.serializer(TAG, "Couldn't load fonts from Typeface: " + e);
            return arrayList;
        }
    }

    public final String extractValidFont(String str) {
        List<String> deviceFonts = getDeviceFonts();
        if (deviceFonts == null || deviceFonts.isEmpty()) {
            deviceFonts = DEFAULT_FONT_STACKS;
        }
        return (str == null || !deviceFonts.contains(str)) ? DEFAULT_FONT : str;
    }
}
