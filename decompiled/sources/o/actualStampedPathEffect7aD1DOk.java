package o;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class actualStampedPathEffect7aD1DOk extends asAndroidPathEffect {
    public final Class IconCompatParcelizer;

    @Override // o.asAndroidPathEffect
    public final boolean IconCompatParcelizer(Object obj, Object obj2) {
        return onContentCardClicked.RemoteActionCompatParcelizer((Serializable[]) obj, (Serializable[]) obj2);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // o.asAndroidPathEffect
    public final void read(String str, Bundle bundle, Object obj) {
        ?? r4 = (Serializable[]) obj;
        str.getClass();
        this.IconCompatParcelizer.cast(r4);
        bundle.putSerializable(str, r4);
    }

    @Override // o.asAndroidPathEffect
    public final String serializer() {
        return this.IconCompatParcelizer.getName();
    }

    public actualStampedPathEffect7aD1DOk(Class cls) {
        super(true);
        if (Serializable.class.isAssignableFrom(cls)) {
            try {
                this.IconCompatParcelizer = Class.forName("[L" + cls.getName() + ';');
                return;
            } catch (ClassNotFoundException e) {
                DrawableTransformation.read((Throwable) e);
                throw null;
            }
        }
        getTrackDrawable.IconCompatParcelizer(cls, " does not implement Serializable.");
        throw null;
    }

    @Override // o.asAndroidPathEffect
    public final Object serializer(Bundle bundle, String str) {
        bundle.getClass();
        return (Serializable[]) bundle.get(str);
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
        if (obj == null || !actualStampedPathEffect7aD1DOk.class.equals(obj.getClass())) {
            return false;
        }
        Object[] objArr = {this.IconCompatParcelizer, ((actualStampedPathEffect7aD1DOk) obj).IconCompatParcelizer};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }
}
