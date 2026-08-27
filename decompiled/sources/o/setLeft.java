package o;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.core.content.res.ResourcesCompat$FontCallback;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class setLeft {
    public static final ThreadLocal read = new ThreadLocal();
    public static final WeakHashMap serializer = new WeakHashMap(0);
    public static final Object write = new Object();

    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    public static android.graphics.Typeface RemoteActionCompatParcelizer(Context context, int i, TypedValue typedValue, int i2, ResourcesCompat$FontCallback resourcesCompat$FontCallback, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        android.graphics.Typeface typefaceSerializer = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            androidx.collection.LruCache lruCache = FocusOrderModifierKtfocusOrder1.serializer;
            android.graphics.Typeface typefaceIconCompatParcelizer = (android.graphics.Typeface) lruCache.get(FocusOrderModifierKtfocusOrder1.RemoteActionCompatParcelizer(resources, i, string, i3, i2));
            if (typefaceIconCompatParcelizer != null) {
                if (resourcesCompat$FontCallback != null) {
                    resourcesCompat$FontCallback.callbackSuccessAsync(typefaceIconCompatParcelizer, null);
                }
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        focusTarget focustargetWrite = io.sentry.android.replay.util.MediaDescriptionCompat.write(resources.getXml(i), resources);
                        if (focustargetWrite == null) {
                            SentryLogcatAdapter.serializer("ResourcesCompat", "Failed to find font-family tag");
                            if (resourcesCompat$FontCallback != null) {
                                resourcesCompat$FontCallback.callbackFailAsync(-3, null);
                            }
                        } else {
                            typefaceSerializer = FocusOrderModifierKtfocusOrder1.serializer(context, focustargetWrite, resources, i, string, typedValue.assetCookie, i2, resourcesCompat$FontCallback, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        typefaceIconCompatParcelizer = FocusOrderModifierKtfocusOrder1.RemoteActionCompatParcelizer.IconCompatParcelizer(context, resources, i, string);
                        if (typefaceIconCompatParcelizer != null) {
                            lruCache.put(FocusOrderModifierKtfocusOrder1.RemoteActionCompatParcelizer(resources, i, string, i4, i2), typefaceIconCompatParcelizer);
                        }
                        if (resourcesCompat$FontCallback != null) {
                            if (typefaceIconCompatParcelizer != null) {
                                resourcesCompat$FontCallback.callbackSuccessAsync(typefaceIconCompatParcelizer, null);
                            } else {
                                resourcesCompat$FontCallback.callbackFailAsync(-3, null);
                            }
                        }
                    }
                } catch (IOException e) {
                    SentryLogcatAdapter.read("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (resourcesCompat$FontCallback != null) {
                        resourcesCompat$FontCallback.callbackFailAsync(-3, null);
                    }
                } catch (XmlPullParserException e2) {
                    SentryLogcatAdapter.read("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (resourcesCompat$FontCallback != null) {
                        resourcesCompat$FontCallback.callbackFailAsync(-3, null);
                    }
                }
            }
            typefaceSerializer = typefaceIconCompatParcelizer;
        } else if (resourcesCompat$FontCallback != null) {
            resourcesCompat$FontCallback.callbackFailAsync(-3, null);
        }
        if (typefaceSerializer != null || resourcesCompat$FontCallback != null || z2) {
            return typefaceSerializer;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    public static android.graphics.Typeface serializer(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return RemoteActionCompatParcelizer(context, i, new TypedValue(), 0, null, false, false);
    }
}
