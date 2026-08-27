package o;

import com.sentiance.sdk.events.ControlMessage;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
final class r8lambdaNzqGLiorgJruU_M_DKkMNYd5wk extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ r8lambdaaU6VDCdFVzv00xopd8Ug7CIb2pc write;

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        ControlMessage controlMessage2 = ControlMessage.ONDEVICE_TRANSPORT_CLASSIFIER_STARTED;
        r8lambdaaU6VDCdFVzv00xopd8Ug7CIb2pc r8lambdaau6vdcdfvzv00xopd8ug7cib2pc = this.write;
        if (controlMessage == controlMessage2) {
            r8lambdaau6vdcdfvzv00xopd8ug7cib2pc.MediaSessionCompatResultReceiverWrapper = true;
            return;
        }
        if (controlMessage == ControlMessage.ONDEVICE_TRANSPORT_CLASSIFIER_STOPPED) {
            r8lambdaau6vdcdfvzv00xopd8ug7cib2pc.MediaSessionCompatResultReceiverWrapper = false;
            for (getLongitudeannotations getlongitudeannotations : new ArrayList(r8lambdaau6vdcdfvzv00xopd8ug7cib2pc.ParcelableVolumeInfo)) {
                r8lambdaau6vdcdfvzv00xopd8ug7cib2pc.IconCompatParcelizer.IconCompatParcelizer("Processing queued event: " + getlongitudeannotations.read().getClass(), new Object[0]);
                r8lambdaau6vdcdfvzv00xopd8ug7cib2pc.serializer((getLongitudeannotations<?>) getlongitudeannotations);
            }
            r8lambdaau6vdcdfvzv00xopd8ug7cib2pc.IconCompatParcelizer.IconCompatParcelizer("Done processing moving state events queue", new Object[0]);
            r8lambdaau6vdcdfvzv00xopd8ug7cib2pc.ParcelableVolumeInfo.clear();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaNzqGLiorgJruU_M_DKkMNYd5wk(r8lambdaaU6VDCdFVzv00xopd8Ug7CIb2pc r8lambdaau6vdcdfvzv00xopd8ug7cib2pc, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "TransportChangeDetector");
        this.write = r8lambdaau6vdcdfvzv00xopd8ug7cib2pc;
    }
}
