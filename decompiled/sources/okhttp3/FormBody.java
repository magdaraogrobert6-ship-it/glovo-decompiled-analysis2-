package okhttp3;

import android.media.Image;
import android.webkit.WebResourceResponse;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import bo.app.k7$$ExternalSyntheticLambda2;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huawei.hms.adapter.internal.CommonCode;
import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.delivery.repository.CachedDeliveryRepository;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import com.roadrunner.liveness.recording.domain.DetectFaceInImage$invoke$1;
import com.roadrunner.liveness.recording.domain.FaceDetectionException;
import com.roadrunner.liveness.recording.domain.LogUnexpectedLivenessError;
import com.roadrunner.nafath.data.NafathTimerDataStore$set$2;
import com.roadrunner.phonenumber.data.api.ProxyPhonePhoneNumberApiRequest$getPhoneNumber$1;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpRepository$sendOtp$1;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.OtpRepository$validateOtp$1;
import com.roadrunner.rider.safety.log.data.SubmitSafetyLogEventWorker$doWork$result$1;
import com.roadrunner.rider.safety.report.data.SafetyReportRepository$getSafetyReport$2;
import com.roadrunner.settings.data.PromotionsApiRequest$invoke$1;
import com.sentiance.core.model.events.H$b;
import com.sentiance.core.model.thrift.DataAction;
import com.sentiance.core.model.thrift.ThriftBool;
import dagger.Lazy;
import io.grpc.LoadBalancer$Helper;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.TextStreamsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.BrazeCompanionExternalSyntheticLambda21;
import o.BrazeExternalSyntheticLambda45;
import o.BrazeUserExternalSyntheticLambda1;
import o.BringIntoViewOnScreenResponderNode;
import o.CalculateMatrixToWindow;
import o.FeatureCombinationQueryImplExternalSyntheticLambda2;
import o.InAppMessageHtmlBaseView;
import o.Placeable;
import o.RegistryMissingComponentException;
import o.RegistryNoImageHeaderParserException;
import o.ShortNewsContentCardView;
import o._get_messageWebView_lambda1;
import o._get_messageWebView_lambda3;
import o.accessgetInstancedelegatecp;
import o.accessgetParentLayoutDirection;
import o.calculateMatrixToWindowEL8BTi8;
import o.clipCanvasToPath;
import o.decode;
import o.ensureSubscribedToInAppMessageEvents;
import o.getContentViewGroupParentLayout;
import o.getInAppMessageEventMap;
import o.handleIncomingIntentlambda1;
import o.invokeMethodQuietlylambda0;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.isOpenInternalroom_runtime;
import o.onContentCardDismissed;
import o.onDowngrade;
import o.onItemDismiss;
import o.onMove;
import o.onResumeI;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0;
import o.r8lambdaMPzwjNy3Ix7pjQnMRxA6_CdyVM;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaemiioW_nKh79YyPl9R1HU3hWdFc;
import o.r8lambdag0m0JVUE1KB8aI8kjJMGJSHe1o8;
import o.r8lambdahFzVXArQHjyg4Plg7rZXdYrHhg;
import o.r8lambdahS9AYWDlYhE8cYp1cEpZsQk_zUk;
import o.r8lambdahzshocQMpV5shdKumio5m5xOK0E;
import o.r8lambdaiGkHmxsmtvlpPViW5Cq5WSA4KHU;
import o.r8lambdainxoiPJdmwnizvQTKwsIJ_9tRM;
import o.r8lambdajbxBm0A7iJGxAyZffWwcxD8hq8k;
import o.r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs;
import o.r8lambdas7hGQZUVhdtJa9loZ8w1Xl2jDOA;
import o.r8lambdasr5bVOa2Di9thfD9WpM7Q9rULYM;
import o.r8lambdav4khHexYF7B8JZECOja6EPumcY4;
import o.r8lambdav9lEwuigriKPLoepmU9DzDAsGns;
import o.r8lambdavqK0yH3ghr0voBP7IVvbATocpo;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.removeNodeAtDepth;
import o.retryInAppMessage;
import o.safeSetClipToOutline;
import o.setCarryoverInAppMessage;
import o.setEmailNotificationSubscriptionType;
import o.setHeightOnViewLayoutParams;
import o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;
import o.setRequestedFrameRate;
import o.setWebViewContent;
import o.stopInstancelambda11;
import o.subscribeToNoMatchingTriggerForEvent;
import o.timesmpE4wyQ;
import o.transferSessionPackageI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public final class FormBody extends RequestBody {
    public static final InAppMessageHtmlBaseView read;
    public final List IconCompatParcelizer;
    public final List write;

    @Override // okhttp3.RequestBody
    public final InAppMessageHtmlBaseView contentType() {
        return read;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(RegistryNoImageHeaderParserException registryNoImageHeaderParserException) throws EOFException {
        read(registryNoImageHeaderParserException, false);
    }

    public final class Builder {
        private static int read = 0;
        private static int write = 1;
        public Object RemoteActionCompatParcelizer;
        public Object serializer;

        public Builder(int i) {
            int i2 = 28;
            boolean z = true;
            if (i == 1) {
                int i3 = 2;
                this.serializer = new CalculateMatrixToWindow(i3, i3, z, 0.5f);
                this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(i2, this));
            } else if (i != 28) {
                this.serializer = new ArrayList();
                this.RemoteActionCompatParcelizer = new ArrayList();
            } else {
                this.serializer = new AtomicLong();
                this.RemoteActionCompatParcelizer = new AtomicLong();
            }
        }

        public FormBody write() {
            int i = 2 % 2;
            FormBody formBody = new FormBody((ArrayList) this.serializer, (ArrayList) this.RemoteActionCompatParcelizer);
            int i2 = write + 63;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 6 / 0;
            }
            return formBody;
        }

        public boolean MediaSessionCompatQueueItem() {
            int i = 2 % 2;
            invokeMethodQuietlylambda0 invokemethodquietlylambda0 = (invokeMethodQuietlylambda0) this.serializer;
            if (!(!invokemethodquietlylambda0.read)) {
                return false;
            }
            int i2 = read + 43;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (invokemethodquietlylambda0.RemoteActionCompatParcelizer) {
                return false;
            }
            int i4 = read + 97;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }

        public void RatingCompat() {
            int i = 2 % 2;
            int i2 = write + 17;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ((invokeMethodQuietlylambda0) this.serializer).RemoteActionCompatParcelizer = true;
            ((ScheduledFuture) this.RemoteActionCompatParcelizer).cancel(false);
            int i4 = write + 1;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void RemoteActionCompatParcelizer(long j, String str) {
            int i = 2 % 2;
            ((decode) this.serializer).logEvent("nafath_modal_displayed", IconCompatParcelizer(str, new k7$$ExternalSyntheticLambda2(j, 7)));
            int i2 = read + 87;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }

        public void RemoteActionCompatParcelizer(String str, Map map) {
            int i = 2 % 2;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.RemoteActionCompatParcelizer;
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new NafathTimerDataStore$set$2(this, str, map, null, 17), 2);
            int i2 = write + 111;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }

        public handleIncomingIntentlambda1 RemoteActionCompatParcelizer() {
            int i = 2 % 2;
            if (((Short) this.serializer) == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'venueType' is missing");
                int i2 = read + 41;
                write = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return null;
            }
            int i4 = write + 81;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (((Double) this.RemoteActionCompatParcelizer) != null) {
                return new handleIncomingIntentlambda1(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'likelihood' is missing");
            return null;
        }

        public retryInAppMessage read() {
            int i = 2 % 2;
            int i2 = write + 45;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                if (((Byte) this.serializer) != null) {
                    return new retryInAppMessage(this);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'type' is missing");
                int i3 = write + 97;
                read = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            throw null;
        }

        public setEmailNotificationSubscriptionType IconCompatParcelizer() {
            int i = 2 % 2;
            if (((ThriftBool) this.serializer) != null) {
                int i2 = write + 1;
                read = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                if (((Byte) this.RemoteActionCompatParcelizer) != null) {
                    return new setEmailNotificationSubscriptionType(this);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'percent_threshold' is missing");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'is_low' is missing");
            int i4 = write + 41;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return null;
        }

        public void RemoteActionCompatParcelizer(String str, String str2) {
            int i = 2 % 2;
            int i2 = read + 43;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            str.getClass();
            ((ArrayList) this.serializer).add(setHeightOnViewLayoutParams.write(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
            ((ArrayList) this.RemoteActionCompatParcelizer).add(setHeightOnViewLayoutParams.write(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
            int i4 = read + 55;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }

        public BrazeUserExternalSyntheticLambda1 serializer() {
            int i = 2 % 2;
            if (((Map) this.serializer) != null) {
                int i2 = read + 19;
                write = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    if (((DataAction) this.RemoteActionCompatParcelizer) != null) {
                        return new BrazeUserExternalSyntheticLambda1(this);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'action' is missing");
                } else {
                    throw null;
                }
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'labels' is missing");
                int i3 = read + 85;
                write = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
            return null;
        }

        public void read(String str, String str2) {
            int i = 2 % 2;
            int i2 = read + 73;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            str.getClass();
            ((ArrayList) this.serializer).add(setHeightOnViewLayoutParams.write(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            ((ArrayList) this.RemoteActionCompatParcelizer).add(setHeightOnViewLayoutParams.write(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            int i4 = write + 55;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }

        public Builder(H$b h$b, onResumeI onresumei) {
            h$b.getClass();
            onresumei.getClass();
            this.serializer = h$b;
            this.RemoteActionCompatParcelizer = onresumei;
        }

        public Builder(transferSessionPackageI transfersessionpackagei, BrazeExternalSyntheticLambda45 brazeExternalSyntheticLambda45) {
            transfersessionpackagei.getClass();
            this.serializer = transfersessionpackagei;
            this.RemoteActionCompatParcelizer = brazeExternalSyntheticLambda45;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0026  */
        /* JADX WARN: Code duplicated, block: B:15:0x0042  */
        /* JADX WARN: Code duplicated, block: B:17:0x004d A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:19:0x0050 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:24:0x0069  */
        /* JADX WARN: Code duplicated, block: B:26:0x007f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x0080  */
        /* JADX WARN: Code duplicated, block: B:9:0x001b  */
        /* JADX INFO: renamed from: sendOtp-gIAlu-s$implementation, reason: not valid java name */
        public Object m5159sendOtpgIAlus$implementation(String str, ContinuationImpl continuationImpl) {
            OtpRepository$sendOtp$1 otpRepository$sendOtp$1;
            int i;
            Object obj;
            CoroutineSingletons coroutineSingletons;
            int i2;
            ShortNewsContentCardView shortNewsContentCardView;
            Object objM5076invokegIAlus;
            int i3;
            int i4 = 2 % 2;
            int i5 = write + 81;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                if (continuationImpl instanceof OtpRepository$sendOtp$1) {
                    otpRepository$sendOtp$1 = (OtpRepository$sendOtp$1) continuationImpl;
                    i = otpRepository$sendOtp$1.write;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        int i6 = read + 3;
                        write = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        otpRepository$sendOtp$1.write = i - Integer.MIN_VALUE;
                    }
                }
                obj = otpRepository$sendOtp$1.read;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = otpRepository$sendOtp$1.write;
                shortNewsContentCardView = null;
                if (i2 == 0) {
                    i3 = read + 35;
                    write = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                H$b h$b = (H$b) this.serializer;
                AuthRepository$logoutUser$2 authRepository$logoutUser$2 = new AuthRepository$logoutUser$2(this, str, shortNewsContentCardView, 27);
                otpRepository$sendOtp$1.write = 1;
                objM5076invokegIAlus = h$b.m5076invokegIAlus(authRepository$logoutUser$2, otpRepository$sendOtp$1);
                if (objM5076invokegIAlus == coroutineSingletons) {
                    return coroutineSingletons;
                }
                int i8 = write + 45;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return objM5076invokegIAlus;
            }
            int i10 = 57 / 0;
            if (continuationImpl instanceof OtpRepository$sendOtp$1) {
                otpRepository$sendOtp$1 = (OtpRepository$sendOtp$1) continuationImpl;
                i = otpRepository$sendOtp$1.write;
                if ((i & Integer.MIN_VALUE) != 0) {
                    int i11 = read + 3;
                    write = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    otpRepository$sendOtp$1.write = i - Integer.MIN_VALUE;
                }
            }
            obj = otpRepository$sendOtp$1.read;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = otpRepository$sendOtp$1.write;
            shortNewsContentCardView = null;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                H$b h$b2 = (H$b) this.serializer;
                AuthRepository$logoutUser$2 authRepository$logoutUser$3 = new AuthRepository$logoutUser$2(this, str, shortNewsContentCardView, 27);
                otpRepository$sendOtp$1.write = 1;
                objM5076invokegIAlus = h$b2.m5076invokegIAlus(authRepository$logoutUser$3, otpRepository$sendOtp$1);
                if (objM5076invokegIAlus == coroutineSingletons) {
                    return coroutineSingletons;
                }
                int i13 = write + 45;
                read = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                return objM5076invokegIAlus;
            }
            i3 = read + 35;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
            int i15 = write + 105;
            read = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            return obj2;
            otpRepository$sendOtp$1 = new OtpRepository$sendOtp$1(this, continuationImpl);
            obj = otpRepository$sendOtp$1.read;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = otpRepository$sendOtp$1.write;
            shortNewsContentCardView = null;
            if (i2 == 0) {
                i3 = read + 35;
                write = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            H$b h$b3 = (H$b) this.serializer;
            AuthRepository$logoutUser$2 authRepository$logoutUser$4 = new AuthRepository$logoutUser$2(this, str, shortNewsContentCardView, 27);
            otpRepository$sendOtp$1.write = 1;
            objM5076invokegIAlus = h$b3.m5076invokegIAlus(authRepository$logoutUser$4, otpRepository$sendOtp$1);
            if (objM5076invokegIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
            int i17 = write + 45;
            read = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            return objM5076invokegIAlus;
        }

        public Builder(Lazy lazy, setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release) {
            lazy.getClass();
            this.serializer = lazy;
            this.RemoteActionCompatParcelizer = sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002b  */
        /* JADX INFO: renamed from: getPhoneNumber-gIAlu-s, reason: not valid java name */
        public Object m5156getPhoneNumbergIAlus(long j, ContinuationImpl continuationImpl) {
            ProxyPhonePhoneNumberApiRequest$getPhoneNumber$1 proxyPhonePhoneNumberApiRequest$getPhoneNumber$1;
            int i = 2 % 2;
            int i2 = read + 13;
            write = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                boolean z = continuationImpl instanceof ProxyPhonePhoneNumberApiRequest$getPhoneNumber$1;
                obj.hashCode();
                throw null;
            }
            if (continuationImpl instanceof ProxyPhonePhoneNumberApiRequest$getPhoneNumber$1) {
                proxyPhonePhoneNumberApiRequest$getPhoneNumber$1 = (ProxyPhonePhoneNumberApiRequest$getPhoneNumber$1) continuationImpl;
                int i3 = proxyPhonePhoneNumberApiRequest$getPhoneNumber$1.serializer;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    int i4 = read + 29;
                    write = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    proxyPhonePhoneNumberApiRequest$getPhoneNumber$1.serializer = i3 - Integer.MIN_VALUE;
                } else {
                    proxyPhonePhoneNumberApiRequest$getPhoneNumber$1 = new ProxyPhonePhoneNumberApiRequest$getPhoneNumber$1(this, continuationImpl);
                }
            } else {
                proxyPhonePhoneNumberApiRequest$getPhoneNumber$1 = new ProxyPhonePhoneNumberApiRequest$getPhoneNumber$1(this, continuationImpl);
            }
            Object obj2 = proxyPhonePhoneNumberApiRequest$getPhoneNumber$1.write;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = proxyPhonePhoneNumberApiRequest$getPhoneNumber$1.serializer;
            if (i6 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) this.RemoteActionCompatParcelizer;
                SafetyReportRepository$getSafetyReport$2 safetyReportRepository$getSafetyReport$2 = new SafetyReportRepository$getSafetyReport$2(this, j, null, 2);
                proxyPhonePhoneNumberApiRequest$getPhoneNumber$1.serializer = 1;
                Object objM4875invokegIAlus = executeApiRequest.m4875invokegIAlus(safetyReportRepository$getSafetyReport$2, proxyPhonePhoneNumberApiRequest$getPhoneNumber$1);
                return objM4875invokegIAlus == coroutineSingletons ? coroutineSingletons : objM4875invokegIAlus;
            }
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = read + 11;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                return ((onItemDismiss) obj2).IconCompatParcelizer;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            Object obj3 = ((onItemDismiss) obj2).IconCompatParcelizer;
            obj.hashCode();
            throw null;
        }

        public Builder(decode decodeVar, CachedDeliveryRepository cachedDeliveryRepository) {
            decodeVar.getClass();
            cachedDeliveryRepository.getClass();
            this.serializer = decodeVar;
            this.RemoteActionCompatParcelizer = cachedDeliveryRepository;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002d  */
        /* JADX INFO: renamed from: validateOtp-BWLJW6A$implementation, reason: not valid java name */
        public Object m5160validateOtpBWLJW6A$implementation(String str, String str2, String str3, ContinuationImpl continuationImpl) {
            OtpRepository$validateOtp$1 otpRepository$validateOtp$1;
            int i = 2 % 2;
            Object obj = null;
            if (continuationImpl instanceof OtpRepository$validateOtp$1) {
                int i2 = write + 49;
                read = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = ((OtpRepository$validateOtp$1) continuationImpl).IconCompatParcelizer;
                    obj.hashCode();
                    throw null;
                }
                otpRepository$validateOtp$1 = (OtpRepository$validateOtp$1) continuationImpl;
                int i4 = otpRepository$validateOtp$1.IconCompatParcelizer;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    otpRepository$validateOtp$1.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
                } else {
                    otpRepository$validateOtp$1 = new OtpRepository$validateOtp$1(this, continuationImpl);
                }
            } else {
                otpRepository$validateOtp$1 = new OtpRepository$validateOtp$1(this, continuationImpl);
            }
            OtpRepository$validateOtp$1 otpRepository$validateOtp$2 = otpRepository$validateOtp$1;
            Object obj2 = otpRepository$validateOtp$2.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = otpRepository$validateOtp$2.IconCompatParcelizer;
            if (i5 != 0) {
                int i6 = read + 61;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (i5 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    return ((onItemDismiss) obj2).IconCompatParcelizer;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            H$b h$b = (H$b) this.serializer;
            SubmitSafetyLogEventWorker$doWork$result$1 submitSafetyLogEventWorker$doWork$result$1 = new SubmitSafetyLogEventWorker$doWork$result$1(this, str, str2, str3, null, 3);
            otpRepository$validateOtp$2.IconCompatParcelizer = 1;
            Object objM5076invokegIAlus = h$b.m5076invokegIAlus(submitSafetyLogEventWorker$doWork$result$1, otpRepository$validateOtp$2);
            if (objM5076invokegIAlus != coroutineSingletons) {
                return objM5076invokegIAlus;
            }
            int i8 = read + 109;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return coroutineSingletons;
        }

        public Builder(decode decodeVar, getContentViewGroupParentLayout getcontentviewgroupparentlayout, isOpenInternalroom_runtime isopeninternalroom_runtime) {
            this.serializer = decodeVar;
            this.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout;
        }

        public /* synthetic */ Builder(Object obj, Object obj2) {
            this.serializer = obj;
            this.RemoteActionCompatParcelizer = obj2;
        }

        public Builder(invokeMethodQuietlylambda0 invokemethodquietlylambda0, ScheduledFuture scheduledFuture) {
            this.serializer = invokemethodquietlylambda0;
            TextStreamsKt.serializer(scheduledFuture, "future");
            this.RemoteActionCompatParcelizer = scheduledFuture;
        }

        public safeSetClipToOutline IconCompatParcelizer(String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            Set set;
            String str2;
            String str3;
            String str4;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
            int i;
            int i2 = 2 % 2;
            safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
            safeSetClipToOutline safesetcliptooutline2 = new safeSetClipToOutline();
            timesmpE4wyQ timesmpe4wyqIconCompatParcelizer = ((CachedDeliveryRepository) this.RemoteActionCompatParcelizer).IconCompatParcelizer();
            Set set2 = timesmpe4wyqIconCompatParcelizer.MediaBrowserCompatMediaItem;
            Set set3 = timesmpe4wyqIconCompatParcelizer.RemoteActionCompatParcelizer;
            if (!set3.isEmpty()) {
                int i3 = write + 19;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                safesetcliptooutline2.put("delivery_id", onContentCardDismissed.IconCompatParcelizer(set3, ",", null, null, null, 62));
            }
            if (!set2.isEmpty()) {
                int i5 = read + 55;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    set = set2;
                    str2 = ",";
                    str3 = null;
                    str4 = null;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = null;
                    i = 37;
                } else {
                    set = set2;
                    str2 = ",";
                    str3 = null;
                    str4 = null;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = null;
                    i = 62;
                }
                safesetcliptooutline2.put("order_id", onContentCardDismissed.IconCompatParcelizer(set, str2, str3, str4, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, i));
            }
            safesetcliptooutline.putAll(safesetcliptooutline2.IconCompatParcelizer());
            if (str != null) {
                int i6 = read + 117;
                write = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    safesetcliptooutline.put(CommonCode.MapKey.TRANSACTION_ID, str);
                    int i7 = 1 / 0;
                } else {
                    safesetcliptooutline.put(CommonCode.MapKey.TRANSACTION_ID, str);
                }
                int i8 = write + 19;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    int i9 = 4 / 4;
                }
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(safesetcliptooutline);
            return safesetcliptooutline.IconCompatParcelizer();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001f  */
        /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
        public Object m5157invokegIAlus(FeatureCombinationQueryImplExternalSyntheticLambda2 featureCombinationQueryImplExternalSyntheticLambda2, ContinuationImpl continuationImpl) {
            DetectFaceInImage$invoke$1 detectFaceInImage$invoke$1;
            int i = 2 % 2;
            if (continuationImpl instanceof DetectFaceInImage$invoke$1) {
                detectFaceInImage$invoke$1 = (DetectFaceInImage$invoke$1) continuationImpl;
                int i2 = detectFaceInImage$invoke$1.write;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    int i3 = read + 85;
                    write = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    detectFaceInImage$invoke$1.write = i2 - Integer.MIN_VALUE;
                } else {
                    detectFaceInImage$invoke$1 = new DetectFaceInImage$invoke$1(this, continuationImpl);
                    int i5 = read + 97;
                    write = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                }
            } else {
                detectFaceInImage$invoke$1 = new DetectFaceInImage$invoke$1(this, continuationImpl);
                int i7 = read + 97;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
            Object orThrow = detectFaceInImage$invoke$1.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i9 = detectFaceInImage$invoke$1.write;
            if (i9 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(orThrow);
                detectFaceInImage$invoke$1.write = 1;
                SafeContinuation safeContinuation = new SafeContinuation(LoadBalancer$Helper.intercepted(detectFaceInImage$invoke$1), CoroutineSingletons.UNDECIDED);
                Image imageRemoteActionCompatParcelizer = featureCombinationQueryImplExternalSyntheticLambda2.IconCompatParcelizer.RemoteActionCompatParcelizer();
                if (imageRemoteActionCompatParcelizer == null) {
                    FaceDetectionException faceDetectionException = new FaceDetectionException("The Image proxy wrapper contains no image", null);
                    Timber.RemoteActionCompatParcelizer.write(faceDetectionException);
                    safeContinuation.resumeWith(new onItemDismiss(new isItemDismissable(faceDetectionException)));
                } else {
                    try {
                        zzw zzwVarSerializer = ((calculateMatrixToWindowEL8BTi8) ((BringIntoViewOnScreenResponderNode) ((isAdapterPositionOnScreen) this.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper())).serializer(setRequestedFrameRate.RemoteActionCompatParcelizer(imageRemoteActionCompatParcelizer, featureCombinationQueryImplExternalSyntheticLambda2.write.read()));
                        LogUnexpectedLivenessError logUnexpectedLivenessError = new LogUnexpectedLivenessError(new onDowngrade(safeContinuation));
                        zzwVarSerializer.getClass();
                        accessgetParentLayoutDirection accessgetparentlayoutdirection = Placeable.RemoteActionCompatParcelizer;
                        zzwVarSerializer.addOnSuccessListener(accessgetparentlayoutdirection, logUnexpectedLivenessError);
                        zzwVarSerializer.addOnFailureListener(accessgetparentlayoutdirection, new H$b(this, 20, safeContinuation));
                    } catch (IllegalStateException e) {
                        FaceDetectionException faceDetectionException2 = new FaceDetectionException("MlKitContext has not been initialized", e);
                        Timber.RemoteActionCompatParcelizer.write(faceDetectionException2);
                        safeContinuation.resumeWith(new onItemDismiss(new isItemDismissable(faceDetectionException2)));
                    }
                }
                orThrow = safeContinuation.getOrThrow();
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (orThrow == coroutineSingletons) {
                    int i10 = read + 69;
                    write = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 == 0) {
                        int i11 = 28 / 0;
                    }
                    return coroutineSingletons;
                }
            } else {
                if (i9 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(orThrow);
            }
            return ((onItemDismiss) orThrow).IconCompatParcelizer;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0022  */
        /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
        public Object m5158invokegIAlus(r8lambdaMPzwjNy3Ix7pjQnMRxA6_CdyVM r8lambdampzwjny3ix7pjqnmrxa6_cdyvm, ContinuationImpl continuationImpl) {
            PromotionsApiRequest$invoke$1 promotionsApiRequest$invoke$1;
            int i = 2 % 2;
            int i2 = write + 13;
            read = i2 % Fields.SpotShadowColor;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (i2 % 2 != 0) {
                boolean z = continuationImpl instanceof PromotionsApiRequest$invoke$1;
                shortNewsContentCardView.hashCode();
                throw null;
            }
            if (continuationImpl instanceof PromotionsApiRequest$invoke$1) {
                promotionsApiRequest$invoke$1 = (PromotionsApiRequest$invoke$1) continuationImpl;
                int i3 = promotionsApiRequest$invoke$1.serializer;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    promotionsApiRequest$invoke$1.serializer = i3 - Integer.MIN_VALUE;
                } else {
                    promotionsApiRequest$invoke$1 = new PromotionsApiRequest$invoke$1(this, continuationImpl);
                }
            } else {
                promotionsApiRequest$invoke$1 = new PromotionsApiRequest$invoke$1(this, continuationImpl);
            }
            Object obj = promotionsApiRequest$invoke$1.read;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = promotionsApiRequest$invoke$1.serializer;
            if (i4 != 0) {
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i5 = write + 25;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return ((onItemDismiss) obj).IconCompatParcelizer;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
                shortNewsContentCardView.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) this.RemoteActionCompatParcelizer;
            TooltipStateImpl.AnonymousClass2 anonymousClass2 = new TooltipStateImpl.AnonymousClass2(this, r8lambdampzwjny3ix7pjqnmrxa6_cdyvm, shortNewsContentCardView, 19);
            promotionsApiRequest$invoke$1.serializer = 1;
            Object objM4875invokegIAlus = executeApiRequest.m4875invokegIAlus(anonymousClass2, promotionsApiRequest$invoke$1);
            if (objM4875invokegIAlus != coroutineSingletons) {
                return objM4875invokegIAlus;
            }
            int i6 = write + 101;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return coroutineSingletons;
            }
            shortNewsContentCardView.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00e3 A[PHI: r4
  0x00e3: PHI (r4v23 o.r8lambdaemiioW_nKh79YyPl9R1HU3hWdFc) = (r4v22 o.r8lambdaemiioW_nKh79YyPl9R1HU3hWdFc), (r4v32 o.r8lambdaemiioW_nKh79YyPl9R1HU3hWdFc) binds: [B:35:0x00e1, B:32:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:37:0x00e6  */
        public r8lambdaemiioW_nKh79YyPl9R1HU3hWdFc IconCompatParcelizer(r8lambdajbxBm0A7iJGxAyZffWwcxD8hq8k r8lambdajbxbm0a7ijgxayzffwwcxd8hq8k, r8lambdav9lEwuigriKPLoepmU9DzDAsGns r8lambdav9lewuigrikploepmu9dzdasgns) {
            String strValueOf;
            String str;
            r8lambdaemiioW_nKh79YyPl9R1HU3hWdFc r8lambdaemiiow_nkh79yypl9r1hu3hwdfcIconCompatParcelizer;
            r8lambdav4khHexYF7B8JZECOja6EPumcY4 r8lambdav4khhexyf7b8jzecoja6epumcy4;
            String str2;
            int i = 2 % 2;
            BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21 = (BrazeCompanionExternalSyntheticLambda21) this.serializer;
            r8lambdajbxbm0a7ijgxayzffwwcxd8hq8k.getClass();
            r8lambdav9lewuigrikploepmu9dzdasgns.getClass();
            String strValueOf2 = "+99";
            Object obj = null;
            if (r8lambdajbxbm0a7ijgxayzffwwcxd8hq8k instanceof r8lambdainxoiPJdmwnizvQTKwsIJ_9tRM) {
                r8lambdainxoiPJdmwnizvQTKwsIJ_9tRM r8lambdainxoipjdmwnizvqtkwsij_9trm = (r8lambdainxoiPJdmwnizvQTKwsIJ_9tRM) r8lambdajbxbm0a7ijgxayzffwwcxd8hq8k;
                r8lambdahzshocQMpV5shdKumio5m5xOK0E r8lambdahzshocqmpv5shdkumio5m5xok0e = r8lambdainxoipjdmwnizvqtkwsij_9trm.analytics;
                String str3 = r8lambdainxoipjdmwnizvqtkwsij_9trm.link;
                String str4 = r8lambdainxoipjdmwnizvqtkwsij_9trm.label;
                String str5 = r8lambdainxoipjdmwnizvqtkwsij_9trm.logo;
                String str6 = r8lambdainxoipjdmwnizvqtkwsij_9trm.newTag;
                Integer num = r8lambdainxoipjdmwnizvqtkwsij_9trm.unreadCount;
                if (num != null) {
                    if (num.intValue() == 0) {
                        strValueOf2 = null;
                    } else if (num.intValue() <= 99) {
                        strValueOf2 = String.valueOf(num.intValue());
                    }
                    str2 = strValueOf2;
                } else {
                    str2 = null;
                }
                ((stopInstancelambda11) this.RemoteActionCompatParcelizer).getClass();
                str3.getClass();
                boolean zRemoteActionCompatParcelizer = setCarryoverInAppMessage.RemoteActionCompatParcelizer(str3, "https://", false);
                String str7 = r8lambdainxoipjdmwnizvqtkwsij_9trm.label;
                String str8 = r8lambdahzshocqmpv5shdkumio5m5xok0e.screenName;
                brazeCompanionExternalSyntheticLambda21.getClass();
                return new r8lambdavqK0yH3ghr0voBP7IVvbATocpo(str4, str5, str6, str2, zRemoteActionCompatParcelizer, BrazeCompanionExternalSyntheticLambda21.IconCompatParcelizer(str3, str7, str8), r8lambdahzshocqmpv5shdkumio5m5xok0e.screenName, r8lambdav9lewuigrikploepmu9dzdasgns);
            }
            if (r8lambdajbxbm0a7ijgxayzffwwcxd8hq8k instanceof r8lambdaiGkHmxsmtvlpPViW5Cq5WSA4KHU) {
                int i2 = write + 69;
                read = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                r8lambdaiGkHmxsmtvlpPViW5Cq5WSA4KHU r8lambdaigkhmxsmtvlppviw5cq5wsa4khu = (r8lambdaiGkHmxsmtvlpPViW5Cq5WSA4KHU) r8lambdajbxbm0a7ijgxayzffwwcxd8hq8k;
                List list = r8lambdaigkhmxsmtvlppviw5cq5wsa4khu.items;
                String str9 = r8lambdaigkhmxsmtvlppviw5cq5wsa4khu.label;
                String str10 = r8lambdaigkhmxsmtvlppviw5cq5wsa4khu.logo;
                List list2 = list;
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    int i4 = write + 119;
                    read = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    String str11 = ((r8lambdainxoiPJdmwnizvQTKwsIJ_9tRM) it.next()).newTag;
                    if (str11 != null) {
                        str = str11;
                        break;
                    }
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    int i6 = write + 125;
                    read = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        r8lambdaemiiow_nkh79yypl9r1hu3hwdfcIconCompatParcelizer = IconCompatParcelizer((r8lambdainxoiPJdmwnizvQTKwsIJ_9tRM) it2.next(), r8lambdav9lEwuigriKPLoepmU9DzDAsGns.ACCORDION_NESTED_ITEM);
                        int i7 = 5 / 0;
                        if (r8lambdaemiiow_nkh79yypl9r1hu3hwdfcIconCompatParcelizer instanceof r8lambdav4khHexYF7B8JZECOja6EPumcY4) {
                            r8lambdav4khhexyf7b8jzecoja6epumcy4 = (r8lambdav4khHexYF7B8JZECOja6EPumcY4) r8lambdaemiiow_nkh79yypl9r1hu3hwdfcIconCompatParcelizer;
                        } else {
                            r8lambdav4khhexyf7b8jzecoja6epumcy4 = null;
                        }
                    } else {
                        r8lambdaemiiow_nkh79yypl9r1hu3hwdfcIconCompatParcelizer = IconCompatParcelizer((r8lambdainxoiPJdmwnizvQTKwsIJ_9tRM) it2.next(), r8lambdav9lEwuigriKPLoepmU9DzDAsGns.ACCORDION_NESTED_ITEM);
                        if (r8lambdaemiiow_nkh79yypl9r1hu3hwdfcIconCompatParcelizer instanceof r8lambdav4khHexYF7B8JZECOja6EPumcY4) {
                            r8lambdav4khhexyf7b8jzecoja6epumcy4 = (r8lambdav4khHexYF7B8JZECOja6EPumcY4) r8lambdaemiiow_nkh79yypl9r1hu3hwdfcIconCompatParcelizer;
                        } else {
                            r8lambdav4khhexyf7b8jzecoja6epumcy4 = null;
                        }
                    }
                    if (r8lambdav4khhexyf7b8jzecoja6epumcy4 != null) {
                        arrayList.add(r8lambdav4khhexyf7b8jzecoja6epumcy4);
                        int i8 = read + 59;
                        write = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                    }
                }
                return new r8lambdag0m0JVUE1KB8aI8kjJMGJSHe1o8(str9, str10, str, removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList), false);
            }
            if (!(r8lambdajbxbm0a7ijgxayzffwwcxd8hq8k instanceof r8lambdahFzVXArQHjyg4Plg7rZXdYrHhg)) {
                if (r8lambdajbxbm0a7ijgxayzffwwcxd8hq8k instanceof r8lambdahS9AYWDlYhE8cYp1cEpZsQk_zUk) {
                    return new r8lambdasr5bVOa2Di9thfD9WpM7Q9rULYM(((r8lambdahS9AYWDlYhE8cYp1cEpZsQk_zUk) r8lambdajbxbm0a7ijgxayzffwwcxd8hq8k).text);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                int i10 = write + 65;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return null;
            }
            List list3 = ((r8lambdahFzVXArQHjyg4Plg7rZXdYrHhg) r8lambdajbxbm0a7ijgxayzffwwcxd8hq8k).items;
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                int i12 = write + 121;
                read = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    r8lambdainxoiPJdmwnizvQTKwsIJ_9tRM r8lambdainxoipjdmwnizvqtkwsij_9trm2 = (r8lambdainxoiPJdmwnizvQTKwsIJ_9tRM) it3.next();
                    String str12 = r8lambdainxoipjdmwnizvqtkwsij_9trm2.label;
                    Integer num2 = r8lambdainxoipjdmwnizvqtkwsij_9trm2.unreadCount;
                    obj.hashCode();
                    throw null;
                }
                r8lambdainxoiPJdmwnizvQTKwsIJ_9tRM r8lambdainxoipjdmwnizvqtkwsij_9trm3 = (r8lambdainxoiPJdmwnizvQTKwsIJ_9tRM) it3.next();
                String str13 = r8lambdainxoipjdmwnizvqtkwsij_9trm3.label;
                Integer num3 = r8lambdainxoipjdmwnizvqtkwsij_9trm3.unreadCount;
                if (num3 == null || num3.intValue() == 0) {
                    strValueOf = null;
                } else if (num3.intValue() > 99) {
                    int i13 = read + 91;
                    write = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    strValueOf = "+99";
                } else {
                    strValueOf = String.valueOf(num3.intValue());
                }
                String str14 = r8lambdainxoipjdmwnizvqtkwsij_9trm3.logo;
                String str15 = r8lambdainxoipjdmwnizvqtkwsij_9trm3.analytics.screenName;
                String str16 = r8lambdainxoipjdmwnizvqtkwsij_9trm3.link;
                String str17 = r8lambdainxoipjdmwnizvqtkwsij_9trm3.label;
                brazeCompanionExternalSyntheticLambda21.getClass();
                arrayList2.add(new r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs(str13, strValueOf, str14, str15, BrazeCompanionExternalSyntheticLambda21.IconCompatParcelizer(str16, str17, str15)));
            }
            return new r8lambdas7hGQZUVhdtJa9loZ8w1Xl2jDOA(arrayList2);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0077  */
        public WebResourceResponse RemoteActionCompatParcelizer(r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60) throws IOException {
            int i = 2 % 2;
            r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 = (r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0) ((Lazy) this.serializer).write();
            r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0.getClass();
            _get_messageWebView_lambda1 _get_messagewebview_lambda1Execute = FirebasePerfOkHttpClient.execute(new clipCanvasToPath(r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0, r8lambday113fdftsr5e4pzj6xssxltpl60, false));
            subscribeToNoMatchingTriggerForEvent subscribetonomatchingtriggerforevent = (subscribeToNoMatchingTriggerForEvent) ((setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release) this.RemoteActionCompatParcelizer).write;
            _get_messagewebview_lambda1Execute.getClass();
            if (!(!_get_messagewebview_lambda1Execute.isSuccessful)) {
                if (!(!subscribetonomatchingtriggerforevent.write())) {
                    int i2 = write + 125;
                    read = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        subscribetonomatchingtriggerforevent.IconCompatParcelizer.logEvent("web_auth_request_success", null);
                        throw null;
                    }
                    subscribetonomatchingtriggerforevent.IconCompatParcelizer.logEvent("web_auth_request_success", null);
                    int i3 = write + 69;
                    read = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                }
            } else if (_get_messagewebview_lambda1Execute.code == 401) {
                int i5 = read + 109;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 64 / 0;
                    if (subscribetonomatchingtriggerforevent.write()) {
                        subscribetonomatchingtriggerforevent.IconCompatParcelizer.logEvent("web_auth_request_logout", null);
                    }
                } else if (subscribetonomatchingtriggerforevent.write()) {
                    subscribetonomatchingtriggerforevent.IconCompatParcelizer.logEvent("web_auth_request_logout", null);
                }
            } else if (subscribetonomatchingtriggerforevent.write()) {
                subscribetonomatchingtriggerforevent.IconCompatParcelizer.logEvent("web_auth_request_failure", null);
            }
            String strName = ensureSubscribedToInAppMessageEvents.write.name();
            int i7 = _get_messagewebview_lambda1Execute.code;
            Map mapSerializer = onMove.serializer(_get_messagewebview_lambda1Execute.headers);
            _get_messageWebView_lambda3 _get_messagewebview_lambda3 = _get_messagewebview_lambda1Execute.body;
            return new WebResourceResponse("application/json,text/plain,*/*", strName, i7, String.valueOf(i7), mapSerializer, _get_messagewebview_lambda3 != null ? _get_messagewebview_lambda3.read().MediaMetadataCompat() : null);
        }

        public Builder() {
        }
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return read(null, true);
    }

    public FormBody(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.write = setWebViewContent.read(arrayList);
        this.IconCompatParcelizer = setWebViewContent.read(arrayList2);
    }

    static {
        getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
        read = SQLite.write("application/x-www-form-urlencoded");
    }

    public final long read(RegistryNoImageHeaderParserException registryNoImageHeaderParserException, boolean z) throws EOFException {
        RegistryMissingComponentException registryMissingComponentExceptionMediaSessionCompatQueueItem;
        if (z) {
            registryMissingComponentExceptionMediaSessionCompatQueueItem = new RegistryMissingComponentException();
        } else {
            registryNoImageHeaderParserException.getClass();
            registryMissingComponentExceptionMediaSessionCompatQueueItem = registryNoImageHeaderParserException.MediaSessionCompatQueueItem();
        }
        List list = this.write;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                registryMissingComponentExceptionMediaSessionCompatQueueItem.read(38);
            }
            registryMissingComponentExceptionMediaSessionCompatQueueItem.IconCompatParcelizer((String) list.get(i));
            registryMissingComponentExceptionMediaSessionCompatQueueItem.read(61);
            registryMissingComponentExceptionMediaSessionCompatQueueItem.IconCompatParcelizer((String) this.IconCompatParcelizer.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = registryMissingComponentExceptionMediaSessionCompatQueueItem.size;
        registryMissingComponentExceptionMediaSessionCompatQueueItem.serializer();
        return j;
    }
}
