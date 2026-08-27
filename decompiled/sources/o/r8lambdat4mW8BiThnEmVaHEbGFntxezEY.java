package o;

import com.sentiance.sdk.SubmitDetectionsCallback;
import com.sentiance.sdk.events.ControlMessage;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdat4mW8BiThnEmVaHEbGFntxezEY extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ String IconCompatParcelizer;
    final /* synthetic */ AtomicInteger RemoteActionCompatParcelizer;
    final /* synthetic */ handleAdmRegistrationIntentlambda1 read;
    final /* synthetic */ BannerPendingDismissal[] serializer;
    final /* synthetic */ r8lambdaylNQm0hc21VPSChRAMa37hJE9XM write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdat4mW8BiThnEmVaHEbGFntxezEY(r8lambdaylNQm0hc21VPSChRAMa37hJE9XM r8lambdaylnqm0hc21vpschrama37hje9xm, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar, String str, BannerPendingDismissal[] bannerPendingDismissalArr, AtomicInteger atomicInteger, handleAdmRegistrationIntentlambda1 handleadmregistrationintentlambda1) {
        super(clearandroid_sdk_base_releaseVar, "SubmitDetectionsHelper");
        this.write = r8lambdaylnqm0hc21vpschrama37hje9xm;
        this.IconCompatParcelizer = str;
        this.serializer = bannerPendingDismissalArr;
        this.RemoteActionCompatParcelizer = atomicInteger;
        this.read = handleadmregistrationintentlambda1;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        if (obj instanceof BannerPendingDismissal) {
            BannerPendingDismissal bannerPendingDismissal = (BannerPendingDismissal) obj;
            if (bannerPendingDismissal.write() && this.IconCompatParcelizer.equals(bannerPendingDismissal.RemoteActionCompatParcelizer())) {
                BannerPendingDismissal[] bannerPendingDismissalArr = this.serializer;
                final int i = 0;
                bannerPendingDismissalArr[0] = bannerPendingDismissal;
                boolean z = bannerPendingDismissal.read();
                AtomicInteger atomicInteger = this.RemoteActionCompatParcelizer;
                if (z) {
                    atomicInteger.decrementAndGet();
                } else {
                    atomicInteger.set(0);
                }
                if (atomicInteger.get() == 0) {
                    this.write.IconCompatParcelizer.read(this);
                    boolean z2 = bannerPendingDismissalArr[0].read();
                    handleAdmRegistrationIntentlambda1 handleadmregistrationintentlambda1 = this.read;
                    if (!z2) {
                        final r8lambdaz9EGbeSzC7s1wOa1PXdUjIuP7p8 r8lambdaz9egbeszc7s1woa1pxdujiup7p8 = (r8lambdaz9EGbeSzC7s1wOa1PXdUjIuP7p8) handleadmregistrationintentlambda1;
                        final SubmitDetectionsCallback submitDetectionsCallback = r8lambdaz9egbeszc7s1woa1pxdujiup7p8.write;
                        readBoolean.serializer(new Runnable() { // from class: o.performWorklambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2 = i;
                                SubmitDetectionsCallback submitDetectionsCallback2 = submitDetectionsCallback;
                                r8lambdaz9EGbeSzC7s1wOa1PXdUjIuP7p8 r8lambdaz9egbeszc7s1woa1pxdujiup7p9 = r8lambdaz9egbeszc7s1woa1pxdujiup7p8;
                                if (i2 != 0) {
                                    r8lambdaz9egbeszc7s1woa1pxdujiup7p9.read.log("Submission succeeded", new Object[0]);
                                    submitDetectionsCallback2.onSuccess();
                                } else {
                                    r8lambdaz9egbeszc7s1woa1pxdujiup7p9.read.log("Submission failed", new Object[0]);
                                    submitDetectionsCallback2.onFailure();
                                }
                            }
                        });
                    } else {
                        final r8lambdaz9EGbeSzC7s1wOa1PXdUjIuP7p8 r8lambdaz9egbeszc7s1woa1pxdujiup7p9 = (r8lambdaz9EGbeSzC7s1wOa1PXdUjIuP7p8) handleadmregistrationintentlambda1;
                        final SubmitDetectionsCallback submitDetectionsCallback2 = r8lambdaz9egbeszc7s1woa1pxdujiup7p9.write;
                        final int i2 = 1;
                        readBoolean.serializer(new Runnable() { // from class: o.performWorklambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i3 = i2;
                                SubmitDetectionsCallback submitDetectionsCallback3 = submitDetectionsCallback2;
                                r8lambdaz9EGbeSzC7s1wOa1PXdUjIuP7p8 r8lambdaz9egbeszc7s1woa1pxdujiup7p10 = r8lambdaz9egbeszc7s1woa1pxdujiup7p9;
                                if (i3 != 0) {
                                    r8lambdaz9egbeszc7s1woa1pxdujiup7p10.read.log("Submission succeeded", new Object[0]);
                                    submitDetectionsCallback3.onSuccess();
                                } else {
                                    r8lambdaz9egbeszc7s1woa1pxdujiup7p10.read.log("Submission failed", new Object[0]);
                                    submitDetectionsCallback3.onFailure();
                                }
                            }
                        });
                    }
                }
            }
        }
    }
}
