package o;

import io.sentry.util.UrlUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class TimerstartCoroutineTimer1 extends startCoroutineTimer {
    public final boolean read;
    public final useEvaluationsCache serializer;

    @Override // o.startCoroutineTimer
    public final Object adapt(writeSelffwf_client_release writeselffwf_client_release, Object[] objArr) {
        syncCustomerProfile synccustomerprofile = (syncCustomerProfile) this.serializer.write(writeselffwf_client_release);
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) objArr[objArr.length - 1];
        try {
            if (!this.read) {
                return UrlUtils.await(synccustomerprofile, shortNewsContentCardView);
            }
            synccustomerprofile.getClass();
            return UrlUtils.awaitNullable(synccustomerprofile, shortNewsContentCardView);
        } catch (LinkageError e) {
            throw e;
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (VirtualMachineError e3) {
            throw e3;
        } catch (Throwable th) {
            return UrlUtils.suspendAndThrow(th, shortNewsContentCardView);
        }
    }

    public TimerstartCoroutineTimer1(accessgetHoldouts accessgetholdouts, getMessageImageView getmessageimageview, FwFClientKt fwFClientKt, useEvaluationsCache useevaluationscache, boolean z) {
        super(accessgetholdouts, getmessageimageview, fwFClientKt);
        this.serializer = useevaluationscache;
        this.read = z;
    }
}
