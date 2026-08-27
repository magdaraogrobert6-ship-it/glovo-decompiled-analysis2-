package o;

import bo.app.d$$ExternalSyntheticOutline0;
import io.sentry.util.UrlUtils;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldLayout {
    public float serializer = 0.0f;
    public boolean write = true;
    public UrlUtils RemoteActionCompatParcelizer = null;

    public final int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(Float.hashCode(this.serializer) * 31, 31, this.write);
        UrlUtils urlUtils = this.RemoteActionCompatParcelizer;
        return (iM + (urlUtils == null ? 0 : urlUtils.hashCode())) * 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldLayout)) {
            return false;
        }
        TextFieldLayout textFieldLayout = (TextFieldLayout) obj;
        if (Float.compare(this.serializer, textFieldLayout.serializer) != 0 || this.write != textFieldLayout.write) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, textFieldLayout.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.serializer + ", fill=" + this.write + ", crossAxisAlignment=" + this.RemoteActionCompatParcelizer + ", flowLayoutData=null)";
    }
}
