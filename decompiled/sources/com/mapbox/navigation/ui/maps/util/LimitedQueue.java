package com.mapbox.navigation.ui.maps.util;

import java.util.Iterator;
import java.util.LinkedList;
import o.EmptyContentCardsAdapterNetworkUnavailableViewHolder;
import o.createBrazeUserChangeEventSubscriberandroid_sdk_ui_release;
import o.displayInAppMessagelambda121;
import o.getCarryoverInAppMessage;
import o.r8lambdazCd1z82txJou5vkO0oL_06hVCA;

/* JADX INFO: loaded from: classes2.dex */
public final class LimitedQueue implements Iterable, displayInAppMessagelambda121 {
    public final /* synthetic */ int $r8$classId;
    public final Object list;

    public LimitedQueue() {
        this.$r8$classId = 0;
        this.list = new LinkedList();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.$r8$classId;
        Object obj = this.list;
        if (i != 0) {
            return i != 1 ? new EmptyContentCardsAdapterNetworkUnavailableViewHolder((r8lambdazCd1z82txJou5vkO0oL_06hVCA) obj) : new getCarryoverInAppMessage((createBrazeUserChangeEventSubscriberandroid_sdk_ui_release) obj);
        }
        Iterator it = ((LinkedList) obj).iterator();
        it.getClass();
        return it;
    }

    public /* synthetic */ LimitedQueue(int i, Object obj) {
        this.$r8$classId = i;
        this.list = obj;
    }
}
