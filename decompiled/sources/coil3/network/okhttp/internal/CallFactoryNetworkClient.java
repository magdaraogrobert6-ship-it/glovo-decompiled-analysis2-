package coil3.network.okhttp.internal;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import io.grpc.LoadBalancer$Helper;
import java.io.Closeable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.ReusableGraphicsLayerScope;
import o._get_messageWebView_lambda1;
import o.clipCanvasToPath;
import o.createBlurEffect8A3gB4;
import o.getCieXyz;
import o.getMessageImageView;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.removeNodeAtDepth;
import o.setLayoutDirectionui;
import o.setSizeuvyYCjk;
import o.sourceInformationContextOfdefault;
import org.koin.androidx.viewmodel.GetViewModelKt;

/* JADX INFO: loaded from: classes.dex */
public final class CallFactoryNetworkClient {
    public final getMessageImageView serializer;

    public static final /* synthetic */ CallFactoryNetworkClient RemoteActionCompatParcelizer(getMessageImageView getmessageimageview) {
        return new CallFactoryNetworkClient(getmessageimageview);
    }

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    public /* synthetic */ CallFactoryNetworkClient(getMessageImageView getmessageimageview) {
        this.serializer = getmessageimageview;
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.serializer + ")";
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: executeRequest-impl, reason: not valid java name */
    public static Object m3986executeRequestimpl(getMessageImageView getmessageimageview, ReusableGraphicsLayerScope reusableGraphicsLayerScope, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ContinuationImpl continuationImpl) {
        setLayoutDirectionui setlayoutdirectionui;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
        getMessageImageView getmessageimageview2;
        Object objAccess$toRequest;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2;
        Closeable closeable;
        Closeable closeable2;
        Throwable th;
        if (continuationImpl instanceof setLayoutDirectionui) {
            setlayoutdirectionui = (setLayoutDirectionui) continuationImpl;
            int i = setlayoutdirectionui.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                setlayoutdirectionui.read = i - Integer.MIN_VALUE;
            } else {
                setlayoutdirectionui = new setLayoutDirectionui(continuationImpl);
            }
        } else {
            setlayoutdirectionui = new setLayoutDirectionui(continuationImpl);
        }
        Object objInvoke = setlayoutdirectionui.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = setlayoutdirectionui.read;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
            setlayoutdirectionui.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
            getmessageimageview2 = getmessageimageview;
            setlayoutdirectionui.RemoteActionCompatParcelizer = getmessageimageview2;
            setlayoutdirectionui.read = 1;
            objAccess$toRequest = GetViewModelKt.access$toRequest(reusableGraphicsLayerScope, setlayoutdirectionui);
            if (objAccess$toRequest != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) setlayoutdirectionui.write;
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                closeable = (Closeable) objInvoke;
                try {
                    createBlurEffect8A3gB4 createblureffect8a3gb4IconCompatParcelizer = GetViewModelKt.IconCompatParcelizer((_get_messageWebView_lambda1) closeable);
                    setlayoutdirectionui.write = closeable;
                    setlayoutdirectionui.read = 3;
                    objInvoke = r8lambdaa6_tctqmksh3fk6hjgcbkuvde2.invoke(createblureffect8a3gb4IconCompatParcelizer, setlayoutdirectionui);
                    if (objInvoke != coroutineSingletons) {
                        closeable2 = closeable;
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{closeable2, null}, sourceInformationContextOfdefault.read());
                        return objInvoke;
                    }
                    return coroutineSingletons;
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    throw th;
                }
            }
            if (i2 != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            closeable2 = (Closeable) setlayoutdirectionui.write;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{closeable2, null}, sourceInformationContextOfdefault.read());
                return objInvoke;
            } catch (Throwable th3) {
                th = th3;
                closeable = closeable2;
                th = th;
                try {
                    throw th;
                } catch (Throwable th4) {
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{closeable, th}, sourceInformationContextOfdefault.read());
                    throw th4;
                }
            }
        }
        getmessageimageview2 = setlayoutdirectionui.RemoteActionCompatParcelizer;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) setlayoutdirectionui.write;
        ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        objAccess$toRequest = objInvoke;
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde3;
        clipCanvasToPath clipcanvastopathIconCompatParcelizer = getmessageimageview2.IconCompatParcelizer((r8lambday113fDFTSR5e4PZj6XsSXLtpL60) objAccess$toRequest);
        setlayoutdirectionui.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
        setlayoutdirectionui.RemoteActionCompatParcelizer = null;
        setlayoutdirectionui.read = 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(setlayoutdirectionui));
        cancellableContinuationImpl.read();
        int i3 = 0;
        cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new setSizeuvyYCjk(i3, clipcanvastopathIconCompatParcelizer));
        FirebasePerfOkHttpClient.enqueue(clipcanvastopathIconCompatParcelizer, new CallsKt$await$2$2(cancellableContinuationImpl, i3));
        Object result = cancellableContinuationImpl.getResult();
        if (result != coroutineSingletons) {
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
            objInvoke = result;
            closeable = (Closeable) objInvoke;
            createBlurEffect8A3gB4 createblureffect8a3gb4IconCompatParcelizer2 = GetViewModelKt.IconCompatParcelizer((_get_messageWebView_lambda1) closeable);
            setlayoutdirectionui.write = closeable;
            setlayoutdirectionui.read = 3;
            objInvoke = r8lambdaa6_tctqmksh3fk6hjgcbkuvde2.invoke(createblureffect8a3gb4IconCompatParcelizer2, setlayoutdirectionui);
            if (objInvoke != coroutineSingletons) {
                closeable2 = closeable;
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{closeable2, null}, sourceInformationContextOfdefault.read());
                return objInvoke;
            }
        }
        return coroutineSingletons;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CallFactoryNetworkClient)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((CallFactoryNetworkClient) obj).serializer}, getCieXyz.write())).booleanValue();
    }
}
