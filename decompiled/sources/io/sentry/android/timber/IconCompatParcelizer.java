package io.sentry.android.timber;

import fwfd.com.fwfsdk.constant.FWFConstants;
import io.sentry.SentryAttributes;
import io.sentry.protocol.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
import io.socket.parser.IOParser$Decoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import o.BannerViewExternalSyntheticLambda2;
import o.ProtoPrerequisiteMsgserializer;
import o.accessgetDismissSubscriberp;
import o.executelambda4;
import o.fireOnDismissCallbacklambda0;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.logClicklambda0;
import o.performDismissTeardownlambda1;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final class IconCompatParcelizer extends ProtoPrerequisiteMsgserializer {
    public final r8lambdaL32xCEzW71g2Xzeh1NM3NImxco IconCompatParcelizer;
    public final ThreadLocal RemoteActionCompatParcelizer;
    public final logClicklambda0 read;
    public final accessgetDismissSubscriberp serializer;
    public final r8lambdaL32xCEzW71g2Xzeh1NM3NImxco write;

    @Override // o.ProtoPrerequisiteMsgserializer
    public final void read(String str, Object... objArr) {
        super.read(str, Arrays.copyOf(objArr, objArr.length));
        RemoteActionCompatParcelizer(6, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // o.ProtoPrerequisiteMsgserializer
    public final void read(Throwable th, String str, Object... objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        write(4, th, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        RemoteActionCompatParcelizer(4, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // o.ProtoPrerequisiteMsgserializer
    public final void serializer(Throwable th, String str, Object... objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        write(5, th, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        RemoteActionCompatParcelizer(5, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    public final void RemoteActionCompatParcelizer(int i, Throwable th, String str, Object... objArr) {
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco;
        logClicklambda0 logclicklambda0;
        SentryAttributes sentryAttributes;
        getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1;
        ThreadLocal threadLocal = this.RemoteActionCompatParcelizer;
        String str2 = (String) threadLocal.get();
        if (str2 != null) {
            threadLocal.remove();
        }
        if ((str == null || str.length() == 0) && th == null) {
            return;
        }
        switch (i) {
            case 2:
                r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
                break;
            case 3:
                r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
                break;
            case 4:
                r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO;
                break;
            case 5:
                r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING;
                break;
            case 6:
                r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR;
                break;
            case 7:
                r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.FATAL;
                break;
            default:
                r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
                break;
        }
        switch (i) {
            case 2:
                logclicklambda0 = logClicklambda0.TRACE;
                break;
            case 3:
                logclicklambda0 = logClicklambda0.DEBUG;
                break;
            case 4:
                logclicklambda0 = logClicklambda0.INFO;
                break;
            case 5:
                logclicklambda0 = logClicklambda0.WARN;
                break;
            case 6:
                logclicklambda0 = logClicklambda0.ERROR;
                break;
            case 7:
                logclicklambda0 = logClicklambda0.FATAL;
                break;
            default:
                logclicklambda0 = logClicklambda0.DEBUG;
                break;
        }
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys = new r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        r8lambda54beh8zsbru0cxi2ccsp2synys.RemoteActionCompatParcelizer = str;
        if (str != null && str.length() != 0 && objArr.length != 0) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            r8lambda54beh8zsbru0cxi2ccsp2synys.read = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(String.valueOf(obj));
        }
        r8lambda54beh8zsbru0cxi2ccsp2synys.serializer = new ArrayList(arrayList);
        int iOrdinal = r8lambdal32xcezw71g2xzeh1nm3nimxco.ordinal();
        int iOrdinal2 = this.IconCompatParcelizer.ordinal();
        accessgetDismissSubscriberp accessgetdismisssubscriberp = this.serializer;
        if (iOrdinal >= iOrdinal2) {
            BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2 = new BannerViewExternalSyntheticLambda2();
            bannerViewExternalSyntheticLambda2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r8lambdal32xcezw71g2xzeh1nm3nimxco;
            if (th != null) {
                bannerViewExternalSyntheticLambda2.MediaSessionCompatToken = th;
            }
            if (str2 != null) {
                bannerViewExternalSyntheticLambda2.IconCompatParcelizer("TimberTag", str2);
            }
            bannerViewExternalSyntheticLambda2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambda54beh8zsbru0cxi2ccsp2synys;
            bannerViewExternalSyntheticLambda2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = "Timber";
            accessgetdismisssubscriberp.getClass();
            accessgetdismisssubscriberp.RemoteActionCompatParcelizer(bannerViewExternalSyntheticLambda2, new executelambda4());
        }
        if (r8lambdal32xcezw71g2xzeh1nm3nimxco.ordinal() >= this.write.ordinal()) {
            String message = th != null ? th.getMessage() : null;
            if (r8lambda54beh8zsbru0cxi2ccsp2synys.RemoteActionCompatParcelizer != null) {
                getintentarraywithconfiguredbackstacklambda1 = new getIntentArrayWithConfiguredBackStacklambda1();
                getintentarraywithconfiguredbackstacklambda1.read = r8lambdal32xcezw71g2xzeh1nm3nimxco;
                getintentarraywithconfiguredbackstacklambda1.write = "Timber";
                String str3 = r8lambda54beh8zsbru0cxi2ccsp2synys.read;
                if (str3 == null) {
                    str3 = r8lambda54beh8zsbru0cxi2ccsp2synys.RemoteActionCompatParcelizer;
                }
                getintentarraywithconfiguredbackstacklambda1.serializer = str3;
            } else if (message != null) {
                getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda2 = new getIntentArrayWithConfiguredBackStacklambda1();
                getintentarraywithconfiguredbackstacklambda2.MediaSessionCompatQueueItem = FWFConstants.EXPLANATION_TYPE_ERROR;
                getintentarraywithconfiguredbackstacklambda2.serializer = message;
                getintentarraywithconfiguredbackstacklambda2.read = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR;
                getintentarraywithconfiguredbackstacklambda2.write = "exception";
                getintentarraywithconfiguredbackstacklambda1 = getintentarraywithconfiguredbackstacklambda2;
            } else {
                getintentarraywithconfiguredbackstacklambda1 = null;
            }
            if (getintentarraywithconfiguredbackstacklambda1 != null) {
                accessgetdismisssubscriberp.read(getintentarraywithconfiguredbackstacklambda1);
            }
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, objArr.length);
        if (logclicklambda0.ordinal() >= this.read.ordinal()) {
            if (str2 != null) {
                fireOnDismissCallbacklambda0[] fireondismisscallbacklambda0Arr = {new fireOnDismissCallbacklambda0(performDismissTeardownlambda1.STRING, str2)};
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(1);
                sentryAttributes = new SentryAttributes(concurrentHashMap);
                fireOnDismissCallbacklambda0 fireondismisscallbacklambda0 = fireondismisscallbacklambda0Arr[0];
                if (fireondismisscallbacklambda0 != null) {
                    concurrentHashMap.put("timber.tag", fireondismisscallbacklambda0);
                }
            } else {
                sentryAttributes = null;
            }
            IOParser$Decoder iOParser$Decoder = new IOParser$Decoder(22);
            iOParser$Decoder.RemoteActionCompatParcelizer = sentryAttributes;
            iOParser$Decoder.read = "auto.log.timber";
            String message2 = th != null ? th.getMessage() : null;
            if (str == null || message2 == null) {
                if (str != null) {
                    accessgetdismisssubscriberp.MediaDescriptionCompat().IconCompatParcelizer(logclicklambda0, iOParser$Decoder, str, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
                    return;
                } else {
                    if (message2 != null) {
                        accessgetdismisssubscriberp.MediaDescriptionCompat().IconCompatParcelizer(logclicklambda0, iOParser$Decoder, message2, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
                        return;
                    }
                    return;
                }
            }
            accessgetdismisssubscriberp.MediaDescriptionCompat().IconCompatParcelizer(logclicklambda0, iOParser$Decoder, str + '\n' + message2, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
        }
    }

    public IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco, r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco2, logClicklambda0 logclicklambda0) {
        r8lambdal32xcezw71g2xzeh1nm3nimxco.getClass();
        r8lambdal32xcezw71g2xzeh1nm3nimxco2.getClass();
        logclicklambda0.getClass();
        this.serializer = accessgetDismissSubscriberp.IconCompatParcelizer;
        this.IconCompatParcelizer = r8lambdal32xcezw71g2xzeh1nm3nimxco;
        this.write = r8lambdal32xcezw71g2xzeh1nm3nimxco2;
        this.read = logclicklambda0;
        this.RemoteActionCompatParcelizer = new ThreadLocal();
    }

    @Override // o.ProtoPrerequisiteMsgserializer
    public final void IconCompatParcelizer(int i, String str, String str2, Throwable th) {
        str2.getClass();
        this.RemoteActionCompatParcelizer.set(str);
    }

    @Override // o.ProtoPrerequisiteMsgserializer
    public final void RemoteActionCompatParcelizer(Throwable th, String str, Object... objArr) {
        super.RemoteActionCompatParcelizer(th, str, Arrays.copyOf(objArr, objArr.length));
        RemoteActionCompatParcelizer(6, th, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // o.ProtoPrerequisiteMsgserializer
    public final void write(Throwable th) {
        super.write(th);
        RemoteActionCompatParcelizer(6, th, null, new Object[0]);
    }

    @Override // o.ProtoPrerequisiteMsgserializer
    public final void IconCompatParcelizer(String str, Object... objArr) {
        super.IconCompatParcelizer(str, Arrays.copyOf(objArr, objArr.length));
        RemoteActionCompatParcelizer(4, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // o.ProtoPrerequisiteMsgserializer
    public final void RemoteActionCompatParcelizer(String str, Object... objArr) {
        super.RemoteActionCompatParcelizer(str, Arrays.copyOf(objArr, objArr.length));
        RemoteActionCompatParcelizer(5, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // o.ProtoPrerequisiteMsgserializer
    public final void read(Throwable th) {
        super.read(th);
        RemoteActionCompatParcelizer(5, th, null, new Object[0]);
    }

    @Override // o.ProtoPrerequisiteMsgserializer
    public final void serializer(Throwable th) {
        super.serializer(th);
        RemoteActionCompatParcelizer(4, th, null, new Object[0]);
    }
}
