package androidx.compose.ui.graphics;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.MediaSessionCompatQueueItem;
import o.getCieXyz;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
final class GraphicsLayerElement extends ModifierNodeElement<SimpleGraphicsLayerModifier> {
    private final float alpha;
    private final long ambientShadowColor;
    private final int blendMode;
    private final float cameraDistance;
    private final boolean clip;
    private final ColorFilter colorFilter;
    private final int compositingStrategy;
    private final RenderEffect renderEffect;
    private final float rotationX;
    private final float rotationY;
    private final float rotationZ;
    private final float scaleX;
    private final float scaleY;
    private final float shadowElevation;
    private final Shape shape;
    private final long spotShadowColor;
    private final long transformOrigin;
    private final float translationX;
    private final float translationY;

    public final float component1() {
        return this.scaleX;
    }

    public final float component10() {
        return this.cameraDistance;
    }

    /* JADX INFO: renamed from: component11-SzJe1aQ, reason: not valid java name */
    public final long m874component11SzJe1aQ() {
        return this.transformOrigin;
    }

    public final Shape component12() {
        return this.shape;
    }

    public final boolean component13() {
        return this.clip;
    }

    public final RenderEffect component14() {
        return this.renderEffect;
    }

    /* JADX INFO: renamed from: component15-0d7_KjU, reason: not valid java name */
    public final long m875component150d7_KjU() {
        return this.ambientShadowColor;
    }

    /* JADX INFO: renamed from: component16-0d7_KjU, reason: not valid java name */
    public final long m876component160d7_KjU() {
        return this.spotShadowColor;
    }

    /* JADX INFO: renamed from: component17--NrFUSI, reason: not valid java name */
    public final int m877component17NrFUSI() {
        return this.compositingStrategy;
    }

    /* JADX INFO: renamed from: component18-0nO6VwU, reason: not valid java name */
    public final int m878component180nO6VwU() {
        return this.blendMode;
    }

    public final ColorFilter component19() {
        return this.colorFilter;
    }

    public final float component2() {
        return this.scaleY;
    }

    public final float component3() {
        return this.alpha;
    }

    public final float component4() {
        return this.translationX;
    }

    public final float component5() {
        return this.translationY;
    }

    public final float component6() {
        return this.shadowElevation;
    }

    public final float component7() {
        return this.rotationX;
    }

    public final float component8() {
        return this.rotationY;
    }

