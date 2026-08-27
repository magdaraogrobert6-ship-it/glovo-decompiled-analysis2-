package com.google.firebase;

import android.app.PendingIntent;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.bumptech.glide.load.resource.gif.GifFrameLoader;
import com.google.android.gms.common.zzq;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.ActivityRecognitionApi;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huawei.wisesecurity.kfs.exception.CodecException;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkRequest;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkResponse;
import com.logistics.rider.glovo.R;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.DrawContextKt;
import o.DrawScope;
import o.DrawScopeMarker;
import o.DrawableTransformation;
import o.ImageOnlyContentCardViewViewHolder;
import o.InAppMessageHtmlBaseView;
import o.MediaSessionCompatQueueItem;
import o.OuterPlacementScope;
import o.ParentDataModifierDefaultImpls;
import o.StrokeCompanion;
import o.SurfaceRequest;
import o.ViewLayerCompanion;
import o.WrappedCompositionsetContent1211;
import o._get_messageWebView_lambda0;
import o._get_messageWebView_lambda1;
import o._get_messageWebView_lambda3;
import o.accessgetInstanceLockcp;
import o.accessgetNumPad6cp;
import o.accessgetNumPadDirectionDowncp;
import o.accessgetNumPadRightParenthesiscp;
import o.accessgetNumPadSubtractcp;
import o.accessgetSwitchcp;
import o.animate;
import o.animateDecay;
import o.clipCanvasToPath;
import o.configurePaint2qPWKa0default;
import o.drawImage9jGpkUEdefault;
import o.findLineRoot;
import o.fromLinear;
import o.generateOetf;
import o.getEotfFuncui_graphics;
import o.getFunctionDelegate;
import o.getInAppMessageEventMap;
import o.getJoinLxFBmk8;
import o.getMediaAudioTrackEK5gGoQ;
import o.getMediaPlayPauseEK5gGoQ;
import o.getViewportBoundsInWindow;
import o.isFinitek4lQ0M;
import o.isValidimpl;
import o.onRetainNonConfigurationInstance;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ;
import o.r8lambdafQNxHYBbQei_ep6070iYk6_yIE;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.resetMessageMarginslambda00;
import o.seekAnimationsanimation_core;
import o.setNativeShader;
import o.setWebViewContent;
import o.shutdown;
import okhttp3.RequestBody;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final class Timestamp implements Comparable<Timestamp>, Parcelable {
    public static final Parcelable.Creator<Timestamp> CREATOR = new zzq(23);
    public final long IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;

    public final class Companion implements onRetainNonConfigurationInstance, shutdown, animateDecay, getFunctionDelegate, findLineRoot, ImageOnlyContentCardViewViewHolder, StrokeCompanion, DrawScope, fromLinear, getJoinLxFBmk8, ViewLayerCompanion, ActivityRecognitionApi, OuterPlacementScope, accessgetNumPadRightParenthesiscp, OnFailureListener, NetworkCapability, getViewportBoundsInWindow {
        public static Companion IconCompatParcelizer;
        public static Companion read;
        public static final /* synthetic */ Companion RemoteActionCompatParcelizer = new Companion(0);
        public static final /* synthetic */ Companion MediaMetadataCompat = new Companion(0);

        public /* synthetic */ Companion() {
        }

        @Override // o.fromLinear
        public r8lambdafQNxHYBbQei_ep6070iYk6_yIE IconCompatParcelizer(getEotfFuncui_graphics geteotffuncui_graphics) {
            return r8lambdafQNxHYBbQei_ep6070iYk6_yIE.SOURCE;
        }

        @Override // o.animateDecay
        public void IconCompatParcelizer(seekAnimationsanimation_core seekanimationsanimation_core) {
        }

        @Override // o.animateDecay
        public void MediaSessionCompatResultReceiverWrapper() {
        }

        @Override // o.getFunctionDelegate
        public void RemoteActionCompatParcelizer(int i, int i2, int i3, boolean z) {
        }

        @Override // com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability
        public void initConfig(int i, int i2) {
        }

        @Override // o.animateDecay
        public void serializer(EncodeException encodeException) {
        }

        @Override // o.animateDecay
        public void serializer(animate animateVar) {
        }

        @Override // o.shutdown
        public boolean serializer(int i) {
            return false;
        }

        @Override // o.OuterPlacementScope
        public /* synthetic */ Object then(Task task) {
            return null;
        }

        @Override // o.shutdown
        public SurfaceRequest write(int i) {
            return null;
        }

        @Override // o.getFunctionDelegate
        public void write(int i, int i2, int i3, int i4) {
        }

        public static NetworkResponse IconCompatParcelizer(r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60) throws IOException {
            r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = new r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            timeUnit.getClass();
            r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.serializer = setWebViewContent.read("timeout", DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, timeUnit);
            r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.read(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, timeUnit);
            r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = false;
            try {
                _get_messageWebView_lambda1 _get_messagewebview_lambda1Execute = FirebasePerfOkHttpClient.execute(new clipCanvasToPath(new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq), r8lambday113fdftsr5e4pzj6xssxltpl60, false));
                NetworkResponse networkResponse = new NetworkResponse();
                networkResponse.setCode(_get_messagewebview_lambda1Execute.code);
                networkResponse.setHeaders(_get_messagewebview_lambda1Execute.headers.IconCompatParcelizer());
                _get_messageWebView_lambda3 _get_messagewebview_lambda3 = _get_messagewebview_lambda1Execute.body;
                if (_get_messagewebview_lambda3 != null) {
                    networkResponse.setBody(_get_messagewebview_lambda3.MediaMetadataCompat());
                }
                return networkResponse;
            } catch (IOException e) {
                WrappedCompositionsetContent1211.read("UCSSignHelper", "UCS http failed by exception");
                throw e;
            }
        }

        @Override // o.r8lambdayrUYrLf4y8jALbFcm2n28OpawQ
        public boolean IconCompatParcelizer(Object obj, File file, getEotfFuncui_graphics geteotffuncui_graphics) throws Throwable {
            try {
                DrawScopeMarker.RemoteActionCompatParcelizer(((GifFrameLoader) ((drawImage9jGpkUEdefault) ((generateOetf) obj).IconCompatParcelizer()).RatingCompat.write).serializer(), file);
                return true;
            } catch (IOException e) {
                if (!Log.isLoggable("GifEncoder", 5)) {
                    return false;
                }
                SentryLogcatAdapter.write("GifEncoder", "Failed to encode GIF drawable data", e);
                return false;
            }
        }

        @Override // o.getViewportBoundsInWindow
        public byte[] IconCompatParcelizer(String str) throws CodecException {
            try {
                return Base64.decode(str, 8);
            } catch (Exception e) {
                throw new CodecException(MediaSessionCompatQueueItem.read(e, accessgetSwitchcp.IconCompatParcelizer("Base64 decode fail : ")));
            }
        }

        @Override // o.findLineRoot
        public CharSequence RemoteActionCompatParcelizer(Preference preference) {
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            return TextUtils.isEmpty(editTextPreference.MediaSessionCompatQueueItem) ? editTextPreference.ResultReceiver.getString(R.string.not_set) : editTextPreference.MediaSessionCompatQueueItem;
        }

        @Override // com.google.android.gms.location.ActivityRecognitionApi
        public accessgetNumPadDirectionDowncp removeActivityUpdates(accessgetNumPad6cp accessgetnumpad6cp, PendingIntent pendingIntent) {
            getMediaPlayPauseEK5gGoQ getmediaplaypauseek5ggoq = new getMediaPlayPauseEK5gGoQ(accessgetnumpad6cp, pendingIntent);
            ((accessgetNumPadSubtractcp) accessgetnumpad6cp).IconCompatParcelizer.serializer(1, getmediaplaypauseek5ggoq);
            return getmediaplaypauseek5ggoq;
        }

        @Override // com.google.android.gms.location.ActivityRecognitionApi
        public accessgetNumPadDirectionDowncp requestActivityUpdates(accessgetNumPad6cp accessgetnumpad6cp, long j, PendingIntent pendingIntent) {
            getMediaAudioTrackEK5gGoQ getmediaaudiotrackek5ggoq = new getMediaAudioTrackEK5gGoQ(accessgetnumpad6cp, j, pendingIntent);
            ((accessgetNumPadSubtractcp) accessgetnumpad6cp).IconCompatParcelizer.serializer(1, getmediaaudiotrackek5ggoq);
            return getmediaaudiotrackek5ggoq;
        }

        @Override // o.getJoinLxFBmk8
        public void serializer(Object obj) {
            ((List) obj).clear();
        }

        @Override // o.accessgetNumPadRightParenthesiscp
        public /* synthetic */ void serializer(Object obj, Object obj2) {
            ((zzdz) obj).read((ParentDataModifierDefaultImpls) obj2);
        }

        @Override // com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability
        public NetworkResponse get(NetworkRequest networkRequest) {
            networkRequest.getUrl();
            WrappedCompositionsetContent1211.read();
            _get_messageWebView_lambda0 _get_messagewebview_lambda0 = new _get_messageWebView_lambda0(0);
            _get_messagewebview_lambda0.read(networkRequest.getUrl());
            Map<String, String> headers = networkRequest.getHeaders();
            resetMessageMarginslambda00 resetmessagemarginslambda00 = resetMessageMarginslambda00.EMPTY;
            _get_messagewebview_lambda0.serializer = Options.Companion.serializer(headers).serializer();
            return IconCompatParcelizer(new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0));
        }

        @Override // com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability
        public NetworkResponse post(NetworkRequest networkRequest) {
            InAppMessageHtmlBaseView inAppMessageHtmlBaseViewWrite;
            networkRequest.getUrl();
            WrappedCompositionsetContent1211.read();
            getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
            try {
                inAppMessageHtmlBaseViewWrite = SQLite.write("application/json; charset=utf-8");
            } catch (IllegalArgumentException unused) {
                inAppMessageHtmlBaseViewWrite = null;
            }
            RequestBody requestBodyCreate = RequestBody.create(inAppMessageHtmlBaseViewWrite, networkRequest.getBody());
            _get_messageWebView_lambda0 _get_messagewebview_lambda0 = new _get_messageWebView_lambda0(0);
            _get_messagewebview_lambda0.read(networkRequest.getUrl());
            Map<String, String> headers = networkRequest.getHeaders();
            resetMessageMarginslambda00 resetmessagemarginslambda00 = resetMessageMarginslambda00.EMPTY;
            _get_messagewebview_lambda0.serializer = Options.Companion.serializer(headers).serializer();
            requestBodyCreate.getClass();
            _get_messagewebview_lambda0.write("POST", requestBodyCreate);
            return IconCompatParcelizer(new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0));
        }

        @Override // o.DrawScope
        public void IconCompatParcelizer(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(new DrawContextKt((ByteBuffer) obj));
        }

        @Override // o.StrokeCompanion
        public Object RemoteActionCompatParcelizer() {
            try {
                return new configurePaint2qPWKa0default(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                DrawableTransformation.read((Throwable) e);
                return null;
            }
        }

        @Override // o.DrawScope
        public void RemoteActionCompatParcelizer(MediaExtractor mediaExtractor, Object obj) throws IOException {
            mediaExtractor.setDataSource(new DrawContextKt((ByteBuffer) obj));
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            SentryLogcatAdapter.read("OptionalModuleUtils", "Failed to request modules install request", exc);
        }

        public static boolean read(isFinitek4lQ0M isfinitek4lq0m, Editable editable, int i, int i2, boolean z) {
            int iMin;
            if (editable != null && i >= 0 && i2 >= 0) {
                int selectionStart = Selection.getSelectionStart(editable);
                int selectionEnd = Selection.getSelectionEnd(editable);
                if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                    if (z) {
                        int iMax = Math.max(i, 0);
                        int length = editable.length();
                        if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                            loop0: while (true) {
                                boolean z2 = false;
                                while (true) {
                                    if (iMax == 0) {
                                        break loop0;
                                    }
                                    selectionStart--;
                                    if (selectionStart < 0) {
                                        if (!z2) {
                                            selectionStart = 0;
                                            break loop0;
                                        }
                                        break loop0;
                                    }
                                    char cCharAt = editable.charAt(selectionStart);
                                    if (z2) {
                                        if (Character.isHighSurrogate(cCharAt)) {
                                            iMax--;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt)) {
                                        iMax--;
                                    } else if (!Character.isHighSurrogate(cCharAt)) {
                                        z2 = true;
                                    }
                                    selectionStart = -1;
                                    break loop0;
                                }
                            }
                        }
                        selectionStart = -1;
                        break loop0;
                        int iMax2 = Math.max(i2, 0);
                        iMin = editable.length();
                        if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                            loop2: while (true) {
                                boolean z3 = false;
                                while (true) {
                                    if (iMax2 != 0) {
                                        if (selectionEnd >= iMin) {
                                            if (!z3) {
                                                break loop2;
                                            }
                                            break loop2;
                                        }
                                        char cCharAt2 = editable.charAt(selectionEnd);
                                        if (z3) {
                                            if (Character.isLowSurrogate(cCharAt2)) {
                                                iMax2--;
                                                selectionEnd++;
                                            }
                                        } else if (!Character.isSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        } else if (!Character.isLowSurrogate(cCharAt2)) {
                                            selectionEnd++;
                                            z3 = true;
                                        }
                                        iMin = -1;
                                        break loop2;
                                    }
                                    iMin = selectionEnd;
                                    break loop2;
                                }
                            }
                        }
                        iMin = -1;
                        break loop2;
                        if (selectionStart != -1 && iMin != -1) {
                        }
                    } else {
                        selectionStart = Math.max(selectionStart - i, 0);
                        iMin = Math.min(selectionEnd + i2, editable.length());
                    }
                    isValidimpl[] isvalidimplArr = (isValidimpl[]) editable.getSpans(selectionStart, iMin, isValidimpl.class);
                    if (isvalidimplArr != null && isvalidimplArr.length > 0) {
                        for (isValidimpl isvalidimpl : isvalidimplArr) {
                            int spanStart = editable.getSpanStart(isvalidimpl);
                            int spanEnd = editable.getSpanEnd(isvalidimpl);
                            selectionStart = Math.min(spanStart, selectionStart);
                            iMin = Math.max(spanEnd, iMin);
                        }
                        int iMax3 = Math.max(selectionStart, 0);
                        int iMin2 = Math.min(iMin, editable.length());
                        isfinitek4lq0m.beginBatchEdit();
                        editable.delete(iMax3, iMin2);
                        isfinitek4lq0m.endBatchEdit();
                        return true;
                    }
                }
            }
            return false;
        }

        public static final void serializer(int i, long j) {
            if (i < 0 || i >= 1000000000) {
                DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i, "Timestamp nanoseconds out of range: "));
            } else if (-62135596800L > j || j >= 253402300800L) {
                DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j, "Timestamp seconds out of range: "));
            }
        }

        public Companion(int i) {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Timestamp) && compareTo((Timestamp) obj) == 0;
        }
        return true;
    }

    public Timestamp(Date date) {
        long time = date.getTime() / 1000;
        int time2 = (int) ((date.getTime() % 1000) * 1000000);
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = time2 < 0 ? new onViewAttachedToWindowlambda0(Long.valueOf(time - 1), Integer.valueOf(time2 + 1000000000)) : new onViewAttachedToWindowlambda0(Long.valueOf(time), Integer.valueOf(time2));
        long jLongValue = ((Number) onviewattachedtowindowlambda0.serializer).longValue();
        int iIntValue = ((Number) onviewattachedtowindowlambda0.write).intValue();
        Companion.serializer(iIntValue, jLongValue);
        this.IconCompatParcelizer = jLongValue;
        this.RemoteActionCompatParcelizer = iIntValue;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.IconCompatParcelizer);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timestamp(seconds=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", nanoseconds=");
        return af$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ')');
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Timestamp timestamp) {
        timestamp.getClass();
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM[] r8lambdaunavo3sxub_pc9xroryotnrlvsmArr = {new accessgetInstanceLockcp(Timestamp.class, "seconds", "getSeconds()J", 0) { // from class: com.google.firebase.Timestamp.compareTo.1
            @Override // o.accessgetInstanceLockcp, o.requestDisplayInAppMessagelambda0
            public final Object write(Object obj) {
                return Long.valueOf(((Timestamp) obj).IconCompatParcelizer);
            }
        }, new accessgetInstanceLockcp(Timestamp.class, "nanoseconds", "getNanoseconds()I", 0) { // from class: com.google.firebase.Timestamp.compareTo.2
            @Override // o.accessgetInstanceLockcp, o.requestDisplayInAppMessagelambda0
            public final Object write(Object obj) {
                return Integer.valueOf(((Timestamp) obj).RemoteActionCompatParcelizer);
            }
        }};
        for (int i = 0; i < 2; i++) {
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = r8lambdaunavo3sxub_pc9xroryotnrlvsmArr[i];
            int iRemoteActionCompatParcelizer = setNativeShader.RemoteActionCompatParcelizer((Comparable) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this), (Comparable) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(timestamp));
            if (iRemoteActionCompatParcelizer != 0) {
                return iRemoteActionCompatParcelizer;
            }
        }
        return 0;
    }

    public final int hashCode() {
        long j = this.IconCompatParcelizer;
        return (((((int) j) * 1369) + ((int) (j >> 32))) * 37) + this.RemoteActionCompatParcelizer;
    }

    public Timestamp(long j, int i) {
        Companion.serializer(i, j);
        this.IconCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = i;
    }
}
