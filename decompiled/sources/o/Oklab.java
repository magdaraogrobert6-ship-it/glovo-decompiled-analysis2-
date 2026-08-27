package o;

/* JADX INFO: loaded from: classes.dex */
public final class Oklab implements Cloneable {
    public withTransform IconCompatParcelizer;

    public final int hashCode() {
        return RemoteActionCompatParcelizer();
    }

    public final int RemoteActionCompatParcelizer() {
        withTransform withtransform = this.IconCompatParcelizer;
        if (withtransform != null) {
            return withtransform.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Oklab) && serializer(obj);
    }

    public final boolean serializer(Object obj) {
        if (obj instanceof Oklab) {
            return Fill.IconCompatParcelizer(this.IconCompatParcelizer, ((Oklab) obj).IconCompatParcelizer);
        }
        return false;
    }

    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final Oklab clone() {
        try {
            return (Oklab) super.clone();
        } catch (CloneNotSupportedException e) {
            DrawableTransformation.read((Throwable) e);
            return null;
        }
    }
}
