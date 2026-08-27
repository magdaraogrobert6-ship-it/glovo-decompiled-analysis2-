package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import io.sentry.SentryOptions;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class dispatchKeyEventYhN2O0wdefault {
    public static android.graphics.ColorFilter IconCompatParcelizer(Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static void IconCompatParcelizer(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    public static void IconCompatParcelizer(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void IconCompatParcelizer(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    public static void RemoteActionCompatParcelizer(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void RemoteActionCompatParcelizer(Drawable drawable, int i) {
        drawable.setLayoutDirection(i);
    }

    public static int read(getNonefv9h1I getnonefv9h1i) {
        return getnonefv9h1i.getLayoutDirection();
    }

    public static void read(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void read(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean read(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static int serializer(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static void serializer(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static void write(Drawable drawable) {
        drawable.canApplyTheme();
    }

    public static void write(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    public static void write(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0070  */
    /* JADX WARN: Code duplicated, block: B:17:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x007b  */
    /* JADX WARN: Code duplicated, block: B:20:0x007e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ed A[LOOP:0: B:30:0x00e0->B:34:0x00ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0101  */
    /* JADX WARN: Code duplicated, block: B:40:0x010d A[LOOP:1: B:36:0x00ff->B:40:0x010d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0112  */
    public static io.sentry.android.replay.viewhierarchy.IconCompatParcelizer write(View view, io.sentry.android.replay.viewhierarchy.IconCompatParcelizer iconCompatParcelizer, SentryOptions sentryOptions) {
        boolean z;
        Drawable drawable;
        Bitmap bitmap;
        int extendedPaddingTop;
        Object tag;
        String str;
        Class<?> superclass;
        CopyOnWriteArraySet copyOnWriteArraySet;
        Class<?> superclass2;
        CopyOnWriteArraySet copyOnWriteArraySet2;
        String lowerCase;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0IconCompatParcelizer = io.sentry.android.replay.util.MediaSessionCompatToken.IconCompatParcelizer(view);
        boolean zBooleanValue = ((Boolean) onviewattachedtowindowlambda0IconCompatParcelizer.serializer).booleanValue();
        android.graphics.Rect rect = (android.graphics.Rect) onviewattachedtowindowlambda0IconCompatParcelizer.write;
        if (zBooleanValue) {
            Object tag2 = view.getTag();
            String str2 = tag2 instanceof String ? (String) tag2 : null;
            if (str2 != null) {
                String lowerCase2 = str2.toLowerCase(java.util.Locale.ROOT);
                lowerCase2.getClass();
                if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) lowerCase2, (CharSequence) "sentry-unmask", false)) {
                    z = false;
                } else {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{view.getTag(com.logistics.rider.glovo.R.id.sentry_privacy), "unmask"}, getCieXyz.write())).booleanValue()) {
                        z = false;
                    } else {
                        tag = view.getTag();
                        if (tag instanceof String) {
                            str = (String) tag;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            lowerCase = str.toLowerCase(java.util.Locale.ROOT);
                            lowerCase.getClass();
                            if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) lowerCase, (CharSequence) "sentry-mask", false)) {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{view.getTag(com.logistics.rider.glovo.R.id.sentry_privacy), "mask"}, getCieXyz.write())).booleanValue()) {
                                    sentryOptions.getSessionReplay().getClass();
                                    if (view.getParent() != null) {
                                        view.getParent().getClass();
                                        sentryOptions.getSessionReplay().getClass();
                                    }
                                    superclass = view.getClass();
                                    copyOnWriteArraySet = sentryOptions.getSessionReplay().r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                    copyOnWriteArraySet.getClass();
                                    while (true) {
                                        if (superclass != null) {
                                            superclass2 = view.getClass();
                                            copyOnWriteArraySet2 = sentryOptions.getSessionReplay().write;
                                            copyOnWriteArraySet2.getClass();
                                            while (true) {
                                                if (superclass2 != null) {
                                                    if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                        superclass2 = superclass2.getSuperclass();
                                                    }
                                                }
                                            }
                                        } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                            superclass = superclass.getSuperclass();
                                        }
                                        z = false;
                                    }
                                }
                            }
                            z = true;
                        } else {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{view.getTag(com.logistics.rider.glovo.R.id.sentry_privacy), "mask"}, getCieXyz.write())).booleanValue()) {
                                sentryOptions.getSessionReplay().getClass();
                                if (view.getParent() != null) {
                                    view.getParent().getClass();
                                    sentryOptions.getSessionReplay().getClass();
                                }
                                superclass = view.getClass();
                                copyOnWriteArraySet = sentryOptions.getSessionReplay().r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                copyOnWriteArraySet.getClass();
                                while (true) {
                                    if (superclass != null) {
                                        superclass2 = view.getClass();
                                        copyOnWriteArraySet2 = sentryOptions.getSessionReplay().write;
                                        copyOnWriteArraySet2.getClass();
                                        while (true) {
                                            if (superclass2 != null) {
                                                if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                    superclass2 = superclass2.getSuperclass();
                                                }
                                            }
                                        }
                                    } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                        superclass = superclass.getSuperclass();
                                    }
                                    z = false;
                                }
                            }
                            z = true;
                        }
                    }
                }
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{view.getTag(com.logistics.rider.glovo.R.id.sentry_privacy), "unmask"}, getCieXyz.write())).booleanValue()) {
                    z = false;
                } else {
                    tag = view.getTag();
                    if (tag instanceof String) {
                        str = (String) tag;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        lowerCase = str.toLowerCase(java.util.Locale.ROOT);
                        lowerCase.getClass();
                        if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) lowerCase, (CharSequence) "sentry-mask", false)) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{view.getTag(com.logistics.rider.glovo.R.id.sentry_privacy), "mask"}, getCieXyz.write())).booleanValue()) {
                                sentryOptions.getSessionReplay().getClass();
                                if (view.getParent() != null) {
                                    view.getParent().getClass();
                                    sentryOptions.getSessionReplay().getClass();
                                }
                                superclass = view.getClass();
                                copyOnWriteArraySet = sentryOptions.getSessionReplay().r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                copyOnWriteArraySet.getClass();
                                while (true) {
                                    if (superclass != null) {
                                        superclass2 = view.getClass();
                                        copyOnWriteArraySet2 = sentryOptions.getSessionReplay().write;
                                        copyOnWriteArraySet2.getClass();
                                        while (true) {
                                            if (superclass2 != null) {
                                                if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                    superclass2 = superclass2.getSuperclass();
                                                }
                                            }
                                        }
                                    } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                        superclass = superclass.getSuperclass();
                                    }
                                    z = false;
                                }
                            }
                        }
                        z = true;
                    } else {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{view.getTag(com.logistics.rider.glovo.R.id.sentry_privacy), "mask"}, getCieXyz.write())).booleanValue()) {
                            sentryOptions.getSessionReplay().getClass();
                            if (view.getParent() != null) {
                                view.getParent().getClass();
                                sentryOptions.getSessionReplay().getClass();
                            }
                            superclass = view.getClass();
                            copyOnWriteArraySet = sentryOptions.getSessionReplay().r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                            copyOnWriteArraySet.getClass();
                            while (true) {
                                if (superclass != null) {
                                    superclass2 = view.getClass();
                                    copyOnWriteArraySet2 = sentryOptions.getSessionReplay().write;
                                    copyOnWriteArraySet2.getClass();
                                    while (true) {
                                        if (superclass2 != null) {
                                            if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                superclass2 = superclass2.getSuperclass();
                                            }
                                        }
                                    }
                                } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                    superclass = superclass.getSuperclass();
                                }
                                z = false;
                            }
                        }
                        z = true;
                    }
                }
            }
        } else {
            z = false;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            android.text.Layout layout = textView.getLayout();
            setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = layout != null ? new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(16, layout) : null;
            int currentTextColor = textView.getCurrentTextColor();
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            try {
                extendedPaddingTop = textView.getTotalPaddingTop();
            } catch (NullPointerException unused) {
                extendedPaddingTop = textView.getExtendedPaddingTop();
            }
            textView.getX();
            textView.getY();
            return new io.sentry.android.replay.viewhierarchy.MediaSessionCompatQueueItem(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, Integer.valueOf(currentTextColor | (-16777216)), totalPaddingLeft, extendedPaddingTop, textView.getWidth(), textView.getHeight(), textView.getElevation() + (iconCompatParcelizer != null ? iconCompatParcelizer.IconCompatParcelizer : 0.0f), iconCompatParcelizer, z, rect);
        }
        if (!(view instanceof ImageView)) {
            view.getX();
            view.getY();
            return new io.sentry.android.replay.viewhierarchy.RemoteActionCompatParcelizer(view.getWidth(), view.getHeight(), view.getElevation() + (iconCompatParcelizer != null ? iconCompatParcelizer.IconCompatParcelizer : 0.0f), iconCompatParcelizer, z, rect);
        }
        ImageView imageView = (ImageView) view;
        imageView.getX();
        imageView.getY();
        return new io.sentry.android.replay.viewhierarchy.write(imageView.getWidth(), imageView.getHeight(), imageView.getElevation() + (iconCompatParcelizer != null ? iconCompatParcelizer.IconCompatParcelizer : 0.0f), iconCompatParcelizer, (!z || (drawable = imageView.getDrawable()) == null || (drawable instanceof InsetDrawable) || (drawable instanceof ColorDrawable) || (drawable instanceof VectorDrawable) || (drawable instanceof GradientDrawable) || ((drawable instanceof BitmapDrawable) && ((bitmap = ((BitmapDrawable) drawable).getBitmap()) == null || bitmap.isRecycled() || bitmap.getHeight() <= 10 || bitmap.getWidth() <= 10))) ? false : true, rect);
    }
}
