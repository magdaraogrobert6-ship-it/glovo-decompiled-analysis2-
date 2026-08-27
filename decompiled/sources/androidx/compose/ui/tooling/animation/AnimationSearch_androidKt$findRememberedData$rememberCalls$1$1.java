package androidx.compose.ui.tooling.animation;

import androidx.compose.ui.tooling.data.Group;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1 INSTANCE = new AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1();

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Boolean invoke(Group group) {
        Object[] objArr = {group.getName(), "remember"};
        return Boolean.valueOf(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue());
    }
}
