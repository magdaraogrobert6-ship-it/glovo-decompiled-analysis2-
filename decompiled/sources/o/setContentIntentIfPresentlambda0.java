package o;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class setContentIntentIfPresentlambda0 implements setSoundIfPresentAndSupportedlambda0<reenqueueInAppMessage> {
    final /* synthetic */ setDeleteIntentlambda0 RemoteActionCompatParcelizer;

    public setContentIntentIfPresentlambda0(setDeleteIntentlambda0 setdeleteintentlambda0) {
        this.RemoteActionCompatParcelizer = setdeleteintentlambda0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    @Override // o.setSoundIfPresentAndSupportedlambda0
    public final List<logBaiduNotificationClicklambda1> RemoteActionCompatParcelizer(getLongitudeannotations<reenqueueInAppMessage> getlongitudeannotations) {
        long jLongValue;
        String str;
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa;
        reenqueueInAppMessage reenqueueinappmessage;
        if (getlongitudeannotations.read().write.byteValue() != 2) {
            return Collections.EMPTY_LIST;
        }
        setDeleteIntentlambda0 setdeleteintentlambda0 = this.RemoteActionCompatParcelizer;
        getCooldownEnterSeconds.read readVar = (getCooldownEnterSeconds.read) setdeleteintentlambda0.MediaSessionCompatResultReceiverWrapper.read(reenqueueInAppMessage.class, Long.valueOf(getlongitudeannotations.MediaMetadataCompat())).RemoteActionCompatParcelizer();
        long jWrite = getlongitudeannotations.write();
        if (readVar == null || (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = readVar.RemoteActionCompatParcelizer(setdeleteintentlambda0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus)) == null || (reenqueueinappmessage = (r8lambdaturwertf3otevz1wenzex5tdwa = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer).r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) == null) {
            jLongValue = 0;
            str = null;
        } else {
            String str2 = reenqueueinappmessage.IconCompatParcelizer;
            byte bByteValue = reenqueueinappmessage.write.byteValue();
            if (str2.equals(getlongitudeannotations.read().IconCompatParcelizer) && bByteValue == 1) {
                str = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer;
                jLongValue = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.longValue();
            } else {
                jLongValue = 0;
                str = null;
            }
        }
        String str3 = str;
        long j = jLongValue;
        if (str3 == null) {
            return Collections.EMPTY_LIST;
        }
        return com.sentiance.sdk.util.x.IconCompatParcelizer(new handleNotificationDeleted(setdeleteintentlambda0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read, setdeleteintentlambda0.MediaSessionCompatResultReceiverWrapper, setdeleteintentlambda0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, setdeleteintentlambda0.ResultReceiver, setdeleteintentlambda0.ComponentActivity, setdeleteintentlambda0.RemoteActionCompatParcelizer, str3, j, jWrite));
    }
}