    public final float component9() {
        return this.rotationZ;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m880getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m881getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m882getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m883getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    /* JADX INFO: renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m884getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline1.m(this.cameraDistance, af$$ExternalSyntheticOutline1.m(this.rotationZ, af$$ExternalSyntheticOutline1.m(this.rotationY, af$$ExternalSyntheticOutline1.m(this.rotationX, af$$ExternalSyntheticOutline1.m(this.shadowElevation, af$$ExternalSyntheticOutline1.m(this.translationY, af$$ExternalSyntheticOutline1.m(this.translationX, af$$ExternalSyntheticOutline1.m(this.alpha, af$$ExternalSyntheticOutline1.m(this.scaleY, Float.hashCode(this.scaleX) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int iM2 = d$$ExternalSyntheticOutline0.m((this.shape.hashCode() + ((TransformOrigin.m1135hashCodeimpl(this.transformOrigin) + iM) * 31)) * 31, 31, this.clip);
        RenderEffect renderEffect = this.renderEffect;
        int iIconCompatParcelizer = MediaSessionCompatQueueItem.IconCompatParcelizer(MediaSessionCompatQueueItem.IconCompatParcelizer((iM2 + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31, 31, this.ambientShadowColor), 31, this.spotShadowColor);
        int iM811hashCodeimpl = CompositingStrategy.m811hashCodeimpl(this.compositingStrategy);
        int iM632hashCodeimpl = BlendMode.m632hashCodeimpl(this.blendMode);
        ColorFilter colorFilter = this.colorFilter;
        return ((iM632hashCodeimpl + ((iM811hashCodeimpl + iIconCompatParcelizer) * 31)) * 31) + (colorFilter != null ? colorFilter.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("scaleX", Float.valueOf(this.scaleX));
        inspectorInfo.getProperties().set("scaleY", Float.valueOf(this.scaleY));
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("translationX", Float.valueOf(this.translationX));
        inspectorInfo.getProperties().set("translationY", Float.valueOf(this.translationY));
        inspectorInfo.getProperties().set("shadowElevation", Float.valueOf(this.shadowElevation));
        inspectorInfo.getProperties().set("rotationX", Float.valueOf(this.rotationX));
        inspectorInfo.getProperties().set("rotationY", Float.valueOf(this.rotationY));
        inspectorInfo.getProperties().set("rotationZ", Float.valueOf(this.rotationZ));
        inspectorInfo.getProperties().set("cameraDistance", Float.valueOf(this.cameraDistance));
        inspectorInfo.getProperties().set("transformOrigin", TransformOrigin.m1125boximpl(this.transformOrigin));
        inspectorInfo.getProperties().set("shape", this.shape);
        af$$ExternalSyntheticOutline1.m(this.clip, inspectorInfo.getProperties(), "clip", inspectorInfo).set("renderEffect", this.renderEffect);
        inspectorInfo.getProperties().set("ambientShadowColor", Color.m712boximpl(this.ambientShadowColor));
        inspectorInfo.getProperties().set("spotShadowColor", Color.m712boximpl(this.spotShadowColor));
        inspectorInfo.getProperties().set("compositingStrategy", CompositingStrategy.m807boximpl(this.compositingStrategy));
        inspectorInfo.getProperties().set("blendMode", BlendMode.m628boximpl(this.blendMode));
        inspectorInfo.getProperties().set("colorFilter", this.colorFilter);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        simpleGraphicsLayerModifier.setScaleX(this.scaleX);
        simpleGraphicsLayerModifier.setScaleY(this.scaleY);
        simpleGraphicsLayerModifier.setAlpha(this.alpha);
        simpleGraphicsLayerModifier.setTranslationX(this.translationX);
        simpleGraphicsLayerModifier.setTranslationY(this.translationY);
        simpleGraphicsLayerModifier.setShadowElevation(this.shadowElevation);
        simpleGraphicsLayerModifier.setRotationX(this.rotationX);
        simpleGraphicsLayerModifier.setRotationY(this.rotationY);
        simpleGraphicsLayerModifier.setRotationZ(this.rotationZ);
        simpleGraphicsLayerModifier.setCameraDistance(this.cameraDistance);
        simpleGraphicsLayerModifier.m1080setTransformOrigin__ExYCQ(this.transformOrigin);
        simpleGraphicsLayerModifier.setShape(this.shape);
        simpleGraphicsLayerModifier.setClip(this.clip);
        simpleGraphicsLayerModifier.setRenderEffect(this.renderEffect);
        simpleGraphicsLayerModifier.m1076setAmbientShadowColor8_81llA(this.ambientShadowColor);
        simpleGraphicsLayerModifier.m1079setSpotShadowColor8_81llA(this.spotShadowColor);
        simpleGraphicsLayerModifier.m1078setCompositingStrategyaDBOjCE(this.compositingStrategy);
        simpleGraphicsLayerModifier.m1077setBlendModes9anfk8(this.blendMode);
        simpleGraphicsLayerModifier.setColorFilter(this.colorFilter);
        simpleGraphicsLayerModifier.invalidateLayerBlock();
    }

    private GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, int i2, ColorFilter colorFilter) {
        this.scaleX = f;
        this.scaleY = f2;
        this.alpha = f3;
        this.translationX = f4;
        this.translationY = f5;
        this.shadowElevation = f6;
        this.rotationX = f7;
        this.rotationY = f8;
        this.rotationZ = f9;
        this.cameraDistance = f10;
        this.transformOrigin = j;
        this.shape = shape;
        this.clip = z;
        this.renderEffect = renderEffect;
        this.ambientShadowColor = j2;
        this.spotShadowColor = j3;
        this.compositingStrategy = i;
        this.blendMode = i2;
        this.colorFilter = colorFilter;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        if (Float.compare(this.scaleX, graphicsLayerElement.scaleX) != 0 || Float.compare(this.scaleY, graphicsLayerElement.scaleY) != 0 || Float.compare(this.alpha, graphicsLayerElement.alpha) != 0 || Float.compare(this.translationX, graphicsLayerElement.translationX) != 0 || Float.compare(this.translationY, graphicsLayerElement.translationY) != 0 || Float.compare(this.shadowElevation, graphicsLayerElement.shadowElevation) != 0 || Float.compare(this.rotationX, graphicsLayerElement.rotationX) != 0 || Float.compare(this.rotationY, graphicsLayerElement.rotationY) != 0 || Float.compare(this.rotationZ, graphicsLayerElement.rotationZ) != 0 || Float.compare(this.cameraDistance, graphicsLayerElement.cameraDistance) != 0 || !TransformOrigin.m1132equalsimpl0(this.transformOrigin, graphicsLayerElement.transformOrigin)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shape, graphicsLayerElement.shape}, getCieXyz.write())).booleanValue() || this.clip != graphicsLayerElement.clip) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.renderEffect, graphicsLayerElement.renderEffect}, getCieXyz.write())).booleanValue() || !Color.m723equalsimpl0(this.ambientShadowColor, graphicsLayerElement.ambientShadowColor) || !Color.m723equalsimpl0(this.spotShadowColor, graphicsLayerElement.spotShadowColor) || !CompositingStrategy.m810equalsimpl0(this.compositingStrategy, graphicsLayerElement.compositingStrategy) || !BlendMode.m631equalsimpl0(this.blendMode, graphicsLayerElement.blendMode)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.colorFilter, graphicsLayerElement.colorFilter}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.scaleX);
        sb.append(", scaleY=");
        sb.append(this.scaleY);
        sb.append(", alpha=");
        sb.append(this.alpha);
        sb.append(", translationX=");
        sb.append(this.translationX);
        sb.append(", translationY=");
        sb.append(this.translationY);
        sb.append(", shadowElevation=");
        sb.append(this.shadowElevation);
        sb.append(", rotationX=");
        sb.append(this.rotationX);
        sb.append(", rotationY=");
        sb.append(this.rotationY);
        sb.append(", rotationZ=");
        sb.append(this.rotationZ);
        sb.append(", cameraDistance=");
        sb.append(this.cameraDistance);
        sb.append(", transformOrigin=");
        sb.append((Object) TransformOrigin.m1136toStringimpl(this.transformOrigin));
        sb.append(", shape=");
        sb.append(this.shape);
        sb.append(", clip=");
        sb.append(this.clip);
        sb.append(", renderEffect=");
        sb.append(this.renderEffect);
        sb.append(", ambientShadowColor=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(this.ambientShadowColor, ", spotShadowColor=", sb);
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(this.spotShadowColor, ", compositingStrategy=", sb);
        sb.append((Object) CompositingStrategy.m812toStringimpl(this.compositingStrategy));
        sb.append(", blendMode=");
        sb.append((Object) BlendMode.m633toStringimpl(this.blendMode));
        sb.append(", colorFilter=");
        sb.append(this.colorFilter);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SimpleGraphicsLayerModifier create() {
        return new SimpleGraphicsLayerModifier(this.scaleX, this.scaleY, this.alpha, this.translationX, this.translationY, this.shadowElevation, this.rotationX, this.rotationY, this.rotationZ, this.cameraDistance, this.transformOrigin, this.shape, this.clip, this.renderEffect, this.ambientShadowColor, this.spotShadowColor, this.compositingStrategy, this.blendMode, this.colorFilter, null);
    }

    /* JADX INFO: renamed from: copy-cp5nf6A, reason: not valid java name */
    public final GraphicsLayerElement m879copycp5nf6A(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, int i2, ColorFilter colorFilter) {
        return new GraphicsLayerElement(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3, i, i2, colorFilter, null);
    }

    public /* synthetic */ GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, int i2, ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3, i, i2, colorFilter);
    }
}
