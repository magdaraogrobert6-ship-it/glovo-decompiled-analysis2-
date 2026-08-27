package androidx.compose.ui.node;

import androidx.compose.ui.Actual_jvmAndAndroidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.InspectorInfo;
import o.displayInAppMessagelambda1;
import o.resumeWebviewIfNecessarylambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ModifierNodeElement<N extends Modifier.Node> implements Modifier.Element, InspectableValue {
    public static final int $stable = 0;
    private InspectorInfo _inspectorValues;

    public abstract N create();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Actual_jvmAndAndroidKt.tryPopulateReflectively(inspectorInfo, this);
    }

    public abstract void update(N n);

    @Override // androidx.compose.ui.platform.InspectableValue
    public final resumeWebviewIfNecessarylambda0 getInspectableElements() {
        return getInspectorValues().getProperties();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final String getNameFallback() {
        return getInspectorValues().getName();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final Object getValueOverride() {
        return getInspectorValues().getValue();
    }

    private final InspectorInfo getInspectorValues() {
        InspectorInfo inspectorInfo = this._inspectorValues;
        if (inspectorInfo != null) {
            return inspectorInfo;
        }
        InspectorInfo inspectorInfo2 = new InspectorInfo();
        inspectorInfo2.setName(displayInAppMessagelambda1.serializer(getClass()).IconCompatParcelizer());
        inspectableProperties(inspectorInfo2);
        this._inspectorValues = inspectorInfo2;
        return inspectorInfo2;
    }
}
