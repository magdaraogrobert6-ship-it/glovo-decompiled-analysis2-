package com.deliveryhero.perseus.di;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getCurrentGroup;
import o.getHoldoutVariation;
import o.getStrokeAlpha;
import o.getStrokeLineCapKaPHkGw;
import o.removeNodeAtDepth;
import o.verticalLineToRelative;

/* JADX INFO: loaded from: classes2.dex */
public final class NetworkModule {
    public static getHoldoutVariation RemoteActionCompatParcelizer;
    public static verticalLineToRelative read;
    public static getCurrentGroup serializer;
    public static final NetworkModule write = new NetworkModule();

    /* JADX WARN: Code duplicated, block: B:27:0x006c A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:25:0x0068, B:27:0x006c, B:28:0x0075, B:29:0x007a), top: B:51:0x0068 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0075 A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:25:0x0068, B:27:0x006c, B:28:0x0075, B:29:0x007a), top: B:51:0x0068 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        if (r9 == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object initialize(kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.perseus.di.NetworkModule.initialize(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object perseusHitsApi(ContinuationImpl continuationImpl) {
        getStrokeAlpha getstrokealpha;
        if (continuationImpl instanceof getStrokeAlpha) {
            getstrokealpha = (getStrokeAlpha) continuationImpl;
            int i = getstrokealpha.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                getstrokealpha.read = i - Integer.MIN_VALUE;
            } else {
                getstrokealpha = new getStrokeAlpha(this, continuationImpl);
            }
        } else {
            getstrokealpha = new getStrokeAlpha(this, continuationImpl);
        }
        Object obj = getstrokealpha.serializer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getstrokealpha.read;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getstrokealpha.read = 1;
            if (initialize(getstrokealpha) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        verticalLineToRelative verticallinetorelative = read;
        if (verticallinetorelative != null) {
            return verticallinetorelative;
        }
        removeNodeAtDepth.serializer("api");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object retrofitBuilder$perseus_release(ContinuationImpl continuationImpl) {
        getStrokeLineCapKaPHkGw getstrokelinecapkaphkgw;
        if (continuationImpl instanceof getStrokeLineCapKaPHkGw) {
            getstrokelinecapkaphkgw = (getStrokeLineCapKaPHkGw) continuationImpl;
            int i = getstrokelinecapkaphkgw.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                getstrokelinecapkaphkgw.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                getstrokelinecapkaphkgw = new getStrokeLineCapKaPHkGw(this, continuationImpl);
            }
        } else {
            getstrokelinecapkaphkgw = new getStrokeLineCapKaPHkGw(this, continuationImpl);
        }
        Object obj = getstrokelinecapkaphkgw.read;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getstrokelinecapkaphkgw.IconCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getstrokelinecapkaphkgw.IconCompatParcelizer = 1;
            if (initialize(getstrokelinecapkaphkgw) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        getCurrentGroup getcurrentgroup = serializer;
        if (getcurrentgroup != null) {
            return getcurrentgroup;
        }
        removeNodeAtDepth.serializer("builder");
        throw null;
    }
}
