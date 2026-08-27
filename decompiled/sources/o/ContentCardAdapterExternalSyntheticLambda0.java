package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentCardAdapterExternalSyntheticLambda0 implements Serializable {
    public final Object IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public final Object serializer;

    public final int hashCode() {
        Object obj = this.serializer;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.RemoteActionCompatParcelizer;
        int iHashCode2 = obj2 == null ? 0 : obj2.hashCode();
        Object obj3 = this.IconCompatParcelizer;
        return (((iHashCode * 31) + iHashCode2) * 31) + (obj3 != null ? obj3.hashCode() : 0);
    }

    public ContentCardAdapterExternalSyntheticLambda0(Object obj, Object obj2, Object obj3) {
        this.serializer = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.IconCompatParcelizer = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentCardAdapterExternalSyntheticLambda0)) {
            return false;
        }
        ContentCardAdapterExternalSyntheticLambda0 contentCardAdapterExternalSyntheticLambda0 = (ContentCardAdapterExternalSyntheticLambda0) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, contentCardAdapterExternalSyntheticLambda0.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, contentCardAdapterExternalSyntheticLambda0.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, contentCardAdapterExternalSyntheticLambda0.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.serializer);
        sb.append(", ");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", ");
        return IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.IconCompatParcelizer, ')');
    }
}
