package com.deliveryhero.customerchat.fwf;

import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.DeferredCoroutine;
import o.applyLayoutDirection;
import o.clearCache;
import o.createInnerShadowPainter;
import o.isIdentityannotations;
import o.obtainInnerShadowRenderereZhPAX0;
import o.obtainShadowKey;
import o.setOutlineAmbientShadowColor;

/* JADX INFO: loaded from: classes2.dex */
public final class FeatureFlagProvider {
    public final setOutlineAmbientShadowColor IconCompatParcelizer;
    public volatile boolean MediaDescriptionCompat;
    public final isIdentityannotations RemoteActionCompatParcelizer;
    public final clearCache read;
    public final applyLayoutDirection serializer;
    public DeferredCoroutine write;

    public FeatureFlagProvider(setOutlineAmbientShadowColor setoutlineambientshadowcolor, clearCache clearcache, applyLayoutDirection applylayoutdirection, isIdentityannotations isidentityannotations) {
        this.IconCompatParcelizer = setoutlineambientshadowcolor;
        this.read = clearcache;
        this.serializer = applylayoutdirection;
        this.RemoteActionCompatParcelizer = isidentityannotations;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object access$fetchUserFeatureFlags(FeatureFlagProvider featureFlagProvider, String str, Custom custom, ContinuationImpl continuationImpl) {
        obtainShadowKey obtainshadowkey;
        if (continuationImpl instanceof obtainShadowKey) {
            obtainshadowkey = (obtainShadowKey) continuationImpl;
            int i = obtainshadowkey.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                obtainshadowkey.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                obtainshadowkey = new obtainShadowKey(featureFlagProvider, continuationImpl);
            }
        } else {
            obtainshadowkey = new obtainShadowKey(featureFlagProvider, continuationImpl);
        }
        Object obj = obtainshadowkey.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = obtainshadowkey.IconCompatParcelizer;
        boolean z = true;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                clearCache clearcache = featureFlagProvider.read;
                FWFRequest fWFRequest = new FWFRequest(custom, SQLite.read("ets-tracking", "is-customer-chat-image-upload-camera-only"), str);
                obtainshadowkey.read = featureFlagProvider;
                obtainshadowkey.IconCompatParcelizer = 1;
                obj = clearcache.read(fWFRequest, obtainshadowkey);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                featureFlagProvider = obtainshadowkey.read;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            Map map = (Map) obj;
            featureFlagProvider.MediaDescriptionCompat = true;
            FeatureInfo featureInfo = (FeatureInfo) map.get("ets-tracking");
            boolean z2 = featureInfo != null && featureInfo.RemoteActionCompatParcelizer();
            FeatureInfo featureInfo2 = (FeatureInfo) map.get("is-customer-chat-image-upload-camera-only");
            if (featureInfo2 == null || !featureInfo2.RemoteActionCompatParcelizer()) {
                z = false;
            }
            return new obtainInnerShadowRenderereZhPAX0(z2, z);
        } catch (Exception unused) {
            featureFlagProvider.MediaDescriptionCompat = false;
            return new obtainInnerShadowRenderereZhPAX0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getUserFeatureFlags(ContinuationImpl continuationImpl) {
        createInnerShadowPainter createinnershadowpainter;
        if (continuationImpl instanceof createInnerShadowPainter) {
            createinnershadowpainter = (createInnerShadowPainter) continuationImpl;
            int i = createinnershadowpainter.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                createinnershadowpainter.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                createinnershadowpainter = new createInnerShadowPainter(this, continuationImpl);
            }
        } else {
            createinnershadowpainter = new createInnerShadowPainter(this, continuationImpl);
        }
        Object objAwaitInternal = createinnershadowpainter.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = createinnershadowpainter.IconCompatParcelizer;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objAwaitInternal);
                DeferredCoroutine deferredCoroutine = this.write;
                if (deferredCoroutine != null) {
                    createinnershadowpainter.IconCompatParcelizer = 1;
                    objAwaitInternal = deferredCoroutine.awaitInternal(createinnershadowpainter);
                    if (objAwaitInternal == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objAwaitInternal);
            return (obtainInnerShadowRenderereZhPAX0) objAwaitInternal;
        } catch (CancellationException unused) {
        }
    }
}
