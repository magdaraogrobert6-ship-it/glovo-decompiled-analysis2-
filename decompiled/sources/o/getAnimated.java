package o;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.ParcelUuid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlinx.coroutines.channels.ProducerCoroutine;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class getAnimated extends ScanCallback {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 RemoteActionCompatParcelizer;
    public final /* synthetic */ getLinearity4e0Vf04ui_text write;

    public getAnimated(getLinearity4e0Vf04ui_text getlinearity4e0vf04ui_text, String str, InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) {
        this.write = getlinearity4e0vf04ui_text;
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanFailed(int i) {
        int i2 = 2 % 2;
        Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
        forest.RemoteActionCompatParcelizer("BleScannerImpl");
        forest.RemoteActionCompatParcelizer("BLE scan failed: errorCode=" + i, new Object[0]);
        ((ProducerCoroutine) this.RemoteActionCompatParcelizer).IconCompatParcelizer((Throwable) null);
        int i3 = read + 73;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    @Override // android.bluetooth.le.ScanCallback
    public final void onScanResult(int i, ScanResult scanResult) {
        ScanRecord scanRecord;
        ArrayList arrayList;
        Set<ParcelUuid> setKeySet;
        int i2 = 2 % 2;
        int i3 = serializer + 71;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            scanResult.getClass();
            scanRecord = scanResult.getScanRecord();
            int i4 = 30 / 0;
            if (scanRecord == null) {
                return;
            }
        } else {
            scanResult.getClass();
            scanRecord = scanResult.getScanRecord();
            if (scanRecord == null) {
                return;
            }
        }
        accessisMainThread accessismainthread = this.write.write;
        List<ParcelUuid> serviceUuids = scanRecord.getServiceUuids();
        Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
        if (serviceUuids != null) {
            List<ParcelUuid> list = serviceUuids;
            arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ParcelUuid) it.next()).getUuid());
            }
        } else {
            arrayList = null;
        }
        Map<ParcelUuid, byte[]> serviceData = scanRecord.getServiceData();
        if (serviceData != null && (setKeySet = serviceData.keySet()) != null) {
            Set<ParcelUuid> set = setKeySet;
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(set, 10));
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ParcelUuid) it2.next()).getUuid());
                int i5 = serializer + 9;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 3 % 5;
                }
            }
            setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList2);
        }
        accessismainthread.getClass();
        String str = this.IconCompatParcelizer;
        str.getClass();
        byte[] bytes = str.getBytes(ensureSubscribedToInAppMessageEvents.write);
        bytes.getClass();
        UUID uuidNameUUIDFromBytes = UUID.nameUUIDFromBytes(bytes);
        uuidNameUUIDFromBytes.getClass();
        if (arrayList == null) {
            if (setR8lambda54BeH8ZsBru0CXI2CCSP2syNys != null) {
                return;
            } else {
                return;
            }
        }
        int i7 = serializer + 27;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        if (!arrayList.contains(uuidNameUUIDFromBytes)) {
            if (setR8lambda54BeH8ZsBru0CXI2CCSP2syNys != null || !setR8lambda54BeH8ZsBru0CXI2CCSP2syNys.contains(uuidNameUUIDFromBytes)) {
                return;
            }
        }
        ((ProducerCoroutine) this.RemoteActionCompatParcelizer).b_(new TextMotionLinearityCompanion(scanResult.getRssi()));
    }
}
