package com.mapbox.navigation.base.internal.route.parsing;

import androidx.transition.TransitionValuesMaps;
import com.mapbox.navigation.base.internal.route.parsing.models.directions.NavigationRoutesParser;
import com.mapbox.navigation.base.internal.route.parsing.parser.directions.NnAndModelsParallelNavigationRoutesParser;
import com.roadrunner.domain.util.IsFixableByRetry;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes2.dex */
public final class ParsingEntryPoint implements NavigationRoutesParser {
    public final NnAndModelsParallelNavigationRoutesParser navigationRoutesParser;
    public final TransitionValuesMaps routeInterfacesParser;

    @Override // com.mapbox.navigation.base.internal.route.parsing.models.directions.NavigationRoutesParser
    /* JADX INFO: renamed from: parseDirectionsResponse-gIAlu-s, reason: not valid java name */
    public final Object mo4782parseDirectionsResponsegIAlus(ResponseToParse responseToParse, ShortNewsContentCardView shortNewsContentCardView) {
        Object objMo4782parseDirectionsResponsegIAlus = this.navigationRoutesParser.mo4782parseDirectionsResponsegIAlus(responseToParse, shortNewsContentCardView);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objMo4782parseDirectionsResponsegIAlus;
    }

    public ParsingEntryPoint(NnAndModelsParallelNavigationRoutesParser nnAndModelsParallelNavigationRoutesParser, TransitionValuesMaps transitionValuesMaps, IsFixableByRetry isFixableByRetry) {
        this.navigationRoutesParser = nnAndModelsParallelNavigationRoutesParser;
        this.routeInterfacesParser = transitionValuesMaps;
    }
}
