package o;

import com.sentiance.sdk.events.ControlMessage;
import o.getStoryStyle;

/* JADX INFO: loaded from: classes5.dex */
final class r8lambdam3G4MRr5SEO1X1vq9HpZ4y6CA extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ BrazeNotificationUtils serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdam3G4MRr5SEO1X1vq9HpZ4y6CA(BrazeNotificationUtils brazeNotificationUtils, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "DataSyncPayloadCreator");
        readandroid_sdk_base_releaseVar.getClass();
        this.serializer = brazeNotificationUtils;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        controlMessage.getClass();
        final getFlushMaxMinutes getflushmaxminutes = obj instanceof getFlushMaxMinutes ? (getFlushMaxMinutes) obj : null;
        if (getflushmaxminutes == null) {
            return;
        }
        this.serializer.RemoteActionCompatParcelizer(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.ondevice.datasyncing.creators.DataSyncPayloadCreator$OccupantRoleControlMessageConsumer$onControlEvent$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj2) {
                getStoryStyle getstorystyle = (getStoryStyle) obj2;
                getstorystyle.getClass();
                return getstorystyle.write(getflushmaxminutes);
            }

            {
                super(1);
            }
        });
    }
}
