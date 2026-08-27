package o;

import android.text.TextUtils;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.location.lite.common.exception.LocationServiceException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MenuItemOption {
    public static void IconCompatParcelizer(Object obj) {
        if (obj == null) {
            throw new LocationServiceException(LocationStatusCode.ARGUMENTS_EMPTY, WindowRecomposer_androidKtgetAnimationScaleFlowFor11contentObserver1.serializer(LocationStatusCode.ARGUMENTS_EMPTY).concat(":for object"));
        }
    }

    public static void IconCompatParcelizer(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new LocationServiceException(LocationStatusCode.ARGUMENTS_EMPTY, WindowRecomposer_androidKtgetAnimationScaleFlowFor11contentObserver1.serializer(LocationStatusCode.ARGUMENTS_EMPTY).concat(":for String"));
        }
    }
}
