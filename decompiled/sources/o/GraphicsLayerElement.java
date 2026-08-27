package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class GraphicsLayerElement {
    public final component11SzJe1aQ IconCompatParcelizer;
    public final toCompareValue RemoteActionCompatParcelizer;
    public final component11SzJe1aQ serializer;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        return this.IconCompatParcelizer.hashCode() + ((this.serializer.hashCode() + (iHashCode * 31)) * 31);
    }

    public GraphicsLayerElement(toCompareValue tocomparevalue, component11SzJe1aQ component11szje1aq, component11SzJe1aQ component11szje1aq2) {
        this.RemoteActionCompatParcelizer = tocomparevalue;
        this.serializer = component11szje1aq;
        this.IconCompatParcelizer = component11szje1aq2;
        if (tocomparevalue.serializer() == 0 && tocomparevalue.read() == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Bounds must be non zero");
            throw null;
        }
        if (tocomparevalue.write == 0 || tocomparevalue.RemoteActionCompatParcelizer == 0) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Bounding rectangle must start at the top or left window edge for folding features");
        throw null;
    }

    public final String toString() {
        return "HardwareFoldingFeature { " + this.RemoteActionCompatParcelizer + ", type=" + this.serializer + ", state=" + this.IconCompatParcelizer + " }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (GraphicsLayerElement.class.equals(obj != null ? obj.getClass() : null)) {
            obj.getClass();
            GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
            return this.RemoteActionCompatParcelizer.equals(graphicsLayerElement.RemoteActionCompatParcelizer) && this.serializer == graphicsLayerElement.serializer && this.IconCompatParcelizer == graphicsLayerElement.IconCompatParcelizer;
        }
        return false;
    }
}
