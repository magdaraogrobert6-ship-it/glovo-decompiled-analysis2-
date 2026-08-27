package androidx.compose.ui.tooling.animation;

import androidx.compose.ui.tooling.animation.search.TransitionSearchInfo;
import kotlin.ranges.RangesKt;
import o.onContentCardClicked;

/* JADX INFO: loaded from: classes.dex */
public final class TransitionComposeAnimation_androidKt {
    public static final TransitionComposeAnimation<?> parse(TransitionSearchInfo transitionSearchInfo) {
        Object objIconCompatParcelizer = transitionSearchInfo.getTransition().MediaSessionCompatToken.IconCompatParcelizer();
        if (objIconCompatParcelizer == null) {
            return null;
        }
        Object[] enumConstants = objIconCompatParcelizer.getClass().getEnumConstants();
        return new TransitionComposeAnimation<>(transitionSearchInfo.getInitialState(), transitionSearchInfo.getTargetState(), transitionSearchInfo.getTransition(), enumConstants != null ? onContentCardClicked.MediaSessionCompatQueueItem(enumConstants) : RangesKt.write(objIconCompatParcelizer), transitionSearchInfo.getLabel());
    }
}
