package o;

import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.configuration.ConfigurationManager;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdaPlkzejBAs0yKFoODFE9lqbeRk implements Runnable {
    public final /* synthetic */ ConfigurationManager IconCompatParcelizer;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ renderUrlIntoInAppMessageView write;

    @Override // java.lang.Runnable
    public final void run() {
        Sentiance sentiance = this.write.serializer;
        if (sentiance.mSdkInitState.MediaSessionCompatQueueItem() || !sentiance.userExists()) {
            return;
        }
        sentiance.bootstrapIfNecessaryAndInitialize(this.read, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
    }

    public /* synthetic */ r8lambdaPlkzejBAs0yKFoODFE9lqbeRk(renderUrlIntoInAppMessageView renderurlintoinappmessageview, boolean z, ConfigurationManager configurationManager, boolean z2) {
        this.write = renderurlintoinappmessageview;
        this.read = z;
        this.IconCompatParcelizer = configurationManager;
        this.RemoteActionCompatParcelizer = z2;
    }
}
