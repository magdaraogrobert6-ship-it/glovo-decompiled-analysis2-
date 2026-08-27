package o;

import android.util.Range;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class SeekableTransitionStatesnapTo2 implements FocusOwnerImplKt {
    public static final android.util.Size IconCompatParcelizer = new android.util.Size(1280, 720);
    public final android.util.Size MediaMetadataCompat;
    public final AnimatedEnterExitMeasurePolicy MediaSessionCompatQueueItem;
    public final PreviewGreenTintQuirk RemoteActionCompatParcelizer;
    public final String read;
    public final Range serializer;
    public final getNavigationIcon write;

    @Override // o.FocusOwnerImplKt
    public final Object serializer() {
        Integer num;
        Range range = this.serializer;
        AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy = this.MediaSessionCompatQueueItem;
        MutationInterruptedException mutationInterruptedException = accessrunAnimations.read(animatedEnterExitMeasurePolicy, range);
        setInflatedId.IconCompatParcelizer(3, "VidEncCfgDefaultRslvr");
        Range range2 = animatedEnterExitMeasurePolicy.read;
        setInflatedId.IconCompatParcelizer(3, "VidEncCfgDefaultRslvr");
        getNavigationIcon getnavigationicon = this.write;
        int i = getnavigationicon.MediaBrowserCompatMediaItem;
        int i2 = mutationInterruptedException.serializer;
        android.util.Size size = this.MediaMetadataCompat;
        int width = size.getWidth();
        android.util.Size size2 = IconCompatParcelizer;
        int i3 = accessrunAnimations.read(14000000, i, 8, i2, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight(), range2);
        HashMap map = updateTargetanimation_core.write;
        String str = this.read;
        Map map2 = (Map) map.get(str);
        int iIntValue = (map2 == null || (num = (Integer) map2.get(getnavigationicon)) == null) ? -1 : num.intValue();
        updateValuesIJZedt4animation_core updatevaluesijzedt4animation_coreSerializer = accessrunAnimations.serializer(iIntValue, str);
        seekTo seektoSerializer = animateOneFrame.serializer();
        seektoSerializer.MediaBrowserCompatMediaItem = str;
        PreviewGreenTintQuirk previewGreenTintQuirk = this.RemoteActionCompatParcelizer;
        if (previewGreenTintQuirk == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null inputTimebase");
            return null;
        }
        seektoSerializer.MediaMetadataCompat = previewGreenTintQuirk;
        seektoSerializer.RatingCompat = size;
        seektoSerializer.serializer = Integer.valueOf(i3);
        seektoSerializer.read = Integer.valueOf(mutationInterruptedException.IconCompatParcelizer);
        seektoSerializer.MediaDescriptionCompat = Integer.valueOf(mutationInterruptedException.serializer);
        seektoSerializer.MediaSessionCompatQueueItem = Integer.valueOf(iIntValue);
        seektoSerializer.write = updatevaluesijzedt4animation_coreSerializer;
        return seektoSerializer.RemoteActionCompatParcelizer();
    }

    public SeekableTransitionStatesnapTo2(String str, PreviewGreenTintQuirk previewGreenTintQuirk, AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy, android.util.Size size, getNavigationIcon getnavigationicon, Range range) {
        this.read = str;
        this.RemoteActionCompatParcelizer = previewGreenTintQuirk;
        this.MediaSessionCompatQueueItem = animatedEnterExitMeasurePolicy;
        this.MediaMetadataCompat = size;
        this.write = getnavigationicon;
        this.serializer = range;
    }
}
