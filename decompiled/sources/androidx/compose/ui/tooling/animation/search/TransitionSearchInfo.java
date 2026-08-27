package androidx.compose.ui.tooling.animation.search;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.tooling.animation.ClockInfo;
import androidx.compose.ui.tooling.animation.TransitionComposeAnimation;
import androidx.compose.ui.tooling.animation.TransitionComposeAnimation_androidKt;
import androidx.compose.ui.tooling.animation.clock.TransitionClock;
import o.displayInAppMessagelambda1;
import o.onShowTranslationui;

/* JADX INFO: loaded from: classes.dex */
public final class TransitionSearchInfo extends TransitionBasedSearchInfo<TransitionComposeAnimation<?>> {
    public static final int $stable = 8;

    public TransitionSearchInfo(Transition transition) {
        super(transition);
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public String getLabel() {
        String str = getTransition().write;
        if (str != null) {
            return str;
        }
        Object value = ((onShowTranslationui) getTransition().MediaBrowserCompatMediaItem).getValue();
        if (value == null) {
            value = null;
        }
        String strIconCompatParcelizer = value != null ? displayInAppMessagelambda1.serializer(value.getClass()).IconCompatParcelizer() : null;
        return strIconCompatParcelizer == null ? "updateTransition" : strIconCompatParcelizer;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public TransitionComposeAnimation<?> createAnimation() {
        return TransitionComposeAnimation_androidKt.parse(this);
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public TransitionClock<?> createClock(TransitionComposeAnimation<?> transitionComposeAnimation, ClockInfo clockInfo) {
        return new TransitionClock<>(transitionComposeAnimation);
    }
}
