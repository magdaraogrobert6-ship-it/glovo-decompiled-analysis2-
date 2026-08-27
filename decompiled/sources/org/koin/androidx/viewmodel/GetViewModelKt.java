package org.koin.androidx.viewmodel;

import androidx.lifecycle.ViewModel;
import coil3.ExtrasKt;
import coil3.ImageLoader$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.RegistryNoSourceEncoderAvailableException;
import o.RequestBuilder;
import o.ReusableGraphicsLayerScope;
import o._get_messageWebView_lambda0;
import o._get_messageWebView_lambda1;
import o._get_messageWebView_lambda3;
import o.applyDisplayCutoutMarginsToContentArealambda0;
import o.createBlurEffect8A3gB4;
import o.displayInAppMessagelambda1;
import o.getCustomerProfileClientfwf_client_release;
import o.getFilterQualityfv9h1I;
import o.getGraphicsDensityui;
import o.getLayoutDirectionui;
import o.getMutatedFieldsui;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.resetMessageMarginslambda00;
import o.setStrokeCapBeK7IIE;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$1;
import okio.Options;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class GetViewModelKt {
    public static final createBlurEffect8A3gB4 IconCompatParcelizer(_get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException;
        int i = _get_messagewebview_lambda1.code;
        long j = _get_messagewebview_lambda1.sentRequestAtMillis;
        long j2 = _get_messagewebview_lambda1.receivedResponseAtMillis;
        resetMessageMarginslambda00 resetmessagemarginslambda00 = _get_messagewebview_lambda1.headers;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = resetmessagemarginslambda00.iterator();
        while (true) {
            r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44 r8lambdaorcgh_zecjpqysbjv51vn1ttu44 = (r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44) it;
            if (!r8lambdaorcgh_zecjpqysbjv51vn1ttu44.hasNext()) {
                break;
            }
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) r8lambdaorcgh_zecjpqysbjv51vn1ttu44.next();
            String str = (String) onviewattachedtowindowlambda0.serializer;
            String str2 = (String) onviewattachedtowindowlambda0.write;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
        }
        getGraphicsDensityui getgraphicsdensityui = new getGraphicsDensityui(onMove.serializer(linkedHashMap));
        _get_messageWebView_lambda3 _get_messagewebview_lambda3 = _get_messagewebview_lambda1.body;
        return new createBlurEffect8A3gB4(i, j, j2, getgraphicsdensityui, (_get_messagewebview_lambda3 == null || (registryNoSourceEncoderAvailableException = _get_messagewebview_lambda3.read()) == null) ? null : new getLayoutDirectionui(registryNoSourceEncoderAvailableException), _get_messagewebview_lambda1);
    }

    public static ViewModel read(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, getFilterQualityfv9h1I getfilterqualityfv9h1i, setStrokeCapBeK7IIE setstrokecapbek7iie, Scope scope) {
        getfilterqualityfv9h1i.getClass();
        scope.getClass();
        Class cls = Options.Companion.read(r8lambdaucgighn8fiyv_vccodeafjfpedk);
        ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder(getfilterqualityfv9h1i, new getCustomerProfileClientfwf_client_release(r8lambdaucgighn8fiyv_vccodeafjfpedk, scope), setstrokecapbek7iie);
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(cls);
        String strRemoteActionCompatParcelizer = r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer != null) {
            return imageLoader$Builder.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strRemoteActionCompatParcelizer));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Local and anonymous classes can not be ViewModels");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x008d A[LOOP:1: B:24:0x0087->B:26:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final r8lambday113fDFTSR5e4PZj6XsSXLtpL60 access$toRequest(ReusableGraphicsLayerScope reusableGraphicsLayerScope, ContinuationImpl continuationImpl) {
        getMutatedFieldsui getmutatedfieldsui;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0;
        String str;
        _get_messageWebView_lambda0 _get_messagewebview_lambda1;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope2;
        RequestBody$Companion$toRequestBody$1 requestBody$Companion$toRequestBody$1;
        applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0;
        String str2;
        Iterator it;
        if (continuationImpl instanceof getMutatedFieldsui) {
            getmutatedfieldsui = (getMutatedFieldsui) continuationImpl;
            int i = getmutatedfieldsui.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                getmutatedfieldsui.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                getmutatedfieldsui = new getMutatedFieldsui(continuationImpl);
            }
        } else {
            getmutatedfieldsui = new getMutatedFieldsui(continuationImpl);
        }
        Object obj = getmutatedfieldsui.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getmutatedfieldsui.RemoteActionCompatParcelizer;
        _get_messageWebView_lambda0 _get_messagewebview_lambda2 = null;
        if (i2 != 0) {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            RequestBuilder requestBuilder = (RequestBuilder) obj;
            if (requestBuilder != null) {
                RequestBody.Companion.getClass();
                requestBody$Companion$toRequestBody$1 = new RequestBody$Companion$toRequestBody$1(null, requestBuilder);
                reusableGraphicsLayerScope2 = null;
                str = null;
                _get_messagewebview_lambda1 = null;
            } else {
                reusableGraphicsLayerScope = null;
                _get_messagewebview_lambda0 = null;
                str = null;
            }
            _get_messagewebview_lambda2.write(str, requestBody$Companion$toRequestBody$1);
            getGraphicsDensityui getgraphicsdensityui = reusableGraphicsLayerScope2.write;
            applydisplaycutoutmarginstocontentarealambda0 = new applyDisplayCutoutMarginsToContentArealambda0((byte) 0, 0);
            for (Map.Entry entry : getgraphicsdensityui.serializer.entrySet()) {
                str2 = (String) entry.getKey();
                it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    applydisplaycutoutmarginstocontentarealambda0.RemoteActionCompatParcelizer(str2, (String) it.next());
                }
            }
            resetMessageMarginslambda00 resetmessagemarginslambda00 = applydisplaycutoutmarginstocontentarealambda0.read();
            _get_messagewebview_lambda1.getClass();
            _get_messagewebview_lambda1.serializer = resetmessagemarginslambda00.serializer();
            return new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda1);
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        _get_messagewebview_lambda0 = new _get_messageWebView_lambda0(0);
        _get_messagewebview_lambda0.read(reusableGraphicsLayerScope.RemoteActionCompatParcelizer);
        str = reusableGraphicsLayerScope.serializer;
        _get_messagewebview_lambda1 = _get_messagewebview_lambda0;
        reusableGraphicsLayerScope2 = reusableGraphicsLayerScope;
        requestBody$Companion$toRequestBody$1 = null;
        _get_messagewebview_lambda2 = _get_messagewebview_lambda1;
        _get_messagewebview_lambda2.write(str, requestBody$Companion$toRequestBody$1);
        getGraphicsDensityui getgraphicsdensityui2 = reusableGraphicsLayerScope2.write;
        applydisplaycutoutmarginstocontentarealambda0 = new applyDisplayCutoutMarginsToContentArealambda0((byte) 0, 0);
        while (r4.hasNext()) {
            str2 = (String) entry.getKey();
            it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                applydisplaycutoutmarginstocontentarealambda0.RemoteActionCompatParcelizer(str2, (String) it.next());
            }
        }
        resetMessageMarginslambda00 resetmessagemarginslambda01 = applydisplaycutoutmarginstocontentarealambda0.read();
        _get_messagewebview_lambda1.getClass();
        _get_messagewebview_lambda1.serializer = resetmessagemarginslambda01.serializer();
        return new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda1);
    }
}
