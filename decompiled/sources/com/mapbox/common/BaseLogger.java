package com.mapbox.common;

import com.mapbox.annotation.module.MapboxModuleType;
import com.mapbox.base.common.logger.Logger;
import com.mapbox.base.common.logger.model.Message;
import com.mapbox.base.common.logger.model.Tag;
import com.mapbox.common.module.provider.MapboxModuleProvider;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes5.dex */
public final class BaseLogger {
    public static final BaseLogger INSTANCE = new BaseLogger();
    private static final onViewDetachedFromWindowlambda1 loggerInstance$delegate = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.BaseLogger$loggerInstance$2
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Logger invoke() {
            return (Logger) MapboxModuleProvider.INSTANCE.createModule(MapboxModuleType.CommonLogger, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.common.BaseLogger$loggerInstance$2.1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final ModuleProviderArgument[] invoke(MapboxModuleType mapboxModuleType) {
                    mapboxModuleType.getClass();
                    return new ModuleProviderArgument[0];
                }
            });
        }
    }});

    private BaseLogger() {
    }

    public static /* synthetic */ void getLoggerInstance$annotations() {
    }

    public final Logger getLoggerInstance() {
        return (Logger) loggerInstance$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    public static final void debug(String str, String str2) {
        str.getClass();
        str2.getClass();
        INSTANCE.getLoggerInstance().d(new Tag(str), new Message(str2), null);
    }

    public static final void error(String str, String str2) {
        str.getClass();
        str2.getClass();
        INSTANCE.getLoggerInstance().e(new Tag(str), new Message(str2), null);
    }

    public static final void info(String str, String str2) {
        str.getClass();
        str2.getClass();
        INSTANCE.getLoggerInstance().i(new Tag(str), new Message(str2), null);
    }

    public static final void warning(String str, String str2) {
        str.getClass();
        str2.getClass();
        INSTANCE.getLoggerInstance().w(new Tag(str), new Message(str2), null);
    }
}
