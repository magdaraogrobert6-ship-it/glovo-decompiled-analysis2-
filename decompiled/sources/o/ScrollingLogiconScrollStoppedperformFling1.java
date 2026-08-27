package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLogiconScrollStoppedperformFling1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int read;
    public final /* synthetic */ androidx.compose.animation.EnterExitTransitionModifierNode write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScrollingLogiconScrollStoppedperformFling1(androidx.compose.animation.EnterExitTransitionModifierNode enterExitTransitionModifierNode, int i) {
        super(1);
        this.read = i;
        this.write = enterExitTransitionModifierNode;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Object obj2;
        int i = this.read;
        androidx.compose.animation.EnterExitTransitionModifierNode enterExitTransitionModifierNode = this.write;
        if (i == 0) {
            paddingqDBjuR0default paddingqdbjur0default = (paddingqDBjuR0default) obj;
            accesssemanticsScrollByd4ec7I accesssemanticsscrollbyd4ec7i = accesssemanticsScrollByd4ec7I.PreEnter;
            accesssemanticsScrollByd4ec7I accesssemanticsscrollbyd4ec7i2 = accesssemanticsScrollByd4ec7I.Visible;
            if (paddingqdbjur0default.RemoteActionCompatParcelizer(accesssemanticsscrollbyd4ec7i, accesssemanticsscrollbyd4ec7i2)) {
                TouchSlopDetector touchSlopDetector = enterExitTransitionModifierNode.write.serializer.MediaSessionCompatQueueItem;
                return touchSlopDetector != null ? touchSlopDetector.IconCompatParcelizer : onKeyEventZmokQxo.RemoteActionCompatParcelizer;
            }
            if (!paddingqdbjur0default.RemoteActionCompatParcelizer(accesssemanticsscrollbyd4ec7i2, accesssemanticsScrollByd4ec7I.PostExit)) {
                return onKeyEventZmokQxo.RemoteActionCompatParcelizer;
            }
            TouchSlopDetector touchSlopDetector2 = enterExitTransitionModifierNode.IconCompatParcelizer.serializer.MediaSessionCompatQueueItem;
            return touchSlopDetector2 != null ? touchSlopDetector2.IconCompatParcelizer : onKeyEventZmokQxo.RemoteActionCompatParcelizer;
        }
        paddingqDBjuR0default paddingqdbjur0default2 = (paddingqDBjuR0default) obj;
        accesssemanticsScrollByd4ec7I accesssemanticsscrollbyd4ec7i3 = accesssemanticsScrollByd4ec7I.PreEnter;
        accesssemanticsScrollByd4ec7I accesssemanticsscrollbyd4ec7i4 = accesssemanticsScrollByd4ec7I.Visible;
        if (paddingqdbjur0default2.RemoteActionCompatParcelizer(accesssemanticsscrollbyd4ec7i3, accesssemanticsscrollbyd4ec7i4)) {
            tryAwaitRelease tryawaitrelease = enterExitTransitionModifierNode.write.serializer.IconCompatParcelizer;
            if (tryawaitrelease != null) {
                obj2 = tryawaitrelease.write;
            } else {
                obj2 = null;
            }
        } else if (paddingqdbjur0default2.RemoteActionCompatParcelizer(accesssemanticsscrollbyd4ec7i4, accesssemanticsScrollByd4ec7I.PostExit)) {
            tryAwaitRelease tryawaitrelease2 = enterExitTransitionModifierNode.IconCompatParcelizer.serializer.IconCompatParcelizer;
            if (tryawaitrelease2 != null) {
                obj2 = tryawaitrelease2.write;
            } else {
                obj2 = null;
            }
        } else {
            obj2 = onKeyEventZmokQxo.serializer;
        }
        return obj2 == null ? onKeyEventZmokQxo.serializer : obj2;
    }
}
