package com.sentiance.core.model.events;

import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import androidx.camera.core.ImageCapture$1;
import androidx.camera.core.ImageCaptureException;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import androidx.room.Room;
import androidx.work.impl.WorkManagerImpl;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.google.android.gms.tasks.OnFailureListener;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.huawei.wisesecurity.ucs_credential.x;
import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.mapbox.api.directions.v5.models.BannerInstructions;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxMap;
import com.mapbox.navigation.core.internal.dump.HelpDumpInterceptor;
import com.mapbox.navigation.core.trip.session.BannerInstructionEvent$LatestInstructionWrapper;
import com.mapbox.navigation.ui.maps.building.BuildingAction$QueryBuilding;
import com.mapbox.navigation.utils.internal.JobControl;
import com.mapbox.search.IndexableDataProvidersRegistryImpl$DataProviderContext;
import com.mapbox.search.base.task.AsyncOperationTaskImpl;
import com.mapbox.search.common.concurrent.AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0;
import com.mapbox.search.record.DataProviderEngineRegistrationServiceImpl;
import com.mapbox.search.record.LocalDataProviderImpl;
import com.mapbox.search.utils.CompoundCompletionCallback;
import com.mapbox.search.utils.LoggingCompletionCallback;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.auth.data.SignInDataStore$get$1;
import com.roadrunner.auth.domain.RefreshAccessTokenUseCaseImpl;
import com.roadrunner.auth.domain.SaveAuthDataUseCase;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain.ReportPictureUseCase$invoke$2;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.face.verification.api.selfie.CameraImage;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;
import com.roadrunner.liveness.recording.domain.FaceDetectionException;
import com.roadrunner.nafath.data.NafathTimerDataStore;
import com.roadrunner.nafath.data.NafathTimerDataStore$set$2;
import com.roadrunner.permission.api.model.PermissionModel;
import com.roadrunner.permission.presentation.NonFloatablePermissionActivity;
import com.roadrunner.permission.presentation.PermissionActivity;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.ExecuteOtpApiRequest$invoke$1;
import com.roadrunner.rider.state.shiftextension.data.ShiftExtensionRepository$toggleShiftExtension$1;
import com.roadrunner.rider.state.shiftextension.data.ShiftExtensionRepository$toggleShiftExtension$2;
import com.roadrunner.rider.state.status.GetCourierStatusUseCaseImpl;
import com.roadrunner.settings.SettingsViewModel$special$$inlined$map$1;
import io.sentry.util.UrlUtils;
import java.time.Clock;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import javax.crypto.Cipher;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ActivityHandlerExternalSyntheticLambda13;
import o.BrazeExternalSyntheticLambda5;
import o.FontEj4NQ78default;
import o.SemanticsPropertiesKtgetScrollViewportLength1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.decode;
import o.getContentViewGroupParentLayout;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.getInputTextSuggestionStatedelegate;
import o.getSessionParameters;
import o.getTestTagsAsResourceIddelegate;
import o.i1;
import o.inCompatibilityMode;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.isOpenInternalroom_runtime;
import o.notifyItemRangeInserted;
import o.onBackInvokedlambda0;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.pauseWebviewIfNecessarylambda10;
import o.pc;
import o.pd;
import o.pe;
import o.prepareForActivityTransitionCarryover;
import o.q3ExternalSyntheticLambda1;
import o.r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.restoreChildFragmentState;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setCarryoverInAppMessage;
import o.setStateParametersdefault;
import o.setSubtitleTextColor;
import o.setTextCompositionRangepsREZIo;
import o.setTransactionSuccessful;
import o.shouldHandleLifecycleMethodsInActivitylambda0;
import o.transferSessionPackageI;
import o.unpackInt2;
import o.updateAdidI;
import okhttp3.FormBody;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class H$b implements setSubtitleTextColor, OnFailureListener {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int IconCompatParcelizer;
    public Object serializer;
    public Object write;

    public H$b() {
        this.IconCompatParcelizer = 2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.serializer = linkedHashSet;
        HelpDumpInterceptor helpDumpInterceptor = new HelpDumpInterceptor();
        HelpDumpInterceptor helpDumpInterceptor2 = (HelpDumpInterceptor) this.write;
        if (helpDumpInterceptor2 != null) {
            linkedHashSet.remove(helpDumpInterceptor2);
            int i = RemoteActionCompatParcelizer + 13;
            read = i % Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        onContentCardDismissed.serializer(linkedHashSet, new HelpDumpInterceptor[]{helpDumpInterceptor});
        this.write = helpDumpInterceptor;
        int i4 = RemoteActionCompatParcelizer + 29;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public void cancel() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        JobKt.IconCompatParcelizer((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) ((JobControl) ((isAdapterPositionOnScreen) this.write).MediaSessionCompatResultReceiverWrapper()).job);
        int i4 = read + 39;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public void launchWithMutex(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer((ContextScope) this.serializer, null, null, new NavHostKt$NavHost$29$1(this, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, 15), 3);
        int i2 = RemoteActionCompatParcelizer + 79;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // o.setSubtitleTextColor
    public void write(ImageCaptureException imageCaptureException) {
        int i = 2 % 2;
        int i2 = read + 71;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.IconCompatParcelizer == 11) {
            ((ReportPictureUseCase$invoke$2) this.serializer).invoke(imageCaptureException);
            return;
        }
        ((SafeContinuation) this.serializer).resumeWith(new isItemDismissable(imageCaptureException));
        int i4 = RemoteActionCompatParcelizer + 107;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public shouldHandleLifecycleMethodsInActivitylambda0 read() {
        int i = 2 % 2;
        if (((HashMap) this.serializer) != null) {
            int i2 = RemoteActionCompatParcelizer + 17;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (((Byte) this.write) != null) {
                return new shouldHandleLifecycleMethodsInActivitylambda0(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'action' is missing");
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'metadata' is missing");
        }
        int i4 = read + 1;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // o.setSubtitleTextColor
    public void IconCompatParcelizer(ImageCapture$1 imageCapture$1) {
        int i = 2 % 2;
        int i2 = read + 71;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        imageCapture$1.getClass();
        if (i4 != 11) {
            ((SafeContinuation) this.serializer).resumeWith((CameraImage) this.write);
            return;
        }
        ((BarcodeAnalyzer$$ExternalSyntheticLambda0) this.write).invoke((Uri) imageCapture$1.MediaSessionCompatQueueItem);
        int i5 = RemoteActionCompatParcelizer + 9;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ H$b(Object obj, int i, Object obj2) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
        this.write = obj2;
    }

    public /* synthetic */ H$b(int i) {
        this.IconCompatParcelizer = i;
    }

    public void queryBuildingToHighlight(Point point, i1 i1Var) {
        int i = 2 % 2;
        i1Var.getClass();
        BuildersKt.RemoteActionCompatParcelizer(((JobControl) ((isAdapterPositionOnScreen) this.write).MediaSessionCompatResultReceiverWrapper()).scope, null, null, new PerseusLogger$w$1(this, new BuildingAction$QueryBuilding(point, (MapboxMap) this.serializer), i1Var, null, 9), 3);
        int i2 = read + 105;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public H$b(g0 g0Var, notifyItemRangeInserted notifyitemrangeinserted) {
        this.IconCompatParcelizer = 19;
        g0Var.getClass();
        notifyitemrangeinserted.getClass();
        this.serializer = g0Var;
        this.write = notifyitemrangeinserted;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i = 2 % 2;
        exc.getClass();
        FaceDetectionException faceDetectionException = new FaceDetectionException("Failed to process image for face detection", exc);
        ((FormBody.Builder) this.serializer).getClass();
        Timber.RemoteActionCompatParcelizer.write(faceDetectionException);
        ((SafeContinuation) this.write).resumeWith(new onItemDismiss(new isItemDismissable(faceDetectionException)));
        int i2 = read + 85;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public H$b(AuthRepository authRepository, SaveAuthDataUseCase saveAuthDataUseCase) {
        this.IconCompatParcelizer = 7;
        authRepository.getClass();
        saveAuthDataUseCase.getClass();
        this.serializer = authRepository;
        this.write = saveAuthDataUseCase;
    }

    public boolean isOccurring(BannerInstructions bannerInstructions, Integer num) {
        BannerInstructions bannerInstructions2;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        BannerInstructionEvent$LatestInstructionWrapper bannerInstructionEvent$LatestInstructionWrapper = null;
        if (i2 % 2 != 0) {
            this.write = bannerInstructions;
            throw null;
        }
        this.write = bannerInstructions;
        if (bannerInstructions == null) {
            return false;
        }
        BannerInstructionEvent$LatestInstructionWrapper bannerInstructionEvent$LatestInstructionWrapper2 = (BannerInstructionEvent$LatestInstructionWrapper) this.serializer;
        if (bannerInstructionEvent$LatestInstructionWrapper2 != null) {
            int i4 = i3 + 33;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                BannerInstructions bannerInstructions3 = bannerInstructionEvent$LatestInstructionWrapper2.latestBannerInstructions;
                throw null;
            }
            bannerInstructions2 = bannerInstructionEvent$LatestInstructionWrapper2.latestBannerInstructions;
        } else {
            bannerInstructions2 = null;
        }
        if (!(!bannerInstructions.equals(bannerInstructions2))) {
            return false;
        }
        BannerInstructions bannerInstructions4 = (BannerInstructions) this.write;
        if (num != null && bannerInstructions4 != null) {
            bannerInstructionEvent$LatestInstructionWrapper = new BannerInstructionEvent$LatestInstructionWrapper(num.intValue(), bannerInstructions4);
        }
        this.serializer = bannerInstructionEvent$LatestInstructionWrapper;
        return true;
    }

    public H$b(ActivityHandlerExternalSyntheticLambda13 activityHandlerExternalSyntheticLambda13, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.IconCompatParcelizer = 24;
        activityHandlerExternalSyntheticLambda13.getClass();
        isopeninternalroom_runtime.getClass();
        this.serializer = activityHandlerExternalSyntheticLambda13;
        this.write = isopeninternalroom_runtime;
    }

    public H$b(setTextCompositionRangepsREZIo settextcompositionrangepsrezio, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.IconCompatParcelizer = 8;
        settextcompositionrangepsrezio.getClass();
        isopeninternalroom_runtime.getClass();
        this.serializer = settextcompositionrangepsrezio;
        this.write = isopeninternalroom_runtime;
    }

    public H$b(FontEj4NQ78default fontEj4NQ78default, decode decodeVar) {
        this.IconCompatParcelizer = 14;
        decodeVar.getClass();
        fontEj4NQ78default.getClass();
        this.serializer = decodeVar;
        this.write = fontEj4NQ78default;
    }

    public H$b(RefreshAccessTokenUseCaseImpl refreshAccessTokenUseCaseImpl, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.IconCompatParcelizer = 10;
        refreshAccessTokenUseCaseImpl.getClass();
        getcontentviewgroupparentlayout.getClass();
        this.serializer = refreshAccessTokenUseCaseImpl;
        this.write = getcontentviewgroupparentlayout;
    }

    public H$b(setStateParametersdefault setstateparametersdefault, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.IconCompatParcelizer = 15;
        setstateparametersdefault.getClass();
        isopeninternalroom_runtime.getClass();
        this.serializer = setstateparametersdefault;
        this.write = isopeninternalroom_runtime;
    }

    public H$b(setTransactionSuccessful settransactionsuccessful, restoreChildFragmentState restorechildfragmentstate) {
        this.IconCompatParcelizer = 26;
        settransactionsuccessful.getClass();
        restorechildfragmentstate.getClass();
        this.serializer = settransactionsuccessful;
        this.write = restorechildfragmentstate;
    }

    public H$b(GetCourierStatusUseCaseImpl getCourierStatusUseCaseImpl, transferSessionPackageI transfersessionpackagei) {
        this.IconCompatParcelizer = 17;
        getCourierStatusUseCaseImpl.getClass();
        transfersessionpackagei.getClass();
        this.serializer = getCourierStatusUseCaseImpl;
        this.write = transfersessionpackagei;
    }

    public void IconCompatParcelizer(PermissionModel permissionModel, FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        permissionModel.getClass();
        if (((r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA) this.serializer).read(permissionModel.IconCompatParcelizer, fragmentActivity)) {
            return;
        }
        int i2 = read + 5;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((unpackInt2) this.write).RemoteActionCompatParcelizer;
            firebaseRemoteConfigImpl.getClass();
            firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_NEW_PERMISSIONS_FLOW_ENABLED);
            obj.hashCode();
            throw null;
        }
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) ((unpackInt2) this.write).RemoteActionCompatParcelizer;
        firebaseRemoteConfigImpl2.getClass();
        if (!firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_NEW_PERMISSIONS_FLOW_ENABLED)) {
            Intent intent = new Intent(fragmentActivity, (Class<?>) PermissionActivity.class);
            intent.putExtra("permission_model_key", permissionModel);
            fragmentActivity.startActivityForResult(intent, -1, null);
        } else {
            Intent intent2 = new Intent(fragmentActivity, (Class<?>) NonFloatablePermissionActivity.class);
            intent2.putExtra("permission_model_key", permissionModel);
            fragmentActivity.startActivityForResult(intent2, -1, null);
            int i3 = read + 49;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
    }

    public H$b(getInputTextSuggestionStatedelegate getinputtextsuggestionstatedelegate, setTransactionSuccessful settransactionsuccessful) {
        this.IconCompatParcelizer = 28;
        getinputtextsuggestionstatedelegate.getClass();
        settransactionsuccessful.getClass();
        this.serializer = getinputtextsuggestionstatedelegate;
        this.write = settransactionsuccessful;
    }

    public void preregister(LocalDataProviderImpl localDataProviderImpl, AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0 androidMainThreadWorkerImpl$$ExternalSyntheticLambda0, LoggingCompletionCallback loggingCompletionCallback) {
        int i = 2 % 2;
        int i2 = read + 21;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        androidMainThreadWorkerImpl$$ExternalSyntheticLambda0.getClass();
        x xVar = (x) this.write;
        String str = localDataProviderImpl.dataProviderName;
        xVar.getClass();
        str.getClass();
        if (((IndexableDataProvidersRegistryImpl$DataProviderContext) ((LinkedHashMap) xVar.IconCompatParcelizer).get(str)) != null) {
            androidMainThreadWorkerImpl$$ExternalSyntheticLambda0.execute(new ZM$$ExternalSyntheticLambda2(11, loggingCompletionCallback));
            AsyncOperationTaskImpl asyncOperationTaskImpl = AsyncOperationTaskImpl.COMPLETED;
            return;
        }
        AsyncOperationTaskImpl asyncOperationTaskImpl2 = new AsyncOperationTaskImpl();
        asyncOperationTaskImpl2.plusAssign(((DataProviderEngineRegistrationServiceImpl) this.serializer).register(localDataProviderImpl, new CompoundCompletionCallback(asyncOperationTaskImpl2, this, androidMainThreadWorkerImpl$$ExternalSyntheticLambda0, localDataProviderImpl, loggingCompletionCallback)));
        int i4 = read + 69;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
    }

    public H$b(NestComponentRepositoryImpl nestComponentRepositoryImpl, IsFixableByRetry isFixableByRetry) {
        this.IconCompatParcelizer = 18;
        nestComponentRepositoryImpl.getClass();
        isFixableByRetry.getClass();
        this.serializer = nestComponentRepositoryImpl;
        this.write = isFixableByRetry;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    /* JADX INFO: renamed from: toggleShiftExtension-gIAlu-s, reason: not valid java name */
    public Object m5077toggleShiftExtensiongIAlus(boolean z, ContinuationImpl continuationImpl) {
        ShiftExtensionRepository$toggleShiftExtension$1 shiftExtensionRepository$toggleShiftExtension$1;
        int i = 2 % 2;
        if (continuationImpl instanceof ShiftExtensionRepository$toggleShiftExtension$1) {
            int i2 = read + 43;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            shiftExtensionRepository$toggleShiftExtension$1 = (ShiftExtensionRepository$toggleShiftExtension$1) continuationImpl;
            int i4 = shiftExtensionRepository$toggleShiftExtension$1.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                shiftExtensionRepository$toggleShiftExtension$1.write = i4 - Integer.MIN_VALUE;
                int i5 = RemoteActionCompatParcelizer + 73;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                shiftExtensionRepository$toggleShiftExtension$1 = new ShiftExtensionRepository$toggleShiftExtension$1(this, continuationImpl);
            }
        } else {
            shiftExtensionRepository$toggleShiftExtension$1 = new ShiftExtensionRepository$toggleShiftExtension$1(this, continuationImpl);
        }
        Object obj = shiftExtensionRepository$toggleShiftExtension$1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = shiftExtensionRepository$toggleShiftExtension$1.write;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) this.serializer;
            ShiftExtensionRepository$toggleShiftExtension$2 shiftExtensionRepository$toggleShiftExtension$2 = new ShiftExtensionRepository$toggleShiftExtension$2(this, z, null);
            shiftExtensionRepository$toggleShiftExtension$1.write = 1;
            Object objM4875invokegIAlus = executeApiRequest.m4875invokegIAlus(shiftExtensionRepository$toggleShiftExtension$2, shiftExtensionRepository$toggleShiftExtension$1);
            return objM4875invokegIAlus == coroutineSingletons ? coroutineSingletons : objM4875invokegIAlus;
        }
        int i8 = RemoteActionCompatParcelizer + 111;
        read = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0 ? i7 != 1 : i7 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return ((onItemDismiss) obj).IconCompatParcelizer;
    }

    public H$b(BrazeExternalSyntheticLambda5 brazeExternalSyntheticLambda5) {
        this.IconCompatParcelizer = 25;
        brazeExternalSyntheticLambda5.getClass();
        this.serializer = brazeExternalSyntheticLambda5;
        this.write = new isAdapterPositionOnScreen(new getSessionParameters(2));
    }

    public H$b(ContextScope contextScope) {
        this.IconCompatParcelizer = 5;
        this.serializer = contextScope;
        this.write = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
    }

    public H$b(NafathTimerDataStore nafathTimerDataStore, Clock clock) {
        this.IconCompatParcelizer = 21;
        nafathTimerDataStore.getClass();
        clock.getClass();
        this.serializer = nafathTimerDataStore;
        this.write = clock;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public Object m5076invokegIAlus(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ContinuationImpl continuationImpl) {
        ExecuteOtpApiRequest$invoke$1 executeOtpApiRequest$invoke$1;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof ExecuteOtpApiRequest$invoke$1) {
            executeOtpApiRequest$invoke$1 = (ExecuteOtpApiRequest$invoke$1) continuationImpl;
            int i4 = executeOtpApiRequest$invoke$1.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = read + 83;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                executeOtpApiRequest$invoke$1.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                executeOtpApiRequest$invoke$1 = new ExecuteOtpApiRequest$invoke$1(this, continuationImpl);
            }
        } else {
            executeOtpApiRequest$invoke$1 = new ExecuteOtpApiRequest$invoke$1(this, continuationImpl);
        }
        Object objWithContext = executeOtpApiRequest$invoke$1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = executeOtpApiRequest$invoke$1.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            ((inCompatibilityMode) ((isOpenInternalroom_runtime) this.write)).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
            RxConvertKt$asFlow$1 rxConvertKt$asFlow$1 = new RxConvertKt$asFlow$1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, this, shortNewsContentCardView, 4);
            executeOtpApiRequest$invoke$1.IconCompatParcelizer = 1;
            objWithContext = BuildersKt.withContext(defaultIoScheduler, rxConvertKt$asFlow$1, executeOtpApiRequest$invoke$1);
            if (objWithContext == coroutineSingletons) {
                int i8 = read + 81;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = read + 121;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        }
        return ((onItemDismiss) objWithContext).IconCompatParcelizer;
    }

    public H$b(DataProviderEngineRegistrationServiceImpl dataProviderEngineRegistrationServiceImpl) {
        this.IconCompatParcelizer = 6;
        this.serializer = dataProviderEngineRegistrationServiceImpl;
        this.write = new x(29);
    }

    public H$b(WorkManagerImpl workManagerImpl, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.IconCompatParcelizer = 12;
        workManagerImpl.getClass();
        isopeninternalroom_runtime.getClass();
        this.serializer = workManagerImpl;
        this.write = isopeninternalroom_runtime;
    }

    public H$b(MapboxMap mapboxMap) {
        this.IconCompatParcelizer = 4;
        this.serializer = mapboxMap;
        this.write = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(0) { // from class: com.mapbox.navigation.ui.maps.building.api.MapboxBuildingsApi$mainJobController$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                return new JobControl(onbackinvokedlambda0Serializer, YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer, MainDispatcherLoader.read)));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    public Object record(long j, long j2, ContinuationImpl continuationImpl) {
        pc pcVar;
        int i = 2 % 2;
        if (continuationImpl instanceof pc) {
            pcVar = (pc) continuationImpl;
            int i2 = pcVar.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = RemoteActionCompatParcelizer + 21;
                read = i3 % Fields.SpotShadowColor;
                pcVar.read = i3 % 2 != 0 ? i2 / Integer.MIN_VALUE : i2 - Integer.MIN_VALUE;
            } else {
                pcVar = new pc(this, continuationImpl);
            }
        } else {
            pcVar = new pc(this, continuationImpl);
        }
        Object obj = pcVar.write;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = pcVar.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            NafathTimerDataStore nafathTimerDataStore = (NafathTimerDataStore) this.serializer;
            q3ExternalSyntheticLambda1 q3externalsyntheticlambda1 = new q3ExternalSyntheticLambda1(j2, j);
            pcVar.RemoteActionCompatParcelizer = j2;
            pcVar.read = 1;
            Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(nafathTimerDataStore.serializer, new NafathTimerDataStore$set$2(nafathTimerDataStore, q3externalsyntheticlambda1, shortNewsContentCardView, 0), pcVar);
            if (objSerializer != obj2) {
                objSerializer = createFromParcel.INSTANCE;
            }
            if (objSerializer == obj2) {
                int i5 = read + 31;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return obj2;
                }
                throw null;
            }
        } else {
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i6 = read + 5;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return null;
            }
            int i8 = RemoteActionCompatParcelizer + 59;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            j2 = pcVar.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return new Long(j2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object getOrRecordStartTime(long j, ContinuationImpl continuationImpl) {
        pd pdVar;
        long j2;
        long j3;
        int i = 2 % 2;
        if (continuationImpl instanceof pd) {
            int i2 = RemoteActionCompatParcelizer + 95;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            pdVar = (pd) continuationImpl;
            int i4 = pdVar.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pdVar.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                pdVar = new pd(this, continuationImpl);
            }
        } else {
            pdVar = new pd(this, continuationImpl);
        }
        pd pdVar2 = pdVar;
        Object objSavedStartedAt = pdVar2.write;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = pdVar2.IconCompatParcelizer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objSavedStartedAt);
            long epochSecond = ((Clock) this.write).instant().getEpochSecond();
            pdVar2.RemoteActionCompatParcelizer = j;
            pdVar2.read = epochSecond;
            pdVar2.IconCompatParcelizer = 1;
            objSavedStartedAt = savedStartedAt(j, pdVar2);
            if (objSavedStartedAt != obj) {
                j2 = epochSecond;
                j3 = j;
            }
        }
        int i6 = RemoteActionCompatParcelizer;
        int i7 = i6 + 121;
        read = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        if (i5 != 1) {
            int i9 = i6 + 61;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (i5 == 2) {
                int i11 = i6 + 25;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(objSavedStartedAt);
                return objSavedStartedAt;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i13 = read + 43;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            return null;
        }
        long j4 = pdVar2.read;
        long j5 = pdVar2.RemoteActionCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(objSavedStartedAt);
        j2 = j4;
        j3 = j5;
        Long l = (Long) objSavedStartedAt;
        if (l != null) {
            return new Long(l.longValue());
        }
        pdVar2.RemoteActionCompatParcelizer = j3;
        pdVar2.read = j2;
        pdVar2.IconCompatParcelizer = 2;
        Object objRecord = record(j3, j2, pdVar2);
        return objRecord == obj ? obj : objRecord;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public Object savedStartedAt(long j, ContinuationImpl continuationImpl) {
        pe peVar;
        int i = 2 % 2;
        if (continuationImpl instanceof pe) {
            int i2 = RemoteActionCompatParcelizer + 1;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            peVar = (pe) continuationImpl;
            int i4 = peVar.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = read + 71;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                peVar.read = i4 - Integer.MIN_VALUE;
            } else {
                peVar = new pe(this, continuationImpl);
            }
        } else {
            peVar = new pe(this, continuationImpl);
        }
        Object objFirstOrNull = peVar.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = peVar.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            NafathTimerDataStore nafathTimerDataStore = (NafathTimerDataStore) this.serializer;
            SettingsViewModel$special$$inlined$map$1 settingsViewModel$special$$inlined$map$1 = new SettingsViewModel$special$$inlined$map$1(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(nafathTimerDataStore.serializer.serializer(), new SignInDataStore$get$1(3, 4, shortNewsContentCardView)), 12, nafathTimerDataStore);
            ((inCompatibilityMode) nafathTimerDataStore.read).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Flow flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(settingsViewModel$special$$inlined$map$1, DefaultIoScheduler.RemoteActionCompatParcelizer);
            peVar.serializer = j;
            peVar.read = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowRemoteActionCompatParcelizer, peVar);
            if (objFirstOrNull == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = read + 33;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            j = peVar.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        }
        q3ExternalSyntheticLambda1 q3externalsyntheticlambda1 = (q3ExternalSyntheticLambda1) objFirstOrNull;
        if (q3externalsyntheticlambda1 != null) {
            if (q3externalsyntheticlambda1.expiresAtEpochSeconds != j) {
                int i10 = RemoteActionCompatParcelizer + 29;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                q3externalsyntheticlambda1 = null;
            }
            if (q3externalsyntheticlambda1 != null) {
                return new Long(q3externalsyntheticlambda1.startedAtEpochSeconds);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00db  */
    /* JADX WARN: Code duplicated, block: B:39:0x0184  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00db -> B:29:0x00e1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object invoke(java.util.List r30, java.lang.String r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sentiance.core.model.events.H$b.invoke(java.util.List, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public Object invoke(Cipher cipher, ContinuationImpl continuationImpl) throws Throwable {
        SemanticsPropertiesKtgetScrollViewportLength1 semanticsPropertiesKtgetScrollViewportLength1;
        int i = 2 % 2;
        int i2 = read + 65;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof SemanticsPropertiesKtgetScrollViewportLength1) {
            semanticsPropertiesKtgetScrollViewportLength1 = (SemanticsPropertiesKtgetScrollViewportLength1) continuationImpl;
            int i4 = semanticsPropertiesKtgetScrollViewportLength1.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = RemoteActionCompatParcelizer + 67;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                semanticsPropertiesKtgetScrollViewportLength1.read = i4 - Integer.MIN_VALUE;
            } else {
                semanticsPropertiesKtgetScrollViewportLength1 = new SemanticsPropertiesKtgetScrollViewportLength1(this, continuationImpl);
            }
        } else {
            semanticsPropertiesKtgetScrollViewportLength1 = new SemanticsPropertiesKtgetScrollViewportLength1(this, continuationImpl);
        }
        Object objWithContext = semanticsPropertiesKtgetScrollViewportLength1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = semanticsPropertiesKtgetScrollViewportLength1.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            try {
                byte[] bArrDecode = Base64.decode(((setTextCompositionRangepsREZIo) this.serializer).RemoteActionCompatParcelizer().getString("SHARED_PREF_BIOMETRIC_PASSWORD", null), 0);
                bArrDecode.getClass();
                semanticsPropertiesKtgetScrollViewportLength1.read = 1;
                ((inCompatibilityMode) ((isOpenInternalroom_runtime) this.write)).getClass();
                objWithContext = BuildersKt.withContext(prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer, new LocalAuthDataSource.AnonymousClass2(cipher, bArrDecode, shortNewsContentCardView, 3), semanticsPropertiesKtgetScrollViewportLength1);
                if (objWithContext == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th) {
                throw new getTestTagsAsResourceIddelegate(th);
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        }
        byte[] bArr = (byte[]) objWithContext;
        bArr.getClass();
        return setCarryoverInAppMessage.RemoteActionCompatParcelizer(bArr);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014e, code lost:
    
        if (r5.invoke(r1, r3) == r4) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sentiance.core.model.events.H$b.invoke(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
