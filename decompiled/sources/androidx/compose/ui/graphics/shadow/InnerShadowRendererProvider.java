package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes4.dex */
public interface InnerShadowRendererProvider {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final InnerShadowRendererProvider Default = new InnerShadowRendererProvider() { // from class: androidx.compose.ui.graphics.shadow.InnerShadowRendererProvider$Companion$Default$1
            @Override // androidx.compose.ui.graphics.shadow.InnerShadowRendererProvider
            /* JADX INFO: renamed from: obtainInnerShadowRenderer-eZhPAX0 */
            public final InnerShadowRenderer mo1432obtainInnerShadowRenderereZhPAX0(Shape shape, long j, LayoutDirection layoutDirection, Density density, Shadow shadow) {
                return new InnerShadowRenderer(shadow, shape.mo24createOutlinePq9zytI(j, layoutDirection, density));
            }
        };

        private Companion() {
        }

        public final InnerShadowRendererProvider getDefault() {
            return Default;
        }
    }

    /* JADX INFO: renamed from: obtainInnerShadowRenderer-eZhPAX0 */
    InnerShadowRenderer mo1432obtainInnerShadowRenderereZhPAX0(Shape shape, long j, LayoutDirection layoutDirection, Density density, Shadow shadow);
}
