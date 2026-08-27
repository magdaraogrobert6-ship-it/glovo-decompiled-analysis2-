package o;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.cardview.widget.CardView$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.internal.gtm.zzbv;
import java.util.Map;
import okhttp3.internal.platform.AndroidPlatform$Companion;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetPrintScreencp extends accessgetPairingcp {
    public final accessgetNumPadPageUpcp RemoteActionCompatParcelizer;
    public final ParentDataModifierDefaultImpls read;
    public final FlingCancellationException serializer;

    @Override // com.google.android.gms.common.api.internal.zai
    public final void RemoteActionCompatParcelizer(Status status) {
        this.serializer.getClass();
        this.read.IconCompatParcelizer((Exception) AndroidPlatform$Companion.read(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void RemoteActionCompatParcelizer(Exception exc) {
        this.read.IconCompatParcelizer(exc);
    }

    @Override // o.accessgetPairingcp
    public final boolean RemoteActionCompatParcelizer(zabk zabkVar) {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer;
    }

    @Override // o.accessgetPairingcp
    public final Feature[] read(zabk zabkVar) {
        return this.RemoteActionCompatParcelizer.write;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void serializer(zabk zabkVar) throws DeadObjectException {
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = this.read;
        try {
            this.RemoteActionCompatParcelizer.serializer(zabkVar.RemoteActionCompatParcelizer, parentDataModifierDefaultImpls);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            RemoteActionCompatParcelizer(zai.serializer(e2));
        } catch (RuntimeException e3) {
            parentDataModifierDefaultImpls.IconCompatParcelizer((Exception) e3);
        }
    }

    @Override // o.accessgetPairingcp
    public final int write(zabk zabkVar) {
        return this.RemoteActionCompatParcelizer.serializer;
    }

    public accessgetPrintScreencp(int i, accessgetNumPadPageUpcp accessgetnumpadpageupcp, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls, FlingCancellationException flingCancellationException) {
        super(i);
        this.read = parentDataModifierDefaultImpls;
        this.RemoteActionCompatParcelizer = accessgetnumpadpageupcp;
        this.serializer = flingCancellationException;
        if (i == 2 && accessgetnumpadpageupcp.IconCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void serializer(CardView$1 cardView$1, boolean z) {
        Map map = (Map) cardView$1.IconCompatParcelizer;
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = this.read;
        map.put(parentDataModifierDefaultImpls, Boolean.valueOf(z));
        parentDataModifierDefaultImpls.RemoteActionCompatParcelizer.addOnCompleteListener(new zzbv(cardView$1, parentDataModifierDefaultImpls));
    }
}
