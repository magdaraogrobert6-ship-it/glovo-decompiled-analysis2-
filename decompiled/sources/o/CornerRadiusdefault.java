package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class CornerRadiusdefault {
    public static final CornerRadiusdefault write = new CornerRadiusdefault();
    public final ConcurrentHashMap read = new ConcurrentHashMap();
    public final copyOHQCggkdefault serializer = new copyOHQCggkdefault();

    public final toStringAsFixed RemoteActionCompatParcelizer(Class cls) {
        Class cls2;
        topLeft.RemoteActionCompatParcelizer(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.read;
        toStringAsFixed tostringasfixedWrite = (toStringAsFixed) concurrentHashMap.get(cls);
        if (tostringasfixedWrite == null) {
            copyOHQCggkdefault copyohqcggkdefault = this.serializer;
            copyohqcggkdefault.getClass();
            Class cls3 = getDualLoadedSignificandannotations.write;
            if (!isBetterCandidate_I7lrPNgminorAxisDistance.class.isAssignableFrom(cls) && (cls2 = getDualLoadedSignificandannotations.write) != null && !cls2.isAssignableFrom(cls)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
            lerp3Ry4LBc lerp3ry4lbc = ((getXannotations) copyohqcggkdefault.read).read(cls);
            if ((lerp3ry4lbc.IconCompatParcelizer & 2) == 2) {
                if (isBetterCandidate_I7lrPNgminorAxisDistance.class.isAssignableFrom(cls)) {
                    tostringasfixedWrite = plusvF7bmM.serializer(getDualLoadedSignificandannotations.read, beamBeatsI7lrPNg.IconCompatParcelizer, lerp3ry4lbc.serializer);
                } else {
                    androidx.datastore.preferences.protobuf.UnknownFieldSchema unknownFieldSchema = getDualLoadedSignificandannotations.RemoteActionCompatParcelizer;
                    activeNode activenode = beamBeatsI7lrPNg.write;
                    if (activenode == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                    tostringasfixedWrite = plusvF7bmM.serializer(unknownFieldSchema, activenode, lerp3ry4lbc.serializer);
                }
            } else if (isBetterCandidate_I7lrPNgminorAxisDistance.class.isAssignableFrom(cls)) {
                tostringasfixedWrite = ((lerp3ry4lbc.IconCompatParcelizer & 1) == 1 ? getPackedValue.PROTO2 : getPackedValue.PROTO3) == getPackedValue.PROTO2 ? isZeroimpl.write(lerp3ry4lbc, unaryMinuskKHJgLs.write, accessgetZerocp.serializer, getDualLoadedSignificandannotations.read, beamBeatsI7lrPNg.IconCompatParcelizer, minusvF7bmM.serializer) : isZeroimpl.write(lerp3ry4lbc, unaryMinuskKHJgLs.write, accessgetZerocp.serializer, getDualLoadedSignificandannotations.read, null, minusvF7bmM.serializer);
            } else {
                if (((lerp3ry4lbc.IconCompatParcelizer & 1) == 1 ? getPackedValue.PROTO2 : getPackedValue.PROTO3) == getPackedValue.PROTO2) {
                    getZerokKHJgLsannotations getzerokkhjglsannotations = unaryMinuskKHJgLs.RemoteActionCompatParcelizer;
                    component2impl component2implVar = accessgetZerocp.IconCompatParcelizer;
                    androidx.datastore.preferences.protobuf.UnknownFieldSchema unknownFieldSchema2 = getDualLoadedSignificandannotations.RemoteActionCompatParcelizer;
                    activeNode activenode2 = beamBeatsI7lrPNg.write;
                    if (activenode2 == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                    tostringasfixedWrite = isZeroimpl.write(lerp3ry4lbc, getzerokkhjglsannotations, component2implVar, unknownFieldSchema2, activenode2, minusvF7bmM.RemoteActionCompatParcelizer);
                } else {
                    tostringasfixedWrite = isZeroimpl.write(lerp3ry4lbc, unaryMinuskKHJgLs.RemoteActionCompatParcelizer, accessgetZerocp.IconCompatParcelizer, getDualLoadedSignificandannotations.serializer, null, minusvF7bmM.RemoteActionCompatParcelizer);
                }
            }
            toStringAsFixed tostringasfixed = (toStringAsFixed) concurrentHashMap.putIfAbsent(cls, tostringasfixedWrite);
            if (tostringasfixed != null) {
                return tostringasfixed;
            }
        }
        return tostringasfixedWrite;
    }
}
