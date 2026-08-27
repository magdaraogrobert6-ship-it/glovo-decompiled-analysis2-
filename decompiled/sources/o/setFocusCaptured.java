package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import androidx.core.provider.CallbackWrapper$2;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.net.zza;
import io.grpc.SynchronizationContext$1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class setFocusCaptured {
    public static final Object IconCompatParcelizer;
    public static final processDragGesture RemoteActionCompatParcelizer;
    public static final androidx.collection.LruCache serializer = new androidx.collection.LruCache(16);
    public static final ThreadPoolExecutor write;

    public static String write(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((scheduleInvalidationForOwner) list.get(i2)).serializer);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static android.graphics.Typeface RemoteActionCompatParcelizer(Context context, scheduleInvalidationForOwner scheduleinvalidationforowner, colorResource colorresource, int i, int i2) {
        androidx.camera.view.PendingValue pendingValue = (androidx.camera.view.PendingValue) colorresource.IconCompatParcelizer;
        getInternalPopup getinternalpopup = (getInternalPopup) colorresource.write;
        ArrayList arrayList = new ArrayList(1);
        int i3 = 0;
        Object obj = new Object[]{scheduleinvalidationforowner}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        String strWrite = write(i, Collections.unmodifiableList(arrayList));
        android.graphics.Typeface typeface = (android.graphics.Typeface) serializer.get(strWrite);
        if (typeface != null) {
            getinternalpopup.execute(new zza(pendingValue, 4, typeface));
            return typeface;
        }
        if (i2 == -1) {
            ArrayList arrayList2 = new ArrayList(1);
            Object obj2 = new Object[]{scheduleinvalidationforowner}[0];
            Objects.requireNonNull(obj2);
            arrayList2.add(obj2);
            FocusOwnerdispatchKeyEvent1 focusOwnerdispatchKeyEvent1 = read(strWrite, context, Collections.unmodifiableList(arrayList2), i);
            colorresource.serializer(focusOwnerdispatchKeyEvent1);
            return focusOwnerdispatchKeyEvent1.serializer;
        }
        try {
            try {
                try {
                    FocusOwnerdispatchKeyEvent1 focusOwnerdispatchKeyEvent2 = (FocusOwnerdispatchKeyEvent1) write.submit(new resetFocus3ESFkO8(strWrite, context, scheduleinvalidationforowner, i, 0)).get(i2, TimeUnit.MILLISECONDS);
                    colorresource.serializer(focusOwnerdispatchKeyEvent2);
                    return focusOwnerdispatchKeyEvent2.serializer;
                } catch (InterruptedException e) {
                    throw e;
                }
            } catch (ExecutionException e2) {
                throw new RuntimeException(e2);
            } catch (TimeoutException unused) {
                throw new InterruptedException("timeout");
            }
        } catch (InterruptedException unused2) {
            getinternalpopup.execute(new CallbackWrapper$2(pendingValue, -3, i3));
            return null;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new r8lambdaXjeS_gq8hmJyKRkNmQwAUeFh2g(2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        write = threadPoolExecutor;
        IconCompatParcelizer = new Object();
        RemoteActionCompatParcelizer = new processDragGesture(0);
    }

    public static android.graphics.Typeface read(Context context, List list, int i, colorResource colorresource) {
        String strWrite = write(i, list);
        android.graphics.Typeface typeface = (android.graphics.Typeface) serializer.get(strWrite);
        if (typeface != null) {
            ((getInternalPopup) colorresource.write).execute(new zza((androidx.camera.view.PendingValue) colorresource.IconCompatParcelizer, 4, typeface));
            return typeface;
        }
        setScreenFlashOverlayColor setscreenflashoverlaycolor = new setScreenFlashOverlayColor(1, colorresource);
        synchronized (IconCompatParcelizer) {
            processDragGesture processdraggesture = RemoteActionCompatParcelizer;
            ArrayList arrayList = (ArrayList) processdraggesture.get(strWrite);
            if (arrayList != null) {
                arrayList.add(setscreenflashoverlaycolor);
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(setscreenflashoverlaycolor);
            processdraggesture.put(strWrite, arrayList2);
            resetFocus3ESFkO8 resetfocus3esfko8 = new resetFocus3ESFkO8(strWrite, context, list, i, 1);
            ThreadPoolExecutor threadPoolExecutor = write;
            setScreenFlashOverlayColor setscreenflashoverlaycolor2 = new setScreenFlashOverlayColor(2, strWrite);
            Handler handler = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
            SynchronizationContext$1 synchronizationContext$1 = new SynchronizationContext$1();
            synchronizationContext$1.write = resetfocus3esfko8;
            synchronizationContext$1.IconCompatParcelizer = setscreenflashoverlaycolor2;
            synchronizationContext$1.serializer = handler;
            threadPoolExecutor.execute(synchronizationContext$1);
            return null;
        }
    }

    public static FocusOwnerdispatchKeyEvent1 read(String str, Context context, List list, int i) {
        int i2;
        android.graphics.Typeface typeface;
        androidx.collection.LruCache lruCache = serializer;
        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("getFontSync");
        try {
            android.graphics.Typeface typeface2 = (android.graphics.Typeface) lruCache.get(str);
            if (typeface2 != null) {
                FocusOwnerdispatchKeyEvent1 focusOwnerdispatchKeyEvent1 = new FocusOwnerdispatchKeyEvent1(typeface2);
                Trace.endSection();
                return focusOwnerdispatchKeyEvent1;
            }
            try {
                CSSParseException cSSParseExceptionSerializer = requestOwnerFocus7o62pno.serializer(context, list);
                List list2 = (List) cSSParseExceptionSerializer.RemoteActionCompatParcelizer;
                int i3 = cSSParseExceptionSerializer.IconCompatParcelizer;
                if (i3 == 0) {
                    FocusOwnerdispatchRotaryEvent1[] focusOwnerdispatchRotaryEvent1Arr = (FocusOwnerdispatchRotaryEvent1[]) list2.get(0);
                    if (focusOwnerdispatchRotaryEvent1Arr == null || focusOwnerdispatchRotaryEvent1Arr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = focusOwnerdispatchRotaryEvent1Arr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = focusOwnerdispatchRotaryEvent1Arr[i4].read;
                            if (i5 != 0) {
                                if (i5 >= 0) {
                                    i2 = i5;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    FocusOwnerdispatchKeyEvent1 focusOwnerdispatchKeyEvent2 = new FocusOwnerdispatchKeyEvent1(i2);
                    Trace.endSection();
                    return focusOwnerdispatchKeyEvent2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    FocusOwnerdispatchRotaryEvent1[] focusOwnerdispatchRotaryEvent1Arr2 = (FocusOwnerdispatchRotaryEvent1[]) list2.get(0);
                    RangesKt rangesKt = FocusOrderModifierKtfocusOrder1.RemoteActionCompatParcelizer;
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("TypefaceCompat.createFromFontInfo");
                    try {
                        typeface = FocusOrderModifierKtfocusOrder1.RemoteActionCompatParcelizer.read(context, focusOwnerdispatchRotaryEvent1Arr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    RangesKt rangesKt2 = FocusOrderModifierKtfocusOrder1.RemoteActionCompatParcelizer;
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typeface = FocusOrderModifierKtfocusOrder1.RemoteActionCompatParcelizer.read(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typeface == null) {
                    FocusOwnerdispatchKeyEvent1 focusOwnerdispatchKeyEvent3 = new FocusOwnerdispatchKeyEvent1(-3);
                    Trace.endSection();
                    return focusOwnerdispatchKeyEvent3;
                }
                lruCache.put(str, typeface);
                FocusOwnerdispatchKeyEvent1 focusOwnerdispatchKeyEvent4 = new FocusOwnerdispatchKeyEvent1(typeface);
                Trace.endSection();
                return focusOwnerdispatchKeyEvent4;
            } catch (PackageManager.NameNotFoundException unused) {
                FocusOwnerdispatchKeyEvent1 focusOwnerdispatchKeyEvent5 = new FocusOwnerdispatchKeyEvent1(-1);
                Trace.endSection();
                return focusOwnerdispatchKeyEvent5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
