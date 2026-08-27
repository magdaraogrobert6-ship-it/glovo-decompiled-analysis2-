package o;

/* JADX INFO: loaded from: classes.dex */
public final class MouseWheelScrollingLogic implements androidx.compose.ui.layout.ParentDataModifier {
    public final PopulateViewStructure_androidKtpopulate7 serializer;

    @Override // androidx.compose.ui.layout.ParentDataModifier
    public final Object modifyParentData(androidx.compose.ui.unit.Density density, Object obj) {
        return this;
    }

    public MouseWheelScrollingLogic(boolean z) {
        this.serializer = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(Boolean.valueOf(z));
    }
}
