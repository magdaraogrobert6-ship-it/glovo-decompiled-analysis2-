package o;

import com.sentiance.sdk.eventtimeline.transportchangedetector.states.State;

/* JADX INFO: loaded from: classes4.dex */
final class InAppMessageHtmlFull extends migrateTriggersReeligibilityToJsonlambda1<State> {
    final /* synthetic */ r8lambdaaU6VDCdFVzv00xopd8Ug7CIb2pc IconCompatParcelizer;
    final /* synthetic */ r8lambdaPknZXoHXwjbqxVJs0a5VTLqOZN4 serializer;
    final /* synthetic */ long write;

    public InAppMessageHtmlFull(r8lambdaaU6VDCdFVzv00xopd8Ug7CIb2pc r8lambdaau6vdcdfvzv00xopd8ug7cib2pc, r8lambdaPknZXoHXwjbqxVJs0a5VTLqOZN4 r8lambdapknzxohxwjbqxvjs0a5vtlqozn4, long j) {
        this.IconCompatParcelizer = r8lambdaau6vdcdfvzv00xopd8ug7cib2pc;
        this.serializer = r8lambdapknzxohxwjbqxvjs0a5vtlqozn4;
        this.write = j;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda1
    public final State RemoteActionCompatParcelizer() {
        return this.serializer.read(this.IconCompatParcelizer.MediaBrowserCompatMediaItem, this.write);
    }
}
