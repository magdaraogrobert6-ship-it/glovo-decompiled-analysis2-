package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.measurement.zzmb;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getOnPreKeyEvent {
    protected int IconCompatParcelizer;

    public abstract int IconCompatParcelizer(getDispatcher getdispatcher);

    public final byte[] removeOnUserLeaveHintListener() {
        try {
            SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt = (SoftwareKeyboardInterceptionModifierKt) this;
            int lifecycleRegistry1 = softwareKeyboardInterceptionModifierKt.getLifecycleRegistry1();
            byte[] bArr = new byte[lifecycleRegistry1];
            KeyInputModifierKt keyInputModifierKt = new KeyInputModifierKt(bArr, lifecycleRegistry1);
            softwareKeyboardInterceptionModifierKt.RemoteActionCompatParcelizer(keyInputModifierKt);
            if (lifecycleRegistry1 - keyInputModifierKt.MediaMetadataCompat == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(d$$ExternalSyntheticOutline0.m(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public static void read(Iterable iterable, List list) {
        Charset charset = accessonPreScrollOzD1aCkjd.write;
        iterable.getClass();
        if (iterable instanceof NestedScrollDispatcher) {
            List list2 = ((NestedScrollDispatcher) iterable).read();
            NestedScrollDispatcher nestedScrollDispatcher = (NestedScrollDispatcher) list;
            int size = list.size();
            for (Object obj : list2) {
                if (obj == null) {
                    int size2 = nestedScrollDispatcher.size() - size;
                    StringBuilder sb = new StringBuilder(String.valueOf(size2).length() + 26);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String string = sb.toString();
                    int size3 = nestedScrollDispatcher.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(string);
                            return;
                        }
                        nestedScrollDispatcher.remove(size3);
                    }
                } else if (obj instanceof onPreviewKeyEvent) {
                    nestedScrollDispatcher.RemoteActionCompatParcelizer();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    onPreviewKeyEvent.IconCompatParcelizer(bArr, 0, bArr.length);
                    nestedScrollDispatcher.RemoteActionCompatParcelizer();
                } else {
                    nestedScrollDispatcher.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof setNestedScrollNodeui) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof setScopeui) {
                setScopeui setscopeui = (setScopeui) list;
                int i = setscopeui.RemoteActionCompatParcelizer + size4;
                int length = setscopeui.IconCompatParcelizer.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        setscopeui.IconCompatParcelizer = Arrays.copyOf(setscopeui.IconCompatParcelizer, length);
                    } else {
                        setscopeui.IconCompatParcelizer = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    zzmb.IconCompatParcelizer(size5, list);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list3 = (List) iterable;
        int size6 = list3.size();
        for (int i2 = 0; i2 < size6; i2++) {
            Object obj3 = list3.get(i2);
            if (obj3 == null) {
                zzmb.IconCompatParcelizer(size5, list);
                throw null;
            }
            list.add(obj3);
        }
    }
}
