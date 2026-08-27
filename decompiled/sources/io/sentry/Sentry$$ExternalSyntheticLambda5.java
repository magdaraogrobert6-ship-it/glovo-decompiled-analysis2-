package io.sentry;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.sqlite.SQLite;
import androidx.work.impl.WorkerWrapper;
import coil3.ImageLoader$Builder;
import coil3.util.IntPair;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.google.firebase.inappmessaging.internal.ForegroundNotifier;
import com.incognia.internal.pNP;
import com.incognia.internal.whJ;
import com.incognia.internal.xr$$ExternalSyntheticLambda1;
import com.mapbox.maps.NativeMapImpl;
import com.mapbox.maps.renderer.FpsManager;
import com.roadrunner.web.performance.WebViewInitializer;
import io.grpc.internal.CallTracer;
import io.sentry.android.core.internal.modules.serializer;
import io.sentry.cache.MediaMetadataCompat;
import io.sentry.cache.tape.read;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.TuplesKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.AndroidColorSpace_androidKt;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.FocusOrderModifierKtfocusOrder1;
import o.FocusOwnerdispatchRotaryEvent1;
import o.accessgetApparentToRealOffsetnOccac;
import o.accessgetWcp;
import o.accessregisterComponentCallback;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getSUFFIX_CACHE_USER_ID_HASH_VALUEannotations;
import o.internalHeightCallbacklambda0;
import o.invalidateIntrinsicsParent;
import o.isPlacedui;
import o.minusMKHz9U;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.releaseFocus;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setAndStartAnimation;
import o.truncslo4al4;
import okhttp3.FormBody;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Sentry$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ Sentry$$ExternalSyntheticLambda5(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
    }

    private final void read() {
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) this.serializer;
        Map mapUnmodifiableMap = null;
        ((AtomicReference) r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer).set(null);
        synchronized (r8lambdalmkbrrgswwtv97obrsj7trj7ai) {
            if (((AtomicMarkableReference) r8lambdalmkbrrgswwtv97obrsj7trj7ai.write).isMarked()) {
                invalidateIntrinsicsParent invalidateintrinsicsparent = (invalidateIntrinsicsParent) ((AtomicMarkableReference) r8lambdalmkbrrgswwtv97obrsj7trj7ai.write).getReference();
                synchronized (invalidateintrinsicsparent) {
                    mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(invalidateintrinsicsparent.IconCompatParcelizer));
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) r8lambdalmkbrrgswwtv97obrsj7trj7ai.write;
                atomicMarkableReference.set((invalidateIntrinsicsParent) atomicMarkableReference.getReference(), false);
            }
        }
        if (mapUnmodifiableMap != null) {
            WorkerWrapper.Builder builder = (WorkerWrapper.Builder) r8lambdalmkbrrgswwtv97obrsj7trj7ai.read;
            ((isPlacedui) builder.write).write((String) builder.read, mapUnmodifiableMap, r8lambdalmkbrrgswwtv97obrsj7trj7ai.RemoteActionCompatParcelizer);
        }
    }

    private final void write() {
        boolean z;
        String str;
        WorkerWrapper.Builder builder = (WorkerWrapper.Builder) this.serializer;
        synchronized (((AtomicMarkableReference) builder.RemoteActionCompatParcelizer)) {
            z = false;
            if (((AtomicMarkableReference) builder.RemoteActionCompatParcelizer).isMarked()) {
                str = (String) ((AtomicMarkableReference) builder.RemoteActionCompatParcelizer).getReference();
                ((AtomicMarkableReference) builder.RemoteActionCompatParcelizer).set(str, false);
                z = true;
            } else {
                str = null;
            }
        }
        if (z) {
            ((isPlacedui) builder.write).read((String) builder.read, str);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.IconCompatParcelizer) {
            case 0:
                File[] fileArrListFiles = ((File) this.serializer).listFiles();
                if (fileArrListFiles == null) {
                    return;
                }
                int length = fileArrListFiles.length;
                while (i < length) {
                    File file = fileArrListFiles[i];
                    if (file.lastModified() < internalHeightCallbacklambda0.serializer - 300000) {
                        TuplesKt.serializer(file);
                    }
                    i++;
                }
                return;
            case 1:
                AndroidContentCaptureManager.contentCaptureChangeChecker$lambda$0((AndroidContentCaptureManager) this.serializer);
                return;
            case 2:
                minusMKHz9U minusmkhz9u = (minusMKHz9U) this.serializer;
                synchronized (minusmkhz9u.RemoteActionCompatParcelizer) {
                    if (minusmkhz9u.read == null) {
                        return;
                    }
                    try {
                        FocusOwnerdispatchRotaryEvent1 focusOwnerdispatchRotaryEvent1IconCompatParcelizer = minusmkhz9u.IconCompatParcelizer();
                        int i2 = focusOwnerdispatchRotaryEvent1IconCompatParcelizer.read;
                        if (i2 == 2) {
                            synchronized (minusmkhz9u.RemoteActionCompatParcelizer) {
                            }
                        }
                        if (i2 != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                        }
                        try {
                            Method method = releaseFocus.serializer;
                            Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            accessgetWcp accessgetwcp = minusmkhz9u.serializer;
                            Context context = minusmkhz9u.write;
                            accessgetwcp.getClass();
                            FocusOwnerdispatchRotaryEvent1[] focusOwnerdispatchRotaryEvent1Arr = {focusOwnerdispatchRotaryEvent1IconCompatParcelizer};
                            RangesKt rangesKt = FocusOrderModifierKtfocusOrder1.RemoteActionCompatParcelizer;
                            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("TypefaceCompat.createFromFontInfo");
                            try {
                                Typeface typeface = FocusOrderModifierKtfocusOrder1.RemoteActionCompatParcelizer.read(context, focusOwnerdispatchRotaryEvent1Arr, 0);
                                Trace.endSection();
                                MappedByteBuffer mappedByteBufferRemoteActionCompatParcelizer = IntPair.RemoteActionCompatParcelizer(minusmkhz9u.write, focusOwnerdispatchRotaryEvent1IconCompatParcelizer.write);
                                if (mappedByteBufferRemoteActionCompatParcelizer == null || typeface == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder(typeface, SQLite.RemoteActionCompatParcelizer(mappedByteBufferRemoteActionCompatParcelizer));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (minusmkhz9u.RemoteActionCompatParcelizer) {
                                        DefaultContentCardsUpdateHandlerCompanionCREATOR1 defaultContentCardsUpdateHandlerCompanionCREATOR1 = minusmkhz9u.read;
                                        if (defaultContentCardsUpdateHandlerCompanionCREATOR1 != null) {
                                            defaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer(imageLoader$Builder);
                                        }
                                        break;
                                    }
                                    minusmkhz9u.serializer();
                                    return;
                                } catch (Throwable th) {
                                    Method method2 = releaseFocus.serializer;
                                    Trace.endSection();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                Trace.endSection();
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            Method method3 = releaseFocus.serializer;
                            Trace.endSection();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        synchronized (minusmkhz9u.RemoteActionCompatParcelizer) {
                            DefaultContentCardsUpdateHandlerCompanionCREATOR1 defaultContentCardsUpdateHandlerCompanionCREATOR2 = minusmkhz9u.read;
                            if (defaultContentCardsUpdateHandlerCompanionCREATOR2 != null) {
                                defaultContentCardsUpdateHandlerCompanionCREATOR2.write(th4);
                            }
                            minusmkhz9u.serializer();
                            return;
                        }
                    }
                    break;
                }
            case 3:
                ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) this.serializer;
                accessregisterComponentCallback accessregistercomponentcallback = processLifecycleOwner.RatingCompat;
                if (processLifecycleOwner.MediaMetadataCompat == 0) {
                    processLifecycleOwner.write = true;
                    accessregistercomponentcallback.serializer(AndroidColorSpace_androidKt.ON_PAUSE);
                }
                if (processLifecycleOwner.MediaDescriptionCompat == 0 && processLifecycleOwner.write) {
                    accessregistercomponentcallback.serializer(AndroidColorSpace_androidKt.ON_STOP);
                    processLifecycleOwner.MediaSessionCompatQueueItem = true;
                    return;
                }
                return;
            case 4:
                accessgetApparentToRealOffsetnOccac accessgetapparenttorealoffsetnoccac = (accessgetApparentToRealOffsetnOccac) ((SentryTracer$$ExternalSyntheticLambda1) this.serializer).serializer;
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                boolean z = accessgetapparenttorealoffsetnoccac.read;
                forest.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("ViewCompat.startUpWebView succeeded. shouldRunUiThreadStartUpTasks: ", z), new Object[0]);
                WebViewInitializer webViewInitializer = (WebViewInitializer) accessgetapparenttorealoffsetnoccac.serializer;
                if (z) {
                    webViewInitializer.RemoteActionCompatParcelizer.set(true);
                    webViewInitializer.IconCompatParcelizer.set(true);
                } else {
                    webViewInitializer.RemoteActionCompatParcelizer.set(true);
                }
                webViewInitializer.serializer.set(false);
                ((CancellableContinuationImpl) accessgetapparenttorealoffsetnoccac.write).resumeWith(createFromParcel.INSTANCE);
                return;
            case 5:
                setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) this.serializer;
                if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
                    setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
                    return;
                }
                return;
            case 6:
                ImageLoader$Builder imageLoader$Builder2 = (ImageLoader$Builder) this.serializer;
                ((SQLiteEventStore) imageLoader$Builder2.serializer).serializer(new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(7, imageLoader$Builder2));
                return;
            case 7:
                write();
                return;
            case 8:
                read();
                return;
            case 9:
                ForegroundNotifier foregroundNotifier = (ForegroundNotifier) this.serializer;
                boolean z2 = foregroundNotifier.IconCompatParcelizer;
                foregroundNotifier.IconCompatParcelizer = !(z2 && foregroundNotifier.write) && z2;
                return;
            case 10:
                pNP.mbG((whJ) this.serializer);
                return;
            case 11:
                NativeMapImpl._set_sizeSet_$lambda$1((NativeMapImpl) this.serializer);
                return;
            case 12:
                FpsManager.onRenderingPausedRunnable$lambda$1((FpsManager) this.serializer);
                return;
            case 13:
                ((truncslo4al4) this.serializer).read = false;
                return;
            case 14:
                try {
                    ((Runnable) this.serializer).run();
                    return;
                } catch (Throwable th5) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th5, "WebView component startup failed", new Object[0]);
                    return;
                }
            case 15:
                getSUFFIX_CACHE_USER_ID_HASH_VALUEannotations getsuffix_cache_user_id_hash_valueannotations = (getSUFFIX_CACHE_USER_ID_HASH_VALUEannotations) this.serializer;
                FormBody.Builder builder = getsuffix_cache_user_id_hash_valueannotations.IconCompatParcelizer;
                if (builder != null && builder.MediaSessionCompatQueueItem()) {
                    getsuffix_cache_user_id_hash_valueannotations.IconCompatParcelizer.RatingCompat();
                }
                getsuffix_cache_user_id_hash_valueannotations.write = null;
                return;
            case 16:
                CallTracer callTracer = (CallTracer) this.serializer;
                while (true) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) callTracer.RemoteActionCompatParcelizer;
                    if (i >= 40) {
                        scheduledThreadPoolExecutor.purge();
                        return;
                    } else {
                        try {
                            scheduledThreadPoolExecutor.schedule((xr$$ExternalSyntheticLambda1) callTracer.serializer, 365L, TimeUnit.DAYS).cancel(true);
                            i++;
                        } catch (RejectedExecutionException unused) {
                            return;
                        }
                    }
                    return;
                }
            case 17:
                ((serializer) this.serializer).read();
                return;
            case 18:
                MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) this.serializer;
                try {
                    ((read) mediaMetadataCompat.serializer.IconCompatParcelizer()).write();
                    return;
                } catch (IOException e) {
                    mediaMetadataCompat.IconCompatParcelizer.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to clear breadcrumbs from file queue", e);
                    return;
                }
            default:
                setAndStartAnimation setandstartanimation = (setAndStartAnimation) ((createInAppMessageEventSubscriber) this.serializer).IconCompatParcelizer;
                if (setandstartanimation != null) {
                    setandstartanimation.RemoteActionCompatParcelizer();
                    return;
                }
                return;
        }
    }
}
