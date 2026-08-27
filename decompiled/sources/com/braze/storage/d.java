package com.braze.storage;

import android.content.Context;
import androidx.sqlite.SQLite;
import com.braze.enums.DataStoreKey;
import com.braze.support.StringUtils;
import java.util.List;
import kotlin.ranges.RangesKt;
import o.forEachItemAfter;
import o.getQueryParameterslambda2;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.performCustomExitMxy_nc0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class d extends DataStoreProvider {
    public final String a;
    public final String b;
    public final onViewDetachedFromWindowlambda1 c;

    public static final String a(Context context, d dVar) {
        return StringUtils.getCacheFileSuffix(context, dVar.a, dVar.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.dust", (String) this.c.MediaSessionCompatResultReceiverWrapper());
    }

    static {
        new DustDataStoreProvider$Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, String str2) {
        super(context);
        context.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = new isAdapterPositionOnScreen(new a$$ExternalSyntheticLambda0(context, 10, this));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final performCustomExitMxy_nc0 getDataStore() {
        Object[] objArr = {forEachItemAfter.IconCompatParcelizer(getContext(), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.managers.dust.metadata", (String) this.c.MediaSessionCompatResultReceiverWrapper()), RangesKt.write((Object) DataStoreKey.MITE_KEY.getKey()))};
        int iSerializer = getQueryParameterslambda2.serializer();
        return createOrGetDataStore((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer));
    }
}
