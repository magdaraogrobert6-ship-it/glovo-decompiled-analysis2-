package com.mapbox.navigation.core.navigator.offline;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TilesetReleaseDateParser {
    public static final SimpleDateFormat VERSION_NAME_DATE_FORMATTER;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        simpleDateFormat.setLenient(false);
        VERSION_NAME_DATE_FORMATTER = simpleDateFormat;
    }
}
