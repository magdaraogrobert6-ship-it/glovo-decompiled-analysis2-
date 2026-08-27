package o;

import com.google.android.play.core.appupdate.zzz;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class unpackMetaParentId extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ zzz write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unpackMetaParentId(zzz zzzVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = zzzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 109;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object countryConfigs = this.write.getCountryConfigs(this);
        int i4 = IconCompatParcelizer + 49;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return countryConfigs;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
