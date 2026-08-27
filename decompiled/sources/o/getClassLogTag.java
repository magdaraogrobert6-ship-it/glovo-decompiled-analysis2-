package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_http.ConstantKt;
import java.nio.charset.Charset;
import kotlinx.coroutines.BuildersKt;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes4.dex */
public final class getClassLogTag implements getShortEdge {
    public volatile ItemTouchHelperAdapter IconCompatParcelizer;
    public volatile r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig RemoteActionCompatParcelizer;
    public final r8lambdaShYuA3LlAERZVoeqw1lmW9mrt28 serializer = r8lambdaShYuA3LlAERZVoeqw1lmW9mrt28.IconCompatParcelizer;
    public volatile ItemTouchHelperAdapter write;

    public getClassLogTag(int i) {
        ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
        this.IconCompatParcelizer = itemTouchHelperAdapter;
        this.write = itemTouchHelperAdapter;
        this.RemoteActionCompatParcelizer = r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig.NONE;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0302  */
    /* JADX WARN: Code duplicated, block: B:105:0x0324  */
    /* JADX WARN: Code duplicated, block: B:107:0x032d A[LOOP:1: B:106:0x032b->B:107:0x032d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:145:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:94:0x0286  */
    /* JADX WARN: Code duplicated, block: B:95:0x0296  */
    /* JADX WARN: Code duplicated, block: B:98:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:99:0x02d4  */
    /* JADX WARN: Instruction removed from duplicated block: B:102:0x0302, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x0286, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:98:0x02c0, please report this as an issue */
    @Override // o.getShortEdge
    public final _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) throws Exception {
        String str;
        _get_messageWebView_lambda1 _get_messagewebview_lambda1Write;
        long jIconCompatParcelizer;
        String str2;
        StringBuilder sb;
        String str3;
        resetMessageMarginslambda00 resetmessagemarginslambda00;
        int iRemoteActionCompatParcelizer;
        int i;
        Long lValueOf;
        Charset charsetSerializer;
        Long lValueOf2;
        Charset charsetSerializer2;
        r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig r8lambdachmlgysnqdplvu9y_ksrct5sdig = this.RemoteActionCompatParcelizer;
        InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = inAppMessageModalView.MediaDescriptionCompat;
        if (r8lambdachmlgysnqdplvu9y_ksrct5sdig == r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig.NONE) {
            return inAppMessageModalView.write(r8lambday113fdftsr5e4pzj6xssxltpl60);
        }
        boolean z = true;
        boolean z2 = r8lambdachmlgysnqdplvu9y_ksrct5sdig == r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig.BODY;
        if (!z2 && r8lambdachmlgysnqdplvu9y_ksrct5sdig != r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig.HEADERS) {
            z = false;
        }
        RequestBody requestBody = r8lambday113fdftsr5e4pzj6xssxltpl60.body;
        r8lambda0088L0EiZH2mqIpRPuXhwYCr8 r8lambda0088l0eizh2mqiprpuxhwycr8 = inAppMessageModalView.IconCompatParcelizer;
        InAppMessageImmersiveBaseView inAppMessageImmersiveBaseViewRemoteActionCompatParcelizer = r8lambda0088l0eizh2mqiprpuxhwycr8 != null ? r8lambda0088l0eizh2mqiprpuxhwycr8.RemoteActionCompatParcelizer() : null;
        StringBuilder sb2 = new StringBuilder("--> ");
        sb2.append(r8lambday113fdftsr5e4pzj6xssxltpl60.method);
        sb2.append(' ');
        setInAppMessageImageViewAttributes setinappmessageimageviewattributes = r8lambday113fdftsr5e4pzj6xssxltpl60.url;
        setinappmessageimageviewattributes.getClass();
        this.write.getClass();
        sb2.append(setinappmessageimageviewattributes.url);
        String str4 = " ";
        sb2.append(inAppMessageImmersiveBaseViewRemoteActionCompatParcelizer != null ? " " + inAppMessageImmersiveBaseViewRemoteActionCompatParcelizer.protocol : "");
        String string = sb2.toString();
        if (!z && requestBody != null) {
            StringBuilder sbM = af$$ExternalSyntheticOutline0.m(string, " (");
            sbM.append(requestBody.contentLength());
            sbM.append("-byte body)");
            string = sbM.toString();
        }
        this.serializer.read(string);
        try {
            if (z) {
                resetMessageMarginslambda00 resetmessagemarginslambda01 = r8lambday113fdftsr5e4pzj6xssxltpl60.headers;
                if (requestBody != null) {
                    InAppMessageHtmlBaseView inAppMessageHtmlBaseViewContentType = requestBody.contentType();
                    if (inAppMessageHtmlBaseViewContentType != null && resetmessagemarginslambda01.write(ConstantKt.CONTENT_TYPE_HEADER) == null) {
                        this.serializer.read("Content-Type: " + inAppMessageHtmlBaseViewContentType);
                    }
                    if (requestBody.contentLength() != -1 && resetmessagemarginslambda01.write("Content-Length") == null) {
                        this.serializer.read("Content-Length: " + requestBody.contentLength());
                    }
                } else {
                    z = z;
                    str4 = " ";
                }
                int iRemoteActionCompatParcelizer2 = resetmessagemarginslambda01.RemoteActionCompatParcelizer();
                for (int i2 = 0; i2 < iRemoteActionCompatParcelizer2; i2++) {
                    serializer(resetmessagemarginslambda01, i2);
                }
                if (!z2 || requestBody == null) {
                    str = "";
                    this.serializer.read("--> END " + r8lambday113fdftsr5e4pzj6xssxltpl60.method);
                } else {
                    String strWrite = r8lambday113fdftsr5e4pzj6xssxltpl60.headers.write("Content-Encoding");
                    if (strWrite != null && !strWrite.equalsIgnoreCase("identity") && !strWrite.equalsIgnoreCase("gzip")) {
                        this.serializer.read(ff$$ExternalSyntheticOutline0.m(new StringBuilder("--> END "), r8lambday113fdftsr5e4pzj6xssxltpl60.method, " (encoded body omitted)"));
                    } else if (requestBody.isDuplex()) {
                        this.serializer.read(ff$$ExternalSyntheticOutline0.m(new StringBuilder("--> END "), r8lambday113fdftsr5e4pzj6xssxltpl60.method, " (duplex request body omitted)"));
                    } else if (requestBody.isOneShot()) {
                        this.serializer.read(ff$$ExternalSyntheticOutline0.m(new StringBuilder("--> END "), r8lambday113fdftsr5e4pzj6xssxltpl60.method, " (one-shot body omitted)"));
                    } else {
                        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
                        requestBody.writeTo(registryMissingComponentException);
                        if ("gzip".equalsIgnoreCase(resetmessagemarginslambda01.write("Content-Encoding"))) {
                            lValueOf2 = Long.valueOf(registryMissingComponentException.size);
                            DecodeJob decodeJob = new DecodeJob(registryMissingComponentException);
                            try {
                                registryMissingComponentException = new RegistryMissingComponentException();
                                registryMissingComponentException.IconCompatParcelizer(decodeJob);
                                decodeJob.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{decodeJob, th}, sourceInformationContextOfdefault.read());
                                    throw th2;
                                }
                            }
                        } else {
                            lValueOf2 = null;
                        }
                        InAppMessageHtmlBaseView inAppMessageHtmlBaseViewContentType2 = requestBody.contentType();
                        if (inAppMessageHtmlBaseViewContentType2 != null) {
                            getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
                            charsetSerializer2 = inAppMessageHtmlBaseViewContentType2.serializer(null);
                            if (charsetSerializer2 == null) {
                                charsetSerializer2 = ensureSubscribedToInAppMessageEvents.write;
                            }
                        } else {
                            charsetSerializer2 = ensureSubscribedToInAppMessageEvents.write;
                        }
                        this.serializer.read("");
                        boolean zSerializer = BuildersKt.serializer(registryMissingComponentException);
                        str = "";
                        r8lambdaShYuA3LlAERZVoeqw1lmW9mrt28 r8lambdashyua3llaerzvoeqw1lmw9mrt28 = this.serializer;
                        if (!zSerializer) {
                            r8lambdashyua3llaerzvoeqw1lmw9mrt28.read("--> END " + r8lambday113fdftsr5e4pzj6xssxltpl60.method + " (binary " + requestBody.contentLength() + "-byte body omitted)");
                        } else if (lValueOf2 != null) {
                            r8lambdashyua3llaerzvoeqw1lmw9mrt28.read("--> END " + r8lambday113fdftsr5e4pzj6xssxltpl60.method + " (" + registryMissingComponentException.size + "-byte, " + lValueOf2 + "-gzipped-byte body)");
                        } else {
                            r8lambdashyua3llaerzvoeqw1lmw9mrt28.read(registryMissingComponentException.IconCompatParcelizer(charsetSerializer2));
                            this.serializer.read("--> END " + r8lambday113fdftsr5e4pzj6xssxltpl60.method + " (" + requestBody.contentLength() + "-byte body)");
                        }
                    }
                }
                long jNanoTime = System.nanoTime();
                _get_messagewebview_lambda1Write = ((InAppMessageModalView) getmessageheadertextview).write(r8lambday113fdftsr5e4pzj6xssxltpl60);
                long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
                _get_messageWebView_lambda3 _get_messagewebview_lambda3 = _get_messagewebview_lambda1Write.body;
                _get_messagewebview_lambda3.getClass();
                jIconCompatParcelizer = _get_messagewebview_lambda3.IconCompatParcelizer();
                if (jIconCompatParcelizer != -1) {
                    str2 = jIconCompatParcelizer + "-byte";
                } else {
                    str2 = "unknown-length";
                }
                r8lambdaShYuA3LlAERZVoeqw1lmW9mrt28 r8lambdashyua3llaerzvoeqw1lmw9mrt29 = this.serializer;
                sb = new StringBuilder();
                sb.append("<-- " + _get_messagewebview_lambda1Write.code);
                if (_get_messagewebview_lambda1Write.message.length() > 0) {
                    str3 = str4;
                    sb.append(str3 + _get_messagewebview_lambda1Write.message);
                } else {
                    str3 = str4;
                }
                StringBuilder sb3 = new StringBuilder(str3);
                setInAppMessageImageViewAttributes setinappmessageimageviewattributes2 = _get_messagewebview_lambda1Write.request.url;
                setinappmessageimageviewattributes2.getClass();
                this.write.getClass();
                sb3.append(setinappmessageimageviewattributes2.url);
                sb3.append(" (");
                sb3.append(jNanoTime2);
                sb3.append("ms");
                sb.append(sb3.toString());
                if (!z) {
                    sb.append(", " + str2 + " body");
                }
                sb.append(")");
                r8lambdashyua3llaerzvoeqw1lmw9mrt29.read(sb.toString());
                if (z) {
                    resetmessagemarginslambda00 = _get_messagewebview_lambda1Write.headers;
                    iRemoteActionCompatParcelizer = resetmessagemarginslambda00.RemoteActionCompatParcelizer();
                    for (i = 0; i < iRemoteActionCompatParcelizer; i++) {
                        serializer(resetmessagemarginslambda00, i);
                    }
                    if (!z2 && r8lambdap5NIwcfORIsaQELQLeY6t8PSkNM.IconCompatParcelizer(_get_messagewebview_lambda1Write)) {
                        String strWrite2 = _get_messagewebview_lambda1Write.headers.write("Content-Encoding");
                        if (strWrite2 != null && !strWrite2.equalsIgnoreCase("identity") && !strWrite2.equalsIgnoreCase("gzip")) {
                            this.serializer.read("<-- END HTTP (encoded body omitted)");
                            return _get_messagewebview_lambda1Write;
                        }
                        InAppMessageHtmlBaseView inAppMessageHtmlBaseViewWrite = _get_messagewebview_lambda1Write.body.write();
                        if (inAppMessageHtmlBaseViewWrite != null && inAppMessageHtmlBaseViewWrite.type.equals("text") && inAppMessageHtmlBaseViewWrite.subtype.equals("event-stream")) {
                            this.serializer.read("<-- END HTTP (streaming)");
                            return _get_messagewebview_lambda1Write;
                        }
                        RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = _get_messagewebview_lambda3.read();
                        registryNoSourceEncoderAvailableException.write(Long.MAX_VALUE);
                        long jNanoTime3 = (System.nanoTime() - jNanoTime) / 1000000;
                        RegistryMissingComponentException registryMissingComponentExceptionMediaSessionCompatQueueItem = registryNoSourceEncoderAvailableException.MediaSessionCompatQueueItem();
                        if ("gzip".equalsIgnoreCase(resetmessagemarginslambda00.write("Content-Encoding"))) {
                            lValueOf = Long.valueOf(registryMissingComponentExceptionMediaSessionCompatQueueItem.size);
                            DecodeJob decodeJob2 = new DecodeJob(registryMissingComponentExceptionMediaSessionCompatQueueItem.clone());
                            try {
                                RegistryMissingComponentException registryMissingComponentException2 = new RegistryMissingComponentException();
                                registryMissingComponentException2.IconCompatParcelizer(decodeJob2);
                                decodeJob2.close();
                                registryMissingComponentExceptionMediaSessionCompatQueueItem = registryMissingComponentException2;
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{decodeJob2, th3}, sourceInformationContextOfdefault.read());
                                    throw th4;
                                }
                            }
                        } else {
                            lValueOf = null;
                        }
                        InAppMessageHtmlBaseView inAppMessageHtmlBaseViewWrite2 = _get_messagewebview_lambda3.write();
                        if (inAppMessageHtmlBaseViewWrite2 != null) {
                            getInAppMessageEventMap getinappmessageeventmap2 = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
                            charsetSerializer = inAppMessageHtmlBaseViewWrite2.serializer(null);
                            if (charsetSerializer == null) {
                                charsetSerializer = ensureSubscribedToInAppMessageEvents.write;
                            }
                        } else {
                            charsetSerializer = ensureSubscribedToInAppMessageEvents.write;
                        }
                        if (!BuildersKt.serializer(registryMissingComponentExceptionMediaSessionCompatQueueItem)) {
                            this.serializer.read(str);
                            this.serializer.read(c8$$ExternalSyntheticOutline0.m(registryMissingComponentExceptionMediaSessionCompatQueueItem.size, "-byte body omitted)", c8$$ExternalSyntheticOutline0.m(jNanoTime3, "<-- END HTTP (", "ms, binary ")));
                            return _get_messagewebview_lambda1Write;
                        }
                        String str5 = str;
                        if (jIconCompatParcelizer != 0) {
                            this.serializer.read(str5);
                            this.serializer.read(registryMissingComponentExceptionMediaSessionCompatQueueItem.clone().IconCompatParcelizer(charsetSerializer));
                        }
                        r8lambdaShYuA3LlAERZVoeqw1lmW9mrt28 r8lambdashyua3llaerzvoeqw1lmw9mrt210 = this.serializer;
                        StringBuilder sb4 = new StringBuilder();
                        StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m(jNanoTime3, "<-- END HTTP (", "ms, ");
                        sbM2.append(registryMissingComponentExceptionMediaSessionCompatQueueItem.size);
                        sbM2.append("-byte");
                        sb4.append(sbM2.toString());
                        if (lValueOf != null) {
                            sb4.append(", " + lValueOf + "-gzipped-byte");
                        }
                        sb4.append(" body)");
                        r8lambdashyua3llaerzvoeqw1lmw9mrt210.read(sb4.toString());
                        return _get_messagewebview_lambda1Write;
                    }
                    this.serializer.read("<-- END HTTP");
                }
                return _get_messagewebview_lambda1Write;
            }
            z = z;
            str4 = " ";
            _get_messagewebview_lambda1Write = ((InAppMessageModalView) getmessageheadertextview).write(r8lambday113fdftsr5e4pzj6xssxltpl60);
            long jNanoTime4 = (System.nanoTime() - jNanoTime) / 1000000;
            _get_messageWebView_lambda3 _get_messagewebview_lambda4 = _get_messagewebview_lambda1Write.body;
            _get_messagewebview_lambda4.getClass();
            jIconCompatParcelizer = _get_messagewebview_lambda4.IconCompatParcelizer();
            if (jIconCompatParcelizer != -1) {
                str2 = jIconCompatParcelizer + "-byte";
            } else {
                str2 = "unknown-length";
            }
            r8lambdaShYuA3LlAERZVoeqw1lmW9mrt28 r8lambdashyua3llaerzvoeqw1lmw9mrt211 = this.serializer;
            sb = new StringBuilder();
            sb.append("<-- " + _get_messagewebview_lambda1Write.code);
            if (_get_messagewebview_lambda1Write.message.length() > 0) {
                str3 = str4;
                sb.append(str3 + _get_messagewebview_lambda1Write.message);
            } else {
                str3 = str4;
            }
            StringBuilder sb5 = new StringBuilder(str3);
            setInAppMessageImageViewAttributes setinappmessageimageviewattributes3 = _get_messagewebview_lambda1Write.request.url;
            setinappmessageimageviewattributes3.getClass();
            this.write.getClass();
            sb5.append(setinappmessageimageviewattributes3.url);
            sb5.append(" (");
            sb5.append(jNanoTime4);
            sb5.append("ms");
            sb.append(sb5.toString());
            if (!z) {
                sb.append(", " + str2 + " body");
            }
            sb.append(")");
            r8lambdashyua3llaerzvoeqw1lmw9mrt211.read(sb.toString());
            if (z) {
                resetmessagemarginslambda00 = _get_messagewebview_lambda1Write.headers;
                iRemoteActionCompatParcelizer = resetmessagemarginslambda00.RemoteActionCompatParcelizer();
                while (i < iRemoteActionCompatParcelizer) {
                    serializer(resetmessagemarginslambda00, i);
                }
                if (!z2) {
                }
                this.serializer.read("<-- END HTTP");
            }
            return _get_messagewebview_lambda1Write;
        } catch (Exception e) {
            this.serializer.read("<-- HTTP FAILED: " + e);
            throw e;
        }
        str = "";
        long jNanoTime5 = System.nanoTime();
    }

    public final void serializer(resetMessageMarginslambda00 resetmessagemarginslambda00, int i) {
        ItemTouchHelperAdapter itemTouchHelperAdapter = this.IconCompatParcelizer;
        resetmessagemarginslambda00.serializer(i);
        itemTouchHelperAdapter.getClass();
        String str = resetmessagemarginslambda00.read(i);
        this.serializer.read(resetmessagemarginslambda00.serializer(i) + ": " + str);
    }

    public final void write(r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig r8lambdachmlgysnqdplvu9y_ksrct5sdig) {
        r8lambdachmlgysnqdplvu9y_ksrct5sdig.getClass();
        this.RemoteActionCompatParcelizer = r8lambdachmlgysnqdplvu9y_ksrct5sdig;
    }
}
