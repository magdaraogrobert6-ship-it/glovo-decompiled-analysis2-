package com.roadrunner.diagnostics.domain;

import android.content.IntentFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.tasks.OnSuccessListener;
import com.huawei.agconnect.config.impl.m;
import com.huawei.location.Vw$Vw;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.logistics.rider.glovo.R;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.delivery.accept.laststop.data.LastStopRepositoryImpl;
import com.roadrunner.delivery.accept.laststop.domain.SaveLastStopAddressUseCaseImpl$invoke$1;
import com.roadrunner.delivery.ontheway.phonecall.domain.FetchPhoneNumber$invoke$1;
import com.roadrunner.helpcenter.domain.GetHelpCenterUrlUseCase$invoke$1;
import com.roadrunner.instant.shifts.data.InstantShiftRepository;
import com.roadrunner.instant.shifts.domain.AssignShiftUseCase$invoke$1;
import com.roadrunner.liveness.recording.data.ChallengesRepository;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1;
import o.FocusListener;
import o.NoopClock;
import o.UninitializedMessageException;
import o.accessgetSubscriptcp;
import o.copyuxg59PA;
import o.copywBHncE4;
import o.ensureAnimationInfo;
import o.getAsciiPjHm6EE;
import o.getAutoCorrect;
import o.getBoldannotations;
import o.getCapitalizationIUNYP9k;
import o.getDecimalPjHm6EE;
import o.getHintLocales;
import o.getKeyboardTypePjHm6EE;
import o.getPreviouseUduSuo;
import o.getSingleLine;
import o.getSpanVerticalAligndo9XGg;
import o.getUriPjHm6EEannotations;
import o.isItemDismissable;
import o.isOpenInternalroom_runtime;
import o.isScalar;
import o.isValidForField;
import o.onActivityPreCreated;
import o.onContentCardDismissed;
import o.onGenericMotionEvent;
import o.onItemDismiss;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setGuidelinePercent;
import o.setOnPreEvent;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SendTestPushUseCase implements setOnPreEvent, OnSuccessListener {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public Object serializer;

    public SendTestPushUseCase(ChallengesRepository challengesRepository) {
        challengesRepository.getClass();
        this.serializer = challengesRepository;
    }

    public void IconCompatParcelizer(FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            fragmentActivity.unregisterReceiver((onGenericMotionEvent) this.serializer);
        } else {
            fragmentActivity.unregisterReceiver((onGenericMotionEvent) this.serializer);
            throw null;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public /* synthetic */ void onSuccess(Object obj) {
        int i = 2 % 2;
        int i2 = read + 63;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((setGuidelinePercent) this.serializer).invoke(obj);
        int i4 = IconCompatParcelizer + 51;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public /* synthetic */ SendTestPushUseCase(Object obj, Object obj2) {
        this.serializer = obj;
    }

    public /* synthetic */ SendTestPushUseCase(Object obj) {
        this.serializer = obj;
    }

    public SendTestPushUseCase(AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1 animatedVisibilityClockgetTransitionslambda0inlinedsortedBy1) {
        animatedVisibilityClockgetTransitionslambda0inlinedsortedBy1.getClass();
        this.serializer = animatedVisibilityClockgetTransitionslambda0inlinedsortedBy1;
    }

    public SendTestPushUseCase(NoopClock noopClock) {
        noopClock.getClass();
        this.serializer = noopClock;
    }

    public SendTestPushUseCase(accessgetSubscriptcp accessgetsubscriptcp, g0 g0Var, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.serializer = accessgetsubscriptcp;
    }

    public void read(FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        FocusListener.read(fragmentActivity, (onGenericMotionEvent) this.serializer, new IntentFilter("com.roadrunner.inappnotifications.ACTION_SHARE_RESULT"), null, 4);
        int i2 = read + 107;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public static isValidForField read(String str) {
        int i = 2 % 2;
        isValidForField isvalidforfield = new isValidForField("HOST_ENCOUNTERED_ERROR-" + UUID.randomUUID(), new isScalar(new UninitializedMessageException("Error happened from HelpCenter by host app: ".concat(str))));
        int i2 = IconCompatParcelizer + 41;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return isvalidforfield;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public Object m4957invokegIAlus(getSpanVerticalAligndo9XGg getspanverticalaligndo9xgg, ContinuationImpl continuationImpl) {
        FetchPhoneNumber$invoke$1 fetchPhoneNumber$invoke$1;
        int i = 2 % 2;
        if (continuationImpl instanceof FetchPhoneNumber$invoke$1) {
            int i2 = IconCompatParcelizer + 69;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            fetchPhoneNumber$invoke$1 = (FetchPhoneNumber$invoke$1) continuationImpl;
            int i4 = fetchPhoneNumber$invoke$1.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                fetchPhoneNumber$invoke$1.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                fetchPhoneNumber$invoke$1 = new FetchPhoneNumber$invoke$1(this, continuationImpl);
            }
        } else {
            fetchPhoneNumber$invoke$1 = new FetchPhoneNumber$invoke$1(this, continuationImpl);
        }
        Object obj = fetchPhoneNumber$invoke$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = fetchPhoneNumber$invoke$1.IconCompatParcelizer;
        if (i5 != 0) {
            if (i5 == 1) {
                int i6 = IconCompatParcelizer + 73;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i8 = IconCompatParcelizer + 111;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (!getspanverticalaligndo9xgg.read) {
            return new getBoldannotations(getspanverticalaligndo9xgg.MediaSessionCompatQueueItem);
        }
        Vw$Vw vw$Vw = (Vw$Vw) this.serializer;
        long j = getspanverticalaligndo9xgg.serializer;
        String str = getspanverticalaligndo9xgg.write;
        fetchPhoneNumber$invoke$1.IconCompatParcelizer = 1;
        Object objM4510getPhoneNumber0E7RQCE = vw$Vw.m4510getPhoneNumber0E7RQCE(j, str, fetchPhoneNumber$invoke$1);
        if (objM4510getPhoneNumber0E7RQCE == coroutineSingletons) {
            return coroutineSingletons;
        }
        int i10 = read + 19;
        IconCompatParcelizer = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return objM4510getPhoneNumber0E7RQCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032 A[PHI: r1 r3
  0x0032: PHI (r1v11 com.roadrunner.instant.shifts.domain.AssignShiftUseCase$invoke$1) = 
  (r1v10 com.roadrunner.instant.shifts.domain.AssignShiftUseCase$invoke$1)
  (r1v13 com.roadrunner.instant.shifts.domain.AssignShiftUseCase$invoke$1)
 binds: [B:10:0x0030, B:7:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r3v3 int) = (r3v2 int), (r3v5 int) binds: [B:10:0x0030, B:7:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public Object m4955invokegIAlus(int i, ContinuationImpl continuationImpl) {
        AssignShiftUseCase$invoke$1 assignShiftUseCase$invoke$1;
        int i2;
        int i3 = 2 % 2;
        int i4 = IconCompatParcelizer;
        int i5 = i4 + 27;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        if (continuationImpl instanceof AssignShiftUseCase$invoke$1) {
            int i7 = i4 + 77;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                assignShiftUseCase$invoke$1 = (AssignShiftUseCase$invoke$1) continuationImpl;
                i2 = assignShiftUseCase$invoke$1.IconCompatParcelizer;
                int i8 = 88 / 0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    assignShiftUseCase$invoke$1.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
                } else {
                    assignShiftUseCase$invoke$1 = new AssignShiftUseCase$invoke$1(this, continuationImpl);
                }
            } else {
                assignShiftUseCase$invoke$1 = (AssignShiftUseCase$invoke$1) continuationImpl;
                i2 = assignShiftUseCase$invoke$1.IconCompatParcelizer;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    assignShiftUseCase$invoke$1.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
                } else {
                    assignShiftUseCase$invoke$1 = new AssignShiftUseCase$invoke$1(this, continuationImpl);
                }
            }
        } else {
            assignShiftUseCase$invoke$1 = new AssignShiftUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = assignShiftUseCase$invoke$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = assignShiftUseCase$invoke$1.IconCompatParcelizer;
        Object obj2 = null;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            InstantShiftRepository instantShiftRepository = (InstantShiftRepository) this.serializer;
            assignShiftUseCase$invoke$1.IconCompatParcelizer = 1;
            Object objM4983assignShiftgIAlus = instantShiftRepository.m4983assignShiftgIAlus(i, assignShiftUseCase$invoke$1);
            if (objM4983assignShiftgIAlus != coroutineSingletons) {
                return objM4983assignShiftgIAlus;
            }
            int i10 = IconCompatParcelizer + 21;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                return coroutineSingletons;
            }
            obj2.hashCode();
            throw null;
        }
        int i11 = read + 97;
        int i12 = i11 % Fields.SpotShadowColor;
        IconCompatParcelizer = i12;
        if (i11 % 2 == 0 ? i9 != 1 : i9 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i13 = i12 + 109;
        read = i13 % Fields.SpotShadowColor;
        int i14 = i13 % 2;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return ((onItemDismiss) obj).IconCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public Object m4956invokegIAlus(ensureAnimationInfo ensureanimationinfo, ContinuationImpl continuationImpl) {
        GetHelpCenterUrlUseCase$invoke$1 getHelpCenterUrlUseCase$invoke$1;
        int i = 2 % 2;
        if (continuationImpl instanceof GetHelpCenterUrlUseCase$invoke$1) {
            int i2 = IconCompatParcelizer + 71;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = ((GetHelpCenterUrlUseCase$invoke$1) continuationImpl).read;
                throw null;
            }
            getHelpCenterUrlUseCase$invoke$1 = (GetHelpCenterUrlUseCase$invoke$1) continuationImpl;
            int i4 = getHelpCenterUrlUseCase$invoke$1.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                getHelpCenterUrlUseCase$invoke$1.read = i4 - Integer.MIN_VALUE;
            } else {
                getHelpCenterUrlUseCase$invoke$1 = new GetHelpCenterUrlUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getHelpCenterUrlUseCase$invoke$1 = new GetHelpCenterUrlUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = getHelpCenterUrlUseCase$invoke$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = getHelpCenterUrlUseCase$invoke$1.read;
        if (i5 != 0) {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i6 = IconCompatParcelizer + 1;
                read = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 96 / 0;
                }
                return null;
            }
            int i8 = read + 11;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
            throw null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        m mVar = (m) this.serializer;
        getHelpCenterUrlUseCase$invoke$1.read = 1;
        Object objM4504fetchHelpCenterUrlgIAlus = mVar.m4504fetchHelpCenterUrlgIAlus(ensureanimationinfo, getHelpCenterUrlUseCase$invoke$1);
        if (objM4504fetchHelpCenterUrlgIAlus != coroutineSingletons) {
            return objM4504fetchHelpCenterUrlgIAlus;
        }
        int i9 = read;
        int i10 = i9 + 71;
        IconCompatParcelizer = i10 % Fields.SpotShadowColor;
        if (i10 % 2 != 0) {
            int i11 = 35 / 0;
        }
        int i12 = i9 + 89;
        IconCompatParcelizer = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: invoke-BWLJW6A, reason: not valid java name */
    public Object m4954invokeBWLJW6A(String str, onActivityPreCreated onactivityprecreated, String str2, ContinuationImpl continuationImpl) {
        SaveLastStopAddressUseCaseImpl$invoke$1 saveLastStopAddressUseCaseImpl$invoke$1;
        int i = 2 % 2;
        if (continuationImpl instanceof SaveLastStopAddressUseCaseImpl$invoke$1) {
            saveLastStopAddressUseCaseImpl$invoke$1 = (SaveLastStopAddressUseCaseImpl$invoke$1) continuationImpl;
            int i2 = saveLastStopAddressUseCaseImpl$invoke$1.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                saveLastStopAddressUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                saveLastStopAddressUseCaseImpl$invoke$1 = new SaveLastStopAddressUseCaseImpl$invoke$1(this, continuationImpl);
            }
        } else {
            saveLastStopAddressUseCaseImpl$invoke$1 = new SaveLastStopAddressUseCaseImpl$invoke$1(this, continuationImpl);
        }
        SaveLastStopAddressUseCaseImpl$invoke$1 saveLastStopAddressUseCaseImpl$invoke$2 = saveLastStopAddressUseCaseImpl$invoke$1;
        int i3 = read + 35;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            Object obj2 = saveLastStopAddressUseCaseImpl$invoke$2.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = saveLastStopAddressUseCaseImpl$invoke$2.RemoteActionCompatParcelizer;
            throw null;
        }
        Object obj3 = saveLastStopAddressUseCaseImpl$invoke$2.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = saveLastStopAddressUseCaseImpl$invoke$2.RemoteActionCompatParcelizer;
        if (i5 != 0) {
            if (i5 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                return ((onItemDismiss) obj3).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj3);
        if (str.length() == 0) {
            isItemDismissable isitemdismissable = new isItemDismissable(new IllegalArgumentException("Save last stop address endpoint url can't be empty"));
            int i6 = IconCompatParcelizer + 61;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return isitemdismissable;
        }
        LastStopRepositoryImpl lastStopRepositoryImpl = (LastStopRepositoryImpl) this.serializer;
        String str3 = DateTimeFormatter.ISO_INSTANT.format(Instant.now());
        str3.getClass();
        saveLastStopAddressUseCaseImpl$invoke$2.RemoteActionCompatParcelizer = 1;
        Object objM4904saveLastStopAddressyxL6bBk = lastStopRepositoryImpl.m4904saveLastStopAddressyxL6bBk(str, onactivityprecreated, str2, str3, saveLastStopAddressUseCaseImpl$invoke$2);
        if (objM4904saveLastStopAddressyxL6bBk != coroutineSingletons2) {
            return objM4904saveLastStopAddressyxL6bBk;
        }
        int i8 = IconCompatParcelizer + 37;
        read = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return coroutineSingletons2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c A[PHI: r5 r8
  0x003c: PHI (r5v7 o.getNumberPjHm6EE) = (r5v6 o.getNumberPjHm6EE), (r5v9 o.getNumberPjHm6EE) binds: [B:10:0x003a, B:7:0x0030] A[DONT_GENERATE, DONT_INLINE]
  0x003c: PHI (r8v11 int) = (r8v10 int), (r8v13 int) binds: [B:10:0x003a, B:7:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0050  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
    
        if (r1 == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
    
        r18 = r2;
        r2 = r1;
        r1 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        if (r1 == r6) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object isTooltipAvailable(o.getPreviouseUduSuo r20, java.lang.String r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.diagnostics.domain.SendTestPushUseCase.isTooltipAvailable(o.getPreviouseUduSuo, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    public Object invoke(getDecimalPjHm6EE getdecimalpjhm6ee, ContinuationImpl continuationImpl) {
        getUriPjHm6EEannotations geturipjhm6eeannotations;
        String str;
        int i;
        String str2;
        String str3;
        getCapitalizationIUNYP9k getcapitalizationiunyp9k;
        getAutoCorrect getautocorrect;
        String str4;
        int i2 = 2 % 2;
        int i3 = read + 105;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (continuationImpl instanceof getUriPjHm6EEannotations) {
            geturipjhm6eeannotations = (getUriPjHm6EEannotations) continuationImpl;
            int i5 = geturipjhm6eeannotations.MediaBrowserCompatMediaItem;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                geturipjhm6eeannotations.MediaBrowserCompatMediaItem = i5 - Integer.MIN_VALUE;
            } else {
                geturipjhm6eeannotations = new getUriPjHm6EEannotations(this, continuationImpl);
            }
        } else {
            geturipjhm6eeannotations = new getUriPjHm6EEannotations(this, continuationImpl);
        }
        Object obj = geturipjhm6eeannotations.RatingCompat;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = geturipjhm6eeannotations.MediaBrowserCompatMediaItem;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            String str5 = getdecimalpjhm6ee.RemoteActionCompatParcelizer;
            List list = getdecimalpjhm6ee.write;
            getSingleLine getsingleline = getSingleLine.read;
            if (str5 != null && list != null) {
                int i7 = read + 39;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (getdecimalpjhm6ee.serializer) {
                    getAsciiPjHm6EE getasciipjhm6ee = (getAsciiPjHm6EE) onContentCardDismissed.MediaMetadataCompat(list);
                    if (getasciipjhm6ee == null) {
                        getAutoCorrect getautocorrect2 = new getAutoCorrect(R.string.crowdsourcing_image_floating_camera, copywBHncE4.Alert);
                        getPreviouseUduSuo getpreviouseudusuo = getPreviouseUduSuo.ADD_PHOTOS;
                        geturipjhm6eeannotations.read = getautocorrect2;
                        getcapitalizationiunyp9k = getCapitalizationIUNYP9k.serializer;
                        geturipjhm6eeannotations.IconCompatParcelizer = getcapitalizationiunyp9k;
                        geturipjhm6eeannotations.serializer = str5;
                        geturipjhm6eeannotations.MediaBrowserCompatMediaItem = 1;
                        Object objIsTooltipAvailable = isTooltipAvailable(getpreviouseudusuo, str5, geturipjhm6eeannotations);
                        if (objIsTooltipAvailable != obj2) {
                            getautocorrect = getautocorrect2;
                            obj = objIsTooltipAvailable;
                            str4 = str5;
                            return new getHintLocales(getautocorrect, str4, getcapitalizationiunyp9k, ((Boolean) obj).booleanValue());
                        }
                    } else {
                        String str6 = getasciipjhm6ee.read;
                        if (str6 == null) {
                            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("ObserveImageSharingUiState mapping failed: pictureId was null", Timber.RemoteActionCompatParcelizer);
                            return getsingleline;
                        }
                        String str7 = getasciipjhm6ee.IconCompatParcelizer;
                        int size = list.size();
                        getPreviouseUduSuo getpreviouseudusuo2 = getPreviouseUduSuo.PHOTOS_AVAILABLE;
                        geturipjhm6eeannotations.read = null;
                        geturipjhm6eeannotations.IconCompatParcelizer = null;
                        geturipjhm6eeannotations.serializer = str5;
                        geturipjhm6eeannotations.write = str7;
                        geturipjhm6eeannotations.MediaDescriptionCompat = str6;
                        geturipjhm6eeannotations.RemoteActionCompatParcelizer = size;
                        geturipjhm6eeannotations.MediaBrowserCompatMediaItem = 2;
                        Object objIsTooltipAvailable2 = isTooltipAvailable(getpreviouseudusuo2, str5, geturipjhm6eeannotations);
                        if (objIsTooltipAvailable2 != obj2) {
                            str = str7;
                            i = size;
                            obj = objIsTooltipAvailable2;
                            str2 = str5;
                            str3 = str6;
                            return new copyuxg59PA(str, str3, i, str2, getKeyboardTypePjHm6EE.read, false, ((Boolean) obj).booleanValue(), false);
                        }
                    }
                    return obj2;
                }
            }
            return getsingleline;
        }
        int i9 = read + 83;
        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        if (i6 == 1) {
            str4 = geturipjhm6eeannotations.serializer;
            getcapitalizationiunyp9k = geturipjhm6eeannotations.IconCompatParcelizer;
            getautocorrect = geturipjhm6eeannotations.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return new getHintLocales(getautocorrect, str4, getcapitalizationiunyp9k, ((Boolean) obj).booleanValue());
        }
        if (i6 == 2) {
            int i11 = geturipjhm6eeannotations.RemoteActionCompatParcelizer;
            String str8 = geturipjhm6eeannotations.MediaDescriptionCompat;
            String str9 = geturipjhm6eeannotations.write;
            String str10 = geturipjhm6eeannotations.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            i = i11;
            str3 = str8;
            str = str9;
            str2 = str10;
            return new copyuxg59PA(str, str3, i, str2, getKeyboardTypePjHm6EE.read, false, ((Boolean) obj).booleanValue(), false);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    public boolean RemoteActionCompatParcelizer(boolean z) {
        int i = 2 % 2;
        int i2 = read + 113;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((InitializeAppStartupItemsImpl) this.serializer).serializer();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!((InitializeAppStartupItemsImpl) this.serializer).serializer() || !z) {
            return false;
        }
        int i3 = read + 121;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return true;
    }

    public SendTestPushUseCase() {
    }
}
