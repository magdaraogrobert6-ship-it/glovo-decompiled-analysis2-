package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.GeneratedMessageLite;
import com.sentiance.protobuf.WireFormat$FieldType;
import com.sentiance.protobuf.WireFormat$JavaType;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageStyle {
    public static final ImageStyle read = new ImageStyle(0);
    public boolean RemoteActionCompatParcelizer;
    public final GenderCompanion serializer = new GenderCompanion(16);

    public static int serializer(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        int serializedSize;
        int i;
        switch (DismissType.IconCompatParcelizer[wireFormat$FieldType.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                java.util.logging.Logger logger = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
                return 8;
            case 2:
                ((Float) obj).getClass();
                java.util.logging.Logger logger2 = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
                return 4;
            case 3:
                return setRuntimeAppConfigurationProvider.read(((Long) obj).longValue());
            case 4:
                return setRuntimeAppConfigurationProvider.read(((Long) obj).longValue());
            case 5:
                return setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                java.util.logging.Logger logger3 = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                java.util.logging.Logger logger4 = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                java.util.logging.Logger logger5 = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
                return 1;
            case 9:
                java.util.logging.Logger logger6 = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
                return ((accessgetDiskCacheLockp) obj).getSerializedSize();
            case 10:
                java.util.logging.Logger logger7 = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
                serializedSize = ((accessgetDiskCacheLockp) obj).getSerializedSize();
                i = setRuntimeAppConfigurationProvider.read(serializedSize);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    return setRuntimeAppConfigurationProvider.IconCompatParcelizer((String) obj);
                }
                java.util.logging.Logger logger8 = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
                serializedSize = ((ByteString) obj).serializer();
                i = setRuntimeAppConfigurationProvider.read(serializedSize);
                break;
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    java.util.logging.Logger logger9 = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
                    serializedSize = ((byte[]) obj).length;
                    i = setRuntimeAppConfigurationProvider.read(serializedSize);
                } else {
                    java.util.logging.Logger logger10 = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
                    serializedSize = ((ByteString) obj).serializer();
                    i = setRuntimeAppConfigurationProvider.read(serializedSize);
                }
                break;
            case 13:
                return setRuntimeAppConfigurationProvider.read(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                java.util.logging.Logger logger11 = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
                return 4;
            case 15:
                ((Long) obj).getClass();
                java.util.logging.Logger logger12 = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return setRuntimeAppConfigurationProvider.read((iIntValue << 1) ^ (iIntValue >> 31));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return setRuntimeAppConfigurationProvider.read((jLongValue << 1) ^ (jLongValue >> 63));
            case 18:
                return obj instanceof IEventSubscriber ? setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer(((IEventSubscriber) obj).getNumber()) : setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer(((Integer) obj).intValue());
            default:
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return i + serializedSize;
    }

    public final int IconCompatParcelizer() {
        GenderCompanion genderCompanion;
        int i = 0;
        int iIconCompatParcelizer = 0;
        while (true) {
            genderCompanion = this.serializer;
            if (i >= genderCompanion.RemoteActionCompatParcelizer.size()) {
                break;
            }
            Map.Entry entryWrite = genderCompanion.write(i);
            iIconCompatParcelizer += IconCompatParcelizer((accessgetCardTypeMapcp) entryWrite.getKey(), entryWrite.getValue());
            i++;
        }
        for (Map.Entry entry : genderCompanion.RemoteActionCompatParcelizer()) {
            iIconCompatParcelizer += IconCompatParcelizer((accessgetCardTypeMapcp) entry.getKey(), entry.getValue());
        }
        return iIconCompatParcelizer;
    }

    public final Iterator RemoteActionCompatParcelizer() {
        return ((NotificationSubscriptionTypeCompanion) this.serializer.entrySet()).iterator();
    }

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ImageStyle clone() {
        GenderCompanion genderCompanion;
        ImageStyle imageStyle = new ImageStyle();
        int i = 0;
        while (true) {
            genderCompanion = this.serializer;
            if (i >= genderCompanion.RemoteActionCompatParcelizer.size()) {
                break;
            }
            Map.Entry entryWrite = genderCompanion.write(i);
            imageStyle.RemoteActionCompatParcelizer((accessgetCardTypeMapcp) entryWrite.getKey(), entryWrite.getValue());
            i++;
        }
        for (Map.Entry entry : genderCompanion.RemoteActionCompatParcelizer()) {
            imageStyle.RemoteActionCompatParcelizer((accessgetCardTypeMapcp) entry.getKey(), entry.getValue());
        }
        return imageStyle;
    }

    public final boolean serializer() {
        int i = 0;
        while (true) {
            GenderCompanion genderCompanion = this.serializer;
            if (i >= genderCompanion.RemoteActionCompatParcelizer.size()) {
                Iterator it = genderCompanion.RemoteActionCompatParcelizer().iterator();
                while (it.hasNext()) {
                    if (!IconCompatParcelizer((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!IconCompatParcelizer(genderCompanion.write(i))) {
                return false;
            }
            i++;
        }
    }

    public final int write() {
        GenderCompanion genderCompanion;
        int i = 0;
        int i2 = 0;
        while (true) {
            genderCompanion = this.serializer;
            if (i >= genderCompanion.RemoteActionCompatParcelizer.size()) {
                break;
            }
            i2 += read(genderCompanion.write(i));
            i++;
        }
        Iterator it = genderCompanion.RemoteActionCompatParcelizer().iterator();
        while (it.hasNext()) {
            i2 += read((Map.Entry) it.next());
        }
        return i2;
    }

    public ImageStyle(int i) {
        MediaDescriptionCompat();
        MediaDescriptionCompat();
    }

    public static boolean IconCompatParcelizer(Map.Entry entry) {
        accessgetCardTypeMapcp accessgetcardtypemapcp = (accessgetCardTypeMapcp) entry.getKey();
        if (accessgetcardtypemapcp.read.getJavaType() != WireFormat$JavaType.MESSAGE) {
            return true;
        }
        if (!accessgetcardtypemapcp.IconCompatParcelizer) {
            Object value = entry.getValue();
            if (value instanceof accessgetDiskLruCachep) {
                return ((accessgetDiskLruCachep) value).isInitialized();
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Wrong object type used with protocol message reflection.");
            return false;
        }
        for (Object obj : (List) entry.getValue()) {
            if (!(obj instanceof accessgetDiskLruCachep)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Wrong object type used with protocol message reflection.");
                return false;
            }
            if (!((accessgetDiskLruCachep) obj).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public static void read(setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider, WireFormat$FieldType wireFormat$FieldType, int i, Object obj) {
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            setruntimeappconfigurationprovider.write(i, 3);
            ((accessgetDiskCacheLockp) obj).writeTo(setruntimeappconfigurationprovider);
            setruntimeappconfigurationprovider.write(i, 4);
        }
        setruntimeappconfigurationprovider.write(i, wireFormat$FieldType.getWireType());
        switch (DismissType.IconCompatParcelizer[wireFormat$FieldType.ordinal()]) {
            case 1:
                setruntimeappconfigurationprovider.serializer(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 2:
                setruntimeappconfigurationprovider.IconCompatParcelizer(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 3:
                setruntimeappconfigurationprovider.RemoteActionCompatParcelizer(((Long) obj).longValue());
                break;
            case 4:
                setruntimeappconfigurationprovider.RemoteActionCompatParcelizer(((Long) obj).longValue());
                break;
            case 5:
                setruntimeappconfigurationprovider.write(((Integer) obj).intValue());
                break;
            case 6:
                setruntimeappconfigurationprovider.serializer(((Long) obj).longValue());
                break;
            case 7:
                setruntimeappconfigurationprovider.IconCompatParcelizer(((Integer) obj).intValue());
                break;
            case 8:
                setruntimeappconfigurationprovider.write(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                ((accessgetDiskCacheLockp) obj).writeTo(setruntimeappconfigurationprovider);
                break;
            case 10:
                setruntimeappconfigurationprovider.serializer((accessgetDiskCacheLockp) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    setruntimeappconfigurationprovider.RemoteActionCompatParcelizer((String) obj);
                } else {
                    setruntimeappconfigurationprovider.IconCompatParcelizer((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    setruntimeappconfigurationprovider.write(bArr.length, bArr);
                } else {
                    setruntimeappconfigurationprovider.IconCompatParcelizer((ByteString) obj);
                }
                break;
            case 13:
                setruntimeappconfigurationprovider.RatingCompat(((Integer) obj).intValue());
                break;
            case 14:
                setruntimeappconfigurationprovider.IconCompatParcelizer(((Integer) obj).intValue());
                break;
            case 15:
                setruntimeappconfigurationprovider.serializer(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                setruntimeappconfigurationprovider.RatingCompat((iIntValue << 1) ^ (iIntValue >> 31));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                setruntimeappconfigurationprovider.RemoteActionCompatParcelizer((jLongValue << 1) ^ (jLongValue >> 63));
                break;
            case 18:
                if (!(obj instanceof IEventSubscriber)) {
                    setruntimeappconfigurationprovider.write(((Integer) obj).intValue());
                } else {
                    setruntimeappconfigurationprovider.write(((IEventSubscriber) obj).getNumber());
                }
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImageStyle) {
            return this.serializer.equals(((ImageStyle) obj).serializer);
        }
        return false;
    }

    public final void serializer(Map.Entry entry) {
        accessgetCardTypeMapcp accessgetcardtypemapcp = (accessgetCardTypeMapcp) entry.getKey();
        Object value = entry.getValue();
        boolean z = accessgetcardtypemapcp.IconCompatParcelizer;
        GenderCompanion genderCompanion = this.serializer;
        if (z) {
            Object arrayList = genderCompanion.get(accessgetcardtypemapcp);
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
            genderCompanion.put(accessgetcardtypemapcp, arrayList);
            return;
        }
        if (accessgetcardtypemapcp.read.getJavaType() != WireFormat$JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            genderCompanion.put(accessgetcardtypemapcp, value);
            return;
        }
        Object obj2 = genderCompanion.get(accessgetcardtypemapcp);
        if (obj2 != null) {
            CardKey cardKey = (CardKey) ((accessgetDiskCacheLockp) obj2).toBuilder();
            cardKey.serializer((GeneratedMessageLite) ((accessgetDiskCacheLockp) value));
            genderCompanion.put(accessgetcardtypemapcp, cardKey.write());
        } else {
            if (value instanceof byte[]) {
                byte[] bArr5 = (byte[]) value;
                byte[] bArr6 = new byte[bArr5.length];
                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                value = bArr6;
            }
            genderCompanion.put(accessgetcardtypemapcp, value);
        }
    }

    public final void MediaDescriptionCompat() {
        GenderCompanion genderCompanion;
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        int i = 0;
        while (true) {
            genderCompanion = this.serializer;
            if (i >= genderCompanion.RemoteActionCompatParcelizer.size()) {
                break;
            }
            Map.Entry entryWrite = genderCompanion.write(i);
            if (entryWrite.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) entryWrite.getValue()).makeImmutable();
            }
            i++;
        }
        if (!genderCompanion.serializer) {
            for (int i2 = 0; i2 < genderCompanion.RemoteActionCompatParcelizer.size(); i2++) {
                Map.Entry entryWrite2 = genderCompanion.write(i2);
                if (((accessgetCardTypeMapcp) entryWrite2.getKey()).IconCompatParcelizer) {
                    entryWrite2.setValue(Collections.unmodifiableList((List) entryWrite2.getValue()));
                }
            }
            for (Map.Entry entry : genderCompanion.RemoteActionCompatParcelizer()) {
                if (((accessgetCardTypeMapcp) entry.getKey()).IconCompatParcelizer) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!genderCompanion.serializer) {
            genderCompanion.read = genderCompanion.read.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(genderCompanion.read);
            genderCompanion.MediaMetadataCompat = genderCompanion.MediaMetadataCompat.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(genderCompanion.MediaMetadataCompat);
            genderCompanion.serializer = true;
        }
        this.RemoteActionCompatParcelizer = true;
    }

    public ImageStyle() {
    }

    public final void RemoteActionCompatParcelizer(accessgetCardTypeMapcp accessgetcardtypemapcp, Object obj) {
        if (accessgetcardtypemapcp.IconCompatParcelizer) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    write(accessgetcardtypemapcp, it.next());
                }
                obj = arrayList;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Wrong object type used with protocol message reflection.");
                return;
            }
        } else {
            write(accessgetcardtypemapcp, obj);
        }
        this.serializer.put(accessgetcardtypemapcp, obj);
    }

    public final void read(ImageStyle imageStyle) {
        GenderCompanion genderCompanion;
        int i = 0;
        while (true) {
            int size = imageStyle.serializer.RemoteActionCompatParcelizer.size();
            genderCompanion = imageStyle.serializer;
            if (i >= size) {
                break;
            }
            serializer(genderCompanion.write(i));
            i++;
        }
        Iterator it = genderCompanion.RemoteActionCompatParcelizer().iterator();
        while (it.hasNext()) {
            serializer((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void write(accessgetCardTypeMapcp accessgetcardtypemapcp, Object obj) {
        boolean z;
        WireFormat$FieldType wireFormat$FieldType = accessgetcardtypemapcp.read;
        Charset charset = isFromOfflineStorage.read;
        obj.getClass();
        switch (DismissType.write[wireFormat$FieldType.getJavaType().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                if (z) {
                }
                int i = accessgetcardtypemapcp.RemoteActionCompatParcelizer;
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(i), accessgetcardtypemapcp.read.getJavaType(), obj.getClass().getName()});
                break;
            case 2:
                z = obj instanceof Long;
                if (z) {
                }
                int i2 = accessgetcardtypemapcp.RemoteActionCompatParcelizer;
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(i2), accessgetcardtypemapcp.read.getJavaType(), obj.getClass().getName()});
                break;
            case 3:
                z = obj instanceof Float;
                if (z) {
                }
                int i3 = accessgetcardtypemapcp.RemoteActionCompatParcelizer;
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(i3), accessgetcardtypemapcp.read.getJavaType(), obj.getClass().getName()});
                break;
            case 4:
                z = obj instanceof Double;
                if (z) {
                }
                int i4 = accessgetcardtypemapcp.RemoteActionCompatParcelizer;
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(i4), accessgetcardtypemapcp.read.getJavaType(), obj.getClass().getName()});
                break;
            case 5:
                z = obj instanceof Boolean;
                if (z) {
                }
                int i5 = accessgetcardtypemapcp.RemoteActionCompatParcelizer;
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(i5), accessgetcardtypemapcp.read.getJavaType(), obj.getClass().getName()});
                break;
            case 6:
                z = obj instanceof String;
                if (z) {
                }
                int i6 = accessgetcardtypemapcp.RemoteActionCompatParcelizer;
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(i6), accessgetcardtypemapcp.read.getJavaType(), obj.getClass().getName()});
                break;
            case 7:
                if ((obj instanceof ByteString) || (obj instanceof byte[])) {
                }
                int i7 = accessgetcardtypemapcp.RemoteActionCompatParcelizer;
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(i7), accessgetcardtypemapcp.read.getJavaType(), obj.getClass().getName()});
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof IEventSubscriber)) {
                }
                int i8 = accessgetcardtypemapcp.RemoteActionCompatParcelizer;
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(i8), accessgetcardtypemapcp.read.getJavaType(), obj.getClass().getName()});
                break;
            case 9:
                if (obj instanceof accessgetDiskCacheLockp) {
                }
                int i9 = accessgetcardtypemapcp.RemoteActionCompatParcelizer;
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(i9), accessgetcardtypemapcp.read.getJavaType(), obj.getClass().getName()});
                break;
            default:
                int i10 = accessgetcardtypemapcp.RemoteActionCompatParcelizer;
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(i10), accessgetcardtypemapcp.read.getJavaType(), obj.getClass().getName()});
                break;
        }
    }

    public static int read(Map.Entry entry) {
        accessgetCardTypeMapcp accessgetcardtypemapcp = (accessgetCardTypeMapcp) entry.getKey();
        Object value = entry.getValue();
        if (accessgetcardtypemapcp.read.getJavaType() == WireFormat$JavaType.MESSAGE && !accessgetcardtypemapcp.IconCompatParcelizer && !accessgetcardtypemapcp.serializer) {
            int i = ((accessgetCardTypeMapcp) entry.getKey()).RemoteActionCompatParcelizer;
            int iSerializer = setRuntimeAppConfigurationProvider.serializer(1);
            int iSerializer2 = setRuntimeAppConfigurationProvider.serializer(2);
            int i2 = setRuntimeAppConfigurationProvider.read(i);
            int iSerializer3 = setRuntimeAppConfigurationProvider.serializer(3);
            int serializedSize = ((accessgetDiskCacheLockp) value).getSerializedSize();
            return setRuntimeAppConfigurationProvider.read(serializedSize) + serializedSize + iSerializer3 + i2 + iSerializer2 + (iSerializer * 2);
        }
        return IconCompatParcelizer(accessgetcardtypemapcp, value);
    }

    public final void read(accessgetCardTypeMapcp accessgetcardtypemapcp, Object obj) {
        List arrayList;
        if (accessgetcardtypemapcp.IconCompatParcelizer) {
            write(accessgetcardtypemapcp, obj);
            GenderCompanion genderCompanion = this.serializer;
            Object obj2 = genderCompanion.get(accessgetcardtypemapcp);
            if (obj2 == null) {
                arrayList = new ArrayList();
                genderCompanion.put(accessgetcardtypemapcp, arrayList);
            } else {
                arrayList = (List) obj2;
            }
            arrayList.add(obj);
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("addRepeatedField() can only be called on repeated fields.");
    }

    public static int serializer(WireFormat$FieldType wireFormat$FieldType, int i, Object obj) {
        int iSerializer = setRuntimeAppConfigurationProvider.serializer(i);
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            iSerializer *= 2;
        }
        return serializer(wireFormat$FieldType, obj) + iSerializer;
    }

    public static int IconCompatParcelizer(accessgetCardTypeMapcp accessgetcardtypemapcp, Object obj) {
        WireFormat$FieldType wireFormat$FieldType = accessgetcardtypemapcp.read;
        int i = accessgetcardtypemapcp.RemoteActionCompatParcelizer;
        if (accessgetcardtypemapcp.IconCompatParcelizer) {
            List list = (List) obj;
            int iSerializer = 0;
            if (accessgetcardtypemapcp.serializer) {
                if (list.isEmpty()) {
                    return 0;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    iSerializer += serializer(wireFormat$FieldType, it.next());
                }
                return setRuntimeAppConfigurationProvider.read(iSerializer) + setRuntimeAppConfigurationProvider.serializer(i) + iSerializer;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                iSerializer += serializer(wireFormat$FieldType, i, it2.next());
            }
            return iSerializer;
        }
        return serializer(wireFormat$FieldType, i, obj);
    }
}
