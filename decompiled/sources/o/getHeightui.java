package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class getHeightui extends com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema {
    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    public final getCoordinatesAccessedDuringModifierPlacement read(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        getCoordinatesAccessedDuringModifierPlacement getcoordinatesaccessedduringmodifierplacement = generatedMessageLite.IconCompatParcelizer;
        if (getcoordinatesaccessedduringmodifierplacement != getCoordinatesAccessedDuringModifierPlacement.write) {
            return getcoordinatesaccessedduringmodifierplacement;
        }
        getCoordinatesAccessedDuringModifierPlacement getcoordinatesaccessedduringmodifierplacementWrite = getCoordinatesAccessedDuringModifierPlacement.write();
        generatedMessageLite.IconCompatParcelizer = getcoordinatesaccessedduringmodifierplacementWrite;
        return getcoordinatesaccessedduringmodifierplacementWrite;
    }
}
