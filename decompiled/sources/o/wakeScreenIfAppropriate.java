package o;

import com.sentiance.sdk.payload.submission.PayloadSubmitter;

/* JADX INFO: loaded from: classes3.dex */
public final class wakeScreenIfAppropriate implements Runnable {
    final /* synthetic */ wakeScreenIfAppropriatelambda3.serializer IconCompatParcelizer;
    final /* synthetic */ PayloadSubmitter read;
    final /* synthetic */ PayloadSubmitter.SubmissionResult write;

    @Override // java.lang.Runnable
    public final void run() {
        wakeScreenIfAppropriatelambda3.serializer serializerVar = this.IconCompatParcelizer;
        String str = serializerVar.IconCompatParcelizer;
        PayloadSubmitter.SubmissionResult submissionResult = this.write;
        String lowerCase = submissionResult.name().toLowerCase();
        String str2 = serializerVar.write;
        PayloadSubmitter payloadSubmitter = this.read;
        PayloadSubmitter.RemoteActionCompatParcelizer(payloadSubmitter, serializerVar, new Object[]{lowerCase, str2});
        PayloadSubmitter.SubmissionResult submissionResult2 = PayloadSubmitter.SubmissionResult.SUCCESS;
        if (submissionResult == submissionResult2 || !payloadSubmitter.IconCompatParcelizer.read(str2)) {
            payloadSubmitter.read.serializer(str);
            payloadSubmitter.ResultReceiver.add(str);
        }
        if ((payloadSubmitter.IconCompatParcelizer.IconCompatParcelizer(str2) && submissionResult == PayloadSubmitter.SubmissionResult.FAILURE) || submissionResult == submissionResult2 || submissionResult == PayloadSubmitter.SubmissionResult.SKIPPED) {
            payloadSubmitter.RemoteActionCompatParcelizer();
        } else {
            payloadSubmitter.RemoteActionCompatParcelizer(false);
        }
        payloadSubmitter.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
    }

    public wakeScreenIfAppropriate(PayloadSubmitter payloadSubmitter, wakeScreenIfAppropriatelambda3.serializer serializerVar, PayloadSubmitter.SubmissionResult submissionResult) {
        this.read = payloadSubmitter;
        this.IconCompatParcelizer = serializerVar;
        this.write = submissionResult;
    }
}
