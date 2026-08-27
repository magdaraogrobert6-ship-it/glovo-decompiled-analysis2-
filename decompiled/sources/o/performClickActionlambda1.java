package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class performClickActionlambda1 extends onCloseActionlambda1 {
    public final boolean serializer;

    public performClickActionlambda1(String str, performClickActionlambda2 performclickactionlambda2) {
        super(str, performclickactionlambda2, 1);
        this.serializer = true;
    }

    @Override // o.onCloseActionlambda1
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // o.onCloseActionlambda1, o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean write() {
        return this.serializer;
    }

    @Override // o.onCloseActionlambda1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof performClickActionlambda1) {
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) obj;
            if (this.ParcelableVolumeInfo.equals(r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer())) {
                performClickActionlambda1 performclickactionlambda1 = (performClickActionlambda1) obj;
                if (performclickactionlambda1.serializer && Arrays.equals((r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[]) this.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper(), (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[]) performclickactionlambda1.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper())) {
                    int iIconCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer();
                    int i = this.MediaDescriptionCompat;
                    if (i == iIconCompatParcelizer) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{RemoteActionCompatParcelizer(i2).serializer(), r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(i2).serializer()}, getCieXyz.write())).booleanValue()) {
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{RemoteActionCompatParcelizer(i2).RemoteActionCompatParcelizer(), r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(i2).RemoteActionCompatParcelizer()}, getCieXyz.write())).booleanValue()) {
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
