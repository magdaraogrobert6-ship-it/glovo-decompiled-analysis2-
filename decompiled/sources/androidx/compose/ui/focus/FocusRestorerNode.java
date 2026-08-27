package androidx.compose.ui.focus;

import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import o.createFromParcel;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class FocusRestorerNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode {
    public static final int $stable = 8;
    private FocusRequester fallback;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onExit = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.focus.FocusRestorerNode$onExit$1
        {
            super(1);
        }

        public final void invoke(FocusEnterExitScope focusEnterExitScope) {
            if (ComposeUiFlags.isFocusRestorationEnabled) {
                return;
            }
            FocusRequesterModifierNodeKt.saveFocusedChild(this.this$0);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusEnterExitScope) obj);
            return createFromParcel.INSTANCE;
        }
    };
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onEnter = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.focus.FocusRestorerNode$onEnter$1
        public final void invoke(FocusEnterExitScope focusEnterExitScope) {
            if (FocusRequesterModifierNodeKt.restoreFocusedChild(this.this$0)) {
                return;
            }
            FocusRequester fallback = this.this$0.getFallback();
            FocusRequester.Companion companion = FocusRequester.Companion;
            Object[] objArr = {fallback, companion.getDefault()};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return;
            }
            Object[] objArr2 = {this.this$0.getFallback(), companion.getCancel()};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                focusEnterExitScope.cancelFocusChange();
            } else {
                FocusRequester.m380requestFocus3ESFkO8$default(this.this$0.getFallback(), 0, 1, null);
            }
        }

        {
            super(1);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusEnterExitScope) obj);
            return createFromParcel.INSTANCE;
        }
    };

    private static /* synthetic */ void getOnExit$annotations() {
    }

    public final FocusRequester getFallback() {
        return this.fallback;
    }

    public final void setFallback(FocusRequester focusRequester) {
        this.fallback = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        focusProperties.setOnEnter(this.onEnter);
        focusProperties.setOnExit(this.onExit);
    }

    public FocusRestorerNode(FocusRequester focusRequester) {
        this.fallback = focusRequester;
    }
}
