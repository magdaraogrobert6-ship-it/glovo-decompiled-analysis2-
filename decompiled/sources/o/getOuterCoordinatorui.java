package o;

import com.google.crypto.tink.proto.KeysetInfo;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class getOuterCoordinatorui extends GeneratedMessageLite {
    private static final getOuterCoordinatorui DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile getAlignmentLinesOwnerui PARSER;
    private setOnAttachui encryptedKeyset_ = setOnAttachui.IconCompatParcelizer;
    private KeysetInfo keysetInfo_;

    public final setOnAttachui IconCompatParcelizer() {
        return this.encryptedKeyset_;
    }

    static {
        getOuterCoordinatorui getoutercoordinatorui = new getOuterCoordinatorui();
        DEFAULT_INSTANCE = getoutercoordinatorui;
        GeneratedMessageLite.RemoteActionCompatParcelizer(getOuterCoordinatorui.class, getoutercoordinatorui);
    }

    public static getSemanticsConfiguration RemoteActionCompatParcelizer() {
        return (getSemanticsConfiguration) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (getPlaceOrderui.write[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new getOuterCoordinatorui();
            case 2:
                return new getSemanticsConfiguration();
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (getOuterCoordinatorui.class) {
                    getzcomparatorui = PARSER;
                    if (getzcomparatorui == null) {
                        getzcomparatorui = new getZComparatorui();
                        PARSER = getzcomparatorui;
                    }
                    break;
                }
                return getzcomparatorui;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                getAlignmentLinesMap.write();
                return null;
        }
    }

    public static void RemoteActionCompatParcelizer(getOuterCoordinatorui getoutercoordinatorui, setOnDetachui setondetachui) {
        getoutercoordinatorui.getClass();
        getoutercoordinatorui.encryptedKeyset_ = setondetachui;
    }

    public static void write(getOuterCoordinatorui getoutercoordinatorui, KeysetInfo keysetInfo) {
        getoutercoordinatorui.getClass();
        getoutercoordinatorui.keysetInfo_ = keysetInfo;
    }

    public static getOuterCoordinatorui serializer(ByteArrayInputStream byteArrayInputStream, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLite = GeneratedMessageLite.read(DEFAULT_INSTANCE, new CodedInputStream$StreamDecoder(byteArrayInputStream), getnotplacedplaceorderuiannotations);
        GeneratedMessageLite.serializer(generatedMessageLite);
        return (getOuterCoordinatorui) generatedMessageLite;
    }
}
