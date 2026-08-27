package o;

import com.sentiance.sdk.payload.submission.PayloadSubmitter;

/* JADX INFO: loaded from: classes5.dex */
final class setTitleIfPresentlambda0 implements Runnable {
    final /* synthetic */ setSummaryTextIfPresentAndSupportedlambda1 IconCompatParcelizer;

    @Override // java.lang.Runnable
    public final void run() {
        PayloadSubmitter payloadSubmitter = this.IconCompatParcelizer.IconCompatParcelizer;
        payloadSubmitter.read(new wakeScreenIfAppropriatelambda0("PayloadSubmitter", null));
        payloadSubmitter.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
    }

    public setTitleIfPresentlambda0(setSummaryTextIfPresentAndSupportedlambda1 setsummarytextifpresentandsupportedlambda1) {
        this.IconCompatParcelizer = setsummarytextifpresentandsupportedlambda1;
    }
}
