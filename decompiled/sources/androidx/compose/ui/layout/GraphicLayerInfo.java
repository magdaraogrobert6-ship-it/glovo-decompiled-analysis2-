package androidx.compose.ui.layout;

/* JADX INFO: loaded from: classes.dex */
public interface GraphicLayerInfo {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static long getOwnerViewId(GraphicLayerInfo graphicLayerInfo) {
            return GraphicLayerInfo.super.getOwnerViewId();
        }
    }

    long getLayerId();

    default long getOwnerViewId() {
        return 0L;
    }
}
