package com.sentiance.sdk.logging.ondemand;

import android.content.Context;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;
import java.util.Objects;
import o.runlambda0;
import o.setPushUniqueId;
import o.stringAndKey;

/* JADX INFO: loaded from: classes5.dex */
@runlambda0
@DontObfuscate
class OnDemandLogRetrievalDebug {
    private static OnDemandLogRetrievalDebug sInstance;
    private final Context mContext;

    public static OnDemandLogRetrievalDebug getInstance(Context context) {
        OnDemandLogRetrievalDebug onDemandLogRetrievalDebug;
        synchronized (OnDemandLogRetrievalDebug.class) {
            if (sInstance == null) {
                sInstance = new OnDemandLogRetrievalDebug(context);
            }
            onDemandLogRetrievalDebug = sInstance;
        }
        return onDemandLogRetrievalDebug;
    }

    public void fulfillPendingOnDemandLogRetrievalRequests(Runnable runnable) {
        stringAndKey stringandkey = (stringAndKey) setPushUniqueId.read(stringAndKey.class);
        Objects.requireNonNull(runnable);
        stringandkey.write(new d0$$ExternalSyntheticLambda0(7, runnable));
    }

    private OnDemandLogRetrievalDebug(Context context) {
        this.mContext = context;
    }
}
