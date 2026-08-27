package o;

import com.google.firestore.v1.Value;
import com.google.protobuf.Timestamp;
import java.time.Instant;
import java.time.temporal.TemporalUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class getSoftKeyboardKeyInputOLwlOKwannotations implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM write;

    public /* synthetic */ getSoftKeyboardKeyInputOLwlOKwannotations(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, int i) {
        this.read = i;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        getDrawOLwlOKwannotations getdrawolwlokwannotations;
        Timestamp timestampValue;
        Timestamp timestampValue2;
        int i = this.read;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.IconCompatParcelizer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = this.serializer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = this.write;
        lValueOf = null;
        Long lValueOf = null;
        lValueOf = null;
        Long lValueOf2 = null;
        int i2 = -1;
        if (i == 0) {
            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
            nodeCoordinatorCompanionPointerInputSource1.getClass();
            try {
                Long lIconCompatParcelizer = getKeyInputOLwlOKw.IconCompatParcelizer((getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(nodeCoordinatorCompanionPointerInputSource1));
                if (lIconCompatParcelizer == null) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
                long jLongValue = lIconCompatParcelizer.longValue();
                Long lIconCompatParcelizer2 = getKeyInputOLwlOKw.IconCompatParcelizer((getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource1));
                if (lIconCompatParcelizer2 == null) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
                long jLongValue2 = lIconCompatParcelizer2.longValue();
                if (jLongValue2 < 0) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
                Value valueIconCompatParcelizer = ((getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(nodeCoordinatorCompanionPointerInputSource1)).IconCompatParcelizer();
                Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
                if (valueTypeCase != null) {
                    i2 = getLayoutOLwlOKw.IconCompatParcelizer[valueTypeCase.ordinal()];
                }
                if (i2 == 1) {
                    String stringValue = valueIconCompatParcelizer.getStringValue();
                    if (jLongValue < 0) {
                        stringValue.getClass();
                        jLongValue = Math.max(0L, ((long) stringValue.codePointCount(0, stringValue.length())) + jLongValue);
                    }
                    stringValue.getClass();
                    if (jLongValue >= stringValue.codePointCount(0, stringValue.length())) {
                        getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                        getdrawolwlokwannotations = new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.write(""));
                    } else {
                        StringBuilder sb = new StringBuilder();
                        int iOffsetByCodePoints = stringValue.offsetByCodePoints(0, (int) Math.min(jLongValue, 2147483647L));
                        for (long j = 0; j < jLongValue2; j++) {
                            if (iOffsetByCodePoints >= stringValue.length()) {
                                getDrawOLwlOKwannotations getdrawolwlokwannotations3 = getBringIntoViewOLwlOKw.read;
                                getdrawolwlokwannotations = new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.write(sb.toString()));
                            } else {
                                sb.append(Character.toChars(stringValue.codePointAt(iOffsetByCodePoints)));
                                iOffsetByCodePoints = stringValue.offsetByCodePoints(iOffsetByCodePoints, 1);
                            }
                        }
                        getDrawOLwlOKwannotations getdrawolwlokwannotations4 = getBringIntoViewOLwlOKw.read;
                        getdrawolwlokwannotations = new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.write(sb.toString()));
                    }
                } else {
                    if (i2 != 2) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    getClipMetadata bytesValue = valueIconCompatParcelizer.getBytesValue();
                    int iRatingCompat = bytesValue.RatingCompat();
                    int i3 = iRatingCompat - 1;
                    if (jLongValue < 0) {
                        jLongValue = Math.max(0L, ((long) i3) + jLongValue + 1);
                    }
                    if (i3 < jLongValue) {
                        getDrawOLwlOKwannotations getdrawolwlokwannotations5 = getBringIntoViewOLwlOKw.read;
                        getdrawolwlokwannotations = new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.read(new byte[0]));
                    } else {
                        int iMin = Math.min(Integer.MAX_VALUE, Math.min(component3D9Ej5fM.write(((long) component3D9Ej5fM.write(jLongValue)) + ((long) component3D9Ej5fM.write(jLongValue2))), iRatingCompat));
                        getDrawOLwlOKwannotations getdrawolwlokwannotations6 = getBringIntoViewOLwlOKw.read;
                        getClipMetadata getclipmetadataWrite = bytesValue.write((int) jLongValue, iMin);
                        onPreAttach.serializer(getclipmetadataWrite, "Provided ByteString must not be null.");
                        accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
                        accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer();
                        ((Value) accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer).setBytesValue(getclipmetadataWrite);
                        getdrawolwlokwannotations = new getDrawOLwlOKwannotations((Value) accesscontainsdescendantNewBuilder.serializer());
                    }
                }
                return getdrawolwlokwannotations;
            } catch (Exception unused) {
                return getBringIntoViewOLwlOKwannotations.serializer;
            }
        }
        if (i == 1) {
            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource2 = (NodeCoordinatorCompanionPointerInputSource1) obj;
            nodeCoordinatorCompanionPointerInputSource2.getClass();
            try {
                getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(nodeCoordinatorCompanionPointerInputSource2);
                if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
                Value valueIconCompatParcelizer2 = getbringintoviewolwlokw.IconCompatParcelizer();
                Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                int i4 = valueTypeCase2 == null ? -1 : getFocusPropertiesOLwlOKwannotations.serializer[valueTypeCase2.ordinal()];
                if (i4 == -1 || i4 == 1) {
                    return (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource2);
                }
                if (i4 != 2) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
                return valueIconCompatParcelizer2.getBooleanValue() ? (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(nodeCoordinatorCompanionPointerInputSource2) : (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource2);
            } catch (Exception unused2) {
                return getBringIntoViewOLwlOKwannotations.serializer;
            }
        }
        if (i != 2) {
            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource3 = (NodeCoordinatorCompanionPointerInputSource1) obj;
            nodeCoordinatorCompanionPointerInputSource3.getClass();
            try {
                if (((getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(nodeCoordinatorCompanionPointerInputSource3)).RemoteActionCompatParcelizer()) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
                Value valueIconCompatParcelizer3 = ((getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(nodeCoordinatorCompanionPointerInputSource3)).IconCompatParcelizer();
                if (((getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(nodeCoordinatorCompanionPointerInputSource3)).RemoteActionCompatParcelizer()) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
                Value valueIconCompatParcelizer4 = ((getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(nodeCoordinatorCompanionPointerInputSource3)).IconCompatParcelizer();
                if (((getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource3)).RemoteActionCompatParcelizer()) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
                Value valueIconCompatParcelizer5 = ((getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource3)).IconCompatParcelizer();
                Value.RemoteActionCompatParcelizer valueTypeCase3 = valueIconCompatParcelizer3 != null ? valueIconCompatParcelizer3.getValueTypeCase() : null;
                int i5 = valueTypeCase3 == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase3.ordinal()];
                if (i5 == -1 || i5 == 1) {
                    timestampValue2 = null;
                } else {
                    if (i5 != 3) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    timestampValue2 = valueIconCompatParcelizer3.getTimestampValue();
                }
                Value.RemoteActionCompatParcelizer valueTypeCase4 = valueIconCompatParcelizer4 != null ? valueIconCompatParcelizer4.getValueTypeCase() : null;
                if (valueTypeCase4 != null && OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase4.ordinal()] == 4) {
                    String stringValue2 = valueIconCompatParcelizer4.getStringValue();
                    stringValue2.getClass();
                    Value.RemoteActionCompatParcelizer valueTypeCase5 = valueIconCompatParcelizer5 != null ? valueIconCompatParcelizer5.getValueTypeCase() : null;
                    int i6 = valueTypeCase5 == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase5.ordinal()];
                    if (i6 != -1 && i6 != 1) {
                        if (i6 != 5) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        lValueOf = Long.valueOf(valueIconCompatParcelizer5.getIntegerValue());
                    }
                    if (timestampValue2 != null && lValueOf != null) {
                        Instant instantMinus = Instant.ofEpochSecond(timestampValue2.getSeconds(), timestampValue2.getNanos()).minus(lValueOf.longValue(), (TemporalUnit) getOnObserveReadsChangedui.serializer(stringValue2));
                        if (!getOnObserveReadsChangedui.serializer(instantMinus.getNano(), instantMinus.getEpochSecond())) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getDrawOLwlOKwannotations getdrawolwlokwannotations7 = getBringIntoViewOLwlOKw.read;
                        return getDrawOLwlOKw.RemoteActionCompatParcelizer(instantMinus.getNano(), instantMinus.getEpochSecond());
                    }
                    return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                }
                return getBringIntoViewOLwlOKwannotations.serializer;
            } catch (Exception unused3) {
                return getBringIntoViewOLwlOKwannotations.serializer;
            }
        }
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource4 = (NodeCoordinatorCompanionPointerInputSource1) obj;
        nodeCoordinatorCompanionPointerInputSource4.getClass();
        try {
            if (((getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(nodeCoordinatorCompanionPointerInputSource4)).RemoteActionCompatParcelizer()) {
                return getBringIntoViewOLwlOKwannotations.serializer;
            }
            Value valueIconCompatParcelizer6 = ((getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(nodeCoordinatorCompanionPointerInputSource4)).IconCompatParcelizer();
            if (((getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(nodeCoordinatorCompanionPointerInputSource4)).RemoteActionCompatParcelizer()) {
                return getBringIntoViewOLwlOKwannotations.serializer;
            }
            Value valueIconCompatParcelizer7 = ((getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(nodeCoordinatorCompanionPointerInputSource4)).IconCompatParcelizer();
            if (((getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource4)).RemoteActionCompatParcelizer()) {
                return getBringIntoViewOLwlOKwannotations.serializer;
            }
            Value valueIconCompatParcelizer8 = ((getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource4)).IconCompatParcelizer();
            Value.RemoteActionCompatParcelizer valueTypeCase6 = valueIconCompatParcelizer6 != null ? valueIconCompatParcelizer6.getValueTypeCase() : null;
            int i7 = valueTypeCase6 == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase6.ordinal()];
            if (i7 == -1 || i7 == 1) {
                timestampValue = null;
            } else {
                if (i7 != 3) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
                timestampValue = valueIconCompatParcelizer6.getTimestampValue();
            }
            Value.RemoteActionCompatParcelizer valueTypeCase7 = valueIconCompatParcelizer7 != null ? valueIconCompatParcelizer7.getValueTypeCase() : null;
            if (valueTypeCase7 != null && OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase7.ordinal()] == 4) {
                String stringValue3 = valueIconCompatParcelizer7.getStringValue();
                stringValue3.getClass();
                Value.RemoteActionCompatParcelizer valueTypeCase8 = valueIconCompatParcelizer8 != null ? valueIconCompatParcelizer8.getValueTypeCase() : null;
                int i8 = valueTypeCase8 == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase8.ordinal()];
                if (i8 != -1 && i8 != 1) {
                    if (i8 != 5) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    lValueOf2 = Long.valueOf(valueIconCompatParcelizer8.getIntegerValue());
                }
                if (timestampValue != null && lValueOf2 != null) {
                    Instant instantPlus = Instant.ofEpochSecond(timestampValue.getSeconds(), timestampValue.getNanos()).plus(lValueOf2.longValue(), (TemporalUnit) getOnObserveReadsChangedui.serializer(stringValue3));
                    if (!getOnObserveReadsChangedui.serializer(instantPlus.getNano(), instantPlus.getEpochSecond())) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    getDrawOLwlOKwannotations getdrawolwlokwannotations8 = getBringIntoViewOLwlOKw.read;
                    return getDrawOLwlOKw.RemoteActionCompatParcelizer(instantPlus.getNano(), instantPlus.getEpochSecond());
                }
                return getBringIntoViewOLwlOKw.IconCompatParcelizer;
            }
            return getBringIntoViewOLwlOKwannotations.serializer;
        } catch (Exception unused4) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
    }
}
