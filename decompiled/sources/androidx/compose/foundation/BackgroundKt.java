package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import com.mapbox.navigation.core.reroute.MapboxRerouteController$requestAsync$2$1;
import o.LazyList;
import o.LazyListKt;
import o.getTopLeftannotations;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public abstract class BackgroundKt {
    public static Modifier background$default(Modifier modifier, Brush brush, getTopLeftannotations gettopleftannotations, float f, int i) {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM noInspectorInfo;
        Shape rectangleShape = gettopleftannotations;
        if ((i & 2) != 0) {
            rectangleShape = RectangleShapeKt.getRectangleShape();
        }
        Shape shape = rectangleShape;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new LazyListKt(f2, brush, shape);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new LazyList(0L, brush, f2, shape, noInspectorInfo, 1));
    }

    /* JADX INFO: renamed from: background-bw27NRU, reason: not valid java name */
    public static final Modifier m20backgroundbw27NRU(Modifier modifier, long j, Shape shape) {
        return modifier.then(new LazyList(j, null, 1.0f, shape, InspectableValueKt.isDebugInspectorInfoEnabled() ? new MapboxRerouteController$requestAsync$2$1(j, shape) : InspectableValueKt.getNoInspectorInfo(), 2));
    }
}
