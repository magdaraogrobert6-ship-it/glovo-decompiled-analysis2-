package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.af$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.onRemeasuredozmzZPI;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
final class AndroidShadowContext implements PlatformShadowContext, DropShadowRendererProvider, InnerShadowRendererProvider {
    private onRemeasuredozmzZPI dropShadowCache;
    private onRemeasuredozmzZPI innerShadowCache;
    private ShadowKey shadowKey;

    public static final class ShadowKey {
        public static final int $stable = 8;
        private float density;
        private LayoutDirection layoutDirection;
        private Shadow shadow;
        private Shape shape;
        private long size;

        public final Shape component1() {
            return this.shape;
        }

        /* JADX INFO: renamed from: component2-NH-jbRc, reason: not valid java name */
        public final long m1434component2NHjbRc() {
            return this.size;
        }

        public final LayoutDirection component3() {
            return this.layoutDirection;
        }

        public final float component4() {
            return this.density;
        }

        public final Shadow component5() {
            return this.shadow;
        }

        public final float getDensity() {
            return this.density;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public final Shadow getShadow() {
            return this.shadow;
        }

        public final Shape getShape() {
            return this.shape;
        }

        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long m1436getSizeNHjbRc() {
            return this.size;
        }

        public final void setDensity(float f) {
            this.density = f;
        }

        public final void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        public final void setShadow(Shadow shadow) {
            this.shadow = shadow;
        }

        public final void setShape(Shape shape) {
            this.shape = shape;
        }

        /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void m1437setSizeuvyYCjk(long j) {
            this.size = j;
        }

        public int hashCode() {
            int iHashCode = this.shape.hashCode();
            int iM = af$$ExternalSyntheticOutline1.m(this.density, (this.layoutDirection.hashCode() + ((Size.m547hashCodeimpl(this.size) + (iHashCode * 31)) * 31)) * 31, 31);
            Shadow shadow = this.shadow;
            return iM + (shadow == null ? 0 : shadow.hashCode());
        }

        public /* synthetic */ ShadowKey(Shape shape, long j, LayoutDirection layoutDirection, float f, Shadow shadow, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? RectangleShapeKt.getRectangleShape() : shape, (i & 2) != 0 ? Size.Companion.m555getZeroNHjbRc() : j, (i & 4) != 0 ? LayoutDirection.Ltr : layoutDirection, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? null : shadow, null);
        }

