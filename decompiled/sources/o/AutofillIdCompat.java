package o;

import android.util.Pair;
import com.huawei.location.nlp.scan.LW;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AutofillIdCompat implements ContentCaptureSessionCompatApi29Impl, newViewStructure {
    public final /* synthetic */ int serializer;
    public final /* synthetic */ toAutofillId write;

    public /* synthetic */ AutofillIdCompat(toAutofillId toautofillid, int i) {
        this.serializer = i;
        this.write = toautofillid;
    }

    @Override // o.ContentCaptureSessionCompatApi29Impl, o.newViewStructure
    public final void RemoteActionCompatParcelizer(List list) {
        String str;
        int i = this.serializer;
        toAutofillId toautofillid = this.write;
        if (i == 0) {
            if (list == null || list.isEmpty()) {
                WrappedCompositionsetContent1211.read("WifiAndCell", "cellInfoList is empty");
                return;
            }
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("WifiAndCell", "cell scan success, result size is " + list.size());
            updateMenuItemsui.read().IconCompatParcelizer(toautofillid.serializer(list));
            toautofillid.MediaMetadataCompat = false;
            return;
        }
        if (list.isEmpty()) {
            WrappedCompositionsetContent1211.read("WifiAndCell", "wifi scan success, scanResultList is empty");
            return;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("WifiAndCell", "wifi scan success, scanResultList size is " + list.size());
        Pair pairIconCompatParcelizer = LW.IconCompatParcelizer(list);
        List list2 = (List) pairIconCompatParcelizer.second;
        if (list2.size() < 1) {
            str = "handlerWifiScanResult, filterResult is empty";
        } else {
            if (!LW.IconCompatParcelizer(list2, updateMenuItemsui.read().RemoteActionCompatParcelizer)) {
                updateMenuItemsui updatemenuitemsui = updateMenuItemsui.read();
                updatemenuitemsui.getClass();
                updatemenuitemsui.MediaMetadataCompat = ((Long) pairIconCompatParcelizer.first).longValue();
                updatemenuitemsui.RemoteActionCompatParcelizer = (List) pairIconCompatParcelizer.second;
                if (toautofillid.write.hasMessages(-1)) {
                    toautofillid.write.removeMessages(-1);
                    toautofillid.MediaSessionCompatQueueItem = false;
                    toautofillid.PlaybackStateCompatCustomAction.MediaBrowserCompatMediaItem();
                    return;
                }
                return;
            }
            str = "The Wi-Fi scanning result is the same as that in the cache.";
        }
        WrappedCompositionsetContent1211.read("WifiAndCell", str);
    }

    @Override // o.newViewStructure
    public void MediaBrowserCompatMediaItem() {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("WifiAndCell", "wifi scan fail, code is 10000");
        toAutofillId toautofillid = this.write;
        if (toautofillid.write.hasMessages(-1)) {
            toautofillid.write.removeMessages(-1);
            toautofillid.write.sendEmptyMessage(-1);
        }
    }
}
