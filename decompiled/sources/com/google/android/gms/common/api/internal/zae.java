package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.cardview.widget.CardView$1;
import bo.app.d$$ExternalSyntheticOutline0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zau;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Map;
import o.accessgetNumPadDotcp;
import o.accessgetScp;

/* JADX INFO: loaded from: classes4.dex */
public final class zae extends zai {
    public final accessgetNumPadDotcp write;

    @Override // com.google.android.gms.common.api.internal.zai
    public final void RemoteActionCompatParcelizer(Status status) {
        try {
            this.write.RemoteActionCompatParcelizer(status);
        } catch (IllegalStateException e) {
            SentryLogcatAdapter.write("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void RemoteActionCompatParcelizer(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.write.RemoteActionCompatParcelizer(new Status(10, d$$ExternalSyntheticOutline0.m(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage), null, null));
        } catch (IllegalStateException e) {
            SentryLogcatAdapter.write("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void serializer(zabk zabkVar) throws DeadObjectException {
        try {
            accessgetNumPadDotcp accessgetnumpaddotcp = this.write;
            accessgetScp accessgetscp = zabkVar.RemoteActionCompatParcelizer;
            accessgetnumpaddotcp.getClass();
            try {
                accessgetnumpaddotcp.RemoteActionCompatParcelizer(accessgetscp);
            } catch (DeadObjectException e) {
                accessgetnumpaddotcp.RemoteActionCompatParcelizer(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e2) {
                accessgetnumpaddotcp.RemoteActionCompatParcelizer(new Status(8, e2.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e3) {
            RemoteActionCompatParcelizer(e3);
        }
    }

    public zae(int i, accessgetNumPadDotcp accessgetnumpaddotcp) {
        super(i);
        this.write = accessgetnumpaddotcp;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void serializer(CardView$1 cardView$1, boolean z) {
        Map map = (Map) cardView$1.RemoteActionCompatParcelizer;
        accessgetNumPadDotcp accessgetnumpaddotcp = this.write;
        map.put(accessgetnumpaddotcp, Boolean.valueOf(z));
        accessgetnumpaddotcp.write(new zau(cardView$1, accessgetnumpaddotcp));
    }
}
