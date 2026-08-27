package com.huawei.location.logic;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.lifecycle.BlockRunner;
import androidx.transition.TransitionValuesMaps;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_barcode.zzff;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfg;
import com.google.android.gms.internal.mlkit_vision_face.zzcv;
import com.google.android.gms.internal.mlkit_vision_face.zzcw;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.json.JsonValueObjectEncoderContext;
import com.google.mlkit.vision.face.internal.zzm;
import com.huawei.hms.location.HwLocationResult;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.location.activity.RiemannSoftArService;
import com.huawei.location.activity.util.JniUtils;
import com.huawei.location.base.activity.constant.ActivityErrorCode;
import com.huawei.location.callback.d2;
import com.huawei.location.lite.common.exception.LocationServiceException;
import com.huawei.location.lite.common.util.filedownload.DownloadFileParam;
import com.huawei.riemann.location.common.utils.Constant;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability;
import com.huawei.wisesecurity.ucs_credential.e0;
import com.huawei.wisesecurity.ucs_credential.q;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import com.sentiance.okhttp3.Protocol;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o.ClientConfigCompanion;
import o.CustomerChatActivity;
import o.PhoneCallType;
import o.PhoneCallTypeMasked;
import o.PointerInteropFilter_androidKtpointerInteropFilterinlineddebugInspectorInfo1;
import o.ProvidernetworkModule13;
import o.RetrofitBuilderKt;
import o.UserAgentHeaderInterceptor;
import o.WeakCache;
import o.WrappedCompositionsetContent1211;
import o.accessdetachAndRemoveNode;
import o.accessgetCarouselcp;
import o.accessgetScopep;
import o.accessgetTvTeletextcp;
import o.clearWeakReferences;
import o.createPointerInputEventDataInuC1xA;
import o.detachAndRemoveNode;
import o.dispatchToView;
import o.disposePrecomposedSlot;
import o.extractTokenFromHeader;
import o.getBackendNamecustomerchat_release;
import o.getDefaultRetrofitBuilder;
import o.getHostDefault;
import o.getMoshiConverter;
import o.getOnAutofillRequested;
import o.getOnCutRequested;
import o.getOrder;
import o.getcachedSerializer;
import o.logErrordefault;
import o.onPrepareActionMode;
import o.placeAtf8xVGno;
import o.precompose;
import o.r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E;
import o.resizeGraphicFrameIfAppropriatelambda0;
import o.reuseLayer;
import o.setCountrylambda1;
import o.toMotionEventScopeubNVwUQ;
import o.tryRefreshToken;
import o.updateChatConfigurationToDataStore;
import o.withFactory;
import o.writeSelf;
import org.bouncycastle.asn1.ASN1Exception;
import org.bouncycastle.asn1.BERTaggedObjectParser;

/* JADX INFO: loaded from: classes2.dex */
public final class zp {
    public static boolean RemoteActionCompatParcelizer = false;
    public Object IconCompatParcelizer;
    public final /* synthetic */ int read;
    public Object serializer;
    public int write;

    public zp(TransitionValuesMaps transitionValuesMaps) {
        this.read = 10;
        HashMap map = new HashMap();
        this.serializer = map;
        CredentialClient credentialClient = (CredentialClient) transitionValuesMaps.MediaBrowserCompatMediaItem;
        Context context = (Context) transitionValuesMaps.MediaDescriptionCompat;
        NetworkCapability networkCapability = (NetworkCapability) transitionValuesMaps.MediaMetadataCompat;
        this.IconCompatParcelizer = networkCapability;
        x xVar = (x) transitionValuesMaps.RatingCompat;
        e0 e0Var = new e0(credentialClient, context, networkCapability);
        e0Var.MediaDescriptionCompat = true;
        e0Var.MediaMetadataCompat = xVar;
        map.put(0, e0Var);
        map.put(1, new q(credentialClient, context, networkCapability, 1));
        map.put(2, new q(credentialClient, context, networkCapability, 2));
        map.put(3, new q(credentialClient, context, networkCapability, 0));
    }