        /* JADX INFO: renamed from: copy-eZhPAX0$default, reason: not valid java name */
        public static /* synthetic */ ShadowKey m1433copyeZhPAX0$default(ShadowKey shadowKey, Shape shape, long j, LayoutDirection layoutDirection, float f, Shadow shadow, int i, Object obj) {
            if ((i & 1) != 0) {
                shape = shadowKey.shape;
            }
            if ((i & 2) != 0) {
                j = shadowKey.size;
            }
            long j2 = j;
            if ((i & 4) != 0) {
                layoutDirection = shadowKey.layoutDirection;
            }
            LayoutDirection layoutDirection2 = layoutDirection;
            if ((i & 8) != 0) {
                f = shadowKey.density;
            }
            float f2 = f;
            if ((i & 16) != 0) {
                shadow = shadowKey.shadow;
            }
            return shadowKey.m1435copyeZhPAX0(shape, j2, layoutDirection2, f2, shadow);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShadowKey)) {
                return false;
            }
            ShadowKey shadowKey = (ShadowKey) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shape, shadowKey.shape}, getCieXyz.write())).booleanValue() || !Size.m542equalsimpl0(this.size, shadowKey.size) || this.layoutDirection != shadowKey.layoutDirection || Float.compare(this.density, shadowKey.density) != 0) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shadow, shadowKey.shadow}, getCieXyz.write())).booleanValue();
        }

        public String toString() {
            return "ShadowKey(shape=" + this.shape + ", size=" + ((Object) Size.m550toStringimpl(this.size)) + ", layoutDirection=" + this.layoutDirection + ", density=" + this.density + ", shadow=" + this.shadow + ')';
        }

        /* JADX INFO: renamed from: copy-eZhPAX0, reason: not valid java name */
        public final ShadowKey m1435copyeZhPAX0(Shape shape, long j, LayoutDirection layoutDirection, float f, Shadow shadow) {
            return new ShadowKey(shape, j, layoutDirection, f, shadow, null);
        }

        private ShadowKey(Shape shape, long j, LayoutDirection layoutDirection, float f, Shadow shadow) {
            this.shape = shape;
            this.size = j;
            this.layoutDirection = layoutDirection;
            this.density = f;
            this.shadow = shadow;
        }

        public /* synthetic */ ShadowKey(Shape shape, long j, LayoutDirection layoutDirection, float f, Shadow shadow, DefaultConstructorMarker defaultConstructorMarker) {
            this(shape, j, layoutDirection, f, shadow);
        }
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowContext
    public void clearCache() {
        synchronized (this) {
            onRemeasuredozmzZPI onremeasuredozmzzpi = this.dropShadowCache;
            if (onremeasuredozmzzpi != null) {
                onremeasuredozmzzpi.IconCompatParcelizer();
            }
            onRemeasuredozmzZPI onremeasuredozmzzpi2 = this.innerShadowCache;
            if (onremeasuredozmzzpi2 != null) {
                onremeasuredozmzzpi2.IconCompatParcelizer();
            }
            this.shadowKey = null;
        }
    }

    @Override // androidx.compose.ui.graphics.shadow.DropShadowRendererProvider
    /* JADX INFO: renamed from: obtainDropShadowRenderer-eZhPAX0, reason: not valid java name */
    public DropShadowRenderer mo1431obtainDropShadowRenderereZhPAX0(Shape shape, long j, LayoutDirection layoutDirection, Density density, Shadow shadow) {
        DropShadowRenderer dropShadowRenderer;
        synchronized (this) {
            ShadowKey shadowKeyObtainShadowKey = obtainShadowKey();
            shadowKeyObtainShadowKey.setShape(shape);
            shadowKeyObtainShadowKey.m1437setSizeuvyYCjk(j);
            shadowKeyObtainShadowKey.setLayoutDirection(layoutDirection);
            shadowKeyObtainShadowKey.setDensity(density.getDensity());
            shadowKeyObtainShadowKey.setShadow(shadow.copyWithoutOffset$ui_graphics());
            dropShadowRenderer = (DropShadowRenderer) obtainDropShadowCache().MediaBrowserCompatMediaItem(shadowKeyObtainShadowKey);
            if (dropShadowRenderer == null) {
                DropShadowRenderer dropShadowRenderer2 = new DropShadowRenderer(shadow, shape.mo24createOutlinePq9zytI(j, layoutDirection, density));
                obtainDropShadowCache().write(ShadowKey.m1433copyeZhPAX0$default(shadowKeyObtainShadowKey, null, 0L, null, 0.0f, null, 31, null), dropShadowRenderer2);
                dropShadowRenderer = dropShadowRenderer2;
            }
        }
        return dropShadowRenderer;
    }

    @Override // androidx.compose.ui.graphics.shadow.InnerShadowRendererProvider
    /* JADX INFO: renamed from: obtainInnerShadowRenderer-eZhPAX0, reason: not valid java name */
    public InnerShadowRenderer mo1432obtainInnerShadowRenderereZhPAX0(Shape shape, long j, LayoutDirection layoutDirection, Density density, Shadow shadow) {
        InnerShadowRenderer innerShadowRenderer;
        synchronized (this) {
            ShadowKey shadowKeyObtainShadowKey = obtainShadowKey();
            shadowKeyObtainShadowKey.setShape(shape);
            shadowKeyObtainShadowKey.m1437setSizeuvyYCjk(j);
            shadowKeyObtainShadowKey.setLayoutDirection(layoutDirection);
            shadowKeyObtainShadowKey.setDensity(density.getDensity());
            shadowKeyObtainShadowKey.setShadow(shadow);
            innerShadowRenderer = (InnerShadowRenderer) obtainInnerShadowCache().MediaBrowserCompatMediaItem(shadowKeyObtainShadowKey);
            if (innerShadowRenderer == null) {
                InnerShadowRenderer innerShadowRenderer2 = new InnerShadowRenderer(shadow, shape.mo24createOutlinePq9zytI(j, layoutDirection, density));
                obtainInnerShadowCache().write(ShadowKey.m1433copyeZhPAX0$default(shadowKeyObtainShadowKey, null, 0L, null, 0.0f, null, 31, null), innerShadowRenderer2);
                innerShadowRenderer = innerShadowRenderer2;
            }
        }
        return innerShadowRenderer;
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowContext
    public DropShadowPainter createDropShadowPainter(Shape shape, Shadow shadow) {
        return new DropShadowPainter(shape, shadow, this);
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowContext
    public InnerShadowPainter createInnerShadowPainter(Shape shape, Shadow shadow) {
        return new InnerShadowPainter(shape, shadow, this);
    }

    private final onRemeasuredozmzZPI obtainDropShadowCache() {
        onRemeasuredozmzZPI onremeasuredozmzzpi = this.dropShadowCache;
        if (onremeasuredozmzzpi != null) {
            return onremeasuredozmzzpi;
        }
        onRemeasuredozmzZPI onremeasuredozmzzpi2 = new onRemeasuredozmzZPI();
        this.dropShadowCache = onremeasuredozmzzpi2;
        return onremeasuredozmzzpi2;
    }

    private final onRemeasuredozmzZPI obtainInnerShadowCache() {
        onRemeasuredozmzZPI onremeasuredozmzzpi = this.innerShadowCache;
        if (onremeasuredozmzzpi != null) {
            return onremeasuredozmzzpi;
        }
        onRemeasuredozmzZPI onremeasuredozmzzpi2 = new onRemeasuredozmzZPI();
        this.innerShadowCache = onremeasuredozmzzpi2;
        return onremeasuredozmzzpi2;
    }

    private final ShadowKey obtainShadowKey() {
        ShadowKey shadowKey = this.shadowKey;
        if (shadowKey != null) {
            return shadowKey;
        }
        ShadowKey shadowKey2 = new ShadowKey(null, 0L, null, 0.0f, null, 31, null);
        this.shadowKey = shadowKey2;
        return shadowKey2;
    }
}
