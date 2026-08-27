package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import com.huawei.location.lite.common.config.ConfigBaseResponse;
import com.huawei.secure.android.common.encrypt.keystore.aes.AesGcmKS;
import io.sentry.HostnameCache$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutNodeSubcompositionsStateScope implements CameraXExternalSyntheticLambda0 {
    public long IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public Object serializer;
    public final /* synthetic */ int write;

    public LayoutNodeSubcompositionsStateScope(LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1, String str, long j) {
        this.write = 0;
        this.serializer = layoutNodeSubcompositionsStatecreateMeasurePolicy1;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = layoutNodeSubcompositionsStatecreateMeasurePolicy1.write("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    public void MediaSessionCompatQueueItem() {
        synchronized (this) {
            WrappedCompositionsetContent1211.read();
            if (System.currentTimeMillis() - this.IconCompatParcelizer < 3600000 && ((AtomicInteger) this.RemoteActionCompatParcelizer).get() >= 3) {
                WrappedCompositionsetContent1211.read();
                return;
            }
            if (((AtomicInteger) this.RemoteActionCompatParcelizer).get() == 3) {
                ((AtomicInteger) this.RemoteActionCompatParcelizer).set(0);
            }
            if (((HashMap) this.serializer) != null) {
                WrappedCompositionsetContent1211.read("ConfigManager", "configCache is init");
                return;
            }
            try {
                String strMediaMetadataCompat = MediaMetadataCompat();
                if (!TextUtils.isEmpty(strMediaMetadataCompat)) {
                    read(strMediaMetadataCompat);
                    RemoteActionCompatParcelizer(new Gson().toJson((HashMap) this.serializer));
                    ((AtomicInteger) this.RemoteActionCompatParcelizer).set(0);
                    this.IconCompatParcelizer = 0L;
                } else if (((AtomicInteger) this.RemoteActionCompatParcelizer).incrementAndGet() == 1) {
                    this.IconCompatParcelizer = System.currentTimeMillis();
                }
            } catch (JSONException unused) {
                WrappedCompositionsetContent1211.read("ConfigManager", "JSONException");
                ((AtomicInteger) this.RemoteActionCompatParcelizer).incrementAndGet();
                if (this.IconCompatParcelizer == 0) {
                    this.IconCompatParcelizer = System.currentTimeMillis();
                }
            } catch (Exception unused2) {
                WrappedCompositionsetContent1211.read("ConfigManager", "requestConfigSync Exception");
                ((AtomicInteger) this.RemoteActionCompatParcelizer).incrementAndGet();
                if (this.IconCompatParcelizer == 0) {
                    this.IconCompatParcelizer = System.currentTimeMillis();
                }
            }
        }
    }

    public ConfigBaseResponse serializer(Class cls, String str) {
        String str2;
        synchronized (this) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ConfigManager", Thread.currentThread().getName() + ",request itemName:" + str);
            MediaDescriptionCompat();
            HashMap map = (HashMap) this.serializer;
            if (map == null) {
                return null;
            }
            String str3 = (String) map.get(str);
            if (TextUtils.isEmpty(str3)) {
                return null;
            }
            try {
                return (ConfigBaseResponse) new Gson().fromJson(str3, cls);
            } catch (JsonSyntaxException unused) {
                str2 = "getConfig failed";
                WrappedCompositionsetContent1211.read("ConfigManager", str2);
                return null;
            } catch (Exception unused2) {
                str2 = "getConfig Exception";
                WrappedCompositionsetContent1211.read("ConfigManager", str2);
                return null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    public static void RemoteActionCompatParcelizer(String str) {
        String strSerializer;
        if (!TextUtils.isEmpty("LOCATION_LITE_SDK") && !TextUtils.isEmpty(str)) {
            try {
                strSerializer = AesGcmKS.serializer("LOCATION_LITE_SDK", str);
            } catch (Exception unused) {
                WrappedCompositionsetContent1211.serializer("AesSecurityCipher", "AesGcmKS encrypt failed");
                strSerializer = "";
            }
            if (TextUtils.isEmpty(strSerializer)) {
                WrappedCompositionsetContent1211.read("ConfigManager", "save config to storage fail");
                return;
            }
            getOrder getorder = new getOrder("com.huawei.hms.location.config");
            getorder.IconCompatParcelizer("KEY_CONFIG_DATA", strSerializer);
            getorder.write("KEY_CACHE_TIME", System.currentTimeMillis());
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ConfigManager", "save config to storage end");
        }
        WrappedCompositionsetContent1211.read("AesSecurityCipher", "encrypt alias or content is null");
        strSerializer = "";
        if (TextUtils.isEmpty(strSerializer)) {
            WrappedCompositionsetContent1211.read("ConfigManager", "save config to storage fail");
            return;
        }
        getOrder getorder2 = new getOrder("com.huawei.hms.location.config");
        getorder2.IconCompatParcelizer("KEY_CONFIG_DATA", strSerializer);
        getorder2.write("KEY_CACHE_TIME", System.currentTimeMillis());
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ConfigManager", "save config to storage end");
    }

    @Override // o.CameraXExternalSyntheticLambda0
    public OnePixelShiftQuirk MediaBrowserCompatMediaItem() {
        return (OnePixelShiftQuirk) this.serializer;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0112  */
    public List PlaybackStateCompat() throws Throwable {
        Cursor cursor;
        Cursor cursorQuery;
        List list;
        List list2;
        LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1 = (LayoutNodeSubcompositionsStatecreateMeasurePolicy1) this.serializer;
        ArrayList arrayList = new ArrayList();
        String str = (String) this.RemoteActionCompatParcelizer;
        try {
            int i = 3;
            cursorQuery = layoutNodeSubcompositionsStatecreateMeasurePolicy1.ResultReceiver().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", RemoteMessageConst.DATA, "realtime"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.IconCompatParcelizer)}, null, null, "rowid", "1000");
            try {
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(i);
                        boolean z = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.IconCompatParcelizer) {
                            this.IconCompatParcelizer = j;
                        }
                        try {
                            getTvSatelliteBsEK5gGoQ gettvsatellitebsek5ggoq = (getTvSatelliteBsEK5gGoQ) zzgz.write(getTvTerrestrialDigitalEK5gGoQ.read(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            gettvsatellitebsek5ggoq.ParcelableVolumeInfo();
                            ((getTvTerrestrialDigitalEK5gGoQ) gettvsatellitebsek5ggoq.IconCompatParcelizer).IconCompatParcelizer(string);
                            long j3 = cursorQuery.getLong(2);
                            gettvsatellitebsek5ggoq.ParcelableVolumeInfo();
                            ((getTvTerrestrialDigitalEK5gGoQ) gettvsatellitebsek5ggoq.IconCompatParcelizer).IconCompatParcelizer(j3);
                            arrayList.add(new setSlotId(j, j2, z, (getTvTerrestrialDigitalEK5gGoQ) gettvsatellitebsek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
                        } catch (IOException e) {
                            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            getlookaheaddelegate.serializer.serializer("Data loss. Failed to merge raw event. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
                        }
                        if (!cursorQuery.moveToNext()) {
                            break;
                        }
                        i = 3;
                    }
                    list = arrayList;
                } else {
                    list2 = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursor = cursorQuery;
                try {
                    getLookaheadDelegate getlookaheaddelegate2 = ((LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                    getlookaheaddelegate2.serializer.serializer("Data loss. Error querying raw events batch. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
                    cursorQuery = cursor;
                    list = arrayList;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursorQuery != null) {
            list = list2;
            cursorQuery.close();
        }
        list = list2;
        return list;
    }

    @Override // o.CameraXExternalSyntheticLambda0
    public long RatingCompat() {
        CameraXExternalSyntheticLambda0 cameraXExternalSyntheticLambda0 = (CameraXExternalSyntheticLambda0) this.RemoteActionCompatParcelizer;
        if (cameraXExternalSyntheticLambda0 != null) {
            return cameraXExternalSyntheticLambda0.RatingCompat();
        }
        long j = this.IconCompatParcelizer;
        if (j != -1) {
            return j;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("No timestamp is available.");
        return 0L;
    }

    @Override // o.CameraXExternalSyntheticLambda0
    public CaptureRequestOptionsBuilderExternalSyntheticLambda0 read() {
        CameraXExternalSyntheticLambda0 cameraXExternalSyntheticLambda0 = (CameraXExternalSyntheticLambda0) this.RemoteActionCompatParcelizer;
        return cameraXExternalSyntheticLambda0 != null ? cameraXExternalSyntheticLambda0.read() : CaptureRequestOptionsBuilderExternalSyntheticLambda0.UNKNOWN;
    }

    @Override // o.CameraXExternalSyntheticLambda0
    public Camera2CameraControlExternalSyntheticLambda1 serializer() {
        CameraXExternalSyntheticLambda0 cameraXExternalSyntheticLambda0 = (CameraXExternalSyntheticLambda0) this.RemoteActionCompatParcelizer;
        return cameraXExternalSyntheticLambda0 != null ? cameraXExternalSyntheticLambda0.serializer() : Camera2CameraControlExternalSyntheticLambda1.UNKNOWN;
    }

    @Override // o.CameraXExternalSyntheticLambda0
    public ZslDisablerQuirk u_() {
        CameraXExternalSyntheticLambda0 cameraXExternalSyntheticLambda0 = (CameraXExternalSyntheticLambda0) this.RemoteActionCompatParcelizer;
        return cameraXExternalSyntheticLambda0 != null ? cameraXExternalSyntheticLambda0.u_() : ZslDisablerQuirk.UNKNOWN;
    }

    @Override // o.CameraXExternalSyntheticLambda0
    public TorchIsClosedAfterImageCapturingQuirk write() {
        CameraXExternalSyntheticLambda0 cameraXExternalSyntheticLambda0 = (CameraXExternalSyntheticLambda0) this.RemoteActionCompatParcelizer;
        return cameraXExternalSyntheticLambda0 != null ? cameraXExternalSyntheticLambda0.write() : TorchIsClosedAfterImageCapturingQuirk.UNKNOWN;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void MediaDescriptionCompat() {
        String str;
        String str2;
        String str3;
        getOrder getorder = new getOrder("com.huawei.hms.location.config");
        long jWrite = getorder.write("KEY_CACHE_TIME");
        if (jWrite != -1 && System.currentTimeMillis() <= jWrite + CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL) {
            if (((HashMap) this.serializer) == null) {
                String strRemoteActionCompatParcelizer = getorder.RemoteActionCompatParcelizer("KEY_CONFIG_DATA");
                if (TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
                    str3 = "load cache config empty";
                } else {
                    if (TextUtils.isEmpty("LOCATION_LITE_SDK") || TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
                        WrappedCompositionsetContent1211.read("AesSecurityCipher", "decrypt alias or content is null");
                    } else {
                        try {
                            str = AesGcmKS.read("LOCATION_LITE_SDK", strRemoteActionCompatParcelizer);
                        } catch (Exception unused) {
                            WrappedCompositionsetContent1211.serializer("AesSecurityCipher", "AesGcmKS decrypt failed");
                            str = "";
                        }
                        if (TextUtils.isEmpty(str)) {
                            str3 = "load config decrypt failed";
                        } else {
                            try {
                                this.serializer = (HashMap) new Gson().fromJson(str, HashMap.class);
                            } catch (JsonSyntaxException unused2) {
                                str2 = "load config jsonSyntax failed";
                                WrappedCompositionsetContent1211.read("ConfigManager", str2);
                            } catch (Exception unused3) {
                                str2 = "load config Exception";
                                WrappedCompositionsetContent1211.read("ConfigManager", str2);
                            }
                        }
                    }
                    str = "";
                    if (TextUtils.isEmpty(str)) {
                        str3 = "load config decrypt failed";
                    } else {
                        this.serializer = (HashMap) new Gson().fromJson(str, HashMap.class);
                    }
                }
                WrappedCompositionsetContent1211.read("ConfigManager", str3);
            }
            if (((HashMap) this.serializer) == null) {
                WrappedCompositionsetContent1211.read("ConfigManager", "load cache config fail ,reload config from network");
                MediaSessionCompatQueueItem();
                return;
            }
            return;
        }
        this.serializer = null;
        MediaSessionCompatQueueItem();
    }

    public void read(String str) throws JSONException {
        String str2;
        JSONArray jSONArray = new JSONArray(str);
        this.serializer = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                accessgetAddedToLifecyclep accessgetaddedtolifecyclep = (accessgetAddedToLifecyclep) new Gson().fromJson(jSONArray.getString(i), accessgetAddedToLifecyclep.class);
                ((HashMap) this.serializer).put(accessgetaddedtolifecyclep.write(), accessgetaddedtolifecyclep.serializer());
            } catch (JsonSyntaxException unused) {
                str2 = "jsonArray2Map failed";
                WrappedCompositionsetContent1211.read("ConfigManager", str2);
            } catch (Exception unused2) {
                str2 = "jsonArray2Map Exception";
                WrappedCompositionsetContent1211.read("ConfigManager", str2);
            }
        }
    }

    public String toString() {
        if (this.write != 3) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder("ResponseBodyAdapter{contentType='");
        sb.append((String) this.RemoteActionCompatParcelizer);
        sb.append("', contentLength=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", responseByte=");
        return ff$$ExternalSyntheticOutline0.m(sb, new String((byte[]) this.serializer, StandardCharsets.UTF_8), '}');
    }

    public static String MediaMetadataCompat() {
        String str;
        FutureTask futureTask = new FutureTask(new HostnameCache$$ExternalSyntheticLambda0(1));
        onCreateActionMode.write.getClass();
        com.huawei.agconnect.config.impl.m.IconCompatParcelizer(futureTask);
        try {
            return (String) futureTask.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            str = "task get response failed by interrupt";
            WrappedCompositionsetContent1211.read("ConfigManager", str);
            return null;
        } catch (ExecutionException unused2) {
            str = "task get response failed by execution";
            WrappedCompositionsetContent1211.read("ConfigManager", str);
            return null;
        } catch (TimeoutException unused3) {
            futureTask.cancel(true);
            str = "task get response failed by timeOut";
            WrappedCompositionsetContent1211.read("ConfigManager", str);
            return null;
        }
    }

    public LayoutNodeSubcompositionsStateScope(LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1, String str) {
        this.write = 0;
        this.serializer = layoutNodeSubcompositionsStatecreateMeasurePolicy1;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = -1L;
    }

    public LayoutNodeSubcompositionsStateScope(CameraXExternalSyntheticLambda0 cameraXExternalSyntheticLambda0, OnePixelShiftQuirk onePixelShiftQuirk, long j) {
        this.write = 1;
        this.RemoteActionCompatParcelizer = cameraXExternalSyntheticLambda0;
        this.serializer = onePixelShiftQuirk;
        this.IconCompatParcelizer = j;
    }

    public String write(String str) {
        synchronized (this) {
            MediaDescriptionCompat();
            HashMap map = (HashMap) this.serializer;
            String strValueOf = null;
            if (map == null) {
                return null;
            }
            String str2 = (String) map.get("location");
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            try {
                strValueOf = String.valueOf(new JSONObject(str2).get(str));
            } catch (JSONException | Exception unused) {
                WrappedCompositionsetContent1211.read();
            }
            WrappedCompositionsetContent1211.read();
            return strValueOf;
        }
    }
}
