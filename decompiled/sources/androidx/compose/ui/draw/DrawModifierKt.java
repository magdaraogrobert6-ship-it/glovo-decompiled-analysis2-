package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class DrawModifierKt {
    public static final Modifier drawBehind(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new DrawBehindElement(r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }

    public static final Modifier drawWithCache(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new DrawWithCacheElement(r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }

    public static final Modifier drawWithContent(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new DrawWithContentElement(r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }

    public static final CacheDrawModifierNode CacheDrawModifierNode(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
