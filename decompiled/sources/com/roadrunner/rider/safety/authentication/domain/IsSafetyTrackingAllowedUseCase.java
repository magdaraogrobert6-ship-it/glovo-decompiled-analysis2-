package com.roadrunner.rider.safety.authentication.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.rider.safety.authentication.data.RiderSafetyRepository;
import java.util.Collections;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getFirstErrorCode;
import o.getRetryCount;
import o.isItemDismissable;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class IsSafetyTrackingAllowedUseCase {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final getFirstErrorCode read;
    public final RiderSafetyRepository write;

    public IsSafetyTrackingAllowedUseCase(RiderSafetyRepository riderSafetyRepository, getFirstErrorCode getfirsterrorcode) {
        riderSafetyRepository.getClass();
        getfirsterrorcode.getClass();
        this.write = riderSafetyRepository;
        this.read = getfirsterrorcode;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        getRetryCount getretrycount;
        Object objM5022getSafetyTrackingPermissionIoAF18A;
        int i = 2 % 2;
        if (continuationImpl instanceof getRetryCount) {
            int i2 = IconCompatParcelizer + 77;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getretrycount = (getRetryCount) continuationImpl;
            int i4 = getretrycount.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                getretrycount.write = i4 - Integer.MIN_VALUE;
            } else {
                getretrycount = new getRetryCount(this, continuationImpl);
            }
        } else {
            getretrycount = new getRetryCount(this, continuationImpl);
        }
        Object obj = getretrycount.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = getretrycount.write;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getretrycount.write = 1;
            objM5022getSafetyTrackingPermissionIoAF18A = this.write.m5022getSafetyTrackingPermissionIoAF18A(getretrycount);
            if (objM5022getSafetyTrackingPermissionIoAF18A == coroutineSingletons) {
                int i6 = IconCompatParcelizer + 101;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = IconCompatParcelizer + 43;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objM5022getSafetyTrackingPermissionIoAF18A = ((onItemDismiss) obj).IconCompatParcelizer;
                int i9 = 6 / 0;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objM5022getSafetyTrackingPermissionIoAF18A = ((onItemDismiss) obj).IconCompatParcelizer;
            }
        }
        Boolean bool = Boolean.FALSE;
        if (objM5022getSafetyTrackingPermissionIoAF18A instanceof isItemDismissable) {
            objM5022getSafetyTrackingPermissionIoAF18A = bool;
        }
        Boolean bool2 = (Boolean) objM5022getSafetyTrackingPermissionIoAF18A;
        boolean zBooleanValue = bool2.booleanValue();
        getFirstErrorCode getfirsterrorcode = this.read;
        getfirsterrorcode.getClass();
        Map mapSingletonMap = Collections.singletonMap("allowed", String.valueOf(zBooleanValue));
        mapSingletonMap.getClass();
        getfirsterrorcode.RemoteActionCompatParcelizer("rider_safety_tracking_allowed", mapSingletonMap);
        return bool2;
    }
}
