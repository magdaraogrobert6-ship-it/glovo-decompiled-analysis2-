package o;

import com.google.firestore.v1.Value;
import com.google.protobuf.Timestamp;

/* JADX INFO: loaded from: classes2.dex */
public final class ObserverModifierNode implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Value.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public final /* synthetic */ int write;

    public /* synthetic */ ObserverModifierNode(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
        this.write = i;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Value.RemoteActionCompatParcelizer valueTypeCase;
        Object objRemoteActionCompatParcelizer;
        Object objRemoteActionCompatParcelizer2;
        Object objRemoteActionCompatParcelizer3;
        Object objRemoteActionCompatParcelizer4;
        int i = this.write;
        Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.RemoteActionCompatParcelizer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.read;
        switch (i) {
            case 0:
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
                nodeCoordinatorCompanionPointerInputSource1.getClass();
                try {
                    getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource1);
                    if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                    valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
                    int i2 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                    if (i2 == -1 || i2 == 1) {
                        return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                    }
                    if (valueTypeCase != remoteActionCompatParcelizer) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    try {
                        String stringValue = valueIconCompatParcelizer.getStringValue();
                        getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                        long jCodePointCount = stringValue.codePointCount(0, stringValue.length());
                        NodeCoordinatorCompaniononCommitAffectingLayer1 nodeCoordinatorCompaniononCommitAffectingLayer1 = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer;
                        accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
                        accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer();
                        ((Value) accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer).setIntegerValue(jCodePointCount);
                        return new getDrawOLwlOKwannotations((Value) accesscontainsdescendantNewBuilder.serializer());
                    } catch (Exception unused) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                } catch (Exception unused2) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
            case 1:
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource2 = (NodeCoordinatorCompanionPointerInputSource1) obj;
                nodeCoordinatorCompanionPointerInputSource2.getClass();
                try {
                    getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource2);
                    if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                    valueTypeCase = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                    int i3 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                    if (i3 == -1 || i3 == 1) {
                        return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                    }
                    if (valueTypeCase != remoteActionCompatParcelizer) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    try {
                        boolean booleanValue = valueIconCompatParcelizer2.getBooleanValue();
                        getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                        return getDrawOLwlOKw.serializer(!booleanValue);
                    } catch (Exception unused3) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                } catch (Exception unused4) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
            case 2:
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource3 = (NodeCoordinatorCompanionPointerInputSource1) obj;
                nodeCoordinatorCompanionPointerInputSource3.getClass();
                try {
                    getBringIntoViewOLwlOKw getbringintoviewolwlokw3 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource3);
                    if (getbringintoviewolwlokw3.RemoteActionCompatParcelizer()) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    Value valueIconCompatParcelizer3 = getbringintoviewolwlokw3.IconCompatParcelizer();
                    valueTypeCase = valueIconCompatParcelizer3 != null ? valueIconCompatParcelizer3.getValueTypeCase() : null;
                    int i4 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                    if (i4 == -1 || i4 == 1) {
                        return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                    }
                    if (valueTypeCase != remoteActionCompatParcelizer) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    try {
                        long integerValue = valueIconCompatParcelizer3.getIntegerValue();
                        ObserverModifierNodeKt observerModifierNodeKt = getOnObserveReadsChangedui.serializer;
                        if (integerValue < -62135596800000000L || integerValue > 253402300799999999L) {
                            objRemoteActionCompatParcelizer = getBringIntoViewOLwlOKwannotations.serializer;
                        } else {
                            getDrawOLwlOKwannotations getdrawolwlokwannotations3 = getBringIntoViewOLwlOKw.read;
                            objRemoteActionCompatParcelizer = getDrawOLwlOKw.RemoteActionCompatParcelizer(((int) Math.floorMod(integerValue, 1000000L)) * 1000, Math.floorDiv(integerValue, 1000000L));
                        }
                        return objRemoteActionCompatParcelizer;
                    } catch (Exception unused5) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                } catch (Exception unused6) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
            case 3:
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource4 = (NodeCoordinatorCompanionPointerInputSource1) obj;
                nodeCoordinatorCompanionPointerInputSource4.getClass();
                try {
                    getBringIntoViewOLwlOKw getbringintoviewolwlokw4 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource4);
                    if (getbringintoviewolwlokw4.RemoteActionCompatParcelizer()) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    Value valueIconCompatParcelizer4 = getbringintoviewolwlokw4.IconCompatParcelizer();
                    valueTypeCase = valueIconCompatParcelizer4 != null ? valueIconCompatParcelizer4.getValueTypeCase() : null;
                    int i5 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                    if (i5 == -1 || i5 == 1) {
                        return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                    }
                    if (valueTypeCase != remoteActionCompatParcelizer) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    try {
                        long integerValue2 = valueIconCompatParcelizer4.getIntegerValue();
                        ObserverModifierNodeKt observerModifierNodeKt2 = getOnObserveReadsChangedui.serializer;
                        if (integerValue2 < -62135596800000L || integerValue2 > 253402300799999L) {
                            objRemoteActionCompatParcelizer2 = getBringIntoViewOLwlOKwannotations.serializer;
                        } else {
                            getDrawOLwlOKwannotations getdrawolwlokwannotations4 = getBringIntoViewOLwlOKw.read;
                            objRemoteActionCompatParcelizer2 = getDrawOLwlOKw.RemoteActionCompatParcelizer(((int) Math.floorMod(integerValue2, 1000L)) * 1000000, Math.floorDiv(integerValue2, 1000L));
                        }
                        return objRemoteActionCompatParcelizer2;
                    } catch (Exception unused7) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                } catch (Exception unused8) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
            case 4:
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource5 = (NodeCoordinatorCompanionPointerInputSource1) obj;
                nodeCoordinatorCompanionPointerInputSource5.getClass();
                try {
                    getBringIntoViewOLwlOKw getbringintoviewolwlokw5 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource5);
                    if (getbringintoviewolwlokw5.RemoteActionCompatParcelizer()) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    Value valueIconCompatParcelizer5 = getbringintoviewolwlokw5.IconCompatParcelizer();
                    valueTypeCase = valueIconCompatParcelizer5 != null ? valueIconCompatParcelizer5.getValueTypeCase() : null;
                    int i6 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                    if (i6 == -1 || i6 == 1) {
                        return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                    }
                    if (valueTypeCase != remoteActionCompatParcelizer) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    try {
                        long integerValue3 = valueIconCompatParcelizer5.getIntegerValue();
                        ObserverModifierNodeKt observerModifierNodeKt3 = getOnObserveReadsChangedui.serializer;
                        if (integerValue3 < -62135596800L || integerValue3 > 253402300799L) {
                            objRemoteActionCompatParcelizer3 = getBringIntoViewOLwlOKwannotations.serializer;
                        } else {
                            getDrawOLwlOKwannotations getdrawolwlokwannotations5 = getBringIntoViewOLwlOKw.read;
                            objRemoteActionCompatParcelizer3 = getDrawOLwlOKw.RemoteActionCompatParcelizer(0, integerValue3);
                        }
                        return objRemoteActionCompatParcelizer3;
                    } catch (Exception unused9) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                } catch (Exception unused10) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
            case 5:
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource6 = (NodeCoordinatorCompanionPointerInputSource1) obj;
                nodeCoordinatorCompanionPointerInputSource6.getClass();
                try {
                    getBringIntoViewOLwlOKw getbringintoviewolwlokw6 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource6);
                    if (getbringintoviewolwlokw6.RemoteActionCompatParcelizer()) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    Value valueIconCompatParcelizer6 = getbringintoviewolwlokw6.IconCompatParcelizer();
                    valueTypeCase = valueIconCompatParcelizer6 != null ? valueIconCompatParcelizer6.getValueTypeCase() : null;
                    int i7 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                    if (i7 == -1 || i7 == 1) {
                        return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                    }
                    if (valueTypeCase != remoteActionCompatParcelizer) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    try {
                        Timestamp timestampValue = valueIconCompatParcelizer6.getTimestampValue();
                        if (!getOnObserveReadsChangedui.serializer(timestampValue.getNanos(), timestampValue.getSeconds())) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getDrawOLwlOKwannotations getdrawolwlokwannotations6 = getBringIntoViewOLwlOKw.read;
                        return getDrawOLwlOKw.RemoteActionCompatParcelizer(timestampValue.getSeconds() < -9223372036854L ? compareTo9YPOF3E.read(compareTo9YPOF3E.IconCompatParcelizer(timestampValue.getSeconds() + 1, 1000000L), (((long) timestampValue.getNanos()) / 1000) - 1000000) : compareTo9YPOF3E.read(compareTo9YPOF3E.IconCompatParcelizer(timestampValue.getSeconds(), 1000000L), ((long) timestampValue.getNanos()) / 1000));
                    } catch (Exception unused11) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                } catch (Exception unused12) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
            case 6:
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource7 = (NodeCoordinatorCompanionPointerInputSource1) obj;
                nodeCoordinatorCompanionPointerInputSource7.getClass();
                try {
                    getBringIntoViewOLwlOKw getbringintoviewolwlokw7 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource7);
                    if (getbringintoviewolwlokw7.RemoteActionCompatParcelizer()) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    Value valueIconCompatParcelizer7 = getbringintoviewolwlokw7.IconCompatParcelizer();
                    valueTypeCase = valueIconCompatParcelizer7 != null ? valueIconCompatParcelizer7.getValueTypeCase() : null;
                    int i8 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                    if (i8 == -1 || i8 == 1) {
                        return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                    }
                    if (valueTypeCase != remoteActionCompatParcelizer) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    try {
                        Timestamp timestampValue2 = valueIconCompatParcelizer7.getTimestampValue();
                        if (!getOnObserveReadsChangedui.serializer(timestampValue2.getNanos(), timestampValue2.getSeconds())) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getDrawOLwlOKwannotations getdrawolwlokwannotations7 = getBringIntoViewOLwlOKw.read;
                        return getDrawOLwlOKw.RemoteActionCompatParcelizer((timestampValue2.getSeconds() >= 0 || timestampValue2.getNanos() <= 0) ? compareTo9YPOF3E.read(compareTo9YPOF3E.IconCompatParcelizer(timestampValue2.getSeconds(), 1000L), ((long) timestampValue2.getNanos()) / 1000000) : compareTo9YPOF3E.read(compareTo9YPOF3E.IconCompatParcelizer(timestampValue2.getSeconds() + 1, 1000L), (((long) timestampValue2.getNanos()) / 1000000) - 1000));
                    } catch (Exception unused13) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                } catch (Exception unused14) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
            default:
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource8 = (NodeCoordinatorCompanionPointerInputSource1) obj;
                nodeCoordinatorCompanionPointerInputSource8.getClass();
                try {
                    getBringIntoViewOLwlOKw getbringintoviewolwlokw8 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource8);
                    if (getbringintoviewolwlokw8.RemoteActionCompatParcelizer()) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    Value valueIconCompatParcelizer8 = getbringintoviewolwlokw8.IconCompatParcelizer();
                    valueTypeCase = valueIconCompatParcelizer8 != null ? valueIconCompatParcelizer8.getValueTypeCase() : null;
                    int i9 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                    if (i9 == -1 || i9 == 1) {
                        return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                    }
                    if (valueTypeCase != remoteActionCompatParcelizer) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    try {
                        Timestamp timestampValue3 = valueIconCompatParcelizer8.getTimestampValue();
                        if (getOnObserveReadsChangedui.serializer(timestampValue3.getNanos(), timestampValue3.getSeconds())) {
                            long nanos = timestampValue3.getNanos();
                            if (0 > nanos || nanos >= 1000000000) {
                                objRemoteActionCompatParcelizer4 = getBringIntoViewOLwlOKwannotations.serializer;
                            } else {
                                getDrawOLwlOKwannotations getdrawolwlokwannotations8 = getBringIntoViewOLwlOKw.read;
                                objRemoteActionCompatParcelizer4 = getDrawOLwlOKw.RemoteActionCompatParcelizer(timestampValue3.getSeconds());
                            }
                        } else {
                            objRemoteActionCompatParcelizer4 = getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        return objRemoteActionCompatParcelizer4;
                    } catch (Exception unused15) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                } catch (Exception unused16) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
        }
    }
}
