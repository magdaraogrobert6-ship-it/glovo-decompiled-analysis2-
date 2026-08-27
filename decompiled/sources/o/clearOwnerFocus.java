package o;

import android.net.Uri;
import android.text.TextUtils;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class clearOwnerFocus extends dispatchIndirectPointerCancel {
    @Override // o.dispatchIndirectPointerCancel
    public final android.graphics.fonts.Font bH_(FocusOwnerdispatchRotaryEvent1 focusOwnerdispatchRotaryEvent1) {
        android.graphics.fonts.Font fontBu_;
        Uri uri = focusOwnerdispatchRotaryEvent1.write;
        boolean zEquals = Objects.equals(uri.getScheme(), "systemfont");
        String str = focusOwnerdispatchRotaryEvent1.IconCompatParcelizer;
        String authority = zEquals ? uri.getAuthority() : null;
        if (authority != null) {
            android.graphics.Typeface typefaceCreate = android.graphics.Typeface.create(authority, 0);
            android.graphics.Typeface typefaceCreate2 = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0);
            if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null && (fontBu_ = FocusOrderModifierKtfocusOrder1.bu_(typefaceCreate)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return fontBu_;
                }
                try {
                    return new android.graphics.fonts.Font.Builder(fontBu_).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    SentryLogcatAdapter.serializer("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
