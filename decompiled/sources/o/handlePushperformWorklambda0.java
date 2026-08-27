package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class handlePushperformWorklambda0 {
    private final wakeScreenIfAppropriatelambda3 IconCompatParcelizer;
    private final setSoundIfPresentAndSupportedlambda1 write;

    public handlePushperformWorklambda0(wakeScreenIfAppropriatelambda3 wakescreenifappropriatelambda3, setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1) {
        this.IconCompatParcelizer = wakescreenifappropriatelambda3;
        this.write = setsoundifpresentandsupportedlambda1;
    }

    public final getCustomLocationProviderNamesandroid_sdk_base_release read() throws IOException {
        int iLongValue = (int) ((Long) this.IconCompatParcelizer.serializer(-1L, new routeUserWithNotificationOpenedIntentandroid_sdk_ui_release(0))).longValue();
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1 = this.write;
        setsoundifpresentandsupportedlambda1.getClass();
        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(7, false);
        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write = Integer.valueOf(iLongValue);
        getCustomLocationProviderNamesandroid_sdk_base_release getcustomlocationprovidernamesandroid_sdk_base_releaseWrite = setsoundifpresentandsupportedlambda1.write(new setCustomUserAttributelambda0(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release), null);
        if (getcustomlocationprovidernamesandroid_sdk_base_releaseWrite != null) {
            return getcustomlocationprovidernamesandroid_sdk_base_releaseWrite;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Failed to create payload");
        return null;
    }
}
