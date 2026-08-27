package o;

import com.sentiance.sdk.payload.creation.DetectionIdManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class setContentIfPresentlambda0 extends setPriorityIfPresentAndSupportedlambda0<handleInAppMessageTestPush> {
    final /* synthetic */ setDeleteIntentlambda0 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setContentIfPresentlambda0(setDeleteIntentlambda0 setdeleteintentlambda0) {
        super(setdeleteintentlambda0);
        this.write = setdeleteintentlambda0;
    }

    @Override // o.setPriorityIfPresentAndSupportedlambda0
    public final List<logBaiduNotificationClicklambda1> IconCompatParcelizer(getLongitudeannotations<handleInAppMessageTestPush> getlongitudeannotations) {
        setDeleteIntentlambda0 setdeleteintentlambda0 = this.write;
        if (!Arrays.asList(setShouldPersistWebView.class, r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class).contains(((setLargeIconIfPresentAndSupportedlambda4) setdeleteintentlambda0.RatingCompat.read()).write)) {
            return Collections.EMPTY_LIST;
        }
        long jWrite = getlongitudeannotations.write();
        handleInAppMessageTestPush handleinappmessagetestpush = getlongitudeannotations.read();
        return com.sentiance.sdk.util.x.IconCompatParcelizer(new handlePushStoryPageClicked(setdeleteintentlambda0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read, jWrite, setdeleteintentlambda0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(DetectionIdManager.Detection.TRIP), handleinappmessagetestpush.write, (byte) 100));
    }
}
