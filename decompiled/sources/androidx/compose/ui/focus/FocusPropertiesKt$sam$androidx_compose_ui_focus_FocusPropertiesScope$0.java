package androidx.compose.ui.focus;

import o.getCieXyz;
import o.isInvalidIndex;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0 implements FocusPropertiesScope, r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ {
    private final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM function;

    @Override // androidx.compose.ui.focus.FocusPropertiesScope
    public final /* synthetic */ void apply(FocusProperties focusProperties) {
        this.function.invoke(focusProperties);
    }

    @Override // o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ
    public final isInvalidIndex getFunctionDelegate() {
        return this.function;
    }

    public FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.function = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FocusPropertiesScope) || !(obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ)) {
            return false;
        }
        Object[] objArr = {getFunctionDelegate(), ((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate()};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
