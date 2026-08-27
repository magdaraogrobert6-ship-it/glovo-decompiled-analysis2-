package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class getContentPaddingLeft {
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String serializer;
    public final String write;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.serializer.hashCode();
        return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ this.write.hashCode()) * 1000003) ^ this.IconCompatParcelizer.hashCode();
    }

    public getContentPaddingLeft(String str, String str2, String str3, String str4) {
        this.RemoteActionCompatParcelizer = str;
        this.serializer = str2;
        this.write = str3;
        this.IconCompatParcelizer = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getContentPaddingLeft)) {
            return false;
        }
        getContentPaddingLeft getcontentpaddingleft = (getContentPaddingLeft) obj;
        return this.RemoteActionCompatParcelizer.equals(getcontentpaddingleft.RemoteActionCompatParcelizer) && this.serializer.equals(getcontentpaddingleft.serializer) && this.write.equals(getcontentpaddingleft.write) && this.IconCompatParcelizer.equals(getcontentpaddingleft.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", eglVersion=");
        sb.append(this.serializer);
        sb.append(", glExtensions=");
        sb.append(this.write);
        sb.append(", eglExtensions=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, "}");
    }
}
