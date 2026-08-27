package com.deliveryhero.fwf_evaluator.model;

import androidx.sqlite.SQLite;
import coil3.util.UtilsKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class Operator implements Operation {
    private Operation operation;

    public enum OperatorProperty {
        OPERATOR_IN("in"),
        OPERATOR_IS("is"),
        OPERATOR_ENDS_WITH("endsWith"),
        OPERATOR_STARTS_WITH("startsWith"),
        OPERATOR_MATCHES("matches"),
        OPERATOR_CONTAINS("contains"),
        OPERATOR_LESS_THAN("lessThan"),
        OPERATOR_LESS_THAN_OR_EQUAL("lessThanOrEqual"),
        OPERATOR_GREATER_THAN("greaterThan"),
        OPERATOR_GREATER_THAN_OR_EQUAL("greaterThanOrEqual"),
        OPERATOR_GREATER_THAN_VERSION("greaterThanVersion"),
        OPERATOR_GREATER_THAN_OR_EQUAL_VERSION("greaterThanOrEqualVersion"),
        OPERATOR_LESS_THAN_VERSION("lessThanVersion"),
        OPERATOR_LESS_THAN_OR_EQUAL_VERSION("lessThanOrEqualVersion"),
        OPERATOR_BEFORE_THAN_TIMESTAMP("beforeThanTimestamp"),
        OPERATOR_BEFORE_THAN_OR_EQUAL_TIMESTAMP("beforeThanOrEqualTimestamp"),
        OPERATOR_AFTER_THAN_TIMESTAMP("afterThanTimestamp"),
        OPERATOR_AFTER_THAN_OR_EQUAL_TIMESTAMP("afterThanOrEqualTimestamp");

        private final String operatorName;
        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
        public static final Companion Companion = new Companion(null);

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }

        public final String getOperatorName() {
            return this.operatorName;
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final OperatorProperty fromOperator(String str) {
                str.getClass();
                for (OperatorProperty operatorProperty : OperatorProperty.getEntries()) {
                    Object[] objArr = {operatorProperty.getOperatorName(), str};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                        return operatorProperty;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        OperatorProperty(String str) {
            this.operatorName = str;
        }
    }

    public static final class OperatorContains extends OperatorString {
        @Override // com.deliveryhero.fwf_evaluator.model.Operator.OperatorString, com.deliveryhero.fwf_evaluator.model.Operation
        public boolean operation(Object obj, List<? extends Object> list) {
            obj.getClass();
            list.getClass();
            if (super.operation(obj, list)) {
                for (Object obj2 : list) {
                    obj2.getClass();
                    if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) obj, (CharSequence) obj2, false)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static final class OperatorEndsWith extends OperatorString {
        @Override // com.deliveryhero.fwf_evaluator.model.Operator.OperatorString, com.deliveryhero.fwf_evaluator.model.Operation
        public boolean operation(Object obj, List<? extends Object> list) {
            obj.getClass();
            list.getClass();
            if (super.operation(obj, list)) {
                for (Object obj2 : list) {
                    obj2.getClass();
                    if (setCarryoverInAppMessage.read((String) obj, (String) obj2, false)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static final class OperatorGreaterThan extends OperatorNumber {
        @Override // com.deliveryhero.fwf_evaluator.model.Operator.OperatorNumber, com.deliveryhero.fwf_evaluator.model.Operation
        public boolean operation(Object obj, List<? extends Object> list) {
            obj.getClass();
            list.getClass();
            if (super.operation(obj, list)) {
                double dDoubleValue = ((Number) obj).doubleValue();
                Object obj2 = list.get(0);
                obj2.getClass();
                if (dDoubleValue > ((Number) obj2).doubleValue()) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class OperatorGreaterThanOrEqual extends OperatorNumber {
        @Override // com.deliveryhero.fwf_evaluator.model.Operator.OperatorNumber, com.deliveryhero.fwf_evaluator.model.Operation
        public boolean operation(Object obj, List<? extends Object> list) {
            obj.getClass();
            list.getClass();
            if (super.operation(obj, list) && obj.equals(list.get(0))) {
                return true;
            }
            return new OperatorGreaterThan().operation(obj, list);
        }
    }

    public static final class OperatorGreaterThanOrEqualVersion extends OperatorString {
        @Override // com.deliveryhero.fwf_evaluator.model.Operator.OperatorString, com.deliveryhero.fwf_evaluator.model.Operation
        public boolean operation(Object obj, List<? extends Object> list) {
            obj.getClass();
            list.getClass();
            if (super.operation(obj, list) && obj.equals(list.get(0))) {
                return true;
            }
            return new OperatorGreaterThanVersion().operation(obj, list);
        }
    }

    public static final class OperatorGreaterThanVersion extends OperatorString {
        /* JADX WARN: Code duplicated, block: B:24:0x0080 A[ORIG_RETURN, RETURN] */
        @Override // com.deliveryhero.fwf_evaluator.model.Operator.OperatorString, com.deliveryhero.fwf_evaluator.model.Operation
        public boolean operation(Object obj, List<? extends Object> list) {
            obj.getClass();
            list.getClass();
            if (super.operation(obj, list)) {
                List listSerializer = hideCurrentlyDisplayingInAppMessage.serializer((String) obj, new String[]{"."}, 6);
                Object obj2 = list.get(0);
                obj2.getClass();
                List listSerializer2 = hideCurrentlyDisplayingInAppMessage.serializer((String) obj2, new String[]{"."}, 6);
                if (listSerializer.size() == listSerializer2.size()) {
                    int i = 0;
                    for (Object obj3 : listSerializer2) {
                        if (i < 0) {
                            SQLite.serializer();
                            throw null;
                        }
                        Integer numPlaybackStateCompat = setCarryoverInAppMessage.PlaybackStateCompat((String) obj3);
                        Integer numPlaybackStateCompat2 = setCarryoverInAppMessage.PlaybackStateCompat((String) listSerializer.get(i));
                        if (numPlaybackStateCompat != null && numPlaybackStateCompat2 != null) {
                            if (numPlaybackStateCompat.equals(numPlaybackStateCompat2)) {
                                i++;
                            } else if (numPlaybackStateCompat2.intValue() > numPlaybackStateCompat.intValue()) {
                                return true;
                            }
                        }
                    }
                    if (listSerializer.size() > listSerializer2.size()) {
                        return true;
                    }
                } else if (listSerializer.size() > listSerializer2.size()) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class OperatorIn implements Operation {
        @Override // com.deliveryhero.fwf_evaluator.model.Operation
        public boolean operation(Object obj, List<? extends Object> list) {
            obj.getClass();
            list.getClass();
            return list.contains(obj);
        }
    }

    public static final class OperatorIs implements Operation {
        @Override // com.deliveryhero.fwf_evaluator.model.Operation
        public boolean operation(Object obj, List<? extends Object> list) {
            obj.getClass();
            list.getClass();
            if (list.size() != 1) {
                return new OperatorIn().operation(obj, list);
            }
            Object[] objArr = {list.get(0), obj};
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
        }
    }

    public static final class OperatorLessThan extends OperatorNumber {
        @Override // com.deliveryhero.fwf_evaluator.model.Operator.OperatorNumber, com.deliveryhero.fwf_evaluator.model.Operation
        public boolean operation(Object obj, List<? extends Object> list) {
            obj.getClass();
            list.getClass();
            if (super.operation(obj, list)) {
                double dDoubleValue = ((Number) obj).doubleValue();
                Object obj2 = list.get(0);
                obj2.getClass();
                if (dDoubleValue < ((Number) obj2).doubleValue()) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class OperatorLessThanOrEqual extends OperatorNumber {
        @Override // com.deliveryhero.fwf_evaluator.model.Operator.OperatorNumber, com.deliveryhero.fwf_evaluator.model.Operation
        public boolean operation(Object obj, List<? extends Object> list) {
            obj.getClass();
            list.getClass();
            if (super.operation(obj, list) && obj.equals(list.get(0))) {
                return true;
            }
            return new OperatorLessThan().operation(obj, list);
        }
    }

    public static final class OperatorLessThanOrEqualVersion extends OperatorString {
        @Override // com.deliveryhero.fwf_evaluator.model.Operator.OperatorString, com.deliveryhero.fwf_evaluator.model.Operation
        public boolean operation(Object obj, List<? extends Object> list) {
            obj.getClass();
            list.getClass();
            if (super.operation(obj, list) && obj.equals(list.get(0))) {
                return true;
            }
            return new OperatorLessThanVersion().operation(obj, list);
        }
    }

    public static final class OperatorLessThanVersion extends OperatorString {
        /* JADX WARN: Code duplicated, block: B:24:0x0080 A[ORIG_RETURN, RETURN] */
        @Override // com.deliveryhero.fwf_evaluator.model.Operator.OperatorString, com.deliveryhero.fwf_evaluator.model.Operation
        public boolean operation(Object obj, List<? extends Object> list) {
            obj.getClass();
            list.getClass();
            if (super.operation(obj, list)) {
                List listSerializer = hideCurrentlyDisplayingInAppMessage.serializer((String) obj, new String[]{"."}, 6);
                Object obj2 = list.get(0);
                obj2.getClass();
                List listSerializer2 = hideCurrentlyDisplayingInAppMessage.serializer((String) obj2, new String[]{"."}, 6);
                if (listSerializer.size() == listSerializer2.size()) {
                    int i = 0;
                    for (Object obj3 : listSerializer2) {
                        if (i < 0) {
                            SQLite.serializer();
                            throw null;
                        }
                        Integer numPlaybackStateCompat = setCarryoverInAppMessage.PlaybackStateCompat((String) obj3);
                        Integer numPlaybackStateCompat2 = setCarryoverInAppMessage.PlaybackStateCompat((String) listSerializer.get(i));
                        if (numPlaybackStateCompat != null && numPlaybackStateCompat2 != null) {
                            if (numPlaybackStateCompat.equals(numPlaybackStateCompat2)) {
                                i++;
                            } else if (numPlaybackStateCompat2.intValue() < numPlaybackStateCompat.intValue()) {
                                return true;
                            }
                        }
                    }
                    if (listSerializer.size() < listSerializer2.size()) {
                        return true;
                    }
                } else if (listSerializer.size() < listSerializer2.size()) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class OperatorMatches extends OperatorString {
        @Override // com.deliveryhero.fwf_evaluator.model.Operator.OperatorString, com.deliveryhero.fwf_evaluator.model.Operation
        public boolean operation(Object obj, List<? extends Object> list) {
            obj.getClass();
            list.getClass();
            if (!super.operation(obj, list)) {
                return false;
            }
            for (Object obj2 : list) {
                obj2.getClass();
                Pattern patternCompile = Pattern.compile((String) obj2);
                patternCompile.getClass();
                if (patternCompile.matcher((String) obj).matches()) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class OperatorNumber implements Operation {
        @Override // com.deliveryhero.fwf_evaluator.model.Operation
        public boolean operation(Object obj, List<? extends Object> list) {
            obj.getClass();
            list.getClass();
            if (!(obj instanceof Number) || list.isEmpty()) {
                return false;
            }
            List<? extends Object> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return true;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Number)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final class OperatorStartsWith extends OperatorString {
        @Override // com.deliveryhero.fwf_evaluator.model.Operator.OperatorString, com.deliveryhero.fwf_evaluator.model.Operation
        public boolean operation(Object obj, List<? extends Object> list) {
            obj.getClass();
            list.getClass();
            if (super.operation(obj, list)) {
                for (Object obj2 : list) {
                    obj2.getClass();
                    if (setCarryoverInAppMessage.RemoteActionCompatParcelizer((String) obj, (String) obj2, false)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static class OperatorString implements Operation {
        @Override // com.deliveryhero.fwf_evaluator.model.Operation
        public boolean operation(Object obj, List<? extends Object> list) {
            obj.getClass();
            list.getClass();
            if (!(obj instanceof String) || list.isEmpty()) {
                return false;
            }
            List<? extends Object> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return true;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof String)) {
                    return false;
                }
            }
            return true;
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OperatorProperty.values().length];
            try {
                iArr[OperatorProperty.OPERATOR_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OperatorProperty.OPERATOR_IS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OperatorProperty.OPERATOR_ENDS_WITH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OperatorProperty.OPERATOR_STARTS_WITH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OperatorProperty.OPERATOR_MATCHES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OperatorProperty.OPERATOR_CONTAINS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OperatorProperty.OPERATOR_LESS_THAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OperatorProperty.OPERATOR_LESS_THAN_OR_EQUAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[OperatorProperty.OPERATOR_GREATER_THAN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[OperatorProperty.OPERATOR_GREATER_THAN_OR_EQUAL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[OperatorProperty.OPERATOR_GREATER_THAN_VERSION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[OperatorProperty.OPERATOR_GREATER_THAN_OR_EQUAL_VERSION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[OperatorProperty.OPERATOR_LESS_THAN_VERSION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[OperatorProperty.OPERATOR_LESS_THAN_OR_EQUAL_VERSION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[OperatorProperty.OPERATOR_BEFORE_THAN_TIMESTAMP.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[OperatorProperty.OPERATOR_BEFORE_THAN_OR_EQUAL_TIMESTAMP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[OperatorProperty.OPERATOR_AFTER_THAN_TIMESTAMP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[OperatorProperty.OPERATOR_AFTER_THAN_OR_EQUAL_TIMESTAMP.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.deliveryhero.fwf_evaluator.model.Operation
    public boolean operation(Object obj, List<? extends Object> list) {
        obj.getClass();
        list.getClass();
        Operation operation = this.operation;
        if (operation != null) {
            return operation.operation(obj, list);
        }
        return false;
    }

    public Operator(OperatorProperty operatorProperty) {
        if (operatorProperty != null) {
            switch (WhenMappings.$EnumSwitchMapping$0[operatorProperty.ordinal()]) {
                case 1:
                    this.operation = new OperatorIn();
                    break;
                case 2:
                    this.operation = new OperatorIs();
                    break;
                case 3:
                    this.operation = new OperatorEndsWith();
                    break;
                case 4:
                    this.operation = new OperatorStartsWith();
                    break;
                case 5:
                    this.operation = new OperatorMatches();
                    break;
                case 6:
                    this.operation = new OperatorContains();
                    break;
                case 7:
                    this.operation = new OperatorLessThan();
                    break;
                case 8:
                    this.operation = new OperatorLessThanOrEqual();
                    break;
                case 9:
                    this.operation = new OperatorGreaterThan();
                    break;
                case 10:
                    this.operation = new OperatorGreaterThanOrEqual();
                    break;
                case 11:
                    this.operation = new OperatorGreaterThanVersion();
                    break;
                case 12:
                    this.operation = new OperatorGreaterThanOrEqualVersion();
                    break;
                case 13:
                    this.operation = new OperatorLessThanVersion();
                    break;
                case 14:
                    this.operation = new OperatorLessThanOrEqualVersion();
                    break;
                case 15:
                    this.operation = new OperatorLessThan();
                    break;
                case 16:
                    this.operation = new OperatorLessThanOrEqual();
                    break;
                case 17:
                    this.operation = new OperatorGreaterThan();
                    break;
                case 18:
                    this.operation = new OperatorGreaterThanOrEqual();
                    break;
            }
        }
    }
}
