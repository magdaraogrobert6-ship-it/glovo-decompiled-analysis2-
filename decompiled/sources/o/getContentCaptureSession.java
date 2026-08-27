package o;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.huawei.location.logic.E5;
import com.huawei.secure.android.common.intent.SafeIntent;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getContentCaptureSession extends readAnimationScale {
    public final /* synthetic */ int read;
    public final /* synthetic */ Object write;

    public /* synthetic */ getContentCaptureSession(int i, Object obj) {
        this.read = i;
        this.write = obj;
    }

    @Override // o.readAnimationScale
    public final void IconCompatParcelizer(Intent intent) {
        String str;
        String str2;
        int i = this.read;
        Object obj = this.write;
        if (i != 0) {
            if (TextUtils.equals(new SafeIntent(intent).getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
                E5 e5 = (E5) obj;
                if (e5.read) {
                    e5.read = false;
                    return;
                } else {
                    E5.write();
                    return;
                }
            }
            return;
        }
        E5 e6 = (E5) obj;
        if (e6.read) {
            return;
        }
        if (((newViewStructure) e6.RemoteActionCompatParcelizer) == null) {
            str = "onReceiveWifi, wifiScanLister is null";
        } else {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action) && "android.net.wifi.SCAN_RESULTS".equals(action)) {
                e6.read = true;
                WifiManager wifiManager = (WifiManager) e6.IconCompatParcelizer;
                if (wifiManager == null) {
                    str2 = "onReceiveWifi, WiFiManager is null";
                } else {
                    try {
                        List<ScanResult> scanResults = wifiManager.getScanResults();
                        if (!scanResults.isEmpty()) {
                            ((newViewStructure) e6.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(scanResults);
                            return;
                        }
                        str2 = "onReceiveWifi, wifi scan result is null";
                    } catch (Exception unused) {
                        str2 = "onReceiveWifi, remoteException";
                    }
                }
                WrappedCompositionsetContent1211.read("WifiScanManager", str2);
                newViewStructure newviewstructure = (newViewStructure) e6.RemoteActionCompatParcelizer;
                ContentCaptureSessionCompat.IconCompatParcelizer(10000);
                newviewstructure.MediaBrowserCompatMediaItem();
                return;
            }
            str = "onReceiveWifi, action is invalid";
        }
        WrappedCompositionsetContent1211.read("WifiScanManager", str);
    }

    @Override // o.readAnimationScale
    public String write() {
        return this.read != 1 ? super.write() : "Loc-Receive-Network";
    }

    @Override // o.readAnimationScale, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
