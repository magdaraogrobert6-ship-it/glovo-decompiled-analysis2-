package androidx.compose.ui.graphics;

import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSizeKt;
import o.createFromParcel;
import o.getBrush;
import o.isAppSetIdReadingEnabled;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setNativeShader;

/* JADX INFO: loaded from: classes.dex */
public final class BlockGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private final boolean isImportantForBounds;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM layerBlock;

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getLayerBlock() {
        return this.layerBlock;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean isImportantForBounds() {
        return this.isImportantForBounds;
    }

    public final void setLayerBlock(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.layerBlock = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final void invalidateLayerBlock() {
        LayoutModifierNodeKt.updateLayerBlock(this, this.layerBlock);
    }

    public BlockGraphicsLayerModifier(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.layerBlock = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.graphics.BlockGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeWithLayer$default(placementScope, placeableMo2209measureBRTryo0, 0, 0, 0.0f, this.getLayerBlock(), 4, (Object) null);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return createFromParcel.INSTANCE;
            }
        }, 4, null);
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.layerBlock + ')';
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        boolean lastClip$ui;
        Shape shape;
        if (ComposeUiFlags.isGraphicsLayerShapeSemanticsEnabled) {
            NodeCoordinator nodeCoordinatorM2391requireCoordinator64DMado = DelegatableNodeKt.m2391requireCoordinator64DMado(this, NodeKind.m2551constructorimpl(2));
            if (nodeCoordinatorM2391requireCoordinator64DMado.getWasLayerBlockInvoked$ui()) {
                Shape lastShape$ui = nodeCoordinatorM2391requireCoordinator64DMado.getLastShape$ui();
                lastClip$ui = nodeCoordinatorM2391requireCoordinator64DMado.getLastClip$ui();
                shape = lastShape$ui;
            } else {
                if (GraphicsLayerModifierKt.reusableGraphicsLayerScope == null) {
                    GraphicsLayerModifierKt.reusableGraphicsLayerScope = new ReusableGraphicsLayerScope();
                } else {
                    ReusableGraphicsLayerScope reusableGraphicsLayerScope = GraphicsLayerModifierKt.reusableGraphicsLayerScope;
                    reusableGraphicsLayerScope.getClass();
                    reusableGraphicsLayerScope.reset();
                }
                ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = GraphicsLayerModifierKt.reusableGraphicsLayerScope;
                reusableGraphicsLayerScope2.getClass();
                reusableGraphicsLayerScope2.setGraphicsDensity$ui(nodeCoordinatorM2391requireCoordinator64DMado.getLayoutNode().getDensity());
                reusableGraphicsLayerScope2.m1053setSizeuvyYCjk(IntSizeKt.m3856toSizeozmzZPI(nodeCoordinatorM2391requireCoordinator64DMado.mo2217getSizeYbymL2g()));
                int iSerializer = isAppSetIdReadingEnabled.serializer();
                getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], iSerializer, isAppSetIdReadingEnabled.serializer(), -676141143);
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
                int iSerializer2 = isAppSetIdReadingEnabled.serializer();
                getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, iSerializer2, isAppSetIdReadingEnabled.serializer(), -1384483406);
                try {
                    this.layerBlock.invoke(reusableGraphicsLayerScope2);
                    setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                    shape = reusableGraphicsLayerScope2.getShape();
                    lastClip$ui = reusableGraphicsLayerScope2.getClip();
                } catch (Throwable th) {
                    setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                    throw th;
                }
            }
            if (lastClip$ui) {
                SemanticsPropertiesKt.setShape(semanticsPropertyReceiver, shape);
            }
        }
    }
}
