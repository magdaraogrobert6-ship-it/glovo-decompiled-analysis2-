package com.deliveryhero.persistence.cache;

import com.braze.Constants;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DefaultInAppMessageSlideupViewFactory;
import o.getTheta;
import o.onCloseActionlambda1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class CacheData<T> {
    public static final onCloseActionlambda1 $cachedDescriptor;
    public static final Companion Companion = new Companion();

    @SerializedName(alternate = {Constants.BRAZE_PUSH_CONTENT_KEY}, value = RemoteMessageConst.DATA)
    private final T data;

    @SerializedName(alternate = {"b"}, value = "expiryDateInSeconds")
    private long expiryDateInSeconds;

    public final Object read() {
        return this.data;
    }

    static {
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.persistence.cache.CacheData", null, 2);
        oncloseactionlambda1.read(RemoteMessageConst.DATA, false);
        oncloseactionlambda1.read("expiryDateInSeconds", false);
        $cachedDescriptor = oncloseactionlambda1;
    }

    public static final void read(CacheData cacheData, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, onCloseActionlambda1 oncloseactionlambda1, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        cacheData.getClass();
        defaultInAppMessageSlideupViewFactory.getClass();
        oncloseactionlambda1.getClass();
        setgraphicmodalmaxwidthdp.getClass();
        defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(oncloseactionlambda1, 0, setgraphicmodalmaxwidthdp, cacheData.data);
        defaultInAppMessageSlideupViewFactory.RemoteActionCompatParcelizer(oncloseactionlambda1, 1, cacheData.expiryDateInSeconds);
    }

    public static final class Companion {
        public final <T0> setGraphicModalMaxWidthDp serializer(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
            setgraphicmodalmaxwidthdp.getClass();
            return new getTheta(setgraphicmodalmaxwidthdp);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CacheData(long j, int i, Object obj) {
        if (3 == (i & 3)) {
            this.data = obj;
            this.expiryDateInSeconds = j;
            if (j == 0 || j > 31536000) {
                return;
            }
            this.expiryDateInSeconds = (System.currentTimeMillis() / 1000) + j;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, $cachedDescriptor);
        throw null;
    }

    public final boolean RemoteActionCompatParcelizer() {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        long j = this.expiryDateInSeconds;
        return 1 <= j && j < jCurrentTimeMillis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CacheData(long j, Object obj) {
        this.data = obj;
        this.expiryDateInSeconds = j;
        if (j == 0 || j > 31536000) {
            return;
        }
        this.expiryDateInSeconds = (System.currentTimeMillis() / 1000) + j;
    }
}
