package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;
import o.createFromParcel;
import o.getCieXyz;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {
    public static final int $stable = 0;
    private final long ambientColor;
    private final boolean clip;
    private final float elevation;
    private final Shape shape;
    private final long spotColor;

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m309component1D9Ej5fM() {
        return this.elevation;
    }

    public final Shape component2() {
        return this.shape;
    }

    public final boolean component3() {
        return this.clip;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m310component40d7_KjU() {
        return this.ambientColor;
    }

    /* JADX INFO: renamed from: component5-0d7_KjU, reason: not valid java name */
    public final long m311component50d7_KjU() {
        return this.spotColor;
    }

    /* JADX INFO: renamed from: getAmbientColor-0d7_KjU, reason: not valid java name */
    public final long m313getAmbientColor0d7_KjU() {
        return this.ambientColor;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m314getElevationD9Ej5fM() {
        return this.elevation;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: getSpotColor-0d7_KjU, reason: not valid java name */
    public final long m315getSpotColor0d7_KjU() {
        return this.spotColor;
    }

    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM createBlock() {
        return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.draw.ShadowGraphicsLayerElement.createBlock.1
            public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo48toPx0680j_4(ShadowGraphicsLayerElement.this.m314getElevationD9Ej5fM()));
                graphicsLayerScope.setShape(ShadowGraphicsLayerElement.this.getShape());
                graphicsLayerScope.setClip(ShadowGraphicsLayerElement.this.getClip());
                graphicsLayerScope.mo922setAmbientShadowColor8_81llA(ShadowGraphicsLayerElement.this.m313getAmbientColor0d7_KjU());
                graphicsLayerScope.mo925setSpotShadowColor8_81llA(ShadowGraphicsLayerElement.this.m315getSpotColor0d7_KjU());
            }

            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((GraphicsLayerScope) obj);
                return createFromParcel.INSTANCE;
            }
        };
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BlockGraphicsLayerModifier create() {
        return new BlockGraphicsLayerModifier(createBlock());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iM3679hashCodeimpl = Dp.m3679hashCodeimpl(this.elevation);
        return Color.m729hashCodeimpl(this.spotColor) + MediaSessionCompatQueueItem.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m((this.shape.hashCode() + (iM3679hashCodeimpl * 31)) * 31, 31, this.clip), 31, this.ambientColor);
    }

    private ShadowGraphicsLayerElement(float f, Shape shape, boolean z, long j, long j2) {
        this.elevation = f;
        this.shape = shape;
        this.clip = z;
        this.ambientColor = j;
        this.spotColor = j2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("shadow");
        MediaSessionCompatQueueItem.serializer(this.elevation, inspectorInfo.getProperties(), "elevation", inspectorInfo).set("shape", this.shape);
        af$$ExternalSyntheticOutline1.m(this.clip, inspectorInfo.getProperties(), "clip", inspectorInfo).set("ambientColor", Color.m712boximpl(this.ambientColor));
        inspectorInfo.getProperties().set("spotColor", Color.m712boximpl(this.spotColor));
    }

    /* JADX INFO: renamed from: copy-gNMxBKI$default, reason: not valid java name */
    public static /* synthetic */ ShadowGraphicsLayerElement m308copygNMxBKI$default(ShadowGraphicsLayerElement shadowGraphicsLayerElement, float f, Shape shape, boolean z, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = shadowGraphicsLayerElement.elevation;
        }
        if ((i & 2) != 0) {
            shape = shadowGraphicsLayerElement.shape;
        }
        Shape shape2 = shape;
        if ((i & 4) != 0) {
            z = shadowGraphicsLayerElement.clip;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            j = shadowGraphicsLayerElement.ambientColor;
        }
        long j3 = j;
        if ((i & 16) != 0) {
            j2 = shadowGraphicsLayerElement.spotColor;
        }
        return shadowGraphicsLayerElement.m312copygNMxBKI(f, shape2, z2, j3, j2);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        if (!Dp.m3678equalsimpl0(this.elevation, shadowGraphicsLayerElement.elevation)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shape, shadowGraphicsLayerElement.shape}, getCieXyz.write())).booleanValue() && this.clip == shadowGraphicsLayerElement.clip && Color.m723equalsimpl0(this.ambientColor, shadowGraphicsLayerElement.ambientColor) && Color.m723equalsimpl0(this.spotColor, shadowGraphicsLayerElement.spotColor);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(this.elevation, ", shape=", sb);
        sb.append(this.shape);
        sb.append(", clip=");
        sb.append(this.clip);
        sb.append(", ambientColor=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(this.ambientColor, ", spotColor=", sb);
        sb.append((Object) Color.m730toStringimpl(this.spotColor));
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        blockGraphicsLayerModifier.setLayerBlock(createBlock());
        blockGraphicsLayerModifier.invalidateLayerBlock();
    }

    /* JADX INFO: renamed from: copy-gNMxBKI, reason: not valid java name */
    public final ShadowGraphicsLayerElement m312copygNMxBKI(float f, Shape shape, boolean z, long j, long j2) {
        return new ShadowGraphicsLayerElement(f, shape, z, j, j2, null);
    }

    public /* synthetic */ ShadowGraphicsLayerElement(float f, Shape shape, boolean z, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, shape, z, j, j2);
    }
}
