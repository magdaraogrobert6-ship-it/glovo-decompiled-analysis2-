package com.mapbox.maps.extension.style.types;

import androidx.annotation.Keep;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.getOnAutofillTextannotations;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class PromoteId {
    public static final getOnAutofillTextannotations Companion = new getOnAutofillTextannotations();
    private final Expression expression;
    private final String propertyName;
    private final String sourceId;

    public final String component1() {
        return this.propertyName;
    }

    public final String component2() {
        return this.sourceId;
    }

    public final Expression getExpression() {
        return this.expression;
    }

    public final String getPropertyName() {
        return this.propertyName;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public int hashCode() {
        int iHashCode = this.propertyName.hashCode();
        String str = this.sourceId;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final Value toValue$extension_style_release() {
        Value valueOrElse = Value.fromJson(this.propertyName).getValueOrElse(new MapboxNavigation$$ExternalSyntheticLambda4(3, this));
        valueOrElse.getClass();
        Value value = valueOrElse;
        String str = this.sourceId;
        return str != null ? new Value((HashMap<String, Value>) onMove.serializer(new onViewAttachedToWindowlambda0(str, value))) : value;
    }

    public PromoteId(String str, String str2) {
        Expression expressionUnwrapToExpression;
        str.getClass();
        this.propertyName = str;
        this.sourceId = str2;
        try {
            Value value = Value.fromJson(str).getValue();
            expressionUnwrapToExpression = value != null ? TypeUtilsKt.unwrapToExpression(value) : null;
        } catch (Throwable unused) {
        }
        this.expression = expressionUnwrapToExpression;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Value toValue$lambda$0(PromoteId promoteId, String str) {
        promoteId.getClass();
        str.getClass();
        return Value.valueOf(promoteId.propertyName);
    }

    public static /* synthetic */ PromoteId copy$default(PromoteId promoteId, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = promoteId.propertyName;
        }
        if ((i & 2) != 0) {
            str2 = promoteId.sourceId;
        }
        return promoteId.copy(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoteId)) {
            return false;
        }
        PromoteId promoteId = (PromoteId) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.propertyName, promoteId.propertyName}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sourceId, promoteId.sourceId}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PromoteId(propertyName=");
        sb.append(this.propertyName);
        sb.append(", sourceId=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.sourceId, ')');
    }

    public final PromoteId copy(String str, String str2) {
        str.getClass();
        return new PromoteId(str, str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PromoteId(String str) {
        this(str, (String) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PromoteId(Expression expression) {
        this(expression, (String) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        expression.getClass();
    }

    public /* synthetic */ PromoteId(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public /* synthetic */ PromoteId(Expression expression, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(expression, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PromoteId(Expression expression, String str) {
        expression.getClass();
        String json = expression.toJson();
        json.getClass();
        this(json, str);
    }
}
