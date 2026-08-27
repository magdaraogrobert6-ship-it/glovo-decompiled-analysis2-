package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.thrift.MotionActivity;
import io.sentry.JsonObjectSerializer;
import io.sentry.util.network.NetworkBody;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.net.ssl.SSLSocket;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdadeOzq815xUUwmlLYYvm_QV79QY implements setSdkDataWipeEventSubscriber, FwFClientKt {
    public Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public Object serializer;
    public Object write;

    public r8lambdadeOzq815xUUwmlLYYvm_QV79QY() {
        this.read = 15;
        String strM = d$$ExternalSyntheticOutline0.m();
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        this.RemoteActionCompatParcelizer = ImageHeaderParserImageType.serializer(strM);
        this.write = MultipartBody.IconCompatParcelizer;
        this.serializer = new ArrayList();
    }

    @Override // o.FwFClientKt
    public Object IconCompatParcelizer(Object obj) {
        JsonObjectSerializer jsonObjectSerializer = (JsonObjectSerializer) this.serializer;
        InAppMessageHtmlBaseView inAppMessageHtmlBaseView = (InAppMessageHtmlBaseView) this.RemoteActionCompatParcelizer;
        String strRemoteActionCompatParcelizer = ((r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc) jsonObjectSerializer.jsonReflectionObjectSerializer).RemoteActionCompatParcelizer((setGraphicModalMaxWidthDp) this.write, obj);
        RequestBody.Companion.getClass();
        return r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.serializer(strRemoteActionCompatParcelizer, inAppMessageHtmlBaseView);
    }

    public BannerViewExternalSyntheticLambda2 MediaBrowserCompatMediaItem() {
        return (BannerViewExternalSyntheticLambda2) this.RemoteActionCompatParcelizer;
    }

    public NetworkBody MediaDescriptionCompat() {
        return (NetworkBody) this.write;
    }

    public MultipartBody MediaMetadataCompat() {
        ArrayList arrayList = (ArrayList) this.serializer;
        if (!arrayList.isEmpty()) {
            return new MultipartBody((RequestBuilder) this.RemoteActionCompatParcelizer, (InAppMessageHtmlBaseView) this.write, setWebViewContent.read(arrayList));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Multipart body must have at least one part.");
        return null;
    }

    public io.sentry.hints.read MediaSessionCompatQueueItem() {
        return (io.sentry.hints.read) this.serializer;
    }

    public executelambda4 PlaybackStateCompat() {
        return (executelambda4) this.write;
    }

    public Long PlaybackStateCompatCustomAction() {
        return (Long) this.RemoteActionCompatParcelizer;
    }

    public Map RatingCompat() {
        return (LinkedHashMap) this.serializer;
    }

    @Override // o.setSdkDataWipeEventSubscriber
    public void write(Object obj) {
        setContentCardsUpdatedSubscriber setcontentcardsupdatedsubscriber = (setContentCardsUpdatedSubscriber) this.RemoteActionCompatParcelizer;
        try {
            if (obj instanceof String) {
                ViewUtilsExternalSyntheticLambda1 viewUtilsExternalSyntheticLambda1 = setcontentcardsupdatedsubscriber.PlaybackStateCompatCustomAction;
                viewUtilsExternalSyntheticLambda1.getClass();
                RequestBuilder requestBuilder = RequestBuilder.EMPTY;
                viewUtilsExternalSyntheticLambda1.RemoteActionCompatParcelizer(1, ImageHeaderParserImageType.serializer((String) obj));
            } else if (obj instanceof byte[]) {
                ViewUtilsExternalSyntheticLambda1 viewUtilsExternalSyntheticLambda2 = setcontentcardsupdatedsubscriber.PlaybackStateCompatCustomAction;
                RequestBuilder requestBuilder2 = RequestBuilder.EMPTY;
                RequestBuilder requestBuilderIconCompatParcelizer = ImageHeaderParserImageType.IconCompatParcelizer((byte[]) obj);
                viewUtilsExternalSyntheticLambda2.getClass();
                viewUtilsExternalSyntheticLambda2.RemoteActionCompatParcelizer(2, requestBuilderIconCompatParcelizer);
            }
        } catch (IllegalStateException unused) {
            setContentCardsUpdatedSubscriber.ParcelableVolumeInfo.fine("websocket closed before we could write");
        }
        int[] iArr = (int[]) this.write;
        int i = iArr[0] - 1;
        iArr[0] = i;
        if (i == 0) {
            ((r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74) this.serializer).run();
        }
    }

    public void IconCompatParcelizer(InAppMessageHtmlBaseView inAppMessageHtmlBaseView) {
        inAppMessageHtmlBaseView.getClass();
        if (inAppMessageHtmlBaseView.type.equals("multipart")) {
            this.write = inAppMessageHtmlBaseView;
        } else {
            DrawableTransformation.serializer(inAppMessageHtmlBaseView, "multipart != ");
        }
    }

    public Object IconCompatParcelizer(SSLSocket sSLSocket, Object... objArr) {
        Method method = read(sSLSocket.getClass());
        if (method == null) {
            throw new AssertionError("Method " + ((String) this.write) + " not supported for object " + sSLSocket);
        }
        try {
            return method.invoke(sSLSocket, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + method);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    public void read(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method method = read(sSLSocket.getClass());
            if (method == null) {
                return;
            }
            try {
                method.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public void read(resetMessageMarginslambda00 resetmessagemarginslambda00, RequestBody requestBody) {
        requestBody.getClass();
        if (resetmessagemarginslambda00.write(ConstantKt.CONTENT_TYPE_HEADER) != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected header: Content-Type");
        } else if (resetmessagemarginslambda00.write("Content-Length") != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected header: Content-Length");
        } else {
            ((ArrayList) this.serializer).add(new r8lambdaCTegLFIY2N5eeYL50pY32CICZRI(resetmessagemarginslambda00, requestBody));
        }
    }

    public String toString() {
        if (this.read != 13) {
            return super.toString();
        }
        return "ReplayNetworkRequestOrResponse{size=" + ((Long) this.RemoteActionCompatParcelizer) + ", body=" + ((NetworkBody) this.write) + ", headers=" + ((LinkedHashMap) this.serializer) + '}';
    }

    public /* synthetic */ r8lambdadeOzq815xUUwmlLYYvm_QV79QY(byte b, int i) {
        this.read = i;
    }

    public /* synthetic */ r8lambdadeOzq815xUUwmlLYYvm_QV79QY(Object obj, Object obj2, Object obj3, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
        this.write = obj2;
        this.serializer = obj3;
    }

    public r8lambdadeOzq815xUUwmlLYYvm_QV79QY(int i) {
        this.read = 16;
        this.RemoteActionCompatParcelizer = new long[i];
        this.write = new BitSet(i);
        this.serializer = new long[i];
    }

    public IBrazeEndpointProvider read() {
        int i = ((IBrazeDeeplinkHandlerIntentFlagPurpose) this.RemoteActionCompatParcelizer) != null ? 1 : 0;
        if (((createUriActionFromUrlString) this.write) != null) {
            i++;
        }
        if (((setCustomUserAttributelambda5) this.serializer) != null) {
            i++;
        }
        if (i == 1) {
            return new IBrazeEndpointProvider(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i, "Invalid union; ", " field(s) were set"));
        return null;
    }

    public setDefaultNotificationChannelDescriptionlambda0 write() {
        if (((Byte) this.RemoteActionCompatParcelizer) != null) {
            if (((Long) this.write) != null) {
                return new setDefaultNotificationChannelDescriptionlambda0(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'timestamp' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'call_event_type' is missing");
        return null;
    }

    public getDeviceObjectAllowlistandroid_sdk_base_release RemoteActionCompatParcelizer() {
        if (((Long) this.RemoteActionCompatParcelizer) != null) {
            if (((Map) this.write) != null) {
                return new getDeviceObjectAllowlistandroid_sdk_base_release(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'tags' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'id' is missing");
        return null;
    }

    public getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations serializer() {
        if (((Long) this.RemoteActionCompatParcelizer) != null) {
            if (((MotionActivity) this.write) != null) {
                if (((getBRAZE_PUSH_DELIVERY_ENABLED_KEYannotations) this.serializer) != null) {
                    return new getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations(this);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'confidence' is missing");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'motion_activity' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'timestamp' is missing");
        return null;
    }

    public getDoesPushStoryDismissOnClickandroid_sdk_base_release IconCompatParcelizer() {
        if (((String) this.RemoteActionCompatParcelizer) != null) {
            if (((Integer) this.write) != null) {
                if (((getDefaultNotificationAccentColorandroid_sdk_base_release) this.serializer) != null) {
                    return new getDoesPushStoryDismissOnClickandroid_sdk_base_release(this);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'annotation' is missing");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'timestamp_offset' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'id' is missing");
        return null;
    }

    public Method read(Class cls) {
        Method method;
        Class cls2;
        try {
            method = cls.getMethod((String) this.write, (Class[]) this.serializer);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    method = null;
                }
            } catch (NoSuchMethodException unused) {
            }
        } catch (NoSuchMethodException unused2) {
        }
        if (method == null || (cls2 = (Class) this.RemoteActionCompatParcelizer) == null || cls2.isAssignableFrom(method.getReturnType())) {
            return method;
        }
        return null;
    }
}
