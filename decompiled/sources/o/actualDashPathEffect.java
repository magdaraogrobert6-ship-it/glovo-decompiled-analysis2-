package o;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class actualDashPathEffect extends asAndroidPathEffect {
    public final Class IconCompatParcelizer;

    @Override // o.asAndroidPathEffect
    public final boolean IconCompatParcelizer(Object obj, Object obj2) {
        return onContentCardClicked.RemoteActionCompatParcelizer((Parcelable[]) obj, (Parcelable[]) obj2);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    @Override // o.asAndroidPathEffect
    public final void read(String str, Bundle bundle, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        str.getClass();
        this.IconCompatParcelizer.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    @Override // o.asAndroidPathEffect
    public final String serializer() {
        return this.IconCompatParcelizer.getName();
    }

    public actualDashPathEffect(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls)) {
            try {
                this.IconCompatParcelizer = Class.forName("[L" + cls.getName() + ';');
                return;
            } catch (ClassNotFoundException e) {
                DrawableTransformation.read((Throwable) e);
                throw null;
            }
        }
        getTrackDrawable.IconCompatParcelizer(cls, " does not implement Parcelable.");
        throw null;
    }

    @Override // o.asAndroidPathEffect
    public final Object serializer(Bundle bundle, String str) {
        bundle.getClass();
        return (Parcelable[]) bundle.get(str);
    }

    @Override // o.asAndroidPathEffect
    public final Object IconCompatParcelizer(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !actualDashPathEffect.class.equals(obj.getClass())) {
            return false;
        }
        Object[] objArr = {this.IconCompatParcelizer, ((actualDashPathEffect) obj).IconCompatParcelizer};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }
}
