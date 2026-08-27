package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class clearFocusI7lrPNg extends RangesKt {
    public static Method IconCompatParcelizer = null;
    public static boolean RemoteActionCompatParcelizer = false;
    public static Method read;
    public static Constructor serializer;
    public static Class write;
    public final Class MediaBrowserCompatMediaItem;
    public final Method MediaDescriptionCompat;
    public final Method MediaMetadataCompat;
    public final Method MediaSessionCompatQueueItem;
    public final Method MediaSessionCompatToken;
    public final Constructor PlaybackStateCompatCustomAction;
    public final Method RatingCompat;

    public final android.graphics.Typeface RemoteActionCompatParcelizer(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.MediaBrowserCompatMediaItem, 1);
            Array.set(objNewInstance, 0, obj);
            return (android.graphics.Typeface) this.RatingCompat.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            DrawableTransformation.read(e);
            return null;
        }
    }

    public final Method write(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = android.graphics.Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final boolean write(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.MediaMetadataCompat.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // kotlin.ranges.RangesKt
    public final android.graphics.Typeface read(Context context, FocusOrder focusOrder, Resources resources, int i) throws NoSuchMethodException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        getNext[] getnextArr = focusOrder.read;
        Method method = this.MediaMetadataCompat;
        if (method == null) {
            SentryLogcatAdapter.IconCompatParcelizer("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            IconCompatParcelizer();
            try {
                Object objNewInstance2 = serializer.newInstance(null);
                for (getNext getnext : getnextArr) {
                    File fileIconCompatParcelizer = coil3.util.IntPair.IconCompatParcelizer(context);
                    if (fileIconCompatParcelizer != null) {
                        try {
                            try {
                                inputStreamOpenRawResource = resources.openRawResource(getnext.serializer);
                                try {
                                    boolean zSerializer = coil3.util.IntPair.serializer(fileIconCompatParcelizer, inputStreamOpenRawResource);
                                    if (inputStreamOpenRawResource != null) {
                                        try {
                                            inputStreamOpenRawResource.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (!zSerializer) {
                                        fileIconCompatParcelizer.delete();
                                        return null;
                                    }
                                    if (!serializer(getnext.RatingCompat, objNewInstance2, fileIconCompatParcelizer.getPath(), getnext.RemoteActionCompatParcelizer)) {
                                        fileIconCompatParcelizer.delete();
                                        return null;
                                    }
                                    fileIconCompatParcelizer.delete();
                                } catch (Throwable th) {
                                    th = th;
                                    if (inputStreamOpenRawResource != null) {
                                        try {
                                            inputStreamOpenRawResource.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                inputStreamOpenRawResource = null;
                            }
                        } catch (RuntimeException unused3) {
                            fileIconCompatParcelizer.delete();
                            return null;
                        } catch (Throwable th3) {
                            fileIconCompatParcelizer.delete();
                            throw th3;
                        }
                    }
                }
                IconCompatParcelizer();
                try {
                    Object objNewInstance3 = Array.newInstance((Class<?>) write, 1);
                    Array.set(objNewInstance3, 0, objNewInstance2);
                    return (android.graphics.Typeface) read.invoke(null, objNewInstance3);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    DrawableTransformation.read((Throwable) e);
                    return null;
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                DrawableTransformation.read((Throwable) e2);
                return null;
            }
        }
        try {
            objNewInstance = this.PlaybackStateCompatCustomAction.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused4) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (getNext getnext2 : getnextArr) {
                if (!write(context, objNewInstance, getnext2.write, getnext2.read, getnext2.RatingCompat, getnext2.RemoteActionCompatParcelizer ? 1 : 0, FontVariationAxis.fromFontVariationSettings(getnext2.IconCompatParcelizer))) {
                    try {
                        this.MediaDescriptionCompat.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused5) {
                    }
                }
            }
            if (read(objNewInstance)) {
                return RemoteActionCompatParcelizer(objNewInstance);
            }
        }
        return null;
    }

    public static boolean serializer(int i, Object obj, String str, boolean z) throws NoSuchMethodException {
        IconCompatParcelizer();
        try {
            return ((Boolean) IconCompatParcelizer.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            DrawableTransformation.read(e);
            return false;
        }
    }

    public final boolean read(Object obj) {
        try {
            return ((Boolean) this.MediaSessionCompatToken.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public clearFocusI7lrPNg() throws NoSuchMethodException {
        Method methodWrite;
        Constructor<?> constructor;
        Method methodIconCompatParcelizer;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodIconCompatParcelizer = IconCompatParcelizer(cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodWrite = write((Class) cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            SentryLogcatAdapter.read("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodWrite = null;
            constructor = null;
            methodIconCompatParcelizer = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.MediaBrowserCompatMediaItem = cls;
        this.PlaybackStateCompatCustomAction = constructor;
        this.MediaMetadataCompat = methodIconCompatParcelizer;
        this.MediaSessionCompatQueueItem = method;
        this.MediaSessionCompatToken = method2;
        this.MediaDescriptionCompat = method3;
        this.RatingCompat = methodWrite;
    }

    public static void IconCompatParcelizer() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (RemoteActionCompatParcelizer) {
            return;
        }
        RemoteActionCompatParcelizer = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = android.graphics.Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            SentryLogcatAdapter.read("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        serializer = constructor;
        write = cls;
        IconCompatParcelizer = method2;
        read = method;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.RangesKt
    public final android.graphics.Typeface read(Context context, FocusOwnerdispatchRotaryEvent1[] focusOwnerdispatchRotaryEvent1Arr, int i) throws IOException {
        Object objNewInstance;
        Method method;
        android.graphics.Typeface typefaceRemoteActionCompatParcelizer;
        Object[] objArr = null;
        if (focusOwnerdispatchRotaryEvent1Arr.length >= 1) {
            Method method2 = this.MediaMetadataCompat;
            if (method2 == null) {
                SentryLogcatAdapter.IconCompatParcelizer("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method2 == null) {
                    int i2 = (i & 1) == 0 ? 400 : 700;
                    boolean z = (i & 2) != 0;
                    int i3 = Integer.MAX_VALUE;
                    FocusOwnerdispatchRotaryEvent1 focusOwnerdispatchRotaryEvent1 = null;
                    for (FocusOwnerdispatchRotaryEvent1 focusOwnerdispatchRotaryEvent2 : focusOwnerdispatchRotaryEvent1Arr) {
                        int iAbs = (Math.abs(focusOwnerdispatchRotaryEvent2.MediaSessionCompatQueueItem - i2) * 2) + (focusOwnerdispatchRotaryEvent2.RemoteActionCompatParcelizer == z ? 0 : 1);
                        if (focusOwnerdispatchRotaryEvent1 == null || i3 > iAbs) {
                            focusOwnerdispatchRotaryEvent1 = focusOwnerdispatchRotaryEvent2;
                            i3 = iAbs;
                        }
                    }
                    objArr = null;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(focusOwnerdispatchRotaryEvent1.write, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            android.graphics.Typeface typefaceBuild = new android.graphics.Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(focusOwnerdispatchRotaryEvent1.MediaSessionCompatQueueItem).setItalic(focusOwnerdispatchRotaryEvent1.RemoteActionCompatParcelizer).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                    return null;
                }
                HashMap map = new HashMap();
                for (FocusOwnerdispatchRotaryEvent1 focusOwnerdispatchRotaryEvent3 : focusOwnerdispatchRotaryEvent1Arr) {
                    if (focusOwnerdispatchRotaryEvent3.read == 0) {
                        Uri uri = focusOwnerdispatchRotaryEvent3.write;
                        if (!map.containsKey(uri)) {
                            map.put(uri, coil3.util.IntPair.RemoteActionCompatParcelizer(context, uri));
                        }
                    }
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                try {
                    objNewInstance = this.PlaybackStateCompatCustomAction.newInstance(null);
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                    objNewInstance = null;
                }
                if (objNewInstance != null) {
                    int length = focusOwnerdispatchRotaryEvent1Arr.length;
                    int i4 = 0;
                    boolean z2 = false;
                    while (true) {
                        method = this.MediaDescriptionCompat;
                        if (i4 >= length) {
                            Object[] objArr2 = objArr;
                            if (!z2) {
                                method.invoke(objNewInstance, objArr2);
                            } else if (read(objNewInstance) && (typefaceRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(objNewInstance)) != null) {
                                return android.graphics.Typeface.create(typefaceRemoteActionCompatParcelizer, i);
                            }
                            return null;
                        }
                        FocusOwnerdispatchRotaryEvent1 focusOwnerdispatchRotaryEvent4 = focusOwnerdispatchRotaryEvent1Arr[i4];
                        ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(focusOwnerdispatchRotaryEvent4.write);
                        if (byteBuffer != null) {
                            try {
                                if (!((Boolean) this.MediaSessionCompatQueueItem.invoke(objNewInstance, byteBuffer, Integer.valueOf(focusOwnerdispatchRotaryEvent4.serializer), null, Integer.valueOf(focusOwnerdispatchRotaryEvent4.MediaSessionCompatQueueItem), Integer.valueOf(focusOwnerdispatchRotaryEvent4.RemoteActionCompatParcelizer ? 1 : 0))).booleanValue()) {
                                    break;
                                }
                                z2 = true;
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        i4++;
                        objArr = null;
                        z2 = z2;
                    }
                    method.invoke(objNewInstance, null);
                    return null;
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return objArr;
    }

    public static Method IconCompatParcelizer(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // kotlin.ranges.RangesKt
    public final android.graphics.Typeface IconCompatParcelizer(Context context, Resources resources, int i, String str) {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        Method method = this.MediaMetadataCompat;
        if (method == null) {
            SentryLogcatAdapter.IconCompatParcelizer("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.PlaybackStateCompatCustomAction.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                if (!write(context, objNewInstance, str, 0, -1, -1, null)) {
                    try {
                        this.MediaDescriptionCompat.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (read(objNewInstance)) {
                    return RemoteActionCompatParcelizer(objNewInstance);
                }
            }
        } else {
            File fileIconCompatParcelizer = coil3.util.IntPair.IconCompatParcelizer(context);
            try {
                if (fileIconCompatParcelizer != null) {
                    try {
                        inputStreamOpenRawResource = resources.openRawResource(i);
                        try {
                            boolean zSerializer = coil3.util.IntPair.serializer(fileIconCompatParcelizer, inputStreamOpenRawResource);
                            if (inputStreamOpenRawResource != null) {
                                try {
                                    inputStreamOpenRawResource.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (!zSerializer) {
                                fileIconCompatParcelizer.delete();
                                return null;
                            }
                            android.graphics.Typeface typefaceCreateFromFile = android.graphics.Typeface.createFromFile(fileIconCompatParcelizer.getPath());
                            fileIconCompatParcelizer.delete();
                            return typefaceCreateFromFile;
                        } catch (Throwable th) {
                            th = th;
                            if (inputStreamOpenRawResource != null) {
                                try {
                                    inputStreamOpenRawResource.close();
                                } catch (IOException unused4) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStreamOpenRawResource = null;
                    }
                }
            } catch (RuntimeException unused5) {
                return null;
            } finally {
                fileIconCompatParcelizer.delete();
            }
        }
        return null;
    }
}
