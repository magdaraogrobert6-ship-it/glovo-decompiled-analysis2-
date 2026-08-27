package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public abstract class getBevelLxFBmk8 {
    public static final HashMap IconCompatParcelizer = new HashMap();
    public static final HashSet RemoteActionCompatParcelizer = new HashSet();
    public static final byte[] read = {80, 75, 3, 4};
    public static final byte[] write = {31, -117, 8};

    public static getRepeated3opZhB0 IconCompatParcelizer(Context context, ZipInputStream zipInputStream, String str) {
        StrokeJoinCompanion strokeJoinCompanion;
        getMirror3opZhB0 getmirror3opzhb0;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            strokeJoinCompanion = null;
        } else {
            try {
                strokeJoinCompanion = getModelxdoWZVw.read.read(str);
            } catch (IOException e) {
                return new getRepeated3opZhB0(e);
            }
        }
        if (strokeJoinCompanion != null) {
            return new getRepeated3opZhB0(strokeJoinCompanion);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        StrokeJoinCompanion strokeJoinCompanion2 = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                GifDrawableTransformation gifDrawableTransformation = new GifDrawableTransformation(Okio.RemoteActionCompatParcelizer(zipInputStream));
                String[] strArr = com.airbnb.lottie.parser.moshi.JsonReader.IconCompatParcelizer;
                strokeJoinCompanion2 = serializer(new com.airbnb.lottie.parser.moshi.JsonUtf8Reader(gifDrawableTransformation), (String) null, false).serializer;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new getRepeated3opZhB0(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStreamWrite = getPositionInRoot.write(new FileOutputStream(file), file);
                    try {
                        FileOutputStream fileOutputStreamWrite2 = getPositionInRoot.write(new FileOutputStream(file), file);
                        try {
                            byte[] bArr = new byte[androidx.compose.ui.graphics.Fields.TransformOrigin];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStreamWrite2.write(bArr, 0, i);
                            }
                            fileOutputStreamWrite2.flush();
                            fileOutputStreamWrite2.close();
                            fileOutputStreamWrite.close();
                            android.graphics.Typeface typefaceCreateFromFile = android.graphics.Typeface.createFromFile(file);
                            if (!file.delete()) {
                                getD50Xyzui_graphics.IconCompatParcelizer("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                            }
                            map2.put(str3, typefaceCreateFromFile);
                        } catch (Throwable th) {
                            try {
                                fileOutputStreamWrite2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileOutputStreamWrite.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    getD50Xyzui_graphics.IconCompatParcelizer("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th5);
                }
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (strokeJoinCompanion2 == null) {
            return new getRepeated3opZhB0(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) strokeJoinCompanion2.IconCompatParcelizer()).values().iterator();
            do {
                if (!it.hasNext()) {
                    getmirror3opzhb0 = null;
                    break;
                }
                getmirror3opzhb0 = (getMirror3opZhB0) it.next();
            } while (!getmirror3opzhb0.RemoteActionCompatParcelizer.equals(str4));
            if (getmirror3opzhb0 != null) {
                getmirror3opzhb0.serializer = newD50Xyzui_graphics.write((Bitmap) entry.getValue(), getmirror3opzhb0.MediaSessionCompatQueueItem, getmirror3opzhb0.write);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (getName getname : strokeJoinCompanion2.serializer.values()) {
                if (getname.read.equals(entry2.getKey())) {
                    getname.RemoteActionCompatParcelizer = (android.graphics.Typeface) entry2.getValue();
                    z = true;
                }
            }
            if (!z) {
                getD50Xyzui_graphics.IconCompatParcelizer("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) strokeJoinCompanion2.IconCompatParcelizer()).entrySet().iterator();
            while (it2.hasNext()) {
                getMirror3opZhB0 getmirror3opzhb1 = (getMirror3opZhB0) ((Map.Entry) it2.next()).getValue();
                if (getmirror3opzhb1 == null) {
                    return null;
                }
                String str5 = getmirror3opzhb1.RemoteActionCompatParcelizer;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            getmirror3opzhb1.serializer = newD50Xyzui_graphics.write(bitmapDecodeByteArray, getmirror3opzhb1.MediaSessionCompatQueueItem, getmirror3opzhb1.write);
                        }
                    } catch (IllegalArgumentException e2) {
                        getD50Xyzui_graphics.IconCompatParcelizer("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            getModelxdoWZVw.read.RemoteActionCompatParcelizer.put(str, strokeJoinCompanion2);
        }
        return new getRepeated3opZhB0(strokeJoinCompanion2);
    }

    public static void IconCompatParcelizer() {
        ArrayList arrayList = new ArrayList(RemoteActionCompatParcelizer);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
    }

    public static getRepeated3opZhB0 serializer(CallbackException callbackException, String str) {
        GifDrawableTransformation gifDrawableTransformation = new GifDrawableTransformation(callbackException);
        String[] strArr = com.airbnb.lottie.parser.moshi.JsonReader.IconCompatParcelizer;
        return serializer(new com.airbnb.lottie.parser.moshi.JsonUtf8Reader(gifDrawableTransformation), str, true);
    }

    public static Boolean IconCompatParcelizer(GifDrawableTransformation gifDrawableTransformation, byte[] bArr) {
        try {
            GifDrawableTransformation gifDrawableTransformationMediaDescriptionCompat = gifDrawableTransformation.MediaDescriptionCompat();
            for (byte b : bArr) {
                if (gifDrawableTransformationMediaDescriptionCompat.MediaBrowserCompatMediaItem() != b) {
                    return Boolean.FALSE;
                }
            }
            gifDrawableTransformationMediaDescriptionCompat.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            getD50Xyzui_graphics.write.getClass();
            getMiterLxFBmk8 getmiterlxfbmk8 = getRoundLxFBmk8.read;
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static getRepeated3opZhB0 serializer(com.airbnb.lottie.parser.moshi.JsonUtf8Reader jsonUtf8Reader, String str, boolean z) {
        try {
            StrokeJoinCompanion strokeJoinCompanion = str == null ? null : getModelxdoWZVw.read.read(str);
            if (strokeJoinCompanion != null) {
                return new getRepeated3opZhB0(strokeJoinCompanion);
            }
            StrokeJoinCompanion strokeJoinCompanionSerializer = Connector.serializer(jsonUtf8Reader);
            if (str != null) {
                getModelxdoWZVw.read.RemoteActionCompatParcelizer.put(str, strokeJoinCompanionSerializer);
            }
            return new getRepeated3opZhB0(strokeJoinCompanionSerializer);
        } catch (Exception e) {
            return new getRepeated3opZhB0(e);
        } finally {
            if (z) {
                newD50Xyzui_graphics.write(jsonUtf8Reader);
            }
        }
    }

    public static TransformOrigin serializer(final String str, Callable callable, Runnable runnable) {
        StrokeJoinCompanion strokeJoinCompanion = str == null ? null : getModelxdoWZVw.read.read(str);
        TransformOrigin transformOrigin = strokeJoinCompanion != null ? new TransformOrigin(strokeJoinCompanion) : null;
        HashMap map = IconCompatParcelizer;
        if (str != null && map.containsKey(str)) {
            transformOrigin = (TransformOrigin) map.get(str);
        }
        if (transformOrigin != null) {
            if (runnable != null) {
                runnable.run();
            }
            return transformOrigin;
        }
        TransformOrigin transformOrigin2 = new TransformOrigin(callable);
        if (str != null) {
            final int i = 0;
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            transformOrigin2.read(new getFrameworkTileModeDecal() { // from class: o.SweepGradient
                @Override // o.getFrameworkTileModeDecal
                public final void serializer(Object obj) {
                    int i2 = i;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    if (i2 != 0) {
                        HashMap map2 = getBevelLxFBmk8.IconCompatParcelizer;
                        map2.remove(str2);
                        atomicBoolean2.set(true);
                        if (map2.size() == 0) {
                            getBevelLxFBmk8.IconCompatParcelizer();
                            return;
                        }
                        return;
                    }
                    HashMap map3 = getBevelLxFBmk8.IconCompatParcelizer;
                    map3.remove(str2);
                    atomicBoolean2.set(true);
                    if (map3.size() == 0) {
                        getBevelLxFBmk8.IconCompatParcelizer();
                    }
                }
            });
            final int i2 = 1;
            transformOrigin2.serializer(new getFrameworkTileModeDecal() { // from class: o.SweepGradient
                @Override // o.getFrameworkTileModeDecal
                public final void serializer(Object obj) {
                    int i3 = i2;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    if (i3 != 0) {
                        HashMap map2 = getBevelLxFBmk8.IconCompatParcelizer;
                        map2.remove(str2);
                        atomicBoolean2.set(true);
                        if (map2.size() == 0) {
                            getBevelLxFBmk8.IconCompatParcelizer();
                            return;
                        }
                        return;
                    }
                    HashMap map3 = getBevelLxFBmk8.IconCompatParcelizer;
                    map3.remove(str2);
                    atomicBoolean2.set(true);
                    if (map3.size() == 0) {
                        getBevelLxFBmk8.IconCompatParcelizer();
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, transformOrigin2);
                if (map.size() == 1) {
                    IconCompatParcelizer();
                }
            }
        }
        return transformOrigin2;
    }
}
