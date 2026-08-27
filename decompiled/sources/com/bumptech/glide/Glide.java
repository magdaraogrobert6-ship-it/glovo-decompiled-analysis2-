package com.bumptech.glide;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.compose.ui.graphics.Fields;
import androidx.room.Room;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.memory.MemoryCacheService;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.dynamite.zzj;
import com.google.android.gms.location.DeviceOrientationRequest;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.TuplesKt;
import o.CanvasDrawScope;
import o.DrawScoperecord1;
import o.Fill;
import o.FlingCancellationException;
import o.ImageKt;
import o.OklabCompanion;
import o.WhitePoint;
import o.Xyz;
import o.accessgetAbsolutecp;
import o.accessgetApparentToRealOffsetnOccac;
import o.accessgetPerceptualcp;
import o.accessgetRelativecp;
import o.accesssetHasRetrievedMethodcp;
import o.area;
import o.clamp;
import o.configurePaint2qPWKa0;
import o.generateOetflambda0;
import o.getD;
import o.getF;
import o.getGamma;
import o.toContentCaptureSession;
import o.toXyzui_graphics;

/* JADX INFO: loaded from: classes.dex */
public final class Glide implements ComponentCallbacks2 {
    public static volatile boolean IconCompatParcelizer;
    public static volatile Glide serializer;
    public final ArrayList MediaDescriptionCompat = new ArrayList();
    public final WhitePoint MediaMetadataCompat;
    public final DrawScoperecord1 MediaSessionCompatQueueItem;
    public final accessgetPerceptualcp RatingCompat;
    public final zzj RemoteActionCompatParcelizer;
    public final getD read;
    public final getF write;

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    public static void RemoteActionCompatParcelizer(Context context, OklabCompanion oklabCompanion) {
        getD tocontentcapturesession;
        ImageKt imageKt = new ImageKt(0);
        generateOetflambda0 generateoetflambda0 = new generateOetflambda0(1);
        FlingCancellationException flingCancellationException = new FlingCancellationException(5);
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        Log.isLoggable("ManifestParser", 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), Fields.SpotShadowColor);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        Room.read(str);
                        throw null;
                    }
                }
                Log.isLoggable("ManifestParser", 3);
            } else {
                Log.isLoggable("ManifestParser", 3);
            }
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("ManifestParser", 6)) {
                SentryLogcatAdapter.read("ManifestParser", "Failed to parse glide modules", e);
            }
        }
        if (oklabCompanion != null && !OklabCompanion.RemoteActionCompatParcelizer().isEmpty()) {
            OklabCompanion.RemoteActionCompatParcelizer();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw ff$$ExternalSyntheticOutline0.m(it);
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw ff$$ExternalSyntheticOutline0.m(it2);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            Xyz xyz = new Xyz();
            if (clamp.write == 0) {
                clamp.write = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i = clamp.write;
            if (!TextUtils.isEmpty("source")) {
                PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
                CanvasDrawScope canvasDrawScope = new CanvasDrawScope(xyz, "source", false);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                clamp clampVar = new clamp(new ThreadPoolExecutor(i, i, 0L, timeUnit, priorityBlockingQueue, canvasDrawScope));
                Xyz xyz2 = new Xyz();
                if (!TextUtils.isEmpty("disk-cache")) {
                    clamp clampVar2 = new clamp(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new CanvasDrawScope(xyz2, "disk-cache", true)));
                    if (clamp.write == 0) {
                        clamp.write = Math.min(4, Runtime.getRuntime().availableProcessors());
                    }
                    int i2 = clamp.write >= 4 ? 2 : 1;
                    Xyz xyz3 = new Xyz();
                    if (!TextUtils.isEmpty("animation")) {
                        clamp clampVar3 = new clamp(new ThreadPoolExecutor(i2, i2, 0L, timeUnit, new PriorityBlockingQueue(), new CanvasDrawScope(xyz3, "animation", true)));
                        configurePaint2qPWKa0 configurepaint2qpwka0 = new configurePaint2qPWKa0(applicationContext);
                        toXyzui_graphics toxyzui_graphics = new toXyzui_graphics(0);
                        Context context2 = configurepaint2qpwka0.RemoteActionCompatParcelizer;
                        float f = configurepaint2qpwka0.IconCompatParcelizer;
                        ActivityManager activityManager = configurepaint2qpwka0.serializer;
                        int i3 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
                        toxyzui_graphics.write = i3;
                        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
                        DisplayMetrics displayMetrics = (DisplayMetrics) configurepaint2qpwka0.read.IconCompatParcelizer;
                        float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
                        int iRound2 = Math.round(f2 * f);
                        int iRound3 = Math.round(f2 * 2.0f);
                        int i4 = iRound - i3;
                        if (iRound3 + iRound2 <= i4) {
                            toxyzui_graphics.IconCompatParcelizer = iRound3;
                            toxyzui_graphics.RemoteActionCompatParcelizer = iRound2;
                        } else {
                            float f3 = i4 / (f + 2.0f);
                            toxyzui_graphics.IconCompatParcelizer = Math.round(2.0f * f3);
                            toxyzui_graphics.RemoteActionCompatParcelizer = Math.round(f3 * f);
                        }
                        if (Log.isLoggable("MemorySizeCalculator", 3)) {
                            Formatter.formatFileSize(context2, toxyzui_graphics.IconCompatParcelizer);
                            Formatter.formatFileSize(context2, toxyzui_graphics.RemoteActionCompatParcelizer);
                            Formatter.formatFileSize(context2, i3);
                            Formatter.formatFileSize(context2, iRound);
                            activityManager.getMemoryClass();
                            activityManager.isLowRamDevice();
                        }
                        zzj zzjVar = new zzj(6);
                        int i5 = toxyzui_graphics.RemoteActionCompatParcelizer;
                        if (i5 > 0) {
                            tocontentcapturesession = new getGamma(i5);
                        } else {
                            tocontentcapturesession = new toContentCaptureSession(14);
                        }
                        getD getd = tocontentcapturesession;
                        getF getf = new getF(toxyzui_graphics.write);
                        WhitePoint whitePoint = new WhitePoint(toxyzui_graphics.IconCompatParcelizer);
                        accesssetHasRetrievedMethodcp accesssethasretrievedmethodcp = new accesssetHasRetrievedMethodcp(applicationContext, false);
                        MemoryCacheService memoryCacheService = new MemoryCacheService();
                        memoryCacheService.RemoteActionCompatParcelizer = accesssethasretrievedmethodcp;
                        Glide glide = new Glide(applicationContext, new area(whitePoint, memoryCacheService, clampVar2, clampVar, new clamp(new ThreadPoolExecutor(0, Integer.MAX_VALUE, DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, timeUnit, new SynchronousQueue(), new CanvasDrawScope(new Xyz(), "source-unlimited", false))), clampVar3), whitePoint, getd, getf, new DrawScoperecord1(), zzjVar, flingCancellationException, imageKt, Collections.EMPTY_LIST, arrayList, oklabCompanion, new accessgetRelativecp(generateoetflambda0));
                        applicationContext.registerComponentCallbacks(glide);
                        serializer = glide;
                        return;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Name must be non-null and non-empty, but given: animation");
                    return;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Name must be non-null and non-empty, but given: disk-cache");
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Name must be non-null and non-empty, but given: source");
            return;
        }
        throw ff$$ExternalSyntheticOutline0.m(it3);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        Fill.serializer();
        this.MediaMetadataCompat.serializer(0L);
        this.read.o_();
        getF getf = this.write;
        synchronized (getf) {
            getf.RemoteActionCompatParcelizer(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        Fill.serializer();
        synchronized (this.MediaDescriptionCompat) {
            Iterator it = this.MediaDescriptionCompat.iterator();
            while (it.hasNext()) {
                ((RequestManager) it.next()).getClass();
            }
        }
        WhitePoint whitePoint = this.MediaMetadataCompat;
        whitePoint.getClass();
        if (i >= 40) {
            whitePoint.serializer(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (whitePoint) {
                j = whitePoint.read;
            }
            whitePoint.serializer(j / 2);
        }
        this.read.IconCompatParcelizer(i);
        getF getf = this.write;
        synchronized (getf) {
            try {
                if (i >= 40) {
                    synchronized (getf) {
                        getf.RemoteActionCompatParcelizer(0);
                    }
                } else if (i >= 20 || i == 15) {
                    getf.RemoteActionCompatParcelizer(getf.write / 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Glide IconCompatParcelizer(Context context) {
        if (serializer == null) {
            OklabCompanion oklabCompanion = null;
            try {
                oklabCompanion = (OklabCompanion) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    SentryLogcatAdapter.IconCompatParcelizer("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (IllegalAccessException e) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
                return null;
            } catch (InstantiationException e2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
                return null;
            } catch (InvocationTargetException e4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
                return null;
            }
            synchronized (Glide.class) {
                if (serializer == null) {
                    if (IconCompatParcelizer) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    IconCompatParcelizer = true;
                    try {
                        RemoteActionCompatParcelizer(context, oklabCompanion);
                        IconCompatParcelizer = false;
                    } catch (Throwable th) {
                        IconCompatParcelizer = false;
                        throw th;
                    }
                }
            }
        }
        return serializer;
    }

    public Glide(Context context, area areaVar, WhitePoint whitePoint, getD getd, getF getf, DrawScoperecord1 drawScoperecord1, zzj zzjVar, FlingCancellationException flingCancellationException, ImageKt imageKt, List list, ArrayList arrayList, TuplesKt tuplesKt, accessgetRelativecp accessgetrelativecp) {
        accessgetAbsolutecp accessgetabsolutecp = accessgetAbsolutecp.LOW;
        this.read = getd;
        this.write = getf;
        this.MediaMetadataCompat = whitePoint;
        this.MediaSessionCompatQueueItem = drawScoperecord1;
        this.RemoteActionCompatParcelizer = zzjVar;
        this.RatingCompat = new accessgetPerceptualcp(context, getf, new accessgetApparentToRealOffsetnOccac(this, arrayList, tuplesKt), flingCancellationException, imageKt, list, areaVar, accessgetrelativecp);
    }
}
