package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.LazyKt__LazyJVMKt;
import o.InAppMessageHtmlBaseView;
import o.RegistryNoImageHeaderParserException;
import okhttp3.FormBody;
import okhttp3.RequestBody;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class writeSelffwf_client_release implements syncCustomerProfile {
    public Throwable IconCompatParcelizer;
    public getMessageTextView MediaBrowserCompatMediaItem;
    public final FwFClientKt MediaDescriptionCompat;
    public final Object MediaMetadataCompat;
    public final accessgetHoldouts MediaSessionCompatQueueItem;
    public final getMessageImageView RemoteActionCompatParcelizer;
    public boolean read;
    public final Object[] serializer;
    public volatile boolean write;

    @Override // o.syncCustomerProfile
    public final void IconCompatParcelizer() {
        getMessageTextView getmessagetextview;
        this.write = true;
        synchronized (this) {
            getmessagetextview = this.MediaBrowserCompatMediaItem;
        }
        if (getmessagetextview != null) {
            ((clipCanvasToPath) getmessagetextview).write();
        }
    }

    @Override // o.syncCustomerProfile
    public final getHoldoutVariationName RemoteActionCompatParcelizer() {
        getMessageTextView getmessagetextviewMediaDescriptionCompat;
        synchronized (this) {
            if (this.read) {
                throw new IllegalStateException("Already executed.");
            }
            this.read = true;
            getmessagetextviewMediaDescriptionCompat = MediaDescriptionCompat();
        }
        if (this.write) {
            ((clipCanvasToPath) getmessagetextviewMediaDescriptionCompat).write();
        }
        return read(FirebasePerfOkHttpClient.execute(getmessagetextviewMediaDescriptionCompat));
    }

    @Override // o.syncCustomerProfile
    public final r8lambday113fDFTSR5e4PZj6XsSXLtpL60 write() {
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60;
        synchronized (this) {
            try {
                r8lambday113fdftsr5e4pzj6xssxltpl60 = ((clipCanvasToPath) MediaDescriptionCompat()).originalRequest;
            } catch (IOException e) {
                throw new RuntimeException("Unable to create request.", e);
            }
        }
        return r8lambday113fdftsr5e4pzj6xssxltpl60;
    }

    @Override // o.syncCustomerProfile
    public final void IconCompatParcelizer(FwFClientExtensionKtgetVariationsevalResults1 fwFClientExtensionKtgetVariationsevalResults1) {
        getMessageTextView getmessagetextview;
        Throwable th;
        Objects.requireNonNull(fwFClientExtensionKtgetVariationsevalResults1, "callback == null");
        synchronized (this) {
            if (this.read) {
                throw new IllegalStateException("Already executed.");
            }
            this.read = true;
            getmessagetextview = this.MediaBrowserCompatMediaItem;
            th = this.IconCompatParcelizer;
            if (getmessagetextview == null && th == null) {
                try {
                    getMessageTextView getmessagetextviewMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
                    this.MediaBrowserCompatMediaItem = getmessagetextviewMediaSessionCompatQueueItem;
                    getmessagetextview = getmessagetextviewMediaSessionCompatQueueItem;
                } catch (Throwable th2) {
                    th = th2;
                    getKind.read(th);
                    this.IconCompatParcelizer = th;
                }
            }
        }
        if (th != null) {
            fwFClientExtensionKtgetVariationsevalResults1.onFailure(this, th);
            return;
        }
        if (this.write) {
            ((clipCanvasToPath) getmessagetextview).write();
        }
        FirebasePerfOkHttpClient.enqueue(getmessagetextview, new OkHttpCall$1((Object) this, (Object) fwFClientExtensionKtgetVariationsevalResults1, false));
    }

    public final getMessageTextView MediaSessionCompatQueueItem() {
        createAppropriateViews createappropriateviews;
        setInAppMessageImageViewAttributes setinappmessageimageviewattributesRemoteActionCompatParcelizer;
        accessgetHoldouts accessgetholdouts = this.MediaSessionCompatQueueItem;
        LazyKt__LazyJVMKt[] lazyKt__LazyJVMKtArr = accessgetholdouts.MediaBrowserCompatMediaItem;
        Object[] objArr = this.serializer;
        int length = objArr.length;
        if (length != lazyKt__LazyJVMKtArr.length) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(lazyKt__LazyJVMKtArr.length, ")", ff$$ExternalSyntheticOutline0.m(length, "Argument count (", ") doesn't match expected count (")));
            return null;
        }
        ProtoFeatureMsg protoFeatureMsg = new ProtoFeatureMsg(accessgetholdouts.serializer, accessgetholdouts.write, accessgetholdouts.PlaybackStateCompat, accessgetholdouts.IconCompatParcelizer, accessgetholdouts.read, accessgetholdouts.RemoteActionCompatParcelizer, accessgetholdouts.MediaSessionCompatQueueItem, accessgetholdouts.RatingCompat);
        if (accessgetholdouts.MediaMetadataCompat) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            lazyKt__LazyJVMKtArr[i].read(protoFeatureMsg, objArr[i]);
        }
        createAppropriateViews createappropriateviews2 = protoFeatureMsg.PlaybackStateCompat;
        if (createappropriateviews2 != null) {
            setinappmessageimageviewattributesRemoteActionCompatParcelizer = createappropriateviews2.RemoteActionCompatParcelizer();
        } else {
            String str = protoFeatureMsg.MediaSessionCompatToken;
            setInAppMessageImageViewAttributes setinappmessageimageviewattributes = protoFeatureMsg.read;
            setinappmessageimageviewattributes.getClass();
            str.getClass();
            try {
                createappropriateviews = new createAppropriateViews();
                createappropriateviews.read(setinappmessageimageviewattributes, str);
            } catch (IllegalArgumentException unused) {
                createappropriateviews = null;
            }
            setinappmessageimageviewattributesRemoteActionCompatParcelizer = createappropriateviews != null ? createappropriateviews.RemoteActionCompatParcelizer() : null;
            if (setinappmessageimageviewattributesRemoteActionCompatParcelizer == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(setinappmessageimageviewattributes);
                getOffVariationName.serializer(sb, ", Relative: ", protoFeatureMsg.MediaSessionCompatToken);
                return null;
            }
        }
        final RequestBody requestBodyCreate = protoFeatureMsg.write;
        if (requestBodyCreate == null) {
            FormBody.Builder builder = protoFeatureMsg.RatingCompat;
            if (builder != null) {
                requestBodyCreate = builder.write();
            } else {
                r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = protoFeatureMsg.MediaMetadataCompat;
                if (r8lambdadeozq815xuuwmllyyvm_qv79qy != null) {
                    requestBodyCreate = r8lambdadeozq815xuuwmllyyvm_qv79qy.MediaMetadataCompat();
                } else if (protoFeatureMsg.MediaDescriptionCompat) {
                    requestBodyCreate = RequestBody.create((InAppMessageHtmlBaseView) null, new byte[0]);
                }
            }
        }
        final InAppMessageHtmlBaseView inAppMessageHtmlBaseView = protoFeatureMsg.IconCompatParcelizer;
        applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0 = protoFeatureMsg.MediaBrowserCompatMediaItem;
        if (inAppMessageHtmlBaseView != null) {
            if (requestBodyCreate != null) {
                requestBodyCreate = new RequestBody(requestBodyCreate, inAppMessageHtmlBaseView) { // from class: retrofit2.RequestBuilder$ContentTypeOverridingRequestBody
                    public final InAppMessageHtmlBaseView RemoteActionCompatParcelizer;
                    public final RequestBody read;

                    @Override // okhttp3.RequestBody
                    public final InAppMessageHtmlBaseView contentType() {
                        return this.RemoteActionCompatParcelizer;
                    }

                    @Override // okhttp3.RequestBody
                    public final long contentLength() {
                        return this.read.contentLength();
                    }

                    @Override // okhttp3.RequestBody
                    public final void writeTo(RegistryNoImageHeaderParserException registryNoImageHeaderParserException) {
                        this.read.writeTo(registryNoImageHeaderParserException);
                    }

                    {
                        this.read = requestBodyCreate;
                        this.RemoteActionCompatParcelizer = inAppMessageHtmlBaseView;
                    }
                };
            } else {
                applydisplaycutoutmarginstocontentarealambda0.write(ConstantKt.CONTENT_TYPE_HEADER, inAppMessageHtmlBaseView.mediaType);
            }
        }
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = protoFeatureMsg.ParcelableVolumeInfo;
        _get_messagewebview_lambda0.getClass();
        _get_messagewebview_lambda0.write = setinappmessageimageviewattributesRemoteActionCompatParcelizer;
        _get_messagewebview_lambda0.serializer = applydisplaycutoutmarginstocontentarealambda0.read().serializer();
        _get_messagewebview_lambda0.write(protoFeatureMsg.MediaSessionCompatQueueItem, requestBodyCreate);
        _get_messagewebview_lambda0.write(displayInAppMessagelambda1.serializer(DecodeResult.class), new DecodeResult(accessgetholdouts.ParcelableVolumeInfo, this.MediaMetadataCompat, accessgetholdouts.MediaDescriptionCompat, arrayList));
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer(new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0));
    }

    public final Object clone() {
        return new writeSelffwf_client_release(this.MediaSessionCompatQueueItem, this.MediaMetadataCompat, this.serializer, this.RemoteActionCompatParcelizer, this.MediaDescriptionCompat);
    }

    public final getHoldoutVariationName read(_get_messageWebView_lambda1 _get_messagewebview_lambda1) throws IOException {
        _get_messageWebView_lambda3 _get_messagewebview_lambda3 = _get_messagewebview_lambda1.body;
        r8lambdarYwWjKRktijBy60CMMjcRC1Oqk r8lambdarywwjkrktijby60cmmjcrc1oqkIconCompatParcelizer = _get_messagewebview_lambda1.IconCompatParcelizer();
        r8lambdarywwjkrktijby60cmmjcrc1oqkIconCompatParcelizer.IconCompatParcelizer = new getNegate(_get_messagewebview_lambda3.write(), _get_messagewebview_lambda3.IconCompatParcelizer());
        _get_messageWebView_lambda1 _get_messagewebview_lambda1IconCompatParcelizer = r8lambdarywwjkrktijby60cmmjcrc1oqkIconCompatParcelizer.IconCompatParcelizer();
        boolean z = _get_messagewebview_lambda1IconCompatParcelizer.isSuccessful;
        int i = _get_messagewebview_lambda1IconCompatParcelizer.code;
        if (i < 200 || i >= 300) {
            try {
                RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
                _get_messagewebview_lambda3.read().RemoteActionCompatParcelizer(registryMissingComponentException);
                return getHoldoutVariationName.IconCompatParcelizer(new _get_messageWebView_lambda4(_get_messagewebview_lambda3.write(), _get_messagewebview_lambda3.IconCompatParcelizer(), registryMissingComponentException), _get_messagewebview_lambda1IconCompatParcelizer);
            } finally {
                _get_messagewebview_lambda3.close();
            }
        }
        if (i == 204 || i == 205) {
            _get_messagewebview_lambda3.close();
            if (z) {
                return new getHoldoutVariationName(_get_messagewebview_lambda1IconCompatParcelizer, null, null);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("rawResponse must be successful response");
            return null;
        }
        getOperator getoperator = new getOperator(_get_messagewebview_lambda3);
        try {
            Object objIconCompatParcelizer = this.MediaDescriptionCompat.IconCompatParcelizer(getoperator);
            if (z) {
                return new getHoldoutVariationName(_get_messagewebview_lambda1IconCompatParcelizer, objIconCompatParcelizer, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = getoperator.serializer;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    public writeSelffwf_client_release(accessgetHoldouts accessgetholdouts, Object obj, Object[] objArr, getMessageImageView getmessageimageview, FwFClientKt fwFClientKt) {
        this.MediaSessionCompatQueueItem = accessgetholdouts;
        this.MediaMetadataCompat = obj;
        this.serializer = objArr;
        this.RemoteActionCompatParcelizer = getmessageimageview;
        this.MediaDescriptionCompat = fwFClientKt;
    }

    public final getMessageTextView MediaDescriptionCompat() throws IOException {
        getMessageTextView getmessagetextview = this.MediaBrowserCompatMediaItem;
        if (getmessagetextview != null) {
            return getmessagetextview;
        }
        Throwable th = this.IconCompatParcelizer;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            getMessageTextView getmessagetextviewMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
            this.MediaBrowserCompatMediaItem = getmessagetextviewMediaSessionCompatQueueItem;
            return getmessagetextviewMediaSessionCompatQueueItem;
        } catch (IOException | Error | RuntimeException e) {
            getKind.read(e);
            this.IconCompatParcelizer = e;
            throw e;
        }
    }

    @Override // o.syncCustomerProfile
    public final boolean read() {
        boolean z = true;
        if (this.write) {
            return true;
        }
        synchronized (this) {
            getMessageTextView getmessagetextview = this.MediaBrowserCompatMediaItem;
            if (getmessagetextview == null || !((clipCanvasToPath) getmessagetextview).canceled) {
                z = false;
            }
        }
        return z;
    }

    @Override // o.syncCustomerProfile
    public final syncCustomerProfile serializer() {
        return new writeSelffwf_client_release(this.MediaSessionCompatQueueItem, this.MediaMetadataCompat, this.serializer, this.RemoteActionCompatParcelizer, this.MediaDescriptionCompat);
    }
}
