package io.sentry.okhttp;

import curtains.internal.RootViewsSpy$Companion$install$1$1;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o.FocusTransactionsKtWhenMappings;
import o._get_messageWebView_lambda1;
import o.applyDisplayCutoutMarginsToCloseButton;
import o.clipCanvasToPath;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.getMessageTextView;
import o.r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc;
import o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0;
import o.r8lambda_bWawdAasft8AkGttqAQu77625c;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.setInAppMessageImageViewAttributes;
import okhttp3.EventListener;

/* JADX INFO: loaded from: classes4.dex */
public final class read extends EventListener {
    public static final ConcurrentHashMap write = new ConcurrentHashMap();

    @Override // okhttp3.EventListener
    public final void cacheMiss(getMessageTextView getmessagetextview) {
        getmessagetextview.getClass();
    }

    @Override // okhttp3.EventListener
    public final void canceled(getMessageTextView getmessagetextview) {
        getmessagetextview.getClass();
    }

    @Override // okhttp3.EventListener
    public final void callEnd(getMessageTextView getmessagetextview) {
        serializer serializerVar = (serializer) write.remove(getmessagetextview);
        if (serializerVar == null) {
            return;
        }
        serializerVar.write(null);
    }

    @Override // okhttp3.EventListener
    public final void cacheConditionalHit(getMessageTextView getmessagetextview, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        getmessagetextview.getClass();
        _get_messagewebview_lambda1.getClass();
    }

    @Override // okhttp3.EventListener
    public final void cacheHit(getMessageTextView getmessagetextview, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        getmessagetextview.getClass();
        _get_messagewebview_lambda1.getClass();
    }

    @Override // okhttp3.EventListener
    public final void callStart(getMessageTextView getmessagetextview) {
        getmessagetextview.getClass();
        if (write()) {
            write.put(getmessagetextview, new serializer(((clipCanvasToPath) getmessagetextview).originalRequest));
        }
    }

