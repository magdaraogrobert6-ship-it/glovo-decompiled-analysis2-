package androidx.compose.ui.node;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import bo.app.c8$$ExternalSyntheticOutline0;
import o.DrawableTransformation;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutNodeKt {
    private static final boolean DebugChanges = false;
    private static final Density DefaultDensity = DensityKt.Density$default(1.0f, 0.0f, 2, null);

    public static final void add(LayoutNode layoutNode, LayoutNode layoutNode2) {
        layoutNode.insertAt$ui(layoutNode.getChildren$ui().size(), layoutNode2);
    }

    public static final <T> T withComposeStackTrace(LayoutNode layoutNode, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) throws Throwable {
        try {
            return (T) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        } catch (Throwable th) {
            layoutNode.rethrowWithComposeStackTrace(th);
            DrawableTransformation.read();
            return null;
        }
    }

    public static final Owner requireOwner(LayoutNode layoutNode) {
        Owner owner$ui = layoutNode.getOwner$ui();
        if (owner$ui != null) {
            return owner$ui;
        }
        throw c8$$ExternalSyntheticOutline0.m("LayoutNode should be attached to an owner");
    }
}
