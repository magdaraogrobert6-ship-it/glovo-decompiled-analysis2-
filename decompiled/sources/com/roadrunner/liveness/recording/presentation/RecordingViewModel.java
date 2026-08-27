package com.roadrunner.liveness.recording.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import coil3.ExtrasKt;
import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.domain.usecase.SuspendingWorkUseCase$$ExternalSyntheticLambda0;
import com.roadrunner.liveness.api.recording.CameraImage;
import com.roadrunner.liveness.recording.data.ChallengesRepository;
import com.roadrunner.liveness.recording.domain.LogUnexpectedLivenessError;
import com.roadrunner.liveness.recording.domain.livenessimage.ImageCaptureUseCaseImpl;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.BrazeCompanionExternalSyntheticLambda21;
import o.BrazeExternalSyntheticLambda28;
import o.RoomDatabaseExternalSyntheticLambda2;
import o.RoomDatabaseperformClear11;
import o.RoomOpenHelperDelegate;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.fromCongestionValuenavigation_release;
import o.getChangingConfigurations;
import o.getLocalMatrix;
import o.getPathName;
import o.getQueryContext;
import o.getRootAlpha;
import o.getStrokeColor;
import o.getTranslateX;
import o.getTranslateY;
import o.isItemDismissable;
import o.onAnimationStart;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setBackgroundColor;
import o.setColorScheme;
import o.setDistanceToTriggerSync;
import o.setLegacyRequestDisallowInterceptTouchEventEnabled;
import o.setOnChildScrollUpCallback;
import o.setOnRefreshListener;
import o.setProgressBackgroundColor;
import o.setProgressBackgroundColorSchemeResource;
import o.setRefreshingWithoutSwipeGesture;
import o.setSize;
import o.setStrokeColor;
import o.setTranslateY;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class RecordingViewModel extends ViewModel {
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 0;
    private static int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 1;
    public final BrazeExternalSyntheticLambda28 ComponentActivity;
    public final getQueryContext IconCompatParcelizer;
    public final OtpLogger MediaBrowserCompatMediaItem;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaDescriptionCompat;
    public final LogUnexpectedLivenessError MediaMetadataCompat;
    public final setDistanceToTriggerSync MediaSessionCompatQueueItem;
    public final LogUnexpectedLivenessError MediaSessionCompatResultReceiverWrapper;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaSessionCompatToken;
    public final MutableStateFlow ParcelableVolumeInfo;
    public final BrazeExternalSyntheticLambda28 PlaybackStateCompat;
    public final BrazeExternalSyntheticLambda28 PlaybackStateCompatCustomAction;
    public final ImageCaptureUseCaseImpl RatingCompat;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU RemoteActionCompatParcelizer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU ResultReceiver;
    public final BrazeCompanionExternalSyntheticLambda21 r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final StateFlow r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final setBackgroundColor read;
    public final onAnimationStart serializer;
    public final MutableStateFlow write;

    public RecordingViewModel(onAnimationStart onanimationstart, ImageCaptureUseCaseImpl imageCaptureUseCaseImpl, setBackgroundColor setbackgroundcolor, setDistanceToTriggerSync setdistancetotriggersync, LogUnexpectedLivenessError logUnexpectedLivenessError, BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28, BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda29, BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21, BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda210, LogUnexpectedLivenessError logUnexpectedLivenessError2, OtpLogger otpLogger, getQueryContext getquerycontext) {
        onanimationstart.getClass();
        imageCaptureUseCaseImpl.getClass();
        setbackgroundcolor.getClass();
        setdistancetotriggersync.getClass();
        logUnexpectedLivenessError.getClass();
        brazeExternalSyntheticLambda28.getClass();
        brazeExternalSyntheticLambda29.getClass();
        brazeCompanionExternalSyntheticLambda21.getClass();
        brazeExternalSyntheticLambda210.getClass();
        logUnexpectedLivenessError2.getClass();
        otpLogger.getClass();
        getquerycontext.getClass();
        this.serializer = onanimationstart;
        this.RatingCompat = imageCaptureUseCaseImpl;
        this.read = setbackgroundcolor;
        this.MediaSessionCompatQueueItem = setdistancetotriggersync;
        this.MediaMetadataCompat = logUnexpectedLivenessError;
        this.PlaybackStateCompat = brazeExternalSyntheticLambda28;
        this.ComponentActivity = brazeExternalSyntheticLambda29;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = brazeCompanionExternalSyntheticLambda21;
        this.PlaybackStateCompatCustomAction = brazeExternalSyntheticLambda210;
        this.MediaSessionCompatResultReceiverWrapper = logUnexpectedLivenessError2;
        this.MediaBrowserCompatMediaItem = otpLogger;
        this.IconCompatParcelizer = getquerycontext;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new setRefreshingWithoutSwipeGesture(null, 255));
        this.write = mutableStateFlow;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = mutableStateFlow;
        this.ParcelableVolumeInfo = StateFlowKt.read(fromCongestionValuenavigation_release.read);
        otpLogger.IconCompatParcelizer.logEvent("liveness_started", null);
    }

    public final Object failLiveness(RoomDatabaseperformClear11 roomDatabaseperformClear11, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        Timber.RemoteActionCompatParcelizer.write(new FailedLivenessException("Failed liveness with reason: " + roomDatabaseperformClear11, null));
        Object objTakeImage = takeImage(shortNewsContentCardView, new SuspendingWorkUseCase$$ExternalSyntheticLambda0(this, 25, roomDatabaseperformClear11));
        if (objTakeImage == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 7;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return objTakeImage;
            }
            throw null;
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 9;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return createfromparcel;
    }

    public final void read(RoomDatabaseperformClear11 roomDatabaseperformClear11, RoomDatabaseExternalSyntheticLambda2 roomDatabaseExternalSyntheticLambda2) {
        int i = 2 % 2;
        this.ParcelableVolumeInfo.IconCompatParcelizer(getLocalMatrix.write);
        RoomOpenHelperDelegate roomOpenHelperDelegate = this.read.serializer.write;
        OtpLogger otpLogger = this.MediaBrowserCompatMediaItem;
        otpLogger.getClass();
        roomDatabaseExternalSyntheticLambda2.getClass();
        roomDatabaseperformClear11.getClass();
        LinkedHashMap linkedHashMapIconCompatParcelizer = onMove.IconCompatParcelizer(new onViewAttachedToWindowlambda0("invocation_site", roomDatabaseExternalSyntheticLambda2.getValue()), new onViewAttachedToWindowlambda0("reason", roomDatabaseperformClear11.getValue()));
        if (roomOpenHelperDelegate != null) {
            int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 15;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                linkedHashMapIconCompatParcelizer.put("expected_gesture", roomOpenHelperDelegate.getValue());
                throw null;
            }
            linkedHashMapIconCompatParcelizer.put("expected_gesture", roomOpenHelperDelegate.getValue());
        }
        otpLogger.IconCompatParcelizer.logEvent("liveness_failed", linkedHashMapIconCompatParcelizer);
        this.IconCompatParcelizer.serializer(new getChangingConfigurations(roomDatabaseperformClear11, roomDatabaseExternalSyntheticLambda2));
        int i3 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 115;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public final void RemoteActionCompatParcelizer(setStrokeColor setstrokecolor) {
        int i = 2 % 2;
        int i2 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 105;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ChallengesRepository challengesRepository = this.read.serializer;
        RoomOpenHelperDelegate roomOpenHelperDelegate = challengesRepository.write;
        setColorScheme setcolorscheme = roomOpenHelperDelegate != null ? new setColorScheme(roomOpenHelperDelegate, challengesRepository.IconCompatParcelizer.get(), challengesRepository.serializer.size()) : null;
        LogUnexpectedLivenessError logUnexpectedLivenessError = this.MediaSessionCompatResultReceiverWrapper;
        if (setcolorscheme == null) {
            logUnexpectedLivenessError.RemoteActionCompatParcelizer("Active challenge is null during expected state: " + setstrokecolor);
            int i4 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 75;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        getTranslateY gettranslatey = new getTranslateY(setcolorscheme);
        MutableStateFlow mutableStateFlow = this.ParcelableVolumeInfo;
        if (mutableStateFlow.RemoteActionCompatParcelizer(setstrokecolor, gettranslatey)) {
            return;
        }
        logUnexpectedLivenessError.RemoteActionCompatParcelizer("State was not changed because expected state was incorrect. Expected state: " + setstrokecolor + ", actual state: " + mutableStateFlow.read());
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object takeImage(ShortNewsContentCardView shortNewsContentCardView, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        setProgressBackgroundColorSchemeResource setprogressbackgroundcolorschemeresource;
        Object objM4985captureImageIoAF18A;
        int i = 2 % 2;
        int i2 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 51;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = shortNewsContentCardView instanceof setProgressBackgroundColorSchemeResource;
            obj.hashCode();
            throw null;
        }
        if (!(!(shortNewsContentCardView instanceof setProgressBackgroundColorSchemeResource))) {
            setprogressbackgroundcolorschemeresource = (setProgressBackgroundColorSchemeResource) shortNewsContentCardView;
            int i3 = setprogressbackgroundcolorschemeresource.IconCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                setprogressbackgroundcolorschemeresource.IconCompatParcelizer = i3 - Integer.MIN_VALUE;
            } else {
                setprogressbackgroundcolorschemeresource = new setProgressBackgroundColorSchemeResource(this, shortNewsContentCardView);
            }
        } else {
            setprogressbackgroundcolorschemeresource = new setProgressBackgroundColorSchemeResource(this, shortNewsContentCardView);
        }
        Object obj2 = setprogressbackgroundcolorschemeresource.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = setprogressbackgroundcolorschemeresource.IconCompatParcelizer;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            setprogressbackgroundcolorschemeresource.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            setprogressbackgroundcolorschemeresource.IconCompatParcelizer = 1;
            objM4985captureImageIoAF18A = this.RatingCompat.m4985captureImageIoAF18A(setprogressbackgroundcolorschemeresource);
            if (objM4985captureImageIoAF18A == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = setprogressbackgroundcolorschemeresource.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            objM4985captureImageIoAF18A = ((onItemDismiss) obj2).IconCompatParcelizer;
            int i5 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 19;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4985captureImageIoAF18A);
        if (thSerializer != null) {
            String message = thSerializer.getMessage();
            if (message == null) {
                int i7 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 23;
                r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                message = "Failed to capture image";
            }
            this.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(message);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.FALSE);
        }
        if (!(objM4985captureImageIoAF18A instanceof isItemDismissable)) {
            int i9 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 39;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.TRUE);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:19:0x0052 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00be  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0103  */
    /* JADX WARN: Code duplicated, block: B:56:0x010e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:61:0x0123 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x0124 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x0129  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0022 A[PHI: r3
  0x0022: PHI (r3v19 kotlinx.coroutines.flow.MutableStateFlow) = (r3v4 kotlinx.coroutines.flow.MutableStateFlow), (r3v20 kotlinx.coroutines.flow.MutableStateFlow) binds: [B:8:0x0020, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x0129, please report this as an issue */
    public static final Object access$showWrongMovementMade(RecordingViewModel recordingViewModel, RoomOpenHelperDelegate roomOpenHelperDelegate, ShortNewsContentCardView shortNewsContentCardView) {
        MutableStateFlow mutableStateFlow;
        setSize setsize;
        Object obj;
        Object obj2;
        int i;
        createFromParcel createfromparcel;
        setStrokeColor setstrokecolor;
        MutableStateFlow mutableStateFlow2;
        Object obj3;
        setRefreshingWithoutSwipeGesture setrefreshingwithoutswipegesture;
        int i2;
        setLegacyRequestDisallowInterceptTouchEventEnabled setlegacyrequestdisallowintercepttoucheventenabled;
        int i3;
        int i4;
        int iIncrementAndGet;
        int iWrite;
        int i5;
        RoomDatabaseperformClear11 roomDatabaseperformClear11;
        RoomDatabaseperformClear11 roomDatabaseperformClear12;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 9;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            mutableStateFlow = recordingViewModel.ParcelableVolumeInfo;
            int i10 = 0 / 0;
            if (shortNewsContentCardView instanceof setSize) {
                setsize = (setSize) shortNewsContentCardView;
                i7 = setsize.write;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    setsize.write = i7 - Integer.MIN_VALUE;
                }
            }
            obj = setsize.read;
            obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = setsize.write;
            createfromparcel = createFromParcel.INSTANCE;
            setstrokecolor = getStrokeColor.write;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (((setStrokeColor) mutableStateFlow.read()) instanceof getTranslateY) {
                    mutableStateFlow.IconCompatParcelizer(setstrokecolor);
                    mutableStateFlow2 = recordingViewModel.write;
                    do {
                        obj3 = mutableStateFlow2.read();
                        setrefreshingwithoutswipegesture = (setRefreshingWithoutSwipeGesture) obj3;
                        recordingViewModel.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                        setrefreshingwithoutswipegesture.getClass();
                        roomOpenHelperDelegate.getClass();
                        i2 = setTranslateY.write[roomOpenHelperDelegate.ordinal()];
                        if (i2 != 1) {
                            i3 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                            int i11 = i3 + 59;
                            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i11 % Fields.SpotShadowColor;
                            int i12 = i11 % 2;
                            if (i2 != 2) {
                                i4 = i3 + 19;
                                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % Fields.SpotShadowColor;
                                if (i4 % 2 != 0) {
                                    if (i2 != 5) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                        return null;
                                    }
                                    setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.FailSmile;
                                } else {
                                    if (i2 != 3) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                        return null;
                                    }
                                    setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.FailSmile;
                                }
                            } else {
                                setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.FailRightMovement;
                            }
                        } else {
                            setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.FailLeftMovement;
                        }
                    } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj3, setRefreshingWithoutSwipeGesture.serializer(setrefreshingwithoutswipegesture, setlegacyrequestdisallowintercepttoucheventenabled, null, null, null, true, 188)));
                    setsize.write = 1;
                    if (DelayKt.delay(ConstantKt.DEFAULT_REQUEST_TIMEOUT, setsize) != obj2) {
                    }
                    return obj2;
                }
                recordingViewModel.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer("Detecting wrong movement is wrong state " + mutableStateFlow.read());
                int i13 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 99;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                return createfromparcel;
            }
            int i15 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            i6 = i15 + 103;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0 ? i == 1 : i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                int i16 = i15 + 105;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                if (i == 2) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            setBackgroundColor setbackgroundcolor = recordingViewModel.read;
            iIncrementAndGet = setbackgroundcolor.serializer.read.incrementAndGet();
            iWrite = (int) ((FirebaseRemoteConfigImpl) setbackgroundcolor.write).IconCompatParcelizer.write("liveness_allowed_wrong_gesture_count");
            if (iWrite == 0) {
                int i18 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 41;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
            } else if (iIncrementAndGet >= iWrite) {
                i5 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 61;
                r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    roomDatabaseperformClear12 = RoomDatabaseperformClear11.MAX_WRONG_MOVEMENT_COUNT;
                    setsize.write = 5;
                    if (recordingViewModel.failLiveness(roomDatabaseperformClear12, setsize) == obj2) {
                        return obj2;
                    }
                    return createfromparcel;
                }
                roomDatabaseperformClear11 = RoomDatabaseperformClear11.MAX_WRONG_MOVEMENT_COUNT;
                setsize.write = 2;
                if (recordingViewModel.failLiveness(roomDatabaseperformClear11, setsize) == obj2) {
                    return obj2;
                }
                return createfromparcel;
            }
            recordingViewModel.RemoteActionCompatParcelizer(setstrokecolor);
            return createfromparcel;
        }
        mutableStateFlow = recordingViewModel.ParcelableVolumeInfo;
        if (shortNewsContentCardView instanceof setSize) {
            setsize = (setSize) shortNewsContentCardView;
            i7 = setsize.write;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                setsize.write = i7 - Integer.MIN_VALUE;
            }
        }
        obj = setsize.read;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setsize.write;
        createfromparcel = createFromParcel.INSTANCE;
        setstrokecolor = getStrokeColor.write;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (((setStrokeColor) mutableStateFlow.read()) instanceof getTranslateY) {
                mutableStateFlow.IconCompatParcelizer(setstrokecolor);
                mutableStateFlow2 = recordingViewModel.write;
                do {
                    obj3 = mutableStateFlow2.read();
                    setrefreshingwithoutswipegesture = (setRefreshingWithoutSwipeGesture) obj3;
                    recordingViewModel.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                    setrefreshingwithoutswipegesture.getClass();
                    roomOpenHelperDelegate.getClass();
                    i2 = setTranslateY.write[roomOpenHelperDelegate.ordinal()];
                    if (i2 != 1) {
                        i3 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                        int i110 = i3 + 59;
                        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i110 % Fields.SpotShadowColor;
                        int i111 = i110 % 2;
                        if (i2 != 2) {
                            i4 = i3 + 19;
                            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % Fields.SpotShadowColor;
                            if (i4 % 2 != 0) {
                                if (i2 != 5) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                    return null;
                                }
                                setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.FailSmile;
                            } else {
                                if (i2 != 3) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                    return null;
                                }
                                setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.FailSmile;
                            }
                        } else {
                            setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.FailRightMovement;
                        }
                    } else {
                        setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.FailLeftMovement;
                    }
                } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj3, setRefreshingWithoutSwipeGesture.serializer(setrefreshingwithoutswipegesture, setlegacyrequestdisallowintercepttoucheventenabled, null, null, null, true, 188)));
                setsize.write = 1;
                if (DelayKt.delay(ConstantKt.DEFAULT_REQUEST_TIMEOUT, setsize) != obj2) {
                }
                return obj2;
            }
            recordingViewModel.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer("Detecting wrong movement is wrong state " + mutableStateFlow.read());
            int i112 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 99;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i112 % Fields.SpotShadowColor;
            int i113 = i112 % 2;
            return createfromparcel;
        }
        int i114 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        i6 = i114 + 103;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        setBackgroundColor setbackgroundcolor2 = recordingViewModel.read;
        iIncrementAndGet = setbackgroundcolor2.serializer.read.incrementAndGet();
        iWrite = (int) ((FirebaseRemoteConfigImpl) setbackgroundcolor2.write).IconCompatParcelizer.write("liveness_allowed_wrong_gesture_count");
        if (iWrite == 0) {
            int i115 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 41;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i115 % Fields.SpotShadowColor;
            int i116 = i115 % 2;
        } else if (iIncrementAndGet >= iWrite) {
            i5 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 61;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                roomDatabaseperformClear12 = RoomDatabaseperformClear11.MAX_WRONG_MOVEMENT_COUNT;
                setsize.write = 5;
                if (recordingViewModel.failLiveness(roomDatabaseperformClear12, setsize) == obj2) {
                    return obj2;
                }
                return createfromparcel;
            }
            roomDatabaseperformClear11 = RoomDatabaseperformClear11.MAX_WRONG_MOVEMENT_COUNT;
            setsize.write = 2;
            if (recordingViewModel.failLiveness(roomDatabaseperformClear11, setsize) == obj2) {
                return obj2;
            }
            return createfromparcel;
        }
        recordingViewModel.RemoteActionCompatParcelizer(setstrokecolor);
        return createfromparcel;
        setsize = new setSize(recordingViewModel, shortNewsContentCardView);
        obj = setsize.read;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setsize.write;
        createfromparcel = createFromParcel.INSTANCE;
        setstrokecolor = getStrokeColor.write;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (((setStrokeColor) mutableStateFlow.read()) instanceof getTranslateY) {
                mutableStateFlow.IconCompatParcelizer(setstrokecolor);
                mutableStateFlow2 = recordingViewModel.write;
                do {
                    obj3 = mutableStateFlow2.read();
                    setrefreshingwithoutswipegesture = (setRefreshingWithoutSwipeGesture) obj3;
                    recordingViewModel.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                    setrefreshingwithoutswipegesture.getClass();
                    roomOpenHelperDelegate.getClass();
                    i2 = setTranslateY.write[roomOpenHelperDelegate.ordinal()];
                    if (i2 != 1) {
                        i3 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                        int i117 = i3 + 59;
                        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i117 % Fields.SpotShadowColor;
                        int i118 = i117 % 2;
                        if (i2 != 2) {
                            i4 = i3 + 19;
                            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % Fields.SpotShadowColor;
                            if (i4 % 2 != 0) {
                                if (i2 != 5) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                    return null;
                                }
                                setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.FailSmile;
                            } else {
                                if (i2 != 3) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                    return null;
                                }
                                setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.FailSmile;
                            }
                        } else {
                            setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.FailRightMovement;
                        }
                    } else {
                        setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.FailLeftMovement;
                    }
                } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj3, setRefreshingWithoutSwipeGesture.serializer(setrefreshingwithoutswipegesture, setlegacyrequestdisallowintercepttoucheventenabled, null, null, null, true, 188)));
                setsize.write = 1;
                if (DelayKt.delay(ConstantKt.DEFAULT_REQUEST_TIMEOUT, setsize) != obj2) {
                }
                return obj2;
            }
            recordingViewModel.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer("Detecting wrong movement is wrong state " + mutableStateFlow.read());
            int i119 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 99;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i119 % Fields.SpotShadowColor;
            int i1110 = i119 % 2;
            return createfromparcel;
        }
        int i1111 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        i6 = i1111 + 103;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        setBackgroundColor setbackgroundcolor3 = recordingViewModel.read;
        iIncrementAndGet = setbackgroundcolor3.serializer.read.incrementAndGet();
        iWrite = (int) ((FirebaseRemoteConfigImpl) setbackgroundcolor3.write).IconCompatParcelizer.write("liveness_allowed_wrong_gesture_count");
        if (iWrite == 0) {
            int i1112 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 41;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i1112 % Fields.SpotShadowColor;
            int i1113 = i1112 % 2;
        } else if (iIncrementAndGet >= iWrite) {
            i5 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 61;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                roomDatabaseperformClear12 = RoomDatabaseperformClear11.MAX_WRONG_MOVEMENT_COUNT;
                setsize.write = 5;
                if (recordingViewModel.failLiveness(roomDatabaseperformClear12, setsize) == obj2) {
                    return obj2;
                }
                return createfromparcel;
            }
            roomDatabaseperformClear11 = RoomDatabaseperformClear11.MAX_WRONG_MOVEMENT_COUNT;
            setsize.write = 2;
            if (recordingViewModel.failLiveness(roomDatabaseperformClear11, setsize) == obj2) {
                return obj2;
            }
            return createfromparcel;
        }
        recordingViewModel.RemoteActionCompatParcelizer(setstrokecolor);
        return createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    public static final Object access$showCorrectMovementMade(RecordingViewModel recordingViewModel, ShortNewsContentCardView shortNewsContentCardView) {
        setOnChildScrollUpCallback setonchildscrollupcallback;
        Object obj;
        setRefreshingWithoutSwipeGesture setrefreshingwithoutswipegesture;
        BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28;
        setLegacyRequestDisallowInterceptTouchEventEnabled setlegacyrequestdisallowintercepttoucheventenabled;
        setOnRefreshListener setonrefreshlistener;
        int i = 2 % 2;
        LogUnexpectedLivenessError logUnexpectedLivenessError = recordingViewModel.MediaSessionCompatResultReceiverWrapper;
        MutableStateFlow mutableStateFlow = recordingViewModel.ParcelableVolumeInfo;
        Object obj2 = null;
        if (shortNewsContentCardView instanceof setOnChildScrollUpCallback) {
            int i2 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 107;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = ((setOnChildScrollUpCallback) shortNewsContentCardView).IconCompatParcelizer;
                obj2.hashCode();
                throw null;
            }
            setonchildscrollupcallback = (setOnChildScrollUpCallback) shortNewsContentCardView;
            int i4 = setonchildscrollupcallback.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                setonchildscrollupcallback.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                setonchildscrollupcallback = new setOnChildScrollUpCallback(recordingViewModel, shortNewsContentCardView);
            }
        } else {
            setonchildscrollupcallback = new setOnChildScrollUpCallback(recordingViewModel, shortNewsContentCardView);
        }
        Object obj3 = setonchildscrollupcallback.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = setonchildscrollupcallback.IconCompatParcelizer;
        getStrokeColor getstrokecolor = getStrokeColor.write;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj3);
            if (((setStrokeColor) mutableStateFlow.read()) instanceof getTranslateY) {
                mutableStateFlow.IconCompatParcelizer(getstrokecolor);
                MutableStateFlow mutableStateFlow2 = recordingViewModel.write;
                do {
                    obj = mutableStateFlow2.read();
                    setrefreshingwithoutswipegesture = (setRefreshingWithoutSwipeGesture) obj;
                    brazeExternalSyntheticLambda28 = recordingViewModel.PlaybackStateCompatCustomAction;
                    brazeExternalSyntheticLambda28.getClass();
                    setrefreshingwithoutswipegesture.getClass();
                    int i6 = getRootAlpha.IconCompatParcelizer[setrefreshingwithoutswipegesture.serializer.ordinal()];
                    if (i6 == 1) {
                        setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.SuccessRightMovement;
                    } else if (i6 != 2) {
                        int i7 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 121;
                        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i7 % Fields.SpotShadowColor;
                        if (i7 % 2 == 0 ? i6 == 3 : i6 == 5) {
                            setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.SuccessSmile;
                        } else {
                            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Wrong Indicator Arc State", Timber.RemoteActionCompatParcelizer);
                            setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.SuccessSmile;
                            int i8 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 115;
                            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i8 % Fields.SpotShadowColor;
                            int i9 = i8 % 2;
                        }
                    } else {
                        setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.SuccessLeftMovement;
                    }
                    setOnRefreshListener setonrefreshlistener2 = setrefreshingwithoutswipegesture.RatingCompat;
                    int i10 = setonrefreshlistener2 != null ? setonrefreshlistener2.RemoteActionCompatParcelizer : 0;
                    if (setonrefreshlistener2 != null) {
                        setonrefreshlistener = new setOnRefreshListener(setonrefreshlistener2.serializer, i10 + 1);
                    } else {
                        int i11 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 29;
                        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        setonrefreshlistener = null;
                    }
                } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj, setRefreshingWithoutSwipeGesture.serializer(setrefreshingwithoutswipegesture, setlegacyrequestdisallowintercepttoucheventenabled, setonrefreshlistener, brazeExternalSyntheticLambda28.read.IconCompatParcelizer(R.string.liveness_movement_success), setProgressBackgroundColor.SUCCESS, false, Fields.SpotShadowColor)));
                setonchildscrollupcallback.IconCompatParcelizer = 1;
                if (DelayKt.delay(ConstantKt.DEFAULT_REQUEST_TIMEOUT, setonchildscrollupcallback) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                logUnexpectedLivenessError.RemoteActionCompatParcelizer("Detecting correct movement is wrong state " + mutableStateFlow.read());
            }
            return createFromParcel.INSTANCE;
        }
        int i13 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 11;
        int i14 = i13 % Fields.SpotShadowColor;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i14;
        int i15 = i13 % 2;
        if (i5 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i16 = i14 + 117;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i16 % Fields.SpotShadowColor;
        int i17 = i16 % 2;
        ExtrasKt.RemoteActionCompatParcelizer(obj3);
        setBackgroundColor setbackgroundcolor = recordingViewModel.read;
        ChallengesRepository challengesRepository = setbackgroundcolor.serializer;
        if (challengesRepository.IconCompatParcelizer.get() >= challengesRepository.serializer.size() - 1) {
            CameraImage cameraImageRemoteActionCompatParcelizer = recordingViewModel.MediaSessionCompatQueueItem.IconCompatParcelizer.RemoteActionCompatParcelizer();
            if (cameraImageRemoteActionCompatParcelizer == null || !cameraImageRemoteActionCompatParcelizer.IconCompatParcelizer) {
                logUnexpectedLivenessError.RemoteActionCompatParcelizer("Liveness is finished but there is no image");
                recordingViewModel.read(RoomDatabaseperformClear11.CAMERA_ERROR, RoomDatabaseExternalSyntheticLambda2.LIVENESS_DETECTION);
            } else {
                mutableStateFlow.IconCompatParcelizer(getTranslateX.IconCompatParcelizer);
                recordingViewModel.IconCompatParcelizer.serializer(getPathName.IconCompatParcelizer);
            }
        } else {
            ChallengesRepository challengesRepository2 = setbackgroundcolor.serializer;
            challengesRepository2.IconCompatParcelizer.incrementAndGet();
            challengesRepository2.write = (RoomOpenHelperDelegate) onContentCardDismissed.read(challengesRepository2.IconCompatParcelizer.get(), challengesRepository2.serializer);
            recordingViewModel.RemoteActionCompatParcelizer(getstrokecolor);
        }
        return createFromParcel.INSTANCE;
    }
}
