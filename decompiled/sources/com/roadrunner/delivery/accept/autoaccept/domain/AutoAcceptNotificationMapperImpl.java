package com.roadrunner.delivery.accept.autoaccept.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.accept.domain.RemoveAutoAcceptedDeliveryIdImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.checkAdjustAdRevenue;
import o.copyNs73l9sdefault;
import o.deleteGlobalCallbackParameters;
import o.fastRoundToInt;
import o.r8lambdaFpHV3_UOali9TbXf7Yf11IzQDIk;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoAcceptNotificationMapperImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final setTransactionSuccessful IconCompatParcelizer;
    public final RemoveAutoAcceptedDeliveryIdImpl write;

    public AutoAcceptNotificationMapperImpl(setTransactionSuccessful settransactionsuccessful, RemoveAutoAcceptedDeliveryIdImpl removeAutoAcceptedDeliveryIdImpl) {
        settransactionsuccessful.getClass();
        this.IconCompatParcelizer = settransactionsuccessful;
        this.write = removeAutoAcceptedDeliveryIdImpl;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047 A[PHI: r10
  0x0047: PHI (r10v9 o.fastRoundToInt) = (r10v3 o.fastRoundToInt), (r10v5 o.fastRoundToInt), (r10v10 o.fastRoundToInt) binds: [B:22:0x0051, B:27:0x0065, B:17:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object invoke(copyNs73l9sdefault copyns73l9sdefault, checkAdjustAdRevenue checkadjustadrevenue, ContinuationImpl continuationImpl, boolean z) {
        r8lambdaFpHV3_UOali9TbXf7Yf11IzQDIk r8lambdafphv3_uoali9tbxf7yf11izqdik;
        fastRoundToInt fastroundtointRemoteActionCompatParcelizer;
        int i = 2 % 2;
        int i2 = read + 101;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof r8lambdaFpHV3_UOali9TbXf7Yf11IzQDIk) {
            r8lambdafphv3_uoali9tbxf7yf11izqdik = (r8lambdaFpHV3_UOali9TbXf7Yf11IzQDIk) continuationImpl;
            int i4 = r8lambdafphv3_uoali9tbxf7yf11izqdik.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                r8lambdafphv3_uoali9tbxf7yf11izqdik.serializer = i4 - Integer.MIN_VALUE;
            } else {
                r8lambdafphv3_uoali9tbxf7yf11izqdik = new r8lambdaFpHV3_UOali9TbXf7Yf11IzQDIk(this, continuationImpl);
            }
        } else {
            r8lambdafphv3_uoali9tbxf7yf11izqdik = new r8lambdaFpHV3_UOali9TbXf7Yf11IzQDIk(this, continuationImpl);
        }
        Object notification = r8lambdafphv3_uoali9tbxf7yf11izqdik.read;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = r8lambdafphv3_uoali9tbxf7yf11izqdik.serializer;
        fastRoundToInt fastroundtointWrite = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(notification);
            if (copyns73l9sdefault == null || (fastroundtointRemoteActionCompatParcelizer = copyns73l9sdefault.serializer()) == null) {
                fastroundtointRemoteActionCompatParcelizer = copyns73l9sdefault != null ? copyns73l9sdefault.RemoteActionCompatParcelizer() : null;
                if (fastroundtointRemoteActionCompatParcelizer == null) {
                    if (copyns73l9sdefault != null) {
                        fastroundtointRemoteActionCompatParcelizer = copyns73l9sdefault.IconCompatParcelizer();
                        int i6 = read + 99;
                        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                    } else {
                        fastroundtointRemoteActionCompatParcelizer = null;
                    }
                    if (fastroundtointRemoteActionCompatParcelizer != null) {
                        fastroundtointWrite = fastroundtointRemoteActionCompatParcelizer;
                    } else if (copyns73l9sdefault != null) {
                        fastroundtointWrite = copyns73l9sdefault.write();
                    }
                } else {
                    fastroundtointWrite = fastroundtointRemoteActionCompatParcelizer;
                }
            } else {
                fastroundtointWrite = fastroundtointRemoteActionCompatParcelizer;
            }
            r8lambdafphv3_uoali9tbxf7yf11izqdik.RemoteActionCompatParcelizer = checkadjustadrevenue;
            r8lambdafphv3_uoali9tbxf7yf11izqdik.serializer = 1;
            notification = getNotification(fastroundtointWrite, checkadjustadrevenue, z, r8lambdafphv3_uoali9tbxf7yf11izqdik);
            if (notification == obj) {
                int i8 = RemoteActionCompatParcelizer + 125;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    int i9 = 82 / 0;
                }
                return obj;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            checkadjustadrevenue = r8lambdafphv3_uoali9tbxf7yf11izqdik.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(notification);
        }
        deleteGlobalCallbackParameters deleteglobalcallbackparameters = (deleteGlobalCallbackParameters) notification;
        if (deleteglobalcallbackparameters == null) {
            return checkadjustadrevenue;
        }
        int i10 = read + 89;
        RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return checkAdjustAdRevenue.RemoteActionCompatParcelizer(checkadjustadrevenue, deleteglobalcallbackparameters);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        if (r12 != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getNotification(o.fastRoundToInt r10, o.checkAdjustAdRevenue r11, boolean r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptNotificationMapperImpl.getNotification(o.fastRoundToInt, o.checkAdjustAdRevenue, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
