package com.roadrunner.rider.safety.authentication.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import dagger.Lazy;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.getIsClick;
import o.getLastErrorCode;
import o.getSuffix;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U;
import o.r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA;
import o.r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderSafetyRepository {
    private static int MediaDescriptionCompat = 1;
    private static int serializer;
    public final ExecuteApiRequest IconCompatParcelizer;
    public final getIsClick RemoteActionCompatParcelizer;
    public final r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 read;
    public final Lazy write;

    public RiderSafetyRepository(Lazy lazy, ExecuteApiRequest executeApiRequest, r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 r8lambda4txk7kovp_j84hgvzl3zo6mzli8, getIsClick getisclick) {
        lazy.getClass();
        executeApiRequest.getClass();
        r8lambda4txk7kovp_j84hgvzl3zo6mzli8.getClass();
        getisclick.getClass();
        this.write = lazy;
        this.IconCompatParcelizer = executeApiRequest;
        this.read = r8lambda4txk7kovp_j84hgvzl3zo6mzli8;
        this.RemoteActionCompatParcelizer = getisclick;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: getSentianceAuthCode-IoAF18A, reason: not valid java name */
    public final Object m5023getSentianceAuthCodeIoAF18A(ContinuationImpl continuationImpl) {
        RiderSafetyRepository$getSentianceAuthCode$1 riderSafetyRepository$getSentianceAuthCode$1;
        Object objM4875invokegIAlus;
        int i = 2 % 2;
        if (continuationImpl instanceof RiderSafetyRepository$getSentianceAuthCode$1) {
            riderSafetyRepository$getSentianceAuthCode$1 = (RiderSafetyRepository$getSentianceAuthCode$1) continuationImpl;
            int i2 = riderSafetyRepository$getSentianceAuthCode$1.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                riderSafetyRepository$getSentianceAuthCode$1.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                riderSafetyRepository$getSentianceAuthCode$1 = new RiderSafetyRepository$getSentianceAuthCode$1(this, continuationImpl);
                int i3 = MediaDescriptionCompat + 55;
                serializer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
        } else {
            riderSafetyRepository$getSentianceAuthCode$1 = new RiderSafetyRepository$getSentianceAuthCode$1(this, continuationImpl);
            int i5 = MediaDescriptionCompat + 55;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        Object obj = riderSafetyRepository$getSentianceAuthCode$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = riderSafetyRepository$getSentianceAuthCode$1.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i7 != 0) {
            int i8 = MediaDescriptionCompat + 85;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4875invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer = ((r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U) this.read).RemoteActionCompatParcelizer.serializer();
            Long l = r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer != null ? new Long(r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer.read) : null;
            if (l == null) {
                return new isItemDismissable(new IllegalStateException("There is no active user session"));
            }
            RiderSafetyRepository$getSentianceAuthCode$2 riderSafetyRepository$getSentianceAuthCode$2 = new RiderSafetyRepository$getSentianceAuthCode$2(this, l, shortNewsContentCardView, 0);
            riderSafetyRepository$getSentianceAuthCode$1.RemoteActionCompatParcelizer = 1;
            objM4875invokegIAlus = this.IconCompatParcelizer.m4875invokegIAlus(riderSafetyRepository$getSentianceAuthCode$2, riderSafetyRepository$getSentianceAuthCode$1);
            if (objM4875invokegIAlus == coroutineSingletons) {
                int i10 = serializer + 51;
                MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    return coroutineSingletons;
                }
                shortNewsContentCardView.hashCode();
                throw null;
            }
        }
        return !((objM4875invokegIAlus instanceof isItemDismissable) ^ true) ? objM4875invokegIAlus : ((getSuffix) objM4875invokegIAlus).authCode;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    /* JADX INFO: renamed from: getSafetyTrackingPermission-IoAF18A, reason: not valid java name */
    public final Object m5022getSafetyTrackingPermissionIoAF18A(ContinuationImpl continuationImpl) {
        RiderSafetyRepository$getSafetyTrackingPermission$1 riderSafetyRepository$getSafetyTrackingPermission$1;
        int i;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i2;
        ShortNewsContentCardView shortNewsContentCardView;
        getIsClick getisclick;
        r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer;
        Long l;
        Object objM4875invokegIAlus;
        getIsClick getisclick2;
        Object objValueOf;
        int i3 = 2 % 2;
        int i4 = MediaDescriptionCompat + 81;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = 1;
        if (i4 % 2 == 0) {
            if (continuationImpl instanceof RiderSafetyRepository$getSafetyTrackingPermission$1) {
                riderSafetyRepository$getSafetyTrackingPermission$1 = (RiderSafetyRepository$getSafetyTrackingPermission$1) continuationImpl;
                i = riderSafetyRepository$getSafetyTrackingPermission$1.serializer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    riderSafetyRepository$getSafetyTrackingPermission$1.serializer = i - Integer.MIN_VALUE;
                }
            }
            obj = riderSafetyRepository$getSafetyTrackingPermission$1.RemoteActionCompatParcelizer;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = riderSafetyRepository$getSafetyTrackingPermission$1.serializer;
            shortNewsContentCardView = null;
            if (i2 != 0) {
                int i6 = serializer + 51;
                MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                getisclick2 = riderSafetyRepository$getSafetyTrackingPermission$1.write;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objValueOf = ((onItemDismiss) obj).IconCompatParcelizer;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getisclick = this.RemoteActionCompatParcelizer;
                if (getisclick.IconCompatParcelizer > System.currentTimeMillis()) {
                    Boolean boolValueOf = Boolean.valueOf(getisclick.RemoteActionCompatParcelizer);
                    int i8 = serializer + 5;
                    MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return boolValueOf;
                }
                r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer = ((r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U) this.read).RemoteActionCompatParcelizer.serializer();
                if (r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer != null) {
                    l = new Long(r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer.read);
                } else {
                    l = null;
                }
                if (l == null) {
                    getisclick.RemoteActionCompatParcelizer = false;
                    getisclick.IconCompatParcelizer = 0L;
                    return false;
                }
                RiderSafetyRepository$getSentianceAuthCode$2 riderSafetyRepository$getSentianceAuthCode$2 = new RiderSafetyRepository$getSentianceAuthCode$2(this, l, shortNewsContentCardView, i5);
                riderSafetyRepository$getSafetyTrackingPermission$1.write = getisclick;
                riderSafetyRepository$getSafetyTrackingPermission$1.serializer = 1;
                objM4875invokegIAlus = this.IconCompatParcelizer.m4875invokegIAlus(riderSafetyRepository$getSentianceAuthCode$2, riderSafetyRepository$getSafetyTrackingPermission$1);
                if (objM4875invokegIAlus == coroutineSingletons) {
                    return coroutineSingletons;
                }
                getisclick2 = getisclick;
                objValueOf = objM4875invokegIAlus;
            }
            if (!(objValueOf instanceof isItemDismissable)) {
                objValueOf = Boolean.valueOf(((getLastErrorCode) objValueOf).permissionGranted);
            }
            if (!(objValueOf instanceof isItemDismissable)) {
                getisclick2.RemoteActionCompatParcelizer = ((Boolean) objValueOf).booleanValue();
                getisclick2.IconCompatParcelizer = System.currentTimeMillis() + 3600000;
            }
            return objValueOf;
        }
        int i10 = 91 / 0;
        if (continuationImpl instanceof RiderSafetyRepository$getSafetyTrackingPermission$1) {
            riderSafetyRepository$getSafetyTrackingPermission$1 = (RiderSafetyRepository$getSafetyTrackingPermission$1) continuationImpl;
            i = riderSafetyRepository$getSafetyTrackingPermission$1.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                riderSafetyRepository$getSafetyTrackingPermission$1.serializer = i - Integer.MIN_VALUE;
            }
        }
        obj = riderSafetyRepository$getSafetyTrackingPermission$1.RemoteActionCompatParcelizer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = riderSafetyRepository$getSafetyTrackingPermission$1.serializer;
        shortNewsContentCardView = null;
        if (i2 != 0) {
            int i11 = serializer + 51;
            MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            getisclick2 = riderSafetyRepository$getSafetyTrackingPermission$1.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objValueOf = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getisclick = this.RemoteActionCompatParcelizer;
            if (getisclick.IconCompatParcelizer > System.currentTimeMillis()) {
                Boolean boolValueOf2 = Boolean.valueOf(getisclick.RemoteActionCompatParcelizer);
                int i13 = serializer + 5;
                MediaDescriptionCompat = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                return boolValueOf2;
            }
            r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer = ((r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U) this.read).RemoteActionCompatParcelizer.serializer();
            if (r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer != null) {
                l = new Long(r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer.read);
            } else {
                l = null;
            }
            if (l == null) {
                getisclick.RemoteActionCompatParcelizer = false;
                getisclick.IconCompatParcelizer = 0L;
                return false;
            }
            RiderSafetyRepository$getSentianceAuthCode$2 riderSafetyRepository$getSentianceAuthCode$3 = new RiderSafetyRepository$getSentianceAuthCode$2(this, l, shortNewsContentCardView, i5);
            riderSafetyRepository$getSafetyTrackingPermission$1.write = getisclick;
            riderSafetyRepository$getSafetyTrackingPermission$1.serializer = 1;
            objM4875invokegIAlus = this.IconCompatParcelizer.m4875invokegIAlus(riderSafetyRepository$getSentianceAuthCode$3, riderSafetyRepository$getSafetyTrackingPermission$1);
            if (objM4875invokegIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
            getisclick2 = getisclick;
            objValueOf = objM4875invokegIAlus;
        }
        if (!(objValueOf instanceof isItemDismissable)) {
            objValueOf = Boolean.valueOf(((getLastErrorCode) objValueOf).permissionGranted);
        }
        if (!(objValueOf instanceof isItemDismissable)) {
            getisclick2.RemoteActionCompatParcelizer = ((Boolean) objValueOf).booleanValue();
            getisclick2.IconCompatParcelizer = System.currentTimeMillis() + 3600000;
        }
        return objValueOf;
        riderSafetyRepository$getSafetyTrackingPermission$1 = new RiderSafetyRepository$getSafetyTrackingPermission$1(this, continuationImpl);
        obj = riderSafetyRepository$getSafetyTrackingPermission$1.RemoteActionCompatParcelizer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = riderSafetyRepository$getSafetyTrackingPermission$1.serializer;
        shortNewsContentCardView = null;
        if (i2 != 0) {
            int i15 = serializer + 51;
            MediaDescriptionCompat = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            getisclick2 = riderSafetyRepository$getSafetyTrackingPermission$1.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objValueOf = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getisclick = this.RemoteActionCompatParcelizer;
            if (getisclick.IconCompatParcelizer > System.currentTimeMillis()) {
                Boolean boolValueOf3 = Boolean.valueOf(getisclick.RemoteActionCompatParcelizer);
                int i17 = serializer + 5;
                MediaDescriptionCompat = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                return boolValueOf3;
            }
            r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer = ((r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U) this.read).RemoteActionCompatParcelizer.serializer();
            if (r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer != null) {
                l = new Long(r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer.read);
            } else {
                l = null;
            }
            if (l == null) {
                getisclick.RemoteActionCompatParcelizer = false;
                getisclick.IconCompatParcelizer = 0L;
                return false;
            }
            RiderSafetyRepository$getSentianceAuthCode$2 riderSafetyRepository$getSentianceAuthCode$4 = new RiderSafetyRepository$getSentianceAuthCode$2(this, l, shortNewsContentCardView, i5);
            riderSafetyRepository$getSafetyTrackingPermission$1.write = getisclick;
            riderSafetyRepository$getSafetyTrackingPermission$1.serializer = 1;
            objM4875invokegIAlus = this.IconCompatParcelizer.m4875invokegIAlus(riderSafetyRepository$getSentianceAuthCode$4, riderSafetyRepository$getSafetyTrackingPermission$1);
            if (objM4875invokegIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
            getisclick2 = getisclick;
            objValueOf = objM4875invokegIAlus;
        }
        if (!(objValueOf instanceof isItemDismissable)) {
            objValueOf = Boolean.valueOf(((getLastErrorCode) objValueOf).permissionGranted);
        }
        if (!(objValueOf instanceof isItemDismissable)) {
            getisclick2.RemoteActionCompatParcelizer = ((Boolean) objValueOf).booleanValue();
            getisclick2.IconCompatParcelizer = System.currentTimeMillis() + 3600000;
        }
        return objValueOf;
    }
}
