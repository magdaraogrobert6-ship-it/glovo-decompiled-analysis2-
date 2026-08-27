package o;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class actualCornerPathEffect extends asAndroidPathEffect {
    public final Class IconCompatParcelizer;

    public actualCornerPathEffect(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.IconCompatParcelizer = cls;
        } else {
            getTrackDrawable.IconCompatParcelizer(cls, " does not implement Parcelable or Serializable.");
            throw null;
        }
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    @Override // o.asAndroidPathEffect
    public final String serializer() {
        return this.IconCompatParcelizer.getName();
    }

    @Override // o.asAndroidPathEffect
    public final void read(String str, Bundle bundle, Object obj) {
        str.getClass();
        this.IconCompatParcelizer.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    @Override // o.asAndroidPathEffect
    public final Object serializer(Bundle bundle, String str) {
        bundle.getClass();
        return bundle.get(str);
    }

    @Override // o.asAndroidPathEffect
    public final Object IconCompatParcelizer(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !actualCornerPathEffect.class.equals(obj.getClass())) {
            return false;
        }
        Object[] objArr = {this.IconCompatParcelizer, ((actualCornerPathEffect) obj).IconCompatParcelizer};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }
}
