package o;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.common.api.internal.zai;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetPoundcp extends accessgetPairingcp {
    public final ParentDataModifierDefaultImpls serializer;

    public abstract void IconCompatParcelizer(zabk zabkVar);

    @Override // com.google.android.gms.common.api.internal.zai
    public final void RemoteActionCompatParcelizer(Status status) {
        this.serializer.IconCompatParcelizer((Exception) new com.google.android.gms.common.api.ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void RemoteActionCompatParcelizer(Exception exc) {
        this.serializer.IconCompatParcelizer(exc);
    }

    public accessgetPoundcp(int i, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        super(i);
        this.serializer = parentDataModifierDefaultImpls;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void serializer(zabk zabkVar) throws DeadObjectException {
        try {
            IconCompatParcelizer(zabkVar);
        } catch (DeadObjectException e) {
            RemoteActionCompatParcelizer(zai.serializer(e));
            throw e;
        } catch (RemoteException e2) {
            RemoteActionCompatParcelizer(zai.serializer(e2));
        } catch (RuntimeException e3) {
            this.serializer.IconCompatParcelizer((Exception) e3);
        }
    }
}
