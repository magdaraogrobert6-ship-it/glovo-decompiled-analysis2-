package o;

import android.content.Context;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.payload.submission.PayloadSubmitter;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "PayloadSubmissionTask", componentName = "PayloadSubmissionTask")
public class BrazeNotificationUtilsExternalSyntheticLambda34 extends createOrGetDataStorelambda00 {
    private final wakeScreenIfAppropriatelambda0 IconCompatParcelizer = new wakeScreenIfAppropriatelambda0("PayloadSubmissionTask", this);
    private final ConfigurationManager RemoteActionCompatParcelizer;
    private final PayloadSubmitter serializer;

    @Override // o.createOrGetDataStorelambda00
    public final boolean z_() {
        return false;
    }

    @Override // o.createOrGetDataStorelambda00
    public final accesssetEventPublishercp RemoteActionCompatParcelizer() {
        publishExceptionlambda0 publishexceptionlambda0 = new publishExceptionlambda0();
        publishexceptionlambda0.write("PayloadSubmissionTask");
        publishexceptionlambda0.read(1800000L);
        publishexceptionlambda0.write(30000L);
        publishexceptionlambda0.write(1);
        publishexceptionlambda0.RemoteActionCompatParcelizer(1);
        this.RemoteActionCompatParcelizer.getClass();
        publishexceptionlambda0.IconCompatParcelizer();
        return publishexceptionlambda0.RemoteActionCompatParcelizer();
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean RemoteActionCompatParcelizer(Context context, createOrGetDataStorelambda010 createorgetdatastorelambda010) {
        this.serializer.read(this.IconCompatParcelizer);
        return false;
    }

    public BrazeNotificationUtilsExternalSyntheticLambda34(PayloadSubmitter payloadSubmitter, ConfigurationManager configurationManager) {
        this.serializer = payloadSubmitter;
        this.RemoteActionCompatParcelizer = configurationManager;
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean read(Context context) {
        this.serializer.write(this.IconCompatParcelizer);
        return true;
    }
}
