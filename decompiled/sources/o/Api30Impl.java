package o;

import android.util.SparseArray;
import com.google.mlkit.vision.barcode.internal.zzo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Api30Impl {
    public static final SparseArray RemoteActionCompatParcelizer;
    public static final SparseArray read;
    public static final HashMap serializer;
    public static final AtomicReference write;

    public static String RemoteActionCompatParcelizer() {
        return true != write() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    static {
        SparseArray sparseArray = new SparseArray();
        read = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        RemoteActionCompatParcelizer = sparseArray2;
        write = new AtomicReference();
        sparseArray.put(-1, PointerInteropFilterpointerInputFilter1.FORMAT_UNKNOWN);
        sparseArray.put(1, PointerInteropFilterpointerInputFilter1.FORMAT_CODE_128);
        sparseArray.put(2, PointerInteropFilterpointerInputFilter1.FORMAT_CODE_39);
        sparseArray.put(4, PointerInteropFilterpointerInputFilter1.FORMAT_CODE_93);
        sparseArray.put(8, PointerInteropFilterpointerInputFilter1.FORMAT_CODABAR);
        sparseArray.put(16, PointerInteropFilterpointerInputFilter1.FORMAT_DATA_MATRIX);
        sparseArray.put(32, PointerInteropFilterpointerInputFilter1.FORMAT_EAN_13);
        sparseArray.put(64, PointerInteropFilterpointerInputFilter1.FORMAT_EAN_8);
        sparseArray.put(androidx.compose.ui.graphics.Fields.SpotShadowColor, PointerInteropFilterpointerInputFilter1.FORMAT_ITF);
        sparseArray.put(androidx.compose.ui.graphics.Fields.RotationX, PointerInteropFilterpointerInputFilter1.FORMAT_QR_CODE);
        sparseArray.put(androidx.compose.ui.graphics.Fields.RotationY, PointerInteropFilterpointerInputFilter1.FORMAT_UPC_A);
        sparseArray.put(androidx.compose.ui.graphics.Fields.RotationZ, PointerInteropFilterpointerInputFilter1.FORMAT_UPC_E);
        sparseArray.put(androidx.compose.ui.graphics.Fields.CameraDistance, PointerInteropFilterpointerInputFilter1.FORMAT_PDF417);
        sparseArray.put(androidx.compose.ui.graphics.Fields.TransformOrigin, PointerInteropFilterpointerInputFilter1.FORMAT_AZTEC);
        sparseArray2.put(0, stopDispatching.TYPE_UNKNOWN);
        sparseArray2.put(1, stopDispatching.TYPE_CONTACT_INFO);
        sparseArray2.put(2, stopDispatching.TYPE_EMAIL);
        sparseArray2.put(3, stopDispatching.TYPE_ISBN);
        sparseArray2.put(4, stopDispatching.TYPE_PHONE);
        sparseArray2.put(5, stopDispatching.TYPE_PRODUCT);
        sparseArray2.put(6, stopDispatching.TYPE_SMS);
        sparseArray2.put(7, stopDispatching.TYPE_TEXT);
        sparseArray2.put(8, stopDispatching.TYPE_URL);
        sparseArray2.put(9, stopDispatching.TYPE_WIFI);
        sparseArray2.put(10, stopDispatching.TYPE_GEO);
        sparseArray2.put(11, stopDispatching.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, stopDispatching.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        serializer = map;
        map.put(1, PointerInteropFilter_androidKtpointerInteropFilter3.CODE_128);
        map.put(2, PointerInteropFilter_androidKtpointerInteropFilter3.CODE_39);
        map.put(4, PointerInteropFilter_androidKtpointerInteropFilter3.CODE_93);
        map.put(8, PointerInteropFilter_androidKtpointerInteropFilter3.CODABAR);
        map.put(16, PointerInteropFilter_androidKtpointerInteropFilter3.DATA_MATRIX);
        map.put(32, PointerInteropFilter_androidKtpointerInteropFilter3.EAN_13);
        map.put(64, PointerInteropFilter_androidKtpointerInteropFilter3.EAN_8);
        map.put(Integer.valueOf(androidx.compose.ui.graphics.Fields.SpotShadowColor), PointerInteropFilter_androidKtpointerInteropFilter3.ITF);
        map.put(Integer.valueOf(androidx.compose.ui.graphics.Fields.RotationX), PointerInteropFilter_androidKtpointerInteropFilter3.QR_CODE);
        map.put(Integer.valueOf(androidx.compose.ui.graphics.Fields.RotationY), PointerInteropFilter_androidKtpointerInteropFilter3.UPC_A);
        map.put(Integer.valueOf(androidx.compose.ui.graphics.Fields.RotationZ), PointerInteropFilter_androidKtpointerInteropFilter3.UPC_E);
        map.put(Integer.valueOf(androidx.compose.ui.graphics.Fields.CameraDistance), PointerInteropFilter_androidKtpointerInteropFilter3.PDF417);
        map.put(Integer.valueOf(androidx.compose.ui.graphics.Fields.TransformOrigin), PointerInteropFilter_androidKtpointerInteropFilter3.AZTEC);
    }

    public static void RemoteActionCompatParcelizer(toMotionEventScoped4ec7I tomotioneventscoped4ec7i, accesssetStatep accesssetstatep) {
        Api28ClipboardManagerClipClear api28ClipboardManagerClipClear = new Api28ClipboardManagerClipClear();
        api28ClipboardManagerClipClear.read = accesssetstatep;
        tomotioneventscoped4ec7i.read(api28ClipboardManagerClipClear, PointerInteropFilterpointerInputFilter1dispatchToView2.ON_DEVICE_BARCODE_LOAD);
    }

    public static boolean write() {
        AtomicReference atomicReference = write;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean zSerializer = zzo.serializer(AndroidUriHandler.serializer().IconCompatParcelizer());
        atomicReference.set(Boolean.valueOf(zSerializer));
        return zSerializer;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
    /* JADX WARN: Code duplicated, block: B:13:0x0042 A[LOOP:0: B:11:0x003c->B:13:0x0042, LOOP_END] */
    public static emptyCancelMotionEventScopedefault IconCompatParcelizer(calculateWindowSize calculatewindowsize) {
        Iterator it;
        int i = calculatewindowsize.IconCompatParcelizer;
        boolean z = false;
        InternalPointerEvent internalPointerEvent = new InternalPointerEvent(0);
        HashMap map = serializer;
        if (i == 0) {
            Collection collectionValues = map.values();
            if (collectionValues instanceof Collection) {
                internalPointerEvent.IconCompatParcelizer(collectionValues.size() + internalPointerEvent.IconCompatParcelizer);
                if (collectionValues instanceof HoverIconModifierNodefindOverridingAncestorNode1) {
                    internalPointerEvent.IconCompatParcelizer = ((HoverIconModifierNodefindOverridingAncestorNode1) collectionValues).IconCompatParcelizer(internalPointerEvent.IconCompatParcelizer, (Object[]) internalPointerEvent.read);
                } else {
                    it = collectionValues.iterator();
                    while (it.hasNext()) {
                        internalPointerEvent.read(it.next());
                    }
                }
            } else {
                it = collectionValues.iterator();
                while (it.hasNext()) {
                    internalPointerEvent.read(it.next());
                }
            }
        } else {
            for (Map.Entry entry : map.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & i) != 0) {
                    internalPointerEvent.read((PointerInteropFilter_androidKtpointerInteropFilter3) entry.getValue());
                }
            }
        }
        PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1 = new PinnableContainerKtLocalPinnableContainer1(6, z);
        pinnableContainerKtLocalPinnableContainer1.serializer = internalPointerEvent.write();
        return new emptyCancelMotionEventScopedefault(pinnableContainerKtLocalPinnableContainer1);
    }
}
