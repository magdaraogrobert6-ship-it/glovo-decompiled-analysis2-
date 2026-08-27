package com.roadrunner.liveness.recording.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.BrazeExternalSyntheticLambda28;
import o.DrawableTransformation;
import o.RoomDatabaseKt__RoomDatabase_androidKtwithTransactionContexttransactionBlock1;
import o.RoomDatabasecloseBarrier1;
import o.RoomDatabasecreateConnectionManager2;
import o.RoomDatabasecreateConnectionManager3;
import o.RoomDatabaseperformClear1;
import o.RoomDatabaseperformClear11;
import o.RoomDatabaseperformClear111;
import o.ShortNewsContentCardView;
import o.createAllTables;
import o.createFromParcel;
import o.dropAllTables;
import o.fromCongestionValuenavigation_release;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getGroupName;
import o.getLocalMatrix;
import o.getStrokeColor;
import o.getTranslateX;
import o.getTranslateY;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setColorScheme;
import o.setFillColor;
import o.setLegacyRequestDisallowInterceptTouchEventEnabled;
import o.setOnRefreshListener;
import o.setProgressBackgroundColor;
import o.setRefreshingWithoutSwipeGesture;
import o.setRootAlpha;
import o.setStrokeColor;
import o.setTransactionSuccessful;
import o.toBitmapConfig1JJdX4A;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class RecordingViewModel$startTimer$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ RecordingViewModel read;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecordingViewModel$startTimer$1(RecordingViewModel recordingViewModel, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.read = recordingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = serializer + 19;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.write;
        if (i5 == 0) {
            return new RecordingViewModel$startTimer$1(this.read, shortNewsContentCardView, 0);
        }
        int i6 = 1;
        if (i5 == 1) {
            return new RecordingViewModel$startTimer$1(this.read, shortNewsContentCardView, i6);
        }
        if (i5 != 2) {
            return new RecordingViewModel$startTimer$1(this.read, shortNewsContentCardView, 3);
        }
        RecordingViewModel$startTimer$1 recordingViewModel$startTimer$1 = new RecordingViewModel$startTimer$1(this.read, shortNewsContentCardView, i);
        int i7 = IconCompatParcelizer + 47;
        serializer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return recordingViewModel$startTimer$1;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            if (i4 != 1) {
                return i4 != 2 ? ((RecordingViewModel$startTimer$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((RecordingViewModel$startTimer$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
            return ((RecordingViewModel$startTimer$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((RecordingViewModel$startTimer$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = IconCompatParcelizer + 1;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        final RecordingViewModel recordingViewModel = this.read;
        CoroutineSingletons coroutineSingletons = null;
        final int i4 = 1;
        if (i3 == 0) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.RemoteActionCompatParcelizer;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                long jWrite = ((FirebaseRemoteConfigImpl) ((transferSessionPackageI) recordingViewModel.MediaMetadataCompat.write)).IconCompatParcelizer.write("face_detection_milliseconds_timer");
                this.RemoteActionCompatParcelizer = 1;
                if (DelayKt.delay(jWrite, this) != coroutineSingletons2) {
                }
                return coroutineSingletons2;
            }
            if (i5 != 1) {
                if (i5 == 2) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setFillColor setfillcolor = new setFillColor(recordingViewModel, i);
            this.RemoteActionCompatParcelizer = 2;
            if (recordingViewModel.takeImage(this, setfillcolor) != coroutineSingletons2) {
                return createfromparcel;
            }
            return coroutineSingletons2;
        }
        if (i3 == 1) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.RemoteActionCompatParcelizer;
            if (i6 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                MutableStateFlow mutableStateFlow = (MutableStateFlow) recordingViewModel.serializer.serializer.MediaDescriptionCompat;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.roadrunner.liveness.recording.presentation.RecordingViewModel$observeLivenessState$1$1
                    private static int serializer = 1;
                    private static int write;

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, ShortNewsContentCardView shortNewsContentCardView) {
                        setLegacyRequestDisallowInterceptTouchEventEnabled setlegacyrequestdisallowintercepttoucheventenabled;
                        String strIconCompatParcelizer;
                        String strIconCompatParcelizer2;
                        int i7;
                        String str;
                        String strIconCompatParcelizer3;
                        int i8;
                        Object objAccess$showWrongMovementMade;
                        int i9 = 2 % 2;
                        int i10 = i4;
                        fromCongestionValuenavigation_release fromcongestionvaluenavigation_release = fromCongestionValuenavigation_release.read;
                        RecordingViewModel recordingViewModel2 = recordingViewModel;
                        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                        int i11 = 3;
                        int i12 = 1;
                        ShortNewsContentCardView shortNewsContentCardView2 = null;
                        if (i10 != 0) {
                            RoomDatabasecloseBarrier1 roomDatabasecloseBarrier1 = (RoomDatabasecloseBarrier1) obj2;
                            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{roomDatabasecloseBarrier1, RoomDatabasecreateConnectionManager2.IconCompatParcelizer}, getCieXyz.write())).booleanValue())) {
                                objAccess$showWrongMovementMade = recordingViewModel2.failLiveness(RoomDatabaseperformClear11.MLKIT_ERROR, shortNewsContentCardView);
                                if (objAccess$showWrongMovementMade != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    return createfromparcel2;
                                }
                                int i13 = write + 13;
                                serializer = i13 % Fields.SpotShadowColor;
                                int i14 = i13 % 2;
                            } else {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{roomDatabasecloseBarrier1, RoomDatabasecreateConnectionManager3.write}, getCieXyz.write())).booleanValue()) {
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{roomDatabasecloseBarrier1, RoomDatabaseKt__RoomDatabase_androidKtwithTransactionContexttransactionBlock1.serializer}, getCieXyz.write())).booleanValue()) {
                                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{roomDatabasecloseBarrier1, createAllTables.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                                            recordingViewModel2.MediaBrowserCompatMediaItem.IconCompatParcelizer.logEvent("face_detected", null);
                                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{recordingViewModel2.ParcelableVolumeInfo.read(), fromcongestionvaluenavigation_release}, getCieXyz.write())).booleanValue()) {
                                                return createfromparcel2;
                                            }
                                            int i15 = serializer + 69;
                                            write = i15 % Fields.SpotShadowColor;
                                            int i16 = i15 % 2;
                                            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = recordingViewModel2.RemoteActionCompatParcelizer;
                                            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                                                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                                            }
                                            recordingViewModel2.RemoteActionCompatParcelizer = null;
                                            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = recordingViewModel2.ResultReceiver;
                                            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                                                int i17 = serializer + 123;
                                                write = i17 % Fields.SpotShadowColor;
                                                if (i17 % 2 != 0) {
                                                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
                                                    throw null;
                                                }
                                                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
                                            }
                                            recordingViewModel2.ResultReceiver = BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(recordingViewModel2), null, null, new RecordingViewModel$startTimer$1(recordingViewModel2, shortNewsContentCardView2, i11), 3);
                                            return createfromparcel2;
                                        }
                                        if (roomDatabasecloseBarrier1 instanceof RoomDatabaseperformClear111) {
                                            objAccess$showWrongMovementMade = RecordingViewModel.access$showCorrectMovementMade(recordingViewModel2, shortNewsContentCardView);
                                            if (objAccess$showWrongMovementMade != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                return createfromparcel2;
                                            }
                                            int i18 = serializer + 17;
                                            write = i18 % Fields.SpotShadowColor;
                                            if (i18 % 2 != 0) {
                                                int i19 = 3 / 3;
                                            }
                                        } else {
                                            if (!(roomDatabasecloseBarrier1 instanceof dropAllTables)) {
                                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{roomDatabasecloseBarrier1, RoomDatabaseperformClear1.serializer}, getCieXyz.write())).booleanValue()) {
                                                    return createfromparcel2;
                                                }
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                                return null;
                                            }
                                            objAccess$showWrongMovementMade = RecordingViewModel.access$showWrongMovementMade(recordingViewModel2, ((dropAllTables) roomDatabasecloseBarrier1).IconCompatParcelizer, shortNewsContentCardView);
                                            if (objAccess$showWrongMovementMade != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                return createfromparcel2;
                                            }
                                        }
                                    } else if (!(recordingViewModel2.ParcelableVolumeInfo.read() instanceof getTranslateY) || (objAccess$showWrongMovementMade = recordingViewModel2.failLiveness(RoomDatabaseperformClear11.NO_FACE, shortNewsContentCardView)) != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        return createfromparcel2;
                                    }
                                } else {
                                    if (!(recordingViewModel2.ParcelableVolumeInfo.read() instanceof getTranslateY)) {
                                        return createfromparcel2;
                                    }
                                    int i20 = serializer + 49;
                                    write = i20 % Fields.SpotShadowColor;
                                    if (i20 % 2 != 0) {
                                        recordingViewModel2.failLiveness(RoomDatabaseperformClear11.MULTIPLE_FACES, shortNewsContentCardView);
                                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        shortNewsContentCardView2.hashCode();
                                        throw null;
                                    }
                                    objAccess$showWrongMovementMade = recordingViewModel2.failLiveness(RoomDatabaseperformClear11.MULTIPLE_FACES, shortNewsContentCardView);
                                    if (objAccess$showWrongMovementMade != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        return createfromparcel2;
                                    }
                                }
                            }
                            return objAccess$showWrongMovementMade;
                        }
                        setStrokeColor setstrokecolor = (setStrokeColor) obj2;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setstrokecolor, fromcongestionvaluenavigation_release}, getCieXyz.write())).booleanValue()) {
                            recordingViewModel2.write.IconCompatParcelizer(new setRefreshingWithoutSwipeGesture(recordingViewModel2.PlaybackStateCompat.read.IconCompatParcelizer(R.string.liveness_face_detection_instructions), 119));
                            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3 = recordingViewModel2.RemoteActionCompatParcelizer;
                            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3 != null) {
                                int i21 = serializer + 115;
                                write = i21 % Fields.SpotShadowColor;
                                if (i21 % 2 != 0) {
                                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3.write((CancellationException) null);
                                    shortNewsContentCardView2.hashCode();
                                    throw null;
                                }
                                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3.write((CancellationException) null);
                            }
                            recordingViewModel2.RemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(recordingViewModel2), null, null, new RecordingViewModel$startTimer$1(recordingViewModel2, shortNewsContentCardView2, 0), 3);
                            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu4 = recordingViewModel2.MediaDescriptionCompat;
                            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu4 != null) {
                                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu4.write((CancellationException) null);
                            }
                            recordingViewModel2.MediaDescriptionCompat = BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(recordingViewModel2), null, null, new RecordingViewModel$startTimer$1(recordingViewModel2, shortNewsContentCardView2, i12), 3);
                            return createfromparcel2;
                        }
                        if (setstrokecolor instanceof getTranslateY) {
                            MutableStateFlow mutableStateFlow2 = recordingViewModel2.write;
                            BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28 = recordingViewModel2.ComponentActivity;
                            setColorScheme setcolorscheme = ((getTranslateY) setstrokecolor).write;
                            setTransactionSuccessful settransactionsuccessful = brazeExternalSyntheticLambda28.read;
                            int i22 = setRootAlpha.write[setcolorscheme.read.ordinal()];
                            if (i22 != 1) {
                                int i23 = write + 125;
                                serializer = i23 % Fields.SpotShadowColor;
                                int i24 = i23 % 2;
                                if (i22 == 2) {
                                    setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.InfoRightMovement;
                                    strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.liveness_movement_right);
                                    strIconCompatParcelizer2 = settransactionsuccessful.IconCompatParcelizer(R.string.liveness_head_movement_instructions);
                                    i7 = R.raw.head_right;
                                } else if (i22 == 3) {
                                    setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.InfoSmile;
                                    strIconCompatParcelizer3 = settransactionsuccessful.IconCompatParcelizer(R.string.liveness_movement_smile);
                                    i8 = R.raw.smile;
                                    str = "";
                                } else {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                }
                                mutableStateFlow2.IconCompatParcelizer(new setRefreshingWithoutSwipeGesture(setlegacyrequestdisallowintercepttoucheventenabled, Integer.valueOf(i8), new setOnRefreshListener(setcolorscheme.serializer, setcolorscheme.RemoteActionCompatParcelizer), str, strIconCompatParcelizer3, setProgressBackgroundColor.DETECTION, false, false));
                                return createfromparcel2;
                            }
                            setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.InfoLeftMovement;
                            strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.liveness_movement_left);
                            strIconCompatParcelizer2 = settransactionsuccessful.IconCompatParcelizer(R.string.liveness_head_movement_instructions);
                            i7 = R.raw.head_left;
                            int i25 = i7;
                            str = strIconCompatParcelizer2;
                            strIconCompatParcelizer3 = strIconCompatParcelizer;
                            i8 = i25;
                            mutableStateFlow2.IconCompatParcelizer(new setRefreshingWithoutSwipeGesture(setlegacyrequestdisallowintercepttoucheventenabled, Integer.valueOf(i8), new setOnRefreshListener(setcolorscheme.serializer, setcolorscheme.RemoteActionCompatParcelizer), str, strIconCompatParcelizer3, setProgressBackgroundColor.DETECTION, false, false));
                            return createfromparcel2;
                        }
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setstrokecolor, getStrokeColor.write}, getCieXyz.write())).booleanValue()) {
                            return createfromparcel2;
                        }
                        int i26 = serializer + 73;
                        write = i26 % Fields.SpotShadowColor;
                        if (i26 % 2 != 0) {
                            ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setstrokecolor, getGroupName.read}, getCieXyz.write())).booleanValue();
                            throw null;
                        }
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setstrokecolor, getGroupName.read}, getCieXyz.write())).booleanValue()) {
                            return createfromparcel2;
                        }
                        int i27 = write + 115;
                        serializer = i27 % Fields.SpotShadowColor;
                        if (i27 % 2 == 0) {
                            ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setstrokecolor, getTranslateX.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
                            throw null;
                        }
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setstrokecolor, getTranslateX.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                            return createfromparcel2;
                        }
                        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setstrokecolor, getLocalMatrix.write}, getCieXyz.write())).booleanValue())) {
                            return createfromparcel2;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        int i28 = serializer + 97;
                        write = i28 % Fields.SpotShadowColor;
                        int i29 = i28 % 2;
                        return null;
                    }
                };
                this.RemoteActionCompatParcelizer = 1;
                if (mutableStateFlow.collect(flowCollector, this) == coroutineSingletons3) {
                    int i7 = IconCompatParcelizer;
                    int i8 = i7 + 117;
                    serializer = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        coroutineSingletons.hashCode();
                        throw null;
                    }
                    int i9 = i7 + 89;
                    serializer = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        int i10 = 3 / 4;
                    }
                    return coroutineSingletons3;
                }
            } else {
                if (i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            DrawableTransformation.read();
            return null;
        }
        if (i3 != 2) {
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i11 = this.RemoteActionCompatParcelizer;
            if (i11 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (DelayKt.delay(ConstantKt.DEFAULT_REQUEST_TIMEOUT, this) != coroutineSingletons4) {
                }
                return coroutineSingletons4;
            }
            if (i11 != 1) {
                int i12 = IconCompatParcelizer + 59;
                serializer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0 ? i11 != 2 : i11 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            recordingViewModel.ParcelableVolumeInfo.IconCompatParcelizer(getGroupName.read);
            setFillColor setfillcolor2 = new setFillColor(recordingViewModel, i4);
            this.RemoteActionCompatParcelizer = 2;
            if (recordingViewModel.takeImage(this, setfillcolor2) != coroutineSingletons4) {
                return createfromparcel;
            }
            return coroutineSingletons4;
        }
        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = this.RemoteActionCompatParcelizer;
        final int i14 = 0;
        if (i13 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MutableStateFlow mutableStateFlow2 = recordingViewModel.ParcelableVolumeInfo;
            FlowCollector flowCollector2 = new FlowCollector() { // from class: com.roadrunner.liveness.recording.presentation.RecordingViewModel$observeLivenessState$1$1
                private static int serializer = 1;
                private static int write;

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, ShortNewsContentCardView shortNewsContentCardView) {
                    setLegacyRequestDisallowInterceptTouchEventEnabled setlegacyrequestdisallowintercepttoucheventenabled;
                    String strIconCompatParcelizer;
                    String strIconCompatParcelizer2;
                    int i15;
                    String str;
                    String strIconCompatParcelizer3;
                    int i16;
                    Object objAccess$showWrongMovementMade;
                    int i17 = 2 % 2;
                    int i18 = i14;
                    fromCongestionValuenavigation_release fromcongestionvaluenavigation_release = fromCongestionValuenavigation_release.read;
                    RecordingViewModel recordingViewModel2 = recordingViewModel;
                    createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                    int i19 = 3;
                    int i110 = 1;
                    ShortNewsContentCardView shortNewsContentCardView2 = null;
                    if (i18 != 0) {
                        RoomDatabasecloseBarrier1 roomDatabasecloseBarrier1 = (RoomDatabasecloseBarrier1) obj2;
                        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{roomDatabasecloseBarrier1, RoomDatabasecreateConnectionManager2.IconCompatParcelizer}, getCieXyz.write())).booleanValue())) {
                            objAccess$showWrongMovementMade = recordingViewModel2.failLiveness(RoomDatabaseperformClear11.MLKIT_ERROR, shortNewsContentCardView);
                            if (objAccess$showWrongMovementMade != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                return createfromparcel2;
                            }
                            int i111 = write + 13;
                            serializer = i111 % Fields.SpotShadowColor;
                            int i112 = i111 % 2;
                        } else {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{roomDatabasecloseBarrier1, RoomDatabasecreateConnectionManager3.write}, getCieXyz.write())).booleanValue()) {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{roomDatabasecloseBarrier1, RoomDatabaseKt__RoomDatabase_androidKtwithTransactionContexttransactionBlock1.serializer}, getCieXyz.write())).booleanValue()) {
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{roomDatabasecloseBarrier1, createAllTables.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                                        recordingViewModel2.MediaBrowserCompatMediaItem.IconCompatParcelizer.logEvent("face_detected", null);
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{recordingViewModel2.ParcelableVolumeInfo.read(), fromcongestionvaluenavigation_release}, getCieXyz.write())).booleanValue()) {
                                            return createfromparcel2;
                                        }
                                        int i113 = serializer + 69;
                                        write = i113 % Fields.SpotShadowColor;
                                        int i114 = i113 % 2;
                                        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = recordingViewModel2.RemoteActionCompatParcelizer;
                                        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                                            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                                        }
                                        recordingViewModel2.RemoteActionCompatParcelizer = null;
                                        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = recordingViewModel2.ResultReceiver;
                                        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                                            int i115 = serializer + 123;
                                            write = i115 % Fields.SpotShadowColor;
                                            if (i115 % 2 != 0) {
                                                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
                                                throw null;
                                            }
                                            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
                                        }
                                        recordingViewModel2.ResultReceiver = BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(recordingViewModel2), null, null, new RecordingViewModel$startTimer$1(recordingViewModel2, shortNewsContentCardView2, i19), 3);
                                        return createfromparcel2;
                                    }
                                    if (roomDatabasecloseBarrier1 instanceof RoomDatabaseperformClear111) {
                                        objAccess$showWrongMovementMade = RecordingViewModel.access$showCorrectMovementMade(recordingViewModel2, shortNewsContentCardView);
                                        if (objAccess$showWrongMovementMade != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            return createfromparcel2;
                                        }
                                        int i116 = serializer + 17;
                                        write = i116 % Fields.SpotShadowColor;
                                        if (i116 % 2 != 0) {
                                            int i117 = 3 / 3;
                                        }
                                    } else {
                                        if (!(roomDatabasecloseBarrier1 instanceof dropAllTables)) {
                                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{roomDatabasecloseBarrier1, RoomDatabaseperformClear1.serializer}, getCieXyz.write())).booleanValue()) {
                                                return createfromparcel2;
                                            }
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                            return null;
                                        }
                                        objAccess$showWrongMovementMade = RecordingViewModel.access$showWrongMovementMade(recordingViewModel2, ((dropAllTables) roomDatabasecloseBarrier1).IconCompatParcelizer, shortNewsContentCardView);
                                        if (objAccess$showWrongMovementMade != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            return createfromparcel2;
                                        }
                                    }
                                } else if (!(recordingViewModel2.ParcelableVolumeInfo.read() instanceof getTranslateY) || (objAccess$showWrongMovementMade = recordingViewModel2.failLiveness(RoomDatabaseperformClear11.NO_FACE, shortNewsContentCardView)) != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    return createfromparcel2;
                                }
                            } else {
                                if (!(recordingViewModel2.ParcelableVolumeInfo.read() instanceof getTranslateY)) {
                                    return createfromparcel2;
                                }
                                int i20 = serializer + 49;
                                write = i20 % Fields.SpotShadowColor;
                                if (i20 % 2 != 0) {
                                    recordingViewModel2.failLiveness(RoomDatabaseperformClear11.MULTIPLE_FACES, shortNewsContentCardView);
                                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    shortNewsContentCardView2.hashCode();
                                    throw null;
                                }
                                objAccess$showWrongMovementMade = recordingViewModel2.failLiveness(RoomDatabaseperformClear11.MULTIPLE_FACES, shortNewsContentCardView);
                                if (objAccess$showWrongMovementMade != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    return createfromparcel2;
                                }
                            }
                        }
                        return objAccess$showWrongMovementMade;
                    }
                    setStrokeColor setstrokecolor = (setStrokeColor) obj2;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setstrokecolor, fromcongestionvaluenavigation_release}, getCieXyz.write())).booleanValue()) {
                        recordingViewModel2.write.IconCompatParcelizer(new setRefreshingWithoutSwipeGesture(recordingViewModel2.PlaybackStateCompat.read.IconCompatParcelizer(R.string.liveness_face_detection_instructions), 119));
                        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3 = recordingViewModel2.RemoteActionCompatParcelizer;
                        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3 != null) {
                            int i21 = serializer + 115;
                            write = i21 % Fields.SpotShadowColor;
                            if (i21 % 2 != 0) {
                                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3.write((CancellationException) null);
                                shortNewsContentCardView2.hashCode();
                                throw null;
                            }
                            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3.write((CancellationException) null);
                        }
                        recordingViewModel2.RemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(recordingViewModel2), null, null, new RecordingViewModel$startTimer$1(recordingViewModel2, shortNewsContentCardView2, 0), 3);
                        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu4 = recordingViewModel2.MediaDescriptionCompat;
                        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu4 != null) {
                            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu4.write((CancellationException) null);
                        }
                        recordingViewModel2.MediaDescriptionCompat = BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(recordingViewModel2), null, null, new RecordingViewModel$startTimer$1(recordingViewModel2, shortNewsContentCardView2, i110), 3);
                        return createfromparcel2;
                    }
                    if (setstrokecolor instanceof getTranslateY) {
                        MutableStateFlow mutableStateFlow3 = recordingViewModel2.write;
                        BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28 = recordingViewModel2.ComponentActivity;
                        setColorScheme setcolorscheme = ((getTranslateY) setstrokecolor).write;
                        setTransactionSuccessful settransactionsuccessful = brazeExternalSyntheticLambda28.read;
                        int i22 = setRootAlpha.write[setcolorscheme.read.ordinal()];
                        if (i22 != 1) {
                            int i23 = write + 125;
                            serializer = i23 % Fields.SpotShadowColor;
                            int i24 = i23 % 2;
                            if (i22 == 2) {
                                setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.InfoRightMovement;
                                strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.liveness_movement_right);
                                strIconCompatParcelizer2 = settransactionsuccessful.IconCompatParcelizer(R.string.liveness_head_movement_instructions);
                                i15 = R.raw.head_right;
                            } else if (i22 == 3) {
                                setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.InfoSmile;
                                strIconCompatParcelizer3 = settransactionsuccessful.IconCompatParcelizer(R.string.liveness_movement_smile);
                                i16 = R.raw.smile;
                                str = "";
                            } else {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            }
                            mutableStateFlow3.IconCompatParcelizer(new setRefreshingWithoutSwipeGesture(setlegacyrequestdisallowintercepttoucheventenabled, Integer.valueOf(i16), new setOnRefreshListener(setcolorscheme.serializer, setcolorscheme.RemoteActionCompatParcelizer), str, strIconCompatParcelizer3, setProgressBackgroundColor.DETECTION, false, false));
                            return createfromparcel2;
                        }
                        setlegacyrequestdisallowintercepttoucheventenabled = setLegacyRequestDisallowInterceptTouchEventEnabled.InfoLeftMovement;
                        strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.liveness_movement_left);
                        strIconCompatParcelizer2 = settransactionsuccessful.IconCompatParcelizer(R.string.liveness_head_movement_instructions);
                        i15 = R.raw.head_left;
                        int i25 = i15;
                        str = strIconCompatParcelizer2;
                        strIconCompatParcelizer3 = strIconCompatParcelizer;
                        i16 = i25;
                        mutableStateFlow3.IconCompatParcelizer(new setRefreshingWithoutSwipeGesture(setlegacyrequestdisallowintercepttoucheventenabled, Integer.valueOf(i16), new setOnRefreshListener(setcolorscheme.serializer, setcolorscheme.RemoteActionCompatParcelizer), str, strIconCompatParcelizer3, setProgressBackgroundColor.DETECTION, false, false));
                        return createfromparcel2;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setstrokecolor, getStrokeColor.write}, getCieXyz.write())).booleanValue()) {
                        return createfromparcel2;
                    }
                    int i26 = serializer + 73;
                    write = i26 % Fields.SpotShadowColor;
                    if (i26 % 2 != 0) {
                        ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setstrokecolor, getGroupName.read}, getCieXyz.write())).booleanValue();
                        throw null;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setstrokecolor, getGroupName.read}, getCieXyz.write())).booleanValue()) {
                        return createfromparcel2;
                    }
                    int i27 = write + 115;
                    serializer = i27 % Fields.SpotShadowColor;
                    if (i27 % 2 == 0) {
                        ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setstrokecolor, getTranslateX.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
                        throw null;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setstrokecolor, getTranslateX.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                        return createfromparcel2;
                    }
                    if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setstrokecolor, getLocalMatrix.write}, getCieXyz.write())).booleanValue())) {
                        return createfromparcel2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    int i28 = serializer + 97;
                    write = i28 % Fields.SpotShadowColor;
                    int i29 = i28 % 2;
                    return null;
                }
            };
            this.RemoteActionCompatParcelizer = 1;
            if (mutableStateFlow2.collect(flowCollector2, this) == coroutineSingletons5) {
                int i15 = IconCompatParcelizer + 55;
                serializer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 != 0) {
                    int i16 = 99 / 0;
                }
                coroutineSingletons = coroutineSingletons5;
            } else {
                DrawableTransformation.read();
            }
        } else if (i13 != 1) {
            int i17 = IconCompatParcelizer + 55;
            serializer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            DrawableTransformation.read();
        }
        int i19 = serializer + 37;
        IconCompatParcelizer = i19 % Fields.SpotShadowColor;
        if (i19 % 2 == 0) {
            int i20 = 97 / 0;
        }
        return coroutineSingletons;
    }
}
