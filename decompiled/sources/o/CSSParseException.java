package o;

import android.view.View;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes4.dex */
public final class CSSParseException implements isCaptured {
    public int IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public void IconCompatParcelizer(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.RemoteActionCompatParcelizer;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.RemoteActionCompatParcelizer = Arrays.copyOf(cArr, i3);
        }
    }

    public HashMap IconCompatParcelizer(Map map, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), read(brazeActionParserExternalSyntheticLambda0, obj2));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    public void RemoteActionCompatParcelizer() {
        r8lambdakUrnAtXdiHljPizoNhWOREUrS_M r8lambdakurnatxdihljpizonhworeurs_m = r8lambdakUrnAtXdiHljPizoNhWOREUrS_M.write;
        char[] cArr = (char[]) this.RemoteActionCompatParcelizer;
        r8lambdakurnatxdihljpizonhworeurs_m.getClass();
        cArr.getClass();
        synchronized (r8lambdakurnatxdihljpizonhworeurs_m) {
            int i = r8lambdakurnatxdihljpizonhworeurs_m.serializer;
            if (cArr.length + i < r8lambdaz2wV4sGc66eGoMYXQDuLfk2RUNc.IconCompatParcelizer) {
                r8lambdakurnatxdihljpizonhworeurs_m.serializer = i + cArr.length;
                r8lambdakurnatxdihljpizonhworeurs_m.read.addLast(cArr);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    public Object read(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, Object obj) {
        Object objSerializer;
        HashSet hashSet = (HashSet) this.RemoteActionCompatParcelizer;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof java.util.Locale) {
            return obj.toString();
        }
        if (obj instanceof AtomicIntegerArray) {
            return io.sentry.util.write.write((AtomicIntegerArray) obj);
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (obj instanceof URI) {
            return obj.toString();
        }
        if (obj instanceof InetAddress) {
            return obj.toString();
        }
        if (obj instanceof UUID) {
            return obj.toString();
        }
        if (obj instanceof Currency) {
            return obj.toString();
        }
        if (obj instanceof Calendar) {
            return io.sentry.util.write.serializer((Calendar) obj);
        }
        if (obj.getClass().isEnum()) {
            return obj.toString();
        }
        if (hashSet.contains(obj)) {
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
            return obj.toString();
        }
        hashSet.add(obj);
        try {
            if (hashSet.size() > this.IconCompatParcelizer) {
                hashSet.remove(obj);
                brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            try {
                if (obj.getClass().isArray()) {
                    objSerializer = new ArrayList();
                    for (Object obj2 : (Object[]) obj) {
                        objSerializer.add(read(brazeActionParserExternalSyntheticLambda0, obj2));
                    }
                } else if (obj instanceof Collection) {
                    objSerializer = new ArrayList();
                    Iterator it = ((Collection) obj).iterator();
                    while (it.hasNext()) {
                        objSerializer.add(read(brazeActionParserExternalSyntheticLambda0, it.next()));
                    }
                } else if (obj instanceof Map) {
                    objSerializer = IconCompatParcelizer((Map) obj, brazeActionParserExternalSyntheticLambda0);
                } else {
                    objSerializer = serializer(brazeActionParserExternalSyntheticLambda0, obj);
                    if (objSerializer.isEmpty()) {
                        objSerializer = obj.toString();
                    }
                }
                return objSerializer;
            } catch (Exception e) {
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Not serializing object due to throwing sub-path.", e);
                return null;
            }
        } finally {
            hashSet.remove(obj);
        }
    }

    @Override // o.isCaptured
    public boolean read(View view) {
        ((BottomSheetBehavior) this.RemoteActionCompatParcelizer).setState(this.IconCompatParcelizer);
        return true;
    }

    public void write(accessgetPointscp accessgetpointscp, accessrewindjd accessrewindjdVar, Map map, long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.RemoteActionCompatParcelizer;
        Object arrayList = linkedHashMap.get(accessgetpointscp);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(accessgetpointscp, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        toComposeRect tocomposerect = new toComposeRect(new java.lang.ref.WeakReference(accessrewindjdVar), map, j);
        if (arrayList2.isEmpty()) {
            arrayList2.add(tocomposerect);
        } else {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                toComposeRect tocomposerect2 = (toComposeRect) arrayList2.get(i);
                if (j >= tocomposerect2.write()) {
                    if (tocomposerect2.IconCompatParcelizer().get() == accessrewindjdVar) {
                        arrayList2.set(i, tocomposerect);
                        break;
                    } else {
                        arrayList2.add(i, tocomposerect);
                        break;
                    }
                }
            }
        }
        serializer();
    }

    public void read(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        IconCompatParcelizer(this.IconCompatParcelizer, length);
        str.getChars(0, str.length(), (char[]) this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
        this.IconCompatParcelizer += length;
    }

    public void IconCompatParcelizer(int i, onPreDraw onpredraw) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            onPreDraw onpredraw2 = ((onPreDraw[]) this.RemoteActionCompatParcelizer)[i2];
            onpredraw2.getClass();
            if (removeNodeAtDepth.read(0L, onpredraw.MediaMetadataCompat - onpredraw2.MediaMetadataCompat) <= 0) {
                break;
            }
            onpredraw2.MediaSessionCompatQueueItem = i;
            ((onPreDraw[]) this.RemoteActionCompatParcelizer)[i] = onpredraw2;
            i = i2;
        }
        ((onPreDraw[]) this.RemoteActionCompatParcelizer)[i] = onpredraw;
        onpredraw.MediaSessionCompatQueueItem = i;
    }

    public HashMap serializer(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, Object obj) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap map = new HashMap();
        for (Field field : declaredFields) {
            if (!java.lang.reflect.Modifier.isTransient(field.getModifiers()) && !java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, read(brazeActionParserExternalSyntheticLambda0, field.get(obj)));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, ff$$ExternalSyntheticOutline0.m("Cannot access field ", name, "."), new Object[0]);
                }
            }
        }
        return map;
    }

    public void serializer() {
        int i = this.IconCompatParcelizer;
        this.IconCompatParcelizer = i + 1;
        if (i >= 10) {
            this.IconCompatParcelizer = 0;
            Iterator it = ((LinkedHashMap) this.RemoteActionCompatParcelizer).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    toComposeRect tocomposerect = (toComposeRect) onContentCardDismissed.MediaMetadataCompat((List) arrayList);
                    if ((tocomposerect != null ? (accessrewindjd) tocomposerect.IconCompatParcelizer().get() : null) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((toComposeRect) arrayList.get(i4)).IconCompatParcelizer().get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    public CSSParseException(byte b, int i) {
        this.read = i;
        if (i == 3) {
            this.RemoteActionCompatParcelizer = new LinkedHashMap();
        } else {
            this.IconCompatParcelizer = 1;
            this.RemoteActionCompatParcelizer = Collections.singletonList(null);
        }
    }

    public void read(onPreDraw onpredraw) {
        onPreDraw onpredraw2;
        int i = onpredraw.MediaSessionCompatQueueItem;
        if (i == -1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
            return;
        }
        int i2 = this.IconCompatParcelizer;
        onPreDraw onpredraw3 = ((onPreDraw[]) this.RemoteActionCompatParcelizer)[i2];
        onpredraw3.getClass();
        onpredraw.MediaSessionCompatQueueItem = -1;
        ((onPreDraw[]) this.RemoteActionCompatParcelizer)[i2] = null;
        this.IconCompatParcelizer = i2 - 1;
        if (onpredraw == onpredraw3) {
            return;
        }
        int i3 = removeNodeAtDepth.read(0L, onpredraw3.MediaMetadataCompat - onpredraw.MediaMetadataCompat);
        if (i3 == 0) {
            ((onPreDraw[]) this.RemoteActionCompatParcelizer)[i] = onpredraw3;
            onpredraw3.MediaSessionCompatQueueItem = i;
            return;
        }
        if (i3 >= 0) {
            IconCompatParcelizer(i, onpredraw3);
            return;
        }
        while (true) {
            int i4 = i << 1;
            int i5 = i4 + 1;
            int i6 = this.IconCompatParcelizer;
            if (i5 > i6) {
                if (i4 > i6) {
                    break;
                }
                onpredraw2 = ((onPreDraw[]) this.RemoteActionCompatParcelizer)[i4];
                onpredraw2.getClass();
            } else {
                onpredraw2 = ((onPreDraw[]) this.RemoteActionCompatParcelizer)[i4];
                onpredraw2.getClass();
                onPreDraw onpredraw4 = ((onPreDraw[]) this.RemoteActionCompatParcelizer)[i5];
                onpredraw4.getClass();
                if (removeNodeAtDepth.read(0L, onpredraw4.MediaMetadataCompat - onpredraw2.MediaMetadataCompat) >= 0) {
                    onpredraw2 = onpredraw4;
                }
            }
            if (removeNodeAtDepth.read(0L, onpredraw2.MediaMetadataCompat - onpredraw3.MediaMetadataCompat) <= 0) {
                break;
            }
            int i7 = onpredraw2.MediaSessionCompatQueueItem;
            onpredraw2.MediaSessionCompatQueueItem = i;
            ((onPreDraw[]) this.RemoteActionCompatParcelizer)[i] = onpredraw2;
            i = i7;
        }
        ((onPreDraw[]) this.RemoteActionCompatParcelizer)[i] = onpredraw3;
        onpredraw3.MediaSessionCompatQueueItem = i;
    }

    public String toString() {
        return this.read != 8 ? super.toString() : new String((char[]) this.RemoteActionCompatParcelizer, 0, this.IconCompatParcelizer);
    }

    public /* synthetic */ CSSParseException(Object obj, int i, int i2) {
        this.read = i2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = i;
    }

    public CSSParseException(int i) {
        this.read = 7;
        this.RemoteActionCompatParcelizer = new HashSet();
        this.IconCompatParcelizer = i;
    }

    public /* synthetic */ CSSParseException(int i, char c) {
        this.read = i;
    }

    public CSSParseException(ArrayList arrayList) {
        this.read = 2;
        this.IconCompatParcelizer = 0;
        this.RemoteActionCompatParcelizer = arrayList;
    }
}
