package o;

import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: renamed from: o.setUseWebview, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0202setUseWebview extends deepcopyandroid_sdk_base_release {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    final /* synthetic */ removeGeofencesRegisteredWithGeofencingClientlambda2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0202setUseWebview(r8lambdaXT0nPvLtCfK_WynrAwNr8TFIamk r8lambdaxt0npvltcfk_wynrawnr8tfiamk, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "LocationProviderChangeManager");
        this.RemoteActionCompatParcelizer = 2;
        this.write = r8lambdaxt0npvltcfk_wynrawnr8tfiamk;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        removeGeofencesRegisteredWithGeofencingClientlambda2 removegeofencesregisteredwithgeofencingclientlambda2 = this.write;
        if (i == 0) {
            setActionId.serializer((setActionId) removegeofencesregisteredwithgeofencingclientlambda2, obj instanceof Long ? (Long) obj : null);
            return;
        }
        if (i != 1) {
            ((r8lambdaXT0nPvLtCfK_WynrAwNr8TFIamk) removegeofencesregisteredwithgeofencingclientlambda2).read();
            return;
        }
        setActionId setactionid = (setActionId) removegeofencesregisteredwithgeofencingclientlambda2;
        if (controlMessage == ControlMessage.LOCATION_FIX_START && (obj instanceof r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0)) {
            setActionId.RemoteActionCompatParcelizer(setactionid, (r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0) obj);
        } else if (controlMessage == ControlMessage.LOCATION_FIX_STOP && (obj instanceof getDismissalTimeMsannotations)) {
            setActionId.RemoteActionCompatParcelizer(setactionid, (getDismissalTimeMsannotations) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0202setUseWebview(setActionId setactionid, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, int i) {
        super(readandroid_sdk_base_releaseVar, "LocationManager");
        this.RemoteActionCompatParcelizer = i;
        this.write = setactionid;
    }
}
