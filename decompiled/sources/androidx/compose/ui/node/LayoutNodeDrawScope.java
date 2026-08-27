package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;
import o.onCreateVirtualViewTranslationRequests;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {
    public static final int $stable = 0;
    private final CanvasDrawScope canvasDrawScope;
    private DrawModifierNode drawNode;

    /* JADX INFO: renamed from: draw-eZhPAX0$ui, reason: not valid java name */
    public final void m2460draweZhPAX0$ui(Canvas canvas, long j, NodeCoordinator nodeCoordinator, Modifier.Node node, GraphicsLayer graphicsLayer) {
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(4);
        Modifier.Node nodePop = node;
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = null;
        while (nodePop != null) {
            if (nodePop instanceof DrawModifierNode) {
                m2461drawDirecteZhPAX0$ui(canvas, j, nodeCoordinator, (DrawModifierNode) nodePop, graphicsLayer);
            } else if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                int i = 0;
                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            nodePop = delegate$ui;
                        } else {
                            if (oncreatevirtualviewtranslationrequests == null) {
                                oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                            }
                            if (nodePop != null) {
                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(nodePop);
                                nodePop = null;
                            }
                            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
        }
    }

    public final CanvasDrawScope getCanvasDrawScope() {
        return this.canvasDrawScope;
    }

    public final void performDraw(DrawModifierNode drawModifierNode, Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinatorM2391requireCoordinator64DMado = DelegatableNodeKt.m2391requireCoordinator64DMado(drawModifierNode, NodeKind.m2551constructorimpl(4));
        nodeCoordinatorM2391requireCoordinator64DMado.getLayoutNode().getMDrawScope$ui().m2461drawDirecteZhPAX0$ui(canvas, IntSizeKt.m3856toSizeozmzZPI(nodeCoordinatorM2391requireCoordinator64DMado.mo2217getSizeYbymL2g()), nodeCoordinatorM2391requireCoordinator64DMado, drawModifierNode, graphicsLayer);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-illE91I */
    public void mo1201drawArcillE91I(Brush brush, float f, float f2, boolean z, long j, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1201drawArcillE91I(brush, f, f2, z, j, j2, f3, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-yD3GUKo */
    public void mo1202drawArcyD3GUKo(long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1202drawArcyD3GUKo(j, f, f2, z, j2, j3, f3, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-V9BoPsw */
    public void mo1203drawCircleV9BoPsw(Brush brush, float f, long j, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1203drawCircleV9BoPsw(brush, f, j, f2, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-VaOC9Bg */
    public void mo1204drawCircleVaOC9Bg(long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1204drawCircleVaOC9Bg(j, f, j2, f2, drawStyle, colorFilter, i);
    }

    /* JADX INFO: renamed from: drawDirect-eZhPAX0$ui, reason: not valid java name */
    public final void m2461drawDirecteZhPAX0$ui(Canvas canvas, long j, NodeCoordinator nodeCoordinator, DrawModifierNode drawModifierNode, GraphicsLayer graphicsLayer) {
        DrawModifierNode drawModifierNode2 = this.drawNode;
        this.drawNode = drawModifierNode;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        LayoutDirection layoutDirection = nodeCoordinator.getLayoutDirection();
        Density density = canvasDrawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = canvasDrawScope.getDrawContext().getCanvas();
        long jMo1225getSizeNHjbRc = canvasDrawScope.getDrawContext().mo1225getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = canvasDrawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = canvasDrawScope.getDrawContext();
        drawContext.setDensity(nodeCoordinator);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo1226setSizeuvyYCjk(j);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            drawModifierNode.draw(this);
            canvas.restore();
            DrawContext drawContext2 = canvasDrawScope.getDrawContext();
            drawContext2.setDensity(density);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo1226setSizeuvyYCjk(jMo1225getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
            this.drawNode = drawModifierNode2;
        } catch (Throwable th) {
            canvas.restore();
            DrawContext drawContext3 = canvasDrawScope.getDrawContext();
            drawContext3.setDensity(density);
            drawContext3.setLayoutDirection(layoutDirection2);
            drawContext3.setCanvas(canvas2);
            drawContext3.mo1226setSizeuvyYCjk(jMo1225getSizeNHjbRc);
            drawContext3.setGraphicsLayer(graphicsLayer2);
            throw th;
        }
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @onItemDismisslambda0
    /* JADX INFO: renamed from: drawImage-9jGpkUE */
    public /* synthetic */ void mo1205drawImage9jGpkUE(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1205drawImage9jGpkUE(imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-AZ2fEMs */
    public void mo1206drawImageAZ2fEMs(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        this.canvasDrawScope.mo1206drawImageAZ2fEMs(imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-gbVJVH8 */
    public void mo1207drawImagegbVJVH8(ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1207drawImagegbVJVH8(imageBitmap, j, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-1RTmtNc */
    public void mo1208drawLine1RTmtNc(Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2) {
        this.canvasDrawScope.mo1208drawLine1RTmtNc(brush, j, j2, f, i, pathEffect, f2, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-NGM6Ib0 */
    public void mo1209drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2) {
        this.canvasDrawScope.mo1209drawLineNGM6Ib0(j, j2, j3, f, i, pathEffect, f2, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-AsUm42w */
    public void mo1210drawOvalAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1210drawOvalAsUm42w(brush, j, j2, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-n-J9OG0 */
    public void mo1211drawOvalnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1211drawOvalnJ9OG0(j, j2, j3, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-GBMwjPU */
    public void mo1212drawPathGBMwjPU(Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1212drawPathGBMwjPU(path, brush, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-LG529CI */
    public void mo1213drawPathLG529CI(Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1213drawPathLG529CI(path, j, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-F8ZwMP8 */
    public void mo1214drawPointsF8ZwMP8(List<Offset> list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3) {
        this.canvasDrawScope.mo1214drawPointsF8ZwMP8(list, i, j, f, i2, pathEffect, f2, colorFilter, i3);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-Gsft0Ws */
    public void mo1215drawPointsGsft0Ws(List<Offset> list, int i, Brush brush, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3) {
        this.canvasDrawScope.mo1215drawPointsGsft0Ws(list, i, brush, f, i2, pathEffect, f2, colorFilter, i3);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-AsUm42w */
    public void mo1216drawRectAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1216drawRectAsUm42w(brush, j, j2, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-n-J9OG0 */
    public void mo1217drawRectnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1217drawRectnJ9OG0(j, j2, j3, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-ZuiqVtQ */
    public void mo1218drawRoundRectZuiqVtQ(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1218drawRoundRectZuiqVtQ(brush, j, j2, j3, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-u-Aw5IA */
    public void mo1219drawRoundRectuAw5IA(long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1219drawRoundRectuAw5IA(j, j2, j3, j4, drawStyle, f, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: getCenter-F1C5BW0 */
    public long mo1303getCenterF1C5BW0() {
        return this.canvasDrawScope.mo1303getCenterF1C5BW0();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public DrawContext getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: getSize-NH-jbRc */
    public long mo1304getSizeNHjbRc() {
        return this.canvasDrawScope.mo1304getSizeNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: record-JVtK1S4 */
    public void mo1305recordJVtK1S4(GraphicsLayer graphicsLayer, long j, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        final DrawModifierNode drawModifierNode = this.drawNode;
        graphicsLayer.m1398recordmLhObY(this, getLayoutDirection(), j, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.node.LayoutNodeDrawScope$record$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.node.DrawModifierNode] */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.node.DrawModifierNode] */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.graphics.drawscope.DrawContext] */
            public final void invoke(DrawScope drawScope) throws Throwable {
                ?? drawContext = this.this$0.drawNode;
                this.this$0.drawNode = drawModifierNode;
                try {
                    LayoutNodeDrawScope layoutNodeDrawScope = this.this$0;
                    Density density = drawScope.getDrawContext().getDensity();
                    LayoutDirection layoutDirection = drawScope.getDrawContext().getLayoutDirection();
                    Canvas canvas = drawScope.getDrawContext().getCanvas();
                    long jMo1225getSizeNHjbRc = drawScope.getDrawContext().mo1225getSizeNHjbRc();
                    GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                    Density density2 = layoutNodeDrawScope.getDrawContext().getDensity();
                    LayoutDirection layoutDirection2 = layoutNodeDrawScope.getDrawContext().getLayoutDirection();
                    Canvas canvas2 = layoutNodeDrawScope.getDrawContext().getCanvas();
                    long jMo1225getSizeNHjbRc2 = layoutNodeDrawScope.getDrawContext().mo1225getSizeNHjbRc();
                    GraphicsLayer graphicsLayer3 = layoutNodeDrawScope.getDrawContext().getGraphicsLayer();
                    try {
                        drawContext = layoutNodeDrawScope.getDrawContext();
                        drawContext.setDensity(density);
                        drawContext.setLayoutDirection(layoutDirection);
                        drawContext.setCanvas(canvas);
                        drawContext.mo1226setSizeuvyYCjk(jMo1225getSizeNHjbRc);
                        drawContext.setGraphicsLayer(graphicsLayer2);
                        canvas.save();
                        try {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(layoutNodeDrawScope);
                            canvas.restore();
                            DrawContext drawContext2 = layoutNodeDrawScope.getDrawContext();
                            drawContext2.setDensity(density2);
                            drawContext2.setLayoutDirection(layoutDirection2);
                            drawContext2.setCanvas(canvas2);
                            drawContext2.mo1226setSizeuvyYCjk(jMo1225getSizeNHjbRc2);
                            drawContext2.setGraphicsLayer(graphicsLayer3);
                            this.this$0.drawNode = drawContext;
                        } catch (Throwable th) {
                            canvas.restore();
                            DrawContext drawContext3 = layoutNodeDrawScope.getDrawContext();
                            drawContext3.setDensity(density2);
                            drawContext3.setLayoutDirection(layoutDirection2);
                            drawContext3.setCanvas(canvas2);
                            drawContext3.mo1226setSizeuvyYCjk(jMo1225getSizeNHjbRc2);
                            drawContext3.setGraphicsLayer(graphicsLayer3);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        drawContext = drawContext;
                        this.this$0.drawNode = drawContext;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                invoke((DrawScope) obj);
                return createFromParcel.INSTANCE;
            }
        });
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public int mo41roundToPxR2X_6o(long j) {
        return this.canvasDrawScope.mo41roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public int mo42roundToPx0680j_4(float f) {
        return this.canvasDrawScope.mo42roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public float mo43toDpGaN1DYA(long j) {
        return this.canvasDrawScope.mo43toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo44toDpu2uoSUM(float f) {
        return this.canvasDrawScope.mo44toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public long mo46toDpSizekrfVVM(long j) {
        return this.canvasDrawScope.mo46toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public float mo47toPxR2X_6o(long j) {
        return this.canvasDrawScope.mo47toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public float mo48toPx0680j_4(float f) {
        return this.canvasDrawScope.mo48toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect) {
        return this.canvasDrawScope.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public long mo49toSizeXkaWNTQ(long j) {
        return this.canvasDrawScope.mo49toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public long mo50toSp0xMU5do(float f) {
        return this.canvasDrawScope.mo50toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo51toSpkPz2Gy4(float f) {
        return this.canvasDrawScope.mo51toSpkPz2Gy4(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // androidx.compose.ui.graphics.drawscope.ContentDrawScope
    public void drawContent() {
        Canvas canvas = getDrawContext().getCanvas();
        DrawModifierNode drawModifierNode = this.drawNode;
        if (drawModifierNode == null) {
            throw c8$$ExternalSyntheticOutline0.m("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        ?? NextDrawNode = LayoutNodeDrawScopeKt.nextDrawNode(drawModifierNode);
        if (NextDrawNode == 0) {
            NodeCoordinator nodeCoordinatorM2391requireCoordinator64DMado = DelegatableNodeKt.m2391requireCoordinator64DMado(drawModifierNode, NodeKind.m2551constructorimpl(4));
            if (nodeCoordinatorM2391requireCoordinator64DMado.getTail() == drawModifierNode.getNode()) {
                nodeCoordinatorM2391requireCoordinator64DMado = nodeCoordinatorM2391requireCoordinator64DMado.getWrapped$ui();
                nodeCoordinatorM2391requireCoordinator64DMado.getClass();
            }
            nodeCoordinatorM2391requireCoordinator64DMado.performDraw(canvas, getDrawContext().getGraphicsLayer());
            return;
        }
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(4);
        ?? oncreatevirtualviewtranslationrequests = 0;
        while (NextDrawNode != 0) {
            if (NextDrawNode instanceof DrawModifierNode) {
                performDraw((DrawModifierNode) NextDrawNode, canvas, getDrawContext().getGraphicsLayer());
            } else if ((NextDrawNode.getKindSet$ui() & iM2551constructorimpl) != 0 && (NextDrawNode instanceof DelegatingNode)) {
                Modifier.Node delegate$ui = ((DelegatingNode) NextDrawNode).getDelegate$ui();
                int i = 0;
                NextDrawNode = NextDrawNode;
                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                while (delegate$ui != null) {
                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                            NextDrawNode = delegate$ui;
                        } else {
                            if (oncreatevirtualviewtranslationrequests == 0) {
                                oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                            }
                            if (NextDrawNode != 0) {
                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(NextDrawNode);
                                NextDrawNode = 0;
                            }
                            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                        }
                    }
                    delegate$ui = delegate$ui.getChild$ui();
                    NextDrawNode = NextDrawNode;
                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                }
                if (i == 1) {
                }
            }
            NextDrawNode = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
        }
    }

    public /* synthetic */ LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo45toDpu2uoSUM(int i) {
        return this.canvasDrawScope.mo45toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo52toSpkPz2Gy4(int i) {
        return this.canvasDrawScope.mo52toSpkPz2Gy4(i);
    }

    public LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope) {
        this.canvasDrawScope = canvasDrawScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNodeDrawScope() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
