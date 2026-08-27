package com.roadrunner.auth.data;

import androidx.camera.core.ImageCaptureException;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl;
import com.deliveryhero.selfServiceChat.data.repository.ChatRepositoryImpl;
import com.huawei.agconnect.config.impl.m;
import com.huawei.location.Vw$Vw;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.customerchat.selfservice.data.repository.WebChatNativeAssetRepositoryImpl;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl;
import com.roadrunner.delivery.accept.laststop.data.LastStopRepositoryImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain.ReportPictureUseCase;
import com.roadrunner.face.verification.api.selfie.CameraImage;
import com.roadrunner.face.verification.presentation.selfie.SelfieFlowViewModel;
import com.roadrunner.inappnotifications.data.InAppNotificationsRepository;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.login.presentation.countryselection.CountrySelectionViewModel;
import com.roadrunner.login.presentation.otp.OtpViewModel;
import com.roadrunner.login.presentation.router.GetAuthStateViewModel;
import com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager;
import com.sentiance.core.model.events.I$b;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C0159dialog;
import o.ExecutableQueryexecuteAsOneOrNull1;
import o.ExtrasKt;
import o.OffsetMappingCompanionIdentity1;
import o.ShortNewsContentCardView;
import o.accessgetHighcp;
import o.createFromParcel;
import o.ensureAnimationInfo;
import o.getIsDialog;
import o.getMaxHeight;
import o.getPendingTablesruntime;
import o.getReferencedIds;
import o.getTextSelectionRange;
import o.hashCodeimpl;
import o.insertOrUpdateTransformedNode;
import o.metaMarkUpdatedAndHasCallbacks;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import okhttp3.FormBody;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthRepository$logoutUser$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int write;
    public int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AuthRepository$logoutUser$2(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.serializer = obj;
        this.read = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x04a5, code lost:
    
        if (r0.emit(r3, r17) == r2) goto L178;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v21, types: [o.PopulateViewStructure_androidKtpopulate7] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [o.onShowTranslationui] */
    /* JADX WARN: Type inference failed for: r3v24, types: [o.onShowTranslationui] */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r4v6, types: [o.setSpread] */
    /* JADX WARN: Type inference failed for: r4v7, types: [o.setSpread] */
    /* JADX WARN: Type inference failed for: r7v0, types: [o.ShortNewsContentCardView] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.view.View] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.auth.data.AuthRepository$logoutUser$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AuthRepository$logoutUser$2(RiderSafetyLifecycleManager riderSafetyLifecycleManager, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.read = riderSafetyLifecycleManager;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        switch (i2) {
            case 0:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 1:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 2:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 3:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 4:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 5:
                Object objInvokeSuspend = ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i3 = MediaBrowserCompatMediaItem + 69;
                write = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            case 6:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 7:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 8:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 9:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 10:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 11:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 12:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 13:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 14:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 15:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 16:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 17:
                Object objInvokeSuspend2 = ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i4 = write + 17;
                MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 41 / 0;
                }
                return objInvokeSuspend2;
            case 18:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 19:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 20:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 21:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 22:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 23:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 24:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 25:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 26:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 27:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 28:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            default:
                return ((AuthRepository$logoutUser$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        int i4 = 11;
        switch (i3) {
            case 0:
                AuthRepository$logoutUser$2 authRepository$logoutUser$2 = new AuthRepository$logoutUser$2((AuthRepository) this.serializer, (C0159dialog) obj, shortNewsContentCardView, 0);
                int i5 = write + 53;
                MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return authRepository$logoutUser$2;
            case 1:
                return new AuthRepository$logoutUser$2((AnchoredDraggableState) this.serializer, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj, shortNewsContentCardView, 1);
            case 2:
                AuthRepository$logoutUser$2 authRepository$logoutUser$3 = new AuthRepository$logoutUser$2((AndroidTextContextMenuToolbarProvider) this.serializer, (hashCodeimpl) obj, shortNewsContentCardView, i);
                int i7 = MediaBrowserCompatMediaItem + 11;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return authRepository$logoutUser$3;
            case 3:
                return new AuthRepository$logoutUser$2((BasicTextContextMenuProvider) this.serializer, (accessgetHighcp) obj, shortNewsContentCardView, 3);
            case 4:
                return new AuthRepository$logoutUser$2((androidx.compose.material3.internal.AnchoredDraggableState) this.serializer, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj, shortNewsContentCardView, 4);
            case 5:
                return new AuthRepository$logoutUser$2((PerseusUserLocalDataStoreImpl) this.serializer, (String) obj, shortNewsContentCardView, 5);
            case 6:
                return new AuthRepository$logoutUser$2((ChatRepositoryImpl) this.serializer, (String) obj, shortNewsContentCardView, 6);
            case 7:
                return new AuthRepository$logoutUser$2((I$b) this.serializer, (List) obj, shortNewsContentCardView, 7);
            case 8:
                return new AuthRepository$logoutUser$2((Vw$Vw) this.serializer, (insertOrUpdateTransformedNode) obj, shortNewsContentCardView, 8);
            case 9:
                return new AuthRepository$logoutUser$2((WebChatNativeAssetRepositoryImpl) this.serializer, (String) obj, shortNewsContentCardView, 9);
            case 10:
                return new AuthRepository$logoutUser$2((SelfServiceCustomerChatRepositoryImpl) this.serializer, (String) obj, shortNewsContentCardView, 10);
            case 11:
                return new AuthRepository$logoutUser$2((LastStopRepositoryImpl) this.serializer, (String) obj, shortNewsContentCardView, i4);
            case 12:
                return new AuthRepository$logoutUser$2((InitializeAppStartupItemsImpl) this.serializer, (String) obj, shortNewsContentCardView, 12);
            case 13:
                return new AuthRepository$logoutUser$2((ReportPictureUseCase) this.serializer, (OffsetMappingCompanionIdentity1) obj, shortNewsContentCardView, 13);
            case 14:
                return new AuthRepository$logoutUser$2((getReferencedIds) this.serializer, (getMaxHeight) obj, shortNewsContentCardView, 14);
            case 15:
                return new AuthRepository$logoutUser$2((SelfieFlowViewModel) this.serializer, (ImageCaptureException) obj, shortNewsContentCardView, 15);
            case 16:
                return new AuthRepository$logoutUser$2((SelfieFlowViewModel) this.serializer, (CameraImage) obj, shortNewsContentCardView, 16);
            case 17:
                return new AuthRepository$logoutUser$2((m) this.serializer, (ensureAnimationInfo) obj, shortNewsContentCardView, 17);
            case 18:
                return new AuthRepository$logoutUser$2((InAppNotificationsRepository) this.serializer, (String) obj, shortNewsContentCardView, 18);
            case 19:
                return new AuthRepository$logoutUser$2((AppEventInfoChangeHandler) this.serializer, (ExecutableQueryexecuteAsOneOrNull1) obj, shortNewsContentCardView, 19);
            case 20:
                return new AuthRepository$logoutUser$2((SignInDataStore) this.serializer, (getPendingTablesruntime) obj, shortNewsContentCardView, 20);
            case 21:
                return new AuthRepository$logoutUser$2((CountrySelectionViewModel) this.serializer, (metaMarkUpdatedAndHasCallbacks) obj, shortNewsContentCardView, 21);
            case 22:
                AuthRepository$logoutUser$2 authRepository$logoutUser$4 = new AuthRepository$logoutUser$2((CountrySelectionViewModel) this.serializer, (String) obj, shortNewsContentCardView, 22);
                int i9 = write + 101;
                MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return authRepository$logoutUser$4;
            case 23:
                return new AuthRepository$logoutUser$2((OtpViewModel) this.serializer, (String) obj, shortNewsContentCardView, 23);
            case 24:
                return new AuthRepository$logoutUser$2((GetAuthStateViewModel) this.serializer, (getTextSelectionRange) obj, shortNewsContentCardView, 24);
            case 25:
                return new AuthRepository$logoutUser$2((GetAuthStateViewModel) this.serializer, (getIsDialog) obj, shortNewsContentCardView, 25);
            case 26:
                return new AuthRepository$logoutUser$2((ExtrasKt) this.serializer, (LocalDate) obj, shortNewsContentCardView, 26);
            case 27:
                return new AuthRepository$logoutUser$2((FormBody.Builder) this.serializer, (String) obj, shortNewsContentCardView, 27);
            case 28:
                return new AuthRepository$logoutUser$2((RiderSafetyLifecycleManager) obj, shortNewsContentCardView, 28);
            default:
                return new AuthRepository$logoutUser$2((RiderSafetyLifecycleManager) obj, shortNewsContentCardView, 29);
        }
    }
}
