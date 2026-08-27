package com.mapbox.search.base.utils.extension;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.search.common.SearchRequestException;
import com.mapbox.search.internal.bindgen.Error;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SearchResponseErrorKt {
    public static final Exception toPlatformHttpException(Error error) {
        if (error.getTypeInfo() != Error.Type.HTTP_ERROR) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
            return null;
        }
        if (error.getHttpError().getHttpCode() < 200) {
            return new IOException(error.getHttpError().getMessage());
        }
        String message = error.getHttpError().getMessage();
        message.getClass();
        return new SearchRequestException(message, error.getHttpError().getHttpCode());
    }
}