    @Override // okhttp3.EventListener
    public final void connectEnd(getMessageTextView getmessagetextview, InetSocketAddress inetSocketAddress, Proxy proxy, r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc) {
        serializer serializerVar;
        getmessagetextview.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        if (write() && (serializerVar = (serializer) write.get(getmessagetextview)) != null) {
            String strName = r8lambdacwme7obcpvw4lrr1hr7xiufmyc != null ? r8lambdacwme7obcpvw4lrr1hr7xiufmyc.name() : null;
            if (strName != null) {
                serializerVar.write.read(strName, "protocol");
                r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = serializerVar.IconCompatParcelizer;
                if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
                    r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(strName, "protocol");
                }
            }
            serializerVar.read("http.connect_ms", null);
        }
    }

    @Override // okhttp3.EventListener
    public final void connectFailed(getMessageTextView getmessagetextview, InetSocketAddress inetSocketAddress, Proxy proxy, r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc, IOException iOException) {
        serializer serializerVar;
        getmessagetextview.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        iOException.getClass();
        if (write() && (serializerVar = (serializer) write.get(getmessagetextview)) != null) {
            String strName = r8lambdacwme7obcpvw4lrr1hr7xiufmyc != null ? r8lambdacwme7obcpvw4lrr1hr7xiufmyc.name() : null;
            if (strName != null) {
                serializerVar.write.read(strName, "protocol");
                r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = serializerVar.IconCompatParcelizer;
                if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
                    r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(strName, "protocol");
                }
            }
            serializerVar.RemoteActionCompatParcelizer(iOException.getMessage());
            serializerVar.read("http.connect_ms", new RootViewsSpy$Companion$install$1$1(9, iOException));
        }
    }

    @Override // okhttp3.EventListener
    public final void connectStart(getMessageTextView getmessagetextview, InetSocketAddress inetSocketAddress, Proxy proxy) {
        serializer serializerVar;
        getmessagetextview.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        if (write() && (serializerVar = (serializer) write.get(getmessagetextview)) != null) {
            serializerVar.onEventStart("http.connect_ms");
        }
    }

    @Override // okhttp3.EventListener
    public final void connectionAcquired(getMessageTextView getmessagetextview, r8lambda_bWawdAasft8AkGttqAQu77625c r8lambda_bwawdaasft8akgttqaqu77625c) {
        serializer serializerVar;
        getmessagetextview.getClass();
        r8lambda_bwawdaasft8akgttqaqu77625c.getClass();
        if (write() && (serializerVar = (serializer) write.get(getmessagetextview)) != null) {
            serializerVar.onEventStart("http.connection_ms");
        }
    }

    @Override // okhttp3.EventListener
    public final void connectionReleased(getMessageTextView getmessagetextview, r8lambda_bWawdAasft8AkGttqAQu77625c r8lambda_bwawdaasft8akgttqaqu77625c) {
        serializer serializerVar;
        getmessagetextview.getClass();
        r8lambda_bwawdaasft8akgttqaqu77625c.getClass();
        if (write() && (serializerVar = (serializer) write.get(getmessagetextview)) != null) {
            serializerVar.read("http.connection_ms", null);
        }
    }

    @Override // okhttp3.EventListener
    public final void dnsEnd(getMessageTextView getmessagetextview, String str, List list) {
        serializer serializerVar;
        getmessagetextview.getClass();
        str.getClass();
        list.getClass();
        if (write() && (serializerVar = (serializer) write.get(getmessagetextview)) != null) {
            serializerVar.read("http.client.resolve_dns_ms", new FocusTransactionsKtWhenMappings(str, 2, list));
        }
    }

    @Override // okhttp3.EventListener
    public final void dnsStart(getMessageTextView getmessagetextview, String str) {
        serializer serializerVar;
        getmessagetextview.getClass();
        str.getClass();
        if (write() && (serializerVar = (serializer) write.get(getmessagetextview)) != null) {
            serializerVar.onEventStart("http.client.resolve_dns_ms");
        }
    }

    @Override // okhttp3.EventListener
    public final void proxySelectEnd(getMessageTextView getmessagetextview, setInAppMessageImageViewAttributes setinappmessageimageviewattributes, List list) {
        serializer serializerVar;
        getmessagetextview.getClass();
        setinappmessageimageviewattributes.getClass();
        list.getClass();
        if (write() && (serializerVar = (serializer) write.get(getmessagetextview)) != null) {
            serializerVar.read("http.client.proxy_select_ms", new RootViewsSpy$Companion$install$1$1(10, list));
        }
    }

    @Override // okhttp3.EventListener
    public final void proxySelectStart(getMessageTextView getmessagetextview, setInAppMessageImageViewAttributes setinappmessageimageviewattributes) {
        serializer serializerVar;
        getmessagetextview.getClass();
        setinappmessageimageviewattributes.getClass();
        if (write() && (serializerVar = (serializer) write.get(getmessagetextview)) != null) {
            serializerVar.onEventStart("http.client.proxy_select_ms");
        }
    }

    @Override // okhttp3.EventListener
    public final void requestBodyStart(getMessageTextView getmessagetextview) {
        serializer serializerVar;
        getmessagetextview.getClass();
        if (write() && (serializerVar = (serializer) write.get(getmessagetextview)) != null) {
            serializerVar.onEventStart("http.connection.request_body_ms");
        }
    }

    @Override // okhttp3.EventListener
    public final void requestFailed(getMessageTextView getmessagetextview, IOException iOException) {
        serializer serializerVar;
        getmessagetextview.getClass();
        iOException.getClass();
        if (write() && (serializerVar = (serializer) write.get(getmessagetextview)) != null) {
            serializerVar.RemoteActionCompatParcelizer(iOException.getMessage());
            serializerVar.read("http.connection.request_headers_ms", new SentryOkHttpEventListener$callFailed$1(2, iOException));
            serializerVar.read("http.connection.request_body_ms", new SentryOkHttpEventListener$callFailed$1(3, iOException));
        }
    }

    @Override // okhttp3.EventListener
    public final void requestHeadersEnd(getMessageTextView getmessagetextview, r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60) {
        serializer serializerVar;
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        if (write() && (serializerVar = (serializer) write.get(getmessagetextview)) != null) {
            serializerVar.read("http.connection.request_headers_ms", null);
        }
    }

    @Override // okhttp3.EventListener
    public final void requestHeadersStart(getMessageTextView getmessagetextview) {
        serializer serializerVar;
        getmessagetextview.getClass();
        if (write() && (serializerVar = (serializer) write.get(getmessagetextview)) != null) {
            serializerVar.onEventStart("http.connection.request_headers_ms");
        }
    }

    @Override // okhttp3.EventListener
    public final void responseBodyStart(getMessageTextView getmessagetextview) {
        serializer serializerVar;
        getmessagetextview.getClass();
        if (write() && (serializerVar = (serializer) write.get(getmessagetextview)) != null) {
            serializerVar.onEventStart("http.connection.response_body_ms");
        }
    }

    @Override // okhttp3.EventListener
    public final void responseFailed(getMessageTextView getmessagetextview, IOException iOException) {
        serializer serializerVar;
        getmessagetextview.getClass();
        iOException.getClass();
        if (write() && (serializerVar = (serializer) write.get(getmessagetextview)) != null) {
            serializerVar.RemoteActionCompatParcelizer(iOException.getMessage());
            serializerVar.read("http.connection.response_headers_ms", new SentryOkHttpEventListener$callFailed$1(4, iOException));
            serializerVar.read("http.connection.response_body_ms", new SentryOkHttpEventListener$callFailed$1(5, iOException));
        }
    }

    @Override // okhttp3.EventListener
    public final void responseHeadersStart(getMessageTextView getmessagetextview) {
        serializer serializerVar;
        getmessagetextview.getClass();
        if (write() && (serializerVar = (serializer) write.get(getmessagetextview)) != null) {
            serializerVar.onEventStart("http.connection.response_headers_ms");
        }
    }

    @Override // okhttp3.EventListener
    public final void satisfactionFailure(getMessageTextView getmessagetextview, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        getmessagetextview.getClass();
        _get_messagewebview_lambda1.getClass();
    }

    @Override // okhttp3.EventListener
    public final void secureConnectEnd(getMessageTextView getmessagetextview, applyDisplayCutoutMarginsToCloseButton applydisplaycutoutmarginstoclosebutton) {
        serializer serializerVar;
        getmessagetextview.getClass();
        if (write() && (serializerVar = (serializer) write.get(getmessagetextview)) != null) {
            serializerVar.read("http.connect.secure_connect_ms", null);
        }
    }

    @Override // okhttp3.EventListener
    public final void secureConnectStart(getMessageTextView getmessagetextview) {
        serializer serializerVar;
        getmessagetextview.getClass();
        if (write() && (serializerVar = (serializer) write.get(getmessagetextview)) != null) {
            serializerVar.onEventStart("http.connect.secure_connect_ms");
        }
    }

    public final boolean write() {
        return !"io.sentry.android.okhttp.SentryOkHttpEventListener".equals(null);
    }

    @Override // okhttp3.EventListener
    public final void callFailed(getMessageTextView getmessagetextview, IOException iOException) {
        serializer serializerVar;
        if (write() && (serializerVar = (serializer) write.remove(getmessagetextview)) != null) {
            serializerVar.RemoteActionCompatParcelizer(iOException.getMessage());
            serializerVar.write(new SentryOkHttpEventListener$callFailed$1(0, iOException));
        }
    }

    @Override // okhttp3.EventListener
    public final void requestBodyEnd(getMessageTextView getmessagetextview, long j) {
        serializer serializerVar;
        if (write() && (serializerVar = (serializer) write.get(getmessagetextview)) != null) {
            serializerVar.read("http.connection.request_body_ms", new write(j, 0));
            if (j > -1) {
                serializerVar.write.read(Long.valueOf(j), "request_content_length");
                r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = serializerVar.IconCompatParcelizer;
                if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
                    r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(Long.valueOf(j), "http.request_content_length");
                }
            }
        }
    }

    @Override // okhttp3.EventListener
    public final void responseBodyEnd(getMessageTextView getmessagetextview, long j) {
        serializer serializerVar;
        if (write() && (serializerVar = (serializer) write.get(getmessagetextview)) != null) {
            if (j > -1) {
                serializerVar.write.read(Long.valueOf(j), "response_content_length");
                r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = serializerVar.IconCompatParcelizer;
                if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
                    r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(Long.valueOf(j), "http.response_content_length");
                }
            }
            serializerVar.read("http.connection.response_body_ms", new write(j, 1));
        }
    }

    @Override // okhttp3.EventListener
    public final void responseHeadersEnd(getMessageTextView getmessagetextview, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        serializer serializerVar;
        if (write() && (serializerVar = (serializer) write.get(getmessagetextview)) != null) {
            serializerVar.MediaDescriptionCompat = _get_messagewebview_lambda1;
            getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = serializerVar.write;
            r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc = _get_messagewebview_lambda1.protocol;
            getintentarraywithconfiguredbackstacklambda1.read(r8lambdacwme7obcpvw4lrr1hr7xiufmyc.name(), "protocol");
            int i = _get_messagewebview_lambda1.code;
            getintentarraywithconfiguredbackstacklambda1.read(Integer.valueOf(i), "status_code");
            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = serializerVar.IconCompatParcelizer;
            if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
                r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(r8lambdacwme7obcpvw4lrr1hr7xiufmyc.name(), "protocol");
            }
            if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
                r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(Integer.valueOf(i), "http.response.status_code");
            }
            serializerVar.read("http.connection.response_headers_ms", new RootViewsSpy$Companion$install$1$1(11, _get_messagewebview_lambda1));
        }
    }
}
