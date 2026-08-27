package com.roadrunner.feedback.data.domain;

import android.os.Build;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider;
import com.roadrunner.remoteconfig.helper.RemoteConfigHelperV2;
import com.roadrunner.rider.state.shift.GetCourierShiftInfoImpl;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.accessgetOldDependencyp;
import o.dispatchKeyShortcutEvent;
import o.getLifecycleRegistryannotations;
import o.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc;
import o.setSdkPrefix;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class GetFeedbackDataUseCase {
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public final SaveHeatmapUrlImpl IconCompatParcelizer;
    public final GetCourierShiftInfoImpl RemoteActionCompatParcelizer;
    public final transferSessionPackageI serializer;
    public final accessgetOldDependencyp write;

    public GetFeedbackDataUseCase(transferSessionPackageI transfersessionpackagei, accessgetOldDependencyp accessgetolddependencyp, SaveHeatmapUrlImpl saveHeatmapUrlImpl, GetCourierShiftInfoImpl getCourierShiftInfoImpl) {
        this.serializer = transfersessionpackagei;
        this.write = accessgetolddependencyp;
        this.IconCompatParcelizer = saveHeatmapUrlImpl;
        this.RemoteActionCompatParcelizer = getCourierShiftInfoImpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: invoke-IoAF18A, reason: not valid java name */
    public final Object m4963invokeIoAF18A(ContinuationImpl continuationImpl) {
        GetFeedbackDataUseCase$invoke$1 getFeedbackDataUseCase$invoke$1;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i = 2 % 2;
        int i2 = read + 23;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof GetFeedbackDataUseCase$invoke$1) {
            getFeedbackDataUseCase$invoke$1 = (GetFeedbackDataUseCase$invoke$1) continuationImpl;
            int i4 = getFeedbackDataUseCase$invoke$1.MediaSessionCompatQueueItem;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                getFeedbackDataUseCase$invoke$1.MediaSessionCompatQueueItem = i4 - Integer.MIN_VALUE;
            } else {
                getFeedbackDataUseCase$invoke$1 = new GetFeedbackDataUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getFeedbackDataUseCase$invoke$1 = new GetFeedbackDataUseCase$invoke$1(this, continuationImpl);
        }
        Object objFirstOrNull = getFeedbackDataUseCase$invoke$1.MediaMetadataCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = getFeedbackDataUseCase$invoke$1.MediaSessionCompatQueueItem;
        String strValueOf = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            Flow flowIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            getFeedbackDataUseCase$invoke$1.MediaSessionCompatQueueItem = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowIconCompatParcelizer, getFeedbackDataUseCase$invoke$1);
            if (objFirstOrNull != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i5 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        } else {
            if (i5 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str7 = getFeedbackDataUseCase$invoke$1.IconCompatParcelizer;
            String str8 = getFeedbackDataUseCase$invoke$1.serializer;
            String str9 = getFeedbackDataUseCase$invoke$1.write;
            String str10 = getFeedbackDataUseCase$invoke$1.RemoteActionCompatParcelizer;
            String str11 = getFeedbackDataUseCase$invoke$1.read;
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            str2 = str11;
            str4 = str7;
            str3 = str10;
            str5 = str8;
            str6 = str9;
        }
        dispatchKeyShortcutEvent dispatchkeyshortcutevent = new dispatchKeyShortcutEvent(str3, str6, str5, str4, (getLifecycleRegistryannotations) objFirstOrNull, str2);
        int i6 = read + 17;
        MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return dispatchkeyshortcutevent;
        setSdkPrefix setsdkprefix = (setSdkPrefix) objFirstOrNull;
        if (setsdkprefix != null) {
            int i8 = MediaDescriptionCompat + 35;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            strValueOf = String.valueOf(setsdkprefix.write);
        }
        if (strValueOf == null) {
            int i10 = read + 77;
            MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            str = "";
        } else {
            str = strValueOf;
        }
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.serializer;
        String strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
        List listIconCompatParcelizer = instance_delegatelambda0.write;
        if (strSerializer != null) {
            FirebaseRemoteConfigProvider firebaseRemoteConfigProvider = firebaseRemoteConfigImpl.IconCompatParcelizer;
            r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = RemoteConfigHelperV2.RemoteActionCompatParcelizer;
            listIconCompatParcelizer = RemoteConfigHelperV2.IconCompatParcelizer(firebaseRemoteConfigProvider.read("email_feedback_recipients"), strSerializer, listIconCompatParcelizer);
        }
        String strIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(listIconCompatParcelizer, ",", null, null, null, 62);
        String str12 = ((getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET) this.write).serializer;
        String strM = af$$ExternalSyntheticOutline0.m(Build.BRAND, " ", Build.DEVICE);
        getFeedbackDataUseCase$invoke$1.read = str;
        getFeedbackDataUseCase$invoke$1.RemoteActionCompatParcelizer = strIconCompatParcelizer;
        getFeedbackDataUseCase$invoke$1.write = "v4.2634.5";
        getFeedbackDataUseCase$invoke$1.serializer = str12;
        getFeedbackDataUseCase$invoke$1.IconCompatParcelizer = strM;
        getFeedbackDataUseCase$invoke$1.MediaSessionCompatQueueItem = 2;
        Object user = this.IconCompatParcelizer.getUser(getFeedbackDataUseCase$invoke$1);
        if (user != coroutineSingletons) {
            str2 = str;
            objFirstOrNull = user;
            str3 = strIconCompatParcelizer;
            str4 = strM;
            str5 = str12;
            str6 = "v4.2634.5";
            dispatchKeyShortcutEvent dispatchkeyshortcutevent2 = new dispatchKeyShortcutEvent(str3, str6, str5, str4, (getLifecycleRegistryannotations) objFirstOrNull, str2);
            int i12 = read + 17;
            MediaDescriptionCompat = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            return dispatchkeyshortcutevent2;
        }
        return coroutineSingletons;
    }
}
