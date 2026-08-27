package o;

import com.sentiance.sdk.eventtimeline.transportchangedetector.states.State;
import com.sentiance.sdk.eventtimeline.transportclassification.ClassifiedTransportMode;

/* JADX INFO: loaded from: classes4.dex */
public class setTextColor extends enableDarkThemelambda00 {
    public setTextColor(r8lambdaoWdBWTrivTRn12U1u9dGnSA9aTw r8lambdaowdbwtrivtrn12u1u9dgnsa9atw, long j, long j2) {
        super(r8lambdaowdbwtrivtrn12u1u9dgnsa9atw, j, j2);
    }

    @Override // com.sentiance.sdk.eventtimeline.transportchangedetector.states.State
    public final State RemoteActionCompatParcelizer(ClassifiedTransportMode classifiedTransportMode, long j, long j2, boolean z) {
        return IconCompatParcelizer(classifiedTransportMode, j, j2, z);
    }

    @Override // com.sentiance.sdk.eventtimeline.transportchangedetector.states.State
    public final r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM IconCompatParcelizer() {
        r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ r8lambda59swxcybpdsiw8mt9h_rosbr8qqRemoteActionCompatParcelizer = serializer().RemoteActionCompatParcelizer();
        long j = read();
        long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        r8lambda59swxcybpdsiw8mt9h_rosbr8qqRemoteActionCompatParcelizer.getClass();
        return r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ.ParcelableVolumeInfo(j, jRemoteActionCompatParcelizer);
    }

    @Override // com.sentiance.sdk.eventtimeline.transportchangedetector.states.State
    public final String write() {
        return "UnknownState";
    }
}
