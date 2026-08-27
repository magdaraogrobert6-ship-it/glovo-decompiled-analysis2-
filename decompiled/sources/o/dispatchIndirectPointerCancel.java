package o;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public class dispatchIndirectPointerCancel extends RangesKt {
    @Override // kotlin.ranges.RangesKt
    public final android.graphics.Typeface read(Context context, FocusOrder focusOrder, Resources resources, int i) {
        try {
            android.graphics.fonts.FontFamily.Builder builder = null;
            for (getNext getnext : focusOrder.read()) {
                try {
                    android.graphics.fonts.Font fontBuild = new android.graphics.fonts.Font.Builder(resources, getnext.RemoteActionCompatParcelizer()).setWeight(getnext.IconCompatParcelizer()).setSlant(getnext.read() ? 1 : 0).setTtcIndex(getnext.serializer()).setFontVariationSettings(getnext.write()).build();
                    if (builder == null) {
                        builder = new android.graphics.fonts.FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            android.graphics.fonts.FontFamily fontFamilyBuild = builder.build();
            return new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(bD_(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            SentryLogcatAdapter.write("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // kotlin.ranges.RangesKt
    public final android.graphics.Typeface IconCompatParcelizer(Context context, Resources resources, int i, String str) {
        try {
            android.graphics.fonts.Font fontBuild = new android.graphics.fonts.Font.Builder(resources, i).build();
            return new android.graphics.Typeface.CustomFallbackBuilder(new android.graphics.fonts.FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            SentryLogcatAdapter.write("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public static int bE_(android.graphics.fonts.FontStyle fontStyle, android.graphics.fonts.FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public android.graphics.fonts.Font bH_(FocusOwnerdispatchRotaryEvent1 focusOwnerdispatchRotaryEvent1) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // kotlin.ranges.RangesKt
    public final android.graphics.Typeface read(Context context, FocusOwnerdispatchRotaryEvent1[] focusOwnerdispatchRotaryEvent1Arr, int i) {
        try {
            android.graphics.fonts.FontFamily fontFamilyBF_ = bF_(focusOwnerdispatchRotaryEvent1Arr, context.getContentResolver());
            if (fontFamilyBF_ == null) {
                return null;
            }
            return new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyBF_).setStyle(bD_(fontFamilyBF_, i).getStyle()).build();
        } catch (Exception e) {
            SentryLogcatAdapter.write("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public final android.graphics.fonts.FontFamily bF_(FocusOwnerdispatchRotaryEvent1[] focusOwnerdispatchRotaryEvent1Arr, ContentResolver contentResolver) {
        android.graphics.fonts.Font fontBuild;
        android.graphics.fonts.FontFamily.Builder builder = null;
        for (FocusOwnerdispatchRotaryEvent1 focusOwnerdispatchRotaryEvent1 : focusOwnerdispatchRotaryEvent1Arr) {
            if (Objects.equals(focusOwnerdispatchRotaryEvent1.write.getScheme(), "systemfont")) {
                fontBuild = bH_(focusOwnerdispatchRotaryEvent1);
            } else {
                try {
                    Uri uri = focusOwnerdispatchRotaryEvent1.write;
                    String str = focusOwnerdispatchRotaryEvent1.IconCompatParcelizer;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            android.graphics.fonts.Font.Builder ttcIndex = new android.graphics.fonts.Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(focusOwnerdispatchRotaryEvent1.MediaSessionCompatQueueItem).setSlant(focusOwnerdispatchRotaryEvent1.RemoteActionCompatParcelizer ? 1 : 0).setTtcIndex(focusOwnerdispatchRotaryEvent1.serializer);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    SentryLogcatAdapter.write("TypefaceCompatApi29Impl", "Font load failed", e);
                    fontBuild = null;
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new android.graphics.fonts.FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    @Override // kotlin.ranges.RangesKt
    public final android.graphics.Typeface read(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            android.graphics.fonts.FontFamily fontFamilyBF_ = bF_((FocusOwnerdispatchRotaryEvent1[]) list.get(0), contentResolver);
            if (fontFamilyBF_ == null) {
                return null;
            }
            android.graphics.Typeface.CustomFallbackBuilder customFallbackBuilder = new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyBF_);
            for (int i2 = 1; i2 < list.size(); i2++) {
                android.graphics.fonts.FontFamily fontFamilyBF_2 = bF_((FocusOwnerdispatchRotaryEvent1[]) list.get(i2), contentResolver);
                if (fontFamilyBF_2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyBF_2);
                }
            }
            return customFallbackBuilder.setStyle(bD_(fontFamilyBF_, i).getStyle()).build();
        } catch (Exception e) {
            SentryLogcatAdapter.write("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public static android.graphics.fonts.Font bD_(android.graphics.fonts.FontFamily fontFamily, int i) {
        android.graphics.fonts.FontStyle fontStyle = new android.graphics.fonts.FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        android.graphics.fonts.Font font = fontFamily.getFont(0);
        int iBE_ = bE_(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            android.graphics.fonts.Font font2 = fontFamily.getFont(i2);
            int iBE_2 = bE_(fontStyle, font2.getStyle());
            if (iBE_2 < iBE_) {
                font = font2;
                iBE_ = iBE_2;
            }
        }
        return font;
    }
}
