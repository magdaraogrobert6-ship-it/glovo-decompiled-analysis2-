package androidx.compose.ui.platform;

import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.resumeWebviewIfNecessarylambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class InspectorValueInfo implements InspectableValue {
    public static final int $stable = 8;
    private InspectorInfo _values;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM info;

    public InspectorValueInfo(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.info = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public resumeWebviewIfNecessarylambda0 getInspectableElements() {
        return getValues().getProperties();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public String getNameFallback() {
        return getValues().getName();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public Object getValueOverride() {
        return getValues().getValue();
    }

    private final InspectorInfo getValues() {
        InspectorInfo inspectorInfo = this._values;
        if (inspectorInfo == null) {
            inspectorInfo = new InspectorInfo();
            this.info.invoke(inspectorInfo);
        }
        this._values = inspectorInfo;
        return inspectorInfo;
    }
}
