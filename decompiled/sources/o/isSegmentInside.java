package o;

import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.roadrunner.delivery.accept.declinebutton.domain.DeclineButtonClickEventRetriever;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class isSegmentInside {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final ProtobufEncoder write;

    public isSegmentInside(ProtobufEncoder protobufEncoder) {
        this.write = protobufEncoder;
    }

    public final BoringLayoutFactory write(getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        int i = 2 % 2;
        ProtobufEncoder protobufEncoder = this.write;
        BoringLayoutFactory boringLayoutFactory = new BoringLayoutFactory((hasSameLayoutAffectingAttributes) ((mergeJsonObjects) protobufEncoder.write).write(), new getQueryContext(), (DeclineButtonClickEventRetriever) ((fastMergej5T8yCg) protobufEncoder.serializer).write(), (DeliveryAcceptanceLogger) ((mergeJsonObjects) protobufEncoder.RemoteActionCompatParcelizer).write(), getcontentviewgroupparentlayout);
        int i2 = RemoteActionCompatParcelizer + 117;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 53 / 0;
        }
        return boringLayoutFactory;
    }
}
