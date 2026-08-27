package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class accesssearchChildren4C6V_qg extends isBetterCandidate_I7lrPNgminorAxisDistance {
    private static final accesssearchChildren4C6V_qg DEFAULT_INSTANCE;
    private static volatile CornerRadiusCompanion PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private TwoDimensionalFocusSearchKtgenerateAndSearchChildren1 strings_ = GeometryUtilsKt.serializer;

    public static accesssearchChildren4C6V_qg serializer() {
        return DEFAULT_INSTANCE;
    }

    public final TwoDimensionalFocusSearchKtgenerateAndSearchChildren1 write() {
        return this.strings_;
    }

    static {
        accesssearchChildren4C6V_qg accesssearchchildren4c6v_qg = new accesssearchChildren4C6V_qg();
        DEFAULT_INSTANCE = accesssearchchildren4c6v_qg;
        isBetterCandidate_I7lrPNgminorAxisDistance.IconCompatParcelizer(accesssearchChildren4C6V_qg.class, accesssearchchildren4c6v_qg);
    }

    public static onDispatchEventsCompleted IconCompatParcelizer() {
        accesssearchChildren4C6V_qg accesssearchchildren4c6v_qg = DEFAULT_INSTANCE;
        accesssearchchildren4c6v_qg.getClass();
        return (onDispatchEventsCompleted) ((isBetterCandidate_I7lrPNgisCandidate) accesssearchchildren4c6v_qg.IconCompatParcelizer(isBetterCandidate_I7lrPNgweightedDistance.NEW_BUILDER));
    }

    @Override // o.isBetterCandidate_I7lrPNgminorAxisDistance
    public final Object IconCompatParcelizer(isBetterCandidate_I7lrPNgweightedDistance isbettercandidate_i7lrpngweighteddistance) {
        CornerRadiusCompanion isbettercandidatei7lrpng;
        switch (getAlwaysLCbbffg.write[isbettercandidate_i7lrpngweighteddistance.ordinal()]) {
            case 1:
                return new accesssearchChildren4C6V_qg();
            case 2:
                return new onDispatchEventsCompleted();
            case 3:
                return new lerp3Ry4LBc(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                CornerRadiusCompanion cornerRadiusCompanion = PARSER;
                if (cornerRadiusCompanion != null) {
                    return cornerRadiusCompanion;
                }
                synchronized (accesssearchChildren4C6V_qg.class) {
                    isbettercandidatei7lrpng = PARSER;
                    if (isbettercandidatei7lrpng == null) {
                        isbettercandidatei7lrpng = new isBetterCandidateI7lrPNg();
                        PARSER = isbettercandidatei7lrpng;
                    }
                    break;
                }
                return isbettercandidatei7lrpng;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                getAlignmentLinesMap.write();
                return null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void read(accesssearchChildren4C6V_qg accesssearchchildren4c6v_qg, Iterable iterable) {
        TwoDimensionalFocusSearchKtgenerateAndSearchChildren1 twoDimensionalFocusSearchKtgenerateAndSearchChildren1 = accesssearchchildren4c6v_qg.strings_;
        if (!((searchChildren4C6V_qg) twoDimensionalFocusSearchKtgenerateAndSearchChildren1).read) {
            int size = twoDimensionalFocusSearchKtgenerateAndSearchChildren1.size();
            accesssearchchildren4c6v_qg.strings_ = twoDimensionalFocusSearchKtgenerateAndSearchChildren1.read(size == 0 ? 10 : size * 2);
        }
        List list = accesssearchchildren4c6v_qg.strings_;
        Charset charset = topLeft.serializer;
        if (iterable instanceof twoDimensionalFocusSearchsMXa3k8) {
            List listRemoteActionCompatParcelizer = ((twoDimensionalFocusSearchsMXa3k8) iterable).RemoteActionCompatParcelizer();
            twoDimensionalFocusSearchsMXa3k8 twodimensionalfocussearchsmxa3k8 = (twoDimensionalFocusSearchsMXa3k8) list;
            int size2 = list.size();
            for (Object obj : listRemoteActionCompatParcelizer) {
                if (obj == null) {
                    String str = "Element at index " + (twodimensionalfocussearchsmxa3k8.size() - size2) + " is null.";
                    int size3 = twodimensionalfocussearchsmxa3k8.size();
                    while (true) {
                        size3--;
                        if (size3 < size2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(str);
                            return;
                        }
                        twodimensionalfocussearchsmxa3k8.remove(size3);
                    }
                } else if (obj instanceof moveFocusInChildren3ESFkO8) {
                    twodimensionalfocussearchsmxa3k8.write((moveFocusInChildren3ESFkO8) obj);
                } else {
                    twodimensionalfocussearchsmxa3k8.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof getZerokKHJgLs) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size4) + " is null.";
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(str2);
                        return;
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj2);
            }
        }
    }
}
