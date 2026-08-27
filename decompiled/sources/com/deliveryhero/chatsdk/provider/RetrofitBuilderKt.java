package com.deliveryhero.chatsdk.provider;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.ProtoFeatureOrErrorMsg;
import o.getAccount;
import o.getIdentifiersValidationsEnabled;
import o.getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class RetrofitBuilderKt {
    private static final onViewDetachedFromWindowlambda1 DefaultRetrofitBuilder$delegate;
    private static final onViewDetachedFromWindowlambda1 callAdapter$delegate;
    private static final onViewDetachedFromWindowlambda1 moshi$delegate;
    private static final onViewDetachedFromWindowlambda1 moshiConverter$delegate;

    static {
        Object[] objArr = {new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.chatsdk.provider.RetrofitBuilderKt$DefaultRetrofitBuilder$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final getIdentifiersValidationsEnabled invoke() {
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled = new getIdentifiersValidationsEnabled();
                getidentifiersvalidationsenabled.write("http://localhost/");
                getidentifiersvalidationsenabled.write(RetrofitBuilderKt.getCallAdapter());
                getidentifiersvalidationsenabled.write(RetrofitBuilderKt.getMoshiConverter());
                return getidentifiersvalidationsenabled;
            }
        }};
        DefaultRetrofitBuilder$delegate = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
        Object[] objArr2 = {new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.chatsdk.provider.RetrofitBuilderKt$moshiConverter$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final getAccount invoke() {
                getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations moshi = RetrofitBuilderKt.getMoshi();
                if (moshi != null) {
                    return new getAccount(moshi);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("moshi == null");
                return null;
            }
        }};
        moshiConverter$delegate = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr2);
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.NONE;
        callAdapter$delegate = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.chatsdk.provider.RetrofitBuilderKt$callAdapter$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final ProtoFeatureOrErrorMsg invoke() {
                return new ProtoFeatureOrErrorMsg();
            }
        });
        moshi$delegate = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.chatsdk.provider.RetrofitBuilderKt$moshi$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations invoke() {
                return new getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations(new r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8());
            }
        });
    }

    public static final ProtoFeatureOrErrorMsg getCallAdapter() {
        Object objMediaSessionCompatResultReceiverWrapper = callAdapter$delegate.MediaSessionCompatResultReceiverWrapper();
        objMediaSessionCompatResultReceiverWrapper.getClass();
        return (ProtoFeatureOrErrorMsg) objMediaSessionCompatResultReceiverWrapper;
    }

    public static final getIdentifiersValidationsEnabled getDefaultRetrofitBuilder() {
        return (getIdentifiersValidationsEnabled) DefaultRetrofitBuilder$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    public static final getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getMoshi() {
        Object objMediaSessionCompatResultReceiverWrapper = moshi$delegate.MediaSessionCompatResultReceiverWrapper();
        objMediaSessionCompatResultReceiverWrapper.getClass();
        return (getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations) objMediaSessionCompatResultReceiverWrapper;
    }

    public static final getAccount getMoshiConverter() {
        Object objMediaSessionCompatResultReceiverWrapper = moshiConverter$delegate.MediaSessionCompatResultReceiverWrapper();
        objMediaSessionCompatResultReceiverWrapper.getClass();
        return (getAccount) objMediaSessionCompatResultReceiverWrapper;
    }
}
