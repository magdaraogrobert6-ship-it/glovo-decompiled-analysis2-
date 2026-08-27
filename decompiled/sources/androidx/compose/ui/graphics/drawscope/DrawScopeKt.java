package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.DegreesKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.c8$$ExternalSyntheticOutline0;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class DrawScopeKt {
    /* JADX INFO: renamed from: clipPath-KD09W0M, reason: not valid java name */
    public static final void m1344clipPathKD09W0M(DrawScope drawScope, Path path, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo1227clipPathmtrdDE(path, i);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
        }
    }

    /* JADX INFO: renamed from: clipPath-KD09W0M$default, reason: not valid java name */
    public static /* synthetic */ void m1345clipPathKD09W0M$default(DrawScope drawScope, Path path, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = ClipOp.Companion.m711getIntersectrtfAjoo();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo1227clipPathmtrdDE(path, i);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
        }
    }

    /* JADX INFO: renamed from: clipRect-rOu3jXo, reason: not valid java name */
    public static final void m1346clipRectrOu3jXo(DrawScope drawScope, float f, float f2, float f3, float f4, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo1228clipRectN_I0leg(f, f2, f3, f4, i);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
        }
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: draw-GRGpd60, reason: not valid java name */
    public static final /* synthetic */ void m1348drawGRGpd60(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo1225getSizeNHjbRc = drawScope.getDrawContext().mo1225getSizeNHjbRc();
        GraphicsLayer graphicsLayer = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo1226setSizeuvyYCjk(j);
        drawContext.setGraphicsLayer(null);
        canvas.save();
        try {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo1226setSizeuvyYCjk(jMo1225getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer);
        }
    }

    /* JADX INFO: renamed from: draw-ymL40Pk, reason: not valid java name */
    public static final void m1349drawymL40Pk(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j, GraphicsLayer graphicsLayer, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo1225getSizeNHjbRc = drawScope.getDrawContext().mo1225getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo1226setSizeuvyYCjk(j);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo1226setSizeuvyYCjk(jMo1225getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
        }
    }

    public static final void drawIntoCanvas(DrawScope drawScope, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope.getDrawContext().getCanvas());
    }

    public static final void inset(DrawScope drawScope, float f, float f2, float f3, float f4, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        drawScope.getDrawContext().getTransform().inset(f, f2, f3, f4);
        try {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            drawScope.getDrawContext().getTransform().inset(-f, -f2, -f3, -f4);
        }
    }

    /* JADX INFO: renamed from: rotate-Rg1IO4c, reason: not valid java name */
    public static final void m1351rotateRg1IO4c(DrawScope drawScope, float f, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo1231rotateUv8p0NA(f, j);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
        }
    }

    /* JADX INFO: renamed from: rotate-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m1352rotateRg1IO4c$default(DrawScope drawScope, float f, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawScope.mo1303getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo1231rotateUv8p0NA(f, j);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
        }
    }

    /* JADX INFO: renamed from: rotateRad-Rg1IO4c, reason: not valid java name */
    public static final void m1353rotateRadRg1IO4c(DrawScope drawScope, float f, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo1231rotateUv8p0NA(DegreesKt.degrees(f), j);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
        }
    }

    /* JADX INFO: renamed from: rotateRad-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m1354rotateRadRg1IO4c$default(DrawScope drawScope, float f, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawScope.mo1303getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo1231rotateUv8p0NA(DegreesKt.degrees(f), j);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
        }
    }

    /* JADX INFO: renamed from: scale-Fgt4K4Q, reason: not valid java name */
    public static final void m1355scaleFgt4K4Q(DrawScope drawScope, float f, float f2, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo1232scale0AR0LA0(f, f2, j);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
        }
    }

    /* JADX INFO: renamed from: scale-Fgt4K4Q$default, reason: not valid java name */
    public static /* synthetic */ void m1356scaleFgt4K4Q$default(DrawScope drawScope, float f, float f2, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 4) != 0) {
            j = drawScope.mo1303getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo1232scale0AR0LA0(f, f2, j);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
        }
    }

    /* JADX INFO: renamed from: scale-Rg1IO4c, reason: not valid java name */
    public static final void m1357scaleRg1IO4c(DrawScope drawScope, float f, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo1232scale0AR0LA0(f, f, j);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
        }
    }

    /* JADX INFO: renamed from: scale-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m1358scaleRg1IO4c$default(DrawScope drawScope, float f, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawScope.mo1303getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo1232scale0AR0LA0(f, f, j);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
        }
    }

    public static final void translate(DrawScope drawScope, float f, float f2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        drawScope.getDrawContext().getTransform().translate(f, f2);
        try {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            drawScope.getDrawContext().getTransform().translate(-f, -f2);
        }
    }

    public static final void withTransform(DrawScope drawScope, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawContext.getTransform());
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(drawScope);
        } finally {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
        }
    }

    /* JADX INFO: renamed from: draw-ymL40Pk$default, reason: not valid java name */
    public static /* synthetic */ void m1350drawymL40Pk$default(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j, GraphicsLayer graphicsLayer, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 16) != 0) {
            graphicsLayer = null;
        }
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo1225getSizeNHjbRc = drawScope.getDrawContext().mo1225getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo1226setSizeuvyYCjk(j);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo1226setSizeuvyYCjk(jMo1225getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
        }
    }

    public static /* synthetic */ void inset$default(DrawScope drawScope, float f, float f2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().inset(f, f2, f, f2);
        try {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            float f3 = -f;
            float f4 = -f2;
            drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
        }
    }

    public static /* synthetic */ void translate$default(DrawScope drawScope, float f, float f2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().translate(f, f2);
        try {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            drawScope.getDrawContext().getTransform().translate(-f, -f2);
        }
    }

    /* JADX INFO: renamed from: clipRect-rOu3jXo$default, reason: not valid java name */
    public static /* synthetic */ void m1347clipRectrOu3jXo$default(DrawScope drawScope, float f, float f2, float f3, float f4, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i2, Object obj) {
        float f5 = (i2 & 1) != 0 ? 0.0f : f;
        float f6 = (i2 & 2) != 0 ? 0.0f : f2;
        if ((i2 & 4) != 0) {
            f3 = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32));
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() & 4294967295L));
        }
        float f8 = f4;
        if ((i2 & 16) != 0) {
            i = ClipOp.Companion.m711getIntersectrtfAjoo();
        }
        int i3 = i;
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo1228clipRectN_I0leg(f5, f6, f7, f8, i3);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
        }
    }

    public static final void inset(DrawScope drawScope, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        drawScope.getDrawContext().getTransform().inset(f, f, f, f);
        try {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            float f2 = -f;
            drawScope.getDrawContext().getTransform().inset(f2, f2, f2, f2);
        }
    }

    public static final void inset(DrawScope drawScope, float f, float f2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        drawScope.getDrawContext().getTransform().inset(f, f2, f, f2);
        try {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            float f3 = -f;
            float f4 = -f2;
            drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
        }
    }
}
