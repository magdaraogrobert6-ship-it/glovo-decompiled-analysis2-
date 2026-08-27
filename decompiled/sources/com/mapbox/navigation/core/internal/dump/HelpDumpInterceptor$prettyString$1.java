package com.mapbox.navigation.core.internal.dump;

import androidx.compose.ui.platform.InspectorInfo;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class HelpDumpInterceptor$prettyString$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpDumpInterceptor$prettyString$1() {
        super(1);
        this.$r8$classId = 2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i) {
            case 0:
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) obj;
                onviewattachedtowindowlambda0.getClass();
                return ((String) onviewattachedtowindowlambda0.serializer) + ", " + ((String) onviewattachedtowindowlambda0.write);
            case 1:
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.setName("aspectRatio");
                inspectorInfo.getProperties().set("ratio", Float.valueOf(0.75f));
                inspectorInfo.getProperties().set("matchHeightConstraintsFirst", Boolean.FALSE);
                return createfromparcel;
            case 2:
                ((InspectorInfo) obj).setName("matchParentSize");
                return createfromparcel;
            case 3:
                ((InspectorInfo) obj).setName("imePadding");
                return createfromparcel;
            case 4:
                ((InspectorInfo) obj).setName("navigationBarsPadding");
                return createfromparcel;
            case 5:
                ((InspectorInfo) obj).setName("statusBarsPadding");
                return createfromparcel;
            case 6:
                ((InspectorInfo) obj).setName("systemBarsPadding");
                return createfromparcel;
            default:
                Expression.InterpolatorBuilder interpolatorBuilder = (Expression.InterpolatorBuilder) obj;
                interpolatorBuilder.getClass();
                interpolatorBuilder.linear();
                interpolatorBuilder.zoom();
                interpolatorBuilder.literal(0.0d);
                interpolatorBuilder.literal(0.0d);
                interpolatorBuilder.literal(13.99999999999d);
                interpolatorBuilder.literal(0.0d);
                interpolatorBuilder.literal(14.0d);
                interpolatorBuilder.literal(1.0d);
                return createfromparcel;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HelpDumpInterceptor$prettyString$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HelpDumpInterceptor$prettyString$1(int i, Object obj) {
        super(1);
        this.$r8$classId = i;
    }
}
