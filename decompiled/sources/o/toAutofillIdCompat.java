package o;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import com.huawei.location.lite.common.agc.AGCManager;
import com.huawei.location.lite.common.util.NetworkUtil;
import com.huawei.location.lite.common.util.SystemPropertiesUtil;
import com.huawei.location.logic.E5;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class toAutofillIdCompat extends Handler {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public toAutofillIdCompat(androidx.preference.PreferenceFragment preferenceFragment) {
        this.RemoteActionCompatParcelizer = 2;
        this.IconCompatParcelizer = preferenceFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ toAutofillIdCompat(Object obj, Looper looper, int i) {
        super(looper);
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        accessgetGreencp[] accessgetgreencpArr;
        String str;
        String str2;
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                WindowInfoImplCompanion.serializer(message.what, "NLPClient", new StringBuilder("msg.what="));
                if (message.what != 0) {
                    return;
                }
                setOnCopyRequested.IconCompatParcelizer((setOnCopyRequested) this.IconCompatParcelizer, true);
                return;
            case 1:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                makeNativePaint makenativepaint = (makeNativePaint) this.IconCompatParcelizer;
                while (true) {
                    synchronized (makenativepaint.MediaDescriptionCompat) {
                        size = makenativepaint.MediaMetadataCompat.size();
                        if (size <= 0) {
                            return;
                        }
                        accessgetgreencpArr = new accessgetGreencp[size];
                        makenativepaint.MediaMetadataCompat.toArray(accessgetgreencpArr);
                        makenativepaint.MediaMetadataCompat.clear();
                    }
                    for (int i = 0; i < size; i++) {
                        accessgetGreencp accessgetgreencp = accessgetgreencpArr[i];
                        int size2 = ((ArrayList) accessgetgreencp.write).size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            setNativeAlpha setnativealpha = (setNativeAlpha) ((ArrayList) accessgetgreencp.write).get(i2);
                            if (!setnativealpha.write) {
                                setnativealpha.IconCompatParcelizer.onReceive(makenativepaint.RemoteActionCompatParcelizer, (Intent) accessgetgreencp.IconCompatParcelizer);
                            }
                        }
                    }
                }
                break;
            case 2:
                if (message.what != 1) {
                    return;
                }
                ((androidx.preference.PreferenceFragment) this.IconCompatParcelizer).read();
                return;
            case 3:
                int i3 = message.what;
                if (i3 == 101) {
                    if (((readAnimationScale) this.IconCompatParcelizer).serializer != null) {
                        ((readAnimationScale) this.IconCompatParcelizer).serializer.quitSafely();
                        ((readAnimationScale) this.IconCompatParcelizer).serializer = null;
                        return;
                    }
                    return;
                }
                if (i3 != 102) {
                    return;
                }
                ((readAnimationScale) this.IconCompatParcelizer).IconCompatParcelizer((Intent) message.obj);
                removeMessages(101);
                sendEmptyMessageDelayed(101, ((readAnimationScale) this.IconCompatParcelizer).RemoteActionCompatParcelizer() > 0 ? ((readAnimationScale) this.IconCompatParcelizer).RemoteActionCompatParcelizer() : 0L);
                return;
            case 4:
                super.handleMessage(message);
                int i4 = message.what;
                if (i4 == 1) {
                    WrappedCompositionsetContent1211.read();
                    CollectionInfo_androidKttoAccessibilityCollectionItemInfo1.read();
                    ((CollectionInfo_androidKttoAccessibilityCollectionItemInfo1) this.IconCompatParcelizer).RatingCompat = false;
                    return;
                }
                if (i4 != 2) {
                    return;
                }
                CollectionInfo_androidKttoAccessibilityCollectionItemInfo1 collectionInfo_androidKttoAccessibilityCollectionItemInfo1 = (CollectionInfo_androidKttoAccessibilityCollectionItemInfo1) this.IconCompatParcelizer;
                AtomicBoolean atomicBoolean = collectionInfo_androidKttoAccessibilityCollectionItemInfo1.write;
                if (atomicBoolean.get()) {
                    return;
                }
                String[] strArr = onActionItemClicked.RemoteActionCompatParcelizer;
                if (TextUtils.equals(SystemPropertiesUtil.get("ro.vendor.market.type", ""), "KidWatch")) {
                    WrappedCompositionsetContent1211.write("LocationTracker", "not support device,not init");
                    atomicBoolean.set(true);
                    return;
                }
                String strRemoteActionCompatParcelizer = onChange.RemoteActionCompatParcelizer(GrsApp.getInstance().getIssueCountryCode(placeAtf8xVGno.read()), "HIANALYTICROUTE", "ROOT");
                WrappedCompositionsetContent1211.read();
                if (TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationTracker", "initHiAnalytics  hiAnalyticsUrl is empty.");
                    atomicBoolean.set(false);
                    return;
                }
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationTracker", "initHiAnalytics begin.");
                AGCManager.read().getClass();
                HmsHiAnalyticsUtils.init(placeAtf8xVGno.read(), false, false, false, strRemoteActionCompatParcelizer, AGCManager.serializer());
                if (HmsHiAnalyticsUtils.getInitFlag()) {
                    atomicBoolean.set(true);
                }
                collectionInfo_androidKttoAccessibilityCollectionItemInfo1.write(collectionInfo_androidKttoAccessibilityCollectionItemInfo1.serializer);
                collectionInfo_androidKttoAccessibilityCollectionItemInfo1.write(collectionInfo_androidKttoAccessibilityCollectionItemInfo1.read);
                return;
            case 5:
                toAutofillId toautofillid = (toAutofillId) this.IconCompatParcelizer;
                WindowInfoImplCompanion.serializer(message.what, "WifiAndCell", new StringBuilder("msg.what="));
                int i5 = message.what;
                if (i5 == -1) {
                    toautofillid.MediaSessionCompatQueueItem = false;
                    if (updateMenuItemsui.read().serializer() || updateMenuItemsui.read().RemoteActionCompatParcelizer()) {
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("WifiAndCell", "handlerTimeout onScanResult");
                        toautofillid.PlaybackStateCompatCustomAction.MediaBrowserCompatMediaItem();
                        return;
                    }
                    return;
                }
                if (i5 == 0) {
                    if (toAutofillId.read(toautofillid)) {
                        toautofillid.write.removeMessages(0);
                        toautofillid.write.sendEmptyMessageDelayed(0, 30000L);
                        boolean zRemoteActionCompatParcelizer = updateMenuItemsui.read().RemoteActionCompatParcelizer();
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("WifiAndCell", "isFirstScanWifi = " + toautofillid.MediaSessionCompatQueueItem + ",isWifiCacheValid = " + zRemoteActionCompatParcelizer);
                        if (toautofillid.MediaSessionCompatQueueItem && zRemoteActionCompatParcelizer) {
                            toautofillid.MediaSessionCompatQueueItem = false;
                            return;
                        } else {
                            toautofillid.IconCompatParcelizer.RemoteActionCompatParcelizer(toautofillid.MediaDescriptionCompat);
                            return;
                        }
                    }
                    return;
                }
                if (i5 == 1 && toAutofillId.read(toautofillid)) {
                    toautofillid.write.removeMessages(1);
                    toautofillid.write.sendEmptyMessageDelayed(1, toautofillid.RatingCompat);
                    boolean zSerializer = updateMenuItemsui.read().serializer();
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("WifiAndCell", "isFirstScanCell = " + toautofillid.MediaMetadataCompat + ", isCellCacheValid = " + zSerializer);
                    if (toautofillid.MediaMetadataCompat && zSerializer) {
                        toautofillid.MediaMetadataCompat = false;
                        return;
                    } else {
                        toautofillid.serializer.serializer(toautofillid.RemoteActionCompatParcelizer);
                        return;
                    }
                }
                return;
            case 6:
                ContentCaptureSessionCompatApi23Impl contentCaptureSessionCompatApi23Impl = (ContentCaptureSessionCompatApi23Impl) this.IconCompatParcelizer;
                WindowInfoImplCompanion.serializer(message.what, "OnlyCell", new StringBuilder("msg.what="));
                if (message.what != 0) {
                    return;
                }
                if (!NetworkUtil.RemoteActionCompatParcelizer(placeAtf8xVGno.read()) || !onPrepareActionMode.RemoteActionCompatParcelizer(placeAtf8xVGno.read())) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("OnlyCell", "network and location enable is false");
                    return;
                }
                if (contentCaptureSessionCompatApi23Impl.IconCompatParcelizer) {
                    ((toAutofillIdCompat) contentCaptureSessionCompatApi23Impl.RemoteActionCompatParcelizer).removeMessages(0);
                    ((toAutofillIdCompat) contentCaptureSessionCompatApi23Impl.RemoteActionCompatParcelizer).sendEmptyMessageDelayed(0, contentCaptureSessionCompatApi23Impl.RatingCompat);
                    if (contentCaptureSessionCompatApi23Impl.read && updateMenuItemsui.read().serializer()) {
                        str = "first scan, cached cell is valid";
                    } else {
                        ((toContentCaptureSessionCompat) contentCaptureSessionCompatApi23Impl.write).serializer((i$d.a) contentCaptureSessionCompatApi23Impl.MediaMetadataCompat);
                        str = "requestScan cell";
                    }
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("OnlyCell", str);
                    return;
                }
                return;
            case 7:
                ContentCaptureSessionCompatApi23Impl contentCaptureSessionCompatApi23Impl2 = (ContentCaptureSessionCompatApi23Impl) this.IconCompatParcelizer;
                WindowInfoImplCompanion.serializer(message.what, "OnlyWifi", new StringBuilder("msg.what="));
                if (message.what != 0) {
                    return;
                }
                if (!NetworkUtil.RemoteActionCompatParcelizer(placeAtf8xVGno.read()) || !onPrepareActionMode.RemoteActionCompatParcelizer(placeAtf8xVGno.read())) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("OnlyWifi", "gnssAndNet is false");
                    return;
                }
                WrappedCompositionsetContent1211.read("OnlyWifi", "isNeedScan is " + contentCaptureSessionCompatApi23Impl2.IconCompatParcelizer);
                if (contentCaptureSessionCompatApi23Impl2.IconCompatParcelizer) {
                    ((toAutofillIdCompat) contentCaptureSessionCompatApi23Impl2.RemoteActionCompatParcelizer).removeMessages(0);
                    ((toAutofillIdCompat) contentCaptureSessionCompatApi23Impl2.RemoteActionCompatParcelizer).sendEmptyMessageDelayed(0, 30000L);
                    if (contentCaptureSessionCompatApi23Impl2.read && updateMenuItemsui.read().RemoteActionCompatParcelizer()) {
                        str2 = "first scan, cached wifi is valid";
                    } else {
                        ((E5) contentCaptureSessionCompatApi23Impl2.write).RemoteActionCompatParcelizer((i$d.a) contentCaptureSessionCompatApi23Impl2.MediaMetadataCompat);
                        str2 = "requestScan wifi";
                    }
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("OnlyWifi", str2);
                    return;
                }
                return;
            default:
                if (message.what == 11) {
                    ((BringIntoViewModifierNodeKtbringIntoView2) this.IconCompatParcelizer).RemoteActionCompatParcelizer();
                    return;
                }
                return;
        }
    }
}
