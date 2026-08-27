package o;

import com.google.android.gms.location.DeviceOrientationRequest;
import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes4.dex */
final class r8lambda9TZpBImTEtk0HAjJ1Vr5tuCi60U implements Runnable {
    final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ r8lambda9TZpBImTEtk0HAjJ1Vr5tuCi60U(int i, Object obj) {
        this.serializer = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        if (i == 0) {
            handleAdmRegistrationIntent handleadmregistrationintent = (handleAdmRegistrationIntent) this.IconCompatParcelizer;
            r8lambdaBLZuMVNHewIviUzmwoKsD5M9mc r8lambdablzumvnhewiviuzmwoksd5m9mc = handleadmregistrationintent.IconCompatParcelizer;
            BrazePushReceiverCompanion brazePushReceiverCompanion = new BrazePushReceiverCompanion(this);
            r8lambdablzumvnhewiviuzmwoksd5m9mc.getClass();
            handleadmregistrationintent.write = new handleReceivedIntent(brazePushReceiverCompanion);
            return;
        }
        if (i == 1) {
            synchronized (this) {
                if (((handleAdmRegistrationEventIfEnabled) this.IconCompatParcelizer).serializer) {
                    ((handleAdmRegistrationEventIfEnabled) this.IconCompatParcelizer).write.write.IconCompatParcelizer(ControlMessage.CALL_ACTIVE, Byte.valueOf(((handleAdmRegistrationEventIfEnabled) this.IconCompatParcelizer).IconCompatParcelizer));
                    ((handleAdmRegistrationEventIfEnabled) this.IconCompatParcelizer).write.RemoteActionCompatParcelizer.serializer(((handleAdmRegistrationEventIfEnabled) this.IconCompatParcelizer).read, DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
                }
            }
            return;
        }
        r8lambdaExYIBV8U5_52rTIO9kgIdkXJYYY r8lambdaexyibv8u5_52rtio9kgidkxjyyy = (r8lambdaExYIBV8U5_52rTIO9kgIdkXJYYY) this.IconCompatParcelizer;
        r8lambdaexyibv8u5_52rtio9kgidkxjyyy.RemoteActionCompatParcelizer(r8lambdaexyibv8u5_52rtio9kgidkxjyyy.write.getMode());
        if (r8lambdaexyibv8u5_52rtio9kgidkxjyyy.read) {
            r8lambdaexyibv8u5_52rtio9kgidkxjyyy.IconCompatParcelizer.IconCompatParcelizer(r8lambdaexyibv8u5_52rtio9kgidkxjyyy.MediaSessionCompatQueueItem(), DeviceOrientationRequest.OUTPUT_PERIOD_FAST, r8lambdaexyibv8u5_52rtio9kgidkxjyyy.MediaSessionCompatQueueItem);
        }
    }
}
