package io.sentry.okhttp;

import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSessionCompatQueueItem extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ getIntentArrayWithConfiguredBackStacklambda1 RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MediaSessionCompatQueueItem(getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1, int i) {
        super(1);
        this.serializer = i;
        this.RemoteActionCompatParcelizer = getintentarraywithconfiguredbackstacklambda1;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            getintentarraywithconfiguredbackstacklambda1.read(Long.valueOf(((Number) obj).longValue()), "http.response_content_length");
            return createfromparcel;
        }
        getintentarraywithconfiguredbackstacklambda1.read(Long.valueOf(((Number) obj).longValue()), "http.request_content_length");
        return createfromparcel;
    }
}
