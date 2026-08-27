package com.mapbox.api.directions.v5.models.utils;

import java.util.List;
import kotlin.collections.AbstractList;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class FlatbuffersListWrapper {
    public static final FlatbuffersListWrapper INSTANCE = new FlatbuffersListWrapper();

    private FlatbuffersListWrapper() {
    }

    public static abstract class FlatbuffersNonCachingListWrapper<T> extends AbstractList {
        private final int size;

        @Override // kotlin.collections.AbstractCollection
        public int getSize() {
            return this.size;
        }

        public FlatbuffersNonCachingListWrapper(int i) {
            this.size = i;
        }
    }

    public final <T> List<T> get(int i, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        if (i <= 0) {
            return null;
        }
        return new FlatbuffersNonCachingListWrapper<T>(i) { // from class: com.mapbox.api.directions.v5.models.utils.FlatbuffersListWrapper.get.1
            @Override // kotlin.collections.AbstractList, java.util.List
            public T get(int i2) {
                return (T) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Integer.valueOf(i2));
            }
        };
    }
}
