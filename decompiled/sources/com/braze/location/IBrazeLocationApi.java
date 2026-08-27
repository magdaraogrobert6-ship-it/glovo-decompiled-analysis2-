package com.braze.location;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.LocationProviderName;
import java.util.EnumSet;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public interface IBrazeLocationApi {
    void initWithContext(Context context, EnumSet<LocationProviderName> enumSet, BrazeConfigurationProvider brazeConfigurationProvider);

    boolean requestSingleLocationUpdate(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm);
}
