package com.braze.managers;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import bo.app.a5$$ExternalSyntheticLambda4;
import bo.app.af;
import bo.app.b2;
import bo.app.b2$$ExternalSyntheticLambda15;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.d2;
import bo.app.df;
import bo.app.f2;
import bo.app.f2$$ExternalSyntheticLambda1;
import bo.app.f2$$ExternalSyntheticLambda4;
import bo.app.g9;
import bo.app.h2;
import bo.app.i9;
import bo.app.m1;
import bo.app.n$$ExternalSyntheticLambda4;
import bo.app.n1;
import bo.app.u9;
import bo.app.w8$$ExternalSyntheticLambda6;
import bo.app.x1;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.enums.GeofenceTransitionType;
import com.braze.location.IBrazeGeofenceApi;
import com.braze.location.IBrazeLocationApi;
import com.braze.models.Banner$$ExternalSyntheticLambda0;
import com.braze.models.BrazeGeofence;
import com.braze.models.IBrazeLocation;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.GeofenceDataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import com.braze.support.c$$ExternalSyntheticLambda7;
import com.braze.support.g;
import com.huawei.hms.support.api.location.common.LocationConstant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.BrazeContentCardsManagerCompanion;
import o.MediaSessionCompatQueueItem;
import o.createFromParcel;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isVerticalSwipeInAllowedDirection;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeGeofenceManager implements IBrazeGeofenceLocationUpdateListener {
    public static final Companion Companion = new Companion(null);
    private final Context applicationContext;
    private final x1 brazeGeofenceApi;
    private b2 brazeGeofenceReEligibilityManager;
    private final List<BrazeGeofence> brazeGeofences;
    private final d2 brazeLocationApi;
    private final i9 brazeManager;
    private final BrazeConfigurationProvider configurationProvider;
    private final GeofenceDataStoreProvider geofenceDataStoreProvider;
    private final ReentrantLock geofenceListLock;
    private IBrazeLocation geofenceRequestLocation;
    private final PendingIntent geofenceTransitionPendingIntent;
    private boolean isGeofencesEnabled;
    private int maxNumToRegister;
    private final df serverConfigStorageProvider;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getGeofencesEnabledFromServerConfig$lambda$0() {
            return "Geofences enabled in server configuration.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getGeofencesEnabledFromServerConfig$lambda$1() {
            return "Geofences explicitly disabled via server configuration.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getGeofencesEnabledFromServerConfig$lambda$2() {
            return "Geofences implicitly disabled via server configuration.";
        }

        public final boolean getGeofencesEnabledFromConfiguration(BrazeConfigurationProvider brazeConfigurationProvider) {
            brazeConfigurationProvider.getClass();
            return brazeConfigurationProvider.isGeofencesEnabled();
        }

        public final boolean getGeofencesEnabledFromServerConfig(df dfVar) {
            dfVar.getClass();
            if (!dfVar.L()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(18), 6, (Object) null);
                return false;
            }
            if (dfVar.K()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(16), 6, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(17), 6, (Object) null);
            return false;
        }

        public final int getMaxNumToRegister(df dfVar) {
            dfVar.getClass();
            if (dfVar.r() > 0) {
                return dfVar.r();
            }
            return 20;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getBrazeGeofenceApi$annotations() {
    }

    public static /* synthetic */ void getBrazeGeofenceReEligibilityManager$annotations() {
    }

    public static /* synthetic */ void getBrazeGeofences$annotations() {
    }

    public static /* synthetic */ void getBrazeLocationApi$annotations() {
    }

    public static /* synthetic */ void getGeofenceRequestLocation$annotations() {
    }

    public static /* synthetic */ void getGeofenceTransitionPendingIntent$annotations() {
    }

    public static /* synthetic */ void getMaxNumToRegister$annotations() {
    }

    public static /* synthetic */ void isGeofencesEnabled$annotations() {
    }

    public final x1 getBrazeGeofenceApi() {
        return this.brazeGeofenceApi;
    }

    public final b2 getBrazeGeofenceReEligibilityManager() {
        return this.brazeGeofenceReEligibilityManager;
    }

    public final List<BrazeGeofence> getBrazeGeofences() {
        return this.brazeGeofences;
    }

    public final d2 getBrazeLocationApi() {
        return this.brazeLocationApi;
    }

    public final i9 getBrazeManager() {
        return this.brazeManager;
    }

    public final GeofenceDataStoreProvider getGeofenceDataStoreProvider() {
        return this.geofenceDataStoreProvider;
    }

    public final IBrazeLocation getGeofenceRequestLocation() {
        return this.geofenceRequestLocation;
    }

    public final PendingIntent getGeofenceTransitionPendingIntent() {
        return this.geofenceTransitionPendingIntent;
    }

    public final boolean isGeofencesEnabled() {
        return this.isGeofencesEnabled;
    }

    public final void setGeofenceRequestLocation(IBrazeLocation iBrazeLocation) {
        this.geofenceRequestLocation = iBrazeLocation;
    }

    public final void setGeofencesEnabled(boolean z) {
        this.isGeofencesEnabled = z;
    }

    public final void setMaxNumToRegister(int i) {
        this.maxNumToRegister = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0() {
        return "***Geofence API not found. Please include the android-sdk-location module***";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$1() {
        return "Calling setUpGeofences on geofence manager init";
    }

    public static final boolean getGeofencesEnabledFromConfiguration(BrazeConfigurationProvider brazeConfigurationProvider) {
        return Companion.getGeofencesEnabledFromConfiguration(brazeConfigurationProvider);
    }

    public static final boolean getGeofencesEnabledFromServerConfig(df dfVar) {
        return Companion.getGeofencesEnabledFromServerConfig(dfVar);
    }

    public static final int getMaxNumToRegister(df dfVar) {
        return Companion.getMaxNumToRegister(dfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initializeGeofences$lambda$0() {
        return "Request to set up geofences received.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initializeGeofences$lambda$1() {
        return "Not automatically requesting Geofences on initialization due to configuration.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$0() {
        return "Braze Geofences disabled or Braze location collection disabled in local configuration. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$1() {
        return "Fine grained location permissions not found. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$2() {
        return "Background location access permission not found. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$3() {
        return "Google Play Services not available. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$4() {
        return "Braze Geofence API is not available";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$5() {
        return "Google Play Services Location API not found. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$6() {
        return "Location permissions granted and Google Play Services available. Braze Geofencing enabled via config.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onLocationRequestComplete$lambda$1() {
        return "Single location request was unsuccessful, not storing last updated time.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String postGeofenceReport$lambda$0() {
        return "Braze geofences not enabled. Not posting geofence report.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$0() {
        return "Braze geofences not enabled. Not adding new geofences to local storage.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$2$3(BrazeGeofenceManager brazeGeofenceManager) {
        return d$$ExternalSyntheticOutline0.m(brazeGeofenceManager.brazeGeofences.size(), "Added ", " new geofences to local storage.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$0() {
        return "Braze geofences not enabled. Not requesting geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$2() {
        return "Braze geofences not enabled. Not requesting geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retrieveBrazeGeofencesFromLocalStorage$lambda$0() {
        return "Did not find stored geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setUpGeofences$lambda$0() {
        return "Braze geofences not enabled. Geofences not set up.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setUpGeofences$lambda$1(boolean z) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Setting up geofences in setUpGeofences with reRegisterGeofences: ", z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setUpGeofences$lambda$2() {
        return "Could not get pending intent to setup geofences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tearDownGeofences$lambda$0() {
        return "Tearing down geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tearDownGeofences$lambda$1() {
        return "Unregistering any Braze geofences from Google Play Services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tearDownGeofences$lambda$2$0() {
        return "Deleting locally stored geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterGeofences$lambda$0() {
        return "Braze geofences not enabled. Not un-registering geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterGeofences$lambda$1() {
        return "Tearing down all geofences.";
    }

    public void registerGeofences(List<BrazeGeofence> list) {
        String strRemoteActionCompatParcelizer;
        list.getClass();
        ArrayList<BrazeGeofence> arrayList = new ArrayList(list);
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(26), 6, (Object) null);
            return;
        }
        if (this.geofenceRequestLocation != null) {
            for (BrazeGeofence brazeGeofence : arrayList) {
                IBrazeLocation iBrazeLocation = this.geofenceRequestLocation;
                if (iBrazeLocation != null) {
                    double latitude = iBrazeLocation.getLatitude();
                    double longitude = iBrazeLocation.getLongitude();
                    double latitude2 = brazeGeofence.getLatitude();
                    double longitude2 = brazeGeofence.getLongitude();
                    double radians = Math.toRadians(latitude2 - latitude);
                    brazeGeofence.setDistanceFromGeofenceRefresh(Math.asin(Math.sqrt((Math.cos(Math.toRadians(latitude2)) * Math.cos(Math.toRadians(latitude)) * Math.pow(Math.sin(Math.toRadians(longitude2 - longitude) / 2.0d), 2.0d)) + Math.pow(Math.sin(radians / 2.0d), 2.0d))) * 1.2742E7d);
                }
            }
            BrazeContentCardsManagerCompanion.RatingCompat(arrayList);
        }
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda4(6, arrayList), 7, (Object) null);
            this.geofenceDataStoreProvider.clearData(DataStoreKey.GEOFENCES);
            this.brazeGeofences.clear();
            int i = 0;
            int i2 = 0;
            for (BrazeGeofence brazeGeofence2 : arrayList) {
                if (i2 == this.maxNumToRegister) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda22(this, i), 7, (Object) null);
                    break;
                } else {
                    this.brazeGeofences.add(brazeGeofence2);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w8$$ExternalSyntheticLambda6(brazeGeofence2, 2), 7, (Object) null);
                    i2++;
                }
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda22(this, 1), 7, (Object) null);
            GeofenceDataStoreProvider geofenceDataStoreProvider = this.geofenceDataStoreProvider;
            DataStoreKey dataStoreKey = DataStoreKey.GEOFENCES;
            List<BrazeGeofence> list2 = this.brazeGeofences;
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                        isverticalswipeinalloweddirection.getClass();
                        strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(BrazeGeofence.Companion.serializer(), 0), list2);
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                        strRemoteActionCompatParcelizer = (!(list2 instanceof Map) && (list2 instanceof List)) ? "[]" : "{}";
                    }
                    geofenceDataStoreProvider.writeData(dataStoreKey, strRemoteActionCompatParcelizer);
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
                }
            }
            reentrantLock.unlock();
            this.brazeGeofenceReEligibilityManager.a(arrayList);
            setUpGeofences(true);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final List<BrazeGeofence> retrieveBrazeGeofencesFromLocalStorage() {
        ArrayList arrayList;
        GeofenceDataStoreProvider geofenceDataStoreProvider = this.geofenceDataStoreProvider;
        DataStoreKey dataStoreKey = DataStoreKey.GEOFENCES;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object data = geofenceDataStoreProvider.readData(dataStoreKey, "");
                data.getClass();
                String str = (String) data;
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
                    List list = instance_delegatelambda0.write;
                    if (!zSerializer) {
                        Object[] objArr = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString(), "null"};
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                            try {
                                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                                isverticalswipeinalloweddirection.getClass();
                                list = (List) isverticalswipeinalloweddirection.serializer(str, new setWasCloseMessageCalled(BrazeGeofence.Companion.serializer(), 0));
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.a(str), 4, (Object) null);
                            }
                        }
                    }
                    arrayList = onContentCardDismissed.IconCompatParcelizer((Collection) list);
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.j(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        if (arrayList.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(12), 7, (Object) null);
        }
        return arrayList;
    }

    public BrazeGeofenceManager(Context context, String str, i9 i9Var, BrazeConfigurationProvider brazeConfigurationProvider, df dfVar, u9 u9Var) {
        context.getClass();
        str.getClass();
        i9Var.getClass();
        brazeConfigurationProvider.getClass();
        dfVar.getClass();
        u9Var.getClass();
        this.brazeManager = i9Var;
        this.configurationProvider = brazeConfigurationProvider;
        this.serverConfigStorageProvider = dfVar;
        GeofenceDataStoreProvider geofenceDataStoreProvider = new GeofenceDataStoreProvider(context, str);
        this.geofenceDataStoreProvider = geofenceDataStoreProvider;
        x1 x1Var = new x1(geofenceDataStoreProvider);
        this.brazeGeofenceApi = x1Var;
        this.brazeLocationApi = new d2(context, f2.d.a(brazeConfigurationProvider), brazeConfigurationProvider);
        this.applicationContext = context.getApplicationContext();
        this.geofenceListLock = new ReentrantLock();
        this.brazeGeofences = onContentCardDismissed.IconCompatParcelizer((Collection) retrieveBrazeGeofencesFromLocalStorage());
        IBrazeGeofenceApi iBrazeGeofenceApi = x1Var.b;
        this.geofenceTransitionPendingIntent = iBrazeGeofenceApi != null ? iBrazeGeofenceApi.getGeofenceTransitionPendingIntent(context) : null;
        this.brazeGeofenceReEligibilityManager = new b2(dfVar, u9Var, geofenceDataStoreProvider);
        Companion companion = Companion;
        this.isGeofencesEnabled = companion.getGeofencesEnabledFromServerConfig(dfVar) && isGeofencesEnabledFromEnvironment(context) && x1Var.b != null;
        this.maxNumToRegister = companion.getMaxNumToRegister(dfVar);
        if (x1Var.b == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(15), 6, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(11), 6, (Object) null);
        setUpGeofences(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel requestSingleLocationUpdateFromGooglePlay$lambda$0(BrazeGeofenceManager brazeGeofenceManager, IBrazeLocation iBrazeLocation) {
        iBrazeLocation.getClass();
        brazeGeofenceManager.onLocationRequestComplete(iBrazeLocation);
        return createFromParcel.INSTANCE;
    }

    public final boolean analyticsEnabledForGeofenceId(String str, GeofenceTransitionType geofenceTransitionType) {
        str.getClass();
        geofenceTransitionType.getClass();
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeGeofence brazeGeofenceForGeofenceId = getBrazeGeofenceForGeofenceId(str);
            if (brazeGeofenceForGeofenceId != null) {
                if (geofenceTransitionType == GeofenceTransitionType.ENTER) {
                    return brazeGeofenceForGeofenceId.getAnalyticsEnabledEnter();
                }
                if (geofenceTransitionType == GeofenceTransitionType.EXIT) {
                    return brazeGeofenceForGeofenceId.getAnalyticsEnabledExit();
                }
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    public void configureFromServerConfig(af afVar) {
        boolean z;
        afVar.getClass();
        boolean z2 = afVar.i;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda4(z2, 7), 7, (Object) null);
        if (z2) {
            Context context = this.applicationContext;
            context.getClass();
            if (!isGeofencesEnabledFromEnvironment(context) || this.brazeGeofenceApi.b == null) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (z != this.isGeofencesEnabled) {
            this.isGeofencesEnabled = z;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda22(this, 2), 6, (Object) null);
            if (this.isGeofencesEnabled) {
                setUpGeofences(false);
                if (this.configurationProvider.isAutomaticGeofenceRequestsEnabled()) {
                    requestGeofenceRefresh(true);
                }
            } else {
                tearDownGeofences(this.geofenceTransitionPendingIntent);
            }
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda4(z, 8), 7, (Object) null);
        }
        int i = afVar.g;
        if (i >= 0) {
            this.maxNumToRegister = i;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda22(this, 3), 6, (Object) null);
        }
        this.brazeGeofenceReEligibilityManager.a(afVar);
    }

    public final BrazeGeofence getBrazeGeofenceForGeofenceId(String str) {
        Object next;
        Object[] objArr;
        str.getClass();
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.brazeGeofences.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                objArr = new Object[]{((BrazeGeofence) next).getId(), str};
            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue());
            return (BrazeGeofence) next;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isGeofencesEnabledFromEnvironment(Context context) {
        context.getClass();
        if (!Companion.getGeofencesEnabledFromConfiguration(this.configurationProvider)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(19), 7, (Object) null);
            return false;
        }
        if (!PermissionUtils.hasPermission(context, "android.permission.ACCESS_FINE_LOCATION")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(20), 6, (Object) null);
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && !PermissionUtils.hasPermission(context, LocationConstant.BACKGROUND_PERMISSION)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(21), 6, (Object) null);
            return false;
        }
        if (!g.a(context)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(22), 7, (Object) null);
            return false;
        }
        if (this.brazeGeofenceApi.b == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(25), 7, (Object) null);
            return false;
        }
        try {
            Class.forName("com.google.android.gms.location.LocationServices", false, BrazeGeofenceManager.class.getClassLoader());
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(23), 7, (Object) null);
            return true;
        } catch (Exception unused) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(24), 7, (Object) null);
            return false;
        }
    }

    public void postGeofenceReport(String str, GeofenceTransitionType geofenceTransitionType) {
        str.getClass();
        geofenceTransitionType.getClass();
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(4), 6, (Object) null);
            return;
        }
        m1 m1Var = n1.g;
        String string = geofenceTransitionType.toString();
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = string.toLowerCase(locale);
        lowerCase.getClass();
        g9 g9VarG = m1Var.g(str, lowerCase);
        if (g9VarG == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b2$$ExternalSyntheticLambda15(str, geofenceTransitionType, 1), 6, (Object) null);
            return;
        }
        if (analyticsEnabledForGeofenceId(str, geofenceTransitionType)) {
            ((h2) this.brazeManager).a(g9VarG);
        }
        BrazeGeofence brazeGeofenceForGeofenceId = getBrazeGeofenceForGeofenceId(str);
        if (brazeGeofenceForGeofenceId != null && this.brazeGeofenceReEligibilityManager.a(DateTimeUtils.nowInSeconds(), brazeGeofenceForGeofenceId, geofenceTransitionType)) {
            ((h2) this.brazeManager).g(g9VarG);
        }
    }

    public final void registerGeofencesWithGooglePlay(List<BrazeGeofence> list, PendingIntent pendingIntent) {
        list.getClass();
        pendingIntent.getClass();
        x1 x1Var = this.brazeGeofenceApi;
        Context context = this.applicationContext;
        context.getClass();
        x1Var.getClass();
        IBrazeGeofenceApi iBrazeGeofenceApi = x1Var.b;
        if (iBrazeGeofenceApi != null) {
            iBrazeGeofenceApi.registerGeofences(context, list, pendingIntent, x1Var.a);
        }
    }

    public final void setBrazeGeofenceReEligibilityManager(b2 b2Var) {
        b2Var.getClass();
        this.brazeGeofenceReEligibilityManager = b2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$0(boolean z) {
        return MediaSessionCompatQueueItem.serializer("Geofences enabled server config value ", " received.", z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$2(boolean z) {
        return MediaSessionCompatQueueItem.serializer("Geofences enabled status of `", "` was unchanged during server config update.", z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onLocationRequestComplete$lambda$0(IBrazeLocation iBrazeLocation) {
        return "Single location request was successful, requesting Geofence refresh. Location:\n " + iBrazeLocation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String postGeofenceReport$lambda$1(String str, GeofenceTransitionType geofenceTransitionType) {
        return "Failed to record geofence " + str + " transition with transition type " + geofenceTransitionType + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$2$1(BrazeGeofenceManager brazeGeofenceManager) {
        return c8$$ExternalSyntheticOutline0.m(brazeGeofenceManager.maxNumToRegister, "Reached maximum number of new geofences: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$2$2(BrazeGeofence brazeGeofence) {
        return "Adding new geofence to local storage: " + brazeGeofence;
    }

    @Override // com.braze.managers.IBrazeGeofenceLocationUpdateListener
    public void onLocationRequestComplete(IBrazeLocation iBrazeLocation) {
        if (iBrazeLocation != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new f2$$ExternalSyntheticLambda1(iBrazeLocation, 2), 7, (Object) null);
            requestGeofenceRefresh(iBrazeLocation);
            this.brazeGeofenceReEligibilityManager.b(DateTimeUtils.nowInSeconds());
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(29), 7, (Object) null);
    }

    public void requestGeofenceRefresh(boolean z) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(27), 7, (Object) null);
        } else if (this.brazeGeofenceReEligibilityManager.a(z, DateTimeUtils.nowInSeconds())) {
            requestSingleLocationUpdateFromGooglePlay();
        }
    }

    public final void setUpGeofences(final boolean z) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(13), 7, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda35
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                return BrazeGeofenceManager.setUpGeofences$lambda$1(z);
            }
        }, 6, (Object) null);
        PendingIntent pendingIntent = this.geofenceTransitionPendingIntent;
        if (pendingIntent == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(14), 7, (Object) null);
            return;
        }
        if (z) {
            ReentrantLock reentrantLock = this.geofenceListLock;
            reentrantLock.lock();
            try {
                registerGeofencesWithGooglePlay(this.brazeGeofences, pendingIntent);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public void unregisterGeofences() {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(1), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(2), 7, (Object) null);
            tearDownGeofences(this.geofenceTransitionPendingIntent);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    public final void initializeGeofences() {
        boolean z;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(6), 7, (Object) null);
        if (Companion.getGeofencesEnabledFromServerConfig(this.serverConfigStorageProvider)) {
            Context context = this.applicationContext;
            context.getClass();
            if (!isGeofencesEnabledFromEnvironment(context) || this.brazeGeofenceApi.b == null) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        this.isGeofencesEnabled = z;
        if (this.configurationProvider.isAutomaticGeofenceRequestsEnabled()) {
            requestGeofenceRefresh(true);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(7), 7, (Object) null);
        }
    }

    public final void tearDownGeofences(PendingIntent pendingIntent) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(0), 7, (Object) null);
        if (pendingIntent != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(28), 7, (Object) null);
            x1 x1Var = this.brazeGeofenceApi;
            Context context = this.applicationContext;
            context.getClass();
            x1Var.getClass();
            IBrazeGeofenceApi iBrazeGeofenceApi = x1Var.b;
            if (iBrazeGeofenceApi != null) {
                iBrazeGeofenceApi.teardownGeofences(context, pendingIntent);
            }
        }
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(3), 7, (Object) null);
            this.geofenceDataStoreProvider.clearData(DataStoreKey.GEOFENCES);
            this.brazeGeofences.clear();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$1(BrazeGeofenceManager brazeGeofenceManager) {
        return MediaSessionCompatQueueItem.serializer("Geofences enabled status newly set to ", " during server config update.", brazeGeofenceManager.isGeofencesEnabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$3(BrazeGeofenceManager brazeGeofenceManager) {
        return d$$ExternalSyntheticOutline0.m(brazeGeofenceManager.maxNumToRegister, "Max number to register newly set to ", " via server config.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$2$0(List list) {
        return c8$$ExternalSyntheticOutline0.m(list.size(), "Received new geofence list of size: ");
    }

    public final void requestSingleLocationUpdateFromGooglePlay() {
        d2 d2Var = this.brazeLocationApi;
        f2$$ExternalSyntheticLambda4 f2__externalsyntheticlambda4 = new f2$$ExternalSyntheticLambda4(10, this);
        d2Var.getClass();
        IBrazeLocationApi iBrazeLocationApi = d2Var.a;
        if (iBrazeLocationApi != null) {
            iBrazeLocationApi.requestSingleLocationUpdate(f2__externalsyntheticlambda4);
        }
    }

    public final int getMaxNumToRegister() {
        return this.maxNumToRegister;
    }

    public void requestGeofenceRefresh(IBrazeLocation iBrazeLocation) {
        iBrazeLocation.getClass();
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(5), 7, (Object) null);
        } else {
            this.geofenceRequestLocation = iBrazeLocation;
            ((h2) this.brazeManager).a(iBrazeLocation);
        }
    }
}
