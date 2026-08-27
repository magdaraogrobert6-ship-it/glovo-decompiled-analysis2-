package o;

import com.sentiance.sdk.payload.creation.DetectionIdManager;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class setLargeIconIfPresentAndSupportedlambda5 extends setPriorityIfPresentAndSupportedlambda0<setSessionHandlingBlocklist> {
    final /* synthetic */ setDeleteIntentlambda0 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setLargeIconIfPresentAndSupportedlambda5(setDeleteIntentlambda0 setdeleteintentlambda0) {
        super(setdeleteintentlambda0);
        this.write = setdeleteintentlambda0;
    }

    @Override // o.setPriorityIfPresentAndSupportedlambda0
    public final List<logBaiduNotificationClicklambda1> IconCompatParcelizer(getLongitudeannotations<setSessionHandlingBlocklist> getlongitudeannotations) {
        setDeleteIntentlambda0 setdeleteintentlambda0 = this.write;
        setdeleteintentlambda0.ComponentActivity.IconCompatParcelizer("MotionEvent arrived", new Object[0]);
        if (!setDeleteIntentlambda0.read(setdeleteintentlambda0, setDeleteIntentlambda0.write, getlongitudeannotations.MediaMetadataCompat())) {
            return Collections.EMPTY_LIST;
        }
        setSessionHandlingBlocklist setsessionhandlingblocklist = getlongitudeannotations.read();
        return com.sentiance.sdk.util.x.IconCompatParcelizer(new handlePushStoryPageClicked(setdeleteintentlambda0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read, getlongitudeannotations.write(), setdeleteintentlambda0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(DetectionIdManager.Detection.TRIP), setsessionhandlingblocklist.RemoteActionCompatParcelizer, setsessionhandlingblocklist.IconCompatParcelizer.serializer));
    }
}
