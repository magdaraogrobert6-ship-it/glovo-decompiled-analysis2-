package kotlinx.datetime;

import android.os.Parcelable;
import com.adjust.sdk.Constants;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import kotlin.NoWhenBranchMatchedException;
import o.AndroidPaint_androidKtWhenMappings;
import o.DrawableTransformation;
import o.InAppMessageManagerBaseWhenMappings;
import o.actualChainPathEffect;
import o.actualCornerPathEffect;
import o.actualDashPathEffect;
import o.actualStampedPathEffect7aD1DOk;
import o.asAndroidPathEffect;
import o.getGraphicModalMaxHeightDp;
import o.setCarryoverInAppMessage;
import o.setCustomHtmlInAppMessageActionListener;
import o.setCustomInAppMessageAnimationFactory;
import o.setCustomInAppMessageViewFactory;
import o.setCustomInAppMessageViewWrapperFactory;
import o.setShouldNextUnregisterBeSkipped;
import o.toComposePathEffect;

/* JADX INFO: loaded from: classes4.dex */
public abstract class InstantJvmKt {
    public static final long IconCompatParcelizer(setShouldNextUnregisterBeSkipped setshouldnextunregisterbeskipped, setShouldNextUnregisterBeSkipped setshouldnextunregisterbeskipped2, setCustomHtmlInAppMessageActionListener setcustomhtmlinappmessageactionlistener, getGraphicModalMaxHeightDp getgraphicmodalmaxheightdp) {
        Instant instant = setshouldnextunregisterbeskipped.value;
        Instant instant2 = setshouldnextunregisterbeskipped2.value;
        setcustomhtmlinappmessageactionlistener.getClass();
        getgraphicmodalmaxheightdp.getClass();
        ZoneId zoneId = getgraphicmodalmaxheightdp.zoneId;
        try {
            try {
                try {
                    ZonedDateTime zonedDateTimeAtZone = instant.atZone(zoneId);
                    zonedDateTimeAtZone.getClass();
                    try {
                        ZonedDateTime zonedDateTimeAtZone2 = instant2.atZone(zoneId);
                        zonedDateTimeAtZone2.getClass();
                        if (setcustomhtmlinappmessageactionlistener instanceof setCustomInAppMessageViewWrapperFactory) {
                            return InAppMessageManagerBaseWhenMappings.read(setshouldnextunregisterbeskipped, setshouldnextunregisterbeskipped2, (setCustomInAppMessageViewWrapperFactory) setcustomhtmlinappmessageactionlistener);
                        }
                        if (setcustomhtmlinappmessageactionlistener instanceof setCustomInAppMessageAnimationFactory) {
                            return zonedDateTimeAtZone.until(zonedDateTimeAtZone2, ChronoUnit.DAYS) / ((long) ((setCustomInAppMessageAnimationFactory) setcustomhtmlinappmessageactionlistener).days);
                        }
                        if (setcustomhtmlinappmessageactionlistener instanceof setCustomInAppMessageViewFactory) {
                            return zonedDateTimeAtZone.until(zonedDateTimeAtZone2, ChronoUnit.MONTHS) / ((long) ((setCustomInAppMessageViewFactory) setcustomhtmlinappmessageactionlistener).months);
                        }
                        throw new NoWhenBranchMatchedException();
                    } catch (DateTimeException e) {
                        throw new DateTimeArithmeticException(e);
                    }
                } catch (DateTimeException e2) {
                    throw new DateTimeArithmeticException(e2);
                }
            } catch (ArithmeticException unused) {
                return instant.compareTo(instant2) < 0 ? Long.MAX_VALUE : Long.MIN_VALUE;
            }
        } catch (DateTimeException e3) {
            throw new DateTimeArithmeticException(e3);
        }
    }

    public static asAndroidPathEffect read(Class cls, boolean z) {
        if (Parcelable.class.isAssignableFrom(cls)) {
            return z ? new actualDashPathEffect(cls) : new actualCornerPathEffect(cls);
        }
        if (Enum.class.isAssignableFrom(cls) && !z) {
            return new actualChainPathEffect(cls);
        }
        if (Serializable.class.isAssignableFrom(cls)) {
            return z ? new actualStampedPathEffect7aD1DOk(cls) : new toComposePathEffect(cls);
        }
        return null;
    }

    public static asAndroidPathEffect serializer(String str, String str2) {
        asAndroidPathEffect asandroidpatheffect;
        boolean zEquals = "integer".equals(str);
        AndroidPaint_androidKtWhenMappings androidPaint_androidKtWhenMappings = asAndroidPathEffect.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (zEquals) {
            asandroidpatheffect = asAndroidPathEffect.MediaSessionCompatQueueItem;
        } else if ("integer[]".equals(str)) {
            asandroidpatheffect = asAndroidPathEffect.MediaDescriptionCompat;
        } else if ("List<Int>".equals(str)) {
            asandroidpatheffect = asAndroidPathEffect.MediaBrowserCompatMediaItem;
        } else if (Constants.LONG.equals(str)) {
            asandroidpatheffect = asAndroidPathEffect.MediaSessionCompatResultReceiverWrapper;
        } else if ("long[]".equals(str)) {
            asandroidpatheffect = asAndroidPathEffect.PlaybackStateCompatCustomAction;
        } else if ("List<Long>".equals(str)) {
            asandroidpatheffect = asAndroidPathEffect.MediaSessionCompatToken;
        } else if ("boolean".equals(str)) {
            asandroidpatheffect = asAndroidPathEffect.RemoteActionCompatParcelizer;
        } else if ("boolean[]".equals(str)) {
            asandroidpatheffect = asAndroidPathEffect.write;
        } else if ("List<Boolean>".equals(str)) {
            asandroidpatheffect = asAndroidPathEffect.read;
        } else if ("string".equals(str)) {
            asandroidpatheffect = androidPaint_androidKtWhenMappings;
        } else if ("string[]".equals(str)) {
            asandroidpatheffect = asAndroidPathEffect.ParcelableVolumeInfo;
        } else if ("List<String>".equals(str)) {
            asandroidpatheffect = asAndroidPathEffect.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        } else if ("float".equals(str)) {
            asandroidpatheffect = asAndroidPathEffect.RatingCompat;
        } else if ("float[]".equals(str)) {
            asandroidpatheffect = asAndroidPathEffect.serializer;
        } else {
            asandroidpatheffect = "List<Float>".equals(str) ? asAndroidPathEffect.MediaMetadataCompat : null;
        }
        if (asandroidpatheffect != null) {
            return asandroidpatheffect;
        }
        if ("reference".equals(str)) {
            return asAndroidPathEffect.PlaybackStateCompat;
        }
        if (str.length() == 0) {
            return androidPaint_androidKtWhenMappings;
        }
        try {
            String strConcat = (!setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, ".", false) || str2 == null) ? str : str2.concat(str);
            boolean z = setCarryoverInAppMessage.read(str, "[]", false);
            if (z) {
                strConcat = strConcat.substring(0, strConcat.length() - 2);
            }
            asAndroidPathEffect asandroidpatheffect2 = read(Class.forName(strConcat), z);
            if (asandroidpatheffect2 != null) {
                return asandroidpatheffect2;
            }
            throw new IllegalArgumentException(strConcat.concat(" is not Serializable or Parcelable.").toString());
        } catch (ClassNotFoundException e) {
            DrawableTransformation.read((Throwable) e);
            return null;
        }
    }
}
