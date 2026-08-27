package com.roadrunner.common.data.api;

import androidx.compose.ui.graphics.Fields;
import com.data.error.ApiError$Companion;
import com.data.error.ApiException;
import com.data.error.TooManyRequestsException;
import com.roadrunner.delivery.state.StateV3$$ExternalSyntheticLambda0;
import kotlinx.serialization.SerializationException;
import o._get_messageWebView_lambda3;
import o.accessgetOutlinePathp;
import o.addSubLayer;
import o.discardContentIfReleasedAndHaveNoParentLayerUsages;
import o.getHoldoutVariationName;
import o.isAdapterPositionOnScreen;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
public final class MapApiError {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final isAdapterPositionOnScreen serializer = new isAdapterPositionOnScreen(new StateV3$$ExternalSyntheticLambda0(12));

    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    public final Throwable RemoteActionCompatParcelizer(Throwable th) {
        Throwable badRequest;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 75;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        isAdapterPositionOnScreen isadapterpositiononscreen = this.serializer;
        th.getClass();
        if (!(th instanceof HttpException)) {
            return th;
        }
        UniqueHttpException uniqueHttpExceptionWrite = UniqueHttpExceptionKt.write((HttpException) th);
        getHoldoutVariationName getholdoutvariationname = uniqueHttpExceptionWrite.write;
        int i4 = uniqueHttpExceptionWrite.read;
        addSubLayer addsublayerWrite = null;
        if (getholdoutvariationname == null) {
            return new MissingErrorResponseException(null, uniqueHttpExceptionWrite);
        }
        _get_messageWebView_lambda3 _get_messagewebview_lambda3 = getholdoutvariationname.errorBody;
        if (_get_messagewebview_lambda3 == null) {
            return new MissingErrorBodyException(uniqueHttpExceptionWrite);
        }
        if (i4 == 429) {
            return new TooManyRequestsException(uniqueHttpExceptionWrite);
        }
        String strMediaMetadataCompat = _get_messagewebview_lambda3.MediaMetadataCompat();
        try {
            resetTransientState resettransientstate = (resetTransientState) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
            resettransientstate.getClass();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = addSubLayer.Companion.serializer();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
            addsublayerWrite = addSubLayer.write((addSubLayer) resettransientstate.serializer(strMediaMetadataCompat, setgraphicmodalmaxwidthdpSerializer), i4);
        } catch (SerializationException unused) {
        }
        if (addsublayerWrite != null) {
            int i5 = write + 115;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return addsublayerWrite;
        }
        try {
            resetTransientState resettransientstate2 = (resetTransientState) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
            resettransientstate2.getClass();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer2 = discardContentIfReleasedAndHaveNoParentLayerUsages.Companion.serializer();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = setgraphicmodalmaxwidthdpSerializer2;
            discardContentIfReleasedAndHaveNoParentLayerUsages discardcontentifreleasedandhavenoparentlayerusages = (discardContentIfReleasedAndHaveNoParentLayerUsages) resettransientstate2.serializer(strMediaMetadataCompat, setgraphicmodalmaxwidthdpSerializer2);
            accessgetOutlinePathp accessgetoutlinepathp = accessgetOutlinePathp.EMPTY;
            if (discardcontentifreleasedandhavenoparentlayerusages != null) {
                String str = discardcontentifreleasedandhavenoparentlayerusages.message;
                accessgetOutlinePathp accessgetoutlinepathp2 = discardcontentifreleasedandhavenoparentlayerusages.error;
                if (accessgetoutlinepathp2 != null) {
                    int i7 = write + 79;
                    IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    accessgetoutlinepathp = accessgetoutlinepathp2;
                } else if (str != null) {
                    int i9 = write + 125;
                    IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    if (str.length() == 0) {
                        accessgetOutlinePathp.Companion.getClass();
                    } else {
                        ApiError$Companion apiError$Companion = accessgetOutlinePathp.Companion;
                        String str2 = discardcontentifreleasedandhavenoparentlayerusages.originalMessage;
                        apiError$Companion.getClass();
                        accessgetoutlinepathp = new accessgetOutlinePathp(str, str2);
                    }
                } else {
                    accessgetOutlinePathp.Companion.getClass();
                }
            } else {
                accessgetOutlinePathp.Companion.getClass();
            }
            if (i4 != 400) {
                int i11 = write + 7;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0 ? i4 == 401 : i4 == 22396) {
                    badRequest = new ApiException.SessionExpired.Unauthorized(accessgetoutlinepathp, i4, uniqueHttpExceptionWrite);
                } else if (i4 != 403) {
                    badRequest = i4 != 426 ? new ApiException.General(accessgetoutlinepathp, i4, uniqueHttpExceptionWrite) : new ApiException.ForceAppUpdateRequired(accessgetoutlinepathp, i4, uniqueHttpExceptionWrite);
                } else {
                    badRequest = new ApiException.SessionExpired.Forbidden(accessgetoutlinepathp, i4, uniqueHttpExceptionWrite);
                }
            } else {
                badRequest = new ApiException.BadRequest(accessgetoutlinepathp, i4, uniqueHttpExceptionWrite);
            }
            return badRequest;
        } catch (SerializationException e) {
            return new ErrorBodyParseException(e, uniqueHttpExceptionWrite, strMediaMetadataCompat);
        }
    }
}
