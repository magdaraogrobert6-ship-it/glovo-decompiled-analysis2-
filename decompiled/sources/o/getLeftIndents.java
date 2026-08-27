package o;

import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.roadrunner.delivery.accept.individualEarnings.presentation.IndividualEarningsUiModelImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getLeftIndents {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final ProtobufEncoder write;

    public getLeftIndents(ProtobufEncoder protobufEncoder) {
        this.write = protobufEncoder;
    }

    public final IndividualEarningsUiModelImpl serializer(getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        int i = 2 % 2;
        getcontentviewgroupparentlayout.getClass();
        ProtobufEncoder protobufEncoder = this.write;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) protobufEncoder.write).write();
        objWrite.getClass();
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) protobufEncoder.serializer).write();
        objWrite2.getClass();
        IndividualEarningsUiModelImpl individualEarningsUiModelImpl = new IndividualEarningsUiModelImpl(getcontentviewgroupparentlayout, (StaticLayoutParams) objWrite, (accessgetStaticLayoutConstructor) objWrite2, (AndroidFont) ((lineEndToVisibleEnd) protobufEncoder.RemoteActionCompatParcelizer).write());
        int i2 = IconCompatParcelizer + 35;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return individualEarningsUiModelImpl;
        }
        throw null;
    }
}
