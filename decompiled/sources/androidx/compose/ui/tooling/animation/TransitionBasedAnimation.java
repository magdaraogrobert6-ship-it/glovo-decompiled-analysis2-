package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;

/* JADX INFO: loaded from: classes.dex */
public interface TransitionBasedAnimation<T> extends ComposeAnimation {
    Transition getAnimationObject();
}
