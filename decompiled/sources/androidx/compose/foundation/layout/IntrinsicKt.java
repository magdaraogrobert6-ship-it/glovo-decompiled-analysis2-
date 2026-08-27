package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import o.animateTomaterial3default;
import o.expand;
import o.hide;
import o.toOffset;

/* JADX INFO: loaded from: classes.dex */
public abstract class IntrinsicKt {
    public static final Modifier height(Modifier modifier, expand expandVar) {
        return modifier.then(new toOffset(expandVar, InspectableValueKt.isDebugInspectorInfoEnabled() ? new animateTomaterial3default(expandVar, 1) : InspectableValueKt.getNoInspectorInfo()));
    }

    public static final Modifier width(Modifier modifier, expand expandVar) {
        return modifier.then(new hide(expandVar, InspectableValueKt.isDebugInspectorInfoEnabled() ? new animateTomaterial3default(expandVar, 0) : InspectableValueKt.getNoInspectorInfo()));
    }
}
