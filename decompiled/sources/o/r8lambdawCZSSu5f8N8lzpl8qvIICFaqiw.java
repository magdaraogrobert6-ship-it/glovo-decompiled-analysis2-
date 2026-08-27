package o;

import com.sentiance.sdk.eventtimeline.transportclassification.ClassifiedTransportMode;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambdawCZSSu5f8N8lzpl8qvIICFaqiw extends MessageButton {
    public r8lambdawCZSSu5f8N8lzpl8qvIICFaqiw(r8lambdaoWdBWTrivTRn12U1u9dGnSA9aTw r8lambdaowdbwtrivtrn12u1u9dgnsa9atw, long j, long j2, boolean z) {
        super(r8lambdaowdbwtrivtrn12u1u9dgnsa9atw, j, j2, z);
    }

    @Override // o.MessageButton
    public final ClassifiedTransportMode RatingCompat() {
        return ClassifiedTransportMode.ON_FOOT;
    }

    @Override // com.sentiance.sdk.eventtimeline.transportchangedetector.states.State
    public final String write() {
        return "OnFootState";
    }

    @Override // com.sentiance.sdk.eventtimeline.transportchangedetector.states.State
    public final r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM IconCompatParcelizer() {
        r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ r8lambda59swxcybpdsiw8mt9h_rosbr8qqRemoteActionCompatParcelizer = serializer().RemoteActionCompatParcelizer();
        long j = read();
        long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        r8lambda59swxcybpdsiw8mt9h_rosbr8qqRemoteActionCompatParcelizer.getClass();
        return r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ.MediaSessionCompatQueueItem(j, jRemoteActionCompatParcelizer);
    }
}
