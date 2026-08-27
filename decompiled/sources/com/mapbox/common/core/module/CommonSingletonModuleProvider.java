package com.mapbox.common.core.module;

import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.mapbox.annotation.module.MapboxModuleType;
import com.mapbox.common.module.LibraryLoader;
import com.mapbox.common.module.provider.MapboxModuleProvider;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class CommonSingletonModuleProvider {
    public static final CommonSingletonModuleProvider INSTANCE = new CommonSingletonModuleProvider();
    private static final onViewDetachedFromWindowlambda1 loaderInstance$delegate = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.core.module.CommonSingletonModuleProvider$loaderInstance$2

        /* JADX INFO: renamed from: com.mapbox.common.core.module.CommonSingletonModuleProvider$loaderInstance$2$1, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final ModuleProviderArgument[] invoke(MapboxModuleType mapboxModuleType) {
                mapboxModuleType.getClass();
                return ((CommonSingletonModuleProvider) this.MediaMetadataCompat).paramsProvider(mapboxModuleType);
            }

            public AnonymousClass1(Object obj) {
                super(1, 0, CommonSingletonModuleProvider.class, obj, "paramsProvider", "paramsProvider(Lcom/mapbox/annotation/module/MapboxModuleType;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;");
            }
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final LibraryLoader invoke() {
            return (LibraryLoader) MapboxModuleProvider.INSTANCE.createModule(MapboxModuleType.CommonLibraryLoader, new AnonymousClass1(CommonSingletonModuleProvider.INSTANCE));
        }
    }});

    private CommonSingletonModuleProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModuleProviderArgument[] paramsProvider(MapboxModuleType mapboxModuleType) {
        int i = WhenMappings.$EnumSwitchMapping$0[mapboxModuleType.ordinal()];
        if (i == 1) {
            return new ModuleProviderArgument[0];
        }
        if (i == 2) {
            return new ModuleProviderArgument[0];
        }
        Gson$$ExternalSyntheticBUOutline0.m(mapboxModuleType, "unsupported module type - ");
        return null;
    }

    public final LibraryLoader getLoaderInstance() {
        return (LibraryLoader) loaderInstance$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MapboxModuleType.values().length];
            try {
                iArr[MapboxModuleType.CommonLogger.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MapboxModuleType.CommonLibraryLoader.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
