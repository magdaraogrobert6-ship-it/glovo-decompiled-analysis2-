package o;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class toComposePathEffect extends asAndroidPathEffect {
    public final Class ComponentActivity;

    public toComposePathEffect(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            getTrackDrawable.IconCompatParcelizer(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            getTrackDrawable.IconCompatParcelizer(cls, " is an Enum. You should use EnumType instead.");
            throw null;
        }
        this.ComponentActivity = cls;
    }

    public final int hashCode() {
        return this.ComponentActivity.hashCode();
    }

    @Override // o.asAndroidPathEffect
    public final void read(String str, Bundle bundle, Object obj) {
        Serializable serializable = (Serializable) obj;
        str.getClass();
        serializable.getClass();
        this.ComponentActivity.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    @Override // o.asAndroidPathEffect
    public String serializer() {
        return this.ComponentActivity.getName();
    }

    @Override // o.asAndroidPathEffect
    public final Object serializer(Bundle bundle, String str) {
        bundle.getClass();
        return (Serializable) bundle.get(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toComposePathEffect)) {
            return false;
        }
        Object[] objArr = {this.ComponentActivity, ((toComposePathEffect) obj).ComponentActivity};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    @Override // o.asAndroidPathEffect
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public Serializable IconCompatParcelizer(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public toComposePathEffect(Class cls, int i) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.ComponentActivity = cls;
        } else {
            getTrackDrawable.IconCompatParcelizer(cls, " does not implement Serializable.");
            throw null;
        }
    }
}
