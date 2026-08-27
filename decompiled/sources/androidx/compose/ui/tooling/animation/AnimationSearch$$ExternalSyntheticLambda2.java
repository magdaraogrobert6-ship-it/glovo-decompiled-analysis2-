package androidx.compose.ui.tooling.animation;

import androidx.compose.ui.tooling.animation.search.AnimateXAsStateSearchInfo;
import androidx.compose.ui.tooling.animation.search.AnimatedContentSearchInfo;
import androidx.compose.ui.tooling.animation.search.AnimatedVisibilitySearchInfo;
import androidx.compose.ui.tooling.animation.search.InfiniteTransitionSearchInfo;
import androidx.compose.ui.tooling.animation.search.TransitionSearchInfo;
import o.PaddingKt;
import o.calculateSnapOffset;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AnimationSearch$$ExternalSyntheticLambda2 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnimationSearch f$0;

    public /* synthetic */ AnimationSearch$$ExternalSyntheticLambda2(AnimationSearch animationSearch, int i) {
        this.$r8$classId = i;
        this.f$0 = animationSearch;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        AnimationSearch animationSearch = this.f$0;
        switch (i) {
            case 0:
                return AnimationSearch.unsupportedSearch$lambda$0(animationSearch, obj);
            case 1:
                return AnimationSearch.unsupportedSearch$lambda$1(animationSearch, (PaddingKt) obj);
            case 2:
                return AnimationSearch.unsupportedSearch$lambda$2(animationSearch, (calculateSnapOffset) obj);
            case 3:
                return AnimationSearch.transitionSearch$lambda$0(animationSearch, (TransitionSearchInfo) obj);
            case 4:
                return AnimationSearch.animatedContentSearch$lambda$0(animationSearch, (AnimatedContentSearchInfo) obj);
            case 5:
                return AnimationSearch.animatedVisibilitySearch$lambda$0(animationSearch, (AnimatedVisibilitySearchInfo) obj);
            case 6:
                return AnimationSearch.animateXAsStateSearch$lambda$0(animationSearch, (AnimateXAsStateSearchInfo) obj);
            default:
                return AnimationSearch.infiniteTransitionSearch$lambda$0(animationSearch, (InfiniteTransitionSearchInfo) obj);
        }
    }
}
