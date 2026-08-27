package com.roadrunner.localPushNotifications.smartPolling.domain;

import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.riemann.location.common.utils.Constant;
import com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptNotificationMapperImpl;
import com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptRequestManagerImpl;
import com.roadrunner.delivery.accept.domain.AutoAcceptDeliveryImpl;
import com.roadrunner.delivery.accept.domain.StoreAutoAcceptedDeliveryIdsImpl;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AndroidUiFrameClock;
import o.InlineClassHelper_jvmKt;
import o.SaversKtExternalSyntheticLambda0;
import o.TextMotionLinearitySaverlambda0;
import o.ViewPager2SavedState1;
import o.checkAdjustAdRevenue;
import o.checkEventI;
import o.checkForInstallReferrerInfo;
import o.checkForPreinstallI;
import o.copyNs73l9sdefault;
import o.createDeeplinkIntentI;
import o.deleteEventMetadata;
import o.deleteGlobalCallbackParameters;
import o.getQueryParameterslambda2;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCarryoverInAppMessage;
import o.setUserInputEnabled;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoAcceptLocalPushHandlerImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat = 0;
    private static int ParcelableVolumeInfo = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public static final String read = SaversKtExternalSyntheticLambda0.BACKGROUND.getValue();
    public final isAdapterPositionOnScreen IconCompatParcelizer = new isAdapterPositionOnScreen(new NetworkingCoreModule$$ExternalSyntheticLambda2(1, this));
    public final StoreAutoAcceptedDeliveryIdsImpl MediaMetadataCompat;
    public final AutoAcceptDeliveryImpl MediaSessionCompatQueueItem;
    public final TextMotionLinearitySaverlambda0 RatingCompat;
    public final AutoAcceptRequestManagerImpl RemoteActionCompatParcelizer;
    public final AutoAcceptNotificationMapperImpl serializer;
    public final ViewPager2SavedState1 write;

    static {
        int i = MediaBrowserCompatMediaItem + 51;
        MediaDescriptionCompat = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public AutoAcceptLocalPushHandlerImpl(ViewPager2SavedState1 viewPager2SavedState1, AutoAcceptDeliveryImpl autoAcceptDeliveryImpl, AndroidUiFrameClock androidUiFrameClock, AutoAcceptNotificationMapperImpl autoAcceptNotificationMapperImpl, StoreAutoAcceptedDeliveryIdsImpl storeAutoAcceptedDeliveryIdsImpl, TextMotionLinearitySaverlambda0 textMotionLinearitySaverlambda0, AutoAcceptRequestManagerImpl autoAcceptRequestManagerImpl) {
        this.write = viewPager2SavedState1;
        this.MediaSessionCompatQueueItem = autoAcceptDeliveryImpl;
        this.serializer = autoAcceptNotificationMapperImpl;
        this.MediaMetadataCompat = storeAutoAcceptedDeliveryIdsImpl;
        this.RatingCompat = textMotionLinearitySaverlambda0;
        this.RemoteActionCompatParcelizer = autoAcceptRequestManagerImpl;
    }

    public final checkAdjustAdRevenue read(String str, List list) {
        int i = 2 % 2;
        deleteGlobalCallbackParameters deleteglobalcallbackparameters = new deleteGlobalCallbackParameters(Constant.ERROR_UNKNOWN, "", "", createDeeplinkIntentI.OPEN_APP);
        isAdapterPositionOnScreen isadapterpositiononscreen = this.IconCompatParcelizer;
        checkEventI checkeventi = new checkEventI(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.foodora.courier.", (String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()), "High priority auto accept local", (String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), 65280, null, checkForPreinstallI.HIGH);
        Long l = (Long) onContentCardDismissed.MediaMetadataCompat(list);
        String strValueOf = null;
        if (l != null) {
            int i2 = ParcelableVolumeInfo + 27;
            PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                strValueOf = String.valueOf(l.longValue());
                int i3 = ParcelableVolumeInfo + 25;
                PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            } else {
                String.valueOf(l.longValue());
                strValueOf.hashCode();
                throw null;
            }
        }
        return new checkAdjustAdRevenue(deleteglobalcallbackparameters, checkeventi, new checkForInstallReferrerInfo(strValueOf, "0", "0", "route_changed", str, true, ff$$ExternalSyntheticOutline0.m("{\"category\":\"", str, "\",\"message_new_id\":\"0\"}"), null, null, null), deleteEventMetadata.Local);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0089 A[PHI: r1 r12
  0x0089: PHI (r1v20 java.lang.Object) = (r1v12 java.lang.Object), (r1v31 java.lang.Object) binds: [B:43:0x0128, B:19:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x0089: PHI (r12v4 java.lang.String) = (r12v2 java.lang.String), (r12v5 java.lang.String) binds: [B:43:0x0128, B:19:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x0118 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0119  */
    /* JADX WARN: Code duplicated, block: B:47:0x0131  */
    /* JADX WARN: Code duplicated, block: B:50:0x014b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0151  */
    /* JADX WARN: Code duplicated, block: B:56:0x0161  */
    /* JADX WARN: Code duplicated, block: B:62:0x0172  */
    /* JADX WARN: Code duplicated, block: B:65:0x0177 A[PHI: r1 r2 r5
  0x0177: PHI (r1v38 java.lang.Object) = (r1v35 java.lang.Object), (r1v1 java.lang.Object) binds: [B:63:0x0173, B:17:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x0177: PHI (r2v8 o.copyNs73l9sdefault) = (r2v5 o.copyNs73l9sdefault), (r2v10 o.copyNs73l9sdefault) binds: [B:63:0x0173, B:17:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x0177: PHI (r5v13 java.lang.String) = (r5v11 java.lang.String), (r5v15 java.lang.String) binds: [B:63:0x0173, B:17:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0193  */
    /* JADX WARN: Code duplicated, block: B:72:0x01af A[PHI: r2 r5 r6
  0x01af: PHI (r2v13 java.util.List) = (r2v11 java.util.List), (r2v15 java.util.List) binds: [B:70:0x01ac, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x01af: PHI (r5v20 o.copyNs73l9sdefault) = (r5v16 o.copyNs73l9sdefault), (r5v23 o.copyNs73l9sdefault) binds: [B:70:0x01ac, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x01af: PHI (r6v15 java.lang.String) = (r6v13 java.lang.String), (r6v16 java.lang.String) binds: [B:70:0x01ac, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x01c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:85:0x020a  */
    public final Object invoke(String str, String str2, ContinuationImpl continuationImpl) {
        setUserInputEnabled setuserinputenabled;
        String str3;
        String str4;
        Object objM4899autoAcceptDelivery0E7RQCE;
        Long lParcelableVolumeInfo;
        Object objInvoke;
        Object obj;
        Object obj2;
        String str5;
        Object obj3;
        String str6;
        copyNs73l9sdefault copyns73l9sdefault;
        InlineClassHelper_jvmKt inlineClassHelper_jvmKtSerializer;
        List list;
        String str7;
        copyNs73l9sdefault copyns73l9sdefault2;
        List list2;
        Object objInvoke2;
        Object objInvoke3;
        int i;
        int i2 = 2 % 2;
        if (continuationImpl instanceof setUserInputEnabled) {
            setuserinputenabled = (setUserInputEnabled) continuationImpl;
            int i3 = setuserinputenabled.MediaMetadataCompat;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = PlaybackStateCompatCustomAction + 91;
                ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                setuserinputenabled.MediaMetadataCompat = i3 - Integer.MIN_VALUE;
            } else {
                setuserinputenabled = new setUserInputEnabled(this, continuationImpl);
            }
        } else {
            setuserinputenabled = new setUserInputEnabled(this, continuationImpl);
        }
        Object objIconCompatParcelizer = setuserinputenabled.MediaBrowserCompatMediaItem;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = setuserinputenabled.MediaMetadataCompat;
        List list3 = instance_delegatelambda0.write;
        AutoAcceptRequestManagerImpl autoAcceptRequestManagerImpl = this.RemoteActionCompatParcelizer;
        AutoAcceptNotificationMapperImpl autoAcceptNotificationMapperImpl = this.serializer;
        switch (i6) {
            case 0:
                ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
                setuserinputenabled.RemoteActionCompatParcelizer = str;
                str3 = str2;
                setuserinputenabled.read = str3;
                setuserinputenabled.MediaMetadataCompat = 1;
                Object objCanPerformRequest = autoAcceptRequestManagerImpl.canPerformRequest(setuserinputenabled);
                if (objCanPerformRequest == coroutineSingletons) {
                    int i7 = PlaybackStateCompatCustomAction + 97;
                    ParcelableVolumeInfo = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                } else {
                    str4 = str;
                    objIconCompatParcelizer = objCanPerformRequest;
                    if (!((Boolean) objIconCompatParcelizer).booleanValue()) {
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Auto-accept local push: Request blocked by request manager", new Object[0]);
                        if (str3 != null) {
                            lParcelableVolumeInfo = setCarryoverInAppMessage.ParcelableVolumeInfo(str3);
                        } else {
                            lParcelableVolumeInfo = null;
                        }
                        if (lParcelableVolumeInfo != null) {
                            int i9 = PlaybackStateCompatCustomAction + 75;
                            ParcelableVolumeInfo = i9 % Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                            list3 = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{lParcelableVolumeInfo}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                        }
                        checkAdjustAdRevenue checkadjustadrevenue = read(str4, list3);
                        setuserinputenabled.RemoteActionCompatParcelizer = null;
                        setuserinputenabled.read = null;
                        setuserinputenabled.serializer = null;
                        setuserinputenabled.MediaMetadataCompat = 2;
                        objInvoke = autoAcceptNotificationMapperImpl.invoke(null, checkadjustadrevenue, setuserinputenabled, true);
                        if (objInvoke == coroutineSingletons) {
                            return objInvoke;
                        }
                    } else {
                        setuserinputenabled.RemoteActionCompatParcelizer = str4;
                        setuserinputenabled.read = null;
                        setuserinputenabled.MediaMetadataCompat = 3;
                        objM4899autoAcceptDelivery0E7RQCE = this.MediaSessionCompatQueueItem.m4899autoAcceptDelivery0E7RQCE(str4, read, setuserinputenabled);
                        if (objM4899autoAcceptDelivery0E7RQCE != coroutineSingletons) {
                            obj2 = objM4899autoAcceptDelivery0E7RQCE;
                            if (!(obj2 instanceof isItemDismissable)) {
                                int i11 = PlaybackStateCompatCustomAction + 117;
                                ParcelableVolumeInfo = i11 % Fields.SpotShadowColor;
                                int i12 = i11 % 2;
                                setuserinputenabled.RemoteActionCompatParcelizer = str4;
                                setuserinputenabled.read = null;
                                setuserinputenabled.serializer = obj2;
                                setuserinputenabled.MediaMetadataCompat = 4;
                                if (autoAcceptRequestManagerImpl.setRequestRunning(setuserinputenabled) != coroutineSingletons) {
                                    obj3 = obj2;
                                    str6 = str4;
                                    if (obj3 instanceof isItemDismissable) {
                                        obj3 = null;
                                    }
                                    copyns73l9sdefault = (copyNs73l9sdefault) obj3;
                                    setuserinputenabled.RemoteActionCompatParcelizer = str6;
                                    setuserinputenabled.read = null;
                                    setuserinputenabled.serializer = null;
                                    setuserinputenabled.write = copyns73l9sdefault;
                                    setuserinputenabled.MediaMetadataCompat = 5;
                                    if (copyns73l9sdefault != null || (inlineClassHelper_jvmKtSerializer = copyns73l9sdefault.serializer()) == null || (objIconCompatParcelizer = inlineClassHelper_jvmKtSerializer.IconCompatParcelizer()) == null) {
                                        objIconCompatParcelizer = list3;
                                    }
                                    if (objIconCompatParcelizer != coroutineSingletons) {
                                        list = (List) objIconCompatParcelizer;
                                        setuserinputenabled.RemoteActionCompatParcelizer = str6;
                                        setuserinputenabled.read = null;
                                        setuserinputenabled.serializer = null;
                                        setuserinputenabled.write = copyns73l9sdefault;
                                        setuserinputenabled.IconCompatParcelizer = list;
                                        setuserinputenabled.MediaMetadataCompat = 6;
                                        if (this.MediaMetadataCompat.invoke(list, setuserinputenabled) != coroutineSingletons) {
                                            str7 = str6;
                                            copyns73l9sdefault2 = copyns73l9sdefault;
                                            list2 = list;
                                            setuserinputenabled.RemoteActionCompatParcelizer = str7;
                                            setuserinputenabled.read = null;
                                            setuserinputenabled.serializer = null;
                                            setuserinputenabled.write = copyns73l9sdefault2;
                                            setuserinputenabled.IconCompatParcelizer = list2;
                                            setuserinputenabled.MediaMetadataCompat = 7;
                                            if (this.RatingCompat.serializer(copyns73l9sdefault2, setuserinputenabled) != coroutineSingletons) {
                                                checkAdjustAdRevenue checkadjustadrevenue2 = read(str7, list2);
                                                setuserinputenabled.RemoteActionCompatParcelizer = null;
                                                setuserinputenabled.read = null;
                                                setuserinputenabled.serializer = null;
                                                setuserinputenabled.write = null;
                                                setuserinputenabled.IconCompatParcelizer = null;
                                                setuserinputenabled.MediaMetadataCompat = 8;
                                                objInvoke2 = autoAcceptNotificationMapperImpl.invoke(copyns73l9sdefault2, checkadjustadrevenue2, setuserinputenabled, false);
                                                if (objInvoke2 == coroutineSingletons) {
                                                    return objInvoke2;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                setuserinputenabled.RemoteActionCompatParcelizer = str4;
                                setuserinputenabled.read = null;
                                setuserinputenabled.serializer = obj2;
                                setuserinputenabled.MediaMetadataCompat = 9;
                                if (autoAcceptRequestManagerImpl.setRequestRunning(setuserinputenabled) != coroutineSingletons) {
                                    str5 = str4;
                                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(onItemDismiss.serializer(obj2), "Failed to auto accept delivery", new Object[0]);
                                    checkAdjustAdRevenue checkadjustadrevenue3 = read(str5, list3);
                                    setuserinputenabled.RemoteActionCompatParcelizer = null;
                                    setuserinputenabled.read = null;
                                    setuserinputenabled.serializer = null;
                                    setuserinputenabled.write = null;
                                    setuserinputenabled.MediaMetadataCompat = 10;
                                    objInvoke3 = autoAcceptNotificationMapperImpl.invoke(null, checkadjustadrevenue3, setuserinputenabled, false);
                                    if (objInvoke3 != coroutineSingletons) {
                                        i = ParcelableVolumeInfo + 21;
                                        PlaybackStateCompatCustomAction = i % Fields.SpotShadowColor;
                                        if (i % 2 == 0) {
                                            int i13 = 86 / 0;
                                        }
                                        return objInvoke3;
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                str3 = setuserinputenabled.read;
                str4 = setuserinputenabled.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
                if (!((Boolean) objIconCompatParcelizer).booleanValue()) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Auto-accept local push: Request blocked by request manager", new Object[0]);
                    if (str3 != null) {
                        lParcelableVolumeInfo = setCarryoverInAppMessage.ParcelableVolumeInfo(str3);
                    } else {
                        lParcelableVolumeInfo = null;
                    }
                    if (lParcelableVolumeInfo != null) {
                        int i14 = PlaybackStateCompatCustomAction + 75;
                        ParcelableVolumeInfo = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        list3 = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{lParcelableVolumeInfo}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                    }
                    checkAdjustAdRevenue checkadjustadrevenue4 = read(str4, list3);
                    setuserinputenabled.RemoteActionCompatParcelizer = null;
                    setuserinputenabled.read = null;
                    setuserinputenabled.serializer = null;
                    setuserinputenabled.MediaMetadataCompat = 2;
                    objInvoke = autoAcceptNotificationMapperImpl.invoke(null, checkadjustadrevenue4, setuserinputenabled, true);
                    if (objInvoke == coroutineSingletons) {
                        return objInvoke;
                    }
                } else {
                    setuserinputenabled.RemoteActionCompatParcelizer = str4;
                    setuserinputenabled.read = null;
                    setuserinputenabled.MediaMetadataCompat = 3;
                    objM4899autoAcceptDelivery0E7RQCE = this.MediaSessionCompatQueueItem.m4899autoAcceptDelivery0E7RQCE(str4, read, setuserinputenabled);
                    if (objM4899autoAcceptDelivery0E7RQCE != coroutineSingletons) {
                        obj2 = objM4899autoAcceptDelivery0E7RQCE;
                        if (!(obj2 instanceof isItemDismissable)) {
                            int i16 = PlaybackStateCompatCustomAction + 117;
                            ParcelableVolumeInfo = i16 % Fields.SpotShadowColor;
                            int i17 = i16 % 2;
                            setuserinputenabled.RemoteActionCompatParcelizer = str4;
                            setuserinputenabled.read = null;
                            setuserinputenabled.serializer = obj2;
                            setuserinputenabled.MediaMetadataCompat = 4;
                            if (autoAcceptRequestManagerImpl.setRequestRunning(setuserinputenabled) != coroutineSingletons) {
                                obj3 = obj2;
                                str6 = str4;
                                if (obj3 instanceof isItemDismissable) {
                                    obj3 = null;
                                }
                                copyns73l9sdefault = (copyNs73l9sdefault) obj3;
                                setuserinputenabled.RemoteActionCompatParcelizer = str6;
                                setuserinputenabled.read = null;
                                setuserinputenabled.serializer = null;
                                setuserinputenabled.write = copyns73l9sdefault;
                                setuserinputenabled.MediaMetadataCompat = 5;
                                if (copyns73l9sdefault != null) {
                                    objIconCompatParcelizer = list3;
                                } else {
                                    objIconCompatParcelizer = list3;
                                }
                                if (objIconCompatParcelizer != coroutineSingletons) {
                                    list = (List) objIconCompatParcelizer;
                                    setuserinputenabled.RemoteActionCompatParcelizer = str6;
                                    setuserinputenabled.read = null;
                                    setuserinputenabled.serializer = null;
                                    setuserinputenabled.write = copyns73l9sdefault;
                                    setuserinputenabled.IconCompatParcelizer = list;
                                    setuserinputenabled.MediaMetadataCompat = 6;
                                    if (this.MediaMetadataCompat.invoke(list, setuserinputenabled) != coroutineSingletons) {
                                        str7 = str6;
                                        copyns73l9sdefault2 = copyns73l9sdefault;
                                        list2 = list;
                                        setuserinputenabled.RemoteActionCompatParcelizer = str7;
                                        setuserinputenabled.read = null;
                                        setuserinputenabled.serializer = null;
                                        setuserinputenabled.write = copyns73l9sdefault2;
                                        setuserinputenabled.IconCompatParcelizer = list2;
                                        setuserinputenabled.MediaMetadataCompat = 7;
                                        if (this.RatingCompat.serializer(copyns73l9sdefault2, setuserinputenabled) != coroutineSingletons) {
                                            checkAdjustAdRevenue checkadjustadrevenue5 = read(str7, list2);
                                            setuserinputenabled.RemoteActionCompatParcelizer = null;
                                            setuserinputenabled.read = null;
                                            setuserinputenabled.serializer = null;
                                            setuserinputenabled.write = null;
                                            setuserinputenabled.IconCompatParcelizer = null;
                                            setuserinputenabled.MediaMetadataCompat = 8;
                                            objInvoke2 = autoAcceptNotificationMapperImpl.invoke(copyns73l9sdefault2, checkadjustadrevenue5, setuserinputenabled, false);
                                            if (objInvoke2 == coroutineSingletons) {
                                                return objInvoke2;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            setuserinputenabled.RemoteActionCompatParcelizer = str4;
                            setuserinputenabled.read = null;
                            setuserinputenabled.serializer = obj2;
                            setuserinputenabled.MediaMetadataCompat = 9;
                            if (autoAcceptRequestManagerImpl.setRequestRunning(setuserinputenabled) != coroutineSingletons) {
                                str5 = str4;
                                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(onItemDismiss.serializer(obj2), "Failed to auto accept delivery", new Object[0]);
                                checkAdjustAdRevenue checkadjustadrevenue6 = read(str5, list3);
                                setuserinputenabled.RemoteActionCompatParcelizer = null;
                                setuserinputenabled.read = null;
                                setuserinputenabled.serializer = null;
                                setuserinputenabled.write = null;
                                setuserinputenabled.MediaMetadataCompat = 10;
                                objInvoke3 = autoAcceptNotificationMapperImpl.invoke(null, checkadjustadrevenue6, setuserinputenabled, false);
                                if (objInvoke3 != coroutineSingletons) {
                                    i = ParcelableVolumeInfo + 21;
                                    PlaybackStateCompatCustomAction = i % Fields.SpotShadowColor;
                                    if (i % 2 == 0) {
                                        int i18 = 86 / 0;
                                    }
                                    return objInvoke3;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                obj = setuserinputenabled.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
                return objIconCompatParcelizer;
            case 3:
                String str8 = setuserinputenabled.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
                objM4899autoAcceptDelivery0E7RQCE = ((onItemDismiss) objIconCompatParcelizer).IconCompatParcelizer;
                str4 = str8;
                obj2 = objM4899autoAcceptDelivery0E7RQCE;
                if (!(obj2 instanceof isItemDismissable)) {
                    int i19 = PlaybackStateCompatCustomAction + 117;
                    ParcelableVolumeInfo = i19 % Fields.SpotShadowColor;
                    int i110 = i19 % 2;
                    setuserinputenabled.RemoteActionCompatParcelizer = str4;
                    setuserinputenabled.read = null;
                    setuserinputenabled.serializer = obj2;
                    setuserinputenabled.MediaMetadataCompat = 4;
                    if (autoAcceptRequestManagerImpl.setRequestRunning(setuserinputenabled) != coroutineSingletons) {
                        obj3 = obj2;
                        str6 = str4;
                        if (obj3 instanceof isItemDismissable) {
                            obj3 = null;
                        }
                        copyns73l9sdefault = (copyNs73l9sdefault) obj3;
                        setuserinputenabled.RemoteActionCompatParcelizer = str6;
                        setuserinputenabled.read = null;
                        setuserinputenabled.serializer = null;
                        setuserinputenabled.write = copyns73l9sdefault;
                        setuserinputenabled.MediaMetadataCompat = 5;
                        if (copyns73l9sdefault != null) {
                            objIconCompatParcelizer = list3;
                        } else {
                            objIconCompatParcelizer = list3;
                        }
                        if (objIconCompatParcelizer != coroutineSingletons) {
                            list = (List) objIconCompatParcelizer;
                            setuserinputenabled.RemoteActionCompatParcelizer = str6;
                            setuserinputenabled.read = null;
                            setuserinputenabled.serializer = null;
                            setuserinputenabled.write = copyns73l9sdefault;
                            setuserinputenabled.IconCompatParcelizer = list;
                            setuserinputenabled.MediaMetadataCompat = 6;
                            if (this.MediaMetadataCompat.invoke(list, setuserinputenabled) != coroutineSingletons) {
                                str7 = str6;
                                copyns73l9sdefault2 = copyns73l9sdefault;
                                list2 = list;
                                setuserinputenabled.RemoteActionCompatParcelizer = str7;
                                setuserinputenabled.read = null;
                                setuserinputenabled.serializer = null;
                                setuserinputenabled.write = copyns73l9sdefault2;
                                setuserinputenabled.IconCompatParcelizer = list2;
                                setuserinputenabled.MediaMetadataCompat = 7;
                                if (this.RatingCompat.serializer(copyns73l9sdefault2, setuserinputenabled) != coroutineSingletons) {
                                    checkAdjustAdRevenue checkadjustadrevenue7 = read(str7, list2);
                                    setuserinputenabled.RemoteActionCompatParcelizer = null;
                                    setuserinputenabled.read = null;
                                    setuserinputenabled.serializer = null;
                                    setuserinputenabled.write = null;
                                    setuserinputenabled.IconCompatParcelizer = null;
                                    setuserinputenabled.MediaMetadataCompat = 8;
                                    objInvoke2 = autoAcceptNotificationMapperImpl.invoke(copyns73l9sdefault2, checkadjustadrevenue7, setuserinputenabled, false);
                                    if (objInvoke2 == coroutineSingletons) {
                                        return objInvoke2;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    setuserinputenabled.RemoteActionCompatParcelizer = str4;
                    setuserinputenabled.read = null;
                    setuserinputenabled.serializer = obj2;
                    setuserinputenabled.MediaMetadataCompat = 9;
                    if (autoAcceptRequestManagerImpl.setRequestRunning(setuserinputenabled) != coroutineSingletons) {
                        str5 = str4;
                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(onItemDismiss.serializer(obj2), "Failed to auto accept delivery", new Object[0]);
                        checkAdjustAdRevenue checkadjustadrevenue8 = read(str5, list3);
                        setuserinputenabled.RemoteActionCompatParcelizer = null;
                        setuserinputenabled.read = null;
                        setuserinputenabled.serializer = null;
                        setuserinputenabled.write = null;
                        setuserinputenabled.MediaMetadataCompat = 10;
                        objInvoke3 = autoAcceptNotificationMapperImpl.invoke(null, checkadjustadrevenue8, setuserinputenabled, false);
                        if (objInvoke3 != coroutineSingletons) {
                            i = ParcelableVolumeInfo + 21;
                            PlaybackStateCompatCustomAction = i % Fields.SpotShadowColor;
                            if (i % 2 == 0) {
                                int i111 = 86 / 0;
                            }
                            return objInvoke3;
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                obj3 = setuserinputenabled.serializer;
                str6 = setuserinputenabled.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
                if (obj3 instanceof isItemDismissable) {
                    obj3 = null;
                }
                copyns73l9sdefault = (copyNs73l9sdefault) obj3;
                setuserinputenabled.RemoteActionCompatParcelizer = str6;
                setuserinputenabled.read = null;
                setuserinputenabled.serializer = null;
                setuserinputenabled.write = copyns73l9sdefault;
                setuserinputenabled.MediaMetadataCompat = 5;
                if (copyns73l9sdefault != null) {
                    objIconCompatParcelizer = list3;
                } else {
                    objIconCompatParcelizer = list3;
                }
                if (objIconCompatParcelizer != coroutineSingletons) {
                    list = (List) objIconCompatParcelizer;
                    setuserinputenabled.RemoteActionCompatParcelizer = str6;
                    setuserinputenabled.read = null;
                    setuserinputenabled.serializer = null;
                    setuserinputenabled.write = copyns73l9sdefault;
                    setuserinputenabled.IconCompatParcelizer = list;
                    setuserinputenabled.MediaMetadataCompat = 6;
                    if (this.MediaMetadataCompat.invoke(list, setuserinputenabled) != coroutineSingletons) {
                        str7 = str6;
                        copyns73l9sdefault2 = copyns73l9sdefault;
                        list2 = list;
                        setuserinputenabled.RemoteActionCompatParcelizer = str7;
                        setuserinputenabled.read = null;
                        setuserinputenabled.serializer = null;
                        setuserinputenabled.write = copyns73l9sdefault2;
                        setuserinputenabled.IconCompatParcelizer = list2;
                        setuserinputenabled.MediaMetadataCompat = 7;
                        if (this.RatingCompat.serializer(copyns73l9sdefault2, setuserinputenabled) != coroutineSingletons) {
                            checkAdjustAdRevenue checkadjustadrevenue9 = read(str7, list2);
                            setuserinputenabled.RemoteActionCompatParcelizer = null;
                            setuserinputenabled.read = null;
                            setuserinputenabled.serializer = null;
                            setuserinputenabled.write = null;
                            setuserinputenabled.IconCompatParcelizer = null;
                            setuserinputenabled.MediaMetadataCompat = 8;
                            objInvoke2 = autoAcceptNotificationMapperImpl.invoke(copyns73l9sdefault2, checkadjustadrevenue9, setuserinputenabled, false);
                            if (objInvoke2 == coroutineSingletons) {
                                return objInvoke2;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 5:
                copyns73l9sdefault = setuserinputenabled.write;
                str6 = setuserinputenabled.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
                list = (List) objIconCompatParcelizer;
                setuserinputenabled.RemoteActionCompatParcelizer = str6;
                setuserinputenabled.read = null;
                setuserinputenabled.serializer = null;
                setuserinputenabled.write = copyns73l9sdefault;
                setuserinputenabled.IconCompatParcelizer = list;
                setuserinputenabled.MediaMetadataCompat = 6;
                if (this.MediaMetadataCompat.invoke(list, setuserinputenabled) != coroutineSingletons) {
                    str7 = str6;
                    copyns73l9sdefault2 = copyns73l9sdefault;
                    list2 = list;
                    setuserinputenabled.RemoteActionCompatParcelizer = str7;
                    setuserinputenabled.read = null;
                    setuserinputenabled.serializer = null;
                    setuserinputenabled.write = copyns73l9sdefault2;
                    setuserinputenabled.IconCompatParcelizer = list2;
                    setuserinputenabled.MediaMetadataCompat = 7;
                    if (this.RatingCompat.serializer(copyns73l9sdefault2, setuserinputenabled) != coroutineSingletons) {
                        checkAdjustAdRevenue checkadjustadrevenue10 = read(str7, list2);
                        setuserinputenabled.RemoteActionCompatParcelizer = null;
                        setuserinputenabled.read = null;
                        setuserinputenabled.serializer = null;
                        setuserinputenabled.write = null;
                        setuserinputenabled.IconCompatParcelizer = null;
                        setuserinputenabled.MediaMetadataCompat = 8;
                        objInvoke2 = autoAcceptNotificationMapperImpl.invoke(copyns73l9sdefault2, checkadjustadrevenue10, setuserinputenabled, false);
                        if (objInvoke2 == coroutineSingletons) {
                            return objInvoke2;
                        }
                    }
                }
                return coroutineSingletons;
            case 6:
                list2 = setuserinputenabled.IconCompatParcelizer;
                copyns73l9sdefault2 = setuserinputenabled.write;
                str7 = setuserinputenabled.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
                setuserinputenabled.RemoteActionCompatParcelizer = str7;
                setuserinputenabled.read = null;
                setuserinputenabled.serializer = null;
                setuserinputenabled.write = copyns73l9sdefault2;
                setuserinputenabled.IconCompatParcelizer = list2;
                setuserinputenabled.MediaMetadataCompat = 7;
                if (this.RatingCompat.serializer(copyns73l9sdefault2, setuserinputenabled) != coroutineSingletons) {
                    checkAdjustAdRevenue checkadjustadrevenue11 = read(str7, list2);
                    setuserinputenabled.RemoteActionCompatParcelizer = null;
                    setuserinputenabled.read = null;
                    setuserinputenabled.serializer = null;
                    setuserinputenabled.write = null;
                    setuserinputenabled.IconCompatParcelizer = null;
                    setuserinputenabled.MediaMetadataCompat = 8;
                    objInvoke2 = autoAcceptNotificationMapperImpl.invoke(copyns73l9sdefault2, checkadjustadrevenue11, setuserinputenabled, false);
                    if (objInvoke2 == coroutineSingletons) {
                        return objInvoke2;
                    }
                }
                return coroutineSingletons;
            case 7:
                list2 = setuserinputenabled.IconCompatParcelizer;
                copyns73l9sdefault2 = setuserinputenabled.write;
                str7 = setuserinputenabled.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
                checkAdjustAdRevenue checkadjustadrevenue12 = read(str7, list2);
                setuserinputenabled.RemoteActionCompatParcelizer = null;
                setuserinputenabled.read = null;
                setuserinputenabled.serializer = null;
                setuserinputenabled.write = null;
                setuserinputenabled.IconCompatParcelizer = null;
                setuserinputenabled.MediaMetadataCompat = 8;
                objInvoke2 = autoAcceptNotificationMapperImpl.invoke(copyns73l9sdefault2, checkadjustadrevenue12, setuserinputenabled, false);
                if (objInvoke2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return objInvoke2;
            case 8:
                List list4 = setuserinputenabled.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
                return objIconCompatParcelizer;
            case 9:
                obj2 = setuserinputenabled.serializer;
                str5 = setuserinputenabled.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(onItemDismiss.serializer(obj2), "Failed to auto accept delivery", new Object[0]);
                checkAdjustAdRevenue checkadjustadrevenue13 = read(str5, list3);
                setuserinputenabled.RemoteActionCompatParcelizer = null;
                setuserinputenabled.read = null;
                setuserinputenabled.serializer = null;
                setuserinputenabled.write = null;
                setuserinputenabled.MediaMetadataCompat = 10;
                objInvoke3 = autoAcceptNotificationMapperImpl.invoke(null, checkadjustadrevenue13, setuserinputenabled, false);
                if (objInvoke3 != coroutineSingletons) {
                    i = ParcelableVolumeInfo + 21;
                    PlaybackStateCompatCustomAction = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        int i112 = 86 / 0;
                    }
                    return objInvoke3;
                }
                return coroutineSingletons;
            case 10:
                obj = setuserinputenabled.write;
                ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
                return objIconCompatParcelizer;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
