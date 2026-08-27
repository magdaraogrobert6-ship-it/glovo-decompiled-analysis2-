package androidx.compose.foundation.layout;

import androidx.collection.ObjectList$toString$1;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.mapbox.navigation.core.internal.dump.HelpDumpInterceptor$prettyString$1;
import o.FloatingActionButtonlFWlFE;
import o.IconButtonKt;

/* JADX INFO: loaded from: classes.dex */
public final class BoxScopeInstance implements IconButtonKt {
    public static final BoxScopeInstance serializer = new BoxScopeInstance();

    @Override // o.IconButtonKt
    public final Modifier align(Modifier modifier, Alignment alignment) {
        return modifier.then(new FloatingActionButtonlFWlFE(alignment, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ObjectList$toString$1(7, alignment) : InspectableValueKt.getNoInspectorInfo()));
    }

    public final Modifier matchParentSize(Modifier modifier) {
        return modifier.then(new FloatingActionButtonlFWlFE(Alignment.Companion.getCenter(), true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new HelpDumpInterceptor$prettyString$1() : InspectableValueKt.getNoInspectorInfo()));
    }
}
