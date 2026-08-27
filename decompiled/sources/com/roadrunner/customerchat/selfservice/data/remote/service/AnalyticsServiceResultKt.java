package com.roadrunner.customerchat.selfservice.data.remote.service;

import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o._get_messageWebView_lambda1;
import o._get_messageWebView_lambda3;
import o.getHoldoutVariationName;
import o.handleAnnotationEnd;
import o.handleAnnotationStart;
import o.handleLiEnd;
import o.handleUlEnd;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AnalyticsServiceResultKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:37:0x0089 A[Catch: Exception -> 0x00a1, HttpException -> 0x00a8, TRY_LEAVE, TryCatch #2 {HttpException -> 0x00a8, Exception -> 0x00a1, blocks: (B:15:0x003d, B:28:0x0066, B:30:0x0070, B:32:0x0076, B:35:0x0083, B:41:0x009b, B:37:0x0089, B:16:0x0041, B:21:0x004e), top: B:49:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public static final Object handleApi(TooltipStateImpl.AnonymousClass2 anonymousClass2, ContinuationImpl continuationImpl) throws Throwable {
        handleAnnotationStart handleannotationstart;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 41;
        write = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            boolean z = continuationImpl instanceof handleAnnotationStart;
            obj.hashCode();
            throw null;
        }
        if (continuationImpl instanceof handleAnnotationStart) {
            handleannotationstart = (handleAnnotationStart) continuationImpl;
            int i4 = handleannotationstart.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                handleannotationstart.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                handleannotationstart = new handleAnnotationStart(continuationImpl);
            }
        } else {
            handleannotationstart = new handleAnnotationStart(continuationImpl);
        }
        Object objInvoke = handleannotationstart.serializer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = handleannotationstart.RemoteActionCompatParcelizer;
        try {
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                handleannotationstart.RemoteActionCompatParcelizer = 1;
                objInvoke = anonymousClass2.invoke(handleannotationstart);
                if (objInvoke == obj2) {
                    int i6 = write + 123;
                    RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        return obj2;
                    }
                    obj.hashCode();
                    throw null;
                }
            } else {
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i7 = write + 25;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            }
            getHoldoutVariationName getholdoutvariationname = (getHoldoutVariationName) objInvoke;
            Object obj3 = getholdoutvariationname.body;
            _get_messageWebView_lambda1 _get_messagewebview_lambda1 = getholdoutvariationname.rawResponse;
            if (_get_messagewebview_lambda1.isSuccessful) {
                return new handleLiEnd(obj3);
            }
            _get_messageWebView_lambda3 _get_messagewebview_lambda3 = getholdoutvariationname.errorBody;
            if (_get_messagewebview_lambda3 != null) {
                int i8 = write + 113;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (_get_messagewebview_lambda3.MediaMetadataCompat() == null) {
                    _get_messagewebview_lambda1.message.getClass();
                    i = RemoteActionCompatParcelizer + 115;
                    write = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        int i10 = 5 % 5;
                    }
                }
            } else {
                _get_messagewebview_lambda1.message.getClass();
                i = RemoteActionCompatParcelizer + 115;
                write = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    int i11 = 5 % 5;
                }
            }
            return new handleAnnotationEnd();
        } catch (HttpException unused) {
            return new handleAnnotationEnd();
        } catch (Exception e) {
            return new handleUlEnd(e);
        }
    }
}
