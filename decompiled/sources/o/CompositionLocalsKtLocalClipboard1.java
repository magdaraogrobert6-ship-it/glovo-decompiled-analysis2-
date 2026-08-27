package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.GeneratedMessageLite;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class CompositionLocalsKtLocalClipboard1 {
    public static final CompositionLocalsKtLocalClipboard1 serializer = new CompositionLocalsKtLocalClipboard1(0);
    public final performSave RemoteActionCompatParcelizer = new performSave(16);
    public boolean write;

    public final void IconCompatParcelizer(CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard1) {
        performSave performsave;
        int i = 0;
        while (true) {
            int size = compositionLocalsKtLocalClipboard1.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.size();
            performsave = compositionLocalsKtLocalClipboard1.RemoteActionCompatParcelizer;
            if (i >= size) {
                break;
            }
            RemoteActionCompatParcelizer(performsave.serializer(i));
            i++;
        }
        Iterator it = performsave.IconCompatParcelizer().iterator();
        while (it.hasNext()) {
            RemoteActionCompatParcelizer((Map.Entry) it.next());
        }
    }

    public static int serializer(onScroll onscroll, Object obj) {
        int serializedSize;
        int iRemoteActionCompatParcelizer;
        switch (CompositionLocalsKtLocalFocusManager1.write[onscroll.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                java.util.logging.Logger logger = ComposeView.RemoteActionCompatParcelizer;
                return 8;
            case 2:
                ((Float) obj).getClass();
                java.util.logging.Logger logger2 = ComposeView.RemoteActionCompatParcelizer;
                return 4;
            case 3:
                return ComposeView.serializer(((Long) obj).longValue());
            case 4:
                return ComposeView.serializer(((Long) obj).longValue());
            case 5:
                return ComposeView.read(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                java.util.logging.Logger logger3 = ComposeView.RemoteActionCompatParcelizer;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                java.util.logging.Logger logger4 = ComposeView.RemoteActionCompatParcelizer;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                java.util.logging.Logger logger5 = ComposeView.RemoteActionCompatParcelizer;
                return 1;
            case 9:
                java.util.logging.Logger logger6 = ComposeView.RemoteActionCompatParcelizer;
                return ((getElevation) obj).getSerializedSize();
            case 10:
                java.util.logging.Logger logger7 = ComposeView.RemoteActionCompatParcelizer;
                serializedSize = ((getElevation) obj).getSerializedSize();
                iRemoteActionCompatParcelizer = ComposeView.RemoteActionCompatParcelizer(serializedSize);
                break;
            case 11:
                if (!(obj instanceof getClipMetadata)) {
                    return ComposeView.write((String) obj);
                }
                java.util.logging.Logger logger8 = ComposeView.RemoteActionCompatParcelizer;
                serializedSize = ((getClipMetadata) obj).RatingCompat();
                iRemoteActionCompatParcelizer = ComposeView.RemoteActionCompatParcelizer(serializedSize);
                break;
                break;
            case 12:
                if (!(obj instanceof getClipMetadata)) {
                    java.util.logging.Logger logger9 = ComposeView.RemoteActionCompatParcelizer;
                    serializedSize = ((byte[]) obj).length;
                    iRemoteActionCompatParcelizer = ComposeView.RemoteActionCompatParcelizer(serializedSize);
                } else {
                    java.util.logging.Logger logger10 = ComposeView.RemoteActionCompatParcelizer;
                    serializedSize = ((getClipMetadata) obj).RatingCompat();
                    iRemoteActionCompatParcelizer = ComposeView.RemoteActionCompatParcelizer(serializedSize);
                }
                break;
            case 13:
                return ComposeView.RemoteActionCompatParcelizer(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                java.util.logging.Logger logger11 = ComposeView.RemoteActionCompatParcelizer;
                return 4;
            case 15:
                ((Long) obj).getClass();
                java.util.logging.Logger logger12 = ComposeView.RemoteActionCompatParcelizer;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return ComposeView.RemoteActionCompatParcelizer((iIntValue << 1) ^ (iIntValue >> 31));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return ComposeView.serializer((jLongValue << 1) ^ (jLongValue >> 63));
            case 18:
                return obj instanceof ifDebug ? ComposeView.read(((ifDebug) obj).getNumber()) : ComposeView.read(((Integer) obj).intValue());
            default:
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return iRemoteActionCompatParcelizer + serializedSize;
    }

    public final int RemoteActionCompatParcelizer() {
        performSave performsave;
        int i = 0;
        int iRemoteActionCompatParcelizer = 0;
        while (true) {
            performsave = this.RemoteActionCompatParcelizer;
            if (i >= performsave.RemoteActionCompatParcelizer.size()) {
                break;
            }
            Map.Entry entrySerializer = performsave.serializer(i);
            iRemoteActionCompatParcelizer += RemoteActionCompatParcelizer((CompositionLocalsKtLocalLocale1) entrySerializer.getKey(), entrySerializer.getValue());
            i++;
        }
        for (Map.Entry entry : performsave.IconCompatParcelizer()) {
            iRemoteActionCompatParcelizer += RemoteActionCompatParcelizer((CompositionLocalsKtLocalLocale1) entry.getKey(), entry.getValue());
        }
        return iRemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    /* JADX INFO: renamed from: serializer, reason: merged with bridge method [inline-methods] */
    public final CompositionLocalsKtLocalClipboard1 clone() {
        performSave performsave;
        CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard1 = new CompositionLocalsKtLocalClipboard1();
        int i = 0;
        while (true) {
            performsave = this.RemoteActionCompatParcelizer;
            if (i >= performsave.RemoteActionCompatParcelizer.size()) {
                break;
            }
            Map.Entry entrySerializer = performsave.serializer(i);
            compositionLocalsKtLocalClipboard1.serializer((CompositionLocalsKtLocalLocale1) entrySerializer.getKey(), entrySerializer.getValue());
            i++;
        }
        for (Map.Entry entry : performsave.IconCompatParcelizer()) {
            compositionLocalsKtLocalClipboard1.serializer((CompositionLocalsKtLocalLocale1) entry.getKey(), entry.getValue());
        }
        return compositionLocalsKtLocalClipboard1;
    }

    public final Iterator write() {
        return ((NotificationSubscriptionTypeCompanion) this.RemoteActionCompatParcelizer.entrySet()).iterator();
    }

    public CompositionLocalsKtLocalClipboard1(int i) {
        MediaSessionCompatQueueItem();
        MediaSessionCompatQueueItem();
    }

    public static int IconCompatParcelizer(Map.Entry entry) {
        CompositionLocalsKtLocalLocale1 compositionLocalsKtLocalLocale1 = (CompositionLocalsKtLocalLocale1) entry.getKey();
        Object value = entry.getValue();
        if (compositionLocalsKtLocalLocale1.IconCompatParcelizer() != onDown.MESSAGE || compositionLocalsKtLocalLocale1.MediaSessionCompatQueueItem() || compositionLocalsKtLocalLocale1.serializer()) {
            return RemoteActionCompatParcelizer(compositionLocalsKtLocalLocale1, value);
        }
        int iWrite = ((CompositionLocalsKtLocalLocale1) entry.getKey()).write();
        int iSerializer = ComposeView.serializer(1);
        int iSerializer2 = ComposeView.serializer(2);
        int iRemoteActionCompatParcelizer = ComposeView.RemoteActionCompatParcelizer(iWrite);
        int iSerializer3 = ComposeView.serializer(3);
        int serializedSize = ((getElevation) value).getSerializedSize();
        return af$$ExternalSyntheticOutline0.m$1(serializedSize, serializedSize, iSerializer3, iRemoteActionCompatParcelizer + iSerializer2 + (iSerializer * 2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void IconCompatParcelizer(CompositionLocalsKtLocalLocale1 compositionLocalsKtLocalLocale1, Object obj) {
        boolean z;
        onScroll onscrollRemoteActionCompatParcelizer = compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer();
        Charset charset = CompositionLocalsKtLocalWindowInfo1.serializer;
        obj.getClass();
        switch (CompositionLocalsKtLocalFocusManager1.IconCompatParcelizer[onscrollRemoteActionCompatParcelizer.getJavaType().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                if (z) {
                }
                int iWrite = compositionLocalsKtLocalLocale1.write();
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(iWrite), compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer().getJavaType(), obj.getClass().getName()});
                break;
            case 2:
                z = obj instanceof Long;
                if (z) {
                }
                int iWrite2 = compositionLocalsKtLocalLocale1.write();
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(iWrite2), compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer().getJavaType(), obj.getClass().getName()});
                break;
            case 3:
                z = obj instanceof Float;
                if (z) {
                }
                int iWrite3 = compositionLocalsKtLocalLocale1.write();
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(iWrite3), compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer().getJavaType(), obj.getClass().getName()});
                break;
            case 4:
                z = obj instanceof Double;
                if (z) {
                }
                int iWrite4 = compositionLocalsKtLocalLocale1.write();
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(iWrite4), compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer().getJavaType(), obj.getClass().getName()});
                break;
            case 5:
                z = obj instanceof Boolean;
                if (z) {
                }
                int iWrite5 = compositionLocalsKtLocalLocale1.write();
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(iWrite5), compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer().getJavaType(), obj.getClass().getName()});
                break;
            case 6:
                z = obj instanceof String;
                if (z) {
                }
                int iWrite6 = compositionLocalsKtLocalLocale1.write();
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(iWrite6), compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer().getJavaType(), obj.getClass().getName()});
                break;
            case 7:
                if ((obj instanceof getClipMetadata) || (obj instanceof byte[])) {
                }
                int iWrite7 = compositionLocalsKtLocalLocale1.write();
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(iWrite7), compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer().getJavaType(), obj.getClass().getName()});
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof ifDebug)) {
                }
                int iWrite8 = compositionLocalsKtLocalLocale1.write();
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(iWrite8), compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer().getJavaType(), obj.getClass().getName()});
                break;
            case 9:
                if (obj instanceof getElevation) {
                }
                int iWrite9 = compositionLocalsKtLocalLocale1.write();
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(iWrite9), compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer().getJavaType(), obj.getClass().getName()});
                break;
            default:
                int iWrite10 = compositionLocalsKtLocalLocale1.write();
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(iWrite10), compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer().getJavaType(), obj.getClass().getName()});
                break;
        }
    }

    public static int RemoteActionCompatParcelizer(CompositionLocalsKtLocalLocale1 compositionLocalsKtLocalLocale1, Object obj) {
        onScroll onscrollRemoteActionCompatParcelizer = compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer();
        int iWrite = compositionLocalsKtLocalLocale1.write();
        if (!compositionLocalsKtLocalLocale1.MediaSessionCompatQueueItem()) {
            return RemoteActionCompatParcelizer(onscrollRemoteActionCompatParcelizer, iWrite, obj);
        }
        List list = (List) obj;
        int iRemoteActionCompatParcelizer = 0;
        if (!compositionLocalsKtLocalLocale1.serializer()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iRemoteActionCompatParcelizer += RemoteActionCompatParcelizer(onscrollRemoteActionCompatParcelizer, iWrite, it.next());
            }
            return iRemoteActionCompatParcelizer;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iRemoteActionCompatParcelizer += serializer(onscrollRemoteActionCompatParcelizer, it2.next());
        }
        return ComposeView.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer) + ComposeView.serializer(iWrite) + iRemoteActionCompatParcelizer;
    }

    public static int RemoteActionCompatParcelizer(onScroll onscroll, int i, Object obj) {
        int iSerializer = ComposeView.serializer(i);
        if (onscroll == onScroll.GROUP) {
            iSerializer *= 2;
        }
        return serializer(onscroll, obj) + iSerializer;
    }

    public static void serializer(ComposeView composeView, onScroll onscroll, int i, Object obj) {
        if (onscroll == onScroll.GROUP) {
            composeView.RemoteActionCompatParcelizer(i, 3);
            ((getElevation) obj).writeTo(composeView);
            composeView.RemoteActionCompatParcelizer(i, 4);
        }
        composeView.RemoteActionCompatParcelizer(i, onscroll.getWireType());
        switch (CompositionLocalsKtLocalFocusManager1.write[onscroll.ordinal()]) {
            case 1:
                composeView.IconCompatParcelizer(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 2:
                composeView.write(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 3:
                composeView.read(((Long) obj).longValue());
                break;
            case 4:
                composeView.read(((Long) obj).longValue());
                break;
            case 5:
                composeView.IconCompatParcelizer(((Integer) obj).intValue());
                break;
            case 6:
                composeView.IconCompatParcelizer(((Long) obj).longValue());
                break;
            case 7:
                composeView.write(((Integer) obj).intValue());
                break;
            case 8:
                composeView.RemoteActionCompatParcelizer(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                ((getElevation) obj).writeTo(composeView);
                break;
            case 10:
                composeView.serializer((getElevation) obj);
                break;
            case 11:
                if (!(obj instanceof getClipMetadata)) {
                    composeView.serializer((String) obj);
                } else {
                    composeView.serializer((getClipMetadata) obj);
                }
                break;
            case 12:
                if (!(obj instanceof getClipMetadata)) {
                    byte[] bArr = (byte[]) obj;
                    composeView.RemoteActionCompatParcelizer(bArr.length, bArr);
                } else {
                    composeView.serializer((getClipMetadata) obj);
                }
                break;
            case 13:
                composeView.MediaBrowserCompatMediaItem(((Integer) obj).intValue());
                break;
            case 14:
                composeView.write(((Integer) obj).intValue());
                break;
            case 15:
                composeView.IconCompatParcelizer(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                composeView.MediaBrowserCompatMediaItem((iIntValue << 1) ^ (iIntValue >> 31));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                composeView.read((jLongValue << 1) ^ (jLongValue >> 63));
                break;
            case 18:
                if (!(obj instanceof ifDebug)) {
                    composeView.IconCompatParcelizer(((Integer) obj).intValue());
                } else {
                    composeView.IconCompatParcelizer(((ifDebug) obj).getNumber());
                }
                break;
        }
    }

    public static boolean serializer(Map.Entry entry) {
        CompositionLocalsKtLocalLocale1 compositionLocalsKtLocalLocale1 = (CompositionLocalsKtLocalLocale1) entry.getKey();
        if (compositionLocalsKtLocalLocale1.IconCompatParcelizer() != onDown.MESSAGE) {
            return true;
        }
        if (!compositionLocalsKtLocalLocale1.MediaSessionCompatQueueItem()) {
            Object value = entry.getValue();
            if (value instanceof dumpRenderNodeData) {
                return ((dumpRenderNodeData) value).isInitialized();
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Wrong object type used with protocol message reflection.");
            return false;
        }
        for (Object obj : (List) entry.getValue()) {
            if (!(obj instanceof dumpRenderNodeData)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Wrong object type used with protocol message reflection.");
                return false;
            }
            if (!((dumpRenderNodeData) obj).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public final void RemoteActionCompatParcelizer(Map.Entry entry) {
        CompositionLocalsKtLocalLocale1 compositionLocalsKtLocalLocale1 = (CompositionLocalsKtLocalLocale1) entry.getKey();
        Object value = entry.getValue();
        boolean zMediaSessionCompatQueueItem = compositionLocalsKtLocalLocale1.MediaSessionCompatQueueItem();
        performSave performsave = this.RemoteActionCompatParcelizer;
        if (zMediaSessionCompatQueueItem) {
            Object arrayList = performsave.get(compositionLocalsKtLocalLocale1);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            performsave.put(compositionLocalsKtLocalLocale1, arrayList);
            return;
        }
        if (compositionLocalsKtLocalLocale1.IconCompatParcelizer() != onDown.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            performsave.put(compositionLocalsKtLocalLocale1, value);
            return;
        }
        Object obj2 = performsave.get(compositionLocalsKtLocalLocale1);
        if (obj2 != null) {
            performsave.put(compositionLocalsKtLocalLocale1, CompositionLocalsKtLocalLocale1.serializer(((getElevation) obj2).toBuilder(), (getElevation) value).serializer());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        performsave.put(compositionLocalsKtLocalLocale1, value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CompositionLocalsKtLocalClipboard1) {
            return this.RemoteActionCompatParcelizer.equals(((CompositionLocalsKtLocalClipboard1) obj).RemoteActionCompatParcelizer);
        }
        return false;
    }

    public final void serializer(CompositionLocalsKtLocalLocale1 compositionLocalsKtLocalLocale1, Object obj) {
        if (!compositionLocalsKtLocalLocale1.MediaSessionCompatQueueItem()) {
            IconCompatParcelizer(compositionLocalsKtLocalLocale1, obj);
        } else {
            if (!(obj instanceof List)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                IconCompatParcelizer(compositionLocalsKtLocalLocale1, it.next());
            }
            obj = arrayList;
        }
        this.RemoteActionCompatParcelizer.put(compositionLocalsKtLocalLocale1, obj);
    }

    public final void write(CompositionLocalsKtLocalLocale1 compositionLocalsKtLocalLocale1, Object obj) {
        List arrayList;
        if (!compositionLocalsKtLocalLocale1.MediaSessionCompatQueueItem()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        IconCompatParcelizer(compositionLocalsKtLocalLocale1, obj);
        performSave performsave = this.RemoteActionCompatParcelizer;
        Object obj2 = performsave.get(compositionLocalsKtLocalLocale1);
        if (obj2 == null) {
            arrayList = new ArrayList();
            performsave.put(compositionLocalsKtLocalLocale1, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    public final void MediaSessionCompatQueueItem() {
        performSave performsave;
        if (this.write) {
            return;
        }
        int i = 0;
        while (true) {
            performsave = this.RemoteActionCompatParcelizer;
            if (i >= performsave.RemoteActionCompatParcelizer.size()) {
                break;
            }
            Map.Entry entrySerializer = performsave.serializer(i);
            if (entrySerializer.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) entrySerializer.getValue()).makeImmutable();
            }
            i++;
        }
        if (!performsave.IconCompatParcelizer) {
            for (int i2 = 0; i2 < performsave.RemoteActionCompatParcelizer.size(); i2++) {
                Map.Entry entrySerializer2 = performsave.serializer(i2);
                if (((CompositionLocalsKtLocalLocale1) entrySerializer2.getKey()).MediaSessionCompatQueueItem()) {
                    entrySerializer2.setValue(Collections.unmodifiableList((List) entrySerializer2.getValue()));
                }
            }
            for (Map.Entry entry : performsave.IconCompatParcelizer()) {
                if (((CompositionLocalsKtLocalLocale1) entry.getKey()).MediaSessionCompatQueueItem()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!performsave.IconCompatParcelizer) {
            performsave.MediaBrowserCompatMediaItem = performsave.MediaBrowserCompatMediaItem.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(performsave.MediaBrowserCompatMediaItem);
            performsave.MediaDescriptionCompat = performsave.MediaDescriptionCompat.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(performsave.MediaDescriptionCompat);
            performsave.IconCompatParcelizer = true;
        }
        this.write = true;
    }

    public CompositionLocalsKtLocalClipboard1() {
    }

    public final int IconCompatParcelizer() {
        performSave performsave;
        int i = 0;
        int iIconCompatParcelizer = 0;
        while (true) {
            performsave = this.RemoteActionCompatParcelizer;
            if (i >= performsave.RemoteActionCompatParcelizer.size()) {
                break;
            }
            iIconCompatParcelizer += IconCompatParcelizer(performsave.serializer(i));
            i++;
        }
        Iterator it = performsave.IconCompatParcelizer().iterator();
        while (it.hasNext()) {
            iIconCompatParcelizer += IconCompatParcelizer((Map.Entry) it.next());
        }
        return iIconCompatParcelizer;
    }

    public final boolean read() {
        int i = 0;
        while (true) {
            performSave performsave = this.RemoteActionCompatParcelizer;
            if (i < performsave.RemoteActionCompatParcelizer.size()) {
                if (!serializer(performsave.serializer(i))) {
                    return false;
                }
                i++;
            } else {
                Iterator it = performsave.IconCompatParcelizer().iterator();
                while (it.hasNext()) {
                    if (!serializer((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
        }
    }
}
