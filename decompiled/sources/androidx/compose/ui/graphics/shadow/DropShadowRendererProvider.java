package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes4.dex */
public interface DropShadowRendererProvider {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final DropShadowRendererProvider Default = new DropShadowRendererProvider() { // from class: androidx.compose.ui.graphics.shadow.DropShadowRendererProvider$Companion$Default$1
            @Override // androidx.compose.ui.graphics.shadow.DropShadowRendererProvider
            /* JADX INFO: renamed from: obtainDropShadowRenderer-eZhPAX0 */
            public final DropShadowRenderer mo1431obtainDropShadowRenderereZhPAX0(Shape shape, long j, LayoutDirection layoutDirection, Density density, Shadow shadow) {
                return new DropShadowRenderer(shadow, shape.mo24createOutlinePq9zytI(j, layoutDirection, density));
            }
        };

        private Companion() {
        }

        public final DropShadowRendererProvider getDefault() {
            return Default;
        }
    }

    /* JADX INFO: renamed from: obtainDropShadowRenderer-eZhPAX0 */
    DropShadowRenderer mo1431obtainDropShadowRenderereZhPAX0(Shape shape, long j, LayoutDirection layoutDirection, Density density, Shadow shadow);
}
