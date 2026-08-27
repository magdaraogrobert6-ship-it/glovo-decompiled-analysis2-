package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.mlkit.vision.barcode.internal.zzl;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.logic.zp;
import io.sentry.SentryOptions;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class getRecommendedTimeoutMillis implements accessgetErasercp {
    public Object IconCompatParcelizer;
    public final Object MediaDescriptionCompat;
    public final Object RemoteActionCompatParcelizer;
    public final Object read;
    public final Object serializer;
    public long write;

    @Override // o.accessgetErasercp
    public zp IconCompatParcelizer() {
        getDisallowInterceptui getdisallowinterceptui;
        zzl zzlVar = (zzl) this.serializer;
        long j = this.write;
        accesssetStatep accesssetstatep = (accesssetStatep) this.RemoteActionCompatParcelizer;
        InternalPointerEvent internalPointerEvent = (InternalPointerEvent) this.read;
        InternalPointerEvent internalPointerEvent2 = (InternalPointerEvent) this.IconCompatParcelizer;
        setRequestedFrameRate setrequestedframerate = (setRequestedFrameRate) this.MediaDescriptionCompat;
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect = new com.airbnb.lottie.parser.DropShadowEffect(9);
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect2 = new com.airbnb.lottie.parser.DropShadowEffect(8);
        dropShadowEffect2.read = Long.valueOf(j & Long.MAX_VALUE);
        dropShadowEffect2.RatingCompat = accesssetstatep;
        dropShadowEffect2.write = Boolean.valueOf(zzl.read);
        Boolean bool = Boolean.TRUE;
        dropShadowEffect2.serializer = bool;
        dropShadowEffect2.MediaDescriptionCompat = bool;
        dropShadowEffect.read = new setOnTouchEvent(dropShadowEffect2);
        dropShadowEffect.RatingCompat = Api30Impl.IconCompatParcelizer(zzlVar.MediaSessionCompatQueueItem);
        dropShadowEffect.write = internalPointerEvent.write();
        dropShadowEffect.serializer = internalPointerEvent2.write();
        int i = setrequestedframerate.MediaSessionCompatQueueItem;
        zzl.serializer.getClass();
        int iSerializer = ImageUtils.serializer(setrequestedframerate);
        i$d i_d = new i$d(23, false);
        if (i == -1) {
            getdisallowinterceptui = getDisallowInterceptui.BITMAP;
        } else if (i == 35) {
            getdisallowinterceptui = getDisallowInterceptui.YUV_420_888;
        } else if (i == 842094169) {
            getdisallowinterceptui = getDisallowInterceptui.YV12;
        } else if (i != 16) {
            getdisallowinterceptui = i != 17 ? getDisallowInterceptui.UNKNOWN_FORMAT : getDisallowInterceptui.NV21;
        } else {
            getdisallowinterceptui = getDisallowInterceptui.NV16;
        }
        i_d.serializer = getdisallowinterceptui;
        i_d.read = Integer.valueOf(Integer.MAX_VALUE & iSerializer);
        dropShadowEffect.MediaDescriptionCompat = new getOnTouchEvent(i_d);
        androidx.lifecycle.BlockRunner blockRunner = new androidx.lifecycle.BlockRunner();
        blockRunner.RatingCompat = zzlVar.PlaybackStateCompatCustomAction ? setDisallowInterceptui.TYPE_THICK : setDisallowInterceptui.TYPE_THIN;
        blockRunner.write = new PointerInteropFilter_androidKt(dropShadowEffect);
        return new zp(blockRunner, 0);
    }

    public void RemoteActionCompatParcelizer() {
        List list;
        String strM;
        File file = (File) this.RemoteActionCompatParcelizer;
        SentryOptions sentryOptions = (SentryOptions) this.read;
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) this.serializer;
        if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
            String strIconCompatParcelizer = io.sentry.util.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer(this.write);
            if (file != null) {
                String strIconCompatParcelizer2 = io.sentry.util.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer(this.write);
                if (sentryOptions.isSendDefaultPii()) {
                    strM = file.getName() + " (" + strIconCompatParcelizer2 + ")";
                } else {
                    int iLastIndexOf = file.getName().lastIndexOf(46);
                    strM = (iLastIndexOf <= 0 || iLastIndexOf >= file.getName().length() + (-1)) ? ff$$ExternalSyntheticOutline0.m("*** (", strIconCompatParcelizer2, ")") : r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("***", file.getName().substring(iLastIndexOf), " (", strIconCompatParcelizer2, ")");
                }
                r8lambdareqvhj3p9oule_afn8an0r0tlg0.write(strM);
                if (sentryOptions.isSendDefaultPii()) {
                    r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(file.getAbsolutePath(), "file.path");
                }
            } else {
                r8lambdareqvhj3p9oule_afn8an0r0tlg0.write(strIconCompatParcelizer);
            }
            r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(Long.valueOf(this.write), "file.size");
            boolean zIconCompatParcelizer = sentryOptions.getThreadChecker().IconCompatParcelizer();
            r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(Boolean.valueOf(zIconCompatParcelizer), "blocked_main_thread");
            if (zIconCompatParcelizer) {
                UriActionExternalSyntheticLambda1 uriActionExternalSyntheticLambda1 = (UriActionExternalSyntheticLambda1) this.MediaDescriptionCompat;
                uriActionExternalSyntheticLambda1.getClass();
                ArrayList arrayListSerializer = uriActionExternalSyntheticLambda1.serializer(new Exception().getStackTrace(), false);
                if (arrayListSerializer == null) {
                    list = Collections.EMPTY_LIST;
                } else {
                    ArrayList arrayList = new ArrayList(arrayListSerializer.size());
                    for (Object obj : arrayListSerializer) {
                        if (Boolean.TRUE.equals(((io.sentry.protocol.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) obj).MediaSessionCompatQueueItem)) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        arrayList = new ArrayList(arrayListSerializer.size());
                        for (Object obj2 : arrayListSerializer) {
                            String str = ((io.sentry.protocol.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) obj2).PlaybackStateCompat;
                            if (str == null || (!str.startsWith("sun.") && !str.startsWith("java.") && !str.startsWith("android.") && !str.startsWith("com.android."))) {
                                arrayList.add(obj2);
                            }
                        }
                    }
                    list = arrayList;
                }
                r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(list, "call_stack");
            }
            r8lambdareqvhj3p9oule_afn8an0r0tlg0.write((defaultCardHandlinglambda0) this.IconCompatParcelizer);
        }
    }

    public void read(Closeable closeable) {
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) this.serializer;
        try {
            try {
                closeable.close();
                RemoteActionCompatParcelizer();
            } catch (IOException e) {
                this.IconCompatParcelizer = defaultCardHandlinglambda0.INTERNAL_ERROR;
                if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
                    r8lambdareqvhj3p9oule_afn8an0r0tlg0.RemoteActionCompatParcelizer(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            RemoteActionCompatParcelizer();
            throw th;
        }
    }

    public getRecommendedTimeoutMillis(r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0, File file, SentryOptions sentryOptions) {
        this.IconCompatParcelizer = defaultCardHandlinglambda0.OK;
        this.serializer = r8lambdareqvhj3p9oule_afn8an0r0tlg0;
        this.RemoteActionCompatParcelizer = file;
        this.read = sentryOptions;
        this.MediaDescriptionCompat = new UriActionExternalSyntheticLambda1(sentryOptions);
        BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().read("FileIO");
    }

    public Object RemoteActionCompatParcelizer(io.sentry.instrumentation.file.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        try {
            Object objRemoteActionCompatParcelizer = remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            if (objRemoteActionCompatParcelizer instanceof Integer) {
                int iIntValue = ((Integer) objRemoteActionCompatParcelizer).intValue();
                if (iIntValue != -1) {
                    this.write += (long) iIntValue;
                    return objRemoteActionCompatParcelizer;
                }
            } else if (objRemoteActionCompatParcelizer instanceof Long) {
                long jLongValue = ((Long) objRemoteActionCompatParcelizer).longValue();
                if (jLongValue != -1) {
                    this.write += jLongValue;
                }
            }
            return objRemoteActionCompatParcelizer;
        } catch (IOException e) {
            this.IconCompatParcelizer = defaultCardHandlinglambda0.INTERNAL_ERROR;
            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) this.serializer;
            if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
                r8lambdareqvhj3p9oule_afn8an0r0tlg0.RemoteActionCompatParcelizer(e);
            }
            throw e;
        }
    }

    public /* synthetic */ getRecommendedTimeoutMillis(zzl zzlVar, long j, accesssetStatep accesssetstatep, InternalPointerEvent internalPointerEvent, InternalPointerEvent internalPointerEvent2, setRequestedFrameRate setrequestedframerate) {
        this.serializer = zzlVar;
        this.write = j;
        this.RemoteActionCompatParcelizer = accesssetstatep;
        this.read = internalPointerEvent;
        this.IconCompatParcelizer = internalPointerEvent2;
        this.MediaDescriptionCompat = setrequestedframerate;
    }
}
