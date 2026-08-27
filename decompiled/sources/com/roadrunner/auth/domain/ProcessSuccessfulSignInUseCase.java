package com.roadrunner.auth.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.logistics.rider.glovo.R;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.auth.data.SignInDataStore$clear$2;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.provider.data.model.FetchRiderStatusImpl;
import com.roadrunner.twofa.presentation.TwoFaViewModel$onPinChanged$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.copyTextdefault;
import o.createFromParcel;
import o.getAllSemanticsNodesToMap;
import o.getContentDescription;
import o.getIsShowingTextSubstitution;
import o.getIsTraversalGroup;
import o.getMaxTextLength;
import o.getPaneTitledelegate;
import o.getStateDescription;
import o.getTraversalIndexdelegate;
import o.onAutofillTextdefault;
import o.onItemDismiss;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ProcessSuccessfulSignInUseCase {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final onAutofillTextdefault IconCompatParcelizer;
    public final getAllSemanticsNodesToMap MediaDescriptionCompat;
    public final SaveAuthSignInDataUseCase MediaMetadataCompat;
    public final getContentDescription RatingCompat;
    public final p0 RemoteActionCompatParcelizer;
    public final AppEventInfoChangeHandler read;
    public final FetchRiderStatusImpl serializer;
    public final FetchRemoteConfigUseCaseImpl write;

    /* JADX INFO: renamed from: com.roadrunner.auth.domain.ProcessSuccessfulSignInUseCase$invoke$3, reason: invalid class name */
    public final class AnonymousClass3 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;
        public final /* synthetic */ int IconCompatParcelizer;
        public int read;
        public final /* synthetic */ ProcessSuccessfulSignInUseCase serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass3(ProcessSuccessfulSignInUseCase processSuccessfulSignInUseCase, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(1, shortNewsContentCardView);
            this.IconCompatParcelizer = i;
            this.serializer = processSuccessfulSignInUseCase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = write + 21;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i3 = this.IconCompatParcelizer;
            ProcessSuccessfulSignInUseCase processSuccessfulSignInUseCase = this.serializer;
            if (i3 == 0) {
                return new AnonymousClass3(processSuccessfulSignInUseCase, shortNewsContentCardView, 0);
            }
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(processSuccessfulSignInUseCase, shortNewsContentCardView, 1);
            int i4 = write + 53;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return anonymousClass3;
            }
            obj.hashCode();
            throw null;
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = this.IconCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
            if (i2 == 0) {
                Object objInvokeSuspend = ((AnonymousClass3) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i3 = write + 69;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return objInvokeSuspend;
            }
            Object objInvokeSuspend2 = ((AnonymousClass3) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = RemoteActionCompatParcelizer + 43;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return objInvokeSuspend2;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM5013invokegIAlus;
            Object objM5029invokeIoAF18A;
            int i = 2 % 2;
            int i2 = write + 35;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.IconCompatParcelizer;
            ProcessSuccessfulSignInUseCase processSuccessfulSignInUseCase = this.serializer;
            Object obj2 = null;
            if (i4 != 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.read;
                if (i5 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    FetchRiderStatusImpl fetchRiderStatusImpl = processSuccessfulSignInUseCase.serializer;
                    this.read = 1;
                    objM5029invokeIoAF18A = fetchRiderStatusImpl.m5029invokeIoAF18A(this);
                    if (objM5029invokeIoAF18A == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    objM5029invokeIoAF18A = ((onItemDismiss) obj).IconCompatParcelizer;
                }
                Throwable thSerializer = onItemDismiss.serializer(objM5029invokeIoAF18A);
                if (thSerializer != null) {
                    Timber.RemoteActionCompatParcelizer.write(new RiderStatusApiFailException("Failed to fetch rider status on login", thSerializer));
                }
                return new onItemDismiss(objM5029invokeIoAF18A);
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.read;
            if (i6 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                FetchRemoteConfigUseCaseImpl fetchRemoteConfigUseCaseImpl = processSuccessfulSignInUseCase.write;
                this.read = 1;
                objM5013invokegIAlus = fetchRemoteConfigUseCaseImpl.m5013invokegIAlus(true, this);
                if (objM5013invokegIAlus == coroutineSingletons2) {
                    int i7 = write + 15;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        return coroutineSingletons2;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i8 = write + 69;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
                    obj2.hashCode();
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objM5013invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
            }
            return new onItemDismiss(objM5013invokegIAlus);
        }
    }

    public ProcessSuccessfulSignInUseCase(SaveAuthSignInDataUseCase saveAuthSignInDataUseCase, FetchRemoteConfigUseCaseImpl fetchRemoteConfigUseCaseImpl, p0 p0Var, onAutofillTextdefault onautofilltextdefault, FetchRiderStatusImpl fetchRiderStatusImpl, getAllSemanticsNodesToMap getallsemanticsnodestomap, AppEventInfoChangeHandler appEventInfoChangeHandler, getContentDescription getcontentdescription) {
        saveAuthSignInDataUseCase.getClass();
        fetchRemoteConfigUseCaseImpl.getClass();
        p0Var.getClass();
        onautofilltextdefault.getClass();
        fetchRiderStatusImpl.getClass();
        getallsemanticsnodestomap.getClass();
        appEventInfoChangeHandler.getClass();
        getcontentdescription.getClass();
        this.MediaMetadataCompat = saveAuthSignInDataUseCase;
        this.write = fetchRemoteConfigUseCaseImpl;
        this.RemoteActionCompatParcelizer = p0Var;
        this.IconCompatParcelizer = onautofilltextdefault;
        this.serializer = fetchRiderStatusImpl;
        this.MediaDescriptionCompat = getallsemanticsnodestomap;
        this.read = appEventInfoChangeHandler;
        this.RatingCompat = getcontentdescription;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:19:0x005c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:50:0x0109  */
    /* JADX WARN: Code duplicated, block: B:51:0x011d  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b  */
    /* JADX WARN: Code duplicated, block: B:59:0x015b  */
    /* JADX WARN: Code duplicated, block: B:61:0x016c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0170 A[PHI: r1 r9
  0x0170: PHI (r1v10 o.getIsTraversalGroup) = (r1v11 o.getIsTraversalGroup), (r1v25 o.getIsTraversalGroup) binds: [B:62:0x016d, B:32:0x008e] A[DONT_GENERATE, DONT_INLINE]
  0x0170: PHI (r9v2 ??) = (r9v3 ??), (r9v6 ??) binds: [B:62:0x016d, B:32:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0184 A[PHI: r1 r9
  0x0184: PHI (r1v9 o.getIsTraversalGroup) = (r1v10 o.getIsTraversalGroup), (r1v26 o.getIsTraversalGroup) binds: [B:65:0x0181, B:31:0x0086] A[DONT_GENERATE, DONT_INLINE]
  0x0184: PHI (r9v1 ??) = (r9v8 ??), (r9v7 ??) binds: [B:65:0x0181, B:31:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x01a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String, o.ShortNewsContentCardView, o.copyTextdefault] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.String, o.copyTextdefault] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String, o.ShortNewsContentCardView, o.copyTextdefault] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public final Object invoke(copyTextdefault copytextdefault, String str, String str2, ContinuationImpl continuationImpl) {
        getPaneTitledelegate getpanetitledelegate;
        getPaneTitledelegate getpanetitledelegate2;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object obj2;
        getAllSemanticsNodesToMap getallsemanticsnodestomap;
        ShortNewsContentCardView shortNewsContentCardView;
        copyTextdefault copytextdefault2;
        Object objSerializer;
        String str3;
        String str4;
        ?? r9;
        getIsTraversalGroup getistraversalgroup;
        AnonymousClass3 anonymousClass3;
        ?? r10;
        Object objOfSuspend;
        getTraversalIndexdelegate gettraversalindexdelegateIconCompatParcelizer;
        onAutofillTextdefault onautofilltextdefault;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl;
        getIsTraversalGroup getisshowingtextsubstitution;
        getIsTraversalGroup getstatedescription;
        TwoFaViewModel$onPinChanged$1 twoFaViewModel$onPinChanged$1;
        int i2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = MediaBrowserCompatMediaItem + 63;
        MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            if (continuationImpl instanceof getPaneTitledelegate) {
                getpanetitledelegate = (getPaneTitledelegate) continuationImpl;
                i3 = getpanetitledelegate.RemoteActionCompatParcelizer;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    int i7 = MediaBrowserCompatMediaItem + 91;
                    MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    getpanetitledelegate.RemoteActionCompatParcelizer = i3 - Integer.MIN_VALUE;
                }
            }
            getpanetitledelegate2 = getpanetitledelegate;
            obj = getpanetitledelegate2.RatingCompat;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = getpanetitledelegate2.RemoteActionCompatParcelizer;
            obj2 = createFromParcel.INSTANCE;
            getallsemanticsnodestomap = this.MediaDescriptionCompat;
            shortNewsContentCardView = null;
            if (i != 0) {
                int i9 = MediaSessionCompatQueueItem;
                i2 = i9 + 65;
                MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    String str5 = getpanetitledelegate2.read;
                    str4 = getpanetitledelegate2.IconCompatParcelizer;
                    copyTextdefault copytextdefault3 = getpanetitledelegate2.serializer;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    copytextdefault2 = copytextdefault3;
                    str3 = str5;
                } else {
                    String str6 = getpanetitledelegate2.read;
                    str4 = getpanetitledelegate2.IconCompatParcelizer;
                    copyTextdefault copytextdefault4 = getpanetitledelegate2.serializer;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    copytextdefault2 = copytextdefault4;
                    str3 = str6;
                }
                return coroutineSingletons;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            copytextdefault2 = copytextdefault;
            getpanetitledelegate2.serializer = copytextdefault2;
            getpanetitledelegate2.IconCompatParcelizer = str;
            getpanetitledelegate2.read = str2;
            getpanetitledelegate2.RemoteActionCompatParcelizer = 1;
            objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) this.RatingCompat.RemoteActionCompatParcelizer.serializer, new SignInDataStore$clear$2(i4, 0, shortNewsContentCardView), getpanetitledelegate2);
            if (objSerializer != coroutineSingletons) {
                objSerializer = obj2;
            }
            if (objSerializer != coroutineSingletons) {
                objSerializer = obj2;
            }
            if (objSerializer != coroutineSingletons) {
                str3 = str2;
                str4 = str;
            }
            return coroutineSingletons;
            this.RemoteActionCompatParcelizer.getClass();
            gettraversalindexdelegateIconCompatParcelizer = p0.IconCompatParcelizer(copytextdefault2);
            onautofilltextdefault = this.IconCompatParcelizer;
            onautofilltextdefault.getClass();
            if (!gettraversalindexdelegateIconCompatParcelizer.isApplicationPending) {
                getstatedescription = new getStateDescription(onautofilltextdefault.RemoteActionCompatParcelizer.serializer(gettraversalindexdelegateIconCompatParcelizer));
            } else {
                firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) onautofilltextdefault.read;
                firebaseRemoteConfigImpl.getClass();
                if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_RIDER_RECRUITMENT_PHASE_2_ENABLED)) {
                    getisshowingtextsubstitution = new getIsShowingTextSubstitution(new Exception(onautofilltextdefault.write.IconCompatParcelizer(R.string.rider_hiring_firebase_sync_error)));
                } else {
                    getisshowingtextsubstitution = getMaxTextLength.RemoteActionCompatParcelizer;
                }
                getstatedescription = getisshowingtextsubstitution;
            }
            r10 = 0;
            twoFaViewModel$onPinChanged$1 = new TwoFaViewModel$onPinChanged$1((Object) this, str4, str3, (Object) gettraversalindexdelegateIconCompatParcelizer, (Object) getstatedescription, (ShortNewsContentCardView) null, 3);
            getpanetitledelegate2.serializer = null;
            getpanetitledelegate2.IconCompatParcelizer = null;
            getpanetitledelegate2.read = null;
            getpanetitledelegate2.write = getstatedescription;
            getpanetitledelegate2.RemoteActionCompatParcelizer = 2;
            if (((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).ofSuspend("save_auth_data", twoFaViewModel$onPinChanged$1, getpanetitledelegate2) != coroutineSingletons) {
                getistraversalgroup = getstatedescription;
                getpanetitledelegate2.serializer = r10;
                getpanetitledelegate2.IconCompatParcelizer = r10;
                getpanetitledelegate2.read = r10;
                getpanetitledelegate2.write = getistraversalgroup;
                getpanetitledelegate2.RemoteActionCompatParcelizer = 3;
                if (getistraversalgroup instanceof getStateDescription) {
                    objOfSuspend = ((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).ofSuspend("kiwi_rider_status_fetch", new AnonymousClass3(this, r10, 1), getpanetitledelegate2);
                    if (objOfSuspend == coroutineSingletons) {
                        obj2 = objOfSuspend;
                    }
                }
                if (obj2 != coroutineSingletons) {
                    getpanetitledelegate2.serializer = r10;
                    getpanetitledelegate2.IconCompatParcelizer = r10;
                    getpanetitledelegate2.read = r10;
                    getpanetitledelegate2.write = getistraversalgroup;
                    getpanetitledelegate2.RemoteActionCompatParcelizer = 4;
                    r9 = r10;
                    if (this.read.refreshUserInfo(getpanetitledelegate2) != coroutineSingletons) {
                        anonymousClass3 = new AnonymousClass3(this, r9, 0);
                        getpanetitledelegate2.serializer = r9;
                        getpanetitledelegate2.IconCompatParcelizer = r9;
                        getpanetitledelegate2.read = r9;
                        getpanetitledelegate2.write = getistraversalgroup;
                        getpanetitledelegate2.RemoteActionCompatParcelizer = 5;
                        if (((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).ofSuspend("login_remote_config", anonymousClass3, getpanetitledelegate2) != coroutineSingletons) {
                            return getistraversalgroup;
                        }
                    }
                }
            }
            return coroutineSingletons;
        }
        int i10 = 59 / 0;
        if (continuationImpl instanceof getPaneTitledelegate) {
            getpanetitledelegate = (getPaneTitledelegate) continuationImpl;
            i3 = getpanetitledelegate.RemoteActionCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i11 = MediaBrowserCompatMediaItem + 91;
                MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                getpanetitledelegate.RemoteActionCompatParcelizer = i3 - Integer.MIN_VALUE;
            }
        }
        getpanetitledelegate2 = getpanetitledelegate;
        obj = getpanetitledelegate2.RatingCompat;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getpanetitledelegate2.RemoteActionCompatParcelizer;
        obj2 = createFromParcel.INSTANCE;
        getallsemanticsnodestomap = this.MediaDescriptionCompat;
        shortNewsContentCardView = null;
        if (i != 0) {
            int i13 = MediaSessionCompatQueueItem;
            i2 = i13 + 65;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0 ? i == 1 : i == 0) {
                String str7 = getpanetitledelegate2.read;
                str4 = getpanetitledelegate2.IconCompatParcelizer;
                copyTextdefault copytextdefault5 = getpanetitledelegate2.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                copytextdefault2 = copytextdefault5;
                str3 = str7;
            } else {
                int i14 = i13 + 71;
                MediaBrowserCompatMediaItem = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                if (i != 2) {
                    int i16 = i13 + 55;
                    MediaBrowserCompatMediaItem = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    if (i == 3) {
                        getistraversalgroup = getpanetitledelegate2.write;
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        r10 = 0;
                        getpanetitledelegate2.serializer = r10;
                        getpanetitledelegate2.IconCompatParcelizer = r10;
                        getpanetitledelegate2.read = r10;
                        getpanetitledelegate2.write = getistraversalgroup;
                        getpanetitledelegate2.RemoteActionCompatParcelizer = 4;
                        r9 = r10;
                        if (this.read.refreshUserInfo(getpanetitledelegate2) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i != 4) {
                        int i18 = i13 + 1;
                        MediaBrowserCompatMediaItem = i18 % Fields.SpotShadowColor;
                        int i19 = i18 % 2;
                        if (i == 5) {
                            getIsTraversalGroup getistraversalgroup2 = getpanetitledelegate2.write;
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return getistraversalgroup2;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    getistraversalgroup = getpanetitledelegate2.write;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    r9 = 0;
                } else {
                    getistraversalgroup = getpanetitledelegate2.write;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    r10 = 0;
                    getpanetitledelegate2.serializer = r10;
                    getpanetitledelegate2.IconCompatParcelizer = r10;
                    getpanetitledelegate2.read = r10;
                    getpanetitledelegate2.write = getistraversalgroup;
                    getpanetitledelegate2.RemoteActionCompatParcelizer = 3;
                    if (getistraversalgroup instanceof getStateDescription) {
                        objOfSuspend = ((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).ofSuspend("kiwi_rider_status_fetch", new AnonymousClass3(this, r10, 1), getpanetitledelegate2);
                        if (objOfSuspend == coroutineSingletons) {
                            obj2 = objOfSuspend;
                        }
                    }
                    if (obj2 != coroutineSingletons) {
                        getpanetitledelegate2.serializer = r10;
                        getpanetitledelegate2.IconCompatParcelizer = r10;
                        getpanetitledelegate2.read = r10;
                        getpanetitledelegate2.write = getistraversalgroup;
                        getpanetitledelegate2.RemoteActionCompatParcelizer = 4;
                        r9 = r10;
                        if (this.read.refreshUserInfo(getpanetitledelegate2) != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            anonymousClass3 = new AnonymousClass3(this, r9, 0);
            getpanetitledelegate2.serializer = r9;
            getpanetitledelegate2.IconCompatParcelizer = r9;
            getpanetitledelegate2.read = r9;
            getpanetitledelegate2.write = getistraversalgroup;
            getpanetitledelegate2.RemoteActionCompatParcelizer = 5;
            if (((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).ofSuspend("login_remote_config", anonymousClass3, getpanetitledelegate2) != coroutineSingletons) {
                return coroutineSingletons;
            }
            return getistraversalgroup;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        copytextdefault2 = copytextdefault;
        getpanetitledelegate2.serializer = copytextdefault2;
        getpanetitledelegate2.IconCompatParcelizer = str;
        getpanetitledelegate2.read = str2;
        getpanetitledelegate2.RemoteActionCompatParcelizer = 1;
        objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) this.RatingCompat.RemoteActionCompatParcelizer.serializer, new SignInDataStore$clear$2(i4, 0, shortNewsContentCardView), getpanetitledelegate2);
        if (objSerializer != coroutineSingletons) {
            objSerializer = obj2;
        }
        if (objSerializer != coroutineSingletons) {
            objSerializer = obj2;
        }
        if (objSerializer != coroutineSingletons) {
            str3 = str2;
            str4 = str;
        }
        return coroutineSingletons;
        this.RemoteActionCompatParcelizer.getClass();
        gettraversalindexdelegateIconCompatParcelizer = p0.IconCompatParcelizer(copytextdefault2);
        onautofilltextdefault = this.IconCompatParcelizer;
        onautofilltextdefault.getClass();
        if (!gettraversalindexdelegateIconCompatParcelizer.isApplicationPending) {
            getstatedescription = new getStateDescription(onautofilltextdefault.RemoteActionCompatParcelizer.serializer(gettraversalindexdelegateIconCompatParcelizer));
        } else {
            firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) onautofilltextdefault.read;
            firebaseRemoteConfigImpl.getClass();
            if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_RIDER_RECRUITMENT_PHASE_2_ENABLED)) {
                getisshowingtextsubstitution = new getIsShowingTextSubstitution(new Exception(onautofilltextdefault.write.IconCompatParcelizer(R.string.rider_hiring_firebase_sync_error)));
            } else {
                getisshowingtextsubstitution = getMaxTextLength.RemoteActionCompatParcelizer;
            }
            getstatedescription = getisshowingtextsubstitution;
        }
        r10 = 0;
        twoFaViewModel$onPinChanged$1 = new TwoFaViewModel$onPinChanged$1((Object) this, str4, str3, (Object) gettraversalindexdelegateIconCompatParcelizer, (Object) getstatedescription, (ShortNewsContentCardView) null, 3);
        getpanetitledelegate2.serializer = null;
        getpanetitledelegate2.IconCompatParcelizer = null;
        getpanetitledelegate2.read = null;
        getpanetitledelegate2.write = getstatedescription;
        getpanetitledelegate2.RemoteActionCompatParcelizer = 2;
        if (((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).ofSuspend("save_auth_data", twoFaViewModel$onPinChanged$1, getpanetitledelegate2) != coroutineSingletons) {
            getistraversalgroup = getstatedescription;
            getpanetitledelegate2.serializer = r10;
            getpanetitledelegate2.IconCompatParcelizer = r10;
            getpanetitledelegate2.read = r10;
            getpanetitledelegate2.write = getistraversalgroup;
            getpanetitledelegate2.RemoteActionCompatParcelizer = 3;
            if (getistraversalgroup instanceof getStateDescription) {
                objOfSuspend = ((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).ofSuspend("kiwi_rider_status_fetch", new AnonymousClass3(this, r10, 1), getpanetitledelegate2);
                if (objOfSuspend == coroutineSingletons) {
                    obj2 = objOfSuspend;
                }
            }
            if (obj2 != coroutineSingletons) {
                getpanetitledelegate2.serializer = r10;
                getpanetitledelegate2.IconCompatParcelizer = r10;
                getpanetitledelegate2.read = r10;
                getpanetitledelegate2.write = getistraversalgroup;
                getpanetitledelegate2.RemoteActionCompatParcelizer = 4;
                r9 = r10;
                if (this.read.refreshUserInfo(getpanetitledelegate2) != coroutineSingletons) {
                    anonymousClass3 = new AnonymousClass3(this, r9, 0);
                    getpanetitledelegate2.serializer = r9;
                    getpanetitledelegate2.IconCompatParcelizer = r9;
                    getpanetitledelegate2.read = r9;
                    getpanetitledelegate2.write = getistraversalgroup;
                    getpanetitledelegate2.RemoteActionCompatParcelizer = 5;
                    if (((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).ofSuspend("login_remote_config", anonymousClass3, getpanetitledelegate2) != coroutineSingletons) {
                        return getistraversalgroup;
                    }
                }
            }
        }
        return coroutineSingletons;
        getpanetitledelegate = new getPaneTitledelegate(this, continuationImpl);
        getpanetitledelegate2 = getpanetitledelegate;
        obj = getpanetitledelegate2.RatingCompat;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getpanetitledelegate2.RemoteActionCompatParcelizer;
        obj2 = createFromParcel.INSTANCE;
        getallsemanticsnodestomap = this.MediaDescriptionCompat;
        shortNewsContentCardView = null;
        if (i != 0) {
            int i110 = MediaSessionCompatQueueItem;
            i2 = i110 + 65;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                String str8 = getpanetitledelegate2.read;
                str4 = getpanetitledelegate2.IconCompatParcelizer;
                copyTextdefault copytextdefault6 = getpanetitledelegate2.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                copytextdefault2 = copytextdefault6;
                str3 = str8;
            } else {
                String str9 = getpanetitledelegate2.read;
                str4 = getpanetitledelegate2.IconCompatParcelizer;
                copyTextdefault copytextdefault7 = getpanetitledelegate2.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                copytextdefault2 = copytextdefault7;
                str3 = str9;
            }
            return coroutineSingletons;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        copytextdefault2 = copytextdefault;
        getpanetitledelegate2.serializer = copytextdefault2;
        getpanetitledelegate2.IconCompatParcelizer = str;
        getpanetitledelegate2.read = str2;
        getpanetitledelegate2.RemoteActionCompatParcelizer = 1;
        objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) this.RatingCompat.RemoteActionCompatParcelizer.serializer, new SignInDataStore$clear$2(i4, 0, shortNewsContentCardView), getpanetitledelegate2);
        if (objSerializer != coroutineSingletons) {
            objSerializer = obj2;
        }
        if (objSerializer != coroutineSingletons) {
            objSerializer = obj2;
        }
        if (objSerializer != coroutineSingletons) {
            str3 = str2;
            str4 = str;
        }
        return coroutineSingletons;
        this.RemoteActionCompatParcelizer.getClass();
        gettraversalindexdelegateIconCompatParcelizer = p0.IconCompatParcelizer(copytextdefault2);
        onautofilltextdefault = this.IconCompatParcelizer;
        onautofilltextdefault.getClass();
        if (!gettraversalindexdelegateIconCompatParcelizer.isApplicationPending) {
            getstatedescription = new getStateDescription(onautofilltextdefault.RemoteActionCompatParcelizer.serializer(gettraversalindexdelegateIconCompatParcelizer));
        } else {
            firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) onautofilltextdefault.read;
            firebaseRemoteConfigImpl.getClass();
            if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_RIDER_RECRUITMENT_PHASE_2_ENABLED)) {
                getisshowingtextsubstitution = new getIsShowingTextSubstitution(new Exception(onautofilltextdefault.write.IconCompatParcelizer(R.string.rider_hiring_firebase_sync_error)));
            } else {
                getisshowingtextsubstitution = getMaxTextLength.RemoteActionCompatParcelizer;
            }
            getstatedescription = getisshowingtextsubstitution;
        }
        r10 = 0;
        twoFaViewModel$onPinChanged$1 = new TwoFaViewModel$onPinChanged$1((Object) this, str4, str3, (Object) gettraversalindexdelegateIconCompatParcelizer, (Object) getstatedescription, (ShortNewsContentCardView) null, 3);
        getpanetitledelegate2.serializer = null;
        getpanetitledelegate2.IconCompatParcelizer = null;
        getpanetitledelegate2.read = null;
        getpanetitledelegate2.write = getstatedescription;
        getpanetitledelegate2.RemoteActionCompatParcelizer = 2;
        if (((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).ofSuspend("save_auth_data", twoFaViewModel$onPinChanged$1, getpanetitledelegate2) != coroutineSingletons) {
            getistraversalgroup = getstatedescription;
            getpanetitledelegate2.serializer = r10;
            getpanetitledelegate2.IconCompatParcelizer = r10;
            getpanetitledelegate2.read = r10;
            getpanetitledelegate2.write = getistraversalgroup;
            getpanetitledelegate2.RemoteActionCompatParcelizer = 3;
            if (getistraversalgroup instanceof getStateDescription) {
                objOfSuspend = ((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).ofSuspend("kiwi_rider_status_fetch", new AnonymousClass3(this, r10, 1), getpanetitledelegate2);
                if (objOfSuspend == coroutineSingletons) {
                    obj2 = objOfSuspend;
                }
            }
            if (obj2 != coroutineSingletons) {
                getpanetitledelegate2.serializer = r10;
                getpanetitledelegate2.IconCompatParcelizer = r10;
                getpanetitledelegate2.read = r10;
                getpanetitledelegate2.write = getistraversalgroup;
                getpanetitledelegate2.RemoteActionCompatParcelizer = 4;
                r9 = r10;
                if (this.read.refreshUserInfo(getpanetitledelegate2) != coroutineSingletons) {
                    anonymousClass3 = new AnonymousClass3(this, r9, 0);
                    getpanetitledelegate2.serializer = r9;
                    getpanetitledelegate2.IconCompatParcelizer = r9;
                    getpanetitledelegate2.read = r9;
                    getpanetitledelegate2.write = getistraversalgroup;
                    getpanetitledelegate2.RemoteActionCompatParcelizer = 5;
                    if (((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).ofSuspend("login_remote_config", anonymousClass3, getpanetitledelegate2) != coroutineSingletons) {
                        return getistraversalgroup;
                    }
                }
            }
        }
        return coroutineSingletons;
    }
}
