package androidx.compose.runtime;

import android.icu.lang.UCharacter;
import com.google.firestore.v1.Value;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import o.ClipboardExtensions_androidKt;
import o.NodeCoordinatorCompanionPointerInputSource1;
import o.NodeCoordinatorCompaniononCommitAffectingLayer1;
import o.OnPositionedDispatcher;
import o.accesscontainsDescendant;
import o.accessgetOnObserveReadsChangedcp;
import o.getBringIntoViewOLwlOKw;
import o.getBringIntoViewOLwlOKwannotations;
import o.getCieXyz;
import o.getClipMetadata;
import o.getCompositionLocalConsumerOLwlOKw;
import o.getDrawOLwlOKw;
import o.getDrawOLwlOKwannotations;
import o.getKeyInputOLwlOKw;
import o.getLayoutOLwlOKw;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.visitSelfAndAncestors5BbP62I;

/* JADX INFO: loaded from: classes.dex */
public final class MonotonicFrameClockKt$withFrameMillis$2 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;

    public /* synthetic */ MonotonicFrameClockKt$withFrameMillis$2(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        this.IconCompatParcelizer = i;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Value.RemoteActionCompatParcelizer valueTypeCase;
        getDrawOLwlOKwannotations getdrawolwlokwannotations;
        getDrawOLwlOKwannotations getdrawolwlokwannotations2;
        getDrawOLwlOKwannotations getdrawolwlokwannotations3;
        getDrawOLwlOKwannotations getdrawolwlokwannotations4;
        int i = this.IconCompatParcelizer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.read;
        int i2 = 0;
        int i3 = -1;
        switch (i) {
            case 0:
                return r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 1:
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
                nodeCoordinatorCompanionPointerInputSource1.getClass();
                try {
                    Value valueIconCompatParcelizer = ((getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource1)).IconCompatParcelizer();
                    if (valueIconCompatParcelizer == null) {
                        return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                    }
                    Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer.getValueTypeCase();
                    if (valueTypeCase2 != null) {
                        i3 = OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase2.ordinal()];
                    }
                    if (i3 == 1) {
                        return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                    }
                    if (i3 != 2) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    List<Value> valuesList = valueIconCompatParcelizer.getArrayValue().getValuesList();
                    valuesList.getClass();
                    getDrawOLwlOKwannotations getdrawolwlokwannotations5 = getBringIntoViewOLwlOKw.read;
                    long size = valuesList.size();
                    NodeCoordinatorCompaniononCommitAffectingLayer1 nodeCoordinatorCompaniononCommitAffectingLayer1 = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer;
                    accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
                    accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer();
                    ((Value) accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer).setIntegerValue(size);
                    return new getDrawOLwlOKwannotations((Value) accesscontainsdescendantNewBuilder.serializer());
                } catch (Exception unused) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
            case 2:
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource2 = (NodeCoordinatorCompanionPointerInputSource1) obj;
                nodeCoordinatorCompanionPointerInputSource2.getClass();
                try {
                    getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource2);
                    getDrawOLwlOKwannotations getdrawolwlokwannotations6 = getBringIntoViewOLwlOKw.read;
                    return getDrawOLwlOKw.serializer(getbringintoviewolwlokw.RemoteActionCompatParcelizer());
                } catch (Exception unused2) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
            case 3:
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource3 = (NodeCoordinatorCompanionPointerInputSource1) obj;
                nodeCoordinatorCompanionPointerInputSource3.getClass();
                try {
                    getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource3);
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getbringintoviewolwlokw2, getBringIntoViewOLwlOKwannotations.serializer}, getCieXyz.write())).booleanValue()) {
                        return getbringintoviewolwlokw2;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getbringintoviewolwlokw2, getCompositionLocalConsumerOLwlOKw.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                        return getBringIntoViewOLwlOKw.write;
                    }
                    if (getbringintoviewolwlokw2 instanceof getDrawOLwlOKwannotations) {
                        return getBringIntoViewOLwlOKw.read;
                    }
                    throw new NoWhenBranchMatchedException();
                } catch (Exception unused3) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
            case 4:
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource4 = (NodeCoordinatorCompanionPointerInputSource1) obj;
                nodeCoordinatorCompanionPointerInputSource4.getClass();
                try {
                    getBringIntoViewOLwlOKw getbringintoviewolwlokw3 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource4);
                    if (getbringintoviewolwlokw3.RemoteActionCompatParcelizer()) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    Value valueIconCompatParcelizer2 = getbringintoviewolwlokw3.IconCompatParcelizer();
                    valueTypeCase = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                    int i4 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                    if (i4 == -1 || i4 == 1) {
                        return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                    }
                    Value valueIconCompatParcelizer3 = getbringintoviewolwlokw3.IconCompatParcelizer();
                    valueIconCompatParcelizer3.getClass();
                    Value.RemoteActionCompatParcelizer valueTypeCase3 = valueIconCompatParcelizer3.getValueTypeCase();
                    if (valueTypeCase3 != null) {
                        i3 = getLayoutOLwlOKw.IconCompatParcelizer[valueTypeCase3.ordinal()];
                    }
                    if (i3 == 1) {
                        getDrawOLwlOKwannotations getdrawolwlokwannotations7 = getBringIntoViewOLwlOKw.read;
                        String stringValue = valueIconCompatParcelizer3.getStringValue();
                        stringValue.getClass();
                        String lowerCase = stringValue.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        getdrawolwlokwannotations = new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.write(lowerCase));
                    } else {
                        if (i3 != 2) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        byte[] bArrMediaDescriptionCompat = valueIconCompatParcelizer3.getBytesValue().MediaDescriptionCompat();
                        bArrMediaDescriptionCompat.getClass();
                        int length = bArrMediaDescriptionCompat.length;
                        while (i2 < length) {
                            byte b = bArrMediaDescriptionCompat[i2];
                            accessgetOnObserveReadsChangedcp accessgetonobservereadschangedcp = getKeyInputOLwlOKw.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                            bArrMediaDescriptionCompat[i2] = UCharacter.isUpperCase(b) ? (byte) UCharacter.toLowerCase(bArrMediaDescriptionCompat[i2]) : bArrMediaDescriptionCompat[i2];
                            i2++;
                        }
                        getDrawOLwlOKwannotations getdrawolwlokwannotations8 = getBringIntoViewOLwlOKw.read;
                        getdrawolwlokwannotations = new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.read(bArrMediaDescriptionCompat));
                    }
                    return getdrawolwlokwannotations;
                } catch (Exception unused4) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
            case 5:
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource5 = (NodeCoordinatorCompanionPointerInputSource1) obj;
                nodeCoordinatorCompanionPointerInputSource5.getClass();
                try {
                    getBringIntoViewOLwlOKw getbringintoviewolwlokw4 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource5);
                    if (getbringintoviewolwlokw4.RemoteActionCompatParcelizer()) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    Value valueIconCompatParcelizer4 = getbringintoviewolwlokw4.IconCompatParcelizer();
                    valueTypeCase = valueIconCompatParcelizer4 != null ? valueIconCompatParcelizer4.getValueTypeCase() : null;
                    int i5 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                    if (i5 == -1 || i5 == 1) {
                        return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                    }
                    Value valueIconCompatParcelizer5 = getbringintoviewolwlokw4.IconCompatParcelizer();
                    valueIconCompatParcelizer5.getClass();
                    Value.RemoteActionCompatParcelizer valueTypeCase4 = valueIconCompatParcelizer5.getValueTypeCase();
                    if (valueTypeCase4 != null) {
                        i3 = getLayoutOLwlOKw.IconCompatParcelizer[valueTypeCase4.ordinal()];
                    }
                    if (i3 == 1) {
                        getDrawOLwlOKwannotations getdrawolwlokwannotations9 = getBringIntoViewOLwlOKw.read;
                        String stringValue2 = valueIconCompatParcelizer5.getStringValue();
                        stringValue2.getClass();
                        String upperCase = stringValue2.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        getdrawolwlokwannotations2 = new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.write(upperCase));
                    } else {
                        if (i3 != 2) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        byte[] bArrMediaDescriptionCompat2 = valueIconCompatParcelizer5.getBytesValue().MediaDescriptionCompat();
                        bArrMediaDescriptionCompat2.getClass();
                        int length2 = bArrMediaDescriptionCompat2.length;
                        while (i2 < length2) {
                            byte b2 = bArrMediaDescriptionCompat2[i2];
                            accessgetOnObserveReadsChangedcp accessgetonobservereadschangedcp2 = getKeyInputOLwlOKw.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                            bArrMediaDescriptionCompat2[i2] = UCharacter.isLowerCase(b2) ? (byte) UCharacter.toUpperCase(bArrMediaDescriptionCompat2[i2]) : bArrMediaDescriptionCompat2[i2];
                            i2++;
                        }
                        getDrawOLwlOKwannotations getdrawolwlokwannotations10 = getBringIntoViewOLwlOKw.read;
                        getdrawolwlokwannotations2 = new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.read(bArrMediaDescriptionCompat2));
                    }
                    return getdrawolwlokwannotations2;
                } catch (Exception unused5) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
            case 6:
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource6 = (NodeCoordinatorCompanionPointerInputSource1) obj;
                nodeCoordinatorCompanionPointerInputSource6.getClass();
                try {
                    getBringIntoViewOLwlOKw getbringintoviewolwlokw5 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource6);
                    if (getbringintoviewolwlokw5.RemoteActionCompatParcelizer()) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    Value valueIconCompatParcelizer6 = getbringintoviewolwlokw5.IconCompatParcelizer();
                    valueTypeCase = valueIconCompatParcelizer6 != null ? valueIconCompatParcelizer6.getValueTypeCase() : null;
                    int i6 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                    if (i6 == -1 || i6 == 1) {
                        return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                    }
                    Value valueIconCompatParcelizer7 = getbringintoviewolwlokw5.IconCompatParcelizer();
                    valueIconCompatParcelizer7.getClass();
                    Value.RemoteActionCompatParcelizer valueTypeCase5 = valueIconCompatParcelizer7.getValueTypeCase();
                    if (valueTypeCase5 != null) {
                        i3 = getLayoutOLwlOKw.IconCompatParcelizer[valueTypeCase5.ordinal()];
                    }
                    if (i3 == 1) {
                        getDrawOLwlOKwannotations getdrawolwlokwannotations11 = getBringIntoViewOLwlOKw.read;
                        String stringValue3 = valueIconCompatParcelizer7.getStringValue();
                        stringValue3.getClass();
                        getdrawolwlokwannotations3 = new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.write(getKeyInputOLwlOKw.read(stringValue3)));
                    } else if (i3 == 2) {
                        getDrawOLwlOKwannotations getdrawolwlokwannotations12 = getBringIntoViewOLwlOKw.read;
                        getClipMetadata bytesValue = valueIconCompatParcelizer7.getBytesValue();
                        bytesValue.getClass();
                        byte[] bArrSerializer = getKeyInputOLwlOKw.serializer(bytesValue);
                        ClipboardExtensions_androidKt clipboardExtensions_androidKt = getClipMetadata.read(bArrSerializer, 0, bArrSerializer.length);
                        accesscontainsDescendant accesscontainsdescendantNewBuilder2 = Value.newBuilder();
                        accesscontainsdescendantNewBuilder2.RemoteActionCompatParcelizer();
                        ((Value) accesscontainsdescendantNewBuilder2.RemoteActionCompatParcelizer).setBytesValue(clipboardExtensions_androidKt);
                        getdrawolwlokwannotations3 = new getDrawOLwlOKwannotations((Value) accesscontainsdescendantNewBuilder2.serializer());
                    } else {
                        if (i3 != 3) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getDrawOLwlOKwannotations getdrawolwlokwannotations13 = getBringIntoViewOLwlOKw.read;
                        List<Value> valuesList2 = valueIconCompatParcelizer7.getArrayValue().getValuesList();
                        valuesList2.getClass();
                        getdrawolwlokwannotations3 = new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.write(onContentCardDismissed.MediaMetadataCompat((Iterable) valuesList2)));
                    }
                    return getdrawolwlokwannotations3;
                } catch (Exception unused6) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
            default:
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource7 = (NodeCoordinatorCompanionPointerInputSource1) obj;
                nodeCoordinatorCompanionPointerInputSource7.getClass();
                try {
                    getBringIntoViewOLwlOKw getbringintoviewolwlokw6 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource7);
                    if (getbringintoviewolwlokw6.RemoteActionCompatParcelizer()) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    Value valueIconCompatParcelizer8 = getbringintoviewolwlokw6.IconCompatParcelizer();
                    valueTypeCase = valueIconCompatParcelizer8 != null ? valueIconCompatParcelizer8.getValueTypeCase() : null;
                    int i7 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                    if (i7 == -1 || i7 == 1) {
                        return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                    }
                    Value valueIconCompatParcelizer9 = getbringintoviewolwlokw6.IconCompatParcelizer();
                    valueIconCompatParcelizer9.getClass();
                    Value.RemoteActionCompatParcelizer valueTypeCase6 = valueIconCompatParcelizer9.getValueTypeCase();
                    int i8 = valueTypeCase6 == null ? -1 : getLayoutOLwlOKw.IconCompatParcelizer[valueTypeCase6.ordinal()];
                    if (i8 == 1) {
                        getDrawOLwlOKwannotations getdrawolwlokwannotations14 = getBringIntoViewOLwlOKw.read;
                        visitSelfAndAncestors5BbP62I visitselfandancestors5bbp62i = visitSelfAndAncestors5BbP62I.RemoteActionCompatParcelizer;
                        String stringValue4 = valueIconCompatParcelizer9.getStringValue();
                        visitselfandancestors5bbp62i.getClass();
                        int length3 = stringValue4.length();
                        while (i2 < length3 && visitselfandancestors5bbp62i.read(stringValue4.charAt(i2))) {
                            i2++;
                        }
                        int i9 = length3 - 1;
                        while (i9 > i2 && visitselfandancestors5bbp62i.read(stringValue4.charAt(i9))) {
                            i9--;
                        }
                        String string = stringValue4.subSequence(i2, i9 + 1).toString();
                        string.getClass();
                        getdrawolwlokwannotations4 = new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.write(string));
                    } else {
                        if (i8 != 2) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getClipMetadata bytesValue2 = valueIconCompatParcelizer9.getBytesValue();
                        while (i2 < bytesValue2.RatingCompat() && Character.isWhitespace(bytesValue2.RemoteActionCompatParcelizer(i2))) {
                            i2++;
                        }
                        int iRatingCompat = bytesValue2.RatingCompat() - 1;
                        while (iRatingCompat >= i2 && Character.isWhitespace(bytesValue2.RemoteActionCompatParcelizer(iRatingCompat))) {
                            iRatingCompat--;
                        }
                        if (i2 > iRatingCompat) {
                            getDrawOLwlOKwannotations getdrawolwlokwannotations15 = getBringIntoViewOLwlOKw.read;
                            byte[] bArrMediaDescriptionCompat3 = getClipMetadata.serializer.MediaDescriptionCompat();
                            bArrMediaDescriptionCompat3.getClass();
                            getdrawolwlokwannotations4 = new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.read(bArrMediaDescriptionCompat3));
                        } else {
                            getDrawOLwlOKwannotations getdrawolwlokwannotations16 = getBringIntoViewOLwlOKw.read;
                            byte[] bArrMediaDescriptionCompat4 = bytesValue2.write(i2, iRatingCompat + 1).MediaDescriptionCompat();
                            bArrMediaDescriptionCompat4.getClass();
                            getdrawolwlokwannotations4 = new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.read(bArrMediaDescriptionCompat4));
                        }
                    }
                    return getdrawolwlokwannotations4;
                } catch (Exception unused7) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
        }
    }
}
