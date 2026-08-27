package o;

import androidx.compose.runtime.MonotonicFrameClockKt$withFrameMillis$2;
import androidx.room.RoomDatabase$createConnectionManager$2;
import com.google.firebase.firestore.model.Values$Enterprise;
import com.google.firestore.v1.Value;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import o.NodeCoordinatorCompanionPointerInputSource1;
import o.NodeCoordinatorCompaniononCommitAffectingLayer1;
import o.Nodes;
import o.OnPositionedDispatcher;
import o.dispatch;
import o.getApproachMeasureOLwlOKw;
import o.getBringIntoViewOLwlOKw;
import o.getBringIntoViewOLwlOKwannotations;
import o.getCompositionLocalConsumerOLwlOKwannotations;
import o.getDrawOLwlOKw;
import o.getDrawOLwlOKwannotations;
import o.getGlobalPositionAwareOLwlOKw;
import o.shouldHitTest;

/* JADX INFO: loaded from: classes2.dex */
public final class dispatch implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final dispatch write = new dispatch(0);
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ dispatch(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        final int i = 5;
        final int i2 = 4;
        final int i3 = 3;
        final int i4 = 2;
        final int i5 = 1;
        final int i6 = 0;
        switch (this.IconCompatParcelizer) {
            case 0:
                ((List) obj).getClass();
                throw new getCardAtIndex(0);
            case 1:
                List list = (List) obj;
                list.getClass();
                if (list.size() != 2) {
                    getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list.size()));
                    throw null;
                }
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list.get(0);
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list.get(1);
                return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1
                    private final Object IconCompatParcelizer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i7 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            if (i7 == -1 || i7 == 1) {
                                return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                            }
                            if (i7 != 2) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            List<Value> valuesList = valueIconCompatParcelizer2.getArrayValue().getValuesList();
                            valuesList.getClass();
                            if (valueIconCompatParcelizer == null) {
                                return getBringIntoViewOLwlOKw.write;
                            }
                            dispatch dispatchVar = Nodes.serializer;
                            for (Value value : valuesList) {
                                RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = Values$Enterprise.IconCompatParcelizer;
                                boolean zSerializer = NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(valueIconCompatParcelizer, value);
                                if (zSerializer) {
                                    return getBringIntoViewOLwlOKw.write;
                                }
                                if (zSerializer) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            return getBringIntoViewOLwlOKw.read;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object MediaDescriptionCompat(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            int i7 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            return getDrawOLwlOKw.serializer(i7 == 2 || i7 == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object RemoteActionCompatParcelizer(Object obj2) {
                        Object getglobalpositionawareolwlokw;
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Object getglobalpositionawareolwlokw2 = null;
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
                            int i7 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            boolean z = true;
                            if (i7 == -1 || i7 == 1) {
                                getglobalpositionawareolwlokw = null;
                            } else if (i7 == 5) {
                                getglobalpositionawareolwlokw = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer.getIntegerValue());
                            } else {
                                if (i7 != 6) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                getglobalpositionawareolwlokw = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer.getDoubleValue());
                            }
                            Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i8 = valueTypeCase2 == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase2.ordinal()];
                            if (i8 != -1 && i8 != 1) {
                                if (i8 == 5) {
                                    getglobalpositionawareolwlokw2 = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer2.getIntegerValue());
                                } else {
                                    if (i8 != 6) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    getglobalpositionawareolwlokw2 = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer2.getDoubleValue());
                                }
                            }
                            if (getglobalpositionawareolwlokw != null && getglobalpositionawareolwlokw2 != null) {
                                if (!(getglobalpositionawareolwlokw instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations) {
                                        double d = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                        double d2 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                        getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                                        return getDrawOLwlOKw.write(d - d2);
                                    }
                                    if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    double d3 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                    double d4 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d3 - d4);
                                }
                                if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    double d5 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                    double d6 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations3 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d5 - d6);
                                }
                                long j = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                long j2 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                getDrawOLwlOKwannotations getdrawolwlokwannotations4 = getBringIntoViewOLwlOKw.read;
                                long j3 = j - j2;
                                boolean z2 = (j ^ j2) >= 0;
                                if ((j ^ j3) < 0) {
                                    z = false;
                                }
                                LazyKt__LazyJVMKt.write(j, j2, "checkedSubtract", z2 | z);
                                return getDrawOLwlOKw.RemoteActionCompatParcelizer(j3);
                            }
                            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object read(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            shouldHitTest shouldhittest = Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2);
                            boolean z = true;
                            if (getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[shouldhittest.ordinal()] != 1) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object serializer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            int i7 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            boolean z = true;
                            if (i7 != 1 && i7 != 2) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object write(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            return getDrawOLwlOKw.serializer(getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()] == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:532:0x0811 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:533:0x0816  */
                    /* JADX WARN: Code duplicated, block: B:539:0x0826 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:541:0x0833 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:542:0x0836 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code restructure failed: missing block: B:507:0x07b5, code lost:
                    
                        if (r8 < 0.0d) goto L508;
                     */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r12) {
                        /*
                            Method dump skipped, instruction units count: 2148
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1.invoke(java.lang.Object):java.lang.Object");
                    }
                };
            case 2:
                List list2 = (List) obj;
                list2.getClass();
                if (list2.size() != 2) {
                    getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list2.size()));
                    throw null;
                }
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list2.get(0);
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list2.get(1);
                return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1
                    private final Object IconCompatParcelizer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i7 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            if (i7 == -1 || i7 == 1) {
                                return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                            }
                            if (i7 != 2) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            List<Value> valuesList = valueIconCompatParcelizer2.getArrayValue().getValuesList();
                            valuesList.getClass();
                            if (valueIconCompatParcelizer == null) {
                                return getBringIntoViewOLwlOKw.write;
                            }
                            dispatch dispatchVar = Nodes.serializer;
                            for (Value value : valuesList) {
                                RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = Values$Enterprise.IconCompatParcelizer;
                                boolean zSerializer = NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(valueIconCompatParcelizer, value);
                                if (zSerializer) {
                                    return getBringIntoViewOLwlOKw.write;
                                }
                                if (zSerializer) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            return getBringIntoViewOLwlOKw.read;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object MediaDescriptionCompat(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            int i7 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            return getDrawOLwlOKw.serializer(i7 == 2 || i7 == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object RemoteActionCompatParcelizer(Object obj2) {
                        Object getglobalpositionawareolwlokw;
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Object getglobalpositionawareolwlokw2 = null;
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
                            int i7 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            boolean z = true;
                            if (i7 == -1 || i7 == 1) {
                                getglobalpositionawareolwlokw = null;
                            } else if (i7 == 5) {
                                getglobalpositionawareolwlokw = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer.getIntegerValue());
                            } else {
                                if (i7 != 6) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                getglobalpositionawareolwlokw = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer.getDoubleValue());
                            }
                            Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i8 = valueTypeCase2 == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase2.ordinal()];
                            if (i8 != -1 && i8 != 1) {
                                if (i8 == 5) {
                                    getglobalpositionawareolwlokw2 = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer2.getIntegerValue());
                                } else {
                                    if (i8 != 6) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    getglobalpositionawareolwlokw2 = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer2.getDoubleValue());
                                }
                            }
                            if (getglobalpositionawareolwlokw != null && getglobalpositionawareolwlokw2 != null) {
                                if (!(getglobalpositionawareolwlokw instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations) {
                                        double d = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                        double d2 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                        getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                                        return getDrawOLwlOKw.write(d - d2);
                                    }
                                    if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    double d3 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                    double d4 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d3 - d4);
                                }
                                if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    double d5 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                    double d6 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations3 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d5 - d6);
                                }
                                long j = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                long j2 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                getDrawOLwlOKwannotations getdrawolwlokwannotations4 = getBringIntoViewOLwlOKw.read;
                                long j3 = j - j2;
                                boolean z2 = (j ^ j2) >= 0;
                                if ((j ^ j3) < 0) {
                                    z = false;
                                }
                                LazyKt__LazyJVMKt.write(j, j2, "checkedSubtract", z2 | z);
                                return getDrawOLwlOKw.RemoteActionCompatParcelizer(j3);
                            }
                            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object read(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            shouldHitTest shouldhittest = Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2);
                            boolean z = true;
                            if (getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[shouldhittest.ordinal()] != 1) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object serializer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            int i7 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            boolean z = true;
                            if (i7 != 1 && i7 != 2) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object write(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            return getDrawOLwlOKw.serializer(getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()] == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:532:0x0811 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:533:0x0816  */
                    /* JADX WARN: Code duplicated, block: B:539:0x0826 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:541:0x0833 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:542:0x0836 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code restructure failed: missing block: B:507:0x07b5, code lost:
                    
                        if (r8 < 0.0d) goto L508;
                     */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r12) {
                        /*
                            Method dump skipped, instruction units count: 2148
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1.invoke(java.lang.Object):java.lang.Object");
                    }
                };
            case 3:
                List list3 = (List) obj;
                list3.getClass();
                if (list3.size() != 2) {
                    getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list3.size()));
                    throw null;
                }
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list3.get(0);
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list3.get(1);
                return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1
                    private final Object IconCompatParcelizer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm5.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm6.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i7 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            if (i7 == -1 || i7 == 1) {
                                return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                            }
                            if (i7 != 2) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            List<Value> valuesList = valueIconCompatParcelizer2.getArrayValue().getValuesList();
                            valuesList.getClass();
                            if (valueIconCompatParcelizer == null) {
                                return getBringIntoViewOLwlOKw.write;
                            }
                            dispatch dispatchVar = Nodes.serializer;
                            for (Value value : valuesList) {
                                RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = Values$Enterprise.IconCompatParcelizer;
                                boolean zSerializer = NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(valueIconCompatParcelizer, value);
                                if (zSerializer) {
                                    return getBringIntoViewOLwlOKw.write;
                                }
                                if (zSerializer) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            return getBringIntoViewOLwlOKw.read;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object MediaDescriptionCompat(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm5.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm6.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            int i7 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            return getDrawOLwlOKw.serializer(i7 == 2 || i7 == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object RemoteActionCompatParcelizer(Object obj2) {
                        Object getglobalpositionawareolwlokw;
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm5.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm6.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Object getglobalpositionawareolwlokw2 = null;
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
                            int i7 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            boolean z = true;
                            if (i7 == -1 || i7 == 1) {
                                getglobalpositionawareolwlokw = null;
                            } else if (i7 == 5) {
                                getglobalpositionawareolwlokw = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer.getIntegerValue());
                            } else {
                                if (i7 != 6) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                getglobalpositionawareolwlokw = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer.getDoubleValue());
                            }
                            Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i8 = valueTypeCase2 == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase2.ordinal()];
                            if (i8 != -1 && i8 != 1) {
                                if (i8 == 5) {
                                    getglobalpositionawareolwlokw2 = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer2.getIntegerValue());
                                } else {
                                    if (i8 != 6) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    getglobalpositionawareolwlokw2 = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer2.getDoubleValue());
                                }
                            }
                            if (getglobalpositionawareolwlokw != null && getglobalpositionawareolwlokw2 != null) {
                                if (!(getglobalpositionawareolwlokw instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations) {
                                        double d = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                        double d2 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                        getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                                        return getDrawOLwlOKw.write(d - d2);
                                    }
                                    if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    double d3 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                    double d4 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d3 - d4);
                                }
                                if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    double d5 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                    double d6 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations3 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d5 - d6);
                                }
                                long j = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                long j2 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                getDrawOLwlOKwannotations getdrawolwlokwannotations4 = getBringIntoViewOLwlOKw.read;
                                long j3 = j - j2;
                                boolean z2 = (j ^ j2) >= 0;
                                if ((j ^ j3) < 0) {
                                    z = false;
                                }
                                LazyKt__LazyJVMKt.write(j, j2, "checkedSubtract", z2 | z);
                                return getDrawOLwlOKw.RemoteActionCompatParcelizer(j3);
                            }
                            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object read(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm5.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm6.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            shouldHitTest shouldhittest = Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2);
                            boolean z = true;
                            if (getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[shouldhittest.ordinal()] != 1) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object serializer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm5.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm6.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            int i7 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            boolean z = true;
                            if (i7 != 1 && i7 != 2) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object write(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm5.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm6.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            return getDrawOLwlOKw.serializer(getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()] == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:532:0x0811 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:533:0x0816  */
                    /* JADX WARN: Code duplicated, block: B:539:0x0826 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:541:0x0833 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:542:0x0836 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code restructure failed: missing block: B:507:0x07b5, code lost:
                    
                        if (r8 < 0.0d) goto L508;
                     */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r12) {
                        /*
                            Method dump skipped, instruction units count: 2148
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1.invoke(java.lang.Object):java.lang.Object");
                    }
                };
            case 4:
                List list4 = (List) obj;
                list4.getClass();
                if (list4.size() != 2) {
                    getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list4.size()));
                    throw null;
                }
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm7 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list4.get(0);
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm8 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list4.get(1);
                return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1
                    private final Object IconCompatParcelizer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm7.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm8.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i7 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            if (i7 == -1 || i7 == 1) {
                                return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                            }
                            if (i7 != 2) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            List<Value> valuesList = valueIconCompatParcelizer2.getArrayValue().getValuesList();
                            valuesList.getClass();
                            if (valueIconCompatParcelizer == null) {
                                return getBringIntoViewOLwlOKw.write;
                            }
                            dispatch dispatchVar = Nodes.serializer;
                            for (Value value : valuesList) {
                                RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = Values$Enterprise.IconCompatParcelizer;
                                boolean zSerializer = NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(valueIconCompatParcelizer, value);
                                if (zSerializer) {
                                    return getBringIntoViewOLwlOKw.write;
                                }
                                if (zSerializer) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            return getBringIntoViewOLwlOKw.read;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object MediaDescriptionCompat(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm7.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm8.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            int i7 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            return getDrawOLwlOKw.serializer(i7 == 2 || i7 == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object RemoteActionCompatParcelizer(Object obj2) {
                        Object getglobalpositionawareolwlokw;
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm7.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm8.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Object getglobalpositionawareolwlokw2 = null;
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
                            int i7 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            boolean z = true;
                            if (i7 == -1 || i7 == 1) {
                                getglobalpositionawareolwlokw = null;
                            } else if (i7 == 5) {
                                getglobalpositionawareolwlokw = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer.getIntegerValue());
                            } else {
                                if (i7 != 6) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                getglobalpositionawareolwlokw = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer.getDoubleValue());
                            }
                            Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i8 = valueTypeCase2 == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase2.ordinal()];
                            if (i8 != -1 && i8 != 1) {
                                if (i8 == 5) {
                                    getglobalpositionawareolwlokw2 = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer2.getIntegerValue());
                                } else {
                                    if (i8 != 6) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    getglobalpositionawareolwlokw2 = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer2.getDoubleValue());
                                }
                            }
                            if (getglobalpositionawareolwlokw != null && getglobalpositionawareolwlokw2 != null) {
                                if (!(getglobalpositionawareolwlokw instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations) {
                                        double d = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                        double d2 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                        getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                                        return getDrawOLwlOKw.write(d - d2);
                                    }
                                    if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    double d3 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                    double d4 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d3 - d4);
                                }
                                if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    double d5 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                    double d6 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations3 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d5 - d6);
                                }
                                long j = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                long j2 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                getDrawOLwlOKwannotations getdrawolwlokwannotations4 = getBringIntoViewOLwlOKw.read;
                                long j3 = j - j2;
                                boolean z2 = (j ^ j2) >= 0;
                                if ((j ^ j3) < 0) {
                                    z = false;
                                }
                                LazyKt__LazyJVMKt.write(j, j2, "checkedSubtract", z2 | z);
                                return getDrawOLwlOKw.RemoteActionCompatParcelizer(j3);
                            }
                            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object read(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm7.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm8.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            shouldHitTest shouldhittest = Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2);
                            boolean z = true;
                            if (getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[shouldhittest.ordinal()] != 1) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object serializer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm7.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm8.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            int i7 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            boolean z = true;
                            if (i7 != 1 && i7 != 2) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object write(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm7.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm8.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            return getDrawOLwlOKw.serializer(getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()] == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:532:0x0811 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:533:0x0816  */
                    /* JADX WARN: Code duplicated, block: B:539:0x0826 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:541:0x0833 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:542:0x0836 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code restructure failed: missing block: B:507:0x07b5, code lost:
                    
                        if (r8 < 0.0d) goto L508;
                     */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r12) {
                        /*
                            Method dump skipped, instruction units count: 2148
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1.invoke(java.lang.Object):java.lang.Object");
                    }
                };
            case 5:
                List list5 = (List) obj;
                list5.getClass();
                if (list5.size() != 2) {
                    getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list5.size()));
                    throw null;
                }
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm9 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list5.get(0);
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm10 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list5.get(1);
                return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1
                    private final Object IconCompatParcelizer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm9.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm10.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i7 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            if (i7 == -1 || i7 == 1) {
                                return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                            }
                            if (i7 != 2) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            List<Value> valuesList = valueIconCompatParcelizer2.getArrayValue().getValuesList();
                            valuesList.getClass();
                            if (valueIconCompatParcelizer == null) {
                                return getBringIntoViewOLwlOKw.write;
                            }
                            dispatch dispatchVar = Nodes.serializer;
                            for (Value value : valuesList) {
                                RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = Values$Enterprise.IconCompatParcelizer;
                                boolean zSerializer = NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(valueIconCompatParcelizer, value);
                                if (zSerializer) {
                                    return getBringIntoViewOLwlOKw.write;
                                }
                                if (zSerializer) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            return getBringIntoViewOLwlOKw.read;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object MediaDescriptionCompat(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm9.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm10.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            int i7 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            return getDrawOLwlOKw.serializer(i7 == 2 || i7 == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object RemoteActionCompatParcelizer(Object obj2) {
                        Object getglobalpositionawareolwlokw;
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm9.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm10.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Object getglobalpositionawareolwlokw2 = null;
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
                            int i7 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            boolean z = true;
                            if (i7 == -1 || i7 == 1) {
                                getglobalpositionawareolwlokw = null;
                            } else if (i7 == 5) {
                                getglobalpositionawareolwlokw = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer.getIntegerValue());
                            } else {
                                if (i7 != 6) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                getglobalpositionawareolwlokw = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer.getDoubleValue());
                            }
                            Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i8 = valueTypeCase2 == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase2.ordinal()];
                            if (i8 != -1 && i8 != 1) {
                                if (i8 == 5) {
                                    getglobalpositionawareolwlokw2 = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer2.getIntegerValue());
                                } else {
                                    if (i8 != 6) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    getglobalpositionawareolwlokw2 = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer2.getDoubleValue());
                                }
                            }
                            if (getglobalpositionawareolwlokw != null && getglobalpositionawareolwlokw2 != null) {
                                if (!(getglobalpositionawareolwlokw instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations) {
                                        double d = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                        double d2 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                        getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                                        return getDrawOLwlOKw.write(d - d2);
                                    }
                                    if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    double d3 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                    double d4 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d3 - d4);
                                }
                                if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    double d5 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                    double d6 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations3 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d5 - d6);
                                }
                                long j = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                long j2 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                getDrawOLwlOKwannotations getdrawolwlokwannotations4 = getBringIntoViewOLwlOKw.read;
                                long j3 = j - j2;
                                boolean z2 = (j ^ j2) >= 0;
                                if ((j ^ j3) < 0) {
                                    z = false;
                                }
                                LazyKt__LazyJVMKt.write(j, j2, "checkedSubtract", z2 | z);
                                return getDrawOLwlOKw.RemoteActionCompatParcelizer(j3);
                            }
                            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object read(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm9.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm10.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            shouldHitTest shouldhittest = Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2);
                            boolean z = true;
                            if (getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[shouldhittest.ordinal()] != 1) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object serializer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm9.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm10.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            int i7 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            boolean z = true;
                            if (i7 != 1 && i7 != 2) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object write(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm9.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm10.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            return getDrawOLwlOKw.serializer(getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()] == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:532:0x0811 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:533:0x0816  */
                    /* JADX WARN: Code duplicated, block: B:539:0x0826 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:541:0x0833 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:542:0x0836 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code restructure failed: missing block: B:507:0x07b5, code lost:
                    
                        if (r8 < 0.0d) goto L508;
                     */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r12) {
                        /*
                            Method dump skipped, instruction units count: 2148
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1.invoke(java.lang.Object):java.lang.Object");
                    }
                };
            case 6:
                List list6 = (List) obj;
                list6.getClass();
                if (list6.size() != 2) {
                    getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list6.size()));
                    throw null;
                }
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm11 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list6.get(0);
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm12 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list6.get(1);
                return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1
                    private final Object IconCompatParcelizer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm11.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm12.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i7 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            if (i7 == -1 || i7 == 1) {
                                return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                            }
                            if (i7 != 2) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            List<Value> valuesList = valueIconCompatParcelizer2.getArrayValue().getValuesList();
                            valuesList.getClass();
                            if (valueIconCompatParcelizer == null) {
                                return getBringIntoViewOLwlOKw.write;
                            }
                            dispatch dispatchVar = Nodes.serializer;
                            for (Value value : valuesList) {
                                RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = Values$Enterprise.IconCompatParcelizer;
                                boolean zSerializer = NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(valueIconCompatParcelizer, value);
                                if (zSerializer) {
                                    return getBringIntoViewOLwlOKw.write;
                                }
                                if (zSerializer) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            return getBringIntoViewOLwlOKw.read;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object MediaDescriptionCompat(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm11.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm12.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            int i7 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            return getDrawOLwlOKw.serializer(i7 == 2 || i7 == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object RemoteActionCompatParcelizer(Object obj2) {
                        Object getglobalpositionawareolwlokw;
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm11.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm12.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Object getglobalpositionawareolwlokw2 = null;
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
                            int i7 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            boolean z = true;
                            if (i7 == -1 || i7 == 1) {
                                getglobalpositionawareolwlokw = null;
                            } else if (i7 == 5) {
                                getglobalpositionawareolwlokw = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer.getIntegerValue());
                            } else {
                                if (i7 != 6) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                getglobalpositionawareolwlokw = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer.getDoubleValue());
                            }
                            Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i8 = valueTypeCase2 == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase2.ordinal()];
                            if (i8 != -1 && i8 != 1) {
                                if (i8 == 5) {
                                    getglobalpositionawareolwlokw2 = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer2.getIntegerValue());
                                } else {
                                    if (i8 != 6) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    getglobalpositionawareolwlokw2 = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer2.getDoubleValue());
                                }
                            }
                            if (getglobalpositionawareolwlokw != null && getglobalpositionawareolwlokw2 != null) {
                                if (!(getglobalpositionawareolwlokw instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations) {
                                        double d = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                        double d2 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                        getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                                        return getDrawOLwlOKw.write(d - d2);
                                    }
                                    if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    double d3 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                    double d4 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d3 - d4);
                                }
                                if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    double d5 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                    double d6 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations3 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d5 - d6);
                                }
                                long j = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                long j2 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                getDrawOLwlOKwannotations getdrawolwlokwannotations4 = getBringIntoViewOLwlOKw.read;
                                long j3 = j - j2;
                                boolean z2 = (j ^ j2) >= 0;
                                if ((j ^ j3) < 0) {
                                    z = false;
                                }
                                LazyKt__LazyJVMKt.write(j, j2, "checkedSubtract", z2 | z);
                                return getDrawOLwlOKw.RemoteActionCompatParcelizer(j3);
                            }
                            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object read(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm11.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm12.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            shouldHitTest shouldhittest = Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2);
                            boolean z = true;
                            if (getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[shouldhittest.ordinal()] != 1) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object serializer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm11.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm12.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            int i7 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            boolean z = true;
                            if (i7 != 1 && i7 != 2) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object write(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm11.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm12.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            return getDrawOLwlOKw.serializer(getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()] == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:532:0x0811 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:533:0x0816  */
                    /* JADX WARN: Code duplicated, block: B:539:0x0826 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:541:0x0833 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:542:0x0836 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code restructure failed: missing block: B:507:0x07b5, code lost:
                    
                        if (r8 < 0.0d) goto L508;
                     */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r12) {
                        /*
                            Method dump skipped, instruction units count: 2148
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1.invoke(java.lang.Object):java.lang.Object");
                    }
                };
            case 7:
                List list7 = (List) obj;
                list7.getClass();
                if (list7.size() == 2) {
                    return new getAnyOLwlOKwannotations(list7);
                }
                getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list7.size()));
                throw null;
            case 8:
                List list8 = (List) obj;
                list8.getClass();
                if (list8.size() == 2) {
                    return new getBeyondBoundsLayoutOLwlOKw(list8);
                }
                getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list8.size()));
                throw null;
            case 9:
                List list9 = (List) obj;
                list9.getClass();
                if (list9.size() != 2) {
                    getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list9.size()));
                    throw null;
                }
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm13 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list9.get(0);
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm14 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list9.get(1);
                final int i7 = 6;
                return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1
                    private final Object IconCompatParcelizer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm13.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i8 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            if (i8 == -1 || i8 == 1) {
                                return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                            }
                            if (i8 != 2) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            List<Value> valuesList = valueIconCompatParcelizer2.getArrayValue().getValuesList();
                            valuesList.getClass();
                            if (valueIconCompatParcelizer == null) {
                                return getBringIntoViewOLwlOKw.write;
                            }
                            dispatch dispatchVar = Nodes.serializer;
                            for (Value value : valuesList) {
                                RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = Values$Enterprise.IconCompatParcelizer;
                                boolean zSerializer = NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(valueIconCompatParcelizer, value);
                                if (zSerializer) {
                                    return getBringIntoViewOLwlOKw.write;
                                }
                                if (zSerializer) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            return getBringIntoViewOLwlOKw.read;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object MediaDescriptionCompat(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm13.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            int i8 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            return getDrawOLwlOKw.serializer(i8 == 2 || i8 == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object RemoteActionCompatParcelizer(Object obj2) {
                        Object getglobalpositionawareolwlokw;
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm13.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Object getglobalpositionawareolwlokw2 = null;
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
                            int i8 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            boolean z = true;
                            if (i8 == -1 || i8 == 1) {
                                getglobalpositionawareolwlokw = null;
                            } else if (i8 == 5) {
                                getglobalpositionawareolwlokw = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer.getIntegerValue());
                            } else {
                                if (i8 != 6) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                getglobalpositionawareolwlokw = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer.getDoubleValue());
                            }
                            Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i9 = valueTypeCase2 == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase2.ordinal()];
                            if (i9 != -1 && i9 != 1) {
                                if (i9 == 5) {
                                    getglobalpositionawareolwlokw2 = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer2.getIntegerValue());
                                } else {
                                    if (i9 != 6) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    getglobalpositionawareolwlokw2 = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer2.getDoubleValue());
                                }
                            }
                            if (getglobalpositionawareolwlokw != null && getglobalpositionawareolwlokw2 != null) {
                                if (!(getglobalpositionawareolwlokw instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations) {
                                        double d = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                        double d2 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                        getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                                        return getDrawOLwlOKw.write(d - d2);
                                    }
                                    if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    double d3 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                    double d4 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d3 - d4);
                                }
                                if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    double d5 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                    double d6 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations3 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d5 - d6);
                                }
                                long j = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                long j2 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                getDrawOLwlOKwannotations getdrawolwlokwannotations4 = getBringIntoViewOLwlOKw.read;
                                long j3 = j - j2;
                                boolean z2 = (j ^ j2) >= 0;
                                if ((j ^ j3) < 0) {
                                    z = false;
                                }
                                LazyKt__LazyJVMKt.write(j, j2, "checkedSubtract", z2 | z);
                                return getDrawOLwlOKw.RemoteActionCompatParcelizer(j3);
                            }
                            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object read(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm13.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            shouldHitTest shouldhittest = Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2);
                            boolean z = true;
                            if (getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[shouldhittest.ordinal()] != 1) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object serializer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm13.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            int i8 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            boolean z = true;
                            if (i8 != 1 && i8 != 2) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object write(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm13.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm14.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            return getDrawOLwlOKw.serializer(getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()] == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:532:0x0811 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:533:0x0816  */
                    /* JADX WARN: Code duplicated, block: B:539:0x0826 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:541:0x0833 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:542:0x0836 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code restructure failed: missing block: B:507:0x07b5, code lost:
                    
                        if (r8 < 0.0d) goto L508;
                     */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r12) {
                        /*
                            Method dump skipped, instruction units count: 2148
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1.invoke(java.lang.Object):java.lang.Object");
                    }
                };
            case 10:
                List list10 = (List) obj;
                list10.getClass();
                if (list10.size() != 2) {
                    getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list10.size()));
                    throw null;
                }
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm15 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list10.get(0);
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm16 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list10.get(1);
                final int i8 = 7;
                return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1
                    private final Object IconCompatParcelizer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm16.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i9 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            if (i9 == -1 || i9 == 1) {
                                return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                            }
                            if (i9 != 2) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            List<Value> valuesList = valueIconCompatParcelizer2.getArrayValue().getValuesList();
                            valuesList.getClass();
                            if (valueIconCompatParcelizer == null) {
                                return getBringIntoViewOLwlOKw.write;
                            }
                            dispatch dispatchVar = Nodes.serializer;
                            for (Value value : valuesList) {
                                RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = Values$Enterprise.IconCompatParcelizer;
                                boolean zSerializer = NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(valueIconCompatParcelizer, value);
                                if (zSerializer) {
                                    return getBringIntoViewOLwlOKw.write;
                                }
                                if (zSerializer) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            return getBringIntoViewOLwlOKw.read;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object MediaDescriptionCompat(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm16.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            int i9 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            return getDrawOLwlOKw.serializer(i9 == 2 || i9 == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object RemoteActionCompatParcelizer(Object obj2) {
                        Object getglobalpositionawareolwlokw;
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm16.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Object getglobalpositionawareolwlokw2 = null;
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
                            int i9 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            boolean z = true;
                            if (i9 == -1 || i9 == 1) {
                                getglobalpositionawareolwlokw = null;
                            } else if (i9 == 5) {
                                getglobalpositionawareolwlokw = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer.getIntegerValue());
                            } else {
                                if (i9 != 6) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                getglobalpositionawareolwlokw = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer.getDoubleValue());
                            }
                            Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i10 = valueTypeCase2 == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase2.ordinal()];
                            if (i10 != -1 && i10 != 1) {
                                if (i10 == 5) {
                                    getglobalpositionawareolwlokw2 = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer2.getIntegerValue());
                                } else {
                                    if (i10 != 6) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    getglobalpositionawareolwlokw2 = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer2.getDoubleValue());
                                }
                            }
                            if (getglobalpositionawareolwlokw != null && getglobalpositionawareolwlokw2 != null) {
                                if (!(getglobalpositionawareolwlokw instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations) {
                                        double d = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                        double d2 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                        getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                                        return getDrawOLwlOKw.write(d - d2);
                                    }
                                    if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    double d3 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                    double d4 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d3 - d4);
                                }
                                if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    double d5 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                    double d6 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations3 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d5 - d6);
                                }
                                long j = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                long j2 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                getDrawOLwlOKwannotations getdrawolwlokwannotations4 = getBringIntoViewOLwlOKw.read;
                                long j3 = j - j2;
                                boolean z2 = (j ^ j2) >= 0;
                                if ((j ^ j3) < 0) {
                                    z = false;
                                }
                                LazyKt__LazyJVMKt.write(j, j2, "checkedSubtract", z2 | z);
                                return getDrawOLwlOKw.RemoteActionCompatParcelizer(j3);
                            }
                            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object read(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm16.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            shouldHitTest shouldhittest = Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2);
                            boolean z = true;
                            if (getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[shouldhittest.ordinal()] != 1) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object serializer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm16.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            int i9 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            boolean z = true;
                            if (i9 != 1 && i9 != 2) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object write(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm15.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm16.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            return getDrawOLwlOKw.serializer(getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()] == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:532:0x0811 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:533:0x0816  */
                    /* JADX WARN: Code duplicated, block: B:539:0x0826 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:541:0x0833 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:542:0x0836 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code restructure failed: missing block: B:507:0x07b5, code lost:
                    
                        if (r8 < 0.0d) goto L508;
                     */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r12) {
                        /*
                            Method dump skipped, instruction units count: 2148
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1.invoke(java.lang.Object):java.lang.Object");
                    }
                };
            case 11:
                List list11 = (List) obj;
                list11.getClass();
                if (list11.size() != 2) {
                    getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list11.size()));
                    throw null;
                }
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm17 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list11.get(0);
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm18 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list11.get(1);
                final int i9 = 8;
                return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1
                    private final Object IconCompatParcelizer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm17.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm18.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i10 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            if (i10 == -1 || i10 == 1) {
                                return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                            }
                            if (i10 != 2) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            List<Value> valuesList = valueIconCompatParcelizer2.getArrayValue().getValuesList();
                            valuesList.getClass();
                            if (valueIconCompatParcelizer == null) {
                                return getBringIntoViewOLwlOKw.write;
                            }
                            dispatch dispatchVar = Nodes.serializer;
                            for (Value value : valuesList) {
                                RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = Values$Enterprise.IconCompatParcelizer;
                                boolean zSerializer = NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(valueIconCompatParcelizer, value);
                                if (zSerializer) {
                                    return getBringIntoViewOLwlOKw.write;
                                }
                                if (zSerializer) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            return getBringIntoViewOLwlOKw.read;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object MediaDescriptionCompat(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm17.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm18.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            int i10 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            return getDrawOLwlOKw.serializer(i10 == 2 || i10 == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object RemoteActionCompatParcelizer(Object obj2) {
                        Object getglobalpositionawareolwlokw;
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm17.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm18.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Object getglobalpositionawareolwlokw2 = null;
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
                            int i10 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            boolean z = true;
                            if (i10 == -1 || i10 == 1) {
                                getglobalpositionawareolwlokw = null;
                            } else if (i10 == 5) {
                                getglobalpositionawareolwlokw = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer.getIntegerValue());
                            } else {
                                if (i10 != 6) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                getglobalpositionawareolwlokw = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer.getDoubleValue());
                            }
                            Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i11 = valueTypeCase2 == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase2.ordinal()];
                            if (i11 != -1 && i11 != 1) {
                                if (i11 == 5) {
                                    getglobalpositionawareolwlokw2 = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer2.getIntegerValue());
                                } else {
                                    if (i11 != 6) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    getglobalpositionawareolwlokw2 = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer2.getDoubleValue());
                                }
                            }
                            if (getglobalpositionawareolwlokw != null && getglobalpositionawareolwlokw2 != null) {
                                if (!(getglobalpositionawareolwlokw instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations) {
                                        double d = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                        double d2 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                        getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                                        return getDrawOLwlOKw.write(d - d2);
                                    }
                                    if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    double d3 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                    double d4 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d3 - d4);
                                }
                                if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    double d5 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                    double d6 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations3 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d5 - d6);
                                }
                                long j = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                long j2 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                getDrawOLwlOKwannotations getdrawolwlokwannotations4 = getBringIntoViewOLwlOKw.read;
                                long j3 = j - j2;
                                boolean z2 = (j ^ j2) >= 0;
                                if ((j ^ j3) < 0) {
                                    z = false;
                                }
                                LazyKt__LazyJVMKt.write(j, j2, "checkedSubtract", z2 | z);
                                return getDrawOLwlOKw.RemoteActionCompatParcelizer(j3);
                            }
                            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object read(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm17.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm18.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            shouldHitTest shouldhittest = Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2);
                            boolean z = true;
                            if (getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[shouldhittest.ordinal()] != 1) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object serializer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm17.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm18.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            int i10 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            boolean z = true;
                            if (i10 != 1 && i10 != 2) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object write(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm17.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm18.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            return getDrawOLwlOKw.serializer(getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()] == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:532:0x0811 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:533:0x0816  */
                    /* JADX WARN: Code duplicated, block: B:539:0x0826 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:541:0x0833 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:542:0x0836 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code restructure failed: missing block: B:507:0x07b5, code lost:
                    
                        if (r8 < 0.0d) goto L508;
                     */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r12) {
                        /*
                            Method dump skipped, instruction units count: 2148
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1.invoke(java.lang.Object):java.lang.Object");
                    }
                };
            case 12:
                List list12 = (List) obj;
                list12.getClass();
                if (list12.size() == 1) {
                    return new MonotonicFrameClockKt$withFrameMillis$2((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list12.get(0), i5);
                }
                getRectManager.write("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list12.size()));
                throw null;
            case 13:
                List list13 = (List) obj;
                list13.getClass();
                getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                return new getGlobalPositionAwareOLwlOKwannotations(list13);
            case 14:
                List list14 = (List) obj;
                list14.getClass();
                if (list14.size() != 2) {
                    getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list14.size()));
                    throw null;
                }
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm19 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list14.get(0);
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm20 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list14.get(1);
                final int i10 = 9;
                return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1
                    private final Object IconCompatParcelizer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm19.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm20.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i11 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            if (i11 == -1 || i11 == 1) {
                                return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                            }
                            if (i11 != 2) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            List<Value> valuesList = valueIconCompatParcelizer2.getArrayValue().getValuesList();
                            valuesList.getClass();
                            if (valueIconCompatParcelizer == null) {
                                return getBringIntoViewOLwlOKw.write;
                            }
                            dispatch dispatchVar = Nodes.serializer;
                            for (Value value : valuesList) {
                                RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = Values$Enterprise.IconCompatParcelizer;
                                boolean zSerializer = NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(valueIconCompatParcelizer, value);
                                if (zSerializer) {
                                    return getBringIntoViewOLwlOKw.write;
                                }
                                if (zSerializer) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            return getBringIntoViewOLwlOKw.read;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object MediaDescriptionCompat(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm19.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm20.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            int i11 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            return getDrawOLwlOKw.serializer(i11 == 2 || i11 == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object RemoteActionCompatParcelizer(Object obj2) {
                        Object getglobalpositionawareolwlokw;
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm19.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm20.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Object getglobalpositionawareolwlokw2 = null;
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
                            int i11 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            boolean z = true;
                            if (i11 == -1 || i11 == 1) {
                                getglobalpositionawareolwlokw = null;
                            } else if (i11 == 5) {
                                getglobalpositionawareolwlokw = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer.getIntegerValue());
                            } else {
                                if (i11 != 6) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                getglobalpositionawareolwlokw = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer.getDoubleValue());
                            }
                            Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i12 = valueTypeCase2 == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase2.ordinal()];
                            if (i12 != -1 && i12 != 1) {
                                if (i12 == 5) {
                                    getglobalpositionawareolwlokw2 = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer2.getIntegerValue());
                                } else {
                                    if (i12 != 6) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    getglobalpositionawareolwlokw2 = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer2.getDoubleValue());
                                }
                            }
                            if (getglobalpositionawareolwlokw != null && getglobalpositionawareolwlokw2 != null) {
                                if (!(getglobalpositionawareolwlokw instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations) {
                                        double d = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                        double d2 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                        getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                                        return getDrawOLwlOKw.write(d - d2);
                                    }
                                    if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    double d3 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                    double d4 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations3 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d3 - d4);
                                }
                                if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    double d5 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                    double d6 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations4 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d5 - d6);
                                }
                                long j = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                long j2 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                getDrawOLwlOKwannotations getdrawolwlokwannotations5 = getBringIntoViewOLwlOKw.read;
                                long j3 = j - j2;
                                boolean z2 = (j ^ j2) >= 0;
                                if ((j ^ j3) < 0) {
                                    z = false;
                                }
                                LazyKt__LazyJVMKt.write(j, j2, "checkedSubtract", z2 | z);
                                return getDrawOLwlOKw.RemoteActionCompatParcelizer(j3);
                            }
                            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object read(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm19.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm20.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            shouldHitTest shouldhittest = Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2);
                            boolean z = true;
                            if (getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[shouldhittest.ordinal()] != 1) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object serializer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm19.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm20.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            int i11 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            boolean z = true;
                            if (i11 != 1 && i11 != 2) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object write(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm19.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm20.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            return getDrawOLwlOKw.serializer(getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()] == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:532:0x0811 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:533:0x0816  */
                    /* JADX WARN: Code duplicated, block: B:539:0x0826 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:541:0x0833 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:542:0x0836 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code restructure failed: missing block: B:507:0x07b5, code lost:
                    
                        if (r8 < 0.0d) goto L508;
                     */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r12) {
                        /*
                            Method dump skipped, instruction units count: 2148
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1.invoke(java.lang.Object):java.lang.Object");
                    }
                };
            case 15:
                List list15 = (List) obj;
                list15.getClass();
                if (list15.size() != 2) {
                    getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list15.size()));
                    throw null;
                }
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm21 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list15.get(0);
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm22 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list15.get(1);
                final int i11 = 10;
                return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1
                    private final Object IconCompatParcelizer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm21.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm22.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i12 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            if (i12 == -1 || i12 == 1) {
                                return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                            }
                            if (i12 != 2) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            List<Value> valuesList = valueIconCompatParcelizer2.getArrayValue().getValuesList();
                            valuesList.getClass();
                            if (valueIconCompatParcelizer == null) {
                                return getBringIntoViewOLwlOKw.write;
                            }
                            dispatch dispatchVar = Nodes.serializer;
                            for (Value value : valuesList) {
                                RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = Values$Enterprise.IconCompatParcelizer;
                                boolean zSerializer = NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(valueIconCompatParcelizer, value);
                                if (zSerializer) {
                                    return getBringIntoViewOLwlOKw.write;
                                }
                                if (zSerializer) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            return getBringIntoViewOLwlOKw.read;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object MediaDescriptionCompat(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm21.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm22.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            int i12 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            return getDrawOLwlOKw.serializer(i12 == 2 || i12 == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object RemoteActionCompatParcelizer(Object obj2) {
                        Object getglobalpositionawareolwlokw;
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm21.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm22.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Object getglobalpositionawareolwlokw2 = null;
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
                            int i12 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            boolean z = true;
                            if (i12 == -1 || i12 == 1) {
                                getglobalpositionawareolwlokw = null;
                            } else if (i12 == 5) {
                                getglobalpositionawareolwlokw = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer.getIntegerValue());
                            } else {
                                if (i12 != 6) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                getglobalpositionawareolwlokw = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer.getDoubleValue());
                            }
                            Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i13 = valueTypeCase2 == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase2.ordinal()];
                            if (i13 != -1 && i13 != 1) {
                                if (i13 == 5) {
                                    getglobalpositionawareolwlokw2 = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer2.getIntegerValue());
                                } else {
                                    if (i13 != 6) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    getglobalpositionawareolwlokw2 = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer2.getDoubleValue());
                                }
                            }
                            if (getglobalpositionawareolwlokw != null && getglobalpositionawareolwlokw2 != null) {
                                if (!(getglobalpositionawareolwlokw instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations) {
                                        double d = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                        double d2 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                        getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                                        return getDrawOLwlOKw.write(d - d2);
                                    }
                                    if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    double d3 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                    double d4 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations3 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d3 - d4);
                                }
                                if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    double d5 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                    double d6 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations4 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d5 - d6);
                                }
                                long j = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                long j2 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                getDrawOLwlOKwannotations getdrawolwlokwannotations5 = getBringIntoViewOLwlOKw.read;
                                long j3 = j - j2;
                                boolean z2 = (j ^ j2) >= 0;
                                if ((j ^ j3) < 0) {
                                    z = false;
                                }
                                LazyKt__LazyJVMKt.write(j, j2, "checkedSubtract", z2 | z);
                                return getDrawOLwlOKw.RemoteActionCompatParcelizer(j3);
                            }
                            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object read(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm21.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm22.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            shouldHitTest shouldhittest = Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2);
                            boolean z = true;
                            if (getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[shouldhittest.ordinal()] != 1) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object serializer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm21.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm22.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            int i12 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            boolean z = true;
                            if (i12 != 1 && i12 != 2) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object write(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm21.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm22.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            return getDrawOLwlOKw.serializer(getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()] == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:532:0x0811 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:533:0x0816  */
                    /* JADX WARN: Code duplicated, block: B:539:0x0826 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:541:0x0833 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:542:0x0836 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code restructure failed: missing block: B:507:0x07b5, code lost:
                    
                        if (r8 < 0.0d) goto L508;
                     */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r12) {
                        /*
                            Method dump skipped, instruction units count: 2148
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1.invoke(java.lang.Object):java.lang.Object");
                    }
                };
            case 16:
                List list16 = (List) obj;
                list16.getClass();
                if (list16.size() != 2) {
                    getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list16.size()));
                    throw null;
                }
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm23 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list16.get(0);
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm24 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list16.get(1);
                final int i12 = 11;
                return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1
                    private final Object IconCompatParcelizer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm23.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm24.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i13 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            if (i13 == -1 || i13 == 1) {
                                return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                            }
                            if (i13 != 2) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            List<Value> valuesList = valueIconCompatParcelizer2.getArrayValue().getValuesList();
                            valuesList.getClass();
                            if (valueIconCompatParcelizer == null) {
                                return getBringIntoViewOLwlOKw.write;
                            }
                            dispatch dispatchVar = Nodes.serializer;
                            for (Value value : valuesList) {
                                RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = Values$Enterprise.IconCompatParcelizer;
                                boolean zSerializer = NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(valueIconCompatParcelizer, value);
                                if (zSerializer) {
                                    return getBringIntoViewOLwlOKw.write;
                                }
                                if (zSerializer) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            return getBringIntoViewOLwlOKw.read;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object MediaDescriptionCompat(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm23.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm24.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            int i13 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            return getDrawOLwlOKw.serializer(i13 == 2 || i13 == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object RemoteActionCompatParcelizer(Object obj2) {
                        Object getglobalpositionawareolwlokw;
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm23.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm24.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Object getglobalpositionawareolwlokw2 = null;
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
                            int i13 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            boolean z = true;
                            if (i13 == -1 || i13 == 1) {
                                getglobalpositionawareolwlokw = null;
                            } else if (i13 == 5) {
                                getglobalpositionawareolwlokw = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer.getIntegerValue());
                            } else {
                                if (i13 != 6) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                getglobalpositionawareolwlokw = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer.getDoubleValue());
                            }
                            Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i14 = valueTypeCase2 == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase2.ordinal()];
                            if (i14 != -1 && i14 != 1) {
                                if (i14 == 5) {
                                    getglobalpositionawareolwlokw2 = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer2.getIntegerValue());
                                } else {
                                    if (i14 != 6) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    getglobalpositionawareolwlokw2 = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer2.getDoubleValue());
                                }
                            }
                            if (getglobalpositionawareolwlokw != null && getglobalpositionawareolwlokw2 != null) {
                                if (!(getglobalpositionawareolwlokw instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations) {
                                        double d = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                        double d2 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                        getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                                        return getDrawOLwlOKw.write(d - d2);
                                    }
                                    if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    double d3 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                    double d4 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations3 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d3 - d4);
                                }
                                if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    double d5 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                    double d6 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations4 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d5 - d6);
                                }
                                long j = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                long j2 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                getDrawOLwlOKwannotations getdrawolwlokwannotations5 = getBringIntoViewOLwlOKw.read;
                                long j3 = j - j2;
                                boolean z2 = (j ^ j2) >= 0;
                                if ((j ^ j3) < 0) {
                                    z = false;
                                }
                                LazyKt__LazyJVMKt.write(j, j2, "checkedSubtract", z2 | z);
                                return getDrawOLwlOKw.RemoteActionCompatParcelizer(j3);
                            }
                            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object read(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm23.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm24.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            shouldHitTest shouldhittest = Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2);
                            boolean z = true;
                            if (getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[shouldhittest.ordinal()] != 1) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object serializer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm23.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm24.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            int i13 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            boolean z = true;
                            if (i13 != 1 && i13 != 2) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object write(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm23.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm24.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            return getDrawOLwlOKw.serializer(getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()] == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:532:0x0811 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:533:0x0816  */
                    /* JADX WARN: Code duplicated, block: B:539:0x0826 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:541:0x0833 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:542:0x0836 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code restructure failed: missing block: B:507:0x07b5, code lost:
                    
                        if (r8 < 0.0d) goto L508;
                     */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r12) {
                        /*
                            Method dump skipped, instruction units count: 2148
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1.invoke(java.lang.Object):java.lang.Object");
                    }
                };
            case 17:
                List list17 = (List) obj;
                list17.getClass();
                if (list17.size() != 2) {
                    getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list17.size()));
                    throw null;
                }
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm25 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list17.get(0);
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm26 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list17.get(1);
                final int i13 = 12;
                return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1
                    private final Object IconCompatParcelizer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm25.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm26.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i14 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            if (i14 == -1 || i14 == 1) {
                                return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                            }
                            if (i14 != 2) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            List<Value> valuesList = valueIconCompatParcelizer2.getArrayValue().getValuesList();
                            valuesList.getClass();
                            if (valueIconCompatParcelizer == null) {
                                return getBringIntoViewOLwlOKw.write;
                            }
                            dispatch dispatchVar = Nodes.serializer;
                            for (Value value : valuesList) {
                                RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = Values$Enterprise.IconCompatParcelizer;
                                boolean zSerializer = NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(valueIconCompatParcelizer, value);
                                if (zSerializer) {
                                    return getBringIntoViewOLwlOKw.write;
                                }
                                if (zSerializer) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            return getBringIntoViewOLwlOKw.read;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object MediaDescriptionCompat(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm25.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm26.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            int i14 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            return getDrawOLwlOKw.serializer(i14 == 2 || i14 == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object RemoteActionCompatParcelizer(Object obj2) {
                        Object getglobalpositionawareolwlokw;
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm25.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm26.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Object getglobalpositionawareolwlokw2 = null;
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
                            int i14 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            boolean z = true;
                            if (i14 == -1 || i14 == 1) {
                                getglobalpositionawareolwlokw = null;
                            } else if (i14 == 5) {
                                getglobalpositionawareolwlokw = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer.getIntegerValue());
                            } else {
                                if (i14 != 6) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                getglobalpositionawareolwlokw = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer.getDoubleValue());
                            }
                            Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i15 = valueTypeCase2 == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase2.ordinal()];
                            if (i15 != -1 && i15 != 1) {
                                if (i15 == 5) {
                                    getglobalpositionawareolwlokw2 = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer2.getIntegerValue());
                                } else {
                                    if (i15 != 6) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    getglobalpositionawareolwlokw2 = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer2.getDoubleValue());
                                }
                            }
                            if (getglobalpositionawareolwlokw != null && getglobalpositionawareolwlokw2 != null) {
                                if (!(getglobalpositionawareolwlokw instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations) {
                                        double d = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                        double d2 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                        getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                                        return getDrawOLwlOKw.write(d - d2);
                                    }
                                    if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    double d3 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                    double d4 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations3 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d3 - d4);
                                }
                                if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    double d5 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                    double d6 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations4 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d5 - d6);
                                }
                                long j = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                long j2 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                getDrawOLwlOKwannotations getdrawolwlokwannotations5 = getBringIntoViewOLwlOKw.read;
                                long j3 = j - j2;
                                boolean z2 = (j ^ j2) >= 0;
                                if ((j ^ j3) < 0) {
                                    z = false;
                                }
                                LazyKt__LazyJVMKt.write(j, j2, "checkedSubtract", z2 | z);
                                return getDrawOLwlOKw.RemoteActionCompatParcelizer(j3);
                            }
                            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object read(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm25.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm26.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            shouldHitTest shouldhittest = Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2);
                            boolean z = true;
                            if (getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[shouldhittest.ordinal()] != 1) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object serializer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm25.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm26.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            int i14 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            boolean z = true;
                            if (i14 != 1 && i14 != 2) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object write(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm25.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm26.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            return getDrawOLwlOKw.serializer(getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()] == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:532:0x0811 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:533:0x0816  */
                    /* JADX WARN: Code duplicated, block: B:539:0x0826 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:541:0x0833 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:542:0x0836 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code restructure failed: missing block: B:507:0x07b5, code lost:
                    
                        if (r8 < 0.0d) goto L508;
                     */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r12) {
                        /*
                            Method dump skipped, instruction units count: 2148
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1.invoke(java.lang.Object):java.lang.Object");
                    }
                };
            case 18:
                List list18 = (List) obj;
                list18.getClass();
                if (list18.size() != 2) {
                    getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list18.size()));
                    throw null;
                }
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm27 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list18.get(0);
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm28 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list18.get(1);
                final int i14 = 13;
                return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1
                    private final Object IconCompatParcelizer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm27.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm28.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i15 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            if (i15 == -1 || i15 == 1) {
                                return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                            }
                            if (i15 != 2) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            List<Value> valuesList = valueIconCompatParcelizer2.getArrayValue().getValuesList();
                            valuesList.getClass();
                            if (valueIconCompatParcelizer == null) {
                                return getBringIntoViewOLwlOKw.write;
                            }
                            dispatch dispatchVar = Nodes.serializer;
                            for (Value value : valuesList) {
                                RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = Values$Enterprise.IconCompatParcelizer;
                                boolean zSerializer = NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(valueIconCompatParcelizer, value);
                                if (zSerializer) {
                                    return getBringIntoViewOLwlOKw.write;
                                }
                                if (zSerializer) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            return getBringIntoViewOLwlOKw.read;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object MediaDescriptionCompat(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm27.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm28.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            int i15 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            return getDrawOLwlOKw.serializer(i15 == 2 || i15 == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object RemoteActionCompatParcelizer(Object obj2) {
                        Object getglobalpositionawareolwlokw;
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm27.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm28.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Object getglobalpositionawareolwlokw2 = null;
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
                            int i15 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            boolean z = true;
                            if (i15 == -1 || i15 == 1) {
                                getglobalpositionawareolwlokw = null;
                            } else if (i15 == 5) {
                                getglobalpositionawareolwlokw = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer.getIntegerValue());
                            } else {
                                if (i15 != 6) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                getglobalpositionawareolwlokw = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer.getDoubleValue());
                            }
                            Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i16 = valueTypeCase2 == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase2.ordinal()];
                            if (i16 != -1 && i16 != 1) {
                                if (i16 == 5) {
                                    getglobalpositionawareolwlokw2 = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer2.getIntegerValue());
                                } else {
                                    if (i16 != 6) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    getglobalpositionawareolwlokw2 = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer2.getDoubleValue());
                                }
                            }
                            if (getglobalpositionawareolwlokw != null && getglobalpositionawareolwlokw2 != null) {
                                if (!(getglobalpositionawareolwlokw instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations) {
                                        double d = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                        double d2 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                        getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                                        return getDrawOLwlOKw.write(d - d2);
                                    }
                                    if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    double d3 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                    double d4 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations3 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d3 - d4);
                                }
                                if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    double d5 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                    double d6 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations4 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d5 - d6);
                                }
                                long j = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                long j2 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                getDrawOLwlOKwannotations getdrawolwlokwannotations5 = getBringIntoViewOLwlOKw.read;
                                long j3 = j - j2;
                                boolean z2 = (j ^ j2) >= 0;
                                if ((j ^ j3) < 0) {
                                    z = false;
                                }
                                LazyKt__LazyJVMKt.write(j, j2, "checkedSubtract", z2 | z);
                                return getDrawOLwlOKw.RemoteActionCompatParcelizer(j3);
                            }
                            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object read(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm27.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm28.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            shouldHitTest shouldhittest = Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2);
                            boolean z = true;
                            if (getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[shouldhittest.ordinal()] != 1) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object serializer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm27.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm28.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            int i15 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            boolean z = true;
                            if (i15 != 1 && i15 != 2) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object write(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm27.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm28.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            return getDrawOLwlOKw.serializer(getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()] == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:532:0x0811 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:533:0x0816  */
                    /* JADX WARN: Code duplicated, block: B:539:0x0826 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:541:0x0833 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:542:0x0836 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code restructure failed: missing block: B:507:0x07b5, code lost:
                    
                        if (r8 < 0.0d) goto L508;
                     */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r12) {
                        /*
                            Method dump skipped, instruction units count: 2148
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1.invoke(java.lang.Object):java.lang.Object");
                    }
                };
            case 19:
                List list19 = (List) obj;
                list19.getClass();
                if (list19.size() != 2) {
                    getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list19.size()));
                    throw null;
                }
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm29 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list19.get(0);
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm30 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list19.get(1);
                final int i15 = 14;
                return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1
                    private final Object IconCompatParcelizer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm29.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm30.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i16 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            if (i16 == -1 || i16 == 1) {
                                return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                            }
                            if (i16 != 2) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            List<Value> valuesList = valueIconCompatParcelizer2.getArrayValue().getValuesList();
                            valuesList.getClass();
                            if (valueIconCompatParcelizer == null) {
                                return getBringIntoViewOLwlOKw.write;
                            }
                            dispatch dispatchVar = Nodes.serializer;
                            for (Value value : valuesList) {
                                RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = Values$Enterprise.IconCompatParcelizer;
                                boolean zSerializer = NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(valueIconCompatParcelizer, value);
                                if (zSerializer) {
                                    return getBringIntoViewOLwlOKw.write;
                                }
                                if (zSerializer) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            return getBringIntoViewOLwlOKw.read;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object MediaDescriptionCompat(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm29.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm30.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            int i16 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            return getDrawOLwlOKw.serializer(i16 == 2 || i16 == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object RemoteActionCompatParcelizer(Object obj2) {
                        Object getglobalpositionawareolwlokw;
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm29.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm30.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Object getglobalpositionawareolwlokw2 = null;
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
                            int i16 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            boolean z = true;
                            if (i16 == -1 || i16 == 1) {
                                getglobalpositionawareolwlokw = null;
                            } else if (i16 == 5) {
                                getglobalpositionawareolwlokw = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer.getIntegerValue());
                            } else {
                                if (i16 != 6) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                getglobalpositionawareolwlokw = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer.getDoubleValue());
                            }
                            Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i17 = valueTypeCase2 == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase2.ordinal()];
                            if (i17 != -1 && i17 != 1) {
                                if (i17 == 5) {
                                    getglobalpositionawareolwlokw2 = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer2.getIntegerValue());
                                } else {
                                    if (i17 != 6) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    getglobalpositionawareolwlokw2 = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer2.getDoubleValue());
                                }
                            }
                            if (getglobalpositionawareolwlokw != null && getglobalpositionawareolwlokw2 != null) {
                                if (!(getglobalpositionawareolwlokw instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations) {
                                        double d = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                        double d2 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                        getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                                        return getDrawOLwlOKw.write(d - d2);
                                    }
                                    if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    double d3 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                    double d4 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations3 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d3 - d4);
                                }
                                if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    double d5 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                    double d6 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations4 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d5 - d6);
                                }
                                long j = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                long j2 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                getDrawOLwlOKwannotations getdrawolwlokwannotations5 = getBringIntoViewOLwlOKw.read;
                                long j3 = j - j2;
                                boolean z2 = (j ^ j2) >= 0;
                                if ((j ^ j3) < 0) {
                                    z = false;
                                }
                                LazyKt__LazyJVMKt.write(j, j2, "checkedSubtract", z2 | z);
                                return getDrawOLwlOKw.RemoteActionCompatParcelizer(j3);
                            }
                            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object read(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm29.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm30.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            shouldHitTest shouldhittest = Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2);
                            boolean z = true;
                            if (getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[shouldhittest.ordinal()] != 1) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object serializer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm29.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm30.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            int i16 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            boolean z = true;
                            if (i16 != 1 && i16 != 2) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object write(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm29.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm30.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            return getDrawOLwlOKw.serializer(getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()] == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:532:0x0811 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:533:0x0816  */
                    /* JADX WARN: Code duplicated, block: B:539:0x0826 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:541:0x0833 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:542:0x0836 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code restructure failed: missing block: B:507:0x07b5, code lost:
                    
                        if (r8 < 0.0d) goto L508;
                     */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r12) {
                        /*
                            Method dump skipped, instruction units count: 2148
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1.invoke(java.lang.Object):java.lang.Object");
                    }
                };
            case 20:
                List list20 = (List) obj;
                list20.getClass();
                if (list20.size() == 1) {
                    return new MonotonicFrameClockKt$withFrameMillis$2((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list20.get(0), i4);
                }
                getRectManager.write("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list20.size()));
                throw null;
            case 21:
                List list21 = (List) obj;
                list21.getClass();
                if (list21.size() == 1) {
                    return new MonotonicFrameClockKt$withFrameMillis$2((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list21.get(0), i3);
                }
                getRectManager.write("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list21.size()));
                throw null;
            case 22:
                List list22 = (List) obj;
                list22.getClass();
                if (list22.size() == 3) {
                    return new getSoftKeyboardKeyInputOLwlOKwannotations((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list22.get(0), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list22.get(1), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list22.get(2), i5);
                }
                getRectManager.write("Function should have exactly 3 params, but %d were given.", Integer.valueOf(list22.size()));
                throw null;
            case 23:
                List list23 = (List) obj;
                list23.getClass();
                return new getFocusTargetOLwlOKw(list23);
            case 24:
                List list24 = (List) obj;
                list24.getClass();
                return new getGlobalPositionAwareOLwlOKwannotations(list24, i6);
            case 25:
                List list25 = (List) obj;
                list25.getClass();
                return new getGlobalPositionAwareOLwlOKwannotations(list25, i4);
            case 26:
                List list26 = (List) obj;
                list26.getClass();
                if (list26.size() != 2) {
                    getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list26.size()));
                    throw null;
                }
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm31 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list26.get(0);
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm32 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list26.get(1);
                final int i16 = 15;
                return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1
                    private final Object IconCompatParcelizer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm31.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm32.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i17 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            if (i17 == -1 || i17 == 1) {
                                return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                            }
                            if (i17 != 2) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            List<Value> valuesList = valueIconCompatParcelizer2.getArrayValue().getValuesList();
                            valuesList.getClass();
                            if (valueIconCompatParcelizer == null) {
                                return getBringIntoViewOLwlOKw.write;
                            }
                            dispatch dispatchVar = Nodes.serializer;
                            for (Value value : valuesList) {
                                RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = Values$Enterprise.IconCompatParcelizer;
                                boolean zSerializer = NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(valueIconCompatParcelizer, value);
                                if (zSerializer) {
                                    return getBringIntoViewOLwlOKw.write;
                                }
                                if (zSerializer) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            return getBringIntoViewOLwlOKw.read;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object MediaDescriptionCompat(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm31.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm32.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            int i17 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            return getDrawOLwlOKw.serializer(i17 == 2 || i17 == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object RemoteActionCompatParcelizer(Object obj2) {
                        Object getglobalpositionawareolwlokw;
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm31.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm32.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Object getglobalpositionawareolwlokw2 = null;
                            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
                            int i17 = valueTypeCase == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase.ordinal()];
                            boolean z = true;
                            if (i17 == -1 || i17 == 1) {
                                getglobalpositionawareolwlokw = null;
                            } else if (i17 == 5) {
                                getglobalpositionawareolwlokw = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer.getIntegerValue());
                            } else {
                                if (i17 != 6) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                getglobalpositionawareolwlokw = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer.getDoubleValue());
                            }
                            Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
                            int i18 = valueTypeCase2 == null ? -1 : OnPositionedDispatcher.IconCompatParcelizer[valueTypeCase2.ordinal()];
                            if (i18 != -1 && i18 != 1) {
                                if (i18 == 5) {
                                    getglobalpositionawareolwlokw2 = new getGlobalPositionAwareOLwlOKw(valueIconCompatParcelizer2.getIntegerValue());
                                } else {
                                    if (i18 != 6) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    getglobalpositionawareolwlokw2 = new getCompositionLocalConsumerOLwlOKwannotations(valueIconCompatParcelizer2.getDoubleValue());
                                }
                            }
                            if (getglobalpositionawareolwlokw != null && getglobalpositionawareolwlokw2 != null) {
                                if (!(getglobalpositionawareolwlokw instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations) {
                                        double d = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                        double d2 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                        getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                                        return getDrawOLwlOKw.write(d - d2);
                                    }
                                    if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    double d3 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw).read;
                                    double d4 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations3 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d3 - d4);
                                }
                                if (!(getglobalpositionawareolwlokw2 instanceof getGlobalPositionAwareOLwlOKw)) {
                                    if (!(getglobalpositionawareolwlokw2 instanceof getCompositionLocalConsumerOLwlOKwannotations)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    double d5 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                    double d6 = ((getCompositionLocalConsumerOLwlOKwannotations) getglobalpositionawareolwlokw2).read;
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations4 = getBringIntoViewOLwlOKw.read;
                                    return getDrawOLwlOKw.write(d5 - d6);
                                }
                                long j = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw).read;
                                long j2 = ((getGlobalPositionAwareOLwlOKw) getglobalpositionawareolwlokw2).read;
                                getDrawOLwlOKwannotations getdrawolwlokwannotations5 = getBringIntoViewOLwlOKw.read;
                                long j3 = j - j2;
                                boolean z2 = (j ^ j2) >= 0;
                                if ((j ^ j3) < 0) {
                                    z = false;
                                }
                                LazyKt__LazyJVMKt.write(j, j2, "checkedSubtract", z2 | z);
                                return getDrawOLwlOKw.RemoteActionCompatParcelizer(j3);
                            }
                            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object read(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm31.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm32.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            shouldHitTest shouldhittest = Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2);
                            boolean z = true;
                            if (getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[shouldhittest.ordinal()] != 1) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object serializer(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm31.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm32.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            int i17 = getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()];
                            boolean z = true;
                            if (i17 != 1 && i17 != 2) {
                                z = false;
                            }
                            return getDrawOLwlOKw.serializer(z);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    private final Object write(Object obj2) {
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        nodeCoordinatorCompanionPointerInputSource1.getClass();
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm31.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsm32.invoke(nodeCoordinatorCompanionPointerInputSource1);
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        try {
                            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                            Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                            return getDrawOLwlOKw.serializer(getApproachMeasureOLwlOKw.RemoteActionCompatParcelizer[Values$Enterprise.read(valueIconCompatParcelizer, valueIconCompatParcelizer2).ordinal()] == 3);
                        } catch (Exception unused) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:532:0x0811 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:533:0x0816  */
                    /* JADX WARN: Code duplicated, block: B:539:0x0826 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:541:0x0833 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code duplicated, block: B:542:0x0836 A[Catch: Exception -> 0x083f, TryCatch #1 {Exception -> 0x083f, blocks: (B:522:0x07ec, B:532:0x0811, B:543:0x083c, B:536:0x081a, B:539:0x0826, B:541:0x0833, B:542:0x0836, B:525:0x07f7, B:527:0x07ff, B:529:0x0805), top: B:548:0x07ec }] */
                    /* JADX WARN: Code restructure failed: missing block: B:507:0x07b5, code lost:
                    
                        if (r8 < 0.0d) goto L508;
                     */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r12) {
                        /*
                            Method dump skipped, instruction units count: 2148
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1$1.invoke(java.lang.Object):java.lang.Object");
                    }
                };
            case 27:
                List list27 = (List) obj;
                list27.getClass();
                if (list27.size() == 3) {
                    return new getSoftKeyboardKeyInputOLwlOKwannotations((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list27.get(0), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list27.get(1), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list27.get(2), i6);
                }
                getRectManager.write("Function should have exactly 3 params, but %d were given.", Integer.valueOf(list27.size()));
                throw null;
            case 28:
                List list28 = (List) obj;
                list28.getClass();
                if (list28.size() == 1) {
                    return new MonotonicFrameClockKt$withFrameMillis$2((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list28.get(0), i2);
                }
                getRectManager.write("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list28.size()));
                throw null;
            default:
                List list29 = (List) obj;
                list29.getClass();
                if (list29.size() == 1) {
                    return new MonotonicFrameClockKt$withFrameMillis$2((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list29.get(0), i);
                }
                getRectManager.write("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list29.size()));
                throw null;
        }
    }
}
