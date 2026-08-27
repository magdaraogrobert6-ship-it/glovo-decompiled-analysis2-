package com.mapbox.common.module.provider;

import o.IconCompatParcelizer;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ModuleProviderArgument {
    private final Object argumentInstance;
    private final Class<?> expectedArgumentClass;

    public final Class<?> component1() {
        return this.expectedArgumentClass;
    }

    public final Object component2() {
        return this.argumentInstance;
    }

    public final Object getArgumentInstance() {
        return this.argumentInstance;
    }

    public final Class<?> getExpectedArgumentClass() {
        return this.expectedArgumentClass;
    }

    public int hashCode() {
        int iHashCode = this.expectedArgumentClass.hashCode();
        Object obj = this.argumentInstance;
        return (iHashCode * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public ModuleProviderArgument(Class<?> cls, Object obj) {
        cls.getClass();
        this.expectedArgumentClass = cls;
        this.argumentInstance = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModuleProviderArgument copy$default(ModuleProviderArgument moduleProviderArgument, Class cls, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            cls = moduleProviderArgument.expectedArgumentClass;
        }
        if ((i & 2) != 0) {
            obj = moduleProviderArgument.argumentInstance;
        }
        return moduleProviderArgument.copy(cls, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModuleProviderArgument)) {
            return false;
        }
        ModuleProviderArgument moduleProviderArgument = (ModuleProviderArgument) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.expectedArgumentClass, moduleProviderArgument.expectedArgumentClass}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.argumentInstance, moduleProviderArgument.argumentInstance}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ModuleProviderArgument(expectedArgumentClass=");
        sb.append(this.expectedArgumentClass);
        sb.append(", argumentInstance=");
        return IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.argumentInstance, ')');
    }

    public final ModuleProviderArgument copy(Class<?> cls, Object obj) {
        cls.getClass();
        return new ModuleProviderArgument(cls, obj);
    }
}
