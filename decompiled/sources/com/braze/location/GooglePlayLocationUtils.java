package com.braze.location;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import androidx.navigation.Navigator$$ExternalSyntheticLambda1;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d0$$ExternalSyntheticLambda0;
import bo.app.f2$$ExternalSyntheticLambda4;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda0;
import bo.app.n$$ExternalSyntheticLambda4;
import bo.app.w8$$ExternalSyntheticLambda6;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda1;
import com.braze.managers.IBrazeGeofenceLocationUpdateListener;
import com.braze.models.BrazeGeofence;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.GeofenceDataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationServices;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.MediaSessionCompatQueueItem;
import o.ParentDataModifier;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isVerticalSwipeInAllowedDirection;
import o.onContentCardDismissed;
import o.onMove;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public final class GooglePlayLocationUtils {
    public static final GooglePlayLocationUtils INSTANCE = new GooglePlayLocationUtils();

    private GooglePlayLocationUtils() {
    }

    private final void registerGeofencesWithGeofencingClient(Context context, List<BrazeGeofence> list, PendingIntent pendingIntent, GeofenceDataStoreProvider geofenceDataStoreProvider) {
        List<BrazeGeofence> list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(GooglePlayLocationUtilsKt.toGeofence((BrazeGeofence) it.next()));
        }
        int i = 0;
        GeofencingRequest geofencingRequestBuild = new GeofencingRequest.Builder().addGeofences(arrayList).setInitialTrigger(0).build();
        geofencingRequestBuild.getClass();
        LocationServices.getGeofencingClient(context).addGeofences(geofencingRequestBuild, pendingIntent).addOnSuccessListener(new StreamSharing$$ExternalSyntheticLambda0(23, new GooglePlayLocationUtils$$ExternalSyntheticLambda16(list, geofenceDataStoreProvider, i))).addOnFailureListener(new GooglePlayLocationUtils$$ExternalSyntheticLambda18(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteRegisteredGeofenceCache$lambda$0() {
        return "Deleting registered geofence cache.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel registerGeofencesWithGeofencingClient$lambda$1(List list, GeofenceDataStoreProvider geofenceDataStoreProvider, Void r10) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        GooglePlayLocationUtils googlePlayLocationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) googlePlayLocationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(18), 7, (Object) null);
        googlePlayLocationUtils.storeRegisteredGeofencesToLocalStorage$android_sdk_location_release(list, geofenceDataStoreProvider);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGeofencingClient$lambda$1$0() {
        return "Geofences successfully registered with Google Play Services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerGeofencesWithGeofencingClient$lambda$3(Exception exc) {
        int i = 14;
        if (!(exc instanceof ApiException)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) exc, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(i), 4, (Object) null);
            return;
        }
        int statusCode = ((ApiException) exc).getStatusCode();
        int i2 = 13;
        if (statusCode == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(i2), 7, (Object) null);
            return;
        }
        switch (statusCode) {
            case 1000:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(statusCode, i), 6, (Object) null);
                break;
            case 1001:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(statusCode, 12), 6, (Object) null);
                break;
            case 1002:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(statusCode, i2), 6, (Object) null);
                break;
            default:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(statusCode, 15), 6, (Object) null);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGeofencingClient$lambda$3$0(int i) {
        return c8$$ExternalSyntheticOutline0.m(i, "Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_GEOFENCES: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGeofencingClient$lambda$3$1(int i) {
        return c8$$ExternalSyntheticOutline0.m(i, "Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_PENDING_INTENTS: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGeofencingClient$lambda$3$2(int i) {
        return c8$$ExternalSyntheticOutline0.m(i, "Geofences not registered with Google Play Services due to GEOFENCE_NOT_AVAILABLE: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGeofencingClient$lambda$3$3() {
        return "Received Geofence registration success code in failure block with Google Play Services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGeofencingClient$lambda$3$4(int i) {
        return c8$$ExternalSyntheticOutline0.m(i, "Geofence pending result returned unknown status code: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGeofencingClient$lambda$3$5() {
        return "Geofence exception encountered while adding geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGooglePlayIfNecessary$lambda$10() {
        return "No new geofences need to be registered with Google Play Services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGooglePlayIfNecessary$lambda$11() {
        return "Exception while adding geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGooglePlayIfNecessary$lambda$8() {
        return "No obsolete geofences need to be unregistered from Google Play Services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel removeGeofencesRegisteredWithGeofencingClient$lambda$0(List list, GeofenceDataStoreProvider geofenceDataStoreProvider, Void r10) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        GooglePlayLocationUtils googlePlayLocationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) googlePlayLocationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(15), 7, (Object) null);
        googlePlayLocationUtils.removeGeofencesFromLocalStorage(list, geofenceDataStoreProvider);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeGeofencesRegisteredWithGeofencingClient$lambda$0$0() {
        return "Geofences successfully un-registered with Google Play Services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeGeofencesRegisteredWithGeofencingClient$lambda$2(Exception exc) {
        int i = 17;
        if (!(exc instanceof ApiException)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) exc, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(i), 4, (Object) null);
            return;
        }
        int statusCode = ((ApiException) exc).getStatusCode();
        int i2 = 16;
        if (statusCode == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(i2), 7, (Object) null);
            return;
        }
        switch (statusCode) {
            case 1000:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(statusCode, i2), 6, (Object) null);
                break;
            case 1001:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(statusCode, 10), 6, (Object) null);
                break;
            case 1002:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(statusCode, 11), 6, (Object) null);
                break;
            default:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(statusCode, i), 6, (Object) null);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeGeofencesRegisteredWithGeofencingClient$lambda$2$0(int i) {
        return c8$$ExternalSyntheticOutline0.m(i, "Geofences cannot be un-registered with Google Play Services due to GEOFENCE_TOO_MANY_GEOFENCES: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeGeofencesRegisteredWithGeofencingClient$lambda$2$1(int i) {
        return c8$$ExternalSyntheticOutline0.m(i, "Geofences cannot be un-registered with Google Play Services due to GEOFENCE_TOO_MANY_PENDING_INTENTS: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeGeofencesRegisteredWithGeofencingClient$lambda$2$2(int i) {
        return c8$$ExternalSyntheticOutline0.m(i, "Geofences cannot be un-registered with Google Play Services due to GEOFENCE_NOT_AVAILABLE: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeGeofencesRegisteredWithGeofencingClient$lambda$2$3() {
        return "Received Geofence un-registration success code in failure block with Google Play Services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeGeofencesRegisteredWithGeofencingClient$lambda$2$4(int i) {
        return c8$$ExternalSyntheticOutline0.m(i, "Geofence pending result returned unknown status code: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeGeofencesRegisteredWithGeofencingClient$lambda$2$5() {
        return "Geofence exception encountered while removing geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestSingleLocationUpdateFromGooglePlay$lambda$0() {
        return "Requesting single location update from Google Play Services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel requestSingleLocationUpdateFromGooglePlay$lambda$1(IBrazeGeofenceLocationUpdateListener iBrazeGeofenceLocationUpdateListener, Location location) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(5), 6, (Object) null);
        location.getClass();
        iBrazeGeofenceLocationUpdateListener.onLocationRequestComplete(new BrazeLocation(location));
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestSingleLocationUpdateFromGooglePlay$lambda$1$0() {
        return "Single location request from Google Play services was successful.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestSingleLocationUpdateFromGooglePlay$lambda$3(IBrazeGeofenceLocationUpdateListener iBrazeGeofenceLocationUpdateListener, Exception exc) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) exc, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(8), 4, (Object) null);
        iBrazeGeofenceLocationUpdateListener.onLocationRequestComplete(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestSingleLocationUpdateFromGooglePlay$lambda$3$0() {
        return "Failed to get single location update from Google Play services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestSingleLocationUpdateFromGooglePlay$lambda$4() {
        return "Failed to request location update due to exception.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retrieveRegisteredGeofencesFromLocalStorage$lambda$0() {
        return "Did not find stored geofences.";
    }

    public final void storeRegisteredGeofencesToLocalStorage$android_sdk_location_release(List<BrazeGeofence> list, GeofenceDataStoreProvider geofenceDataStoreProvider) {
        String strRemoteActionCompatParcelizer;
        list.getClass();
        geofenceDataStoreProvider.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d0$$ExternalSyntheticLambda0(list, 7), 7, (Object) null);
        final DataStoreKey dataStoreKey = DataStoreKey.REGISTERED_GEOFENCES;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.location.GooglePlayLocationUtils$storeRegisteredGeofencesToLocalStorage$$inlined$writeList$1
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final String invoke() {
                    return af$$ExternalSyntheticOutline0.m("Key ", dataStoreKey.getKey(), " is not a LIST type. Cannot write key:", dataStoreKey.getKey());
                }
            }, 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(pauseWebviewIfNecessarylambda10.IconCompatParcelizer(isverticalswipeinalloweddirection.RemoteActionCompatParcelizer, displayInAppMessagelambda1.IconCompatParcelizer(BrazeGeofence.class)), 0), list);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.location.GooglePlayLocationUtils$storeRegisteredGeofencesToLocalStorage$$inlined$writeList$2
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final String invoke() {
                        return "Failed to serialize data to JSON";
                    }
                }, 4, (Object) null);
                strRemoteActionCompatParcelizer = list instanceof Map ? "{}" : "[]";
            }
            geofenceDataStoreProvider.writeData(dataStoreKey, strRemoteActionCompatParcelizer);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.location.GooglePlayLocationUtils$storeRegisteredGeofencesToLocalStorage$$inlined$writeList$3
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final String invoke() {
                    return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to write list to DataStore for key: ", dataStoreKey.getKey());
                }
            }, 8, (Object) null);
        }
    }

    public static final void deleteRegisteredGeofenceCache(GeofenceDataStoreProvider geofenceDataStoreProvider) {
        geofenceDataStoreProvider.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(9), 7, (Object) null);
        geofenceDataStoreProvider.clearData(DataStoreKey.REGISTERED_GEOFENCES);
    }

    public static final void registerGeofencesWithGooglePlayIfNecessary(Context context, List<BrazeGeofence> list, PendingIntent pendingIntent, GeofenceDataStoreProvider geofenceDataStoreProvider, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        context.getClass();
        list.getClass();
        pendingIntent.getClass();
        geofenceDataStoreProvider.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        GooglePlayLocationUtils googlePlayLocationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) googlePlayLocationUtils, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d0$$ExternalSyntheticLambda0(list, 6), 6, (Object) null);
        try {
            List<BrazeGeofence> listRetrieveRegisteredGeofencesFromLocalStorage$android_sdk_location_release = googlePlayLocationUtils.retrieveRegisteredGeofencesFromLocalStorage$android_sdk_location_release(geofenceDataStoreProvider);
            List<BrazeGeofence> list2 = listRetrieveRegisteredGeofencesFromLocalStorage$android_sdk_location_release;
            int i = 10;
            int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(list2, 10));
            if (iRemoteActionCompatParcelizer < 16) {
                iRemoteActionCompatParcelizer = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
            for (Object obj : list2) {
                linkedHashMap.put(((BrazeGeofence) obj).getId(), obj);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listRetrieveRegisteredGeofencesFromLocalStorage$android_sdk_location_release) {
                BrazeGeofence brazeGeofence = (BrazeGeofence) obj2;
                List<BrazeGeofence> list3 = list;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<T> it = list3.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((BrazeGeofence) it.next()).getId(), brazeGeofence.getId()}, getCieXyz.write())).booleanValue());
                }
                arrayList.add(obj2);
            }
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((BrazeGeofence) it2.next()).getId());
            }
            ArrayList arrayList3 = new ArrayList();
            for (BrazeGeofence brazeGeofence2 : list) {
                BrazeGeofence brazeGeofence3 = (BrazeGeofence) linkedHashMap.get(brazeGeofence2.getId());
                if (brazeGeofence3 == null || !brazeGeofence2.equivalentServerData(brazeGeofence3)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w8$$ExternalSyntheticLambda6(brazeGeofence2, 1), 7, (Object) null);
                    arrayList3.add(brazeGeofence2);
                }
            }
            if (arrayList2.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(i), 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda4(4, arrayList2), 7, (Object) null);
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(arrayList2);
            }
            if (arrayList3.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(11), 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda4(5, arrayList3), 7, (Object) null);
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(arrayList3);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(12), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel registerGeofencesWithGooglePlayIfNecessary$lambda$0(Context context, GeofenceDataStoreProvider geofenceDataStoreProvider, List list) {
        list.getClass();
        INSTANCE.removeGeofencesRegisteredWithGeofencingClient$android_sdk_location_release(context, list, geofenceDataStoreProvider);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel registerGeofencesWithGooglePlayIfNecessary$lambda$1(Context context, PendingIntent pendingIntent, GeofenceDataStoreProvider geofenceDataStoreProvider, List list) {
        list.getClass();
        INSTANCE.registerGeofencesWithGeofencingClient(context, list, pendingIntent, geofenceDataStoreProvider);
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGooglePlayIfNecessary$lambda$2(List list) {
        return c8$$ExternalSyntheticOutline0.m("registerGeofencesWithGooglePlayIfNecessary called with ", list);
    }

    public static final void requestSingleLocationUpdateFromGooglePlay(Context context, IBrazeGeofenceLocationUpdateListener iBrazeGeofenceLocationUpdateListener) {
        context.getClass();
        iBrazeGeofenceLocationUpdateListener.getClass();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(6), 7, (Object) null);
            LocationServices.getFusedLocationProviderClient(context).getCurrentLocation(100, (ParentDataModifier) null).addOnSuccessListener(new StreamSharing$$ExternalSyntheticLambda0(21, new f2$$ExternalSyntheticLambda4(9, iBrazeGeofenceLocationUpdateListener))).addOnFailureListener(new StreamSharing$$ExternalSyntheticLambda0(22, iBrazeGeofenceLocationUpdateListener)).getClass();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(7), 4, (Object) null);
        }
    }

    public final void removeGeofencesRegisteredWithGeofencingClient$android_sdk_location_release(Context context, List<String> list, GeofenceDataStoreProvider geofenceDataStoreProvider) {
        context.getClass();
        list.getClass();
        geofenceDataStoreProvider.getClass();
        LocationServices.getGeofencingClient(context).removeGeofences(list).addOnSuccessListener(new StreamSharing$$ExternalSyntheticLambda0(24, new GooglePlayLocationUtils$$ExternalSyntheticLambda16(list, geofenceDataStoreProvider, 1))).addOnFailureListener(new GooglePlayLocationUtils$$ExternalSyntheticLambda18(5));
    }

    public final List<BrazeGeofence> retrieveRegisteredGeofencesFromLocalStorage$android_sdk_location_release(GeofenceDataStoreProvider geofenceDataStoreProvider) {
        ArrayList arrayList;
        geofenceDataStoreProvider.getClass();
        final DataStoreKey dataStoreKey = DataStoreKey.REGISTERED_GEOFENCES;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.location.GooglePlayLocationUtils$retrieveRegisteredGeofencesFromLocalStorage$$inlined$readList$1
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final String invoke() {
                    return ff$$ExternalSyntheticOutline0.m("Key ", dataStoreKey.getKey(), " is not a LIST type. Returning empty list.");
                }
            }, 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object data = geofenceDataStoreProvider.readData(dataStoreKey, "");
                data.getClass();
                final String str = (String) data;
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
                                list = (List) isverticalswipeinalloweddirection.serializer(str, new setWasCloseMessageCalled(pauseWebviewIfNecessarylambda10.IconCompatParcelizer(isverticalswipeinalloweddirection.RemoteActionCompatParcelizer, displayInAppMessagelambda1.IconCompatParcelizer(BrazeGeofence.class)), 0));
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.location.GooglePlayLocationUtils$retrieveRegisteredGeofencesFromLocalStorage$$inlined$readList$2
                                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                                    public final String invoke() {
                                        return ff$$ExternalSyntheticOutline0.m("Failed to parse JSON list: '", str, "'");
                                    }
                                }, 4, (Object) null);
                            }
                        }
                    }
                    arrayList = onContentCardDismissed.IconCompatParcelizer((Collection) list);
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.location.GooglePlayLocationUtils$retrieveRegisteredGeofencesFromLocalStorage$$inlined$readList$3
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final String invoke() {
                        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to read list from DataStore for key: ", dataStoreKey.getKey());
                    }
                }, 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        if (arrayList.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(4), 7, (Object) null);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGooglePlayIfNecessary$lambda$7(List list) {
        return MediaSessionCompatQueueItem.read("Un-registering ", " obsolete geofences from Google Play Services.", list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGooglePlayIfNecessary$lambda$9(List list) {
        return MediaSessionCompatQueueItem.read("Registering ", " new geofences with Google Play Services.", list);
    }

    private final void removeGeofencesFromLocalStorage(List<String> list, GeofenceDataStoreProvider geofenceDataStoreProvider) {
        String strRemoteActionCompatParcelizer;
        ArrayList<BrazeGeofence> arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Collection) retrieveRegisteredGeofencesFromLocalStorage$android_sdk_location_release(geofenceDataStoreProvider));
        ArrayList arrayList = new ArrayList();
        for (BrazeGeofence brazeGeofence : arrayListIconCompatParcelizer) {
            if (!list.contains(brazeGeofence.getId())) {
                arrayList.add(brazeGeofence);
            }
        }
        final DataStoreKey dataStoreKey = DataStoreKey.REGISTERED_GEOFENCES;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.location.GooglePlayLocationUtils$removeGeofencesFromLocalStorage$$inlined$writeList$1
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final String invoke() {
                    return af$$ExternalSyntheticOutline0.m("Key ", dataStoreKey.getKey(), " is not a LIST type. Cannot write key:", dataStoreKey.getKey());
                }
            }, 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(pauseWebviewIfNecessarylambda10.IconCompatParcelizer(isverticalswipeinalloweddirection.RemoteActionCompatParcelizer, displayInAppMessagelambda1.IconCompatParcelizer(BrazeGeofence.class)), 0), arrayList);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.location.GooglePlayLocationUtils$removeGeofencesFromLocalStorage$$inlined$writeList$2
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final String invoke() {
                        return "Failed to serialize data to JSON";
                    }
                }, 4, (Object) null);
                if (arrayList instanceof Map) {
                    strRemoteActionCompatParcelizer = "{}";
                } else {
                    strRemoteActionCompatParcelizer = "[]";
                }
            }
            geofenceDataStoreProvider.writeData(dataStoreKey, strRemoteActionCompatParcelizer);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.location.GooglePlayLocationUtils$removeGeofencesFromLocalStorage$$inlined$writeList$3
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final String invoke() {
                    return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to write list to DataStore for key: ", dataStoreKey.getKey());
                }
            }, 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String storeRegisteredGeofencesToLocalStorage$lambda$0(List list) {
        return MediaSessionCompatQueueItem.read("Writing registered geofences: ", " to local storage.", list);
    }

    public static /* synthetic */ void registerGeofencesWithGooglePlayIfNecessary$default(Context context, List list, PendingIntent pendingIntent, GeofenceDataStoreProvider geofenceDataStoreProvider, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, int i, Object obj) {
        if ((i & 16) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new Navigator$$ExternalSyntheticLambda1(context, 21, geofenceDataStoreProvider);
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        if ((i & 32) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(context, pendingIntent, geofenceDataStoreProvider, 22);
        }
        registerGeofencesWithGooglePlayIfNecessary(context, list, pendingIntent, geofenceDataStoreProvider, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGooglePlayIfNecessary$lambda$6(BrazeGeofence brazeGeofence) {
        return ff$$ExternalSyntheticOutline0.m("Geofence with id: ", brazeGeofence.getId(), " is new or has been updated.");
    }
}
