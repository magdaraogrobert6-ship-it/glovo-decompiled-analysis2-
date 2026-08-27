package com.huawei.location.callback;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.gson.Gson;
import com.huawei.hms.location.HwLocationResult;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesRequest;
import com.huawei.location.lite.common.adapter.LocationProxyAdapter;
import com.huawei.location.lite.common.report.ReportBuilder;
import com.huawei.location.logic.zp;
import com.huawei.location.resp.LocationAvailabilityInfo;
import com.huawei.location.resp.ResponseInfo;
import com.huawei.location.resp.Vw;
import com.huawei.location.resp.yn;
import com.huawei.location.router.RouterResponse;
import com.huawei.location.router.entity.StatusInfo;
import com.huawei.location.utils.FB$yn;
import com.huawei.riemann.location.common.utils.Constant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import o.CollectionInfo_androidKttoAccessibilityCollectionItemInfo1;
import o.SweepGradientShader9KIMszodefault;
import o.WindowRecomposerFactory;
import o.WrappedCompositionsetContent1211;
import o.compareAndSetFactory;
import o.createAndInstallWindowRecomposerui;
import o.getClipEntry;
import o.getGlobalKeyboardModifiersui;
import o.getOnCutRequested;
import o.setOnSelectAllRequested;
import o.stringArrayResource;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d2 implements LocationListener {
    public Location MediaBrowserCompatMediaItem;
    public createAndInstallWindowRecomposerui MediaDescriptionCompat;
    public RequestLocationUpdatesRequest MediaSessionCompatQueueItem;
    public FB$yn RatingCompat;
    public final Handler serializer;
    public long IconCompatParcelizer = SystemClock.elapsedRealtimeNanos();
    public boolean MediaMetadataCompat = false;

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public void read() {
    }

    public abstract void serializer(Bundle bundle);

    public abstract void serializer(boolean z, boolean z2);

    /* JADX WARN: Code duplicated, block: B:101:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x010c  */
    /* JADX WARN: Code duplicated, block: B:42:0x011f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0134  */
    /* JADX WARN: Code duplicated, block: B:49:0x013b  */
    /* JADX WARN: Code duplicated, block: B:52:0x014a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0181  */
    /* JADX WARN: Code duplicated, block: B:58:0x0188  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:69:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void serializer(HwLocationResult hwLocationResult) {
        String str;
        FB$yn fB$yn;
        ReportBuilder reportBuilder;
        ArrayList<Location> arrayList;
        Iterator it;
        ArrayList arrayList2;
        HashMap map;
        int i;
        Bundle extras;
        getClipEntry getclipentry;
        boolean z;
        Bundle extras2;
        int i2;
        Location location;
        ResponseInfo responseInfo = new ResponseInfo();
        StatusInfo statusInfo = new StatusInfo(0, 0, hwLocationResult.getMessage());
        Vw vw = new Vw();
        ArrayList arrayList3 = new ArrayList();
        vw.RemoteActionCompatParcelizer = arrayList3;
        Location location2 = this.MediaBrowserCompatMediaItem;
        if (location2 != null) {
            yn ynVar = new yn();
            ynVar.IconCompatParcelizer = location2;
            arrayList3.add(ynVar);
        }
        responseInfo.setLocationResult(vw);
        ArrayList arrayList4 = new ArrayList();
        if (responseInfo.getLocationResult() != null) {
            arrayList4 = responseInfo.getLocationResult().RemoteActionCompatParcelizer;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                jSONArray.put(stringArrayResource.serializer(((yn) it2.next()).IconCompatParcelizer));
            }
            jSONObject2.put("locations", jSONArray);
            jSONObject.put("locationResult", jSONObject2);
        } catch (JSONException unused) {
            WrappedCompositionsetContent1211.read("LocationInnerUtil", "buildEntityFromResponse get jsonException .");
        }
        String string = jSONObject.toString();
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwBaseCallback", "callJson to cp, tid is " + this.MediaSessionCompatQueueItem.getTid() + ", uuid is " + this.MediaSessionCompatQueueItem.getUuid() + ", provider is " + this.MediaBrowserCompatMediaItem.getProvider());
        this.MediaDescriptionCompat.IconCompatParcelizer(new RouterResponse(string, statusInfo));
        WindowRecomposerFactory windowRecomposerFactory = WindowRecomposerFactory.read();
        String uuid = this.MediaSessionCompatQueueItem.getUuid();
        ConcurrentHashMap concurrentHashMap = windowRecomposerFactory.read;
        if (TextUtils.isEmpty(uuid)) {
            str = "updateNumUpdate fail, uuid is null";
        } else if (concurrentHashMap.containsKey(uuid)) {
            getGlobalKeyboardModifiersui getglobalkeyboardmodifiersui = (getGlobalKeyboardModifiersui) concurrentHashMap.get(uuid);
            if (getglobalkeyboardmodifiersui == null) {
                str = "updateNumUpdate fail, wrapLocationRequest is null";
            } else {
                RequestLocationUpdatesRequest requestLocationUpdatesRequest = getglobalkeyboardmodifiersui.write;
                if (requestLocationUpdatesRequest == null) {
                    str = "updateNumUpdate fail, requestLocationUpdatesRequest is null";
                } else {
                    LocationRequest locationRequest = requestLocationUpdatesRequest.getLocationRequest();
                    if (locationRequest != null) {
                        int numUpdates = locationRequest.getNumUpdates();
                        if (numUpdates <= 1) {
                            str = "updateNumUpdate fail, numUpdate <= 1";
                        } else {
                            locationRequest.setNumUpdates(numUpdates - 1);
                        }
                        fB$yn = this.RatingCompat;
                        if (fB$yn != null) {
                            reportBuilder = fB$yn.IconCompatParcelizer;
                            arrayList = new ArrayList();
                            it = vw.RemoteActionCompatParcelizer.iterator();
                            while (it.hasNext()) {
                                location = ((yn) it.next()).IconCompatParcelizer;
                                if (location == null) {
                                    arrayList.add(location);
                                }
                            }
                            if (arrayList.size() == 0) {
                                reportBuilder.setExt("");
                            } else {
                                arrayList2 = new ArrayList();
                                for (Location location3 : arrayList) {
                                    map = new HashMap();
                                    map.put("provider", location3.getProvider());
                                    map.put("accuracy", Float.valueOf(location3.getAccuracy()));
                                    map.put("locationTime", Long.valueOf(location3.getTime()));
                                    if (location3.getExtras() != null) {
                                        extras2 = location3.getExtras();
                                        if (extras2 == null) {
                                            extras2 = new Bundle();
                                        }
                                        try {
                                            i2 = extras2.getInt(Constant.LOCATION_SOURCE_TYPE, 0);
                                        } catch (Throwable th) {
                                            SweepGradientShader9KIMszodefault.write("SafeBundle", new StringBuilder("getInt exception: "), th);
                                            i2 = 0;
                                        }
                                        if ((i2 & 8) == 8) {
                                            i = 1;
                                        } else {
                                            i = 0;
                                        }
                                    } else {
                                        i = 0;
                                    }
                                    map.put("locationType", Integer.valueOf(i));
                                    extras = location3.getExtras();
                                    getclipentry = new getClipEntry(extras, 1);
                                    if (extras == null) {
                                        if (getclipentry.IconCompatParcelizer("session_id")) {
                                            map.put("session_id", getclipentry.RatingCompat("session_id"));
                                        }
                                        if (getclipentry.IconCompatParcelizer("vendorType")) {
                                            map.put("vendorType", Integer.valueOf(getclipentry.write("vendorType", 0)));
                                        }
                                        if (getclipentry.IconCompatParcelizer("locateType")) {
                                            map.put("locateType", getclipentry.RatingCompat("locateType"));
                                        }
                                        if (getclipentry.IconCompatParcelizer("isCache")) {
                                            try {
                                                z = getclipentry.serializer.getBoolean("isCache", false);
                                            } catch (Throwable th2) {
                                                SweepGradientShader9KIMszodefault.write("SafeBundle", new StringBuilder("getBoolean exception : "), th2);
                                                z = false;
                                            }
                                            map.put("isCache", Boolean.valueOf(z));
                                        }
                                    }
                                    arrayList2.add(map);
                                }
                                try {
                                    reportBuilder.setExt(new Gson().toJson(arrayList2));
                                } catch (Exception unused2) {
                                    WrappedCompositionsetContent1211.read("LocationClientReport", "GsonUtil.getInstance().toJson(list) exception");
                                }
                            }
                            ReportBuilder reportBuilder2 = this.RatingCompat.read().write;
                            reportBuilder2.setResult(String.valueOf(0));
                            reportBuilder2.setCostTime();
                            CollectionInfo_androidKttoAccessibilityCollectionItemInfo1.write().read(reportBuilder2);
                            CollectionInfo_androidKttoAccessibilityCollectionItemInfo1.write().IconCompatParcelizer(reportBuilder2);
                            reportBuilder2.setCallTime();
                        }
                    }
                    str = "updateNumUpdate fail, locationRequest is null";
                }
            }
        } else {
            str = "updateNumUpdate fail, requestCache is not contains";
        }
        WrappedCompositionsetContent1211.read("RequestRecordCache", str);
        fB$yn = this.RatingCompat;
        if (fB$yn != null) {
            reportBuilder = fB$yn.IconCompatParcelizer;
            arrayList = new ArrayList();
            it = vw.RemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                location = ((yn) it.next()).IconCompatParcelizer;
                if (location == null) {
                    arrayList.add(location);
                }
            }
            if (arrayList.size() == 0) {
                reportBuilder.setExt("");
            } else {
                arrayList2 = new ArrayList();
                while (r1.hasNext()) {
                    map = new HashMap();
                    map.put("provider", location3.getProvider());
                    map.put("accuracy", Float.valueOf(location3.getAccuracy()));
                    map.put("locationTime", Long.valueOf(location3.getTime()));
                    if (location3.getExtras() != null) {
                        extras2 = location3.getExtras();
                        if (extras2 == null) {
                            extras2 = new Bundle();
                        }
                        i2 = extras2.getInt(Constant.LOCATION_SOURCE_TYPE, 0);
                        if ((i2 & 8) == 8) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                    } else {
                        i = 0;
                    }
                    map.put("locationType", Integer.valueOf(i));
                    extras = location3.getExtras();
                    getclipentry = new getClipEntry(extras, 1);
                    if (extras == null) {
                        if (getclipentry.IconCompatParcelizer("session_id")) {
                            map.put("session_id", getclipentry.RatingCompat("session_id"));
                        }
                        if (getclipentry.IconCompatParcelizer("vendorType")) {
                            map.put("vendorType", Integer.valueOf(getclipentry.write("vendorType", 0)));
                        }
                        if (getclipentry.IconCompatParcelizer("locateType")) {
                            map.put("locateType", getclipentry.RatingCompat("locateType"));
                        }
                        if (getclipentry.IconCompatParcelizer("isCache")) {
                            z = getclipentry.serializer.getBoolean("isCache", false);
                            map.put("isCache", Boolean.valueOf(z));
                        }
                    }
                    arrayList2.add(map);
                }
                reportBuilder.setExt(new Gson().toJson(arrayList2));
            }
            ReportBuilder reportBuilder3 = this.RatingCompat.read().write;
            reportBuilder3.setResult(String.valueOf(0));
            reportBuilder3.setCostTime();
            CollectionInfo_androidKttoAccessibilityCollectionItemInfo1.write().read(reportBuilder3);
            CollectionInfo_androidKttoAccessibilityCollectionItemInfo1.write().IconCompatParcelizer(reportBuilder3);
            reportBuilder3.setCallTime();
        }
    }

    public void write(HwLocationResult hwLocationResult) {
        Handler handler = this.serializer;
        Message messageObtainMessage = handler.obtainMessage(1001);
        Bundle bundle = new Bundle();
        bundle.putParcelable("hwLocationResult", hwLocationResult);
        messageObtainMessage.setData(bundle);
        handler.sendMessage(messageObtainMessage);
    }

    public d2() {
        HandlerThread handlerThread = new HandlerThread("HwBaseCallback");
        handlerThread.start();
        this.serializer = new Handler(handlerThread.getLooper(), new compareAndSetFactory(0, this));
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwBaseCallback", "gnss location successful, location proxy status: " + LocationProxyAdapter.isLocationProxyEnable());
        if (location != null && "gps".equals(location.getProvider()) && LocationProxyAdapter.isLocationProxyEnable()) {
            return;
        }
        HwLocationResult hwLocationResult = new HwLocationResult();
        hwLocationResult.setLocation(location);
        write(hwLocationResult);
    }

    public final boolean RemoteActionCompatParcelizer(HwLocationResult hwLocationResult) {
        String str;
        if (hwLocationResult != null && hwLocationResult.getCode() == 0) {
            if (hwLocationResult.getLocation() == null) {
                str = "checkLocationResult fail, location is null";
            } else {
                RequestLocationUpdatesRequest requestLocationUpdatesRequest = this.MediaSessionCompatQueueItem;
                if (requestLocationUpdatesRequest != null && !TextUtils.isEmpty(requestLocationUpdatesRequest.getUuid())) {
                    return false;
                }
                str = "checkLocationResult fail, request is invalid";
            }
        } else {
            str = "checkLocationResult fail, hwLocationResult is invalid";
        }
        WrappedCompositionsetContent1211.read("HwBaseCallback", str);
        return true;
    }

    public final void read(HwLocationResult hwLocationResult) {
        String str;
        if (stringArrayResource.IconCompatParcelizer()) {
            WrappedCompositionsetContent1211.read("HwBaseCallback", "no precise location permission");
            return;
        }
        Location location = this.MediaBrowserCompatMediaItem;
        if (this.MediaMetadataCompat && location != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(location);
            zp zpVar = setOnSelectAllRequested.serializer;
            String tid = this.MediaSessionCompatQueueItem.getTid();
            Handler handler = (Handler) zpVar.IconCompatParcelizer;
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("MaxWaitTimeManager", "updateLocations start transactionID:" + tid);
            if (((ConcurrentHashMap) zpVar.serializer).size() == 0) {
                str = "map is null , no need update";
            } else if (arrayList.isEmpty()) {
                str = "updateLocations failed , locations is null";
            } else {
                if (((ConcurrentHashMap) zpVar.serializer).containsKey(this)) {
                    Message messageObtainMessage = handler.obtainMessage(2147483636);
                    messageObtainMessage.obj = this;
                    getOnCutRequested getoncutrequested = new getOnCutRequested(tid, -1, -1L, arrayList);
                    Bundle bundle = new Bundle();
                    try {
                        bundle.putSerializable("TAG_BEAN", getoncutrequested);
                    } catch (Throwable th) {
                        SweepGradientShader9KIMszodefault.write("SafeBundle", new StringBuilder("putSerializable exception: "), th);
                    }
                    messageObtainMessage.setData(bundle);
                    handler.sendMessage(messageObtainMessage);
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("MaxWaitTimeManager", "updateLocations send msg");
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwBaseCallback", "this locationResult add maxWaitTimeQueue , not need callback");
                    if (this.MediaBrowserCompatMediaItem != null) {
                        this.IconCompatParcelizer = SystemClock.elapsedRealtimeNanos();
                    }
                    this.MediaBrowserCompatMediaItem = location;
                    WindowRecomposerFactory.read().serializer = location;
                    return;
                }
                WrappedCompositionsetContent1211.read("MaxWaitTimeManager", "updateLocations failed , not contains id");
            }
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("MaxWaitTimeManager", str);
        }
        Location location2 = hwLocationResult.getLocation();
        if (this.MediaBrowserCompatMediaItem != null) {
            this.IconCompatParcelizer = SystemClock.elapsedRealtimeNanos();
        }
        this.MediaBrowserCompatMediaItem = location2;
        WindowRecomposerFactory.read().serializer = location2;
        serializer(hwLocationResult);
    }

    public final void read(boolean z) {
        ResponseInfo responseInfo = new ResponseInfo();
        LocationAvailabilityInfo locationAvailabilityInfo = new LocationAvailabilityInfo();
        locationAvailabilityInfo.setLocationStatus(z ? 0 : 1001);
        responseInfo.setLocationAvailability(locationAvailabilityInfo);
        this.MediaDescriptionCompat.IconCompatParcelizer(new RouterResponse(new Gson().toJson(responseInfo), new StatusInfo(0, 0, "success")));
    }

    public final void read(Location location) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwBaseCallback", "onProxyLocationChanged, location proxy status: " + LocationProxyAdapter.isLocationProxyEnable());
        HwLocationResult hwLocationResult = new HwLocationResult();
        hwLocationResult.setLocation(location);
        write(hwLocationResult);
    }

    public final boolean write(Location location) {
        LocationRequest locationRequest = this.MediaSessionCompatQueueItem.getLocationRequest();
        if (locationRequest == null) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwBaseCallback", "report location fail, locationRequest is null");
            return false;
        }
        if (this.MediaBrowserCompatMediaItem == null) {
            return true;
        }
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.IconCompatParcelizer) / 1000000;
        double dMin = Math.min(locationRequest.getInterval(), locationRequest.getFastestInterval());
        double d = 0.9d * dMin;
        if (dMin >= 2000.0d) {
            d = dMin - 1000.0d;
        }
        if (jElapsedRealtimeNanos < d) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(jElapsedRealtimeNanos, "report location fail, timeDifference is ", ", provider is ");
            sbM.append(location.getProvider());
            WrappedCompositionsetContent1211.read("HwBaseCallback", sbM.toString());
            return false;
        }
        if (locationRequest.getNumUpdates() < 1) {
            WrappedCompositionsetContent1211.read("HwBaseCallback", "report location fail, numUpdate < 1");
            return false;
        }
        double smallestDisplacement = locationRequest.getSmallestDisplacement();
        if (smallestDisplacement > 0.0d && location.distanceTo(this.MediaBrowserCompatMediaItem) <= smallestDisplacement) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwBaseCallback", "report location fail, minDistance is not met");
            return false;
        }
        if (locationRequest.getExpirationTime() >= SystemClock.elapsedRealtime()) {
            return true;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwBaseCallback", "report location fail, expirationTime is not met");
        return false;
    }
}
