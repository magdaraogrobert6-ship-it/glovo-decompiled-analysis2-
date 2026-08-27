package o;

import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import bo.app.d$$ExternalSyntheticOutline0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetNumPadDirectionLeftcp extends getBackEK5gGoQ {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                SentryLogcatAdapter.IconCompatParcelizer("BasePendingResult", d$$ExternalSyntheticOutline0.m(i, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i).length() + 34)), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).IconCompatParcelizer(Status.write);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        if (pair.first != null) {
            int iSerializer = isAppSetIdReadingEnabled.serializer();
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
            return;
        }
        try {
            throw null;
        } catch (RuntimeException e) {
            getE gete = BasePendingResult.IconCompatParcelizer;
            throw e;
        }
    }

    public accessgetNumPadDirectionLeftcp(Looper looper, int i) {
        super(looper, i);
    }
}
