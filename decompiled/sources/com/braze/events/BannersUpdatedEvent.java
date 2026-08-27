package com.braze.events;

import bo.app.d$$ExternalSyntheticOutline0;
import com.braze.models.Banner;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class BannersUpdatedEvent {
    public static final Companion Companion = new Companion(null);
    private final List<Banner> banners;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getEmptyUpdate$annotations() {
        }

        public final BannersUpdatedEvent getEmptyUpdate() {
            return new BannersUpdatedEvent(instance_delegatelambda0.write);
        }

        private Companion() {
        }
    }

    public final List<Banner> getBanners() {
        return this.banners;
    }

    public static final BannersUpdatedEvent getEmptyUpdate() {
        return Companion.getEmptyUpdate();
    }

    public final boolean isEmpty() {
        return this.banners.isEmpty();
    }

    public String toString() {
        return d$$ExternalSyntheticOutline0.m(this.banners.size(), "BannersUpdatedEvent{banner count=", "}");
    }

    public BannersUpdatedEvent(List<Banner> list) {
        list.getClass();
        this.banners = list;
    }

    public final Banner getBanner(String str) {
        Object next;
        str.getClass();
        Iterator<T> it = this.banners.iterator();
        while (it.hasNext()) {
            next = it.next();
            Object[] objArr = {((Banner) next).getPlacementId(), str};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return (Banner) next;
            }
        }
        next = null;
        return (Banner) next;
    }
}
