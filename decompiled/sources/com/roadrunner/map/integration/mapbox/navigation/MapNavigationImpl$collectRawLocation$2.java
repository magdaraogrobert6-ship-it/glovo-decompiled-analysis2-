package com.roadrunner.map.integration.mapbox.navigation;

import android.content.SharedPreferences;
import androidx.camera.core.LegacySessionConfig;
import androidx.compose.ui.graphics.Fields;
import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import androidx.room.RoomDatabase;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.wisesecurity.ucs_credential.x;
import com.logistics.rider.glovo.R;
import com.mapbox.api.directions.v5.models.VoiceInstructions;
import com.mapbox.common.location.Location;
import com.mapbox.navigation.core.reroute.RerouteState$RouteFetched;
import com.mapbox.navigation.ui.maps.camera.NavigationCamera;
import com.mapbox.navigation.utils.internal.JobControl;
import com.mapbox.navigation.voice.model.SpeechVolume;
import com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers.TurnByTurnNavigationLogger;
import com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers.TurnByTurnNavigationLogger$logNavigationArrival$1;
import com.roadrunner.rider.recruitment.applicant.domain.ApplicantAuthenticationInterceptorImpl$intercept$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.LineBreakWordBreak;
import o.N;
import o.ShortNewsContentCardView;
import o.childSerializers;
import o.createFromParcel;
import o.getAutovmbZdU8;
import o.getGetTextLayoutResult;
import o.getHeadingrAG3T2kannotations;
import o.getLooseusljTpc;
import o.getNonevmbZdU8;
import o.getSimplefcGXIks;
import o.getStrictusljTpc;
import o.getUnspecifiedvmbZdU8;
import o.i9;
import o.ia;
import o.ib;
import o.isAdapterPositionOnScreen;
import o.mh;
import o.nExternalSyntheticLambda4;
import o.onPrimaryNavigationFragmentChanged;
import o.serialize;
import o.setRectOutlinetz77jQwdefault;
import o.setTransactionSuccessful;
import o.valueOfkPa1_AA;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class MapNavigationImpl$collectRawLocation$2 implements FlowCollector {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ MapNavigationImpl read;

    public /* synthetic */ MapNavigationImpl$collectRawLocation$2(MapNavigationImpl mapNavigationImpl, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = mapNavigationImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        x xVar;
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        MapNavigationImpl mapNavigationImpl = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 == 0) {
            mapNavigationImpl.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.serializer = ((Location) obj).getBearing();
            return createfromparcel;
        }
        getHeadingrAG3T2kannotations getheadingrag3t2kannotations = null;
        if (i2 == 1) {
            getAutovmbZdU8 getautovmbzdu8 = (getAutovmbZdU8) obj;
            if (!(getautovmbzdu8 instanceof getUnspecifiedvmbZdU8)) {
                if (!(getautovmbzdu8 instanceof valueOfkPa1_AA)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                ia iaVar = mapNavigationImpl.ResultReceiver;
                ib ibVar = iaVar.RemoteActionCompatParcelizer;
                Object obj2 = ibVar.read.read();
                serialize serializeVar = serialize.OVERVIEW;
                if (obj2 == serializeVar) {
                    setRectOutlinetz77jQwdefault setrectoutlinetz77jqwdefault = new setRectOutlinetz77jQwdefault(23);
                    NavigationCamera navigationCamera = iaVar.MediaBrowserCompatMediaItem;
                    if (navigationCamera != null) {
                        NavigationCamera.requestNavigationCameraToOverview$default(navigationCamera, new i9(setrectoutlinetz77jqwdefault));
                    }
                    serializeVar.getClass();
                    ibVar.serializer.write(serializeVar);
                } else {
                    iaVar.read();
                }
                getLooseusljTpc getlooseusljtpc = mapNavigationImpl._init_lambda3;
                boolean z = ((valueOfkPa1_AA) getautovmbzdu8).write;
                TurnByTurnNavigationLogger turnByTurnNavigationLogger = getlooseusljtpc.RemoteActionCompatParcelizer;
                BuildersKt.RemoteActionCompatParcelizer(turnByTurnNavigationLogger.write, null, null, new ApplicantAuthenticationInterceptorImpl$intercept$1(turnByTurnNavigationLogger, z, (ShortNewsContentCardView) null), 3);
                return createfromparcel;
            }
            ia iaVar2 = mapNavigationImpl.ResultReceiver;
            ib ibVar2 = iaVar2.RemoteActionCompatParcelizer;
            getLooseusljTpc getlooseusljtpc2 = mapNavigationImpl._init_lambda3;
            Object obj3 = ibVar2.read.read();
            serialize serializeVar2 = serialize.OVERVIEW;
            if (obj3 == serializeVar2) {
                int i3 = IconCompatParcelizer + 75;
                write = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                iaVar2.read();
                getlooseusljtpc2.RemoteActionCompatParcelizer(getStrictusljTpc.NAVIGATION);
                return createfromparcel;
            }
            setRectOutlinetz77jQwdefault setrectoutlinetz77jqwdefault2 = new setRectOutlinetz77jQwdefault(23);
            NavigationCamera navigationCamera2 = iaVar2.MediaBrowserCompatMediaItem;
            if (navigationCamera2 != null) {
                NavigationCamera.requestNavigationCameraToOverview$default(navigationCamera2, new i9(setrectoutlinetz77jqwdefault2));
            }
            serializeVar2.getClass();
            ibVar2.serializer.write(serializeVar2);
            getlooseusljtpc2.RemoteActionCompatParcelizer(getStrictusljTpc.OVERVIEW);
            return createfromparcel;
        }
        if (i2 == 2) {
            mapNavigationImpl.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.IconCompatParcelizer(onPrimaryNavigationFragmentChanged.HALF_EXPANDED);
            TurnByTurnNavigationLogger turnByTurnNavigationLogger2 = mapNavigationImpl._init_lambda3.RemoteActionCompatParcelizer;
            BuildersKt.RemoteActionCompatParcelizer(turnByTurnNavigationLogger2.write, null, null, new TurnByTurnNavigationLogger$logNavigationArrival$1(turnByTurnNavigationLogger2, null, 0), 3);
            Object obj4 = mapNavigationImpl.MediaBrowserCompatMediaItem.read.read();
            if (obj4 instanceof getHeadingrAG3T2kannotations) {
                int i5 = IconCompatParcelizer + 51;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                getheadingrag3t2kannotations = (getHeadingrAG3T2kannotations) obj4;
            }
            if (getheadingrag3t2kannotations != null) {
                mapNavigationImpl.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer.write(new getNonevmbZdU8(getheadingrag3t2kannotations.write));
            } else {
                Timber.RemoteActionCompatParcelizer.write(new IllegalStateException("Cannot dispatch Arrival, state " + getheadingrag3t2kannotations + " is not Active Guidance"));
            }
            return createfromparcel;
        }
        if (i2 == 3) {
            if (((getGetTextLayoutResult) obj) instanceof RerouteState$RouteFetched) {
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                getSimplefcGXIks getsimplefcgxiks = mapNavigationImpl.read;
                if (getsimplefcgxiks != null) {
                    int i7 = write + 81;
                    IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    boolValueOf = Boolean.valueOf(getsimplefcgxiks.RemoteActionCompatParcelizer);
                } else {
                    boolValueOf = null;
                }
                getSimplefcGXIks getsimplefcgxiks2 = mapNavigationImpl.read;
                if (getsimplefcgxiks2 != null) {
                    int i9 = write + 71;
                    IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    boolValueOf2 = Boolean.valueOf(getsimplefcgxiks2.serializer);
                } else {
                    boolValueOf2 = null;
                }
                forest.IconCompatParcelizer("mapbox sdk rerouting: route fetched, avoidTolls=" + boolValueOf + ", avoidHighways=" + boolValueOf2, new Object[0]);
                TurnByTurnNavigationLogger turnByTurnNavigationLogger3 = mapNavigationImpl._init_lambda3.RemoteActionCompatParcelizer;
                BuildersKt.RemoteActionCompatParcelizer(turnByTurnNavigationLogger3.write, null, null, new RoomDatabase.AnonymousClass1.C00051(turnByTurnNavigationLogger3, false, null), 3);
            }
            return createfromparcel;
        }
        if (i2 == 4) {
            VoiceInstructions voiceInstructions = (VoiceInstructions) obj;
            mh mhVar = mapNavigationImpl.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            voiceInstructions.getClass();
            if (mhVar.MediaDescriptionCompat.serializer.read() == childSerializers.ENABLED && (xVar = mhVar.RemoteActionCompatParcelizer) != null) {
                BuildersKt.RemoteActionCompatParcelizer(((JobControl) ((isAdapterPositionOnScreen) xVar.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper()).scope, null, null, new NavHostKt$NavHost$29$1(mhVar.read, xVar, voiceInstructions, null, 16), 3);
            }
            return createfromparcel;
        }
        mh mhVar2 = mapNavigationImpl.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        getLooseusljTpc getlooseusljtpc3 = mapNavigationImpl._init_lambda3;
        N n = mhVar2.MediaBrowserCompatMediaItem;
        setTransactionSuccessful settransactionsuccessful = n.IconCompatParcelizer;
        SharedPreferences sharedPreferences = n.RemoteActionCompatParcelizer;
        nExternalSyntheticLambda4 nexternalsyntheticlambda4 = mhVar2.MediaDescriptionCompat;
        MutableStateFlow mutableStateFlow = nexternalsyntheticlambda4.read;
        childSerializers childserializers = (childSerializers) nexternalsyntheticlambda4.serializer.read();
        if (childserializers != childSerializers.UNAVAILABLE) {
            childSerializers childserializers2 = childSerializers.DISABLED;
            LegacySessionConfig legacySessionConfig = mhVar2.write;
            if (childserializers == childserializers2) {
                if (legacySessionConfig != null) {
                    legacySessionConfig.volume(new SpeechVolume(1.0f));
                }
                childSerializers childserializers3 = childSerializers.ENABLED;
                childserializers3.getClass();
                mutableStateFlow.write(childserializers3);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putBoolean(settransactionsuccessful.IconCompatParcelizer(R.string.preference_mapbox_voice), true);
                editorEdit.apply();
                getlooseusljtpc3.read(LineBreakWordBreak.ENABLED);
            } else {
                if (legacySessionConfig != null) {
                    legacySessionConfig.volume(new SpeechVolume(0.0f));
                }
                childserializers2.getClass();
                mutableStateFlow.write(childserializers2);
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                editorEdit2.putBoolean(settransactionsuccessful.IconCompatParcelizer(R.string.preference_mapbox_voice), false);
                editorEdit2.apply();
                getlooseusljtpc3.read(LineBreakWordBreak.DISABLED);
            }
        }
        return createfromparcel;
    }
}
