package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedVisibilityComposeAnimation_androidKt {
    public static final AnimatedVisibilityComposeAnimation parseAnimatedVisibility(Transition transition) {
        String str = transition.write;
        if (str == null) {
            str = "AnimatedVisibility";
        }
        return new AnimatedVisibilityComposeAnimation(transition, str);
    }
}
