package com.roadrunner.delivery.midshiftverification;

import androidx.compose.ui.graphics.Fields;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.roadrunner.face.verification.domain.CheckSelfieStatusUseCaseImpl;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import o.DeleteSurroundingTextInCodePointsCommand;
import o.EditProcessor;
import o.generateBatchErrorMessage;
import o.getContentViewGroupParentLayout;
import o.isAdapterPositionOnScreen;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdatahictpR_RFQlQiXpQeJqGuk8B8;
import o.requestSingleLocationUpdateandroid_sdk_base_release;
import o.setApiKeyPresentandroid_sdk_base_release;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class MidShiftIdVerificationCoordinator implements r8lambdatahictpR_RFQlQiXpQeJqGuk8B8 {
    private static int MediaSessionCompatToken = 1;
    private static int ParcelableVolumeInfo;
    public final setApiKeyPresentandroid_sdk_base_release IconCompatParcelizer;
    public final DeleteSurroundingTextInCodePointsCommand MediaBrowserCompatMediaItem;
    public final EditProcessor MediaDescriptionCompat;
    public final generateBatchErrorMessage MediaMetadataCompat;
    public final LastDropoffConfirmedEventImpl MediaSessionCompatQueueItem;
    public final getContentViewGroupParentLayout RatingCompat;
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new ImageLoader$Builder$$ExternalSyntheticLambda1(16, this));
    public final ProtobufEncoder read;
    public final CheckSelfieStatusUseCaseImpl serializer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU write;

    public MidShiftIdVerificationCoordinator(LastDropoffConfirmedEventImpl lastDropoffConfirmedEventImpl, setApiKeyPresentandroid_sdk_base_release setapikeypresentandroid_sdk_base_release, requestSingleLocationUpdateandroid_sdk_base_release requestsinglelocationupdateandroid_sdk_base_release, EditProcessor editProcessor, CheckSelfieStatusUseCaseImpl checkSelfieStatusUseCaseImpl, DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand, generateBatchErrorMessage generatebatcherrormessage, ProtobufEncoder protobufEncoder, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.MediaSessionCompatQueueItem = lastDropoffConfirmedEventImpl;
        this.IconCompatParcelizer = setapikeypresentandroid_sdk_base_release;
        this.MediaDescriptionCompat = editProcessor;
        this.serializer = checkSelfieStatusUseCaseImpl;
        this.MediaBrowserCompatMediaItem = deleteSurroundingTextInCodePointsCommand;
        this.MediaMetadataCompat = generatebatcherrormessage;
        this.read = protobufEncoder;
        this.RatingCompat = getcontentviewgroupparentlayout;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new RiderStateRepositoryImpl.AnonymousClass1(this, null, 1), 3);
    }

    public final void serializer(String str) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 19;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Mid-shift: ID verification ".concat(str), new Object[0]);
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.write;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i4 = ParcelableVolumeInfo + 93;
            MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            int i6 = ParcelableVolumeInfo + 63;
            MediaSessionCompatToken = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        this.write = null;
        int i8 = MediaSessionCompatToken + 9;
        ParcelableVolumeInfo = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (r4.IconCompatParcelizer(o.updateAdidI.IS_RACC_MID_SHIFT_VERIFICATION_ENABLED) == false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$navigateIfSelfieRequired(com.roadrunner.delivery.midshiftverification.MidShiftIdVerificationCoordinator r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.midshiftverification.MidShiftIdVerificationCoordinator.access$navigateIfSelfieRequired(com.roadrunner.delivery.midshiftverification.MidShiftIdVerificationCoordinator, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
