package o;

import androidx.window.extensions.WindowExtensionsProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class GraphicsContextshadowContext1 {
    static {
        displayInAppMessagelambda1.serializer(GraphicsContextshadowContext1.class).IconCompatParcelizer();
    }

    public static int IconCompatParcelizer() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            int i = minAoSsdG0.read;
            getGraphicsLayer getgraphicslayer = getGraphicsLayer.STRICT;
            return 0;
        } catch (NullPointerException unused2) {
            int i2 = minAoSsdG0.read;
            getGraphicsLayer getgraphicslayer2 = getGraphicsLayer.STRICT;
            return 0;
        } catch (UnsupportedOperationException unused3) {
            int i3 = minAoSsdG0.read;
            getGraphicsLayer getgraphicslayer3 = getGraphicsLayer.STRICT;
            return 0;
        }
    }
}
