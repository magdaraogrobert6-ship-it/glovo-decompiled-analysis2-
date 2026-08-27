package com.mapbox.navigation.ui.maps.building;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.maps.QueryRenderedFeaturesCallback;
import com.mapbox.navigation.ui.maps.building.model.BuildingValue;
import java.util.List;
import kotlin.coroutines.SafeContinuation;
import o.createFromParcel;
import o.getSetTextSubstitution;

/* JADX INFO: loaded from: classes2.dex */
public final class BuildingProcessor$queryBuilding$2$1 implements Expected.Transformer, QueryRenderedFeaturesCallback {
    public final /* synthetic */ SafeContinuation $continuation;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BuildingProcessor$queryBuilding$2$1(SafeContinuation safeContinuation, int i) {
        this.$r8$classId = i;
        this.$continuation = safeContinuation;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        SafeContinuation safeContinuation = this.$continuation;
        if (i != 1) {
            List list = (List) obj;
            list.getClass();
            Expected expectedCreateValue = ExpectedFactory.createValue(new BuildingValue(list));
            expectedCreateValue.getClass();
            safeContinuation.resumeWith(new BuildingResult$QueriedBuildings(expectedCreateValue));
            return createfromparcel;
        }
        String str = (String) obj;
        str.getClass();
        Expected expectedCreateError = ExpectedFactory.createError(new getSetTextSubstitution(str));
        expectedCreateError.getClass();
        safeContinuation.resumeWith(new BuildingResult$QueriedBuildings(expectedCreateError));
        return createfromparcel;
    }

    @Override // com.mapbox.maps.QueryRenderedFeaturesCallback
    public void run(Expected expected) {
        expected.getClass();
        SafeContinuation safeContinuation = this.$continuation;
        expected.fold(new BuildingProcessor$queryBuilding$2$1(safeContinuation, 1), new BuildingProcessor$queryBuilding$2$1(safeContinuation, 2));
    }
}
