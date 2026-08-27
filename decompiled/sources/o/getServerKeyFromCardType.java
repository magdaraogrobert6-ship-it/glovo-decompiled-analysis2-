package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.protobuf.WireFormat$FieldType;
import com.sentiance.protobuf.WireFormat$JavaType;

/* JADX INFO: loaded from: classes3.dex */
public final class getServerKeyFromCardType extends CardKeyCompanion {
    public final accessgetCardTypeMapcp IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public final accessgetDiskCacheLockp serializer;
    public final accessgetDiskCacheLockp write;

    public final Object serializer(Object obj) {
        accessgetCardTypeMapcp accessgetcardtypemapcp = this.IconCompatParcelizer;
        return accessgetcardtypemapcp.read.getJavaType() == WireFormat$JavaType.ENUM ? accessgetcardtypemapcp.write.read(((Integer) obj).intValue()) : obj;
    }

    public final Object write(Object obj) {
        return this.IconCompatParcelizer.read.getJavaType() == WireFormat$JavaType.ENUM ? Integer.valueOf(((IEventSubscriber) obj).getNumber()) : obj;
    }

    public getServerKeyFromCardType(accessgetDiskCacheLockp accessgetdiskcachelockp, Object obj, accessgetDiskCacheLockp accessgetdiskcachelockp2, accessgetCardTypeMapcp accessgetcardtypemapcp) {
        if (accessgetdiskcachelockp == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Null containingTypeDefaultInstance");
            throw null;
        }
        if (accessgetcardtypemapcp.read == WireFormat$FieldType.MESSAGE && accessgetdiskcachelockp2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Null messageDefaultInstance");
            throw null;
        }
        this.write = accessgetdiskcachelockp;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer = accessgetdiskcachelockp2;
        this.IconCompatParcelizer = accessgetcardtypemapcp;
    }
}
