package o;

import android.os.Handler;
import android.os.Looper;
import com.huawei.location.sdm.Sdm;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewCompatShimsApi29Impl extends Handler {
    public static final /* synthetic */ int IconCompatParcelizer = 0;
    public final /* synthetic */ Sdm RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompatShimsApi29Impl(Sdm sdm, Looper looper) {
        super(looper);
        this.RemoteActionCompatParcelizer = sdm;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 23631. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r43) {
        /*
            Method dump skipped, instruction units count: 2363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ViewCompatShimsApi29Impl.handleMessage(android.os.Message):void");
    }
}
