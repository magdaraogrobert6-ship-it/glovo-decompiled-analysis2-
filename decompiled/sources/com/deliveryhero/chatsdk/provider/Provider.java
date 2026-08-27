package com.deliveryhero.chatsdk.provider;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.chatsdk.network.http.HttpAuthInterceptor;
import com.deliveryhero.chatsdk.network.http.UserAgentHeaderInterceptor;
import com.deliveryhero.chatsdk.util.UrlBuilder;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.LazyKt__LazyJVMKt;
import o.FwFClientaddFeatureKeys1;
import o.LayerSnapshotV21;
import o.ViewLayerVerificationHelper31;
import o._get_messageWebView_lambda0;
import o.applyLayoutDirection;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.getClassLogTag;
import o.getExposureHandlerfwf_client_release;
import o.getHoldoutVariation;
import o.getIdentifiersValidationsEnabled;
import o.getMetricProviderfwf_client_release;
import o.getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations;
import o.getSerializerfwf_client_release;
import o.getTimerfwf_client_release;
import o.getTrackingServicefwf_client_release;
import o.onImageAvailable;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0;
import o.r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.removeCustomerProfileAttributesfwf_client_release;
import o.setOutlineAmbientShadowColor;
import o.setWebViewContent;
import o.syncClientfwf_client_release;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes2.dex */
public final class Provider {
    public static final Provider INSTANCE = new Provider();
    private static final onViewDetachedFromWindowlambda1 client$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.chatsdk.provider.Provider$client$2
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 invoke() {
            return new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(new r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ());
        }
    });
    private static final syncClientfwf_client_release networkModule = ModuleDSLKt.RemoteActionCompatParcelizer(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.deliveryhero.chatsdk.provider.Provider$networkModule$1
        public final void invoke(syncClientfwf_client_release syncclientfwf_client_release) {
            syncclientfwf_client_release.getClass();
            AnonymousClass1 anonymousClass1 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: com.deliveryhero.chatsdk.provider.Provider$networkModule$1.1
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final getHoldoutVariation invoke(Scope scope, getTrackingServicefwf_client_release gettrackingservicefwf_client_release) {
                    scope.getClass();
                    gettrackingservicefwf_client_release.getClass();
                    r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 = (r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0) gettrackingservicefwf_client_release.RemoteActionCompatParcelizer(displayInAppMessagelambda1.serializer(r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0.class));
                    LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) ((setOutlineAmbientShadowColor) scope.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineAmbientShadowColor.class), null))).write();
                    if ((layerSnapshotV21Write != null ? layerSnapshotV21Write.write : null) == null) {
                        return RetrofitBuilderKt.getDefaultRetrofitBuilder().write();
                    }
                    String strBuildHttpUrl = UrlBuilder.INSTANCE.buildHttpUrl(layerSnapshotV21Write.write().country, layerSnapshotV21Write.write().dhEnvironment);
                    getIdentifiersValidationsEnabled defaultRetrofitBuilder = RetrofitBuilderKt.getDefaultRetrofitBuilder();
                    defaultRetrofitBuilder.write(strBuildHttpUrl);
                    Objects.requireNonNull(r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0, "client == null");
                    defaultRetrofitBuilder.read = r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0;
                    return defaultRetrofitBuilder.write();
                }
            };
            getTimerfwf_client_release gettimerfwf_client_release = getTimerfwf_client_release.Factory;
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(getHoldoutVariation.class);
            removeCustomerProfileAttributesfwf_client_release removecustomerprofileattributesfwf_client_release = FwFClientaddFeatureKeys1.IconCompatParcelizer;
            syncclientfwf_client_release.read(new getMetricProviderfwf_client_release(new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release, r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, null, anonymousClass1, gettimerfwf_client_release)));
            removeCustomerProfileAttributesfwf_client_release removecustomerprofileattributesfwf_client_release2 = new removeCustomerProfileAttributesfwf_client_release(ProviderKt.UNAUTHENTICATED);
            AnonymousClass2 anonymousClass2 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: com.deliveryhero.chatsdk.provider.Provider$networkModule$1.2
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 invoke(Scope scope, getTrackingServicefwf_client_release gettrackingservicefwf_client_release) {
                    scope.getClass();
                    gettrackingservicefwf_client_release.getClass();
                    r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = Provider.INSTANCE.getClient$customerchat_release().read();
                    getClassLogTag getclasslogtag = new getClassLogTag(0);
                    r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig r8lambdachmlgysnqdplvu9y_ksrct5sdig = r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig.BODY;
                    r8lambdachmlgysnqdplvu9y_ksrct5sdig.getClass();
                    getclasslogtag.RemoteActionCompatParcelizer = r8lambdachmlgysnqdplvu9y_ksrct5sdig;
                    r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(getclasslogtag);
                    return new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
                }
            };
            getTimerfwf_client_release gettimerfwf_client_release2 = getTimerfwf_client_release.Singleton;
            syncclientfwf_client_release.read(new getSerializerfwf_client_release(new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release, displayInAppMessagelambda1.serializer(r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0.class), removecustomerprofileattributesfwf_client_release2, anonymousClass2, gettimerfwf_client_release2)));
            ff$$ExternalSyntheticOutline0.m(new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release, displayInAppMessagelambda1.serializer(r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0.class), new removeCustomerProfileAttributesfwf_client_release(ProviderKt.AUTHENTICATED), new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: com.deliveryhero.chatsdk.provider.Provider$networkModule$1.3
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 invoke(Scope scope, getTrackingServicefwf_client_release gettrackingservicefwf_client_release) {
                    scope.getClass();
                    gettrackingservicefwf_client_release.getClass();
                    r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = Provider.INSTANCE.getClient$customerchat_release().read();
                    getClassLogTag getclasslogtag = new getClassLogTag(0);
                    r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig r8lambdachmlgysnqdplvu9y_ksrct5sdig = r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig.BODY;
                    r8lambdachmlgysnqdplvu9y_ksrct5sdig.getClass();
                    getclasslogtag.RemoteActionCompatParcelizer = r8lambdachmlgysnqdplvu9y_ksrct5sdig;
                    r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(getclasslogtag);
                    r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(new HttpAuthInterceptor((setOutlineAmbientShadowColor) scope.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineAmbientShadowColor.class), null), (onImageAvailable) scope.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(onImageAvailable.class), null)));
                    r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(new UserAgentHeaderInterceptor((applyLayoutDirection) scope.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(applyLayoutDirection.class), null)));
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    timeUnit.getClass();
                    r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.ResultReceiver = setWebViewContent.read("interval", 30L, timeUnit);
                    return new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
                }
            }, gettimerfwf_client_release2), syncclientfwf_client_release);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((syncClientfwf_client_release) obj);
            return createFromParcel.INSTANCE;
        }
    });

    private Provider() {
    }

    public final syncClientfwf_client_release getNetworkModule() {
        return networkModule;
    }

    public final getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations provideMoshi() {
        return RetrofitBuilderKt.getMoshi();
    }

    public final r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 getClient$customerchat_release() {
        Object objMediaSessionCompatResultReceiverWrapper = client$delegate.MediaSessionCompatResultReceiverWrapper();
        objMediaSessionCompatResultReceiverWrapper.getClass();
        return (r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0) objMediaSessionCompatResultReceiverWrapper;
    }

    public final r8lambday113fDFTSR5e4PZj6XsSXLtpL60 provideRequest(String str) {
        str.getClass();
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = new _get_messageWebView_lambda0(0);
        _get_messagewebview_lambda0.read(str);
        return new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0);
    }
}
