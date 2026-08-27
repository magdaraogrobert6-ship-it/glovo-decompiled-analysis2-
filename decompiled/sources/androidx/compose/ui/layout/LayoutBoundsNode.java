package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class LayoutBoundsNode extends Modifier.Node {
    public static final int $stable = 8;
    private DelegatableNode.RegistrationHandle handle;
    private LayoutBoundsHolder holder;
    private RelativeLayoutBounds lastBounds;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM rectChanged = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.layout.LayoutBoundsNode$rectChanged$1
        public final void invoke(RelativeLayoutBounds relativeLayoutBounds) {
            this.this$0.getHolder().setBounds$ui(relativeLayoutBounds);
            this.this$0.setLastBounds(relativeLayoutBounds);
        }

        {
            super(1);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((RelativeLayoutBounds) obj);
            return createFromParcel.INSTANCE;
        }
    };

    public final DelegatableNode.RegistrationHandle getHandle() {
        return this.handle;
    }

    public final LayoutBoundsHolder getHolder() {
        return this.holder;
    }

    public final RelativeLayoutBounds getLastBounds() {
        return this.lastBounds;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getRectChanged() {
        return this.rectChanged;
    }

    public final void setHandle(DelegatableNode.RegistrationHandle registrationHandle) {
        this.handle = registrationHandle;
    }

    public final void setHolder(LayoutBoundsHolder layoutBoundsHolder) {
        this.holder = layoutBoundsHolder;
    }

    public final void setLastBounds(RelativeLayoutBounds relativeLayoutBounds) {
        this.lastBounds = relativeLayoutBounds;
    }

    public final void forceUpdate() {
        this.holder.setBounds$ui(this.lastBounds);
    }

    public LayoutBoundsNode(LayoutBoundsHolder layoutBoundsHolder) {
        this.holder = layoutBoundsHolder;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        this.handle = OnLayoutRectChangedModifierKt.registerOnLayoutRectChanged(this, 0L, 0L, this.rectChanged);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        this.holder.setBounds$ui(null);
    }
}
