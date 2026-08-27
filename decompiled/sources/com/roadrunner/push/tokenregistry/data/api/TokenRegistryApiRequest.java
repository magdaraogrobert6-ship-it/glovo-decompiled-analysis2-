package com.roadrunner.push.tokenregistry.data.api;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.createFromParcel;
import o.getHoldoutVariationName;
import o.lambdaremoveGlobalCallbackParameter25;
import o.lambdaremoveGlobalCallbackParameters28;
import o.lambdaremoveGlobalCallbackParameters29;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
public final class TokenRegistryApiRequest {
    private static int serializer = 0;
    private static int write = 1;
    public final lambdaremoveGlobalCallbackParameters29 read;

    public TokenRegistryApiRequest(lambdaremoveGlobalCallbackParameters29 lambdaremoveglobalcallbackparameters29) {
        this.read = lambdaremoveglobalcallbackparameters29;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object updatePushToken(lambdaremoveGlobalCallbackParameter25 lambdaremoveglobalcallbackparameter25, ContinuationImpl continuationImpl) {
        lambdaremoveGlobalCallbackParameters28 lambdaremoveglobalcallbackparameters28;
        TokenRegistryApiRequest tokenRegistryApiRequest;
        int i = 2 % 2;
        int i2 = write + 31;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof lambdaremoveGlobalCallbackParameters28) {
            lambdaremoveglobalcallbackparameters28 = (lambdaremoveGlobalCallbackParameters28) continuationImpl;
            int i4 = lambdaremoveglobalcallbackparameters28.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                lambdaremoveglobalcallbackparameters28.write = i4 - Integer.MIN_VALUE;
            } else {
                lambdaremoveglobalcallbackparameters28 = new lambdaremoveGlobalCallbackParameters28(this, continuationImpl);
            }
        } else {
            lambdaremoveglobalcallbackparameters28 = new lambdaremoveGlobalCallbackParameters28(this, continuationImpl);
        }
        Object objSerializer = lambdaremoveglobalcallbackparameters28.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = lambdaremoveglobalcallbackparameters28.write;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
            lambdaremoveglobalcallbackparameters28.IconCompatParcelizer = this;
            lambdaremoveglobalcallbackparameters28.write = 1;
            objSerializer = this.read.serializer(lambdaremoveglobalcallbackparameter25, lambdaremoveglobalcallbackparameters28);
            if (objSerializer == coroutineSingletons) {
                int i6 = serializer + 105;
                write = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 6 / 0;
                }
                return coroutineSingletons;
            }
            tokenRegistryApiRequest = this;
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tokenRegistryApiRequest = lambdaremoveglobalcallbackparameters28.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
        }
        getHoldoutVariationName getholdoutvariationname = (getHoldoutVariationName) objSerializer;
        tokenRegistryApiRequest.getClass();
        if (!getholdoutvariationname.rawResponse.isSuccessful) {
            throw new HttpException(getholdoutvariationname);
        }
        return (createFromParcel) getholdoutvariationname.body;
    }
}
