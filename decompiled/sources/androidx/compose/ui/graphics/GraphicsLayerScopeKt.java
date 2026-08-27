package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.CompositionLocalsKt;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getNewPassword;
import o.getPostalCode;

/* JADX INFO: loaded from: classes.dex */
public final class GraphicsLayerScopeKt {
    public static final float DefaultCameraDistance = 8.0f;
    private static final long DefaultShadowColor = Color.Companion.m748getBlack0d7_KjU();

    public static final long getDefaultShadowColor() {
        return DefaultShadowColor;
    }

    public static final GraphicsLayerScope GraphicsLayerScope() {
        return new ReusableGraphicsLayerScope();
    }

    public static final GraphicsLayer rememberGraphicsLayer(getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        GraphicsContext graphicsContext = (GraphicsContext) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalGraphicsContext());
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if (objComponentActivity == getCreditCardExpirationMonth.write) {
            objComponentActivity = new GraphicsContextObserver(graphicsContext);
            getpostalcode.write(objComponentActivity);
        }
        return ((GraphicsContextObserver) objComponentActivity).getGraphicsLayer();
    }
}
