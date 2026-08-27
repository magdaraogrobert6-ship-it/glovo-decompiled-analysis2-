package com.roadrunner.rider.safety.permission.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.data.util.sharedPreferences.SharedPreferencesManagerImpl;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.createFromParcel;
import o.disableCoppaComplianceInDelay;
import o.eventDeduplicationIdExists;
import o.resetSessionAttributes;
import o.setEventDeduplicationIdsMaxSize;
import o.setSuffix;
import o.setWaitBeforeSendTimeSeconds;

/* JADX INFO: loaded from: classes3.dex */
public final class PermissionHistoryRepository {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final disableCoppaComplianceInDelay IconCompatParcelizer;
    public final setEventDeduplicationIdsMaxSize serializer;
    public final SharedPreferencesManagerImpl write;

    public PermissionHistoryRepository(SharedPreferencesManagerImpl sharedPreferencesManagerImpl, disableCoppaComplianceInDelay disablecoppacomplianceindelay, setEventDeduplicationIdsMaxSize seteventdeduplicationidsmaxsize) {
        sharedPreferencesManagerImpl.getClass();
        disablecoppacomplianceindelay.getClass();
        seteventdeduplicationidsmaxsize.getClass();
        this.write = sharedPreferencesManagerImpl;
        this.IconCompatParcelizer = disablecoppacomplianceindelay;
        this.serializer = seteventdeduplicationidsmaxsize;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public final Object isActivityRecognitionPermissionRequestedBefore(ContinuationImpl continuationImpl) {
        eventDeduplicationIdExists eventdeduplicationidexists;
        boolean zBooleanValue;
        int i = 2 % 2;
        if (continuationImpl instanceof eventDeduplicationIdExists) {
            int i2 = RemoteActionCompatParcelizer + 59;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            eventdeduplicationidexists = (eventDeduplicationIdExists) continuationImpl;
            int i4 = eventdeduplicationidexists.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = read + 99;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                eventdeduplicationidexists.read = i4 - Integer.MIN_VALUE;
            } else {
                eventdeduplicationidexists = new eventDeduplicationIdExists(this, continuationImpl);
            }
        } else {
            eventdeduplicationidexists = new eventDeduplicationIdExists(this, continuationImpl);
        }
        Object objWrite = eventdeduplicationidexists.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = eventdeduplicationidexists.read;
        if (i7 != 0) {
            int i8 = RemoteActionCompatParcelizer + 43;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWrite);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objWrite);
            eventdeduplicationidexists.read = 1;
            objWrite = this.write.write("is_activity_recognition_permission_requested_before", Boolean.TYPE, eventdeduplicationidexists);
            if (objWrite == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Boolean bool = (Boolean) objWrite;
        boolean z = false;
        if (bool != null) {
            int i10 = read + 33;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                zBooleanValue = bool.booleanValue();
                int i11 = 11 / 0;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            z = zBooleanValue;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    public final Object isBackgroundLocationPermissionRequestedBefore(ContinuationImpl continuationImpl) {
        resetSessionAttributes resetsessionattributes;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 31;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (continuationImpl instanceof resetSessionAttributes) {
            int i5 = i3 + 99;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            resetsessionattributes = (resetSessionAttributes) continuationImpl;
            int i7 = resetsessionattributes.read;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                resetsessionattributes.read = i7 - Integer.MIN_VALUE;
            } else {
                resetsessionattributes = new resetSessionAttributes(this, continuationImpl);
            }
        } else {
            resetsessionattributes = new resetSessionAttributes(this, continuationImpl);
        }
        Object objWrite = resetsessionattributes.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = resetsessionattributes.read;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWrite);
            resetsessionattributes.read = 1;
            objWrite = this.write.write("is_background_location_permission_requested_before", Boolean.TYPE, resetsessionattributes);
            if (objWrite == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWrite);
        }
        Boolean bool = (Boolean) objWrite;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object getPermissionRequestCount(ContinuationImpl continuationImpl) {
        setSuffix setsuffix;
        int i = 2 % 2;
        if (continuationImpl instanceof setSuffix) {
            setsuffix = (setSuffix) continuationImpl;
            int i2 = setsuffix.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                setsuffix.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
                int i3 = RemoteActionCompatParcelizer + 1;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            } else {
                setsuffix = new setSuffix(this, continuationImpl);
            }
        } else {
            setsuffix = new setSuffix(this, continuationImpl);
        }
        Object objWrite = setsuffix.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = setsuffix.RemoteActionCompatParcelizer;
        if (i5 != 0) {
            int i6 = RemoteActionCompatParcelizer + 61;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0 ? i5 != 1 : i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWrite);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objWrite);
            setsuffix.RemoteActionCompatParcelizer = 1;
            objWrite = this.write.write("rider_safety_permission_request_count", Integer.TYPE, setsuffix);
            if (objWrite == coroutineSingletons) {
                int i7 = RemoteActionCompatParcelizer + 7;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return coroutineSingletons;
            }
        }
        Integer num = (Integer) objWrite;
        return new Integer(num != null ? num.intValue() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if (r6.store(r3, r7, r1) == r2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object incrementPermissionRequestCount(kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r9 instanceof o.addDeduplicationId
            if (r1 == 0) goto L16
            r1 = r9
            o.addDeduplicationId r1 = (o.addDeduplicationId) r1
            int r2 = r1.write
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 + r3
            r1.write = r2
            goto L24
        L16:
            o.addDeduplicationId r1 = new o.addDeduplicationId
            r1.<init>(r8, r9)
            int r9 = com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository.RemoteActionCompatParcelizer
            int r9 = r9 + 69
            int r2 = r9 % 128
            com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository.read = r2
            int r9 = r9 % r0
        L24:
            java.lang.Object r9 = r1.serializer
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.write
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L5f
            if (r3 == r4) goto L57
            if (r3 != r0) goto L51
            int r1 = com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository.RemoteActionCompatParcelizer
            int r1 = r1 + 83
            int r2 = r1 % 128
            com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository.read = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L4a
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            int r9 = com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository.read
            int r9 = r9 + 63
            int r1 = r9 % 128
            com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository.RemoteActionCompatParcelizer = r1
            int r9 = r9 % r0
            goto L8c
        L4a:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            r5.hashCode()
            throw r5
        L51:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            return r5
        L57:
            java.lang.String r3 = r1.IconCompatParcelizer
            com.data.util.sharedPreferences.SharedPreferencesManagerImpl r6 = r1.RemoteActionCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L73
        L5f:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            com.data.util.sharedPreferences.SharedPreferencesManagerImpl r6 = r8.write
            r1.RemoteActionCompatParcelizer = r6
            java.lang.String r3 = "rider_safety_permission_request_count"
            r1.IconCompatParcelizer = r3
            r1.write = r4
            java.lang.Object r9 = r8.getPermissionRequestCount(r1)
            if (r9 != r2) goto L73
            goto L8b
        L73:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Integer r7 = new java.lang.Integer
            int r9 = r9 + r4
            r7.<init>(r9)
            r1.RemoteActionCompatParcelizer = r5
            r1.IconCompatParcelizer = r5
            r1.write = r0
            java.lang.Object r9 = r6.store(r3, r7, r1)
            if (r9 != r2) goto L8c
        L8b:
            return r2
        L8c:
            o.createFromParcel r9 = o.createFromParcel.INSTANCE
            int r1 = com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository.read
            int r1 = r1 + 121
            int r2 = r1 % 128
            com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository.incrementPermissionRequestCount(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    public final Object invalidate(ContinuationImpl continuationImpl) {
        setWaitBeforeSendTimeSeconds setwaitbeforesendtimeseconds;
        int i = 2 % 2;
        if (continuationImpl instanceof setWaitBeforeSendTimeSeconds) {
            int i2 = RemoteActionCompatParcelizer + 23;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = ((setWaitBeforeSendTimeSeconds) continuationImpl).IconCompatParcelizer;
                throw null;
            }
            setwaitbeforesendtimeseconds = (setWaitBeforeSendTimeSeconds) continuationImpl;
            int i4 = setwaitbeforesendtimeseconds.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                setwaitbeforesendtimeseconds.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                setwaitbeforesendtimeseconds = new setWaitBeforeSendTimeSeconds(this, continuationImpl);
                int i5 = read + 81;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        } else {
            setwaitbeforesendtimeseconds = new setWaitBeforeSendTimeSeconds(this, continuationImpl);
            int i7 = read + 81;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        Object obj = setwaitbeforesendtimeseconds.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = setwaitbeforesendtimeseconds.IconCompatParcelizer;
        SharedPreferencesManagerImpl sharedPreferencesManagerImpl = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (!this.IconCompatParcelizer.IconCompatParcelizer()) {
                setwaitbeforesendtimeseconds.IconCompatParcelizer = 1;
                Object objStore = sharedPreferencesManagerImpl.store("is_background_location_permission_requested_before", Boolean.FALSE, setwaitbeforesendtimeseconds);
                if (objStore != coroutineSingletons) {
                    objStore = createfromparcel;
                }
                if (objStore == coroutineSingletons) {
                    int i10 = RemoteActionCompatParcelizer + 33;
                    read = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                }
            }
            return coroutineSingletons;
        }
        if (i9 != 1) {
            int i12 = RemoteActionCompatParcelizer + 75;
            read = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0 ? i9 != 2 : i9 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (!this.serializer.write()) {
            setwaitbeforesendtimeseconds.IconCompatParcelizer = 2;
            Object objStore2 = sharedPreferencesManagerImpl.store("is_activity_recognition_permission_requested_before", Boolean.FALSE, setwaitbeforesendtimeseconds);
            if (objStore2 != coroutineSingletons) {
                int i13 = read + 45;
                RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                objStore2 = createfromparcel;
            }
            if (objStore2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return createfromparcel;
    }
}
