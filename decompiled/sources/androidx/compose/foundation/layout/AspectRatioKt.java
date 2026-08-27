package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Constraints;
import com.mapbox.navigation.core.internal.dump.HelpDumpInterceptor$prettyString$1;
import o.ThumbNode;
import o.getViewportSizeYbymL2g;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public abstract class AspectRatioKt {
    public static final getViewportSizeYbymL2g RemoteActionCompatParcelizer = new getViewportSizeYbymL2g(15);
    public static final getViewportSizeYbymL2g serializer = new getViewportSizeYbymL2g(16);
    public static final getViewportSizeYbymL2g read = new getViewportSizeYbymL2g(17);
    public static final getViewportSizeYbymL2g write = new getViewportSizeYbymL2g(18);

    public static final Modifier write(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        return modifier.then(new ThumbNode(r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2));
    }

    public static final boolean serializer(int i, int i2, long j) {
        int iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(j);
        if (i > Constraints.m3626getMaxWidthimpl(j) || iM3628getMinWidthimpl > i) {
            return false;
        }
        return i2 <= Constraints.m3625getMaxHeightimpl(j) && Constraints.m3627getMinHeightimpl(j) <= i2;
    }

    public static final Modifier RemoteActionCompatParcelizer(Modifier modifier) {
        return write(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new HelpDumpInterceptor$prettyString$1(1, 3) : InspectableValueKt.getNoInspectorInfo(), read);
    }

    public static final Modifier read(Modifier modifier) {
        return write(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new HelpDumpInterceptor$prettyString$1(1, 5) : InspectableValueKt.getNoInspectorInfo(), serializer);
    }

    public static final Modifier serializer(Modifier modifier) {
        return write(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new HelpDumpInterceptor$prettyString$1(1, 6) : InspectableValueKt.getNoInspectorInfo(), RemoteActionCompatParcelizer);
    }
}
