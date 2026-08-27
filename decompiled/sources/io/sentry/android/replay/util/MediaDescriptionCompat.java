package io.sentry.android.replay.util;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.riemann.location.common.utils.Constant;
import io.sentry.util.ParcelableVolumeInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import o.FocusOrder;
import o.focusTarget;
import o.getNext;
import o.onFocusEvent;
import o.scheduleInvalidationForOwner;
import o.setEnd;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MediaDescriptionCompat {
    public static List RemoteActionCompatParcelizer(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static focusTarget write(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        int i2;
        ArrayList arrayList;
        ?? r3;
        Throwable th;
        ?? r4;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        Resources resources2 = resources;
        TimeUnit timeUnit = TimeUnit.DAYS;
        do {
            next = xmlResourceParser.next();
            i = 2;
            i2 = 1;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            serializer(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), onFocusEvent.FontFamily);
        int i3 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i4 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, Constant.ERROR_UNKNOWN);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList2 = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), onFocusEvent.FontFamilyFont);
                        int i5 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i6 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i7 = typedArrayObtainAttributes2.getInt(i6, 0);
                        int i8 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i8, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i8);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            serializer(xmlResourceParser);
                        }
                        arrayList2.add(new getNext(i5, i7, resourceId2, string7, string6, z));
                    } else {
                        serializer(xmlResourceParser);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return new FocusOrder((getNext[]) arrayList2.toArray(new getNext[0]));
        }
        List listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(resources2, resourceId);
        ArrayList arrayList3 = new ArrayList();
        while (xmlResourceParser.next() != i4) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), onFocusEvent.FontFamilyProviderFallback);
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i3);
                        String string9 = typedArrayObtainAttributes3.getString(i2);
                        String string10 = typedArrayObtainAttributes3.getString(i);
                        if (string8 == null) {
                            r3 = typedArrayObtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i4) {
                            try {
                                serializer(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                r4 = typedArrayObtainAttributes3;
                            }
                        }
                        r3 = typedArrayObtainAttributes3;
                        arrayList = arrayList3;
                        try {
                            scheduleInvalidationForOwner scheduleinvalidationforowner = new scheduleInvalidationForOwner(string, string2, string8, string9, string10, listRemoteActionCompatParcelizer);
                            if (r3 instanceof AutoCloseable) {
                                ((AutoCloseable) r3).close();
                            } else if (r3 instanceof ExecutorService) {
                                ExecutorService executorService = (ExecutorService) r3;
                                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService.isTerminated())) {
                                    executorService.shutdown();
                                    boolean z2 = false;
                                    while (!zIsTerminated2) {
                                        try {
                                            zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                                        } catch (InterruptedException unused) {
                                            if (!z2) {
                                                executorService.shutdownNow();
                                                z2 = true;
                                            }
                                        }
                                    }
                                    if (z2) {
                                        Thread.currentThread().interrupt();
                                    }
                                }
                            } else {
                                r3.recycle();
                            }
                            arrayList.add(scheduleinvalidationforowner);
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        th = th3;
                    } catch (Throwable th4) {
                        th = th4;
                        r3 = typedArrayObtainAttributes3;
                    }
                    th = th;
                    r4 = r3;
                    if (r4 == 0) {
                        throw th;
                    }
                    try {
                        if (r4 instanceof AutoCloseable) {
                            ((AutoCloseable) r4).close();
                            throw th;
                        }
                        if (!(r4 instanceof ExecutorService)) {
                            r4.recycle();
                            throw th;
                        }
                        ExecutorService executorService2 = (ExecutorService) r4;
                        if (executorService2 == ForkJoinPool.commonPool() || (zIsTerminated = executorService2.isTerminated())) {
                            throw th;
                        }
                        executorService2.shutdown();
                        boolean z3 = false;
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService2.awaitTermination(1L, timeUnit);
                            } catch (InterruptedException unused2) {
                                if (!z3) {
                                    executorService2.shutdownNow();
                                    z3 = true;
                                }
                            }
                        }
                        if (!z3) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        throw th;
                    } catch (Throwable th5) {
                        th.addSuppressed(th5);
                        throw th;
                    }
                }
                arrayList = arrayList3;
                serializer(xmlResourceParser);
                integer = integer;
                integer2 = integer2;
                arrayList3 = arrayList;
                i = 2;
                i2 = 1;
                i3 = 0;
                i4 = 3;
                resources2 = resources;
            }
        }
        int i9 = integer2;
        ArrayList arrayList4 = arrayList3;
        int i10 = integer;
        if (!arrayList4.isEmpty()) {
            return new setEnd(arrayList4, i10, i9, string5);
        }
        if (string3 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList4.add(new scheduleInvalidationForOwner(string, string2, string3, null, null, listRemoteActionCompatParcelizer));
        if (string4 != null) {
            arrayList4.add(new scheduleInvalidationForOwner(string, string2, string4, null, null, listRemoteActionCompatParcelizer));
        }
        return new setEnd(arrayList4, i10, i9, string5);
    }

    public static void serializer(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static final boolean read(ParcelableVolumeInfo parcelableVolumeInfo, Double d) {
        parcelableVolumeInfo.getClass();
        return d != null && d.doubleValue() >= parcelableVolumeInfo.IconCompatParcelizer();
    }
}
