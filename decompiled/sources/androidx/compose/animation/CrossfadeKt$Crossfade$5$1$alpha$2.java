package androidx.compose.animation;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.mapbox.navigation.core.accounts.BillingController$onExternalRouteSet$newWaypoints$1;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineApi;
import com.mapbox.navigation.ui.maps.route.line.model.InactiveRouteColors;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import o.Arrangement;
import o.ForEachGestureKtawaitEachGesture2;
import o.PressGestureScopeImpl;
import o.getBirthDateFull;
import o.getPostalCode;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public final class CrossfadeKt$Crossfade$5$1$alpha$2 extends Lambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CrossfadeKt$Crossfade$5$1$alpha$2(int i, Object obj) {
        super(3);
        this.RemoteActionCompatParcelizer = i;
        this.read = obj;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj4 = this.read;
        if (i == 0) {
            ((Number) obj3).intValue();
            getPostalCode getpostalcode = (getPostalCode) ((getBirthDateFull) obj2);
            getpostalcode.serializer(955869654);
            Arrangement arrangement = (Arrangement) obj4;
            getpostalcode.IconCompatParcelizer(false);
            return arrangement;
        }
        if (i == 1) {
            MeasureScope measureScope = (MeasureScope) obj;
            Placeable placeableMo2209measureBRTryo0 = ((Measurable) obj2).mo2209measureBRTryo0(((Constraints) obj3).m3632unboximpl());
            return MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, new ForEachGestureKtawaitEachGesture2(placeableMo2209measureBRTryo0, (PressGestureScopeImpl) obj4), 4, null);
        }
        int iIntValue = ((Number) obj).intValue();
        List list = (List) obj2;
        InactiveRouteColors inactiveRouteColors = (InactiveRouteColors) obj3;
        list.getClass();
        inactiveRouteColors.getClass();
        return (List) BuildersKt.serializer(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, new PerseusLogger$w$1(list, ((MapboxRouteLineApi) obj4).calculationsScope, new BillingController$onExternalRouteSet$newWaypoints$1(iIntValue, inactiveRouteColors), null, 11));
    }
}
