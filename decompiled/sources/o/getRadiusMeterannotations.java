package o;

import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
public final class getRadiusMeterannotations extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 IconCompatParcelizer;
    final /* synthetic */ ControlMessage read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getRadiusMeterannotations(clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ControlMessage controlMessage) {
        super(clearandroid_sdk_base_releaseVar, "CrashLoopDetector");
        this.IconCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.read = controlMessage;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        controlMessage.getClass();
        this.IconCompatParcelizer.invoke(this.read, obj);
    }
}
