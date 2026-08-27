package o;

import android.app.Application;
import androidx.cardview.widget.CardView$1;
import coil3.ImageLoader$Builder;
import com.foodora.courier.app.GetEquipmentInfoRepository;
import com.foodora.courier.main.usecases.GetHelpCenterParamsUseCase;
import com.google.android.gms.dynamite.zzj;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.huawei.location.Vw$Vw;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.domain.GetUserDataUseCaseImpl;
import com.roadrunner.auth.domain.token.IsUserAuthenticatedWrapper;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.common.data.api.ExtractCriticalHttpIssueData;
import com.roadrunner.common.data.api.MapApiError;
import com.roadrunner.customerchat.selfservice.data.remote.HelpCenterRemoteDataSourceImpl;
import com.roadrunner.customerchat.selfservice.data.remote.service.ExecuteHelpCenterApiRequest;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl;
import com.roadrunner.customerchat.selfservice.domain.usecase.GetChatAssetDownloadAction;
import com.roadrunner.delivery.accept.acknowledgment.implementation.domain.GetAcknowledgmentParamsImpl;
import com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptNotificationMapperImpl;
import com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptRequestManagerImpl;
import com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl;
import com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesLocalRepositoryImpl;
import com.roadrunner.delivery.accept.domain.RemoveAutoAcceptedDeliveryIdImpl;
import com.roadrunner.delivery.accept.repository.AutoAcceptRequestStateRepositoryImpl;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.push.tokenregistry.data.api.TokenRegistryApiRequest;
import com.roadrunner.rider.state.shift.GetCourierShiftInfoImpl;
import dagger.Lazy;
import io.grpc.internal.SharedResourcePool;
import java.time.Clock;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda6UOvp7lvejigbq5knKoP8A0vEiw implements getColorIntegerOrNulllambda0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;

    public r8lambda6UOvp7lvejigbq5knKoP8A0vEiw(lineEndToVisibleEnd lineendtovisibleend, setPresentationView setpresentationview) {
        this.read = 22;
        setpresentationview.getClass();
        this.IconCompatParcelizer = lineendtovisibleend;
        this.serializer = setpresentationview;
    }

    public /* synthetic */ r8lambda6UOvp7lvejigbq5knKoP8A0vEiw(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, int i) {
        this.read = i;
        this.IconCompatParcelizer = mergejsonobjects;
        this.serializer = mergejsonobjects2;
    }

    public r8lambda6UOvp7lvejigbq5knKoP8A0vEiw(setPresentationView setpresentationview, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw) {
        this.read = 11;
        setpresentationview.getClass();
        this.IconCompatParcelizer = setpresentationview;
        this.serializer = r8lambda6uovp7lvejigbq5knkop8a0veiw;
    }

    public r8lambda6UOvp7lvejigbq5knKoP8A0vEiw(q0 q0Var, SemanticsPropertiesFillableData1 semanticsPropertiesFillableData1) {
        this.read = 12;
        q0Var.getClass();
        this.IconCompatParcelizer = q0Var;
        this.serializer = semanticsPropertiesFillableData1;
    }

    public r8lambda6UOvp7lvejigbq5knKoP8A0vEiw(lineEndToVisibleEnd lineendtovisibleend, setPresentationView setpresentationview, byte b) {
        this.read = 27;
        setpresentationview.getClass();
        this.IconCompatParcelizer = lineendtovisibleend;
        this.serializer = setpresentationview;
    }

    public r8lambda6UOvp7lvejigbq5knKoP8A0vEiw(FontVariationSettingInt fontVariationSettingInt, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.read = 24;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.IconCompatParcelizer = fontVariationSettingInt;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public r8lambda6UOvp7lvejigbq5knKoP8A0vEiw(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, getEditableText geteditabletext) {
        this.read = 23;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = geteditabletext;
    }

    public r8lambda6UOvp7lvejigbq5knKoP8A0vEiw(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, lineEndToVisibleEnd lineendtovisibleend) {
        this.read = 25;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = lineendtovisibleend;
    }

    public r8lambda6UOvp7lvejigbq5knKoP8A0vEiw(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, q0 q0Var) {
        this.read = 5;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = q0Var;
    }

    public r8lambda6UOvp7lvejigbq5knKoP8A0vEiw(transformCanvas transformcanvas, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.read = 3;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = transformcanvas;
    }

    public r8lambda6UOvp7lvejigbq5knKoP8A0vEiw(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, lineEndToVisibleEnd lineendtovisibleend, byte b) {
        this.read = 29;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = lineendtovisibleend;
    }

    public r8lambda6UOvp7lvejigbq5knKoP8A0vEiw(setRoundRectOutlineTNW_H78default setroundrectoutlinetnw_h78default, hasNestedScrollingParent hasnestedscrollingparent, getContentDataType getcontentdatatype) {
        this.read = 1;
        hasnestedscrollingparent.getClass();
        this.IconCompatParcelizer = hasnestedscrollingparent;
        this.serializer = getcontentdatatype;
    }

    public r8lambda6UOvp7lvejigbq5knKoP8A0vEiw(zzj zzjVar, getEditableText geteditabletext, setPresentationView setpresentationview) {
        this.read = 6;
        this.IconCompatParcelizer = geteditabletext;
        this.serializer = setpresentationview;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 5;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.serializer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.IconCompatParcelizer;
        switch (i4) {
            case 0:
                return new r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w((zzz) ((r8lambdaZcilDVoiQYR1yQsOxhHduSfdjyw) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (CreateHomeScope) ((getEditableText) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 1:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite.getClass();
                return new recreateDisplayListIfNeeded((Application) objWrite, (recordInternal) ((getContentDataType) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 2:
                return new GetEquipmentInfoRepository((isApiKeyPresentandroid_sdk_base_releaseannotations) ((requestSingleLocationUpdatelambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (SaveHeatmapUrlImpl) ((requestSingleLocationUpdatelambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 3:
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite2.getClass();
                Lazy lazySerializer = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq);
                lazySerializer.getClass();
                return new CardView$1((transferSessionPackageI) objWrite2, 21, lazySerializer);
            case 4:
                return new indirectPrimaryDirectionalScrollAxis((GetCourierShiftInfoImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (GetHelpCenterParamsUseCase) ((invokeqtAw6s) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (SharedResourcePool) resizeToBitmapDimensionslambda1.serializer.write());
            case 5:
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite3.getClass();
                return new IndirectPointerEventTypeCompanion((setTransactionSuccessful) objWrite3, (EnumColumnAdapter) ((q0) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 6:
                TuplesKt tuplesKt = (TuplesKt) ((getEditableText) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                isOpenInternalroom_runtime isopeninternalroom_runtime = (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                isopeninternalroom_runtime.getClass();
                return new isConsumed(tuplesKt, isopeninternalroom_runtime);
            case 7:
                return new CardView$1((TokenRegistryApiRequest) ((r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (ExecuteApiRequest) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 8:
                return new GetUserDataUseCaseImpl((getCustomActionsdelegate) ((getContentDataType) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (AuthRepository) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 9:
                return new pageLeftdefault((Vw$Vw) ((invokeqtAw6s) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (getToggleableState) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 10:
                return new IsUserAuthenticatedWrapper((InitializeAppStartupItemsImpl) ((invokeqtAw6s) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (SemanticsPropertiesContentDescription1) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 11:
                MapApiError mapApiError = new MapApiError();
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite4.getClass();
                return new ExecuteApiRequest(mapApiError, (isOpenInternalroom_runtime) objWrite4, (withRect) ((r8lambda6UOvp7lvejigbq5knKoP8A0vEiw) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 12:
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite5.getClass();
                return new withRect((EnumColumnAdapter) objWrite5, (ExtractCriticalHttpIssueData) ((SemanticsPropertiesFillableData1) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 13:
                return new accessisSetgyyYBs((registerOnChangedCallback) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (verifyAndTrackPlayStorePurchaseI) ((r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 14:
                return new AnnotatedStringspecialinlinedsortedBy1((Application) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (String) ((fastMergej5T8yCg) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 15:
                return new SelfServiceCustomerChatRepositoryImpl((HelpCenterRemoteDataSourceImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (ExecuteHelpCenterApiRequest) ((fastMergej5T8yCg) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 16:
                return new com.roadrunner.customerchat.selfservice.domain.analytics.AnalyticsImpl((ProtobufEncoder) ((SemanticsPropertiesLinkTestMarker1) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (toAnnotatedStringdefault) ((SemanticsPropertiesLinkTestMarker1) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 17:
                return new GetChatAssetDownloadAction((ProtobufEncoder) ((r8lambda6UOvp7lvejigbq5knKoP8A0vEiw) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (ImageLoader$Builder) ((insertBasedOnParentOffset) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 18:
                startDocument startdocument = (startDocument) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                PlatformHapticFeedbackType platformHapticFeedbackType = (PlatformHapticFeedbackType) ((fastMergej5T8yCg) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                getActionViewIntentlambda0 getactionviewintentlambda0 = (getActionViewIntentlambda0) getLineBreakrAG3T2k.IconCompatParcelizer.write();
                startdocument.getClass();
                platformHapticFeedbackType.getClass();
                getactionviewintentlambda0.getClass();
                ProtobufEncoder protobufEncoder = new ProtobufEncoder();
                protobufEncoder.write = startdocument;
                protobufEncoder.serializer = platformHapticFeedbackType;
                protobufEncoder.RemoteActionCompatParcelizer = getactionviewintentlambda0;
                return protobufEncoder;
            case 19:
                return new requireIndexInRange((r8lambdaVSwqKAPZUGoM32l5XH3Xl8tsgCE) ((SharedPreferencesMigration) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 20:
                return new InitializeAppStartupItemsImpl((InitializeAppStartupItemsImpl) ((accessgetTextBottomcp) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (GetChatAssetDownloadAction) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 21:
                r8lambdauOuXWzkcWK0_FYFfgKa7xmdauU r8lambdauouxwzkcwk0_fyffgka7xmdauu = new r8lambdauOuXWzkcWK0_FYFfgKa7xmdauU((Vw$Vw) ((fastMergej5T8yCg) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (transferSessionPackageI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                int i5 = RemoteActionCompatParcelizer + 45;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return r8lambdauouxwzkcwk0_fyffgka7xmdauu;
                }
                throw null;
            case 22:
                zzz zzzVar = (zzz) ((lineEndToVisibleEnd) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite6.getClass();
                GetAcknowledgmentParamsImpl getAcknowledgmentParamsImpl = new GetAcknowledgmentParamsImpl(zzzVar, (Clock) objWrite6);
                int i6 = RemoteActionCompatParcelizer + 37;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return getAcknowledgmentParamsImpl;
            case 23:
                Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite7.getClass();
                return new AutoAcceptNotificationMapperImpl((setTransactionSuccessful) objWrite7, (RemoveAutoAcceptedDeliveryIdImpl) ((getEditableText) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 24:
                AutoAcceptRequestStateRepositoryImpl autoAcceptRequestStateRepositoryImpl = (AutoAcceptRequestStateRepositoryImpl) ((FontVariationSettingInt) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite8.getClass();
                return new AutoAcceptRequestManagerImpl(autoAcceptRequestStateRepositoryImpl, (transferSessionPackageI) objWrite8);
            case 25:
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite9.getClass();
                return new PlatformParagraphStyleSaverlambda0((getContentViewGroupParentLayout) objWrite9, (RemoveAutoAcceptedDeliveryIdImpl) ((lineEndToVisibleEnd) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 26:
                return new AutoAcceptPreferencesLocalRepositoryImpl((AutoAcceptPreferencesDataStoreImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (TextRangeKt) ((SharedPreferencesMigration) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 27:
                shouldSkipDump shouldskipdump = (shouldSkipDump) ((lineEndToVisibleEnd) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite10.getClass();
                return new getCollapsedimpl(shouldskipdump, (Clock) objWrite10);
            case 28:
                return new accesscreatePlatformTextStyleInternal((q4ExternalSyntheticLambda9) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (BrazeExternalSyntheticLambda206) ((LayoutCompat) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            default:
                Lazy lazySerializer2 = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq2);
                lazySerializer2.getClass();
                return new getRangeForRect(lazySerializer2, (fillLineHorizontalBoundsui_text) ((lineEndToVisibleEnd) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
        }
    }
}
