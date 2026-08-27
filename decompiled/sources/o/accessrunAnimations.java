package o;

import android.util.Range;
import android.util.Rational;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class accessrunAnimations {
    public static final HashMap serializer;

    static {
        HashMap map = new HashMap();
        serializer = map;
        HashMap map2 = new HashMap();
        updateValuesIJZedt4animation_core updatevaluesijzedt4animation_core = updateValuesIJZedt4animation_core.IconCompatParcelizer;
        map2.put(1, updatevaluesijzedt4animation_core);
        updateValuesIJZedt4animation_core updatevaluesijzedt4animation_core2 = updateValuesIJZedt4animation_core.read;
        map2.put(2, updatevaluesijzedt4animation_core2);
        Integer numValueOf = Integer.valueOf(androidx.compose.ui.graphics.Fields.TransformOrigin);
        updateValuesIJZedt4animation_core updatevaluesijzedt4animation_core3 = updateValuesIJZedt4animation_core.RemoteActionCompatParcelizer;
        map2.put(numValueOf, updatevaluesijzedt4animation_core3);
        map2.put(8192, updatevaluesijzedt4animation_core3);
        HashMap map3 = new HashMap();
        map3.put(1, updatevaluesijzedt4animation_core);
        map3.put(2, updatevaluesijzedt4animation_core2);
        map3.put(numValueOf, updatevaluesijzedt4animation_core3);
        map3.put(8192, updatevaluesijzedt4animation_core3);
        HashMap map4 = new HashMap();
        map4.put(1, updatevaluesijzedt4animation_core);
        map4.put(4, updatevaluesijzedt4animation_core2);
        map4.put(numValueOf, updatevaluesijzedt4animation_core3);
        map4.put(Integer.valueOf(androidx.compose.ui.graphics.Fields.Clip), updatevaluesijzedt4animation_core3);
        map4.put(2, updatevaluesijzedt4animation_core);
        map4.put(8, updatevaluesijzedt4animation_core2);
        map4.put(8192, updatevaluesijzedt4animation_core3);
        map4.put(Integer.valueOf(androidx.compose.ui.graphics.Fields.CompositingStrategy), updatevaluesijzedt4animation_core3);
        HashMap map5 = new HashMap();
        map5.put(Integer.valueOf(androidx.compose.ui.graphics.Fields.RotationX), updatevaluesijzedt4animation_core2);
        map5.put(Integer.valueOf(androidx.compose.ui.graphics.Fields.RotationY), updateValuesIJZedt4animation_core.write);
        map.put("video/hevc", map2);
        map.put("video/av01", map3);
        map.put("video/x-vnd.on2.vp9", map4);
        map.put("video/dolby-vision", map5);
    }

    public static MutationInterruptedException read(AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy, Range range) {
        Range range2 = androidx.camera.core.SurfaceRequest.serializer;
        int iIntValue = range2.equals(range) ? 30 : ((Integer) range.getUpper()).intValue();
        int i = animatedEnterExitMeasurePolicy.RemoteActionCompatParcelizer != 0 ? animatedEnterExitMeasurePolicy.RemoteActionCompatParcelizer : iIntValue;
        java.util.Locale locale = java.util.Locale.ENGLISH;
        boolean zEquals = range2.equals(range);
        Object obj = range;
        if (zEquals) {
            obj = "<UNSPECIFIED>";
        }
        String.format(locale, "Resolved capture/encode frame rate %dfps/%dfps, [Expected operating range: %s]", Integer.valueOf(iIntValue), Integer.valueOf(i), obj);
        setInflatedId.IconCompatParcelizer(3, "VideoConfigUtil");
        return new MutationInterruptedException(iIntValue, i);
    }

    public static updateValuesIJZedt4animation_core serializer(int i, String str) {
        updateValuesIJZedt4animation_core updatevaluesijzedt4animation_core;
        Map map = (Map) serializer.get(str);
        if (map != null && (updatevaluesijzedt4animation_core = (updateValuesIJZedt4animation_core) map.get(Integer.valueOf(i))) != null) {
            return updatevaluesijzedt4animation_core;
        }
        setInflatedId.read("VideoConfigUtil", String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i)));
        return updateValuesIJZedt4animation_core.IconCompatParcelizer;
    }

    public static accesswaitForComposition read(getNavigationIcon getnavigationicon, AnimatedContentTransitionScopeImplSizeModifierNodemeasure1 animatedContentTransitionScopeImplSizeModifierNodemeasure1, InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2) {
        String str;
        PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk;
        boolean zSerializer = getnavigationicon.serializer();
        int i = getnavigationicon.MediaSessionCompatQueueItem;
        coil3.util.UtilsKt.RemoteActionCompatParcelizer("Dynamic range must be a fully specified dynamic range [provided dynamic range: " + getnavigationicon + "]", zSerializer);
        String str2 = "video/avc";
        if (animatedContentTransitionScopeImplSizeModifierNodemeasure1.serializer != 1) {
            str = "video/avc";
        } else {
            str = "video/x-vnd.on2.vp8";
        }
        if (infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 == null) {
            previewDelayWhenVideoCaptureIsBoundQuirk = null;
        } else {
            Set set = (Set) updateTargetanimation_core.IconCompatParcelizer.get(Integer.valueOf(i));
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            Set set2 = (Set) updateTargetanimation_core.RemoteActionCompatParcelizer.get(Integer.valueOf(getnavigationicon.MediaBrowserCompatMediaItem));
            if (set2 == null) {
                set2 = Collections.EMPTY_SET;
            }
            Iterator it = infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2.MediaDescriptionCompat.iterator();
            while (true) {
                if (it.hasNext()) {
                    previewDelayWhenVideoCaptureIsBoundQuirk = (PreviewDelayWhenVideoCaptureIsBoundQuirk) it.next();
                    if (set.contains(Integer.valueOf(previewDelayWhenVideoCaptureIsBoundQuirk.RatingCompat)) && set2.contains(Integer.valueOf(previewDelayWhenVideoCaptureIsBoundQuirk.serializer))) {
                        String str3 = previewDelayWhenVideoCaptureIsBoundQuirk.MediaSessionCompatQueueItem;
                        if (str.equals(str3)) {
                            setInflatedId.IconCompatParcelizer(3, "VideoConfigUtil");
                        } else if (animatedContentTransitionScopeImplSizeModifierNodemeasure1.serializer == -1) {
                            getnavigationicon.toString();
                            setInflatedId.IconCompatParcelizer(3, "VideoConfigUtil");
                        }
                        str = str3;
                    }
                } else {
                    previewDelayWhenVideoCaptureIsBoundQuirk = null;
                }
            }
        }
        if (previewDelayWhenVideoCaptureIsBoundQuirk == null) {
            if (animatedContentTransitionScopeImplSizeModifierNodemeasure1.serializer == -1) {
                if (i != 1) {
                    if (i == 3 || i == 4 || i == 5) {
                        str2 = "video/hevc";
                    } else if (i == 6) {
                        str2 = "video/dolby-vision";
                    } else {
                        throw new UnsupportedOperationException("Unsupported dynamic range: " + getnavigationicon + "\nNo supported default mime type available.");
                    }
                }
                str = str2;
            }
            if (infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 == null) {
                getnavigationicon.toString();
                setInflatedId.IconCompatParcelizer(3, "VideoConfigUtil");
            } else {
                getnavigationicon.toString();
                setInflatedId.IconCompatParcelizer(3, "VideoConfigUtil");
            }
        }
        if (str != null) {
            return new accesswaitForComposition(str, -1, previewDelayWhenVideoCaptureIsBoundQuirk != null ? previewDelayWhenVideoCaptureIsBoundQuirk : null);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null mimeType");
        return null;
    }

    public static int read(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Range range) {
        Rational rational = new Rational(i2, i3);
        Rational rational2 = new Rational(i4, i5);
        Rational rational3 = new Rational(i6, i7);
        Rational rational4 = new Rational(i8, i9);
        double dDoubleValue = rational.doubleValue();
        double dDoubleValue2 = rational2.doubleValue();
        int iDoubleValue = (int) (rational4.doubleValue() * rational3.doubleValue() * dDoubleValue2 * dDoubleValue * ((double) i));
        if (setInflatedId.IconCompatParcelizer(3, "VideoConfigUtil")) {
            String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(iDoubleValue));
        }
        if (!AnimatedEnterExitMeasurePolicy.write.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            int iIntValue = num.intValue();
            if (setInflatedId.IconCompatParcelizer(3, "VideoConfigUtil")) {
                String.format("\nClamped to range %s -> %dbps", range, num);
            }
            iDoubleValue = iIntValue;
        }
        setInflatedId.IconCompatParcelizer(3, "VideoConfigUtil");
        return iDoubleValue;
    }
}
