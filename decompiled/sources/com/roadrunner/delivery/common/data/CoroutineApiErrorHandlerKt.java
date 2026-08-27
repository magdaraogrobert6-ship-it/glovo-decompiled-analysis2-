package com.roadrunner.delivery.common.data;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.common.data.api.ErrorBodyParseException;
import com.roadrunner.common.data.api.ExecuteDatabaseRequest$invoke$2;
import com.roadrunner.common.data.api.MissingErrorBodyException;
import com.roadrunner.common.data.api.MissingErrorResponseException;
import com.roadrunner.common.data.api.UniqueHttpException;
import com.roadrunner.common.data.api.UniqueHttpExceptionKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.SerializationException;
import o._get_messageWebView_lambda3;
import o.accessgetAboveBaselinecp;
import o.addSubLayer;
import o.getHoldoutVariationName;
import o.isAdapterPositionOnScreen;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;
import retrofit2.HttpException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CoroutineApiErrorHandlerKt {
    private static int IconCompatParcelizer = 1;
    public static final isAdapterPositionOnScreen RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new accessgetAboveBaselinecp(27));
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        int i = read + 41;
        serializer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Object write(CoroutineDispatcher coroutineDispatcher, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ContinuationImpl continuationImpl) throws Throwable {
        int i = 2 % 2;
        Object objWithContext = BuildersKt.withContext(coroutineDispatcher, new ExecuteDatabaseRequest$invoke$2(7, null, r8lambdaunavo3sxub_pc9xroryotnrlvsm), continuationImpl);
        int i2 = write + 27;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return objWithContext;
        }
        throw null;
    }

    public static final Throwable read(Throwable th) {
        int i = 2 % 2;
        if (!(th instanceof HttpException)) {
            return th;
        }
        int i2 = IconCompatParcelizer + 81;
        write = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            getHoldoutVariationName getholdoutvariationname = UniqueHttpExceptionKt.write((HttpException) th).write;
            obj.hashCode();
            throw null;
        }
        UniqueHttpException uniqueHttpExceptionWrite = UniqueHttpExceptionKt.write((HttpException) th);
        getHoldoutVariationName getholdoutvariationname2 = uniqueHttpExceptionWrite.write;
        if (getholdoutvariationname2 == null) {
            return new MissingErrorResponseException(null, uniqueHttpExceptionWrite);
        }
        _get_messageWebView_lambda3 _get_messagewebview_lambda3 = getholdoutvariationname2.errorBody;
        if (_get_messagewebview_lambda3 == null) {
            MissingErrorBodyException missingErrorBodyException = new MissingErrorBodyException(null, uniqueHttpExceptionWrite);
            int i3 = IconCompatParcelizer + 25;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return missingErrorBodyException;
        }
        String strMediaMetadataCompat = _get_messagewebview_lambda3.MediaMetadataCompat();
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("ApiError body from http exception: ", strMediaMetadataCompat), new Object[0]);
        try {
            resetTransientState resettransientstate = (resetTransientState) RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
            resettransientstate.getClass();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = addSubLayer.Companion.serializer();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
            addSubLayer addsublayerWrite = addSubLayer.write((addSubLayer) resettransientstate.serializer(strMediaMetadataCompat, setgraphicmodalmaxwidthdpSerializer), uniqueHttpExceptionWrite.read);
            addsublayerWrite.initCause(uniqueHttpExceptionWrite);
            return addsublayerWrite;
        } catch (SerializationException e) {
            return new ErrorBodyParseException(e, uniqueHttpExceptionWrite, strMediaMetadataCompat);
        }
    }
}
