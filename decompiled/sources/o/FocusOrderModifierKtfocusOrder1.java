package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.text.TextUtils;
import androidx.core.content.res.ResourcesCompat$FontCallback;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class FocusOrderModifierKtfocusOrder1 {
    public static final RangesKt RemoteActionCompatParcelizer;
    public static android.graphics.Paint read;
    public static final androidx.collection.LruCache serializer;

    static {
        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            RemoteActionCompatParcelizer = new clearOwnerFocus();
        } else if (i >= 29) {
            RemoteActionCompatParcelizer = new dispatchIndirectPointerCancel();
        } else {
            RemoteActionCompatParcelizer = new clearFocusI7lrPNg();
        }
        serializer = new androidx.collection.LruCache(16);
        read = null;
        Trace.endSection();
    }

    public static String RemoteActionCompatParcelizer(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static android.graphics.Typeface write(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        android.graphics.Typeface typefaceCreate = android.graphics.Typeface.create(str, 0);
        android.graphics.Typeface typefaceCreate2 = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }

    public static android.graphics.Typeface serializer(Context context, focusTarget focustarget, Resources resources, int i, String str, int i2, int i3, ResourcesCompat$FontCallback resourcesCompat$FontCallback, boolean z) {
        android.graphics.Typeface typefaceRemoteActionCompatParcelizer;
        android.graphics.Typeface typefaceBuild;
        android.graphics.fonts.FontFamily fontFamilyBuild;
        boolean z2 = focustarget instanceof setEnd;
        androidx.collection.LruCache lruCache = serializer;
        if (z2) {
            setEnd setend = (setEnd) focustarget;
            String strWrite = setend.write();
            boolean z3 = false;
            if (TextUtils.isEmpty(strWrite) || (typefaceBuild = write(strWrite)) == null) {
                ArrayList arrayList = (ArrayList) setend.read();
                if (arrayList.size() == 1) {
                    typefaceBuild = write(((scheduleInvalidationForOwner) arrayList.get(0)).MediaBrowserCompatMediaItem);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList.size()) {
                                android.graphics.Typeface.CustomFallbackBuilder customFallbackBuilderBB_ = null;
                                int i5 = 0;
                                while (true) {
                                    if (i5 < arrayList.size()) {
                                        scheduleInvalidationForOwner scheduleinvalidationforowner = (scheduleInvalidationForOwner) arrayList.get(i5);
                                        if (i5 == arrayList.size() - 1 && TextUtils.isEmpty(scheduleinvalidationforowner.MediaMetadataCompat)) {
                                            customFallbackBuilderBB_.setSystemFallback(scheduleinvalidationforowner.MediaBrowserCompatMediaItem);
                                        } else {
                                            String str2 = scheduleinvalidationforowner.MediaBrowserCompatMediaItem;
                                            String str3 = scheduleinvalidationforowner.MediaMetadataCompat;
                                            android.graphics.fonts.Font fontBu_ = bu_(write(str2));
                                            if (fontBu_ == null) {
                                                SentryLogcatAdapter.IconCompatParcelizer("TypefaceCompat", "Unable identify the primary font for " + scheduleinvalidationforowner.MediaBrowserCompatMediaItem + ". Falling back to provider font.");
                                            } else {
                                                if (!TextUtils.isEmpty(str3)) {
                                                    try {
                                                        apply.IconCompatParcelizer();
                                                        dispatchRotaryEventdefault.write();
                                                        fontFamilyBuild = FocusOrderModifierKtfocusOrder2.bw_(FocusOrderToProperties.bv_(fontBu_).setFontVariationSettings(str3).build()).build();
                                                    } catch (IOException unused) {
                                                        SentryLogcatAdapter.serializer("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                } else {
                                                    fontFamilyBuild = getFocusOrderReceiver.bx_(fontBu_).build();
                                                }
                                                if (customFallbackBuilderBB_ == null) {
                                                    customFallbackBuilderBB_ = FocusOwner.bB_(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilderBB_.addCustomFallback(fontFamilyBuild);
                                                }
                                                i5++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilderBB_.build();
                                    break;
                                }
                            }
                            if (write(((scheduleInvalidationForOwner) arrayList.get(i4)).MediaBrowserCompatMediaItem) != null) {
                                i4++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
            }
            if (typefaceBuild != null) {
                if (resourcesCompat$FontCallback != null) {
                    resourcesCompat$FontCallback.callbackSuccessAsync(typefaceBuild, null);
                }
                lruCache.put(RemoteActionCompatParcelizer(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            boolean z4 = !z ? resourcesCompat$FontCallback != null : setend.IconCompatParcelizer() != 0;
            int iRemoteActionCompatParcelizer = z ? setend.RemoteActionCompatParcelizer() : -1;
            Handler handler = ResourcesCompat$FontCallback.getHandler(null);
            androidx.camera.view.PendingValue pendingValue = new androidx.camera.view.PendingValue(24, resourcesCompat$FontCallback);
            List list = setend.read();
            colorResource colorresource = new colorResource(pendingValue, getLocalBitmaplambda2.IconCompatParcelizer(handler), z3, 10);
            if (z4) {
                ArrayList arrayList2 = (ArrayList) list;
                if (arrayList2.size() <= 1) {
                    typefaceRemoteActionCompatParcelizer = setFocusCaptured.RemoteActionCompatParcelizer(context, (scheduleInvalidationForOwner) arrayList2.get(0), colorresource, i3, iRemoteActionCompatParcelizer);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
            } else {
                typefaceRemoteActionCompatParcelizer = setFocusCaptured.read(context, list, i3, colorresource);
            }
        } else {
            typefaceRemoteActionCompatParcelizer = RemoteActionCompatParcelizer.read(context, (FocusOrder) focustarget, resources, i3);
            if (resourcesCompat$FontCallback != null) {
                if (typefaceRemoteActionCompatParcelizer != null) {
                    resourcesCompat$FontCallback.callbackSuccessAsync(typefaceRemoteActionCompatParcelizer, null);
                } else {
                    resourcesCompat$FontCallback.callbackFailAsync(-3, null);
                }
            }
        }
        if (typefaceRemoteActionCompatParcelizer != null) {
            lruCache.put(RemoteActionCompatParcelizer(resources, i, str, i2, i3), typefaceRemoteActionCompatParcelizer);
        }
        return typefaceRemoteActionCompatParcelizer;
    }

    public static android.graphics.fonts.Font bu_(android.graphics.Typeface typeface) {
        if (read == null) {
            read = new android.graphics.Paint();
        }
        read.setTextSize(10.0f);
        read.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, read);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
