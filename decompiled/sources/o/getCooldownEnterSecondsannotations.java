package o;

import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
final class getCooldownEnterSecondsannotations implements Runnable {
    final /* synthetic */ Object IconCompatParcelizer;
    final /* synthetic */ deepcopyandroid_sdk_base_release RemoteActionCompatParcelizer;
    final /* synthetic */ ControlMessage read;
    final /* synthetic */ getAnalyticsEnabledEnterannotations serializer;
    final /* synthetic */ r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 write;

    @Override // java.lang.Runnable
    public final void run() {
        if (this.serializer.MediaSessionCompatResultReceiverWrapper) {
            this.RemoteActionCompatParcelizer.serializer(this.read, this.IconCompatParcelizer);
        }
        this.write.IconCompatParcelizer();
    }

    public getCooldownEnterSecondsannotations(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, deepcopyandroid_sdk_base_release deepcopyandroid_sdk_base_releaseVar, ControlMessage controlMessage, Object obj, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4) {
        this.serializer = getanalyticsenabledenterannotations;
        this.RemoteActionCompatParcelizer = deepcopyandroid_sdk_base_releaseVar;
        this.read = controlMessage;
        this.IconCompatParcelizer = obj;
        this.write = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
    }
}
