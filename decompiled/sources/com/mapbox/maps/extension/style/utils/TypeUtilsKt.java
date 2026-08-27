package com.mapbox.maps.extension.style.utils;

import com.braze.models.inappmessage.InAppMessageBase;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.Vw$Vw;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.types.StyleTransition;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.difference;
import o.onContentCardDismissed;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TypeUtilsKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StylePropertyValueKind.values().length];
            try {
                iArr[StylePropertyValueKind.CONSTANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StylePropertyValueKind.TRANSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StylePropertyValueKind.EXPRESSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StylePropertyValueKind.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Object unwrap(StylePropertyValue stylePropertyValue, Class cls) {
        StyleTransition styleTransition;
        stylePropertyValue.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[stylePropertyValue.getKind().ordinal()];
        if (i == 1) {
            Value value = stylePropertyValue.getValue();
            value.getClass();
            Serializable serializableUnwrapToAny = unwrapToAny(value);
            if (cls.isInstance(serializableUnwrapToAny)) {
                return serializableUnwrapToAny;
            }
            throw new UnsupportedOperationException("Requested type " + cls.getSimpleName() + " doesn't match " + serializableUnwrapToAny.getClass().getSimpleName());
        }
        if (i != 2) {
            if (i == 3) {
                Value value2 = stylePropertyValue.getValue();
                value2.getClass();
                Expression expressionUnwrapToExpression = unwrapToExpression(value2);
                if (cls.isInstance(expressionUnwrapToExpression)) {
                    return expressionUnwrapToExpression;
                }
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read("Requested type ", cls.getSimpleName(), " doesn't match Expression");
                return null;
            }
            if (i == 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Property is undefined");
                return null;
            }
            throw new UnsupportedOperationException("parsing " + stylePropertyValue.getKind() + " is not supported yet");
        }
        Value value3 = stylePropertyValue.getValue();
        value3.getClass();
        Object contents = value3.getContents();
        int i2 = 10;
        char c = 0;
        if (contents instanceof HashMap) {
            Vw$Vw vw$Vw = new Vw$Vw(i2, c);
            HashMap map = (HashMap) contents;
            Value value4 = (Value) map.get("delay");
            if (value4 != null) {
                Object contents2 = value4.getContents();
                contents2.getClass();
                vw$Vw.IconCompatParcelizer = (Long) contents2;
            }
            Value value5 = (Value) map.get(InAppMessageBase.DURATION);
            if (value5 != null) {
                Object contents3 = value5.getContents();
                contents3.getClass();
                vw$Vw.serializer = (Long) contents3;
            }
            styleTransition = new StyleTransition(vw$Vw);
        } else {
            if (!(contents instanceof List)) {
                throw new UnsupportedOperationException("unable to unwrap to StyleTransition: " + value3);
            }
            List list = (List) contents;
            Vw$Vw vw$Vw2 = new Vw$Vw(i2, c);
            Object contents4 = ((Value) list.get(0)).getContents();
            contents4.getClass();
            vw$Vw2.serializer = (Long) contents4;
            Object contents5 = ((Value) list.get(1)).getContents();
            contents5.getClass();
            vw$Vw2.IconCompatParcelizer = (Long) contents5;
            styleTransition = new StyleTransition(vw$Vw2);
        }
        if (cls.isInstance(styleTransition)) {
            return styleTransition;
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read("Requested type ", cls.getSimpleName(), " doesn't match StyleTransition");
        return null;
    }

    public static final Expression unwrapFromLiteralArray(Expression expression) {
        expression.getClass();
        if (!(expression.getContents() instanceof List)) {
            return expression;
        }
        Object contents = expression.getContents();
        contents.getClass();
        List list = (List) contents;
        Object contents2 = ((Value) onContentCardDismissed.read(list)).getContents();
        if (!"literal".equals(contents2 instanceof String ? (String) contents2 : null)) {
            return expression;
        }
        Object contents3 = ((Value) onContentCardDismissed.MediaDescriptionCompat(list)).getContents();
        return contents3 instanceof List ? new Expression((List) contents3) : expression;
    }

    public static final Serializable unwrapToAny(Value value) {
        value.getClass();
        Object contents = value.getContents();
        if (contents instanceof Double) {
            return (Serializable) contents;
        }
        if (contents instanceof Long) {
            return (Serializable) contents;
        }
        if (contents instanceof Boolean) {
            return (Serializable) contents;
        }
        if (contents instanceof String) {
            return (Serializable) contents;
        }
        if (contents instanceof double[]) {
            return (Serializable) contents;
        }
        if (contents instanceof long[]) {
            return (Serializable) contents;
        }
        if (contents instanceof boolean[]) {
            return (Serializable) contents;
        }
        if (contents instanceof List) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) contents).iterator();
            while (it.hasNext()) {
                arrayList.add(unwrapToAny((Value) it.next()));
            }
            return arrayList;
        }
        if (!(contents instanceof HashMap)) {
            StringBuilder sb = new StringBuilder("unable to unwrap Value of content type: ");
            Object contents2 = value.getContents();
            sb.append(contents2 != null ? contents2.getClass().getSimpleName() : null);
            throw new UnsupportedOperationException(sb.toString());
        }
        HashMap map = (HashMap) contents;
        HashMap map2 = new HashMap();
        Set<String> setKeySet = map.keySet();
        setKeySet.getClass();
        for (String str : setKeySet) {
            Value value2 = (Value) map.get(str);
            if (value2 != null) {
                str.getClass();
                map2.put(str, unwrapToAny(value2));
            }
        }
        return map2;
    }

    public static final Expression unwrapToExpression(Value value) {
        value.getClass();
        Object contents = value.getContents();
        if (contents instanceof Double) {
            return new Expression(((Number) contents).doubleValue());
        }
        if (contents instanceof Long) {
            return new Expression(((Number) contents).longValue());
        }
        if (contents instanceof Boolean) {
            Boolean bool = (Boolean) contents;
            Expression expression = new Expression(bool.booleanValue());
            expression.literalValue = bool;
            return expression;
        }
        if (contents instanceof String) {
            return new Expression((String) contents);
        }
        if (!(contents instanceof List)) {
            if (!(contents instanceof HashMap)) {
                throw new UnsupportedOperationException("unable to unwrap to Expression: " + value);
            }
            HashMap map = (HashMap) contents;
            Expression expression2 = new Expression(map);
            expression2.literalValue = map;
            return expression2;
        }
        List list = (List) contents;
        Object contents2 = ((Value) onContentCardDismissed.read(list)).getContents();
        String str = contents2 instanceof String ? (String) contents2 : null;
        if (str == null) {
            return new Expression(list);
        }
        if ("literal".equals(str)) {
            Object contents3 = ((Value) onContentCardDismissed.MediaDescriptionCompat(list)).getContents();
            if (contents3 instanceof List) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) contents3).iterator();
                while (it.hasNext()) {
                    arrayList.add(unwrapToExpression((Value) it.next()));
                }
                Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("literal");
                expressionBuilder.arguments.add(new Expression(arrayList));
                return expressionBuilder.build();
            }
            if (contents3 instanceof HashMap) {
                HashMap map2 = new HashMap();
                for (Map.Entry entry : ((HashMap) contents3).entrySet()) {
                    map2.put((String) entry.getKey(), unwrapToExpression((Value) entry.getValue()));
                }
                HashMap map3 = new HashMap();
                for (Map.Entry entry2 : map2.entrySet()) {
                    map3.put((String) entry2.getKey(), TypeUtils.INSTANCE.wrapToValue(entry2.getValue()));
                }
                Expression.ExpressionBuilder expressionBuilder2 = new Expression.ExpressionBuilder("literal");
                Expression expression3 = new Expression(map3);
                expression3.literalValue = map3;
                expressionBuilder2.arguments.add(expression3);
                return expressionBuilder2.build();
            }
        } else if ("image".equals(str)) {
            difference differenceVar = new difference("image");
            Iterator it2 = onContentCardDismissed.serializer(list, 1).iterator();
            while (it2.hasNext()) {
                differenceVar.arguments.add(unwrapToExpression((Value) it2.next()));
            }
            return differenceVar.build();
        }
        List listSerializer = onContentCardDismissed.serializer(list, 1);
        Expression.ExpressionBuilder expressionBuilder3 = new Expression.ExpressionBuilder(str);
        Iterator it3 = listSerializer.iterator();
        while (it3.hasNext()) {
            expressionBuilder3.arguments.add(unwrapToExpression((Value) it3.next()));
        }
        return expressionBuilder3.build();
    }
}
