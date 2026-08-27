package o;

import com.google.android.gms.internal.measurement.zzll;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class KeyInputNode {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public boolean read;
    public final NestedScrollDispatcherdispatchPreFling1 write = new NestedScrollDispatcherdispatchPreFling1();

    public KeyInputNode(int i) {
        write();
        write();
    }

    public final Object clone() {
        KeyInputNode keyInputNode = new KeyInputNode();
        NestedScrollDispatcherdispatchPreFling1 nestedScrollDispatcherdispatchPreFling1 = this.write;
        if (nestedScrollDispatcherdispatchPreFling1.RemoteActionCompatParcelizer > 0) {
            nestedScrollDispatcherdispatchPreFling1.serializer(0).RemoteActionCompatParcelizer.getClass();
            int iSerializer = isAppSetIdReadingEnabled.serializer();
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
            return null;
        }
        Iterator it = nestedScrollDispatcherdispatchPreFling1.IconCompatParcelizer().iterator();
        if (!it.hasNext()) {
            return keyInputNode;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() == null) {
            entry.getValue();
            throw null;
        }
        int iSerializer2 = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer2);
        return null;
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    static {
        new KeyInputNode(0);
    }

    public static void RemoteActionCompatParcelizer(KeyInputModifierKt keyInputModifierKt, getNestedCoroutineScope getnestedcoroutinescope, int i, Object obj) throws zzll {
        if (getnestedcoroutinescope == getNestedCoroutineScope.zzj) {
            Charset charset = accessonPreScrollOzD1aCkjd.write;
            keyInputModifierKt.read(i, 3);
            ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj)).RemoteActionCompatParcelizer(keyInputModifierKt);
            keyInputModifierKt.read(i, 4);
            return;
        }
        keyInputModifierKt.read(i, getnestedcoroutinescope.zzb());
        getParentConnection getparentconnection = getParentConnection.INT;
        switch (getnestedcoroutinescope.ordinal()) {
            case 0:
                keyInputModifierKt.serializer(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                keyInputModifierKt.RemoteActionCompatParcelizer(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                keyInputModifierKt.read(((Long) obj).longValue());
                break;
            case 3:
                keyInputModifierKt.read(((Long) obj).longValue());
                break;
            case 4:
                keyInputModifierKt.read(((Integer) obj).intValue());
                break;
            case 5:
                keyInputModifierKt.serializer(((Long) obj).longValue());
                break;
            case 6:
                keyInputModifierKt.RemoteActionCompatParcelizer(((Integer) obj).intValue());
                break;
            case 7:
                keyInputModifierKt.read(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof onPreviewKeyEvent)) {
                    keyInputModifierKt.RemoteActionCompatParcelizer((String) obj);
                } else {
                    keyInputModifierKt.RemoteActionCompatParcelizer((onPreviewKeyEvent) obj);
                }
                break;
            case 9:
                ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj)).RemoteActionCompatParcelizer(keyInputModifierKt);
                break;
            case 10:
                SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt = (SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj);
                keyInputModifierKt.serializer(softwareKeyboardInterceptionModifierKt.getLifecycleRegistry1());
                softwareKeyboardInterceptionModifierKt.RemoteActionCompatParcelizer(keyInputModifierKt);
                break;
            case 11:
                if (!(obj instanceof onPreviewKeyEvent)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    keyInputModifierKt.serializer(length);
                    keyInputModifierKt.serializer(length, bArr);
                } else {
                    keyInputModifierKt.RemoteActionCompatParcelizer((onPreviewKeyEvent) obj);
                }
                break;
            case 12:
                keyInputModifierKt.serializer(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof accessonPostFlingRZ2iAVYjd)) {
                    keyInputModifierKt.read(((Integer) obj).intValue());
                } else {
                    keyInputModifierKt.read(((accessonPostFlingRZ2iAVYjd) obj).zza());
                }
                break;
            case 14:
                keyInputModifierKt.RemoteActionCompatParcelizer(((Integer) obj).intValue());
                break;
            case 15:
                keyInputModifierKt.serializer(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                keyInputModifierKt.serializer((iIntValue + iIntValue) ^ (iIntValue >> 31));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                keyInputModifierKt.read((jLongValue + jLongValue) ^ (jLongValue >> 63));
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyInputNode) {
            return this.write.equals(((KeyInputNode) obj).write);
        }
        return false;
    }

    public final void write() {
        if (this.read) {
            return;
        }
        NestedScrollDispatcherdispatchPreFling1 nestedScrollDispatcherdispatchPreFling1 = this.write;
        int i = nestedScrollDispatcherdispatchPreFling1.RemoteActionCompatParcelizer;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = nestedScrollDispatcherdispatchPreFling1.serializer(i2).write;
            if (obj instanceof SoftwareKeyboardInterceptionModifierKt) {
                ((SoftwareKeyboardInterceptionModifierKt) obj).setPictureInPictureParams();
            }
        }
        Iterator it = nestedScrollDispatcherdispatchPreFling1.IconCompatParcelizer().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof SoftwareKeyboardInterceptionModifierKt) {
                ((SoftwareKeyboardInterceptionModifierKt) value).setPictureInPictureParams();
            }
        }
        if (!nestedScrollDispatcherdispatchPreFling1.serializer) {
            if (nestedScrollDispatcherdispatchPreFling1.RemoteActionCompatParcelizer > 0) {
                nestedScrollDispatcherdispatchPreFling1.serializer(0).RemoteActionCompatParcelizer.getClass();
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                return;
            } else {
                Iterator it2 = nestedScrollDispatcherdispatchPreFling1.IconCompatParcelizer().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                    return;
                }
            }
        }
        if (!nestedScrollDispatcherdispatchPreFling1.serializer) {
            nestedScrollDispatcherdispatchPreFling1.IconCompatParcelizer = nestedScrollDispatcherdispatchPreFling1.IconCompatParcelizer.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(nestedScrollDispatcherdispatchPreFling1.IconCompatParcelizer);
            nestedScrollDispatcherdispatchPreFling1.MediaMetadataCompat = nestedScrollDispatcherdispatchPreFling1.MediaMetadataCompat.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(nestedScrollDispatcherdispatchPreFling1.MediaMetadataCompat);
            nestedScrollDispatcherdispatchPreFling1.serializer = true;
        }
        this.read = true;
    }

    public KeyInputNode() {
    }
}
