package o;

import bo.app.n$$ExternalSyntheticLambda3;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class LayerSnapshotV28GraphicsLayerPicture {
    public final SessionDao_Impl$$ExternalSyntheticLambda1 IconCompatParcelizer;
    public final SurfaceUtils RemoteActionCompatParcelizer;
    public final n$$ExternalSyntheticLambda3 write;

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final SurfaceUtils read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer() {
        return this.IconCompatParcelizer;
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        return this.IconCompatParcelizer.hashCode() + ((this.write.hashCode() + (iHashCode * 31)) * 31);
    }

    public LayerSnapshotV28GraphicsLayerPicture(SurfaceUtils surfaceUtils, n$$ExternalSyntheticLambda3 n__externalsyntheticlambda3, SessionDao_Impl$$ExternalSyntheticLambda1 sessionDao_Impl$$ExternalSyntheticLambda1) {
        this.RemoteActionCompatParcelizer = surfaceUtils;
        this.write = n__externalsyntheticlambda3;
        this.IconCompatParcelizer = sessionDao_Impl$$ExternalSyntheticLambda1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayerSnapshotV28GraphicsLayerPicture) {
            LayerSnapshotV28GraphicsLayerPicture layerSnapshotV28GraphicsLayerPicture = (LayerSnapshotV28GraphicsLayerPicture) obj;
            return this.RemoteActionCompatParcelizer.equals(layerSnapshotV28GraphicsLayerPicture.RemoteActionCompatParcelizer) && this.write == layerSnapshotV28GraphicsLayerPicture.write && this.IconCompatParcelizer == layerSnapshotV28GraphicsLayerPicture.IconCompatParcelizer;
        }
        return false;
    }

    public final String toString() {
        return "UserRegistrationData(userInfo=" + this.RemoteActionCompatParcelizer + ", onSuccess=" + this.write + ", onError=" + this.IconCompatParcelizer + ')';
    }
}
