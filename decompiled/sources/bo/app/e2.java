package bo.app;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.LocationProviderName;
import com.braze.support.BrazeLogger;
import java.util.EnumSet;
import o.createInAppMessageEventSubscriber;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class e2 {
    public final EnumSet a(BrazeConfigurationProvider brazeConfigurationProvider) {
        brazeConfigurationProvider.getClass();
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        createinappmessageeventsubscriber.IconCompatParcelizer = EnumSet.of(LocationProviderName.PASSIVE, LocationProviderName.NETWORK);
        if (!brazeConfigurationProvider.getCustomLocationProviderNames().isEmpty()) {
            createinappmessageeventsubscriber.IconCompatParcelizer = brazeConfigurationProvider.getCustomLocationProviderNames();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda3(createinappmessageeventsubscriber, 1), 6, (Object) null);
        }
        Object obj = createinappmessageeventsubscriber.IconCompatParcelizer;
        obj.getClass();
        return (EnumSet) obj;
    }

    public static final String a(createInAppMessageEventSubscriber createinappmessageeventsubscriber) {
        return m1$$ExternalSyntheticOutline0.m(createinappmessageeventsubscriber.IconCompatParcelizer, "Using location providers: ");
    }
}
