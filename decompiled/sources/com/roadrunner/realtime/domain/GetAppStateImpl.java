package com.roadrunner.realtime.domain;

import android.graphics.Paint;
import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.WorkManagerImpl;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.re2j.Parser;
import com.roadrunner.phonenumber.data.PhoneNumberRepository$getPhoneNumber$1;
import com.roadrunner.push.core.data.PushServiceRepository;
import com.roadrunner.push.core.domain.UpdateRiderPushToken$invoke$1;
import com.roadrunner.recentdeliveries.domain.GetRecentDeliveriesUseCase$invoke$1;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.data.PhoneValidationRepository;
import com.roadrunner.rider.recruitment.accountcreation.pass_verification.domain.GetIdentityVerificationUrlUseCase$invoke$1;
import com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository;
import com.roadrunner.rider.safety.report.data.SafetySideMenuItemTagRepository;
import com.roadrunner.rider.state.domain.GetRiderStateImpl;
import com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1;
import com.roadrunner.startworking.data.StartWorkingRepository;
import com.roadrunner.startworking.domain.GoAndStartUseCaseImpl$invoke$1;
import com.sentiance.core.model.events.N$b;
import com.sentiance.sdk.SdkStatus;
import com.sentiance.sdk.SdkStatusUpdateListener;
import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ActivityHandler13;
import o.BrazeCompanionExternalSyntheticLambda21;
import o.BrazeExternalSyntheticLambda5;
import o.C0166g;
import o.C0175h;
import o.ShortNewsContentCardView;
import o.access1500;
import o.accessgetCustomBrazeNotificationFactorycp;
import o.accessgetOldDependencyp;
import o.awaitimpl;
import o.createFromParcel;
import o.disableAppSetIdReading;
import o.endStream;
import o.getBitmapui_graphics;
import o.getFirstErrorCode;
import o.handleInternalBannerRefreshlambda1;
import o.inCompatibilityMode;
import o.isEphemeralEventKey;
import o.isItemDismissable;
import o.isOpenInternalroom_runtime;
import o.logPushDeliverylambda1;
import o.onItemDismiss;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.pausedI;
import o.prepareForActivityTransitionCarryover;
import o.processDeeplinkI;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setLogLevel;
import o.setParameters;
import o.setSubscriptionUrl;
import o.startFirstSessionI;
import o.teardownEventMetadataS;
import o.unpackMetaLastChildOffset;
import o.verifyPlayStorePurchaseI;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class GetAppStateImpl implements Function, SdkStatusUpdateListener {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final Object serializer;

    public GetAppStateImpl() {
        this.IconCompatParcelizer = 17;
        this.serializer = new Paint();
    }

    @Override // io.reactivex.functions.Function
    public /* synthetic */ Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = write + 67;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvoke = ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.serializer).invoke(obj);
        int i4 = write + 89;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objInvoke;
        }
        throw null;
    }

    public GetAppStateImpl(Parser.Pair pair) {
        this.IconCompatParcelizer = 14;
        pair.getClass();
        this.serializer = pair;
    }

    public GetAppStateImpl(PhoneValidationRepository phoneValidationRepository) {
        this.IconCompatParcelizer = 13;
        phoneValidationRepository.getClass();
        this.serializer = phoneValidationRepository;
    }

    public GetAppStateImpl(PermissionHistoryRepository permissionHistoryRepository) {
        this.IconCompatParcelizer = 15;
        permissionHistoryRepository.getClass();
        this.serializer = permissionHistoryRepository;
    }

    public GetAppStateImpl(SafetySideMenuItemTagRepository safetySideMenuItemTagRepository) {
        this.IconCompatParcelizer = 18;
        safetySideMenuItemTagRepository.getClass();
        this.serializer = safetySideMenuItemTagRepository;
    }

    public /* synthetic */ GetAppStateImpl(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
    }

    public GetAppStateImpl(StartWorkingRepository startWorkingRepository) {
        this.IconCompatParcelizer = 29;
        startWorkingRepository.getClass();
        this.serializer = startWorkingRepository;
    }

    public GetAppStateImpl(logPushDeliverylambda1 logpushdeliverylambda1) {
        this.IconCompatParcelizer = 28;
        logpushdeliverylambda1.getClass();
        this.serializer = logpushdeliverylambda1;
    }

    public GetAppStateImpl(BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21) {
        this.IconCompatParcelizer = 12;
        brazeCompanionExternalSyntheticLambda21.getClass();
        this.serializer = brazeCompanionExternalSyntheticLambda21;
    }

    @Override // com.sentiance.sdk.SdkStatusUpdateListener
    public void onSdkStatusUpdate(SdkStatus sdkStatus) {
        int i = 2 % 2;
        int i2 = read + 57;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            sdkStatus.getClass();
            getFirstErrorCode getfirsterrorcode = (getFirstErrorCode) this.serializer;
            getfirsterrorcode.getClass();
            Map mapSingletonMap = Collections.singletonMap("sdk_status", sdkStatus.toString());
            mapSingletonMap.getClass();
            getfirsterrorcode.RemoteActionCompatParcelizer("rider_safety_sdk_status_update", mapSingletonMap);
            return;
        }
        sdkStatus.getClass();
        getFirstErrorCode getfirsterrorcode2 = (getFirstErrorCode) this.serializer;
        getfirsterrorcode2.getClass();
        Map mapSingletonMap2 = Collections.singletonMap("sdk_status", sdkStatus.toString());
        mapSingletonMap2.getClass();
        getfirsterrorcode2.RemoteActionCompatParcelizer("rider_safety_sdk_status_update", mapSingletonMap2);
        int i3 = 71 / 0;
    }

    public GetAppStateImpl(N$b n$b) {
        this.IconCompatParcelizer = 9;
        n$b.getClass();
        this.serializer = n$b;
    }

    public GetAppStateImpl(unpackMetaLastChildOffset unpackmetalastchildoffset) {
        this.IconCompatParcelizer = 11;
        unpackmetalastchildoffset.getClass();
        this.serializer = unpackmetalastchildoffset;
    }

    public GetAppStateImpl(BrazeExternalSyntheticLambda5 brazeExternalSyntheticLambda5) {
        this.IconCompatParcelizer = 2;
        brazeExternalSyntheticLambda5.getClass();
        this.serializer = brazeExternalSyntheticLambda5;
    }

    public GetAppStateImpl(GetRiderStateImpl getRiderStateImpl, setSubscriptionUrl setsubscriptionurl) {
        this.IconCompatParcelizer = 24;
        this.serializer = getRiderStateImpl;
    }

    public GetAppStateImpl(accessgetCustomBrazeNotificationFactorycp accessgetcustombrazenotificationfactorycp) {
        this.IconCompatParcelizer = 27;
        accessgetcustombrazenotificationfactorycp.getClass();
        this.serializer = accessgetcustombrazenotificationfactorycp;
    }

    public GetAppStateImpl(FormBody.Builder builder) {
        this.IconCompatParcelizer = 26;
        builder.getClass();
        this.serializer = builder;
    }

    public GetAppStateImpl(getBitmapui_graphics getbitmapui_graphics) {
        this.IconCompatParcelizer = 16;
        getbitmapui_graphics.getClass();
        this.serializer = getbitmapui_graphics;
    }

    public GetAppStateImpl(GetAppStateImpl getAppStateImpl) {
        this.IconCompatParcelizer = 19;
        getAppStateImpl.getClass();
        this.serializer = getAppStateImpl;
    }

    public GetAppStateImpl(BrazeExternalSyntheticLambda5 brazeExternalSyntheticLambda5, byte b) {
        this.IconCompatParcelizer = 10;
        brazeExternalSyntheticLambda5.getClass();
        this.serializer = brazeExternalSyntheticLambda5;
    }

    public GetAppStateImpl(accessgetOldDependencyp accessgetolddependencyp) {
        this.IconCompatParcelizer = 1;
        accessgetolddependencyp.getClass();
        this.serializer = accessgetolddependencyp;
    }

    public GetAppStateImpl(WorkManagerImpl workManagerImpl) {
        this.IconCompatParcelizer = 23;
        workManagerImpl.getClass();
        this.serializer = workManagerImpl;
    }

    public GetAppStateImpl(getFirstErrorCode getfirsterrorcode) {
        this.IconCompatParcelizer = 20;
        getfirsterrorcode.getClass();
        this.serializer = getfirsterrorcode;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:19:0x0046 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    /* JADX INFO: renamed from: getPhoneNumber-gIAlu-s$implementation, reason: not valid java name */
    public Object m5007getPhoneNumbergIAlus$implementation(long j, ContinuationImpl continuationImpl) {
        PhoneNumberRepository$getPhoneNumber$1 phoneNumberRepository$getPhoneNumber$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object objM5156getPhoneNumbergIAlus;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = write + 121;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            if (continuationImpl instanceof PhoneNumberRepository$getPhoneNumber$1) {
                phoneNumberRepository$getPhoneNumber$1 = (PhoneNumberRepository$getPhoneNumber$1) continuationImpl;
                i3 = phoneNumberRepository$getPhoneNumber$1.read;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    phoneNumberRepository$getPhoneNumber$1.read = i3 - Integer.MIN_VALUE;
                }
            }
            obj = phoneNumberRepository$getPhoneNumber$1.IconCompatParcelizer;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = phoneNumberRepository$getPhoneNumber$1.read;
            if (i == 0) {
                i2 = read + 73;
                write = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            FormBody.Builder builder = (FormBody.Builder) this.serializer;
            phoneNumberRepository$getPhoneNumber$1.read = 1;
            objM5156getPhoneNumbergIAlus = builder.m5156getPhoneNumbergIAlus(j, phoneNumberRepository$getPhoneNumber$1);
            if (objM5156getPhoneNumbergIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
            return objM5156getPhoneNumbergIAlus;
        }
        int i6 = 97 / 0;
        if (continuationImpl instanceof PhoneNumberRepository$getPhoneNumber$1) {
            phoneNumberRepository$getPhoneNumber$1 = (PhoneNumberRepository$getPhoneNumber$1) continuationImpl;
            i3 = phoneNumberRepository$getPhoneNumber$1.read;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                phoneNumberRepository$getPhoneNumber$1.read = i3 - Integer.MIN_VALUE;
            }
        }
        obj = phoneNumberRepository$getPhoneNumber$1.IconCompatParcelizer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = phoneNumberRepository$getPhoneNumber$1.read;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            FormBody.Builder builder2 = (FormBody.Builder) this.serializer;
            phoneNumberRepository$getPhoneNumber$1.read = 1;
            objM5156getPhoneNumbergIAlus = builder2.m5156getPhoneNumbergIAlus(j, phoneNumberRepository$getPhoneNumber$1);
            if (objM5156getPhoneNumbergIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
            return objM5156getPhoneNumbergIAlus;
        }
        i2 = read + 73;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0 ? i != 1 : i != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return ((onItemDismiss) obj).IconCompatParcelizer;
        phoneNumberRepository$getPhoneNumber$1 = new PhoneNumberRepository$getPhoneNumber$1(this, continuationImpl);
        obj = phoneNumberRepository$getPhoneNumber$1.IconCompatParcelizer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = phoneNumberRepository$getPhoneNumber$1.read;
        if (i == 0) {
            i2 = read + 73;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        FormBody.Builder builder3 = (FormBody.Builder) this.serializer;
        phoneNumberRepository$getPhoneNumber$1.read = 1;
        objM5156getPhoneNumbergIAlus = builder3.m5156getPhoneNumbergIAlus(j, phoneNumberRepository$getPhoneNumber$1);
        if (objM5156getPhoneNumbergIAlus == coroutineSingletons) {
            return coroutineSingletons;
        }
        return objM5156getPhoneNumbergIAlus;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: invoke-IoAF18A, reason: not valid java name */
    public Object m5008invokeIoAF18A(ContinuationImpl continuationImpl) {
        GetRecentDeliveriesUseCase$invoke$1 getRecentDeliveriesUseCase$invoke$1;
        int i = 2 % 2;
        if (continuationImpl instanceof GetRecentDeliveriesUseCase$invoke$1) {
            getRecentDeliveriesUseCase$invoke$1 = (GetRecentDeliveriesUseCase$invoke$1) continuationImpl;
            int i2 = getRecentDeliveriesUseCase$invoke$1.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getRecentDeliveriesUseCase$invoke$1.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                getRecentDeliveriesUseCase$invoke$1 = new GetRecentDeliveriesUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getRecentDeliveriesUseCase$invoke$1 = new GetRecentDeliveriesUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = getRecentDeliveriesUseCase$invoke$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = getRecentDeliveriesUseCase$invoke$1.IconCompatParcelizer;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            N$b n$b = (N$b) this.serializer;
            getRecentDeliveriesUseCase$invoke$1.IconCompatParcelizer = 1;
            Object objM5079getRecentDeliveriesIoAF18A$implementation = n$b.m5079getRecentDeliveriesIoAF18A$implementation(getRecentDeliveriesUseCase$invoke$1);
            if (objM5079getRecentDeliveriesIoAF18A$implementation != coroutineSingletons) {
                return objM5079getRecentDeliveriesIoAF18A$implementation;
            }
            int i4 = read + 31;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 21 / 0;
            }
            return coroutineSingletons;
        }
        int i6 = write + 77;
        int i7 = i6 % Fields.SpotShadowColor;
        read = i7;
        if (i6 % 2 != 0 ? i3 != 1 : i3 != 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i8 = i7 + 89;
        write = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        int i9 = 70 / 0;
        return ((onItemDismiss) obj).IconCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX INFO: renamed from: invoke-IoAF18A$implementation, reason: not valid java name */
    public Object m5009invokeIoAF18A$implementation(ContinuationImpl continuationImpl) {
        GetIdentityVerificationUrlUseCase$invoke$1 getIdentityVerificationUrlUseCase$invoke$1;
        Object objM5017getIdentityVerificationUrlIoAF18A$implementation;
        int i = 2 % 2;
        if (continuationImpl instanceof GetIdentityVerificationUrlUseCase$invoke$1) {
            int i2 = write + 31;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = ((GetIdentityVerificationUrlUseCase$invoke$1) continuationImpl).write;
                throw null;
            }
            getIdentityVerificationUrlUseCase$invoke$1 = (GetIdentityVerificationUrlUseCase$invoke$1) continuationImpl;
            int i4 = getIdentityVerificationUrlUseCase$invoke$1.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                getIdentityVerificationUrlUseCase$invoke$1.write = i4 - Integer.MIN_VALUE;
            } else {
                getIdentityVerificationUrlUseCase$invoke$1 = new GetIdentityVerificationUrlUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getIdentityVerificationUrlUseCase$invoke$1 = new GetIdentityVerificationUrlUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = getIdentityVerificationUrlUseCase$invoke$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = getIdentityVerificationUrlUseCase$invoke$1.write;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            PhoneValidationRepository phoneValidationRepository = (PhoneValidationRepository) this.serializer;
            getIdentityVerificationUrlUseCase$invoke$1.write = 1;
            objM5017getIdentityVerificationUrlIoAF18A$implementation = phoneValidationRepository.m5017getIdentityVerificationUrlIoAF18A$implementation(getIdentityVerificationUrlUseCase$invoke$1);
            if (objM5017getIdentityVerificationUrlIoAF18A$implementation == coroutineSingletons) {
                int i6 = read + 21;
                write = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM5017getIdentityVerificationUrlIoAF18A$implementation = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        return !(objM5017getIdentityVerificationUrlIoAF18A$implementation instanceof isItemDismissable) ? ((ActivityHandler13) objM5017getIdentityVerificationUrlIoAF18A$implementation).url : objM5017getIdentityVerificationUrlIoAF18A$implementation;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (r9 == r3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.realtime.domain.GetAppStateImpl.read
            int r1 = r1 + 53
            int r2 = r1 % 128
            com.roadrunner.realtime.domain.GetAppStateImpl.write = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L9b
            boolean r1 = r9 instanceof o.setPurchaseVerificationUrl
            if (r1 == 0) goto L22
            r1 = r9
            o.setPurchaseVerificationUrl r1 = (o.setPurchaseVerificationUrl) r1
            int r3 = r1.RemoteActionCompatParcelizer
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L22
            int r3 = r3 + r4
            r1.RemoteActionCompatParcelizer = r3
            goto L27
        L22:
            o.setPurchaseVerificationUrl r1 = new o.setPurchaseVerificationUrl
            r1.<init>(r8, r9)
        L27:
            java.lang.Object r9 = r1.write
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r1.RemoteActionCompatParcelizer
            r5 = 1
            if (r4 == 0) goto L54
            if (r4 == r5) goto L50
            if (r4 != r0) goto L4a
            int r1 = com.roadrunner.realtime.domain.GetAppStateImpl.write
            int r1 = r1 + 49
            int r3 = r1 % 128
            com.roadrunner.realtime.domain.GetAppStateImpl.read = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L43
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L84
        L43:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            r2.hashCode()
            throw r2
        L4a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            return r2
        L50:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L68
        L54:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            java.lang.Object r9 = r8.serializer
            com.roadrunner.rider.state.domain.GetRiderStateImpl r9 = (com.roadrunner.rider.state.domain.GetRiderStateImpl) r9
            kotlinx.coroutines.flow.Flow r9 = r9.write()
            r1.RemoteActionCompatParcelizer = r5
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r9, r1)
            if (r9 != r3) goto L68
            goto L83
        L68:
            o.AdjustDeeplink r9 = (o.AdjustDeeplink) r9
            if (r9 == 0) goto L87
            o.setSdkPrefix r4 = r9.read
            o.getFailureResponseData r9 = r9.write
            r1.RemoteActionCompatParcelizer = r0
            kotlinx.coroutines.scheduling.DefaultScheduler r5 = o.prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer
            kotlinx.coroutines.scheduling.DefaultIoScheduler r5 = kotlinx.coroutines.scheduling.DefaultIoScheduler.RemoteActionCompatParcelizer
            androidx.datastore.core.SingleProcessDataStore$data$1$1 r6 = new androidx.datastore.core.SingleProcessDataStore$data$1$1
            r7 = 29
            r6.<init>(r4, r9, r2, r7)
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r5, r6, r1)
            if (r9 != r3) goto L84
        L83:
            return r3
        L84:
            o.checkEventToken r9 = (o.checkEventToken) r9
            goto L88
        L87:
            r9 = r2
        L88:
            if (r9 == 0) goto L9a
            int r1 = com.roadrunner.realtime.domain.GetAppStateImpl.write
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.roadrunner.realtime.domain.GetAppStateImpl.read = r2
            int r1 = r1 % r0
            java.util.Calendar r9 = r9.serializer
            java.util.Date r9 = r9.getTime()
            return r9
        L9a:
            return r2
        L9b:
            boolean r9 = r9 instanceof o.setPurchaseVerificationUrl
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.realtime.domain.GetAppStateImpl.invoke(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public boolean RemoteActionCompatParcelizer(String str, endStream endstream, verifyPlayStorePurchaseI verifyplaystorepurchasei) {
        int i = 2 % 2;
        BrazeExternalSyntheticLambda5 brazeExternalSyntheticLambda5 = (BrazeExternalSyntheticLambda5) this.serializer;
        str.getClass();
        endstream.getClass();
        verifyplaystorepurchasei.getClass();
        if (endstream.equals(C0166g.read)) {
            brazeExternalSyntheticLambda5.getClass();
            boolean zSerializer = BrazeExternalSyntheticLambda5.serializer(str);
            int i2 = awaitimpl.IconCompatParcelizer[verifyplaystorepurchasei.ordinal()];
            if (i2 == 1 || i2 == 2) {
                return zSerializer;
            }
            int i3 = read + 119;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0 ? i2 != 3 : i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return false;
            }
        } else {
            if (!endstream.equals(C0175h.read)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return false;
            }
            brazeExternalSyntheticLambda5.getClass();
            boolean zSerializer2 = BrazeExternalSyntheticLambda5.serializer(str);
            boolean zRemoteActionCompatParcelizer = BrazeExternalSyntheticLambda5.RemoteActionCompatParcelizer(str);
            int i4 = awaitimpl.IconCompatParcelizer[verifyplaystorepurchasei.ordinal()];
            if (i4 == 1) {
                return zSerializer2;
            }
            if (i4 != 2) {
                if (i4 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return false;
                }
                int i5 = write + 35;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return zRemoteActionCompatParcelizer;
                }
                throw null;
            }
            if (zSerializer2 || zRemoteActionCompatParcelizer) {
                return true;
            }
        }
        int i6 = read + 33;
        write = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }

    public startFirstSessionI read(pausedI pausedi) {
        teardownEventMetadataS teardowneventmetadatas;
        int i = 2 % 2;
        pausedi.getClass();
        String str = pausedi.name;
        String str2 = pausedi.address;
        processDeeplinkI processdeeplinki = pausedi.phoneNumber;
        if (processdeeplinki != null) {
            ((BrazeCompanionExternalSyntheticLambda21) this.serializer).getClass();
            boolean z = processdeeplinki.masked;
            teardowneventmetadatas = new teardownEventMetadataS(processdeeplinki.number, processdeeplinki.callee, processdeeplinki.calleeName, processdeeplinki.orderCode, processdeeplinki.completedAt, z);
            int i2 = read + 49;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            teardowneventmetadatas = null;
        }
        teardownEventMetadataS teardowneventmetadatas2 = teardowneventmetadatas;
        int i4 = read + 77;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return new startFirstSessionI(str, str2, pausedi.specialInstructions, teardowneventmetadatas2, pausedi.latitude, pausedi.longitude);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public Object m5010invokegIAlus(String str, ContinuationImpl continuationImpl) {
        UpdateRiderPushToken$invoke$1 updateRiderPushToken$invoke$1;
        GoAndStartUseCaseImpl$invoke$1 goAndStartUseCaseImpl$invoke$1;
        int i = 2 % 2;
        int i2 = read + 111;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        Object objM5070startWorkinggIAlus = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.IconCompatParcelizer;
        Object obj = this.serializer;
        if (i4 == 8) {
            if (continuationImpl instanceof UpdateRiderPushToken$invoke$1) {
                updateRiderPushToken$invoke$1 = (UpdateRiderPushToken$invoke$1) continuationImpl;
                int i5 = updateRiderPushToken$invoke$1.RemoteActionCompatParcelizer;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    int i6 = write + 117;
                    read = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    updateRiderPushToken$invoke$1.RemoteActionCompatParcelizer = i5 - Integer.MIN_VALUE;
                } else {
                    updateRiderPushToken$invoke$1 = new UpdateRiderPushToken$invoke$1(this, continuationImpl);
                }
            } else {
                updateRiderPushToken$invoke$1 = new UpdateRiderPushToken$invoke$1(this, continuationImpl);
            }
            Object obj2 = updateRiderPushToken$invoke$1.serializer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = updateRiderPushToken$invoke$1.RemoteActionCompatParcelizer;
            if (i8 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                access1500 access1500Var = new access1500(str);
                updateRiderPushToken$invoke$1.RemoteActionCompatParcelizer = 1;
                Object objM5004registerPushForRidergIAlus = ((PushServiceRepository) obj).m5004registerPushForRidergIAlus(access1500Var, updateRiderPushToken$invoke$1);
                return objM5004registerPushForRidergIAlus == coroutineSingletons ? coroutineSingletons : objM5004registerPushForRidergIAlus;
            }
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = write + 29;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                return ((onItemDismiss) obj2).IconCompatParcelizer;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            Object obj3 = ((onItemDismiss) obj2).IconCompatParcelizer;
            throw null;
        }
        if (continuationImpl instanceof GoAndStartUseCaseImpl$invoke$1) {
            int i10 = i3 + 99;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            goAndStartUseCaseImpl$invoke$1 = (GoAndStartUseCaseImpl$invoke$1) continuationImpl;
            int i12 = goAndStartUseCaseImpl$invoke$1.serializer;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                goAndStartUseCaseImpl$invoke$1.serializer = i12 - Integer.MIN_VALUE;
            } else {
                goAndStartUseCaseImpl$invoke$1 = new GoAndStartUseCaseImpl$invoke$1(this, continuationImpl);
            }
        } else {
            goAndStartUseCaseImpl$invoke$1 = new GoAndStartUseCaseImpl$invoke$1(this, continuationImpl);
        }
        Object obj4 = goAndStartUseCaseImpl$invoke$1.write;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = goAndStartUseCaseImpl$invoke$1.serializer;
        if (i13 != 0) {
            int i14 = read + 45;
            write = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            if (i13 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj4);
                objM5070startWorkinggIAlus = ((onItemDismiss) obj4).IconCompatParcelizer;
                int i16 = write + 25;
                read = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj4);
            handleInternalBannerRefreshlambda1 handleinternalbannerrefreshlambda1 = new handleInternalBannerRefreshlambda1(isEphemeralEventKey.GO_AND_START_LOW_FILL, null, null, str, null);
            goAndStartUseCaseImpl$invoke$1.serializer = 1;
            objM5070startWorkinggIAlus = ((StartWorkingRepository) obj).m5070startWorkinggIAlus(handleinternalbannerrefreshlambda1, goAndStartUseCaseImpl$invoke$1);
            if (objM5070startWorkinggIAlus == coroutineSingletons2) {
                objM5070startWorkinggIAlus = coroutineSingletons2;
            }
        }
        int i18 = read + 83;
        write = i18 % Fields.SpotShadowColor;
        if (i18 % 2 != 0) {
            int i19 = 74 / 0;
        }
        return objM5070startWorkinggIAlus;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public Object invoke$implementation(List list, ContinuationImpl continuationImpl) throws Throwable {
        setLogLevel setloglevel;
        Iterator it;
        int i;
        Object obj;
        int i2 = 2 % 2;
        if (continuationImpl instanceof setLogLevel) {
            setloglevel = (setLogLevel) continuationImpl;
            int i3 = setloglevel.write;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                setloglevel.write = i3 - Integer.MIN_VALUE;
            } else {
                setloglevel = new setLogLevel(this, continuationImpl);
            }
        } else {
            setloglevel = new setLogLevel(this, continuationImpl);
        }
        Object obj2 = setloglevel.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = setloglevel.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i4 != 0) {
            int i5 = write + 39;
            int i6 = i5 % Fields.SpotShadowColor;
            read = i6;
            if (i5 % 2 != 0 ? i4 != 1 : i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = i6 + 99;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                int i8 = setloglevel.IconCompatParcelizer;
                Iterator it2 = setloglevel.read;
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                throw null;
            }
            i = setloglevel.IconCompatParcelizer;
            it = setloglevel.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            it = list.iterator();
            int i9 = write + 1;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i = 0;
        }
        do {
            boolean zHasNext = it.hasNext();
            obj = createFromParcel.INSTANCE;
            if (!zHasNext) {
                return obj;
            }
            disableAppSetIdReading disableappsetidreading = (disableAppSetIdReading) it.next();
            GetAppStateImpl getAppStateImpl = (GetAppStateImpl) this.serializer;
            setParameters setparameters = new setParameters(onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("communication_id", disableappsetidreading.serializer), new onViewAttachedToWindowlambda0("evaluation_id", disableappsetidreading.read)));
            setloglevel.read = it;
            setloglevel.IconCompatParcelizer = i;
            setloglevel.write = 1;
            Parser.Pair pair = (Parser.Pair) getAppStateImpl.serializer;
            ((inCompatibilityMode) ((isOpenInternalroom_runtime) pair.write)).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new PhotoIdUiModelImpl$1$1(pair, setparameters, shortNewsContentCardView, 14), setloglevel);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (objWithContext != coroutineSingletons2) {
                objWithContext = obj;
            }
            if (objWithContext == coroutineSingletons2) {
                obj = objWithContext;
            }
        } while (obj != coroutineSingletons);
        int i11 = write + 83;
        read = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return coroutineSingletons;
    }
}
