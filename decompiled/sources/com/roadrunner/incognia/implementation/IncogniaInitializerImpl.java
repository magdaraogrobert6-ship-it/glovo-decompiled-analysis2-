package com.roadrunner.incognia.implementation;

import android.app.Application;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.Incognia;
import io.grpc.internal.CallTracer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import o.SemanticsInfo;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.decode;
import o.getAllSemanticsNodesToMap;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.tryGetViewHolderForPositionByDeadline;

/* JADX INFO: loaded from: classes3.dex */
public final class IncogniaInitializerImpl implements SemanticsInfo {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public final Application IconCompatParcelizer;
    public final getAllSemanticsNodesToMap MediaBrowserCompatMediaItem;
    public final MutexImpl RemoteActionCompatParcelizer = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
    public final AtomicBoolean read = new AtomicBoolean(false);
    public final CallTracer serializer;
    public final decode write;

    public IncogniaInitializerImpl(Application application, CallTracer callTracer, getAllSemanticsNodesToMap getallsemanticsnodestomap, decode decodeVar) {
        this.IconCompatParcelizer = application;
        this.serializer = callTracer;
        this.MediaBrowserCompatMediaItem = getallsemanticsnodestomap;
        this.write = decodeVar;
    }

    @Override // o.SemanticsInfo
    public final Object init(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 93;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            initSdk("app_startup", (ContinuationImpl) shortNewsContentCardView);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        Object objInitSdk = initSdk("app_startup", (ContinuationImpl) shortNewsContentCardView);
        if (objInitSdk == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objInitSdk;
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = MediaDescriptionCompat + 61;
        RatingCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return createfromparcel;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final Object disable(ContinuationImpl continuationImpl) {
        tryGetViewHolderForPositionByDeadline trygetviewholderforpositionbydeadline;
        MutexImpl mutexImpl;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 111;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AtomicBoolean atomicBoolean = this.read;
        if (continuationImpl instanceof tryGetViewHolderForPositionByDeadline) {
            trygetviewholderforpositionbydeadline = (tryGetViewHolderForPositionByDeadline) continuationImpl;
            int i4 = trygetviewholderforpositionbydeadline.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                trygetviewholderforpositionbydeadline.serializer = i4 - Integer.MIN_VALUE;
            } else {
                trygetviewholderforpositionbydeadline = new tryGetViewHolderForPositionByDeadline(this, continuationImpl);
            }
        } else {
            trygetviewholderforpositionbydeadline = new tryGetViewHolderForPositionByDeadline(this, continuationImpl);
        }
        Object obj = trygetviewholderforpositionbydeadline.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = trygetviewholderforpositionbydeadline.serializer;
        Object obj2 = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            mutexImpl = this.RemoteActionCompatParcelizer;
            trygetviewholderforpositionbydeadline.IconCompatParcelizer = mutexImpl;
            trygetviewholderforpositionbydeadline.serializer = 1;
            if (mutexImpl.lock(trygetviewholderforpositionbydeadline) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i6 = RatingCompat + 61;
                MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return null;
            }
            int i8 = RatingCompat + 69;
            MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                MutexImpl mutexImpl2 = trygetviewholderforpositionbydeadline.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                obj2.hashCode();
                throw null;
            }
            mutexImpl = trygetviewholderforpositionbydeadline.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        try {
            if (atomicBoolean.get()) {
                Incognia.clearAccountId();
                Incognia.setLocationEnabled(false);
                Incognia.disable(this.IconCompatParcelizer);
                atomicBoolean.set(false);
                this.write.logEvent("incognia_disabled", null);
            }
            return createFromParcel.INSTANCE;
        } finally {
            mutexImpl.write(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fa  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (disable(r1) == r2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d6, code lost:
    
        if (initSdk(r11, r1) == r2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e3, code lost:
    
        if (initSdk(r11, r1) == r2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e6, code lost:
    
        r11 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkIfIncogniaEnabledInitIfRequired(java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.incognia.implementation.IncogniaInitializerImpl.checkIfIncogniaEnabledInitIfRequired(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00af A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x0042, B:36:0x00a7, B:38:0x00af, B:39:0x00c0, B:25:0x0072, B:29:0x0083, B:32:0x0095), top: B:45:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0 A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x0042, B:36:0x00a7, B:38:0x00af, B:39:0x00c0, B:25:0x0072, B:29:0x0083, B:32:0x0095), top: B:45:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        if (r11 == r2) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object initSdk(java.lang.String r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.incognia.implementation.IncogniaInitializerImpl.initSdk(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
