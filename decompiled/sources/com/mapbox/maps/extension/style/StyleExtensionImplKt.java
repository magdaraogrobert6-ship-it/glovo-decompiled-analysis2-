package com.mapbox.maps.extension.style;

import androidx.lifecycle.BlockRunner;
import com.mapbox.maps.extension.style.utils.StyleTelemetryEvents;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public abstract class StyleExtensionImplKt {
    public static final BlockRunner style(String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        StyleExtensionImpl$Builder styleExtensionImpl$Builder = new StyleExtensionImpl$Builder(str);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(styleExtensionImpl$Builder);
        StyleTelemetryEvents.dsl.increment();
        BlockRunner blockRunner = new BlockRunner();
        blockRunner.read = styleExtensionImpl$Builder.style;
        blockRunner.serializer = onContentCardDismissed.PlaybackStateCompat(styleExtensionImpl$Builder.sources);
        blockRunner.RatingCompat = onContentCardDismissed.PlaybackStateCompat(styleExtensionImpl$Builder.images);
        blockRunner.write = onContentCardDismissed.PlaybackStateCompat(styleExtensionImpl$Builder.models);
        blockRunner.RemoteActionCompatParcelizer = onContentCardDismissed.PlaybackStateCompat(styleExtensionImpl$Builder.layers);
        blockRunner.IconCompatParcelizer = styleExtensionImpl$Builder.transition;
        return blockRunner;
    }
}
