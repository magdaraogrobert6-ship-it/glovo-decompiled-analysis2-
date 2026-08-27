package com.mapbox.maps.extension.style.expressions.generated;

import androidx.sqlite.SQLite;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.style.utils.TypeUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.onContentCardDismissed;
import okio.Okio;

/* JADX INFO: loaded from: classes2.dex */
public final class Expression extends Value {
    public Object literalValue;

    public class ExpressionBuilder {
        public final ArrayList arguments = new ArrayList();
        public final String operator;

        public final void color(int i) {
            this.arguments.add(Okio.color(i));
        }

        public final void literal(double d) {
            this.arguments.add(new Expression(d));
        }

        public ExpressionBuilder(String str) {
            this.operator = str;
        }

        public final void addArgument(Expression expression) {
            expression.getClass();
            this.arguments.add(expression);
        }

        public final Expression build() {
            if (!this.operator.equals("match")) {
                return new Expression(this);
            }
            ExpressionBuilder expressionBuilder = new ExpressionBuilder("match");
            ArrayList arrayList = this.arguments;
            int size = arrayList.size();
            int i = 0;
            for (Object obj : arrayList) {
                if (i < 0) {
                    SQLite.serializer();
                    throw null;
                }
                Expression expressionUnwrapFromLiteralArray = (Expression) obj;
                if (i % 2 == 1 && i != size - 1) {
                    expressionUnwrapFromLiteralArray = TypeUtilsKt.unwrapFromLiteralArray(expressionUnwrapFromLiteralArray);
                }
                expressionBuilder.addArgument(expressionUnwrapFromLiteralArray);
                i++;
            }
            return new Expression(expressionBuilder);
        }

        public final void lineProgress() {
            this.arguments.add(new ExpressionBuilder("line-progress").build());
        }

        public final void zoom() {
            this.arguments.add(new ExpressionBuilder("zoom").build());
        }

        public final void literal(String str) {
            this.arguments.add(new Expression(str));
        }
    }

    public final class InterpolatorBuilder extends ExpressionBuilder {
        public InterpolatorBuilder() {
            super("interpolate");
        }

        public final void linear() {
            this.arguments.add(new ExpressionBuilder("linear").build());
        }

        public InterpolatorBuilder(String str) {
            super(str);
        }
    }

    public Expression(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(TypeUtils.INSTANCE.wrapToValue(it.next()));
        }
        super((List<Value>) arrayList);
        this.literalValue = list;
    }

    public Expression(long j) {
        super(j);
        this.literalValue = Long.valueOf(j);
    }

    public Expression(String str) {
        super(str);
        this.literalValue = str;
    }

    public Expression(double d) {
        super(d);
        this.literalValue = Double.valueOf(d);
    }

    public Expression(ExpressionBuilder expressionBuilder) {
        ArrayList arrayList = new ArrayList();
        String str = expressionBuilder.operator;
        arrayList.add(new Value(str));
        ArrayList arrayList2 = expressionBuilder.arguments;
        arrayList.addAll(arrayList2);
        super((List<Value>) arrayList);
        if ("literal".equals(str)) {
            this.literalValue = ((Expression) onContentCardDismissed.MediaDescriptionCompat((List) arrayList2)).literalValue;
        }
    }

    public Expression(HashMap map) {
        super((HashMap<String, Value>) map);
    }

    public Expression(boolean z) {
        super(z);
    }
}
