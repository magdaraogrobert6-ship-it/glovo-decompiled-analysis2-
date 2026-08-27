package kotlin.jvm.internal;

import bo.app.af$$ExternalSyntheticOutline0;
import java.io.Serializable;
import o.displayInAppMessagelambda1;
import o.displayInAppMessagelambda10;
import o.getCieXyz;
import o.pauseWebviewIfNecessarylambda1;
import o.r8lambdauprfjTiZ1Df0OcO00NrhbN7_a0;
import o.r8lambdayayv2YkI5Itr3KGAQ7gqfarKs;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public class AdaptedFunctionReference implements r8lambdauprfjTiZ1Df0OcO00NrhbN7_a0, Serializable {
    private final int IconCompatParcelizer;
    private final String MediaMetadataCompat;
    public final Object MediaSessionCompatQueueItem;
    private final int RemoteActionCompatParcelizer;
    private final Class read;
    private final String serializer;
    private final boolean write;

    @Override // o.r8lambdauprfjTiZ1Df0OcO00NrhbN7_a0
    public int getArity() {
        return this.RemoteActionCompatParcelizer;
    }

    public String toString() {
        displayInAppMessagelambda1.IconCompatParcelizer.getClass();
        return displayInAppMessagelambda10.serializer(this);
    }

    public AdaptedFunctionReference(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.MediaSessionCompatQueueItem = obj;
        this.read = cls;
        this.serializer = str;
        this.MediaMetadataCompat = str2;
        this.write = false;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdaptedFunctionReference)) {
            return false;
        }
        AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
        if (this.write == adaptedFunctionReference.write && this.RemoteActionCompatParcelizer == adaptedFunctionReference.RemoteActionCompatParcelizer && this.IconCompatParcelizer == adaptedFunctionReference.IconCompatParcelizer) {
            Object[] objArr = {this.MediaSessionCompatQueueItem, adaptedFunctionReference.MediaSessionCompatQueueItem};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.read, adaptedFunctionReference.read};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() && this.serializer.equals(adaptedFunctionReference.serializer) && this.MediaMetadataCompat.equals(adaptedFunctionReference.MediaMetadataCompat)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.MediaSessionCompatQueueItem;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Class cls = this.read;
        return ((((af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(((iHashCode * 31) + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.serializer), 31, this.MediaMetadataCompat) + (this.write ? 1231 : 1237)) * 31) + this.RemoteActionCompatParcelizer) * 31) + this.IconCompatParcelizer;
    }

    public pauseWebviewIfNecessarylambda1 getOwner() {
        Class cls = this.read;
        if (cls == null) {
            return null;
        }
        if (!this.write) {
            return displayInAppMessagelambda1.serializer(cls);
        }
        displayInAppMessagelambda1.IconCompatParcelizer.getClass();
        return new r8lambdayayv2YkI5Itr3KGAQ7gqfarKs(cls);
    }

    public AdaptedFunctionReference(Class cls, String str, String str2) {
        this(2, 4, cls, CallableReference.MediaSessionCompatQueueItem, str, str2);
    }
}
