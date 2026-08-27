package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.Locale;

/* JADX INFO: loaded from: classes4.dex */
public interface PlatformStringDelegate {
    String capitalize(String str, Locale locale);

    String decapitalize(String str, Locale locale);

    String toLowerCase(String str, Locale locale);

    String toUpperCase(String str, Locale locale);
}