    public static zp serializer(String str) throws ProtocolException {
        r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E r8lambdax9cqozr3ps0lcwn_msrw5cdl8e;
        int i;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                r8lambdax9cqozr3ps0lcwn_msrw5cdl8e = r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                r8lambdax9cqozr3ps0lcwn_msrw5cdl8e = r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            r8lambdax9cqozr3ps0lcwn_msrw5cdl8e = r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E.HTTP_1_0;
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new zp(r8lambdax9cqozr3ps0lcwn_msrw5cdl8e, i3, strSubstring, 12);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static zp write(String str) throws ProtocolException {
        Protocol protocol;
        int i;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                protocol = Protocol.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                protocol = Protocol.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            protocol = Protocol.HTTP_1_0;
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new zp(protocol, i3, strSubstring, 11);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public extractTokenFromHeader RemoteActionCompatParcelizer() throws IOException {
        getcachedSerializer getcachedserializer = (getcachedSerializer) this.serializer;
        int i = getcachedserializer.read();
        if (i < 0) {
            return new extractTokenFromHeader(0);
        }
        extractTokenFromHeader extracttokenfromheader = new extractTokenFromHeader();
        do {
            logErrordefault logerrordefaultWrite = write(i);
            extracttokenfromheader.write(logerrordefaultWrite instanceof PhoneCallType ? ((PhoneCallType) logerrordefaultWrite).write() : logerrordefaultWrite.RatingCompat());
            i = getcachedserializer.read();
        } while (i >= 0);
        return extracttokenfromheader;
    }

    public void read() {
        try {
            int iLoadModelByAssets = JniUtils.loadModelByAssets(placeAtf8xVGno.read().getAssets(), ff$$ExternalSyntheticOutline0.m(new StringBuilder(), clearWeakReferences.write, "Ml_Location.net"));
            if (iLoadModelByAssets == 0) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "Load ModelFile success resultCode:" + iLoadModelByAssets);
                ((RiemannSoftArService) this.IconCompatParcelizer).modelFileLoadSuccess();
                return;
            }
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "Load ModelFile fail resultCode:" + iLoadModelByAssets);
            ((getOrder) this.serializer).IconCompatParcelizer("spModelVersionNum", "-1");
            ((getOrder) this.serializer).write("spModelLastTime", System.currentTimeMillis() - 604800000);
            write();
            throw null;
        } catch (Throwable unused) {
            MapboxMap$$ExternalSyntheticLambda0.m4699m((Object) ActivityErrorCode.getErrorCodeMessage(ActivityErrorCode.ACTIVITY_IDENTIFICATION_NOT_AVAILABLE));
        }
    }

    public byte[] read(int i) {
        BlockRunner blockRunner = (BlockRunner) this.serializer;
        ((setCountrylambda1) this.IconCompatParcelizer).write = Boolean.valueOf(1 == (i ^ 1));
        setCountrylambda1 setcountrylambda1 = (setCountrylambda1) this.IconCompatParcelizer;
        setcountrylambda1.RemoteActionCompatParcelizer = Boolean.FALSE;
        blockRunner.read = new PointerInteropFilter_androidKtpointerInteropFilterinlineddebugInspectorInfo1(setcountrylambda1);
        try {
            toMotionEventScopeubNVwUQ.IconCompatParcelizer();
            toMotionEventScopeubNVwUQ tomotioneventscopeubnvwuq = toMotionEventScopeubNVwUQ.IconCompatParcelizer;
            if (i == 0) {
                dispatchToView dispatchtoview = new dispatchToView(blockRunner);
                detachAndRemoveNode detachandremovenode = new detachAndRemoveNode();
                tomotioneventscopeubnvwuq.IconCompatParcelizer(detachandremovenode);
                detachandremovenode.RatingCompat = true;
                StringWriter stringWriter = new StringWriter();
                try {
                    JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(stringWriter, detachandremovenode.MediaBrowserCompatMediaItem, detachandremovenode.MediaMetadataCompat, detachandremovenode.RemoteActionCompatParcelizer, detachandremovenode.RatingCompat);
                    jsonValueObjectEncoderContext.RemoteActionCompatParcelizer(dispatchtoview);
                    jsonValueObjectEncoderContext.IconCompatParcelizer();
                    jsonValueObjectEncoderContext.IconCompatParcelizer.flush();
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes("utf-8");
            }
            dispatchToView dispatchtoview2 = new dispatchToView(blockRunner);
            createPointerInputEventDataInuC1xA createpointerinputeventdatainuc1xa = new createPointerInputEventDataInuC1xA();
            createpointerinputeventdatainuc1xa.RemoteActionCompatParcelizer = new HashMap();
            createpointerinputeventdatainuc1xa.IconCompatParcelizer = new HashMap();
            createpointerinputeventdatainuc1xa.read = createPointerInputEventDataInuC1xA.write;
            tomotioneventscopeubnvwuq.IconCompatParcelizer(createpointerinputeventdatainuc1xa);
            HashMap map = new HashMap((HashMap) createpointerinputeventdatainuc1xa.RemoteActionCompatParcelizer);
            HashMap map2 = new HashMap((HashMap) createpointerinputeventdatainuc1xa.IconCompatParcelizer);
            zzff zzffVar = (zzff) createpointerinputeventdatainuc1xa.read;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                zzfg zzfgVar = new zzfg(byteArrayOutputStream, map, map2, zzffVar);
                accessdetachAndRemoveNode accessdetachandremovenode = (accessdetachAndRemoveNode) map.get(dispatchToView.class);
                if (accessdetachandremovenode == null) {
                    throw new EncodingException("No encoder for ".concat(String.valueOf(dispatchToView.class)));
                }
                accessdetachandremovenode.serializer(dispatchtoview2, zzfgVar);
                return byteArrayOutputStream.toByteArray();
            } catch (IOException unused2) {
            }
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    public void serializer() {
        zzm zzmVar = (zzm) this.IconCompatParcelizer;
        int i = this.write + 1;
        this.write = i;
        ((getOnAutofillRequested) ((List) this.serializer).get(i)).IconCompatParcelizer(this);
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("TaskChain", "tasks tid:" + ((String) zzmVar.RatingCompat));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[][], java.io.Serializable] */
    public logErrordefault write(int i) throws IOException {
        ?? r2 = (byte[][]) this.IconCompatParcelizer;
        int i2 = this.write;
        getcachedSerializer getcachedserializer = (getcachedSerializer) this.serializer;
        Object[] objArr = 0;
        if (getcachedserializer instanceof PhoneCallTypeMasked) {
            PhoneCallTypeMasked phoneCallTypeMasked = (PhoneCallTypeMasked) getcachedserializer;
            phoneCallTypeMasked.read = false;
            phoneCallTypeMasked.write();
        }
        int iSerializer = tryRefreshToken.serializer(i, getcachedserializer);
        int i3 = 1;
        int i4 = 4;
        int iRemoteActionCompatParcelizer = tryRefreshToken.RemoteActionCompatParcelizer(getcachedserializer, i2, iSerializer == 3 || iSerializer == 4 || iSerializer == 16 || iSerializer == 17 || iSerializer == 8);
        int i5 = 13;
        if (iRemoteActionCompatParcelizer < 0) {
            if ((i & 32) == 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("indefinite-length primitive encoding encountered");
                return null;
            }
            zp zpVar = new zp(new PhoneCallTypeMasked(i2, getcachedserializer), i2, r2, i5);
            int i6 = i & 192;
            if (i6 != 0) {
                return new BERTaggedObjectParser(i6, iSerializer, zpVar);
            }
            if (iSerializer == 3) {
                return new ProvidernetworkModule13(zpVar);
            }
            if (iSerializer == 4) {
                return new getDefaultRetrofitBuilder(zpVar);
            }
            if (iSerializer == 8) {
                return new ClientConfigCompanion(zpVar);
            }
            if (iSerializer == 16) {
                ClientConfigCompanion clientConfigCompanion = new ClientConfigCompanion(i3);
                clientConfigCompanion.serializer = zpVar;
                return clientConfigCompanion;
            }
            if (iSerializer != 17) {
                UserAgentHeaderInterceptor.IconCompatParcelizer(Integer.toHexString(iSerializer), "unknown BER object encountered: 0x");
                return null;
            }
            ClientConfigCompanion clientConfigCompanion2 = new ClientConfigCompanion(2);
            clientConfigCompanion2.serializer = zpVar;
            return clientConfigCompanion2;
        }
        writeSelf writeself = new writeSelf(getcachedserializer, iRemoteActionCompatParcelizer, i2);
        if ((i & Constant.ERROR_WSS_INVALID) == 0) {
            if (iSerializer == 3) {
                return new CustomerChatActivity(writeself);
            }
            if (iSerializer == 4) {
                getDefaultRetrofitBuilder getdefaultretrofitbuilder = new getDefaultRetrofitBuilder();
                getdefaultretrofitbuilder.RemoteActionCompatParcelizer = writeself;
                return getdefaultretrofitbuilder;
            }
            if (iSerializer == 8) {
                throw new ASN1Exception("externals must use constructed encoding (see X.690 8.18)");
            }
            if (iSerializer == 16) {
                throw new ASN1Exception("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
            }
            if (iSerializer == 17) {
                throw new ASN1Exception("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
            }
            try {
                return tryRefreshToken.IconCompatParcelizer(iSerializer, writeself, (byte[][]) r2);
            } catch (IllegalArgumentException e) {
                throw new ASN1Exception(e, "corrupted stream detected");
            }
        }
        zp zpVar2 = new zp(writeself, writeself.RatingCompat, r2, i5);
        int i7 = i & 192;
        if (i7 != 0) {
            return new updateChatConfigurationToDataStore(i7, iSerializer, (i & 32) != 0, zpVar2);
        }
        if (iSerializer == 3) {
            return new ProvidernetworkModule13(zpVar2);
        }
        if (iSerializer == 4) {
            return new getDefaultRetrofitBuilder(zpVar2);
        }
        if (iSerializer == 8) {
            return new ClientConfigCompanion(zpVar2);
        }
        if (iSerializer == 16) {
            ClientConfigCompanion clientConfigCompanion3 = new ClientConfigCompanion(i4);
            clientConfigCompanion3.serializer = zpVar2;
            return clientConfigCompanion3;
        }
        if (iSerializer != 17) {
            UserAgentHeaderInterceptor.IconCompatParcelizer(Integer.toHexString(iSerializer), "unknown DL object encountered: 0x");
            return null;
        }
        ClientConfigCompanion clientConfigCompanion4 = new ClientConfigCompanion((int) (objArr == true ? 1 : 0));
        clientConfigCompanion4.serializer = zpVar2;
        return clientConfigCompanion4;
    }

    public static void write() {
        throw new LocationServiceException(ActivityErrorCode.ACTIVITY_IDENTIFICATION_NOT_AVAILABLE, ActivityErrorCode.getErrorCodeMessage(ActivityErrorCode.ACTIVITY_IDENTIFICATION_NOT_AVAILABLE) + ":end request.");
    }

    public getBackendNamecustomerchat_release read(int i, int i2) throws IOException {
        extractTokenFromHeader extracttokenfromheaderRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int i3 = extracttokenfromheaderRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        if (i3 == 1) {
            return new getBackendNamecustomerchat_release(3, i, i2, extracttokenfromheaderRemoteActionCompatParcelizer.read(0), 1);
        }
        getMoshiConverter getmoshiconverter = RetrofitBuilderKt.RemoteActionCompatParcelizer;
        return new getBackendNamecustomerchat_release(4, i, i2, i3 < 1 ? RetrofitBuilderKt.RemoteActionCompatParcelizer : new getMoshiConverter(extracttokenfromheaderRemoteActionCompatParcelizer), 1);
    }

    public void serializer(d2 d2Var, getOnCutRequested getoncutrequested) {
        String str;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("MaxWaitTimeManager", "callback maxWaitTime start :" + getoncutrequested.RemoteActionCompatParcelizer);
        List list = getoncutrequested.IconCompatParcelizer;
        if (list != null && list.size() > 0) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("MaxWaitTimeManager", "callback locationResult size is " + getoncutrequested.IconCompatParcelizer.size());
            for (Location location : getoncutrequested.IconCompatParcelizer) {
                String str2 = (String) withFactory.read.get(0);
                if (str2 == null) {
                    str2 = "unknown error code:0";
                }
                d2Var.serializer(new HwLocationResult(0, str2, location));
            }
            List list2 = getoncutrequested.IconCompatParcelizer;
            if (list2 != null) {
                list2.clear();
            }
            ((ConcurrentHashMap) this.serializer).put(d2Var, getoncutrequested);
            str = "callback maxWaitTime end";
        } else {
            str = "not need callback, locations size is null";
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("MaxWaitTimeManager", str);
    }

    public void write(String str, Feature feature) {
        int i = this.write + 1;
        Object[] objArr = (Object[]) this.serializer;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            if (i2 < 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "cannot store more than MAX_VALUE elements");
                return;
            }
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = iHighestOneBit + iHighestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.serializer = Arrays.copyOf(objArr, i3);
        }
        Object[] objArr2 = (Object[]) this.serializer;
        int i4 = this.write;
        int i5 = i4 + i4;
        objArr2[i5] = str;
        objArr2[i5 + 1] = feature;
        this.write = i4 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    public void IconCompatParcelizer() {
        boolean z;
        if (this.write >= 3) {
            WrappedCompositionsetContent1211.read("ModelFileManager", "maxTryTime failed, LoadSo is false");
            write();
            throw null;
        }
        if (!RemoteActionCompatParcelizer) {
            String str = clearWeakReferences.serializer;
            if (TextUtils.isEmpty("libml.so")) {
                z = false;
            } else {
                try {
                    File file = new File(str + File.separator + "libml.so");
                    if (!file.exists() || file.length() <= 0) {
                        z = false;
                    } else {
                        System.load(file.getCanonicalPath());
                        z = true;
                    }
                } catch (IOException unused) {
                    WrappedCompositionsetContent1211.read();
                }
            }
            RemoteActionCompatParcelizer = z;
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "loadLocalSo result:" + RemoteActionCompatParcelizer);
        }
        if (!RemoteActionCompatParcelizer) {
            WrappedCompositionsetContent1211.read("ModelFileManager", "hasLoadSo is false");
            this.write++;
            IconCompatParcelizer();
            return;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "hasLoadSo is true prepareLoadModelFile:");
        getOrder getorder = new getOrder("spModelFileName");
        this.serializer = getorder;
        long jWrite = getorder.write("spModelLastTime");
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "sp--lastTimeMillis:" + jWrite);
        if (System.currentTimeMillis() - jWrite < 604800000 && RemoteActionCompatParcelizer(placeAtf8xVGno.read(), "Ml_Location.net")) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "model file is exists and is not need update");
            read();
            return;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "model file is not exists or determine whether the model file needs to be updated ");
        DownloadFileParam downloadFileParam = new DownloadFileParam();
        downloadFileParam.setFileName("Ml_Location.net");
        downloadFileParam.setSaveFilePath(clearWeakReferences.write);
        downloadFileParam.setServiceType("activitityRecognition");
        downloadFileParam.setSubType(HiAnalyticsConstant.KeyAndValue.NUMBER_01);
        new x(downloadFileParam, 10, new WeakCache(this, "spModelVersionNum", "Ml_Location.net")).IconCompatParcelizer(new getHostDefault(this, "Ml_Location.net", "spModelLastTime"));
    }

    public String toString() {
        int i = this.read;
        if (i == 11) {
            String str = (String) this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder();
            sb.append(((Protocol) this.serializer) != Protocol.HTTP_1_0 ? "HTTP/1.1" : "HTTP/1.0");
            sb.append(' ');
            sb.append(this.write);
            sb.append(' ');
            sb.append(str);
            return sb.toString();
        }
        if (i != 12) {
            return super.toString();
        }
        String str2 = (String) this.IconCompatParcelizer;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E) this.serializer) != r8lambdax9CQoZr3PS0lcwN_mSRW5Cdl8E.HTTP_1_0 ? "HTTP/1.1" : "HTTP/1.0");
        sb2.append(' ');
        sb2.append(this.write);
        sb2.append(' ');
        sb2.append(str2);
        return sb2.toString();
    }

    public /* synthetic */ zp(int i) {
        this.read = i;
    }

    public zp() {
        this.read = 4;
        this.serializer = new Object[8];
        this.write = 0;
    }

    public /* synthetic */ zp(Object obj, int i, Serializable serializable, int i2) {
        this.read = i2;
        this.serializer = obj;
        this.write = i;
        this.IconCompatParcelizer = serializable;
    }

    public zp(BlockRunner blockRunner, int i) {
        this.read = 5;
        this.IconCompatParcelizer = new setCountrylambda1();
        this.serializer = blockRunner;
        toMotionEventScopeubNVwUQ.IconCompatParcelizer();
        this.write = i;
    }

    public zp(BlockRunner blockRunner, int i, byte b) {
        this.read = 6;
        this.IconCompatParcelizer = new setCountrylambda1();
        this.serializer = blockRunner;
        precompose.read();
        this.write = i;
    }

    public zp(reuseLayer reuselayer, resizeGraphicFrameIfAppropriatelambda0 resizegraphicframeifappropriatelambda0) {
        this.read = 7;
        this.IconCompatParcelizer = reuselayer;
        this.write = 0;
        this.serializer = resizegraphicframeifappropriatelambda0;
    }

    public zp(ViewConfiguration viewConfiguration) {
        this.read = 2;
        this.serializer = viewConfiguration;
    }

    public zp(CharSequence charSequence, int i, String str) {
        this.read = 1;
        this.serializer = charSequence;
        this.IconCompatParcelizer = str;
        this.write = i;
    }

    public static void serializer(zp zpVar, String str) {
        if (str.equals("activity.7z") && RemoteActionCompatParcelizer(placeAtf8xVGno.read(), str)) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "so file is exists");
            zpVar.IconCompatParcelizer();
        } else if (str.equals("Ml_Location.net") && RemoteActionCompatParcelizer(placeAtf8xVGno.read(), "Ml_Location.net")) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "model file is exists");
            zpVar.read();
        } else {
            WrappedCompositionsetContent1211.read("ModelFileManager", "model or so file is not exists");
            write();
            throw null;
        }
    }

    public static boolean RemoteActionCompatParcelizer(Context context, String str) {
        File file;
        if (TextUtils.isEmpty(str)) {
            WrappedCompositionsetContent1211.read("ModelFileManager", "file is empty");
            return false;
        }
        WrappedCompositionsetContent1211.read();
        if (str.equals("activity.7z")) {
            StringBuilder sb = new StringBuilder();
            sb.append(clearWeakReferences.serializer);
            file = new File(ff$$ExternalSyntheticOutline0.m(sb, File.separator, "libml.so"));
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(onPrepareActionMode.IconCompatParcelizer(context));
            file = new File(ff$$ExternalSyntheticOutline0.m(sb2, File.separator, str));
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "file is not empty");
        return file.exists();
    }

    public Credential write(int i, String str, String str2, String str3, String str4, zp zpVar) throws UcsException {
        this.write = i;
        accessgetCarouselcp accessgetcarouselcp = (accessgetCarouselcp) ((HashMap) this.serializer).get(Integer.valueOf(i));
        if (accessgetcarouselcp != null) {
            return accessgetcarouselcp.serializer(str, str2, str3, str4, zpVar);
        }
        MapboxMap$$ExternalSyntheticLambda0.m(2001L, "applyCredential get inner error, apply flag not found.");
        return null;
    }

    public byte[] MediaDescriptionCompat() {
        precompose precomposeVar = precompose.write;
        BlockRunner blockRunner = (BlockRunner) this.serializer;
        ((setCountrylambda1) this.IconCompatParcelizer).write = false;
        setCountrylambda1 setcountrylambda1 = (setCountrylambda1) this.IconCompatParcelizer;
        setcountrylambda1.RemoteActionCompatParcelizer = Boolean.FALSE;
        blockRunner.read = new disposePrecomposedSlot(setcountrylambda1);
        try {
            precompose.read();
            accessgetScopep accessgetscopep = new accessgetScopep(blockRunner);
            accessgetTvTeletextcp accessgettvteletextcp = new accessgetTvTeletextcp(13);
            precomposeVar.IconCompatParcelizer(accessgettvteletextcp);
            HashMap map = new HashMap((HashMap) accessgettvteletextcp.RemoteActionCompatParcelizer);
            HashMap map2 = new HashMap((HashMap) accessgettvteletextcp.serializer);
            zzcv zzcvVar = (zzcv) accessgettvteletextcp.write;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                zzcw zzcwVar = new zzcw(byteArrayOutputStream, map, map2, zzcvVar);
                accessdetachAndRemoveNode accessdetachandremovenode = (accessdetachAndRemoveNode) map.get(accessgetScopep.class);
                if (accessdetachandremovenode != null) {
                    accessdetachandremovenode.serializer(accessgetscopep, zzcwVar);
                    return byteArrayOutputStream.toByteArray();
                }
                throw new EncodingException("No encoder for ".concat(String.valueOf(accessgetScopep.class)));
            } catch (IOException unused) {
            }
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
