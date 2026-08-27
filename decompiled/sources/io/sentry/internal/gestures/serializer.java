package io.sentry.internal.gestures;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class serializer {
    public final WeakReference IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.IconCompatParcelizer, this.write, this.RemoteActionCompatParcelizer});
    }

    public serializer(View view, String str, String str2, String str3, String str4) {
        this.IconCompatParcelizer = new WeakReference(view);
        this.serializer = str;
        this.write = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.read = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || serializer.class != obj.getClass()) {
            return false;
        }
        serializer serializerVar = (serializer) obj;
        return setNativeShader.write(this.serializer, serializerVar.serializer) && setNativeShader.write(this.write, serializerVar.write) && setNativeShader.write(this.RemoteActionCompatParcelizer, serializerVar.RemoteActionCompatParcelizer);
    }
}
