package com.roadrunner.auth.data;

import android.app.Application;
import android.graphics.Color;
import android.net.Uri;
import android.util.Base64;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.TextStyle;
import androidx.room.RoomDatabase;
import coil3.ExtrasKt;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.customerchat.selfservice.presentation.BridgeManager$trackEvent$2;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.data.repository.CrowdSourcingImageRepositoryImpl;
import com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureRepository;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.mapper.TransferChangeViewStateMapper$map$2;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.face.verification.api.navigation.IdentityVerificationParams;
import com.roadrunner.face.verification.data.SelfieFlowRepository;
import com.roadrunner.face.verification.domain.UploadSelfieUseCase$invoke$1;
import com.roadrunner.home.nest.NestLoadingServiceImpl;
import com.roadrunner.home.nest.config.GetNestScope$invoke$3;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;
import com.roadrunner.inappnotifications.data.InAppNotificationsRepository;
import com.roadrunner.login.data.forgotpassword.ForgotPasswordRepository$forgotPassword$1;
import com.roadrunner.login.data.forgotpassword.ForgotPasswordRepository$generateMagicLink$1;
import com.roadrunner.login.data.forgotpassword.ForgotPasswordRepository$generateMagicLink$2;
import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import com.sentiance.core.model.events.E$b;
import com.sentiance.core.model.events.N$b;
import dagger.Lazy;
import io.sentry.SentryUUID;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.SerializationException;
import o.AndroidGraphicsContext2;
import o.BrazeImageUtilsExternalSyntheticLambda21;
import o.IBraze;
import o.PreferenceGroupAdapter;
import o.SemanticsPropertiesTraversalIndex1;
import o.ShortNewsContentCardView;
import o.SweepGradientShader9KIMszodefault;
import o.accessgetSubscriptcp;
import o.applyLayoutFeatures;
import o.bindViewHolder;
import o.calculateOcclusions;
import o.clearFocusdefault;
import o.getContentType;
import o.getContentViewGroupParentLayout;
import o.getNoActiveChildannotations;
import o.getPendingTablesruntime;
import o.getPositionInRoot;
import o.getSuccessfulruntime;
import o.getTestTagsAsResourceIddelegate;
import o.inCompatibilityMode;
import o.isAdapterPositionOnScreen;
import o.isOpenInternalroom_runtime;
import o.isRoot;
import o.isSegmentInside;
import o.lottieComposition;
import o.mergeJsonObjects;
import o.n6;
import o.notifyItemInserted;
import o.onExitLayoutOrScroll;
import o.onItemDismiss;
import o.onLowMemory;
import o.openSessionlambda1;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.performLayout;
import o.prepareForActivityTransitionCarryover;
import o.processAppeared;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUXVkaZAuUQGBNIXILrAHYRyC1qs;
import o.r8lambdalVQGMqHtfjmEwPaE6dqnfDBlU;
import o.resetTransientState;
import o.scrollStep;
import o.setGraphicModalMaxWidthDp;
import o.setItemViewCacheSize;
import o.setRectOutlinetz77jQwdefault;
import o.setTextCompositionRangepsREZIo;
import o.setTransactionSuccessful;
import o.shouldIncreaseMaxIntrinsic;
import o.showTextSubstitution;
import o.sourceInformationContextOfdefault;
import o.startNestedScrollForType;
import o.stripNonMetricAffectingCharacterStyleSpans;
import o.throwSemanticsGetNotSupported;
import o.transferSessionPackageI;
import o.unpackInt1;
import o.unpackInt2;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SignInDataStore implements throwSemanticsGetNotSupported {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final Object RemoteActionCompatParcelizer;
    public Object read;
    public final Object serializer;

    public SignInDataStore(N$b n$b) {
        onLowMemory onlowmemory = new onLowMemory();
        this.serializer = onlowmemory;
        this.RemoteActionCompatParcelizer = n$b;
        AndroidGraphicsContext2 androidGraphicsContext2 = new AndroidGraphicsContext2();
        this.read = androidGraphicsContext2;
        int i = 1;
        onlowmemory.RemoteActionCompatParcelizer(androidGraphicsContext2, new BrazeImageUtilsExternalSyntheticLambda21(new calculateOcclusions(this, 0), i));
        onlowmemory.RemoteActionCompatParcelizer((AndroidGraphicsContext2) n$b.serializer, new BrazeImageUtilsExternalSyntheticLambda21(new calculateOcclusions(this, i), i));
    }

    public static SignInDataStore serializer(mergeJsonObjects mergejsonobjects, applyLayoutFeatures applylayoutfeatures, PreferenceGroupAdapter preferenceGroupAdapter) {
        int i = 2 % 2;
        SignInDataStore signInDataStore = new SignInDataStore(mergejsonobjects, applylayoutfeatures, preferenceGroupAdapter);
        int i2 = write + 83;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return signInDataStore;
        }
        throw null;
    }

    public static Object read(SignInDataStore signInDataStore, r8lambdaUXVkaZAuUQGBNIXILrAHYRyC1qs r8lambdauxvkazauuqgbnixilrahyryc1qs, String str, double d, String str2, SuspendLambda suspendLambda, int i) {
        int i2 = 2 % 2;
        int i3 = write;
        int i4 = i3 + 105;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if ((i & 4) != 0) {
            int i6 = i3 + 47;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            d = i6 % 2 == 0 ? 1.0d : 0.0d;
        }
        double d2 = d;
        if ((i & 8) != 0) {
            str2 = "--";
        }
        ((inCompatibilityMode) ((isOpenInternalroom_runtime) signInDataStore.read)).getClass();
        return BuildersKt.withContext(prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer, new TransferChangeViewStateMapper$map$2(r8lambdauxvkazauuqgbnixilrahyryc1qs, signInDataStore, d2, str2, str, null), suspendLambda);
    }

    public /* synthetic */ SignInDataStore(Object obj, Object obj2, Object obj3) {
        this.serializer = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.read = obj3;
    }

    public SignInDataStore(IsFixableByRetry isFixableByRetry, g0 g0Var, n0 n0Var) {
        isFixableByRetry.getClass();
        g0Var.getClass();
        n0Var.getClass();
        this.serializer = isFixableByRetry;
        this.RemoteActionCompatParcelizer = g0Var;
        this.read = n0Var;
    }

    public SignInDataStore(transferSessionPackageI transfersessionpackagei, showTextSubstitution showtextsubstitution, setTextCompositionRangepsREZIo settextcompositionrangepsrezio) {
        transfersessionpackagei.getClass();
        showtextsubstitution.getClass();
        settextcompositionrangepsrezio.getClass();
        this.serializer = transfersessionpackagei;
        this.RemoteActionCompatParcelizer = showtextsubstitution;
        this.read = settextcompositionrangepsrezio;
    }

    public SignInDataStore(ExecuteApiRequest executeApiRequest, getSuccessfulruntime getsuccessfulruntime, lottieComposition lottiecomposition) {
        executeApiRequest.getClass();
        getsuccessfulruntime.getClass();
        lottiecomposition.getClass();
        this.serializer = executeApiRequest;
        this.RemoteActionCompatParcelizer = getsuccessfulruntime;
        this.read = lottiecomposition;
    }

    @Override // o.throwSemanticsGetNotSupported
    public Cipher read() throws InvalidKeyException, getTestTagsAsResourceIddelegate, InvalidAlgorithmParameterException {
        int i = 2 % 2;
        Object obj = null;
        try {
            byte[] bArrDecode = Base64.decode(((setTextCompositionRangepsREZIo) this.read).RemoteActionCompatParcelizer().getString("SHARED_PREF_BIOMETRIC_IV", null), 0);
            bArrDecode.getClass();
            Object objWrite = ((Lazy) this.serializer).write();
            objWrite.getClass();
            Cipher cipher = (Cipher) objWrite;
            cipher.init(2, (Key) ((Lazy) this.RemoteActionCompatParcelizer).write(), new IvParameterSpec(bArrDecode));
            int i2 = IconCompatParcelizer + 99;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return cipher;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            throw new getTestTagsAsResourceIddelegate(th);
        }
    }

    public SignInDataStore(setTransactionSuccessful settransactionsuccessful) {
        settransactionsuccessful.getClass();
        this.serializer = settransactionsuccessful;
        final int i = 0;
        this.read = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.PrefetchException
            private static int IconCompatParcelizer = 0;
            private static int read = 1;
            public final /* synthetic */ SignInDataStore write;

            {
                this.write = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = read + 107;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                int i5 = i;
                SignInDataStore signInDataStore = this.write;
                Object obj = null;
                if (i5 != 0) {
                    String strIconCompatParcelizer = ((setTransactionSuccessful) signInDataStore.serializer).IconCompatParcelizer(com.logistics.rider.glovo.R.string.delivery_duplicated_delivery_notification_body);
                    int i6 = IconCompatParcelizer + 99;
                    read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        return strIconCompatParcelizer;
                    }
                    obj.hashCode();
                    throw null;
                }
                String strIconCompatParcelizer2 = ((setTransactionSuccessful) signInDataStore.serializer).IconCompatParcelizer(com.logistics.rider.glovo.R.string.delivery_duplicated_delivery_notification_title);
                int i7 = IconCompatParcelizer + 63;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return strIconCompatParcelizer2;
                }
                obj.hashCode();
                throw null;
            }
        });
        final int i2 = 1;
        this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.PrefetchException
            private static int IconCompatParcelizer = 0;
            private static int read = 1;
            public final /* synthetic */ SignInDataStore write;

            {
                this.write = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = read + 107;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i2;
                SignInDataStore signInDataStore = this.write;
                Object obj = null;
                if (i6 != 0) {
                    String strIconCompatParcelizer = ((setTransactionSuccessful) signInDataStore.serializer).IconCompatParcelizer(com.logistics.rider.glovo.R.string.delivery_duplicated_delivery_notification_body);
                    int i7 = IconCompatParcelizer + 99;
                    read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        return strIconCompatParcelizer;
                    }
                    obj.hashCode();
                    throw null;
                }
                String strIconCompatParcelizer2 = ((setTransactionSuccessful) signInDataStore.serializer).IconCompatParcelizer(com.logistics.rider.glovo.R.string.delivery_duplicated_delivery_notification_title);
                int i8 = IconCompatParcelizer + 63;
                read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    return strIconCompatParcelizer2;
                }
                obj.hashCode();
                throw null;
            }
        });
    }

    public SignInDataStore(SelfieFlowRepository selfieFlowRepository, onExitLayoutOrScroll onexitlayoutorscroll, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        selfieFlowRepository.getClass();
        onexitlayoutorscroll.getClass();
        isopeninternalroom_runtime.getClass();
        this.serializer = selfieFlowRepository;
        this.RemoteActionCompatParcelizer = onexitlayoutorscroll;
        this.read = isopeninternalroom_runtime;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX INFO: renamed from: forgotPassword-gIAlu-s, reason: not valid java name */
    public Object m4864forgotPasswordgIAlus(getPendingTablesruntime getpendingtablesruntime, ContinuationImpl continuationImpl) {
        ForgotPasswordRepository$forgotPassword$1 forgotPasswordRepository$forgotPassword$1;
        int i = 2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (continuationImpl instanceof ForgotPasswordRepository$forgotPassword$1) {
            int i2 = IconCompatParcelizer + 119;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = ((ForgotPasswordRepository$forgotPassword$1) continuationImpl).write;
                throw null;
            }
            forgotPasswordRepository$forgotPassword$1 = (ForgotPasswordRepository$forgotPassword$1) continuationImpl;
            int i4 = forgotPasswordRepository$forgotPassword$1.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                forgotPasswordRepository$forgotPassword$1.write = i4 - Integer.MIN_VALUE;
                int i5 = write + 65;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                forgotPasswordRepository$forgotPassword$1 = new ForgotPasswordRepository$forgotPassword$1(this, continuationImpl);
            }
        } else {
            forgotPasswordRepository$forgotPassword$1 = new ForgotPasswordRepository$forgotPassword$1(this, continuationImpl);
        }
        Object obj = forgotPasswordRepository$forgotPassword$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = forgotPasswordRepository$forgotPassword$1.write;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) this.serializer;
            AuthRepository$logoutUser$2 authRepository$logoutUser$2 = new AuthRepository$logoutUser$2(this, getpendingtablesruntime, shortNewsContentCardView, 20);
            forgotPasswordRepository$forgotPassword$1.write = 1;
            Object objM4875invokegIAlus = executeApiRequest.m4875invokegIAlus(authRepository$logoutUser$2, forgotPasswordRepository$forgotPassword$1);
            return objM4875invokegIAlus == coroutineSingletons ? coroutineSingletons : objM4875invokegIAlus;
        }
        int i8 = write + 71;
        IconCompatParcelizer = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        if (i7 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    public SignInDataStore(IBraze iBraze, NestComponentRepositoryImpl nestComponentRepositoryImpl) {
        iBraze.getClass();
        nestComponentRepositoryImpl.getClass();
        this.serializer = iBraze;
        this.RemoteActionCompatParcelizer = nestComponentRepositoryImpl;
    }

    public SignInDataStore(Lazy lazy, Lazy lazy2, setTextCompositionRangepsREZIo settextcompositionrangepsrezio) {
        lazy.getClass();
        lazy2.getClass();
        settextcompositionrangepsrezio.getClass();
        this.serializer = lazy;
        this.RemoteActionCompatParcelizer = lazy2;
        this.read = settextcompositionrangepsrezio;
    }

    public SignInDataStore(EntrancePictureRepository entrancePictureRepository, n6 n6Var, unpackInt2 unpackint2) {
        entrancePictureRepository.getClass();
        n6Var.getClass();
        unpackint2.getClass();
        this.serializer = entrancePictureRepository;
        this.RemoteActionCompatParcelizer = n6Var;
        this.read = unpackint2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: generateMagicLink-hUnOzRk, reason: not valid java name */
    public Object m4865generateMagicLinkhUnOzRk(String str, String str2, String str3, String str4, String str5, ContinuationImpl continuationImpl) {
        ForgotPasswordRepository$generateMagicLink$1 forgotPasswordRepository$generateMagicLink$1;
        int i = 2 % 2;
        if (continuationImpl instanceof ForgotPasswordRepository$generateMagicLink$1) {
            forgotPasswordRepository$generateMagicLink$1 = (ForgotPasswordRepository$generateMagicLink$1) continuationImpl;
            int i2 = forgotPasswordRepository$generateMagicLink$1.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                forgotPasswordRepository$generateMagicLink$1.read = i2 - Integer.MIN_VALUE;
            } else {
                forgotPasswordRepository$generateMagicLink$1 = new ForgotPasswordRepository$generateMagicLink$1(this, continuationImpl);
            }
        } else {
            forgotPasswordRepository$generateMagicLink$1 = new ForgotPasswordRepository$generateMagicLink$1(this, continuationImpl);
        }
        ForgotPasswordRepository$generateMagicLink$1 forgotPasswordRepository$generateMagicLink$2 = forgotPasswordRepository$generateMagicLink$1;
        Object obj = forgotPasswordRepository$generateMagicLink$2.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = forgotPasswordRepository$generateMagicLink$2.read;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) this.serializer;
            ForgotPasswordRepository$generateMagicLink$2 forgotPasswordRepository$generateMagicLink$3 = new ForgotPasswordRepository$generateMagicLink$2(this, str, str2, str3, str4, str5, null);
            forgotPasswordRepository$generateMagicLink$2.read = 1;
            Object objM4875invokegIAlus = executeApiRequest.m4875invokegIAlus(forgotPasswordRepository$generateMagicLink$3, forgotPasswordRepository$generateMagicLink$2);
            return objM4875invokegIAlus == coroutineSingletons ? coroutineSingletons : objM4875invokegIAlus;
        }
        int i4 = IconCompatParcelizer;
        int i5 = i4 + 97;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        if (i3 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i7 = i4 + 19;
        write = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
        int i9 = write + 45;
        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            int i10 = 21 / 0;
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: invoke-BWLJW6A, reason: not valid java name */
    public Object m4866invokeBWLJW6A(IdentityVerificationParams identityVerificationParams, String str, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        UploadSelfieUseCase$invoke$1 uploadSelfieUseCase$invoke$1;
        int i = 2 % 2;
        if (continuationImpl instanceof UploadSelfieUseCase$invoke$1) {
            uploadSelfieUseCase$invoke$1 = (UploadSelfieUseCase$invoke$1) continuationImpl;
            int i2 = uploadSelfieUseCase$invoke$1.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = IconCompatParcelizer + 19;
                write = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                uploadSelfieUseCase$invoke$1.write = i2 - Integer.MIN_VALUE;
            } else {
                uploadSelfieUseCase$invoke$1 = new UploadSelfieUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            uploadSelfieUseCase$invoke$1 = new UploadSelfieUseCase$invoke$1(this, continuationImpl);
        }
        Object objWithContext = uploadSelfieUseCase$invoke$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = uploadSelfieUseCase$invoke$1.write;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            ((inCompatibilityMode) ((isOpenInternalroom_runtime) this.read)).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
            RoomDatabase.AnonymousClass1.C00051 c00051 = new RoomDatabase.AnonymousClass1.C00051(this, str, identityVerificationParams, z, (ShortNewsContentCardView) null);
            uploadSelfieUseCase$invoke$1.write = 1;
            objWithContext = BuildersKt.withContext(defaultIoScheduler, c00051, uploadSelfieUseCase$invoke$1);
            if (objWithContext == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i6 = IconCompatParcelizer + 39;
                write = i6 % Fields.SpotShadowColor;
                Object obj = null;
                if (i6 % 2 == 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            int i7 = IconCompatParcelizer + 117;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        }
        return ((onItemDismiss) objWithContext).IconCompatParcelizer;
    }

    public SignInDataStore(InAppNotificationsRepository inAppNotificationsRepository, E$b e$b, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        inAppNotificationsRepository.getClass();
        e$b.getClass();
        isopeninternalroom_runtime.getClass();
        this.serializer = inAppNotificationsRepository;
        this.RemoteActionCompatParcelizer = e$b;
        this.read = isopeninternalroom_runtime;
    }

    public static final String serializer(SignInDataStore signInDataStore, Uri uri, String str) throws IOException {
        int i = 2 % 2;
        signInDataStore.getClass();
        String strConcat = str.concat(".jpg");
        Application application = (Application) signInDataStore.serializer;
        File file = new File(application.getCacheDir(), strConcat);
        InputStream inputStreamOpenInputStream = application.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "Cannot open input stream for uri: "));
            int i2 = IconCompatParcelizer + 83;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return null;
        }
        try {
            FileOutputStream fileOutputStreamWrite = getPositionInRoot.write(new FileOutputStream(file), file);
            try {
                SentryUUID.RemoteActionCompatParcelizer(inputStreamOpenInputStream, fileOutputStreamWrite);
                fileOutputStreamWrite.close();
                inputStreamOpenInputStream.close();
                String string = clearFocusdefault.write(application, file, (String) signInDataStore.read).toString();
                string.getClass();
                return string;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    int i4 = sourceInformationContextOfdefault.read();
                    int i5 = sourceInformationContextOfdefault.read();
                    int i6 = sourceInformationContextOfdefault.read();
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i4, i5, -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileOutputStreamWrite, th}, i6);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                int i7 = sourceInformationContextOfdefault.read();
                int i8 = sourceInformationContextOfdefault.read();
                int i9 = sourceInformationContextOfdefault.read();
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i7, i8, -871780639, sourceInformationContextOfdefault.read(), new Object[]{inputStreamOpenInputStream, th3}, i9);
                throw th4;
            }
        }
    }

    public SignInDataStore(stripNonMetricAffectingCharacterStyleSpans stripnonmetricaffectingcharacterstylespans, shouldIncreaseMaxIntrinsic shouldincreasemaxintrinsic) {
        this.serializer = stripnonmetricaffectingcharacterstylespans;
        this.RemoteActionCompatParcelizer = shouldincreasemaxintrinsic;
        this.read = new isAdapterPositionOnScreen(new BrazeUser$$ExternalSyntheticLambda28(25, this));
    }

    public SignInDataStore(accessgetSubscriptcp accessgetsubscriptcp, p0 p0Var, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        accessgetsubscriptcp.getClass();
        p0Var.getClass();
        isopeninternalroom_runtime.getClass();
        this.serializer = accessgetsubscriptcp;
        this.RemoteActionCompatParcelizer = p0Var;
        this.read = isopeninternalroom_runtime;
    }

    public SignInDataStore(Application application, isOpenInternalroom_runtime isopeninternalroom_runtime, String str) {
        application.getClass();
        isopeninternalroom_runtime.getClass();
        str.getClass();
        this.serializer = application;
        this.RemoteActionCompatParcelizer = isopeninternalroom_runtime;
        this.read = str;
    }

    public SignInDataStore(NestComponentRepositoryImpl nestComponentRepositoryImpl, transferSessionPackageI transfersessionpackagei, p0 p0Var) {
        nestComponentRepositoryImpl.getClass();
        transfersessionpackagei.getClass();
        p0Var.getClass();
        this.serializer = nestComponentRepositoryImpl;
        this.RemoteActionCompatParcelizer = transfersessionpackagei;
        this.read = p0Var;
    }

    public SignInDataStore(NestComponentRepositoryImpl nestComponentRepositoryImpl, transferSessionPackageI transfersessionpackagei, IsFixableByRetry isFixableByRetry) {
        nestComponentRepositoryImpl.getClass();
        transfersessionpackagei.getClass();
        isFixableByRetry.getClass();
        this.serializer = nestComponentRepositoryImpl;
        this.RemoteActionCompatParcelizer = transfersessionpackagei;
        this.read = isFixableByRetry;
    }

    public SignInDataStore(setTransactionSuccessful settransactionsuccessful, openSessionlambda1 opensessionlambda1, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        settransactionsuccessful.getClass();
        opensessionlambda1.getClass();
        isopeninternalroom_runtime.getClass();
        this.serializer = settransactionsuccessful;
        this.RemoteActionCompatParcelizer = opensessionlambda1;
        this.read = isopeninternalroom_runtime;
    }

    public SignInDataStore(isSegmentInside issegmentinside, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        getcontentviewgroupparentlayout.getClass();
        this.serializer = issegmentinside;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(SmallPersistentVector.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.read = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new BridgeManager$trackEvent$2(this, getcontentviewgroupparentlayout, (ShortNewsContentCardView) null, 13), 3);
    }

    public SignInDataStore(NestComponentRepositoryImpl nestComponentRepositoryImpl, NestLoadingServiceImpl nestLoadingServiceImpl, n0 n0Var) {
        nestComponentRepositoryImpl.getClass();
        nestLoadingServiceImpl.getClass();
        n0Var.getClass();
        this.serializer = nestComponentRepositoryImpl;
        this.RemoteActionCompatParcelizer = nestLoadingServiceImpl;
        this.read = n0Var;
    }

    public SignInDataStore(NestComponentRepositoryImpl nestComponentRepositoryImpl, AnalyticsServiceImpl analyticsServiceImpl, unpackInt1 unpackint1) {
        nestComponentRepositoryImpl.getClass();
        analyticsServiceImpl.getClass();
        unpackint1.getClass();
        this.serializer = nestComponentRepositoryImpl;
        this.RemoteActionCompatParcelizer = analyticsServiceImpl;
        this.read = unpackint1;
    }

    public SignInDataStore(AnalyticsServiceImpl analyticsServiceImpl, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        getcontentviewgroupparentlayout.getClass();
        this.serializer = analyticsServiceImpl;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(SmallPersistentVector.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.read = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new SignInDataStore$set$2(this, getcontentviewgroupparentlayout, (ShortNewsContentCardView) null, 20), 3);
    }

    public SignInDataStore(performCustomExitMxy_nc0 performcustomexitmxy_nc0) {
        performcustomexitmxy_nc0.getClass();
        this.serializer = performcustomexitmxy_nc0;
        this.RemoteActionCompatParcelizer = new isRoot("preference_key_sign_in_data");
        this.read = new isAdapterPositionOnScreen(new setRectOutlinetz77jQwdefault(29));
    }

    public SignInDataStore(CrowdSourcingImageRepositoryImpl crowdSourcingImageRepositoryImpl, r8lambdalVQGMqHtfjmEwPaE6dqnfDBlU r8lambdalvqgmqhtfjmewpae6dqnfdblu, transferSessionPackageI transfersessionpackagei) {
        crowdSourcingImageRepositoryImpl.getClass();
        r8lambdalvqgmqhtfjmewpae6dqnfdblu.getClass();
        transfersessionpackagei.getClass();
        this.serializer = crowdSourcingImageRepositoryImpl;
        this.RemoteActionCompatParcelizer = r8lambdalvqgmqhtfjmewpae6dqnfdblu;
        this.read = transfersessionpackagei;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036 A[PHI: r1 r4
  0x0036: PHI (r1v8 o.SemanticsPropertiesTraversalIndex1) = (r1v7 o.SemanticsPropertiesTraversalIndex1), (r1v10 o.SemanticsPropertiesTraversalIndex1) binds: [B:10:0x0034, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0036: PHI (r4v5 int) = (r4v4 int), (r4v7 int) binds: [B:10:0x0034, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    public static final Object access$decodeFromJson(SignInDataStore signInDataStore, String str, ContinuationImpl continuationImpl) {
        SemanticsPropertiesTraversalIndex1 semanticsPropertiesTraversalIndex1;
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = write;
        int i5 = i4 + 21;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        performCustomExitMxy_nc0 performcustomexitmxy_nc0 = (performCustomExitMxy_nc0) signInDataStore.serializer;
        if (continuationImpl instanceof SemanticsPropertiesTraversalIndex1) {
            int i7 = i4 + 65;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                semanticsPropertiesTraversalIndex1 = (SemanticsPropertiesTraversalIndex1) continuationImpl;
                i = semanticsPropertiesTraversalIndex1.write;
                int i8 = 63 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    semanticsPropertiesTraversalIndex1.write = i - Integer.MIN_VALUE;
                } else {
                    semanticsPropertiesTraversalIndex1 = new SemanticsPropertiesTraversalIndex1(signInDataStore, continuationImpl);
                }
            } else {
                semanticsPropertiesTraversalIndex1 = (SemanticsPropertiesTraversalIndex1) continuationImpl;
                i = semanticsPropertiesTraversalIndex1.write;
                if ((i & Integer.MIN_VALUE) != 0) {
                    semanticsPropertiesTraversalIndex1.write = i - Integer.MIN_VALUE;
                } else {
                    semanticsPropertiesTraversalIndex1 = new SemanticsPropertiesTraversalIndex1(signInDataStore, continuationImpl);
                }
            }
        } else {
            semanticsPropertiesTraversalIndex1 = new SemanticsPropertiesTraversalIndex1(signInDataStore, continuationImpl);
        }
        Object objFirstOrNull = semanticsPropertiesTraversalIndex1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = semanticsPropertiesTraversalIndex1.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i9 != 0) {
            if (i9 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            } else {
                if (i9 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i10 = write + 45;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            }
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        try {
            resetTransientState resettransientstate = (resetTransientState) ((isAdapterPositionOnScreen) signInDataStore.read).MediaSessionCompatResultReceiverWrapper();
            resettransientstate.getClass();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(getContentType.Companion.serializer());
            return (getContentType) resettransientstate.serializer(str, setgraphicmodalmaxwidthdp);
        } catch (SerializationException e) {
            Timber.RemoteActionCompatParcelizer.write(new SignInDataStoreException("Failed to decode sign in data from JSON", e));
            Flow flowSerializer = performcustomexitmxy_nc0.serializer();
            semanticsPropertiesTraversalIndex1.write = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowSerializer, semanticsPropertiesTraversalIndex1);
            if (objFirstOrNull == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        getNoActiveChildannotations getnoactivechildannotations = (getNoActiveChildannotations) objFirstOrNull;
        if (getnoactivechildannotations != null) {
            int i11 = IconCompatParcelizer + 77;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (!getnoactivechildannotations.read().isEmpty()) {
                SignInDataStore$clear$2 signInDataStore$clear$2 = new SignInDataStore$clear$2(i2, 3, shortNewsContentCardView);
                semanticsPropertiesTraversalIndex1.write = 2;
                if (pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0, signInDataStore$clear$2, semanticsPropertiesTraversalIndex1) == coroutineSingletons) {
                    int i13 = IconCompatParcelizer;
                    int i14 = i13 + 9;
                    write = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    int i16 = i13 + 123;
                    write = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    return coroutineSingletons;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    public notifyItemInserted read(startNestedScrollForType startnestedscrollfortype) {
        int color;
        TextStyle textStyleIconCompatParcelizer;
        int i = 2 % 2;
        int i2 = write + 3;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = startnestedscrollfortype.text;
        g0 g0Var = (g0) this.RemoteActionCompatParcelizer;
        Float f = startnestedscrollfortype.weight;
        g0Var.getClass();
        Float fWrite = g0.write(f);
        n0 n0Var = (n0) this.read;
        String str2 = startnestedscrollfortype.color;
        n0Var.getClass();
        str2.getClass();
        try {
            color = Color.parseColor(str2);
        } catch (IllegalArgumentException unused) {
            color = Color.parseColor("#000000");
        }
        IsFixableByRetry isFixableByRetry = (IsFixableByRetry) this.serializer;
        String str3 = startnestedscrollfortype.style;
        isFixableByRetry.getClass();
        str3.getClass();
        switch (str3) {
            case "text.body.small":
                textStyleIconCompatParcelizer = performLayout.write();
                break;
            case "text.body.big":
                textStyleIconCompatParcelizer = performLayout.serializer();
                break;
            case "text.title.small":
                textStyleIconCompatParcelizer = performLayout.MediaSessionCompatToken();
                break;
            case "text.title.medium":
                textStyleIconCompatParcelizer = performLayout.MediaSessionCompatResultReceiverWrapper();
                break;
            case "text.title.big":
                textStyleIconCompatParcelizer = performLayout.MediaSessionCompatQueueItem();
                break;
            case "text.body.medium":
                textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
                break;
            default:
                textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
                break;
        }
        return new notifyItemInserted(str, textStyleIconCompatParcelizer, color, fWrite);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object invoke$implementation(ContinuationImpl continuationImpl) throws Throwable {
        bindViewHolder bindviewholder;
        scrollStep scrollstep;
        int i = 2 % 2;
        int i2 = write + 41;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof bindViewHolder) {
            bindviewholder = (bindViewHolder) continuationImpl;
            int i4 = bindviewholder.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bindviewholder.write = i4 - Integer.MIN_VALUE;
            } else {
                bindviewholder = new bindViewHolder(this, continuationImpl);
            }
        } else {
            bindviewholder = new bindViewHolder(this, continuationImpl);
        }
        Object objWithContext = bindviewholder.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = bindviewholder.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            InAppNotificationsRepository inAppNotificationsRepository = (InAppNotificationsRepository) this.serializer;
            bindviewholder.write = 1;
            ((inCompatibilityMode) inAppNotificationsRepository.write).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new PushEventPublisherImpl$emit$1(inAppNotificationsRepository, shortNewsContentCardView, 8), bindviewholder);
            if (objWithContext != coroutineSingletons) {
            }
        }
        if (i5 != 1) {
            if (i5 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                return objWithContext;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        setItemViewCacheSize setitemviewcachesize = (setItemViewCacheSize) objWithContext;
        if (setitemviewcachesize != null) {
            int i6 = IconCompatParcelizer + 91;
            write = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                scrollstep = setitemviewcachesize.RemoteActionCompatParcelizer;
                int i7 = 75 / 0;
            } else {
                scrollstep = setitemviewcachesize.RemoteActionCompatParcelizer;
            }
        } else {
            scrollstep = null;
        }
        if (scrollstep != null) {
            if (!setitemviewcachesize.RemoteActionCompatParcelizer.content.pages.isEmpty()) {
                ((inCompatibilityMode) ((isOpenInternalroom_runtime) this.read)).getClass();
                DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                GetNestScope$invoke$3 getNestScope$invoke$3 = new GetNestScope$invoke$3(this, setitemviewcachesize, shortNewsContentCardView, 10);
                bindviewholder.write = 2;
                Object objWithContext2 = BuildersKt.withContext(defaultScheduler2, getNestScope$invoke$3, bindviewholder);
                return objWithContext2 == coroutineSingletons ? coroutineSingletons : objWithContext2;
            }
            int i8 = write + 109;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        return processAppeared.RemoteActionCompatParcelizer;
    }
}
