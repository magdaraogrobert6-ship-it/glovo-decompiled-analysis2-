package o;

import com.sentiance.sdk.eventtimeline.transportclassification.ClassifiedTransportMode;

/* JADX INFO: renamed from: o.getOpenUriInWebview, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C0168getOpenUriInWebview extends MessageButton {
    public C0168getOpenUriInWebview(r8lambdaoWdBWTrivTRn12U1u9dGnSA9aTw r8lambdaowdbwtrivtrn12u1u9dgnsa9atw, long j, long j2, boolean z) {
        super(r8lambdaowdbwtrivtrn12u1u9dgnsa9atw, j, j2, z);
    }

    @Override // o.MessageButton
    public final ClassifiedTransportMode RatingCompat() {
        return ClassifiedTransportMode.TRAIN;
    }

    @Override // com.sentiance.sdk.eventtimeline.transportchangedetector.states.State
    public final String write() {
        return "TrainState";
    }

    @Override // com.sentiance.sdk.eventtimeline.transportchangedetector.states.State
    public final r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM IconCompatParcelizer() {
        r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ r8lambda59swxcybpdsiw8mt9h_rosbr8qqRemoteActionCompatParcelizer = serializer().RemoteActionCompatParcelizer();
        long j = read();
        long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        r8lambda59swxcybpdsiw8mt9h_rosbr8qqRemoteActionCompatParcelizer.getClass();
        return r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ.MediaBrowserCompatMediaItem(j, jRemoteActionCompatParcelizer);
    }
}
