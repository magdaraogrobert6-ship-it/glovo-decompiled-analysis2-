package o;

import android.util.Pair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.thrift.DataAction;
import java.util.Map;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
final class handlePushStoryPageClickedlambda0 extends migrateMetadataToJsonlambda4<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> {
    final /* synthetic */ handleNotificationDeletedlambda0 write;

    public handlePushStoryPageClickedlambda0(handleNotificationDeletedlambda0 handlenotificationdeletedlambda0) {
        this.write = handlenotificationdeletedlambda0;
    }

    @Override // o.migrateMetadataToJsonlambda4
    public final Pair write() {
        DataAction dataAction;
        handleNotificationDeletedlambda0 handlenotificationdeletedlambda0 = this.write;
        byte bByteValue = handlenotificationdeletedlambda0.read.read.byteValue();
        if (bByteValue != 1) {
            dataAction = bByteValue != 2 ? null : DataAction.REMOVE;
        } else {
            dataAction = DataAction.ADD;
        }
        if (dataAction == null) {
            return null;
        }
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1 = handlenotificationdeletedlambda0.serializer;
        long j = handlenotificationdeletedlambda0.IconCompatParcelizer;
        Map map = handlenotificationdeletedlambda0.read.IconCompatParcelizer;
        setsoundifpresentandsupportedlambda1.getClass();
        FormBody.Builder builder = new FormBody.Builder();
        if (map == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'labels' cannot be null");
            return null;
        }
        builder.serializer = map;
        builder.RemoteActionCompatParcelizer = dataAction;
        return new Pair(setsoundifpresentandsupportedlambda1.write(builder.serializer(), Long.valueOf(j)), null);
    }
}
