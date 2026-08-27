package o;

import java.util.IdentityHashMap;
import java.util.Map;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class UserJavascriptInterfaceBaseCompanion extends UserJavascriptInterfaceBaseExternalSyntheticLambda1 {
    public final wouldPushPermissionPromptDisplaylambda4 serializer;
    public final JsonUtilsExternalSyntheticLambda1 write;

    @Override // o.UserJavascriptInterfaceBaseExternalSyntheticLambda1
    public final JsonUtilsExternalSyntheticLambda1 MediaSessionCompatResultReceiverWrapper() {
        return this.write;
    }

    @Override // o.JsonUtilsExternalSyntheticLambda1
    public final getPrettyPrintedStringlambda0 serializer() {
        getPrettyPrintedStringlambda0 getprettyprintedstringlambda0Serializer = this.write.serializer();
        getprettyprintedstringlambda0Serializer.getClass();
        Boolean bool = Boolean.TRUE;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(hasPermissionlambda0.serializer, bool);
        for (Map.Entry entry : getprettyprintedstringlambda0Serializer.read.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((parseJsonObjectIntoBundle) entry.getKey(), entry.getValue());
            }
        }
        return new getPrettyPrintedStringlambda0(identityHashMap);
    }

    @Override // o.JsonUtilsExternalSyntheticLambda1
    public final void serializer(wouldPushPermissionPromptDisplaylambda4 wouldpushpermissionpromptdisplaylambda4) {
        this.write.serializer(new accessrunOnUser(this, wouldpushpermissionpromptdisplaylambda4, 0));
    }

    public UserJavascriptInterfaceBaseCompanion(JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1, wouldPushPermissionPromptDisplaylambda4 wouldpushpermissionpromptdisplaylambda4) {
        TextStreamsKt.serializer(jsonUtilsExternalSyntheticLambda1, "delegate");
        this.write = jsonUtilsExternalSyntheticLambda1;
        TextStreamsKt.serializer(wouldpushpermissionpromptdisplaylambda4, "healthListener");
        this.serializer = wouldpushpermissionpromptdisplaylambda4;
    }
}
