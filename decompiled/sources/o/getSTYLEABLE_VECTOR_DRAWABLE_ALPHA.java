package o;

import com.foodora.courier.app.GetEquipmentInfoRepository;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getSTYLEABLE_VECTOR_DRAWABLE_ALPHA extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ GetEquipmentInfoRepository serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSTYLEABLE_VECTOR_DRAWABLE_ALPHA(GetEquipmentInfoRepository getEquipmentInfoRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = getEquipmentInfoRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 113;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objEquipmentInfo = this.serializer.equipmentInfo(this);
        int i4 = IconCompatParcelizer + 93;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objEquipmentInfo;
        }
        throw null;
    }
}
