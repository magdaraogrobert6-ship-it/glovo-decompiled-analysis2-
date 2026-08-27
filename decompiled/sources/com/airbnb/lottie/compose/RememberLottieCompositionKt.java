package com.airbnb.lottie.compose;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl;
import io.grpc.LoadBalancer$Helper;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AndroidContentCaptureManager;
import o.BannerViewattachStateListener1;
import o.HitPathTrackeraddHitPath1;
import o.PopulateViewStructure_androidKtpopulate7;
import o.StrokeJoinCompanion;
import o.TransformOrigin;
import o.accessgetXyzcp;
import o.createFromParcel;
import o.getBevelLxFBmk8;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCmykxdoWZVw;
import o.getCreditCardExpirationMonth;
import o.getIdui_graphics;
import o.getLabxdoWZVw;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getRgbxdoWZVw;
import o.getXyzxdoWZVw;
import o.prepareForActivityTransitionCarryover;
import o.removeNodeAtDepth;
import o.toCancelMotionEventScoped4ec7I;
import o.toMotionEventScoped4ec7I;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public abstract class RememberLottieCompositionKt {
    public static HitPathTrackeraddHitPath1 IconCompatParcelizer;

    public static toMotionEventScoped4ec7I write(String str) {
        toMotionEventScoped4ec7I tomotioneventscoped4ec7i;
        synchronized (RememberLottieCompositionKt.class) {
            int i = 1;
            byte b = (byte) (((byte) 1) | 2);
            if (b == 3) {
                toCancelMotionEventScoped4ec7I tocancelmotioneventscoped4ec7i = new toCancelMotionEventScoped4ec7I(str, 1);
                synchronized (RememberLottieCompositionKt.class) {
                    if (IconCompatParcelizer == null) {
                        IconCompatParcelizer = new HitPathTrackeraddHitPath1(i);
                    }
                    tomotioneventscoped4ec7i = (toMotionEventScoped4ec7I) IconCompatParcelizer.serializer(tocancelmotioneventscoped4ec7i);
                }
                return tomotioneventscoped4ec7i;
            }
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" enableFirelog");
            }
            if ((b & 2) == 0) {
                sb.append(" firelogEventType");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return tomotioneventscoped4ec7i;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:38:0x010d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0111 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object lottieComposition(Context context, getXyzxdoWZVw getxyzxdowzvw, String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) throws Throwable {
        getIdui_graphics getidui_graphics;
        String str5;
        String str6;
        String str7;
        Context context2;
        StrokeJoinCompanion strokeJoinCompanion;
        Object objWithContext;
        Context context3;
        Object objWithContext2;
        if (continuationImpl instanceof getIdui_graphics) {
            getidui_graphics = (getIdui_graphics) continuationImpl;
            int i = getidui_graphics.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                getidui_graphics.write = i - Integer.MIN_VALUE;
            } else {
                getidui_graphics = new getIdui_graphics(continuationImpl);
            }
        } else {
            getidui_graphics = new getIdui_graphics(continuationImpl);
        }
        Object result = getidui_graphics.MediaBrowserCompatMediaItem;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getidui_graphics.write;
        Object obj = createFromParcel.INSTANCE;
        int i3 = 1;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(result);
            TransformOrigin transformOriginRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, getxyzxdowzvw, str4);
            getidui_graphics.read = context;
            getidui_graphics.RemoteActionCompatParcelizer = str;
            getidui_graphics.IconCompatParcelizer = str2;
            str5 = str3;
            getidui_graphics.serializer = str5;
            getidui_graphics.write = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(getidui_graphics));
            cancellableContinuationImpl.read();
            transformOriginRemoteActionCompatParcelizer.read(new getRgbxdoWZVw(cancellableContinuationImpl, 0));
            transformOriginRemoteActionCompatParcelizer.serializer(new getRgbxdoWZVw(cancellableContinuationImpl, i3));
            result = cancellableContinuationImpl.getResult();
            if (result != coroutineSingletons) {
                str6 = str;
                str7 = str2;
                context2 = context;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            String str8 = (String) getidui_graphics.serializer;
            str7 = getidui_graphics.IconCompatParcelizer;
            str6 = getidui_graphics.RemoteActionCompatParcelizer;
            context2 = (Context) getidui_graphics.read;
            ExtrasKt.RemoteActionCompatParcelizer(result);
            str5 = str8;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    StrokeJoinCompanion strokeJoinCompanion2 = (StrokeJoinCompanion) getidui_graphics.read;
                    ExtrasKt.RemoteActionCompatParcelizer(result);
                    return strokeJoinCompanion2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            strokeJoinCompanion = (StrokeJoinCompanion) getidui_graphics.serializer;
            String str9 = getidui_graphics.IconCompatParcelizer;
            String str10 = getidui_graphics.RemoteActionCompatParcelizer;
            context3 = (Context) getidui_graphics.read;
            ExtrasKt.RemoteActionCompatParcelizer(result);
            str5 = str9;
            str7 = str10;
        }
        getidui_graphics.read = strokeJoinCompanion;
        getidui_graphics.RemoteActionCompatParcelizer = null;
        getidui_graphics.IconCompatParcelizer = null;
        getidui_graphics.serializer = null;
        getidui_graphics.write = 3;
        if (!strokeJoinCompanion.serializer.isEmpty()) {
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            objWithContext2 = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new SideMenuCacheImpl.AnonymousClass2(strokeJoinCompanion, context3, str7, str5, null, 2), getidui_graphics);
            if (objWithContext2 == coroutineSingletons) {
                obj = objWithContext2;
            }
        }
        if (obj != coroutineSingletons) {
            return coroutineSingletons;
        }
        return strokeJoinCompanion;
        strokeJoinCompanion = (StrokeJoinCompanion) result;
        getidui_graphics.read = context2;
        getidui_graphics.RemoteActionCompatParcelizer = str7;
        getidui_graphics.IconCompatParcelizer = str5;
        getidui_graphics.serializer = strokeJoinCompanion;
        getidui_graphics.write = 2;
        if (strokeJoinCompanion.MediaDescriptionCompat.isEmpty()) {
            objWithContext = obj;
        } else {
            DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new SignInDataStore$set$2(strokeJoinCompanion, context2, str6, null, 3), getidui_graphics);
            if (objWithContext != coroutineSingletons) {
                objWithContext = obj;
            }
        }
        if (objWithContext != coroutineSingletons) {
            context3 = context2;
            getidui_graphics.read = strokeJoinCompanion;
            getidui_graphics.RemoteActionCompatParcelizer = null;
            getidui_graphics.IconCompatParcelizer = null;
            getidui_graphics.serializer = null;
            getidui_graphics.write = 3;
            if (!strokeJoinCompanion.serializer.isEmpty()) {
                DefaultScheduler defaultScheduler3 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                objWithContext2 = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new SideMenuCacheImpl.AnonymousClass2(strokeJoinCompanion, context3, str7, str5, null, 2), getidui_graphics);
                if (objWithContext2 == coroutineSingletons) {
                    obj = objWithContext2;
                }
            }
            if (obj != coroutineSingletons) {
                return strokeJoinCompanion;
            }
        }
        return coroutineSingletons;
    }

    public static final accessgetXyzcp IconCompatParcelizer(getXyzxdoWZVw getxyzxdowzvw, getBirthDateFull getbirthdatefull) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.write(-1248473602);
        int i = 3;
        DraggableKt$NoOpOnDragStarted$1 draggableKt$NoOpOnDragStarted$1 = new DraggableKt$NoOpOnDragStarted$1(i, i, null);
        Context context = (Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
        getpostalcode.write(1388713953);
        boolean z = getpostalcode.read(getxyzxdowzvw);
        Object objComponentActivity = getpostalcode.ComponentActivity();
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if (z || objComponentActivity == androidContentCaptureManager) {
            objComponentActivity = CompositionKt.RemoteActionCompatParcelizer(new accessgetXyzcp());
            getpostalcode.write(objComponentActivity);
        }
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
        getpostalcode.IconCompatParcelizer(false);
        getpostalcode.write(1388714244);
        boolean z2 = getpostalcode.read(getxyzxdowzvw);
        boolean z3 = getpostalcode.read("__LottieInternalDefaultCacheKey__");
        Object objComponentActivity2 = getpostalcode.ComponentActivity();
        if ((z2 | z3) || objComponentActivity2 == androidContentCaptureManager) {
            objComponentActivity2 = RemoteActionCompatParcelizer(context, getxyzxdowzvw, "__LottieInternalDefaultCacheKey__");
            getpostalcode.write(objComponentActivity2);
        }
        getpostalcode.IconCompatParcelizer(false);
        getPhoneNumberNational.serializer(getxyzxdowzvw, "__LottieInternalDefaultCacheKey__", new RememberLottieCompositionKt$rememberLottieComposition$3(draggableKt$NoOpOnDragStarted$1, context, getxyzxdowzvw, populateViewStructure_androidKtpopulate7, null), getpostalcode);
        accessgetXyzcp accessgetxyzcp = (accessgetXyzcp) populateViewStructure_androidKtpopulate7.getValue();
        getpostalcode.IconCompatParcelizer(false);
        return accessgetxyzcp;
    }

    public static final TransformOrigin RemoteActionCompatParcelizer(Context context, getXyzxdoWZVw getxyzxdowzvw, final String str) {
        if (!(getxyzxdowzvw instanceof getCmykxdoWZVw)) {
            if (!(getxyzxdowzvw instanceof getLabxdoWZVw)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "__LottieInternalDefaultCacheKey__"}, getCieXyz.write())).booleanValue()) {
                str = String.valueOf(((getLabxdoWZVw) getxyzxdowzvw).serializer.hashCode());
            }
            return getBevelLxFBmk8.serializer(str, new BannerViewattachStateListener1(((getLabxdoWZVw) getxyzxdowzvw).serializer, 1, str), (Runnable) null);
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "__LottieInternalDefaultCacheKey__"}, getCieXyz.write())).booleanValue()) {
            final int i = ((getCmykxdoWZVw) getxyzxdowzvw).RemoteActionCompatParcelizer;
            HashMap map = getBevelLxFBmk8.IconCompatParcelizer;
            final WeakReference weakReference = new WeakReference(context);
            final Context applicationContext = context.getApplicationContext();
            return getBevelLxFBmk8.serializer(str, new Callable() { // from class: o.accessgetMitercp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i2 = i;
                    Context context2 = (Context) weakReference.get();
                    if (context2 == null) {
                        context2 = applicationContext;
                    }
                    String str2 = str;
                    StrokeJoinCompanion strokeJoinCompanion = str2 == null ? null : getModelxdoWZVw.read.read(str2);
                    if (strokeJoinCompanion != null) {
                        return new getRepeated3opZhB0(strokeJoinCompanion);
                    }
                    try {
                        GifDrawableTransformation gifDrawableTransformation = new GifDrawableTransformation(Okio.RemoteActionCompatParcelizer(context2.getResources().openRawResource(i2)));
                        if (getBevelLxFBmk8.IconCompatParcelizer(gifDrawableTransformation, getBevelLxFBmk8.read).booleanValue()) {
                            ZipInputStream zipInputStream = new ZipInputStream(new Glide(gifDrawableTransformation, 1));
                            try {
                                return getBevelLxFBmk8.IconCompatParcelizer(context2, zipInputStream, str2);
                            } finally {
                                newD50Xyzui_graphics.write(zipInputStream);
                            }
                        }
                        if (!getBevelLxFBmk8.IconCompatParcelizer(gifDrawableTransformation, getBevelLxFBmk8.write).booleanValue()) {
                            String[] strArr = com.airbnb.lottie.parser.moshi.JsonReader.IconCompatParcelizer;
                            return getBevelLxFBmk8.serializer(new com.airbnb.lottie.parser.moshi.JsonUtf8Reader(gifDrawableTransformation), str2, true);
                        }
                        try {
                            return getBevelLxFBmk8.serializer(Okio.RemoteActionCompatParcelizer(new GZIPInputStream(new Glide(gifDrawableTransformation, 1))), str2);
                        } catch (IOException e) {
                            return new getRepeated3opZhB0(e);
                        }
                    } catch (Resources.NotFoundException e2) {
                        return new getRepeated3opZhB0(e2);
                    }
                    return new getRepeated3opZhB0(e2);
                }
            }, (Runnable) null);
        }
        final int i2 = ((getCmykxdoWZVw) getxyzxdowzvw).RemoteActionCompatParcelizer;
        HashMap map2 = getBevelLxFBmk8.IconCompatParcelizer;
        final String strM = d$$ExternalSyntheticOutline0.m(i2, (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", new StringBuilder("rawRes"));
        final WeakReference weakReference2 = new WeakReference(context);
        final Context applicationContext2 = context.getApplicationContext();
        return getBevelLxFBmk8.serializer(strM, new Callable() { // from class: o.accessgetMitercp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i3 = i2;
                Context context2 = (Context) weakReference2.get();
                if (context2 == null) {
                    context2 = applicationContext2;
                }
                String str2 = strM;
                StrokeJoinCompanion strokeJoinCompanion = str2 == null ? null : getModelxdoWZVw.read.read(str2);
                if (strokeJoinCompanion != null) {
                    return new getRepeated3opZhB0(strokeJoinCompanion);
                }
                try {
                    GifDrawableTransformation gifDrawableTransformation = new GifDrawableTransformation(Okio.RemoteActionCompatParcelizer(context2.getResources().openRawResource(i3)));
                    if (getBevelLxFBmk8.IconCompatParcelizer(gifDrawableTransformation, getBevelLxFBmk8.read).booleanValue()) {
                        ZipInputStream zipInputStream = new ZipInputStream(new Glide(gifDrawableTransformation, 1));
                        try {
                            return getBevelLxFBmk8.IconCompatParcelizer(context2, zipInputStream, str2);
                        } finally {
                            newD50Xyzui_graphics.write(zipInputStream);
                        }
                    }
                    if (!getBevelLxFBmk8.IconCompatParcelizer(gifDrawableTransformation, getBevelLxFBmk8.write).booleanValue()) {
                        String[] strArr = com.airbnb.lottie.parser.moshi.JsonReader.IconCompatParcelizer;
                        return getBevelLxFBmk8.serializer(new com.airbnb.lottie.parser.moshi.JsonUtf8Reader(gifDrawableTransformation), str2, true);
                    }
                    try {
                        return getBevelLxFBmk8.serializer(Okio.RemoteActionCompatParcelizer(new GZIPInputStream(new Glide(gifDrawableTransformation, 1))), str2);
                    } catch (IOException e) {
                        return new getRepeated3opZhB0(e);
                    }
                } catch (Resources.NotFoundException e2) {
                    return new getRepeated3opZhB0(e2);
                }
                return new getRepeated3opZhB0(e2);
            }
        }, (Runnable) null);
    }
}
