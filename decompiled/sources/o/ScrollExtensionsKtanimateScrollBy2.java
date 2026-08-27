package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollExtensionsKtanimateScrollBy2 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.animation.core.Transition read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScrollExtensionsKtanimateScrollBy2(androidx.compose.animation.core.Transition transition, int i) {
        super(1);
        this.RemoteActionCompatParcelizer = i;
        this.read = transition;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        androidx.compose.animation.core.Transition transition = this.read;
        if (i != 0) {
            androidx.compose.ui.platform.InspectorInfo inspectorInfo = (androidx.compose.ui.platform.InspectorInfo) obj;
            inspectorInfo.setName("animateTooltip");
            inspectorInfo.getProperties().set("transition", transition);
            return createFromParcel.INSTANCE;
        }
        return Boolean.valueOf(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, ((onShowTranslationui) transition.MediaBrowserCompatMediaItem).getValue()}, getCieXyz.write())).booleanValue());
    }
}
